// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.company

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisCompanyPayStatementItemListPageAsync
import com.tryfinch.api.models.HrisCompanyPayStatementItemListParams
import com.tryfinch.api.services.async.hris.company.payStatementItem.RuleServiceAsync

interface PayStatementItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PayStatementItemServiceAsync

    fun rules(): RuleServiceAsync

    /**
     * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
     * support will be added soon Retrieve a list of detailed pay statement items for the access
     * token's connection account.
     */
    suspend fun list(
        params: HrisCompanyPayStatementItemListParams =
            HrisCompanyPayStatementItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisCompanyPayStatementItemListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): HrisCompanyPayStatementItemListPageAsync =
        list(HrisCompanyPayStatementItemListParams.none(), requestOptions)

    /**
     * A view of [PayStatementItemServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PayStatementItemServiceAsync.WithRawResponse

        fun rules(): RuleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/pay-statement-item`, but is otherwise the
         * same as [PayStatementItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: HrisCompanyPayStatementItemListParams =
                HrisCompanyPayStatementItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisCompanyPayStatementItemListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisCompanyPayStatementItemListPageAsync> =
            list(HrisCompanyPayStatementItemListParams.none(), requestOptions)
    }
}
