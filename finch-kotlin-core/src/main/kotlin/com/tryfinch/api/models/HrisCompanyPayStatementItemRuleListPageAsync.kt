// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.AutoPagerAsync
import com.tryfinch.api.core.PageAsync
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.async.hris.company.payStatementItem.RuleServiceAsync
import java.util.Objects

/** @see RuleServiceAsync.list */
class HrisCompanyPayStatementItemRuleListPageAsync
private constructor(
    private val service: RuleServiceAsync,
    private val params: HrisCompanyPayStatementItemRuleListParams,
    private val response: HrisCompanyPayStatementItemRuleListPageResponse,
) : PageAsync<RuleListResponse> {

    /**
     * Delegates to [HrisCompanyPayStatementItemRuleListPageResponse], but gracefully handles
     * missing data.
     *
     * @see HrisCompanyPayStatementItemRuleListPageResponse.responses
     */
    fun responses(): List<RuleListResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    override fun items(): List<RuleListResponse> = responses()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): HrisCompanyPayStatementItemRuleListParams =
        throw IllegalStateException("Cannot construct next page params")

    override suspend fun nextPage(): HrisCompanyPayStatementItemRuleListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RuleListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisCompanyPayStatementItemRuleListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisCompanyPayStatementItemRuleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisCompanyPayStatementItemRuleListPageAsync].
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

    /** A builder for [HrisCompanyPayStatementItemRuleListPageAsync]. */
    class Builder internal constructor() {

        private var service: RuleServiceAsync? = null
        private var params: HrisCompanyPayStatementItemRuleListParams? = null
        private var response: HrisCompanyPayStatementItemRuleListPageResponse? = null

        internal fun from(
            hrisCompanyPayStatementItemRuleListPageAsync:
                HrisCompanyPayStatementItemRuleListPageAsync
        ) = apply {
            service = hrisCompanyPayStatementItemRuleListPageAsync.service
            params = hrisCompanyPayStatementItemRuleListPageAsync.params
            response = hrisCompanyPayStatementItemRuleListPageAsync.response
        }

        fun service(service: RuleServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisCompanyPayStatementItemRuleListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: HrisCompanyPayStatementItemRuleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisCompanyPayStatementItemRuleListPageAsync].
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
        fun build(): HrisCompanyPayStatementItemRuleListPageAsync =
            HrisCompanyPayStatementItemRuleListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisCompanyPayStatementItemRuleListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemRuleListPageAsync{service=$service, params=$params, response=$response}"
}
