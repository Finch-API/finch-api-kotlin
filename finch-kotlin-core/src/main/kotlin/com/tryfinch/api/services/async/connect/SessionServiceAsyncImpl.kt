// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.connect

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
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse

class SessionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionServiceAsync {

    private val withRawResponse: SessionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SessionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SessionServiceAsync =
        SessionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun new(
        params: ConnectSessionNewParams,
        requestOptions: RequestOptions,
    ): SessionNewResponse =
        // post /connect/sessions
        withRawResponse().new(params, requestOptions).parse()

    override suspend fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions,
    ): SessionReauthenticateResponse =
        // post /connect/sessions/reauthenticate
        withRawResponse().reauthenticate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SessionServiceAsync.WithRawResponse =
            SessionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val newHandler: Handler<SessionNewResponse> =
            jsonHandler<SessionNewResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun new(
            params: ConnectSessionNewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionNewResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("connect", "sessions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { newHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reauthenticateHandler: Handler<SessionReauthenticateResponse> =
            jsonHandler<SessionReauthenticateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun reauthenticate(
            params: ConnectSessionReauthenticateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionReauthenticateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("connect", "sessions", "reauthenticate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { reauthenticateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
