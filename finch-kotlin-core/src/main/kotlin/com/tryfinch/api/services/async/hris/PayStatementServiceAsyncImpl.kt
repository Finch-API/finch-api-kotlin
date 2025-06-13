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
import com.tryfinch.api.core.http.json
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.models.HrisPayStatementRetrieveManyPageAsync
import com.tryfinch.api.models.HrisPayStatementRetrieveManyPageResponse
import com.tryfinch.api.models.HrisPayStatementRetrieveManyParams

class PayStatementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PayStatementServiceAsync {

    private val withRawResponse: PayStatementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PayStatementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PayStatementServiceAsync =
        PayStatementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams,
        requestOptions: RequestOptions,
    ): HrisPayStatementRetrieveManyPageAsync =
        // post /employer/pay-statement
        withRawResponse().retrieveMany(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayStatementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PayStatementServiceAsync.WithRawResponse =
            PayStatementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveManyHandler: Handler<HrisPayStatementRetrieveManyPageResponse> =
            jsonHandler<HrisPayStatementRetrieveManyPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieveMany(
            params: HrisPayStatementRetrieveManyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisPayStatementRetrieveManyPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "pay-statement")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveManyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        HrisPayStatementRetrieveManyPageAsync.builder()
                            .service(PayStatementServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
