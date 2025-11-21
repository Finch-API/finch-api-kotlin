// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.connect

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ConnectSessionConnectParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionConnectResponse
import com.tryfinch.api.models.SessionReauthenticateResponse

interface SessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SessionServiceAsync

    /** Create a new connect session for an employer */
    suspend fun connect(
        params: ConnectSessionConnectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionConnectResponse

    /** Create a new Connect session for reauthenticating an existing connection */
    suspend fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionReauthenticateResponse

    /**
     * A view of [SessionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /connect/sessions`, but is otherwise the same as
         * [SessionServiceAsync.connect].
         */
        @MustBeClosed
        suspend fun connect(
            params: ConnectSessionConnectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionConnectResponse>

        /**
         * Returns a raw HTTP response for `post /connect/sessions/reauthenticate`, but is otherwise
         * the same as [SessionServiceAsync.reauthenticate].
         */
        @MustBeClosed
        suspend fun reauthenticate(
            params: ConnectSessionReauthenticateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionReauthenticateResponse>
    }
}
