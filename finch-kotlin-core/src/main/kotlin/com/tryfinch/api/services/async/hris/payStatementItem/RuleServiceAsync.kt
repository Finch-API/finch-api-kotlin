// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.payStatementItem

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisPayStatementItemRuleDeleteParams
import com.tryfinch.api.models.HrisPayStatementItemRuleListPageAsync
import com.tryfinch.api.models.HrisPayStatementItemRuleListParams
import com.tryfinch.api.models.HrisPayStatementItemRuleUpdateParams
import com.tryfinch.api.models.RuleCreateResponse
import com.tryfinch.api.models.RuleDeleteResponse
import com.tryfinch.api.models.RuleUpdateResponse

interface RuleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleServiceAsync

    /**
     * Custom rules can be created to associate specific attributes to pay statement items depending
     * on the use case. For example, pay statement items that meet certain conditions can be labeled
     * as a pre-tax 401k. This metadata can be retrieved where pay statement item information is
     * available.
     */
    suspend fun create(
        params: HrisPayStatementItemRuleCreateParams = HrisPayStatementItemRuleCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleCreateResponse

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): RuleCreateResponse =
        create(HrisPayStatementItemRuleCreateParams.none(), requestOptions)

    /** Update a rule for a pay statement item. */
    suspend fun update(
        ruleId: String,
        params: HrisPayStatementItemRuleUpdateParams = HrisPayStatementItemRuleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse = update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: HrisPayStatementItemRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse

    /** @see update */
    suspend fun update(ruleId: String, requestOptions: RequestOptions): RuleUpdateResponse =
        update(ruleId, HrisPayStatementItemRuleUpdateParams.none(), requestOptions)

    /** List all rules of a connection account. */
    suspend fun list(
        params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisPayStatementItemRuleListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): HrisPayStatementItemRuleListPageAsync =
        list(HrisPayStatementItemRuleListParams.none(), requestOptions)

    /** Delete a rule for a pay statement item. */
    suspend fun delete(
        ruleId: String,
        params: HrisPayStatementItemRuleDeleteParams = HrisPayStatementItemRuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse = delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: HrisPayStatementItemRuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse

    /** @see delete */
    suspend fun delete(ruleId: String, requestOptions: RequestOptions): RuleDeleteResponse =
        delete(ruleId, HrisPayStatementItemRuleDeleteParams.none(), requestOptions)

    /** A view of [RuleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RuleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/pay-statement-item/rule`, but is
         * otherwise the same as [RuleServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: HrisPayStatementItemRuleCreateParams =
                HrisPayStatementItemRuleCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleCreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<RuleCreateResponse> =
            create(HrisPayStatementItemRuleCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /employer/pay-statement-item/rule/{rule_id}`, but is
         * otherwise the same as [RuleServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            ruleId: String,
            params: HrisPayStatementItemRuleUpdateParams =
                HrisPayStatementItemRuleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleUpdateResponse> =
            update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: HrisPayStatementItemRuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleUpdateResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleUpdateResponse> =
            update(ruleId, HrisPayStatementItemRuleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item/rule`, but is otherwise
         * the same as [RuleServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: HrisPayStatementItemRuleListParams = HrisPayStatementItemRuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisPayStatementItemRuleListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisPayStatementItemRuleListPageAsync> =
            list(HrisPayStatementItemRuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /employer/pay-statement-item/rule/{rule_id}`, but
         * is otherwise the same as [RuleServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            ruleId: String,
            params: HrisPayStatementItemRuleDeleteParams =
                HrisPayStatementItemRuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse> =
            delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: HrisPayStatementItemRuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleDeleteResponse> =
            delete(ruleId, HrisPayStatementItemRuleDeleteParams.none(), requestOptions)
    }
}
