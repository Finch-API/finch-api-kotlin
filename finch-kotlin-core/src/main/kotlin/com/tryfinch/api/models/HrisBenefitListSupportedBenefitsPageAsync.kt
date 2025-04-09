// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Get deductions metadata */
class HrisBenefitListSupportedBenefitsPageAsync
private constructor(
    private val benefitsService: BenefitServiceAsync,
    private val params: HrisBenefitListSupportedBenefitsParams,
    private val items: List<BenefitListSupportedBenefitsResponse>?,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<BenefitListSupportedBenefitsResponse>? = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListSupportedBenefitsPageAsync && benefitsService == other.benefitsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(benefitsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListSupportedBenefitsPageAsync{benefitsService=$benefitsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitListSupportedBenefitsParams? = null

    suspend fun getNextPage(): HrisBenefitListSupportedBenefitsPageAsync? {
        return getNextPageParams()?.let { benefitsService.listSupportedBenefits(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            benefitsService: BenefitServiceAsync,
            params: HrisBenefitListSupportedBenefitsParams,
            items: List<BenefitListSupportedBenefitsResponse>?,
        ) = HrisBenefitListSupportedBenefitsPageAsync(benefitsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitListSupportedBenefitsPageAsync) :
        Flow<BenefitListSupportedBenefitsResponse> {

        override suspend fun collect(
            collector: FlowCollector<BenefitListSupportedBenefitsResponse>
        ) {
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
