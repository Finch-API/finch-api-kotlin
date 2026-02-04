// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.IndividualServiceAsync
import java.util.Objects

/** @see IndividualServiceAsync.retrieveMany */
class HrisIndividualRetrieveManyPageAsync
private constructor(
    private val service: IndividualServiceAsync,
    private val params: HrisIndividualRetrieveManyParams,
    private val response: HrisIndividualRetrieveManyPageResponse,
) : PageAsync<IndividualResponse> {

    /**
     * Delegates to [HrisIndividualRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see HrisIndividualRetrieveManyPageResponse.responses
     */
    fun responses(): List<IndividualResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    override fun items(): List<IndividualResponse> = responses()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisIndividualRetrieveManyParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): HrisIndividualRetrieveManyPageAsync =
        service.retrieveMany(nextPageParams())

    fun autoPager(): AutoPagerAsync<IndividualResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisIndividualRetrieveManyParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisIndividualRetrieveManyPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisIndividualRetrieveManyPageAsync].
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

    /** A builder for [HrisIndividualRetrieveManyPageAsync]. */
    class Builder internal constructor() {

        private var service: IndividualServiceAsync? = null
        private var params: HrisIndividualRetrieveManyParams? = null
        private var response: HrisIndividualRetrieveManyPageResponse? = null

        internal fun from(
            hrisIndividualRetrieveManyPageAsync: HrisIndividualRetrieveManyPageAsync
        ) = apply {
            service = hrisIndividualRetrieveManyPageAsync.service
            params = hrisIndividualRetrieveManyPageAsync.params
            response = hrisIndividualRetrieveManyPageAsync.response
        }

        fun service(service: IndividualServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisIndividualRetrieveManyParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisIndividualRetrieveManyPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisIndividualRetrieveManyPageAsync].
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
        fun build(): HrisIndividualRetrieveManyPageAsync =
            HrisIndividualRetrieveManyPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisIndividualRetrieveManyPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "HrisIndividualRetrieveManyPageAsync{service=$service, params=$params, response=$response}"
}
