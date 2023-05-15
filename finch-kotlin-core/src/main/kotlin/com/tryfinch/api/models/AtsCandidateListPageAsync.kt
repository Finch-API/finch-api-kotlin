package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.services.async.ats.CandidateServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class AtsCandidateListPageAsync
private constructor(
    private val candidatesService: CandidateServiceAsync,
    private val params: AtsCandidateListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun paging(): Paging = response().paging()

    fun candidates(): List<Candidate> = response().candidates()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtsCandidateListPageAsync &&
            this.candidatesService == other.candidatesService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            candidatesService,
            params,
            response,
        )
    }

    override fun toString() =
        "AtsCandidateListPageAsync{candidatesService=$candidatesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (candidates().isEmpty()) {
            return false
        }

        return (paging().offset()
            ?: 0) + candidates().count() < (paging().count() ?: Long.MAX_VALUE)
    }

    fun getNextPageParams(): AtsCandidateListParams? {
        if (!hasNextPage()) {
            return null
        }

        return AtsCandidateListParams.builder()
            .from(params)
            .offset((paging().offset() ?: 0) + candidates().count())
            .build()
    }

    suspend fun getNextPage(): AtsCandidateListPageAsync? {
        return getNextPageParams()?.let { candidatesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            candidatesService: CandidateServiceAsync,
            params: AtsCandidateListParams,
            response: Response
        ) =
            AtsCandidateListPageAsync(
                candidatesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val paging: JsonField<Paging>,
        private val candidates: JsonField<List<Candidate>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun paging(): Paging = paging.getRequired("paging")

        fun candidates(): List<Candidate> = candidates.getRequired("candidates")

        @JsonProperty("paging") fun _paging(): JsonField<Paging>? = paging

        @JsonProperty("candidates") fun _candidates(): JsonField<List<Candidate>>? = candidates

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                paging().validate()
                candidates().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.paging == other.paging &&
                this.candidates == other.candidates &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                paging,
                candidates,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtsCandidateListPageAsync.Response{paging=$paging, candidates=$candidates, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var paging: JsonField<Paging> = JsonMissing.of()
            private var candidates: JsonField<List<Candidate>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.paging = page.paging
                this.candidates = page.candidates
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            fun candidates(candidates: List<Candidate>) = candidates(JsonField.of(candidates))

            @JsonProperty("candidates")
            fun candidates(candidates: JsonField<List<Candidate>>) = apply {
                this.candidates = candidates
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    paging,
                    candidates,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtsCandidateListPageAsync,
    ) : Flow<Candidate> {

        override suspend fun collect(collector: FlowCollector<Candidate>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.candidates().size) {
                    collector.emit(page.candidates()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
