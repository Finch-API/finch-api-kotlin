// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import java.util.Objects

/** @see DirectoryServiceAsync.listIndividuals */
@Deprecated("use `list` instead")
class HrisDirectoryListIndividualsPageAsync
private constructor(
    private val service: DirectoryServiceAsync,
    private val params: HrisDirectoryListIndividualsParams,
    private val response: HrisDirectoryListIndividualsPageResponse,
) : PageAsync<IndividualInDirectory> {

    /**
     * Delegates to [HrisDirectoryListIndividualsPageResponse], but gracefully handles missing data.
     *
     * @see HrisDirectoryListIndividualsPageResponse.individuals
     */
    fun individuals(): List<IndividualInDirectory> =
        response._individuals().getNullable("individuals") ?: emptyList()

    /**
     * Delegates to [HrisDirectoryListIndividualsPageResponse], but gracefully handles missing data.
     *
     * @see HrisDirectoryListIndividualsPageResponse.paging
     */
    fun paging(): Paging? = response._paging().getNullable("paging")

    override fun items(): List<IndividualInDirectory> = individuals()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = paging()?.let { it._offset().getNullable("offset") } ?: 0
        val totalCount = paging()?.let { it._count().getNullable("count") } ?: Long.MAX_VALUE
        return offset + items().size < totalCount
    }

    fun nextPageParams(): HrisDirectoryListIndividualsParams {
        val offset = paging()?.let { it._offset().getNullable("offset") } ?: 0
        return params.toBuilder().offset(offset + items().size).build()
    }

    override suspend fun nextPage(): HrisDirectoryListIndividualsPageAsync =
        service.listIndividuals(nextPageParams())

    fun autoPager(): AutoPagerAsync<IndividualInDirectory> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisDirectoryListIndividualsParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisDirectoryListIndividualsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisDirectoryListIndividualsPageAsync].
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

    /** A builder for [HrisDirectoryListIndividualsPageAsync]. */
    class Builder internal constructor() {

        private var service: DirectoryServiceAsync? = null
        private var params: HrisDirectoryListIndividualsParams? = null
        private var response: HrisDirectoryListIndividualsPageResponse? = null

        internal fun from(
            hrisDirectoryListIndividualsPageAsync: HrisDirectoryListIndividualsPageAsync
        ) = apply {
            service = hrisDirectoryListIndividualsPageAsync.service
            params = hrisDirectoryListIndividualsPageAsync.params
            response = hrisDirectoryListIndividualsPageAsync.response
        }

        fun service(service: DirectoryServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisDirectoryListIndividualsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisDirectoryListIndividualsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisDirectoryListIndividualsPageAsync].
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
        fun build(): HrisDirectoryListIndividualsPageAsync =
            HrisDirectoryListIndividualsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisDirectoryListIndividualsPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "HrisDirectoryListIndividualsPageAsync{service=$service, params=$params, response=$response}"
}
