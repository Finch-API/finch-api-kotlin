// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.blocking.hris.DirectoryService
import java.util.Objects

/** Read company directory and organization structure */
@Deprecated("use `list` instead")
class HrisDirectoryListIndividualsPage
private constructor(
    private val directoryService: DirectoryService,
    private val params: HrisDirectoryListIndividualsParams,
    private val response: HrisDirectoryListIndividualsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisDirectoryListIndividualsPageResponse = response

    /**
     * Delegates to [HrisDirectoryListIndividualsPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListIndividualsPageResponse.individuals]
     */
    fun individuals(): List<IndividualInDirectory> =
        response._individuals().getNullable("individuals") ?: emptyList()

    /**
     * Delegates to [HrisDirectoryListIndividualsPageResponse], but gracefully handles missing data.
     *
     * @see [HrisDirectoryListIndividualsPageResponse.paging]
     */
    fun paging(): Paging? = response._paging().getNullable("paging")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListIndividualsPage && directoryService == other.directoryService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(directoryService, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListIndividualsPage{directoryService=$directoryService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (individuals().isEmpty()) {
            return false
        }

        val offset = paging()?.let { it._offset().getNullable("offset") } ?: 0
        val totalCount = paging()?.let { it._count().getNullable("count") } ?: Long.MAX_VALUE
        return offset + individuals().size < totalCount
    }

    fun getNextPageParams(): HrisDirectoryListIndividualsParams? {
        if (!hasNextPage()) {
            return null
        }

        val offset = paging()?.let { it._offset().getNullable("offset") } ?: 0
        return params.toBuilder().offset(offset + individuals().size).build()
    }

    fun getNextPage(): HrisDirectoryListIndividualsPage? {
        return getNextPageParams()?.let { directoryService.listIndividuals(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            directoryService: DirectoryService,
            params: HrisDirectoryListIndividualsParams,
            response: HrisDirectoryListIndividualsPageResponse,
        ) = HrisDirectoryListIndividualsPage(directoryService, params, response)
    }

    class AutoPager(private val firstPage: HrisDirectoryListIndividualsPage) :
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
