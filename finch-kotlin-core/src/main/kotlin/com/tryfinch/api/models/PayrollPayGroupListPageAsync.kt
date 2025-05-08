// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.payroll.PayGroupServiceAsync
import java.util.Objects

/** @see [PayGroupServiceAsync.list] */
class PayrollPayGroupListPageAsync
private constructor(
    private val service: PayGroupServiceAsync,
    private val params: PayrollPayGroupListParams,
    private val items: List<PayGroupListResponse>,
) : PageAsync<PayGroupListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PayrollPayGroupListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): PayrollPayGroupListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PayGroupListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PayrollPayGroupListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<PayGroupListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayrollPayGroupListPageAsync].
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

    /** A builder for [PayrollPayGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: PayGroupServiceAsync? = null
        private var params: PayrollPayGroupListParams? = null
        private var items: List<PayGroupListResponse>? = null

        internal fun from(payrollPayGroupListPageAsync: PayrollPayGroupListPageAsync) = apply {
            service = payrollPayGroupListPageAsync.service
            params = payrollPayGroupListPageAsync.params
            items = payrollPayGroupListPageAsync.items
        }

        fun service(service: PayGroupServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PayrollPayGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<PayGroupListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PayrollPayGroupListPageAsync].
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
        fun build(): PayrollPayGroupListPageAsync =
            PayrollPayGroupListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayrollPayGroupListPageAsync && service == other.service && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, items) /* spotless:on */

    override fun toString() =
        "PayrollPayGroupListPageAsync{service=$service, params=$params, items=$items}"
}
