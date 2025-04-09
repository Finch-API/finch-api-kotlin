// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Read company directory and organization structure */
class HrisDirectoryListPageAsync
private constructor(
    private val directoryService: DirectoryServiceAsync,
    private val params: HrisDirectoryListParams,
    private val response: HrisDirectoryListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisDirectoryListPageResponse = response

    /**
     * Delegates to [HrisDirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListPageResponse.individuals]
     */
    fun individuals(): List<IndividualInDirectory> =
        response._individuals().getNullable("individuals") ?: emptyList()

    /**
     * Delegates to [HrisDirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListPageResponse.paging]
     */
    fun paging(): Paging? = response._paging().getNullable("paging")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListPageAsync && directoryService == other.directoryService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(directoryService, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListPageAsync{directoryService=$directoryService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (individuals().isEmpty()) {
            return false
        }

        val offset = paging()?.let { it._offset().getNullable("offset") } ?: 0
        val totalCount = paging()?.let { it._count().getNullable("count") } ?: Long.MAX_VALUE
        return offset + individuals().size < totalCount
    }

    fun getNextPageParams(): HrisDirectoryListParams? {
        if (!hasNextPage()) {
            return null
        }

        val offset = paging()?.let { it._offset().getNullable("offset") } ?: 0
        return params.toBuilder().offset(offset + individuals().size).build()
    }

    suspend fun getNextPage(): HrisDirectoryListPageAsync? {
        return getNextPageParams()?.let { directoryService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            directoryService: DirectoryServiceAsync,
            params: HrisDirectoryListParams,
            response: HrisDirectoryListPageResponse,
        ) = HrisDirectoryListPageAsync(directoryService, params, response)
    }

    class AutoPager(private val firstPage: HrisDirectoryListPageAsync) :
        Flow<IndividualInDirectory> {

        override suspend fun collect(collector: FlowCollector<IndividualInDirectory>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.individuals().size) {
                    collector.emit(page.individuals()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
