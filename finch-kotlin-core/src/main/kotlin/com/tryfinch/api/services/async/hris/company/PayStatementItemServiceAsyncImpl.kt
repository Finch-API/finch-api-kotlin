// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.company

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
import com.tryfinch.api.models.HrisCompanyPayStatementItemListPageAsync
import com.tryfinch.api.models.HrisCompanyPayStatementItemListPageResponse
import com.tryfinch.api.models.HrisCompanyPayStatementItemListParams
import com.tryfinch.api.services.async.hris.company.payStatementItem.RuleServiceAsync
import com.tryfinch.api.services.async.hris.company.payStatementItem.RuleServiceAsyncImpl

class PayStatementItemServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PayStatementItemServiceAsync {

    private val withRawResponse: PayStatementItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rules: RuleServiceAsync by lazy { RuleServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PayStatementItemServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): PayStatementItemServiceAsync =
        PayStatementItemServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun rules(): RuleServiceAsync = rules

    override suspend fun list(
        params: HrisCompanyPayStatementItemListParams,
        requestOptions: RequestOptions,
    ): HrisCompanyPayStatementItemListPageAsync =
        // get /employer/pay-statement-item
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayStatementItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val rules: RuleServiceAsync.WithRawResponse by lazy {
            RuleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PayStatementItemServiceAsync.WithRawResponse =
            PayStatementItemServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun rules(): RuleServiceAsync.WithRawResponse = rules

        private val listHandler: Handler<HrisCompanyPayStatementItemListPageResponse> =
            jsonHandler<HrisCompanyPayStatementItemListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: HrisCompanyPayStatementItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisCompanyPayStatementItemListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "pay-statement-item")
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
                    .let {
                        HrisCompanyPayStatementItemListPageAsync.builder()
                            .service(PayStatementItemServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
