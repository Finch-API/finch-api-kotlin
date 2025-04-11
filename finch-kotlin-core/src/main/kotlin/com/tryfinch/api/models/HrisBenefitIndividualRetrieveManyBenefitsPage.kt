// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.benefits.IndividualService
import java.util.Objects

/** @see [IndividualService.retrieveManyBenefits] */
class HrisBenefitIndividualRetrieveManyBenefitsPage
private constructor(
    private val service: IndividualService,
    private val params: HrisBenefitIndividualRetrieveManyBenefitsParams,
    private val items: List<IndividualBenefit>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitIndividualRetrieveManyBenefitsParams? = null

    fun getNextPage(): HrisBenefitIndividualRetrieveManyBenefitsPage? =
        getNextPageParams()?.let { service.retrieveManyBenefits(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitIndividualRetrieveManyBenefitsParams = params

    /** The response that this page was parsed from. */
    fun items(): List<IndividualBenefit> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisBenefitIndividualRetrieveManyBenefitsPage].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .items()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [HrisBenefitIndividualRetrieveManyBenefitsPage]. */
    class Builder internal constructor() {

        private var service: IndividualService? = null
        private var params: HrisBenefitIndividualRetrieveManyBenefitsParams? = null
        private var items: List<IndividualBenefit>? = null

        internal fun from(
            hrisBenefitIndividualRetrieveManyBenefitsPage:
                HrisBenefitIndividualRetrieveManyBenefitsPage
        ) = apply {
            service = hrisBenefitIndividualRetrieveManyBenefitsPage.service
            params = hrisBenefitIndividualRetrieveManyBenefitsPage.params
            items = hrisBenefitIndividualRetrieveManyBenefitsPage.items
        }

        fun service(service: IndividualService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisBenefitIndividualRetrieveManyBenefitsParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun items(items: List<IndividualBenefit>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HrisBenefitIndividualRetrieveManyBenefitsPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisBenefitIndividualRetrieveManyBenefitsPage =
            HrisBenefitIndividualRetrieveManyBenefitsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitIndividualRetrieveManyBenefitsPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitIndividualRetrieveManyBenefitsPage{service=$service, params=$params, items=$items}"
}
