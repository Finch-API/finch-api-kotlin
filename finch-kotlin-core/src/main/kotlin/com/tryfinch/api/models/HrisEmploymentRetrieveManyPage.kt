// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.EmploymentService
import java.util.Objects

/** Read individual employment and income data */
class HrisEmploymentRetrieveManyPage
private constructor(
    private val employmentsService: EmploymentService,
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

        return /* spotless:off */ other is HrisEmploymentRetrieveManyPage && employmentsService == other.employmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(employmentsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisEmploymentRetrieveManyPage{employmentsService=$employmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisEmploymentRetrieveManyParams? = null

    fun getNextPage(): HrisEmploymentRetrieveManyPage? {
        return getNextPageParams()?.let { employmentsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            employmentsService: EmploymentService,
            params: HrisEmploymentRetrieveManyParams,
            response: HrisEmploymentRetrieveManyPageResponse,
        ) = HrisEmploymentRetrieveManyPage(employmentsService, params, response)
    }

    class AutoPager(private val firstPage: HrisEmploymentRetrieveManyPage) :
        Sequence<EmploymentDataResponse> {

        override fun iterator(): Iterator<EmploymentDataResponse> = iterator {
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
