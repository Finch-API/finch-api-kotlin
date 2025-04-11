// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.PaymentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [PaymentServiceAsync.list] */
class HrisPaymentListPageAsync
private constructor(
    private val service: PaymentServiceAsync,
    private val params: HrisPaymentListParams,
    private val items: List<Payment>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisPaymentListParams? = null

    suspend fun getNextPage(): HrisPaymentListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisPaymentListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<Payment> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HrisPaymentListPageAsync].
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

    /** A builder for [HrisPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaymentServiceAsync? = null
        private var params: HrisPaymentListParams? = null
        private var items: List<Payment>? = null

        internal fun from(hrisPaymentListPageAsync: HrisPaymentListPageAsync) = apply {
            service = hrisPaymentListPageAsync.service
            params = hrisPaymentListPageAsync.params
            items = hrisPaymentListPageAsync.items
        }

        fun service(service: PaymentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisPaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Payment>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HrisPaymentListPageAsync].
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
        fun build(): HrisPaymentListPageAsync =
            HrisPaymentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: HrisPaymentListPageAsync) : Flow<Payment> {

        override suspend fun collect(collector: FlowCollector<Payment>) {
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

        return /* spotless:off */ other is HrisPaymentListPageAsync && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "HrisPaymentListPageAsync{service=$service, params=$params, items=$items}"
}
