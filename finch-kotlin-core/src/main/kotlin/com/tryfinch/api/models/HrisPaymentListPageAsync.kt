// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.PaymentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Read payroll and contractor related payments by the company. */
class HrisPaymentListPageAsync
private constructor(
    private val paymentsService: PaymentServiceAsync,
    private val params: HrisPaymentListParams,
    private val items: List<Payment>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Payment> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisPaymentListPageAsync && paymentsService == other.paymentsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentsService, params, items) /* spotless:on */

    override fun toString() =
        "HrisPaymentListPageAsync{paymentsService=$paymentsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): HrisPaymentListParams? = null

    suspend fun getNextPage(): HrisPaymentListPageAsync? {
        return getNextPageParams()?.let { paymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            paymentsService: PaymentServiceAsync,
            params: HrisPaymentListParams,
            items: List<Payment>,
        ) = HrisPaymentListPageAsync(paymentsService, params, items)
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
}
