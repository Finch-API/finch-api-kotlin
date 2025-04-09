// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.DirectoryService
import java.util.Objects

/** Read company directory and organization structure */
class HrisDirectoryListPage
private constructor(
    private val directoryService: DirectoryService,
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

        return /* spotless:off */ other is HrisDirectoryListPage && directoryService == other.directoryService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(directoryService, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListPage{directoryService=$directoryService, params=$params, response=$response}"

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

    fun getNextPage(): HrisDirectoryListPage? {
        return getNextPageParams()?.let { directoryService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            directoryService: DirectoryService,
            params: HrisDirectoryListParams,
            response: HrisDirectoryListPageResponse,
        ) = HrisDirectoryListPage(directoryService, params, response)
    }

    class AutoPager(private val firstPage: HrisDirectoryListPage) :
        Sequence<IndividualInDirectory> {

        override fun iterator(): Iterator<IndividualInDirectory> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.individuals().size) {
                    yield(page.individuals()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
