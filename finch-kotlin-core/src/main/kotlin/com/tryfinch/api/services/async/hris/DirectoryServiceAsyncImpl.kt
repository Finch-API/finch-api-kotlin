// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageResponse
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPageAsync
import com.tryfinch.api.models.HrisDirectoryListPageResponse
import com.tryfinch.api.models.HrisDirectoryListParams

class DirectoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DirectoryServiceAsync {

    private val withRawResponse: DirectoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DirectoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DirectoryServiceAsync =
        DirectoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: HrisDirectoryListParams,
        requestOptions: RequestOptions,
    ): HrisDirectoryListPageAsync =
        // get /employer/directory
        withRawResponse().list(params, requestOptions).parse()

    @Deprecated("use `list` instead")
    override suspend fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions,
    ): HrisDirectoryListIndividualsPageAsync =
        // get /employer/directory
        withRawResponse().listIndividuals(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DirectoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DirectoryServiceAsync.WithRawResponse =
            DirectoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<HrisDirectoryListPageResponse> =
            jsonHandler<HrisDirectoryListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: HrisDirectoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisDirectoryListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "directory")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        HrisDirectoryListPageAsync.builder()
                            .service(DirectoryServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listIndividualsHandler: Handler<HrisDirectoryListIndividualsPageResponse> =
            jsonHandler<HrisDirectoryListIndividualsPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        @Deprecated("use `list` instead")
        override suspend fun listIndividuals(
            params: HrisDirectoryListIndividualsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisDirectoryListIndividualsPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "directory")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listIndividualsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        HrisDirectoryListIndividualsPageAsync.builder()
                            .service(DirectoryServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
