// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.DirectoryService
import java.util.Objects

/** @see [DirectoryService.listIndividuals] */
@Deprecated("use `list` instead")
class HrisDirectoryListIndividualsPage
private constructor(
    private val service: DirectoryService,
    private val params: HrisDirectoryListIndividualsParams,
    private val response: HrisDirectoryListIndividualsPageResponse,
) {

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

    fun getNextPage(): HrisDirectoryListIndividualsPage? =
        getNextPageParams()?.let { service.listIndividuals(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisDirectoryListIndividualsParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisDirectoryListIndividualsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisDirectoryListIndividualsPage].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [HrisDirectoryListIndividualsPage]. */
    class Builder internal constructor() {

        private var service: DirectoryService? = null
        private var params: HrisDirectoryListIndividualsParams? = null
        private var response: HrisDirectoryListIndividualsPageResponse? = null

        internal fun from(hrisDirectoryListIndividualsPage: HrisDirectoryListIndividualsPage) =
            apply {
                service = hrisDirectoryListIndividualsPage.service
                params = hrisDirectoryListIndividualsPage.params
                response = hrisDirectoryListIndividualsPage.response
            }

        fun service(service: DirectoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisDirectoryListIndividualsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisDirectoryListIndividualsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisDirectoryListIndividualsPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisDirectoryListIndividualsPage =
            HrisDirectoryListIndividualsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisDirectoryListIndividualsPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisDirectoryListIndividualsPage{service=$service, params=$params, response=$response}"
}
