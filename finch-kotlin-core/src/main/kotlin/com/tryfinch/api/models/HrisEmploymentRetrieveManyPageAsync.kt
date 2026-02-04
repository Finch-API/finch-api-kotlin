// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.EmploymentServiceAsync
import java.util.Objects

/** @see EmploymentServiceAsync.retrieveMany */
class HrisEmploymentRetrieveManyPageAsync
private constructor(
    private val service: EmploymentServiceAsync,
    private val params: HrisEmploymentRetrieveManyParams,
    private val response: HrisEmploymentRetrieveManyPageResponse,
) : PageAsync<EmploymentDataResponse> {

    /**
     * Delegates to [HrisEmploymentRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see HrisEmploymentRetrieveManyPageResponse.responses
     */
    fun responses(): List<EmploymentDataResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    override fun items(): List<EmploymentDataResponse> = responses()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisEmploymentRetrieveManyParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): HrisEmploymentRetrieveManyPageAsync =
        service.retrieveMany(nextPageParams())

    fun autoPager(): AutoPagerAsync<EmploymentDataResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisEmploymentRetrieveManyParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisEmploymentRetrieveManyPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisEmploymentRetrieveManyPageAsync].
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

    /** A builder for [HrisEmploymentRetrieveManyPageAsync]. */
    class Builder internal constructor() {

        private var service: EmploymentServiceAsync? = null
        private var params: HrisEmploymentRetrieveManyParams? = null
        private var response: HrisEmploymentRetrieveManyPageResponse? = null

        internal fun from(
            hrisEmploymentRetrieveManyPageAsync: HrisEmploymentRetrieveManyPageAsync
        ) = apply {
            service = hrisEmploymentRetrieveManyPageAsync.service
            params = hrisEmploymentRetrieveManyPageAsync.params
            response = hrisEmploymentRetrieveManyPageAsync.response
        }

        fun service(service: EmploymentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisEmploymentRetrieveManyParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisEmploymentRetrieveManyPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisEmploymentRetrieveManyPageAsync].
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
        fun build(): HrisEmploymentRetrieveManyPageAsync =
            HrisEmploymentRetrieveManyPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisEmploymentRetrieveManyPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "HrisEmploymentRetrieveManyPageAsync{service=$service, params=$params, response=$response}"
}
