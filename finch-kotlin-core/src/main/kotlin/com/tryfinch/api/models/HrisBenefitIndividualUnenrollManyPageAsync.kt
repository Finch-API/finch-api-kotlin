// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Unenroll individuals from a deduction or contribution */
class HrisBenefitIndividualUnenrollManyPageAsync
private constructor(
    private val individualsService: IndividualServiceAsync,
    private val params: HrisBenefitIndividualUnenrollManyParams,
    private val items: List<IndividualUnenrollManyResponse>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<IndividualUnenrollManyResponse> = items

    /** Delegates to [List<IndividualUnenrollManyResponse>], but gracefully handles missing data. */
    fun items(): List<IndividualUnenrollManyResponse> =
        items.flatMap { listOfNotNull(it) } ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualUnenrollManyPageAsync && individualsService == other.individualsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualUnenrollManyPageAsync{individualsService=$individualsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitIndividualUnenrollManyParams? = null

    suspend fun getNextPage(): HrisBenefitIndividualUnenrollManyPageAsync? {
        return getNextPageParams()?.let { individualsService.unenrollMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            individualsService: IndividualServiceAsync,
            params: HrisBenefitIndividualUnenrollManyParams,
            items: List<IndividualUnenrollManyResponse>,
        ) = HrisBenefitIndividualUnenrollManyPageAsync(individualsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitIndividualUnenrollManyPageAsync) :
        Flow<IndividualUnenrollManyResponse> {

        override suspend fun collect(collector: FlowCollector<IndividualUnenrollManyResponse>) {
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
