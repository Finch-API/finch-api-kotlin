// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.PayStatementServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * Read detailed pay statements for each individual.
 *
 * Deduction and contribution types are supported by the payroll systems that supports Benefits.
 */
class HrisPayStatementRetrieveManyPageAsync
private constructor(
    private val payStatementsService: PayStatementServiceAsync,
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

        return /* spotless:off */ other is HrisPayStatementRetrieveManyPageAsync && payStatementsService == other.payStatementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(payStatementsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisPayStatementRetrieveManyPageAsync{payStatementsService=$payStatementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisPayStatementRetrieveManyParams? = null

    suspend fun getNextPage(): HrisPayStatementRetrieveManyPageAsync? {
        return getNextPageParams()?.let { payStatementsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            payStatementsService: PayStatementServiceAsync,
            params: HrisPayStatementRetrieveManyParams,
            response: HrisPayStatementRetrieveManyPageResponse,
        ) = HrisPayStatementRetrieveManyPageAsync(payStatementsService, params, response)
    }

    class AutoPager(private val firstPage: HrisPayStatementRetrieveManyPageAsync) :
        Flow<PayStatementResponse> {

        override suspend fun collect(collector: FlowCollector<PayStatementResponse>) {
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
