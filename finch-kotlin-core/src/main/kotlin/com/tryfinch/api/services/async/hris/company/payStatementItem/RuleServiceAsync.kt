// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.company.payStatementItem

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleDeleteParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListPageAsync
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleUpdateParams
import com.tryfinch.api.models.RuleCreateResponse
import com.tryfinch.api.models.RuleDeleteResponse
import com.tryfinch.api.models.RuleUpdateResponse

interface RuleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Custom rules can be created to associate specific attributes to
     * pay statement items depending on the use case. For example, pay statement items that meet
     * certain conditions can be labeled as a pre-tax 401k. This metadata can be retrieved where pay
     * statement item information is available.
     */
    suspend fun create(
        params: HrisCompanyPayStatementItemRuleCreateParams =
            HrisCompanyPayStatementItemRuleCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): RuleCreateResponse =
        create(HrisCompanyPayStatementItemRuleCreateParams.none(), requestOptions)

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Update a rule for a pay statement item.
     */
    suspend fun update(
        params: HrisCompanyPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon List all rules of a connection account.
     */
    suspend fun list(
        params: HrisCompanyPayStatementItemRuleListParams =
            HrisCompanyPayStatementItemRuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisCompanyPayStatementItemRuleListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): HrisCompanyPayStatementItemRuleListPageAsync =
        list(HrisCompanyPayStatementItemRuleListParams.none(), requestOptions)

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Delete a rule for a pay statement item.
     */
    suspend fun delete(
        params: HrisCompanyPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse

    /** A view of [RuleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /employer/pay-statement-item/rule`, but is
         * otherwise the same as [RuleServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: HrisCompanyPayStatementItemRuleCreateParams =
                HrisCompanyPayStatementItemRuleCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<RuleCreateResponse> =
            create(HrisCompanyPayStatementItemRuleCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /employer/pay-statement-item/rule/{rule_id}`, but is
         * otherwise the same as [RuleServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: HrisCompanyPayStatementItemRuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item/rule`, but is otherwise
         * the same as [RuleServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: HrisCompanyPayStatementItemRuleListParams =
                HrisCompanyPayStatementItemRuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisCompanyPayStatementItemRuleListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisCompanyPayStatementItemRuleListPageAsync> =
            list(HrisCompanyPayStatementItemRuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /employer/pay-statement-item/rule/{rule_id}`, but
         * is otherwise the same as [RuleServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: HrisCompanyPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse>
    }
}
