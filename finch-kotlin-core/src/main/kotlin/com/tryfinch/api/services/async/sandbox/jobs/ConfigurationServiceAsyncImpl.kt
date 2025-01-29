// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox.jobs

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
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams

class ConfigurationServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ConfigurationServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<List<SandboxJobConfiguration>> =
        jsonHandler<List<SandboxJobConfiguration>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get configurations for sandbox jobs */
    override suspend fun retrieve(
        params: SandboxJobConfigurationRetrieveParams,
        requestOptions: RequestOptions
    ): List<SandboxJobConfiguration> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("sandbox", "jobs", "configuration")
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
        }
    }

    private val updateHandler: Handler<SandboxJobConfiguration> =
        jsonHandler<SandboxJobConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update configurations for sandbox jobs */
    override suspend fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions
    ): SandboxJobConfiguration {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("sandbox", "jobs", "configuration")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
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
