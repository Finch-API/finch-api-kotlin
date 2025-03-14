// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox.connections

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
import com.tryfinch.api.models.AccountCreateResponse
import com.tryfinch.api.models.AccountUpdateResponse
import com.tryfinch.api.models.SandboxConnectionAccountCreateParams
import com.tryfinch.api.models.SandboxConnectionAccountUpdateParams

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountCreateResponse> =
        jsonHandler<AccountCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new account for an existing connection (company/provider pair) */
    override suspend fun create(
        params: SandboxConnectionAccountCreateParams,
        requestOptions: RequestOptions,
    ): AccountCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("sandbox", "connections", "accounts")
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

    private val updateHandler: Handler<AccountUpdateResponse> =
        jsonHandler<AccountUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update an existing sandbox account. Change the connection status to understand how the Finch
     * API responds.
     */
    override suspend fun update(
        params: SandboxConnectionAccountUpdateParams,
        requestOptions: RequestOptions,
    ): AccountUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("sandbox", "connections", "accounts")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
