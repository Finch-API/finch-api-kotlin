// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.benefits.IndividualService
import java.util.Objects

/** Get enrollment information for the given individuals. */
class HrisBenefitIndividualRetrieveManyBenefitsPage
private constructor(
    private val individualsService: IndividualService,
    private val params: HrisBenefitIndividualRetrieveManyBenefitsParams,
    private val items: List<IndividualBenefit>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<IndividualBenefit> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualRetrieveManyBenefitsPage && individualsService == other.individualsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualRetrieveManyBenefitsPage{individualsService=$individualsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitIndividualRetrieveManyBenefitsParams? = null

    fun getNextPage(): HrisBenefitIndividualRetrieveManyBenefitsPage? {
        return getNextPageParams()?.let { individualsService.retrieveManyBenefits(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            individualsService: IndividualService,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            items: List<IndividualBenefit>,
        ) = HrisBenefitIndividualRetrieveManyBenefitsPage(individualsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitIndividualRetrieveManyBenefitsPage) :
        Sequence<IndividualBenefit> {

        override fun iterator(): Iterator<IndividualBenefit> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
