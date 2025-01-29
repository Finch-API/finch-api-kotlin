// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.connect

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
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse

class SessionServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : SessionServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val newHandler: Handler<SessionNewResponse> =
        jsonHandler<SessionNewResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new connect session for an employer */
    override suspend fun new(
        params: ConnectSessionNewParams,
        requestOptions: RequestOptions
    ): SessionNewResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("connect", "sessions")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { newHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val reauthenticateHandler: Handler<SessionReauthenticateResponse> =
        jsonHandler<SessionReauthenticateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a new Connect session for reauthenticating an existing connection */
    override suspend fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions
    ): SessionReauthenticateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("connect", "sessions", "reauthenticate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { reauthenticateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
