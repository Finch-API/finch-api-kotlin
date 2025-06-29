// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ConnectionCreateResponse
import com.tryfinch.api.models.SandboxConnectionCreateParams
import com.tryfinch.api.services.async.sandbox.connections.AccountServiceAsync

interface ConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConnectionServiceAsync

    fun accounts(): AccountServiceAsync

    /** Create a new connection (new company/provider pair) with a new account */
    suspend fun create(
        params: SandboxConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionCreateResponse

    /**
     * A view of [ConnectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): ConnectionServiceAsync.WithRawResponse

        fun accounts(): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/connections`, but is otherwise the same as
         * [ConnectionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SandboxConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionCreateResponse>
    }
}
