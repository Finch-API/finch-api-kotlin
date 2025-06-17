// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects

/** @see [BenefitServiceAsync.list] */
class HrisBenefitListPageAsync
private constructor(
    private val service: BenefitServiceAsync,
    private val params: HrisBenefitListParams,
    private val items: List<CompanyBenefit>,
) : PageAsync<CompanyBenefit> {

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisBenefitListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): HrisBenefitListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CompanyBenefit> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<CompanyBenefit> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HrisBenefitListPageAsync].
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

    /** A builder for [HrisBenefitListPageAsync]. */
    class Builder internal constructor() {

        private var service: BenefitServiceAsync? = null
        private var params: HrisBenefitListParams? = null
        private var items: List<CompanyBenefit>? = null

        internal fun from(hrisBenefitListPageAsync: HrisBenefitListPageAsync) = apply {
            service = hrisBenefitListPageAsync.service
            params = hrisBenefitListPageAsync.params
            items = hrisBenefitListPageAsync.items
        }

        fun service(service: BenefitServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisBenefitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<CompanyBenefit>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HrisBenefitListPageAsync].
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
        fun build(): HrisBenefitListPageAsync =
            HrisBenefitListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListPageAsync && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListPageAsync{service=$service, params=$params, items=$items}"
}
