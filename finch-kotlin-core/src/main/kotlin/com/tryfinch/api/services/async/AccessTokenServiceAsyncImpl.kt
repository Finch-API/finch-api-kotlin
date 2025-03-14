// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.json
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.errors.FinchException
import com.tryfinch.api.models.AccessTokenCreateParams
import com.tryfinch.api.models.CreateAccessTokenResponse

class AccessTokenServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccessTokenServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CreateAccessTokenResponse> =
        jsonHandler<CreateAccessTokenResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Exchange the authorization code for an access token */
    override suspend fun create(
        params: AccessTokenCreateParams,
        requestOptions: RequestOptions,
    ): CreateAccessTokenResponse {
        val builder = params.toBuilder()

        if (params.clientSecret() == null) {
            if (clientOptions.clientSecret == null || clientOptions.clientSecret.isEmpty()) {
                throw FinchException(
                    "client_secret must be provided as an argument or with the FINCH_CLIENT_SECRET environment variable"
                )
            }
            builder.clientSecret(clientOptions.clientSecret)
        }

        if (params.clientId() == null) {
            if (clientOptions.clientId == null || clientOptions.clientId.isEmpty()) {
                throw FinchException(
                    "client_id must be provided as an argument or with the FINCH_CLIENT_ID environment variable"
                )
            }
            builder.clientId(clientOptions.clientId)
        }

        val modifiedParams = builder.build()

        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("auth", "token")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params._queryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params._headers())
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
