// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

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
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.models.HrisPaymentListPageAsync
import com.tryfinch.api.models.HrisPaymentListParams
import com.tryfinch.api.models.Payment

class PaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentServiceAsync {

    private val withRawResponse: PaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentServiceAsync =
        PaymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: HrisPaymentListParams,
        requestOptions: RequestOptions,
    ): HrisPaymentListPageAsync =
        // get /employer/payment
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentServiceAsync.WithRawResponse =
            PaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<List<Payment>> =
            jsonHandler<List<Payment>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: HrisPaymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisPaymentListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "payment")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HrisPaymentListPageAsync.builder()
                            .service(PaymentServiceAsyncImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
