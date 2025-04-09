// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.services.async.hris.company.payStatementItem.RuleServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
 * support will be added soon List all rules of a connection account.
 */
class HrisCompanyPayStatementItemRuleListPageAsync
private constructor(
    private val rulesService: RuleServiceAsync,
    private val params: HrisCompanyPayStatementItemRuleListParams,
    private val response: HrisCompanyPayStatementItemRuleListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): HrisCompanyPayStatementItemRuleListPageResponse = response

    /**
     * Delegates to [HrisCompanyPayStatementItemRuleListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [HrisCompanyPayStatementItemRuleListPageResponse.responses]
     */
    fun responses(): List<RuleListResponse> =
        response._responses().getNullable("responses") ?: emptyList()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisCompanyPayStatementItemRuleListPageAsync && rulesService == other.rulesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(rulesService, params, response) /* spotless:on */

    override fun toString() =
        "HrisCompanyPayStatementItemRuleListPageAsync{rulesService=$rulesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = responses().isNotEmpty()

    fun getNextPageParams(): HrisCompanyPayStatementItemRuleListParams? = null

    suspend fun getNextPage(): HrisCompanyPayStatementItemRuleListPageAsync? {
        return getNextPageParams()?.let { rulesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            rulesService: RuleServiceAsync,
            params: HrisCompanyPayStatementItemRuleListParams,
            response: HrisCompanyPayStatementItemRuleListPageResponse,
        ) = HrisCompanyPayStatementItemRuleListPageAsync(rulesService, params, response)
    }

    class AutoPager(private val firstPage: HrisCompanyPayStatementItemRuleListPageAsync) :
        Flow<RuleListResponse> {

        override suspend fun collect(collector: FlowCollector<RuleListResponse>) {
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
}
