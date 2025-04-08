// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Disconnect one or more `access_token`s from your application. */
    suspend fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisconnectResponse

    /** @see [disconnect] */
    suspend fun disconnect(requestOptions: RequestOptions): DisconnectResponse =
        disconnect(AccountDisconnectParams.none(), requestOptions)

    /** Read account information associated with an `access_token` */
    suspend fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Introspection

    /** @see [introspect] */
    suspend fun introspect(requestOptions: RequestOptions): Introspection =
        introspect(AccountIntrospectParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /disconnect`, but is otherwise the same as
         * [AccountServiceAsync.disconnect].
         */
        @MustBeClosed
        suspend fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisconnectResponse>

        /** @see [disconnect] */
        @MustBeClosed
        suspend fun disconnect(
            requestOptions: RequestOptions
        ): HttpResponseFor<DisconnectResponse> =
            disconnect(AccountDisconnectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /introspect`, but is otherwise the same as
         * [AccountServiceAsync.introspect].
         */
        @MustBeClosed
        suspend fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Introspection>

        /** @see [introspect] */
        @MustBeClosed
        suspend fun introspect(requestOptions: RequestOptions): HttpResponseFor<Introspection> =
            introspect(AccountIntrospectParams.none(), requestOptions)
    }
}
