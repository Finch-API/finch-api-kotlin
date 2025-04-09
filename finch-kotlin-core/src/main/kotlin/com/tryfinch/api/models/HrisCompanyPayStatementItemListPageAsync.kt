// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.company.PayStatementItemServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
 * support will be added soon Retrieve a list of detailed pay statement items for the access token's
 * connection account.
 */
class HrisCompanyPayStatementItemListPageAsync
private constructor(
    private val payStatementItemService: PayStatementItemServiceAsync,
    private val params: HrisCompanyPayStatementItemListParams,
    private val response: HrisCompanyPayStatementItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisCompanyPayStatementItemListPageResponse = response

    /**
     * Delegates to [HrisCompanyPayStatementItemListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [HrisCompanyPayStatementItemListPageResponse.responses]
     */
    fun responses(): List<PayStatementItemListResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisCompanyPayStatementItemListPageAsync && payStatementItemService == other.payStatementItemService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payStatementItemService, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemListPageAsync{payStatementItemService=$payStatementItemService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisCompanyPayStatementItemListParams? = null

    suspend fun getNextPage(): HrisCompanyPayStatementItemListPageAsync? {
        return getNextPageParams()?.let { payStatementItemService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            payStatementItemService: PayStatementItemServiceAsync,
            params: HrisCompanyPayStatementItemListParams,
            response: HrisCompanyPayStatementItemListPageResponse,
        ) = HrisCompanyPayStatementItemListPageAsync(payStatementItemService, params, response)
    }

    class AutoPager(private val firstPage: HrisCompanyPayStatementItemListPageAsync) :
        Flow<PayStatementItemListResponse> {

        override suspend fun collect(collector: FlowCollector<PayStatementItemListResponse>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    collector.emit(page.responses()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
