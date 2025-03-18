// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.JobManualRetrieveParams
import com.tryfinch.api.models.ManualAsyncJob

class ManualServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ManualService {

    private val withRawResponse: ManualService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ManualService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: JobManualRetrieveParams,
        requestOptions: RequestOptions,
    ): ManualAsyncJob =
        // get /jobs/manual/{job_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ManualService.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ManualAsyncJob> =
            jsonHandler<ManualAsyncJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: JobManualRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManualAsyncJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("jobs", "manual", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
