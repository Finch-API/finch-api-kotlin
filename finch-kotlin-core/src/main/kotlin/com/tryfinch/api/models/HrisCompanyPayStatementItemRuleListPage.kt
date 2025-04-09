// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.services.blocking.hris.company.payStatementItem.RuleService
import java.util.Objects

/** @see [RuleService.list] */
class HrisCompanyPayStatementItemRuleListPage
private constructor(
    private val service: RuleService,
    private val params: HrisCompanyPayStatementItemRuleListParams,
    private val response: HrisCompanyPayStatementItemRuleListPageResponse,
) {

    /**
     * Delegates to [HrisCompanyPayStatementItemRuleListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [HrisCompanyPayStatementItemRuleListPageResponse.responses]
     */
    fun responses(): List<RuleListResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisCompanyPayStatementItemRuleListParams? = null

    fun getNextPage(): HrisCompanyPayStatementItemRuleListPage? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): HrisCompanyPayStatementItemRuleListParams = params

    /** The response that this page was parsed from. */
    fun response(): HrisCompanyPayStatementItemRuleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisCompanyPayStatementItemRuleListPage].
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

    /** A builder for [HrisCompanyPayStatementItemRuleListPage]. */
    class Builder internal constructor() {

        private var service: RuleService? = null
        private var params: HrisCompanyPayStatementItemRuleListParams? = null
        private var response: HrisCompanyPayStatementItemRuleListPageResponse? = null

        internal fun from(
            hrisCompanyPayStatementItemRuleListPage: HrisCompanyPayStatementItemRuleListPage
        ) = apply {
            service = hrisCompanyPayStatementItemRuleListPage.service
            params = hrisCompanyPayStatementItemRuleListPage.params
            response = hrisCompanyPayStatementItemRuleListPage.response
        }

        fun service(service: RuleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HrisCompanyPayStatementItemRuleListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: HrisCompanyPayStatementItemRuleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [HrisCompanyPayStatementItemRuleListPage].
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
        fun build(): HrisCompanyPayStatementItemRuleListPage =
            HrisCompanyPayStatementItemRuleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: HrisCompanyPayStatementItemRuleListPage) :
        Sequence<RuleListResponse> {

        override fun iterator(): Iterator<RuleListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    yield(page.responses()[index++])
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

        return /* spotless:off */ other is HrisCompanyPayStatementItemRuleListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemRuleListPage{service=$service, params=$params, response=$response}"
}
