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
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val disconnectHandler: Handler<DisconnectResponse> =
        jsonHandler<DisconnectResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Disconnect one or more `access_token`s from your application. */
    override suspend fun disconnect(
        params: AccountDisconnectParams,
        requestOptions: RequestOptions,
    ): DisconnectResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("disconnect")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { disconnectHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val introspectHandler: Handler<Introspection> =
        jsonHandler<Introspection>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Read account information associated with an `access_token` */
    override suspend fun introspect(
        params: AccountIntrospectParams,
        requestOptions: RequestOptions,
    ): Introspection {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("introspect")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { introspectHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
