// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccountDisconnectEntityParams
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectEntityResponse
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountServiceAsync

    /** Disconnect one or more `access_token`s from your application. */
    suspend fun disconnect(
        params: AccountDisconnectParams = AccountDisconnectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisconnectResponse

    /** @see disconnect */
    suspend fun disconnect(requestOptions: RequestOptions): DisconnectResponse =
        disconnect(AccountDisconnectParams.none(), requestOptions)

    /**
     * Disconnect entity(s) from a connection without affecting other entities associated with the
     * same connection.
     */
    suspend fun disconnectEntity(
        params: AccountDisconnectEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisconnectEntityResponse

    /** Read account information associated with an `access_token` */
    suspend fun introspect(
        params: AccountIntrospectParams = AccountIntrospectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Introspection

    /** @see introspect */
    suspend fun introspect(requestOptions: RequestOptions): Introspection =
        introspect(AccountIntrospectParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /disconnect`, but is otherwise the same as
         * [AccountServiceAsync.disconnect].
         */
        @MustBeClosed
        suspend fun disconnect(
            params: AccountDisconnectParams = AccountDisconnectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisconnectResponse>

        /** @see disconnect */
        @MustBeClosed
        suspend fun disconnect(
            requestOptions: RequestOptions
        ): HttpResponseFor<DisconnectResponse> =
            disconnect(AccountDisconnectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /disconnect-entity`, but is otherwise the same as
         * [AccountServiceAsync.disconnectEntity].
         */
        @MustBeClosed
        suspend fun disconnectEntity(
            params: AccountDisconnectEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisconnectEntityResponse>

        /**
         * Returns a raw HTTP response for `get /introspect`, but is otherwise the same as
         * [AccountServiceAsync.introspect].
         */
        @MustBeClosed
        suspend fun introspect(
            params: AccountIntrospectParams = AccountIntrospectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Introspection>

        /** @see introspect */
        @MustBeClosed
        suspend fun introspect(requestOptions: RequestOptions): HttpResponseFor<Introspection> =
            introspect(AccountIntrospectParams.none(), requestOptions)
    }
}
