// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.BenefitService
import java.util.Objects

/** Get deductions metadata */
class HrisBenefitListSupportedBenefitsPage
private constructor(
    private val benefitsService: BenefitService,
    private val params: HrisBenefitListSupportedBenefitsParams,
    private val items: List<BenefitListSupportedBenefitsResponse>?,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BenefitListSupportedBenefitsResponse>? = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListSupportedBenefitsPage && benefitsService == other.benefitsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(benefitsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListSupportedBenefitsPage{benefitsService=$benefitsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitListSupportedBenefitsParams? = null

    fun getNextPage(): HrisBenefitListSupportedBenefitsPage? {
        return getNextPageParams()?.let { benefitsService.listSupportedBenefits(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            benefitsService: BenefitService,
            params: HrisBenefitListSupportedBenefitsParams,
            items: List<BenefitListSupportedBenefitsResponse>?,
        ) = HrisBenefitListSupportedBenefitsPage(benefitsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitListSupportedBenefitsPage) :
        Sequence<BenefitListSupportedBenefitsResponse> {

        override fun iterator(): Iterator<BenefitListSupportedBenefitsResponse> = iterator {
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
