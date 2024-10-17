// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.JobManualRetrieveParams
import com.tryfinch.api.models.ManualAsyncJob

class ManualServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ManualServiceAsync {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ManualAsyncJob> =
        jsonHandler<ManualAsyncJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get a manual job by `job_id`. Manual jobs are completed by a human and include Assisted
     * Benefits jobs.
     */
    override suspend fun retrieve(
        params: JobManualRetrieveParams,
        requestOptions: RequestOptions
    ): ManualAsyncJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("jobs", "manual", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
