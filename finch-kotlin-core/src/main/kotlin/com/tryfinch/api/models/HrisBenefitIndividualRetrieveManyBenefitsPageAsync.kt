// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get enrollment information for the given individuals. */
class HrisBenefitIndividualRetrieveManyBenefitsPageAsync
private constructor(
    private val individualsService: IndividualServiceAsync,
    private val params: HrisBenefitIndividualRetrieveManyBenefitsParams,
    private val items: List<IndividualBenefit>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<IndividualBenefit> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualRetrieveManyBenefitsPageAsync && individualsService == other.individualsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualRetrieveManyBenefitsPageAsync{individualsService=$individualsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitIndividualRetrieveManyBenefitsParams? = null

    suspend fun getNextPage(): HrisBenefitIndividualRetrieveManyBenefitsPageAsync? {
        return getNextPageParams()?.let { individualsService.retrieveManyBenefits(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            individualsService: IndividualServiceAsync,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            items: List<IndividualBenefit>,
        ) = HrisBenefitIndividualRetrieveManyBenefitsPageAsync(individualsService, params, items)
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
