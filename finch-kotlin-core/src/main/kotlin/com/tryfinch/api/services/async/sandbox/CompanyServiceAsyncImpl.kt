// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

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
import com.tryfinch.api.models.CompanyUpdateResponse
import com.tryfinch.api.models.SandboxCompanyUpdateParams

class CompanyServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CompanyServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<CompanyUpdateResponse> =
        jsonHandler<CompanyUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a sandbox company's data */
    override suspend fun update(
        params: SandboxCompanyUpdateParams,
        requestOptions: RequestOptions
    ): CompanyUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("sandbox", "company")
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
