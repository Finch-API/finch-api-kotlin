// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.PaymentService
import java.util.Objects

/** Read payroll and contractor related payments by the company. */
class HrisPaymentListPage
private constructor(
    private val paymentsService: PaymentService,
    private val params: HrisPaymentListParams,
    private val items: List<Payment>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Payment> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisPaymentListPage && paymentsService == other.paymentsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisPaymentListPage{paymentsService=$paymentsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisPaymentListParams? = null

    fun getNextPage(): HrisPaymentListPage? {
        return getNextPageParams()?.let { paymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            paymentsService: PaymentService,
            params: HrisPaymentListParams,
            items: List<Payment>,
        ) = HrisPaymentListPage(paymentsService, params, items)
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
}
