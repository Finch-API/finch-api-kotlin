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
import com.tryfinch.api.services.blocking.hris.DirectoryService
import java.util.Objects

class HrisDirectoryListIndividualsPage
private constructor(
    private val directoryService: DirectoryService,
    private val params: HrisDirectoryListIndividualsParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun individuals(): List<IndividualInDirectory> = response().individuals()

    fun paging(): Paging = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisDirectoryListIndividualsPage &&
            this.directoryService == other.directoryService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            directoryService,
            params,
            response,
        )
    }

    override fun toString() =
        "HrisDirectoryListIndividualsPage{directoryService=$directoryService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (individuals().isEmpty()) {
            return false
        }

        return (paging().offset()
            ?: 0) + individuals().count() < (paging().count() ?: Long.MAX_VALUE)
    }

    fun getNextPageParams(): HrisDirectoryListIndividualsParams? {
        if (!hasNextPage()) {
            return null
        }

        return HrisDirectoryListIndividualsParams.builder()
            .from(params)
            .offset((paging().offset() ?: 0) + individuals().count())
            .build()
    }

    fun getNextPage(): HrisDirectoryListIndividualsPage? {
        return getNextPageParams()?.let { directoryService.listIndividuals(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            directoryService: DirectoryService,
            params: HrisDirectoryListIndividualsParams,
            response: Response
        ) =
            HrisDirectoryListIndividualsPage(
                directoryService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val individuals: JsonField<List<IndividualInDirectory>>,
        private val paging: JsonField<Paging>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun individuals(): List<IndividualInDirectory> =
            individuals.getNullable("individuals") ?: listOf()

        fun paging(): Paging = paging.getRequired("paging")

        @JsonProperty("individuals")
        fun _individuals(): JsonField<List<IndividualInDirectory>>? = individuals

        @JsonProperty("paging") fun _paging(): JsonField<Paging>? = paging

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                individuals().map { it.validate() }
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
                this.individuals == other.individuals &&
                this.paging == other.paging &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                individuals,
                paging,
                additionalProperties,
            )
        }

        override fun toString() =
            "HrisDirectoryListIndividualsPage.Response{individuals=$individuals, paging=$paging, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var individuals: JsonField<List<IndividualInDirectory>> = JsonMissing.of()
            private var paging: JsonField<Paging> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.individuals = page.individuals
                this.paging = page.paging
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun individuals(individuals: List<IndividualInDirectory>) =
                individuals(JsonField.of(individuals))

            @JsonProperty("individuals")
            fun individuals(individuals: JsonField<List<IndividualInDirectory>>) = apply {
                this.individuals = individuals
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
                    individuals,
                    paging,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HrisDirectoryListIndividualsPage,
    ) : Sequence<IndividualInDirectory> {

        override fun iterator(): Iterator<IndividualInDirectory> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.individuals().size) {
                    yield(page.individuals()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
