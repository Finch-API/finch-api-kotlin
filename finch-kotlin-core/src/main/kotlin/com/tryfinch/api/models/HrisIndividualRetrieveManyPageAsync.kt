// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.IndividualServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Read individual data, excluding income and employment data */
class HrisIndividualRetrieveManyPageAsync
private constructor(
    private val individualsService: IndividualServiceAsync,
    private val params: HrisIndividualRetrieveManyParams,
    private val response: HrisIndividualRetrieveManyPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisIndividualRetrieveManyPageResponse = response

    /**
     * Delegates to [HrisIndividualRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisIndividualRetrieveManyPageResponse.responses]
     */
    fun responses(): List<IndividualResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisIndividualRetrieveManyPageAsync && individualsService == other.individualsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisIndividualRetrieveManyPageAsync{individualsService=$individualsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisIndividualRetrieveManyParams? = null

    suspend fun getNextPage(): HrisIndividualRetrieveManyPageAsync? {
        return getNextPageParams()?.let { individualsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            individualsService: IndividualServiceAsync,
            params: HrisIndividualRetrieveManyParams,
            response: HrisIndividualRetrieveManyPageResponse,
        ) = HrisIndividualRetrieveManyPageAsync(individualsService, params, response)
    }

    class AutoPager(private val firstPage: HrisIndividualRetrieveManyPageAsync) :
        Flow<IndividualResponse> {

        override suspend fun collect(collector: FlowCollector<IndividualResponse>) {
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
