// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.BenefitService
import java.util.Objects

/** @see [BenefitService.list] */
class HrisBenefitListPage
private constructor(
    private val service: BenefitService,
    private val params: HrisBenefitListParams,
    private val items: List<CompanyBenefit>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitListParams? = null

    fun getNextPage(): HrisBenefitListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<CompanyBenefit> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HrisBenefitListPage].
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

    /** A builder for [HrisBenefitListPage]. */
    class Builder internal constructor() {

        private var service: BenefitService? = null
        private var params: HrisBenefitListParams? = null
        private var items: List<CompanyBenefit>? = null

        internal fun from(hrisBenefitListPage: HrisBenefitListPage) = apply {
            service = hrisBenefitListPage.service
            params = hrisBenefitListPage.params
            items = hrisBenefitListPage.items
        }

        fun service(service: BenefitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisBenefitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CompanyBenefit>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HrisBenefitListPage].
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
        fun build(): HrisBenefitListPage =
            HrisBenefitListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "HrisBenefitListPage{service=$service, params=$params, items=$items}"
}
