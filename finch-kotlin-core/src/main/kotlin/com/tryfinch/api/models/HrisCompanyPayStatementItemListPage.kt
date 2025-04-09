// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.company.PayStatementItemService
import java.util.Objects

/**
 * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
 * support will be added soon Retrieve a list of detailed pay statement items for the access token's
 * connection account.
 */
class HrisCompanyPayStatementItemListPage
private constructor(
    private val payStatementItemService: PayStatementItemService,
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

        return /* spotless:off */ other is HrisCompanyPayStatementItemListPage && payStatementItemService == other.payStatementItemService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payStatementItemService, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemListPage{payStatementItemService=$payStatementItemService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisCompanyPayStatementItemListParams? = null

    fun getNextPage(): HrisCompanyPayStatementItemListPage? {
        return getNextPageParams()?.let { payStatementItemService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            payStatementItemService: PayStatementItemService,
            params: HrisCompanyPayStatementItemListParams,
            response: HrisCompanyPayStatementItemListPageResponse,
        ) = HrisCompanyPayStatementItemListPage(payStatementItemService, params, response)
    }

    class AutoPager(private val firstPage: HrisCompanyPayStatementItemListPage) :
        Sequence<PayStatementItemListResponse> {

        override fun iterator(): Iterator<PayStatementItemListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    yield(page.responses()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
