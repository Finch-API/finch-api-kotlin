// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
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
import com.tryfinch.api.models.RequestForwardingForwardParams
import com.tryfinch.api.models.RequestForwardingForwardResponse

class RequestForwardingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RequestForwardingServiceAsync {

    private val withRawResponse: RequestForwardingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RequestForwardingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): RequestForwardingServiceAsync =
        RequestForwardingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun forward(
        params: RequestForwardingForwardParams,
        requestOptions: RequestOptions,
    ): RequestForwardingForwardResponse =
        // post /forward
        withRawResponse().forward(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RequestForwardingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RequestForwardingServiceAsync.WithRawResponse =
            RequestForwardingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val forwardHandler: Handler<RequestForwardingForwardResponse> =
            jsonHandler<RequestForwardingForwardResponse>(clientOptions.jsonMapper)

        override suspend fun forward(
            params: RequestForwardingForwardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequestForwardingForwardResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("forward")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { forwardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
