// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.BenefitService
import java.util.Objects

/** List all company-wide deductions and contributions. */
class HrisBenefitListPage
private constructor(
    private val benefitsService: BenefitService,
    private val params: HrisBenefitListParams,
    private val items: List<CompanyBenefit>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<CompanyBenefit> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListPage && benefitsService == other.benefitsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(benefitsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListPage{benefitsService=$benefitsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitListParams? = null

    fun getNextPage(): HrisBenefitListPage? {
        return getNextPageParams()?.let { benefitsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            benefitsService: BenefitService,
            params: HrisBenefitListParams,
            items: List<CompanyBenefit>,
        ) = HrisBenefitListPage(benefitsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitListPage) : Sequence<CompanyBenefit> {

        override fun iterator(): Iterator<CompanyBenefit> = iterator {
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
