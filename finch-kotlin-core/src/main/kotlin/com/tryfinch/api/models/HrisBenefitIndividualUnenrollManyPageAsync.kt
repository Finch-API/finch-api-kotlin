// File generated from our OpenAPI spec by Stainless.

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
import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class HrisBenefitIndividualUnenrollManyPageAsync
private constructor(
    private val individualsService: IndividualServiceAsync,
    private val params: HrisBenefitIndividualUnenrollManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<UnenrolledIndividual> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisBenefitIndividualUnenrollManyPageAsync &&
            this.individualsService == other.individualsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            individualsService,
            params,
            response,
        )
    }

    override fun toString() =
        "HrisBenefitIndividualUnenrollManyPageAsync{individualsService=$individualsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return items().isEmpty()
    }

    fun getNextPageParams(): HrisBenefitIndividualUnenrollManyParams? {
        return null
    }

    suspend fun getNextPage(): HrisBenefitIndividualUnenrollManyPageAsync? {
        return getNextPageParams()?.let { individualsService.unenrollMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            individualsService: IndividualServiceAsync,
            params: HrisBenefitIndividualUnenrollManyParams,
            response: Response
        ) =
            HrisBenefitIndividualUnenrollManyPageAsync(
                individualsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val items: JsonField<List<UnenrolledIndividual>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun items(): List<UnenrolledIndividual> = items.getNullable("items") ?: listOf()

        @JsonProperty("items") fun _items(): JsonField<List<UnenrolledIndividual>>? = items

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                items().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.items == other.items &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(items, additionalProperties)
        }

        override fun toString() =
            "HrisBenefitIndividualUnenrollManyPageAsync.Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<UnenrolledIndividual>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<UnenrolledIndividual>) = items(JsonField.of(items))

            @JsonProperty("items")
            fun items(items: JsonField<List<UnenrolledIndividual>>) = apply { this.items = items }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HrisBenefitIndividualUnenrollManyPageAsync,
    ) : Flow<UnenrolledIndividual> {

        override suspend fun collect(collector: FlowCollector<UnenrolledIndividual>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
