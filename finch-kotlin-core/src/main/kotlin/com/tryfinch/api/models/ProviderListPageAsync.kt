// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.ProviderServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [ProviderServiceAsync.list] */
class ProviderListPageAsync
private constructor(
    private val service: ProviderServiceAsync,
    private val params: ProviderListParams,
    private val items: List<Provider>,
) {

    fun hasNextPage(): Boolean = items.isNotEmpty()

    fun getNextPageParams(): ProviderListParams? = null

    suspend fun getNextPage(): ProviderListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProviderListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<Provider> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProviderListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .items()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProviderListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProviderServiceAsync? = null
        private var params: ProviderListParams? = null
        private var items: List<Provider>? = null

        internal fun from(providerListPageAsync: ProviderListPageAsync) = apply {
            service = providerListPageAsync.service
            params = providerListPageAsync.params
            items = providerListPageAsync.items
        }

        fun service(service: ProviderServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProviderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Provider>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ProviderListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProviderListPageAsync =
            ProviderListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: ProviderListPageAsync) : Flow<Provider> {

        override suspend fun collect(collector: FlowCollector<Provider>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
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

        return /* spotless:off */ other is ProviderListPageAsync && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "ProviderListPageAsync{service=$service, params=$params, items=$items}"
}
