// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.payroll.PayGroupServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Read company pay groups and frequencies */
class PayrollPayGroupListPageAsync
private constructor(
    private val payGroupsService: PayGroupServiceAsync,
    private val params: PayrollPayGroupListParams,
    private val items: List<PayGroupListResponse>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<PayGroupListResponse> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayrollPayGroupListPageAsync && payGroupsService == other.payGroupsService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payGroupsService, params, items) /* spotless:on */

    override fun toString() =
        "PayrollPayGroupListPageAsync{payGroupsService=$payGroupsService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): PayrollPayGroupListParams? = null

    suspend fun getNextPage(): PayrollPayGroupListPageAsync? {
        return getNextPageParams()?.let { payGroupsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            payGroupsService: PayGroupServiceAsync,
            params: PayrollPayGroupListParams,
            items: List<PayGroupListResponse>,
        ) = PayrollPayGroupListPageAsync(payGroupsService, params, items)
    }

    class AutoPager(private val firstPage: PayrollPayGroupListPageAsync) :
        Flow<PayGroupListResponse> {

        override suspend fun collect(collector: FlowCollector<PayGroupListResponse>) {
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
