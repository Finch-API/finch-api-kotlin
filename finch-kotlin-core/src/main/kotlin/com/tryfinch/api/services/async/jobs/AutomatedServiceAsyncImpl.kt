// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.handlers.errorBodyHandler
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.models.AutomatedAsyncJob
import com.tryfinch.api.models.AutomatedCreateResponse
import com.tryfinch.api.models.AutomatedListResponse
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams

class AutomatedServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AutomatedServiceAsync {

    private val withRawResponse: AutomatedServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutomatedServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AutomatedServiceAsync =
        AutomatedServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: JobAutomatedCreateParams,
        requestOptions: RequestOptions,
    ): AutomatedCreateResponse =
        // post /jobs/automated
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: JobAutomatedRetrieveParams,
        requestOptions: RequestOptions,
    ): AutomatedAsyncJob =
        // get /jobs/automated/{job_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: JobAutomatedListParams,
        requestOptions: RequestOptions,
    ): AutomatedListResponse =
        // get /jobs/automated
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutomatedServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AutomatedServiceAsync.WithRawResponse =
            AutomatedServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<AutomatedCreateResponse> =
            jsonHandler<AutomatedCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: JobAutomatedCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutomatedCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("jobs", "automated")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<AutomatedAsyncJob> =
            jsonHandler<AutomatedAsyncJob>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: JobAutomatedRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutomatedAsyncJob> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("jobs", "automated", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AutomatedListResponse> =
            jsonHandler<AutomatedListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: JobAutomatedListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutomatedListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("jobs", "automated")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
