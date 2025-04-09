// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List all company-wide deductions and contributions. */
class HrisBenefitListPageAsync
private constructor(
    private val benefitsService: BenefitServiceAsync,
    private val params: HrisBenefitListParams,
    private val items: List<CompanyBenefit>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<CompanyBenefit> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListPageAsync && benefitsService == other.benefitsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(benefitsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListPageAsync{benefitsService=$benefitsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitListParams? = null

    suspend fun getNextPage(): HrisBenefitListPageAsync? {
        return getNextPageParams()?.let { benefitsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            benefitsService: BenefitServiceAsync,
            params: HrisBenefitListParams,
            items: List<CompanyBenefit>,
        ) = HrisBenefitListPageAsync(benefitsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitListPageAsync) : Flow<CompanyBenefit> {

        override suspend fun collect(collector: FlowCollector<CompanyBenefit>) {
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
