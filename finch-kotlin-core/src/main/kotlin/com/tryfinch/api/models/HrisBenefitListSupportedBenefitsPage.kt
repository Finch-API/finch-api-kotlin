// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.BenefitService
import java.util.Objects

/** @see [BenefitService.listSupportedBenefits] */
class HrisBenefitListSupportedBenefitsPage
private constructor(
    private val service: BenefitService,
    private val params: HrisBenefitListSupportedBenefitsParams,
    private val items: List<BenefitListSupportedBenefitsResponse>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitListSupportedBenefitsParams? = null

    fun getNextPage(): HrisBenefitListSupportedBenefitsPage? =
        getNextPageParams()?.let { service.listSupportedBenefits(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitListSupportedBenefitsParams = params

    /** The response that this page was parsed from. */
    fun items(): List<BenefitListSupportedBenefitsResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisBenefitListSupportedBenefitsPage].
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

    /** A builder for [HrisBenefitListSupportedBenefitsPage]. */
    class Builder internal constructor() {

        private var service: BenefitService? = null
        private var params: HrisBenefitListSupportedBenefitsParams? = null
        private var items: List<BenefitListSupportedBenefitsResponse>? = null

        internal fun from(
            hrisBenefitListSupportedBenefitsPage: HrisBenefitListSupportedBenefitsPage
        ) = apply {
            service = hrisBenefitListSupportedBenefitsPage.service
            params = hrisBenefitListSupportedBenefitsPage.params
            items = hrisBenefitListSupportedBenefitsPage.items
        }

        fun service(service: BenefitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisBenefitListSupportedBenefitsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<BenefitListSupportedBenefitsResponse>?) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HrisBenefitListSupportedBenefitsPage].
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
        fun build(): HrisBenefitListSupportedBenefitsPage =
            HrisBenefitListSupportedBenefitsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items) ?: emptyList(),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListSupportedBenefitsPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListSupportedBenefitsPage{service=$service, params=$params, items=$items}"
}
