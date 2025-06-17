// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccessTokenCreateParams
import com.tryfinch.api.models.CreateAccessTokenResponse

interface AccessTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccessTokenServiceAsync

    /** Exchange the authorization code for an access token */
    suspend fun create(
        params: AccessTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateAccessTokenResponse

    /**
     * A view of [AccessTokenServiceAsync] that provides access to raw HTTP responses for each
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
        ): AccessTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /auth/token`, but is otherwise the same as
         * [AccessTokenServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AccessTokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateAccessTokenResponse>
    }
}
