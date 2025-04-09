// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [BenefitServiceAsync.listSupportedBenefits] */
class HrisBenefitListSupportedBenefitsPageAsync
private constructor(
    private val service: BenefitServiceAsync,
    private val params: HrisBenefitListSupportedBenefitsParams,
    private val items: List<BenefitListSupportedBenefitsResponse>?,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisBenefitListSupportedBenefitsParams? = null

    suspend fun getNextPage(): HrisBenefitListSupportedBenefitsPageAsync? =
        getNextPageParams()?.let { service.listSupportedBenefits(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisBenefitListSupportedBenefitsParams = params

    /** The response that this page was parsed from. */
    fun items(): List<BenefitListSupportedBenefitsResponse>? = items

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
        private var items: List<BenefitListSupportedBenefitsResponse>? = null

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
        fun items(items: List<BenefitListSupportedBenefitsResponse>?) = apply { this.items = items }

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
                checkRequired("items", items),
            )
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
