// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.ProviderServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Return details on all available payroll and HR systems. */
class ProviderListPageAsync
private constructor(
    private val providersService: ProviderServiceAsync,
    private val params: ProviderListParams,
    private val items: List<Provider>,
) {

    /** Returns the response that this page was parsed from. */
    fun items(): List<Provider> = items

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderListPageAsync && providersService == other.providersService && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(providersService, params, items) /* spotless:on */

    override fun toString() =
        "ProviderListPageAsync{providersService=$providersService, params=$params, items=$items}"

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): ProviderListParams? = null

    suspend fun getNextPage(): ProviderListPageAsync? {
        return getNextPageParams()?.let { providersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            providersService: ProviderServiceAsync,
            params: ProviderListParams,
            items: List<Provider>,
        ) = ProviderListPageAsync(providersService, params, items)
    }

    class AutoPager(private val firstPage: ProviderListPageAsync) : Flow<Provider> {

        override suspend fun collect(collector: FlowCollector<Provider>) {
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
