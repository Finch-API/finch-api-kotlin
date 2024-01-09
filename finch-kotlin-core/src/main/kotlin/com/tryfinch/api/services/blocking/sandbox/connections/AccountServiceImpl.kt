// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.connections

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.AccountCreateResponse
import com.tryfinch.api.models.AccountUpdateResponse
import com.tryfinch.api.models.SandboxConnectionAccountCreateParams
import com.tryfinch.api.models.SandboxConnectionAccountUpdateParams
import com.tryfinch.api.services.errorHandler
import com.tryfinch.api.services.json
import com.tryfinch.api.services.jsonHandler
import com.tryfinch.api.services.withErrorHandler

class AccountServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AccountService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountCreateResponse> =
        jsonHandler<AccountCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new account for an existing connection (company/provider pair) */
    override fun create(
        params: SandboxConnectionAccountCreateParams,
        requestOptions: RequestOptions
    ): AccountCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("sandbox", "connections", "accounts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<AccountUpdateResponse> =
        jsonHandler<AccountUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update an existing sandbox account. Change the connection status to understand how the Finch
     * API responds.
     */
    override fun update(
        params: SandboxConnectionAccountUpdateParams,
        requestOptions: RequestOptions
    ): AccountUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("sandbox", "connections", "accounts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
