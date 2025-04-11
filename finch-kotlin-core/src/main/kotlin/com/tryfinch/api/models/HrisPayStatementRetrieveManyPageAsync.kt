// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.PayStatementServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [PayStatementServiceAsync.retrieveMany] */
class HrisPayStatementRetrieveManyPageAsync
private constructor(
    private val service: PayStatementServiceAsync,
    private val params: HrisPayStatementRetrieveManyParams,
    private val response: HrisPayStatementRetrieveManyPageResponse,
) {

    /**
     * Delegates to [HrisPayStatementRetrieveManyPageResponse], but gracefully handles missing data.
     *
     * @see [HrisPayStatementRetrieveManyPageResponse.responses]
     */
    fun responses(): List<PayStatementResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisPayStatementRetrieveManyParams? = null

    suspend fun getNextPage(): HrisPayStatementRetrieveManyPageAsync? =
        getNextPageParams()?.let { service.retrieveMany(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisPayStatementRetrieveManyParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisPayStatementRetrieveManyPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisPayStatementRetrieveManyPageAsync].
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

    /** A builder for [HrisPayStatementRetrieveManyPageAsync]. */
    class Builder internal constructor() {

        private var service: PayStatementServiceAsync? = null
        private var params: HrisPayStatementRetrieveManyParams? = null
        private var response: HrisPayStatementRetrieveManyPageResponse? = null

        internal fun from(
            hrisPayStatementRetrieveManyPageAsync: HrisPayStatementRetrieveManyPageAsync
        ) = apply {
            service = hrisPayStatementRetrieveManyPageAsync.service
            params = hrisPayStatementRetrieveManyPageAsync.params
            response = hrisPayStatementRetrieveManyPageAsync.response
        }

        fun service(service: PayStatementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisPayStatementRetrieveManyParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HrisPayStatementRetrieveManyPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisPayStatementRetrieveManyPageAsync].
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
        fun build(): HrisPayStatementRetrieveManyPageAsync =
            HrisPayStatementRetrieveManyPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: HrisPayStatementRetrieveManyPageAsync) :
        Flow<PayStatementResponse> {

        override suspend fun collect(collector: FlowCollector<PayStatementResponse>) {
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

        return /* spotless:off */ other is HrisPayStatementRetrieveManyPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisPayStatementRetrieveManyPageAsync{service=$service, params=$params, response=$response}"
}
