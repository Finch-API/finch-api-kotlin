// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.EmploymentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Read individual employment and income data */
class HrisEmploymentRetrieveManyPageAsync
private constructor(
    private val employmentsService: EmploymentServiceAsync,
    private val params: HrisEmploymentRetrieveManyParams,
    private val response: HrisEmploymentRetrieveManyPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisEmploymentRetrieveManyPageResponse = response

    /**
     * Delegates to [HrisEmploymentRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisEmploymentRetrieveManyPageResponse.responses]
     */
    fun responses(): List<EmploymentDataResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisEmploymentRetrieveManyPageAsync && employmentsService == other.employmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(employmentsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisEmploymentRetrieveManyPageAsync{employmentsService=$employmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisEmploymentRetrieveManyParams? = null

    suspend fun getNextPage(): HrisEmploymentRetrieveManyPageAsync? {
        return getNextPageParams()?.let { employmentsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            employmentsService: EmploymentServiceAsync,
            params: HrisEmploymentRetrieveManyParams,
            response: HrisEmploymentRetrieveManyPageResponse,
        ) = HrisEmploymentRetrieveManyPageAsync(employmentsService, params, response)
    }

    class AutoPager(private val firstPage: HrisEmploymentRetrieveManyPageAsync) :
        Flow<EmploymentDataResponse> {

        override suspend fun collect(collector: FlowCollector<EmploymentDataResponse>) {
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
