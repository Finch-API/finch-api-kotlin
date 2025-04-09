// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.PayStatementService
import java.util.Objects

/**
 * Read detailed pay statements for each individual.
 *
 * Deduction and contribution types are supported by the payroll systems that supports Benefits.
 */
class HrisPayStatementRetrieveManyPage
private constructor(
    private val payStatementsService: PayStatementService,
    private val params: HrisPayStatementRetrieveManyParams,
    private val response: HrisPayStatementRetrieveManyPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisPayStatementRetrieveManyPageResponse = response

    /**
     * Delegates to [HrisPayStatementRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisPayStatementRetrieveManyPageResponse.responses]
     */
    fun responses(): List<PayStatementResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisPayStatementRetrieveManyPage && payStatementsService == other.payStatementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payStatementsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisPayStatementRetrieveManyPage{payStatementsService=$payStatementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisPayStatementRetrieveManyParams? = null

    fun getNextPage(): HrisPayStatementRetrieveManyPage? {
        return getNextPageParams()?.let { payStatementsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            payStatementsService: PayStatementService,
            params: HrisPayStatementRetrieveManyParams,
            response: HrisPayStatementRetrieveManyPageResponse,
        ) = HrisPayStatementRetrieveManyPage(payStatementsService, params, response)
    }

    class AutoPager(private val firstPage: HrisPayStatementRetrieveManyPage) :
        Sequence<PayStatementResponse> {

        override fun iterator(): Iterator<PayStatementResponse> = iterator {
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
