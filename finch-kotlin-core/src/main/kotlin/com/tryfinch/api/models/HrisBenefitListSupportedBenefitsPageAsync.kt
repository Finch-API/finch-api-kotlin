// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects

/** @see [BenefitServiceAsync.listSupportedBenefits] */
class HrisBenefitListSupportedBenefitsPageAsync
private constructor(
    private val service: BenefitServiceAsync,
    private val params: HrisBenefitListSupportedBenefitsParams,
    private val items: List<SupportedBenefit>,
) : PageAsync<SupportedBenefit> {

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisBenefitListSupportedBenefitsParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): HrisBenefitListSupportedBenefitsPageAsync =
        service.listSupportedBenefits(nextPageParams())

    fun autoPager(): AutoPagerAsync<SupportedBenefit> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitListSupportedBenefitsParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<SupportedBenefit> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisBenefitListSupportedBenefitsPageAsync].
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

    /** A builder for [HrisBenefitListSupportedBenefitsPageAsync]. */
    class Builder internal constructor() {

        private var service: BenefitServiceAsync? = null
        private var params: HrisBenefitListSupportedBenefitsParams? = null
        private var items: List<SupportedBenefit>? = null

        internal fun from(
            hrisBenefitListSupportedBenefitsPageAsync: HrisBenefitListSupportedBenefitsPageAsync
        ) = apply {
            service = hrisBenefitListSupportedBenefitsPageAsync.service
            params = hrisBenefitListSupportedBenefitsPageAsync.params
            items = hrisBenefitListSupportedBenefitsPageAsync.items
        }

        fun service(service: BenefitServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisBenefitListSupportedBenefitsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<SupportedBenefit>?) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HrisBenefitListSupportedBenefitsPageAsync].
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
        fun build(): HrisBenefitListSupportedBenefitsPageAsync =
            HrisBenefitListSupportedBenefitsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items) ?: emptyList(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisBenefitListSupportedBenefitsPageAsync && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "HrisBenefitListSupportedBenefitsPageAsync{service=$service, params=$params, items=$items}"
}
