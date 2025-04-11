// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.PaymentService
import java.util.Objects

/** @see [PaymentService.list] */
class HrisPaymentListPage
private constructor(
    private val service: PaymentService,
    private val params: HrisPaymentListParams,
    private val items: List<Payment>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisPaymentListParams? = null

    fun getNextPage(): HrisPaymentListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisPaymentListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<Payment> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HrisPaymentListPage].
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

    /** A builder for [HrisPaymentListPage]. */
    class Builder internal constructor() {

        private var service: PaymentService? = null
        private var params: HrisPaymentListParams? = null
        private var items: List<Payment>? = null

        internal fun from(hrisPaymentListPage: HrisPaymentListPage) = apply {
            service = hrisPaymentListPage.service
            params = hrisPaymentListPage.params
            items = hrisPaymentListPage.items
        }

        fun service(service: PaymentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisPaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Payment>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [HrisPaymentListPage].
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
        fun build(): HrisPaymentListPage =
            HrisPaymentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: HrisPaymentListPage) : Sequence<Payment> {

        override fun iterator(): Iterator<Payment> = iterator {
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

        return /* spotless:off */ other is HrisPaymentListPage && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() = "HrisPaymentListPage{service=$service, params=$params, items=$items}"
}
