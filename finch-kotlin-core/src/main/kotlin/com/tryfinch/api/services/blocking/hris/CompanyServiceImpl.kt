// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

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
import com.tryfinch.api.core.prepare
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams
import com.tryfinch.api.services.blocking.hris.company.PayStatementItemService
import com.tryfinch.api.services.blocking.hris.company.PayStatementItemServiceImpl

class CompanyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CompanyService {

    private val withRawResponse: CompanyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val payStatementItem: PayStatementItemService by lazy {
        PayStatementItemServiceImpl(clientOptions)
    }

    override fun withRawResponse(): CompanyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompanyService =
        CompanyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun payStatementItem(): PayStatementItemService = payStatementItem

    override fun retrieve(
        params: HrisCompanyRetrieveParams,
        requestOptions: RequestOptions,
    ): Company =
        // get /employer/company
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompanyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val payStatementItem: PayStatementItemService.WithRawResponse by lazy {
            PayStatementItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CompanyService.WithRawResponse =
            CompanyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun payStatementItem(): PayStatementItemService.WithRawResponse = payStatementItem

        private val retrieveHandler: Handler<Company> =
            jsonHandler<Company>(clientOptions.jsonMapper)

        override fun retrieve(
            params: HrisCompanyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Company> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "company")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
    }
}
