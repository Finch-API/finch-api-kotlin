// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.company

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
import com.tryfinch.api.models.HrisCompanyPayStatementItemListPageAsync
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

    override fun rules(): RuleServiceAsync = rules

    override suspend fun list(
        params: HrisCompanyPayStatementItemListParams,
        requestOptions: RequestOptions,
    ): HrisCompanyPayStatementItemListPageAsync =
        // get /employer/pay-statement-item
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayStatementItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val rules: RuleServiceAsync.WithRawResponse by lazy {
            RuleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun rules(): RuleServiceAsync.WithRawResponse = rules

        private val listHandler: Handler<HrisCompanyPayStatementItemListPageAsync.Response> =
            jsonHandler<HrisCompanyPayStatementItemListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: HrisCompanyPayStatementItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisCompanyPayStatementItemListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "pay-statement-item")
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
                        HrisCompanyPayStatementItemListPageAsync.of(
                            PayStatementItemServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
