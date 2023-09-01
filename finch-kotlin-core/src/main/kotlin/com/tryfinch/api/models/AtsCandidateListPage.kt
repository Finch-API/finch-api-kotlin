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
import com.tryfinch.api.services.blocking.ats.CandidateService
import java.util.Objects

class AtsCandidateListPage
private constructor(
    private val candidatesService: CandidateService,
    private val params: AtsCandidateListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun candidates(): List<Candidate> = response().candidates()

    fun paging(): Paging = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtsCandidateListPage &&
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
        "AtsCandidateListPage{candidatesService=$candidatesService, params=$params, response=$response}"

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

    fun getNextPage(): AtsCandidateListPage? {
        return getNextPageParams()?.let { candidatesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            candidatesService: CandidateService,
            params: AtsCandidateListParams,
            response: Response
        ) =
            AtsCandidateListPage(
                candidatesService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val candidates: JsonField<List<Candidate>>,
        private val paging: JsonField<Paging>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun candidates(): List<Candidate> = candidates.getNullable("candidates") ?: listOf()

        fun paging(): Paging = paging.getRequired("paging")

        @JsonProperty("candidates") fun _candidates(): JsonField<List<Candidate>>? = candidates

        @JsonProperty("paging") fun _paging(): JsonField<Paging>? = paging

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                candidates().map { it.validate() }
                paging().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.candidates == other.candidates &&
                this.paging == other.paging &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                candidates,
                paging,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtsCandidateListPage.Response{candidates=$candidates, paging=$paging, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var candidates: JsonField<List<Candidate>> = JsonMissing.of()
            private var paging: JsonField<Paging> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.candidates = page.candidates
                this.paging = page.paging
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun candidates(candidates: List<Candidate>) = candidates(JsonField.of(candidates))

            @JsonProperty("candidates")
            fun candidates(candidates: JsonField<List<Candidate>>) = apply {
                this.candidates = candidates
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    candidates,
                    paging,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtsCandidateListPage,
    ) : Sequence<Candidate> {

        override fun iterator(): Iterator<Candidate> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.candidates().size) {
                    yield(page.candidates()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
