// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.benefits.IndividualService
import java.util.Objects

/** Unenroll individuals from a deduction or contribution */
class HrisBenefitIndividualUnenrollManyPage
private constructor(
    private val individualsService: IndividualService,
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

        return /* spotless:off */ other is HrisBenefitIndividualUnenrollManyPage && individualsService == other.individualsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualUnenrollManyPage{individualsService=$individualsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitIndividualUnenrollManyParams? = null

    fun getNextPage(): HrisBenefitIndividualUnenrollManyPage? {
        return getNextPageParams()?.let { individualsService.unenrollMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            individualsService: IndividualService,
            params: HrisBenefitIndividualUnenrollManyParams,
            items: List<IndividualUnenrollManyResponse>,
        ) = HrisBenefitIndividualUnenrollManyPage(individualsService, params, items)
    }

    class AutoPager(private val firstPage: HrisBenefitIndividualUnenrollManyPage) :
        Sequence<IndividualUnenrollManyResponse> {

        override fun iterator(): Iterator<IndividualUnenrollManyResponse> = iterator {
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
