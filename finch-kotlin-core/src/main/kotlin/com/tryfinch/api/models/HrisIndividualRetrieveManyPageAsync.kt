// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.IndividualServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [IndividualServiceAsync.retrieveMany] */
class HrisIndividualRetrieveManyPageAsync
private constructor(
    private val service: IndividualServiceAsync,
    private val params: HrisIndividualRetrieveManyParams,
    private val response: HrisIndividualRetrieveManyPageResponse,
) {

    /**
     * Delegates to [HrisIndividualRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisIndividualRetrieveManyPageResponse.responses]
     */
    fun responses(): List<IndividualResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisIndividualRetrieveManyParams? = null

    suspend fun getNextPage(): HrisIndividualRetrieveManyPageAsync? =
        getNextPageParams()?.let { service.retrieveMany(it) }

    fun autoPager(): AutoPager = AutoPager(this)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisIndividualRetrieveManyPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisIndividualRetrieveManyPageAsync{service=$service, params=$params, response=$response}"
}
