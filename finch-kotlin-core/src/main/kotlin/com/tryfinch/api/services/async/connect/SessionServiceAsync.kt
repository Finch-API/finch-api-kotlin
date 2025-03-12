// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.connect

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse

interface SessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new connect session for an employer */
    suspend fun new(params: ConnectSessionNewParams, requestOptions: RequestOptions = RequestOptions.none()): SessionNewResponse

    /** Create a new Connect session for reauthenticating an existing connection */
    suspend fun reauthenticate(params: ConnectSessionReauthenticateParams, requestOptions: RequestOptions = RequestOptions.none()): SessionReauthenticateResponse

    /**
     * A view of [SessionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /connect/sessions`, but is otherwise the
         * same as [SessionServiceAsync.new].
         */
        @MustBeClosed
        suspend fun new(params: ConnectSessionNewParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SessionNewResponse>

        /**
         * Returns a raw HTTP response for `post /connect/sessions/reauthenticate`, but is
         * otherwise the same as [SessionServiceAsync.reauthenticate].
         */
        @MustBeClosed
        suspend fun reauthenticate(params: ConnectSessionReauthenticateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<SessionReauthenticateResponse>
    }
}
