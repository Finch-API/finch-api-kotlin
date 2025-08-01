// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AccessTokenCreateParams
import com.tryfinch.api.models.CreateAccessTokenResponse

interface AccessTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccessTokenService

    /** Exchange the authorization code for an access token */
    fun create(
        params: AccessTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateAccessTokenResponse

    /**
     * A view of [AccessTokenService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccessTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /auth/token`, but is otherwise the same as
         * [AccessTokenService.create].
         */
        @MustBeClosed
        fun create(
            params: AccessTokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateAccessTokenResponse>
    }
}
