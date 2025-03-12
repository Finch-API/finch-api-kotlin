// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get enrollment information for the given individuals. */
class HrisBenefitIndividualRetrieveManyBenefitsPageAsync
private constructor(
    private val individualsService: IndividualServiceAsync,
    private val params: HrisBenefitIndividualRetrieveManyBenefitsParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<IndividualBenefit> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualRetrieveManyBenefitsPageAsync && individualsService == other.individualsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualRetrieveManyBenefitsPageAsync{individualsService=$individualsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): HrisBenefitIndividualRetrieveManyBenefitsParams? {
        return null
    }

    suspend fun getNextPage(): HrisBenefitIndividualRetrieveManyBenefitsPageAsync? {
        return getNextPageParams()?.let { individualsService.retrieveManyBenefits(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            individualsService: IndividualServiceAsync,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            response: Response,
        ) = HrisBenefitIndividualRetrieveManyBenefitsPageAsync(individualsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items")
        private val items: JsonField<List<IndividualBenefit>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<IndividualBenefit> = items.getNullable("items") ?: listOf()

        @JsonProperty("items") fun _items(): JsonField<List<IndividualBenefit>>? = items

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            items().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && items == other.items && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(items, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [HrisBenefitIndividualRetrieveManyBenefitsPageAsync].
             */
            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<IndividualBenefit>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<IndividualBenefit>) = items(JsonField.of(items))

            fun items(items: JsonField<List<IndividualBenefit>>) = apply { this.items = items }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: HrisBenefitIndividualRetrieveManyBenefitsPageAsync) :
        Flow<IndividualBenefit> {

        override suspend fun collect(collector: FlowCollector<IndividualBenefit>) {
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
