// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

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
import com.tryfinch.api.core.prepareAsync
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams

class CompanyServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CompanyServiceAsync {

    private val withRawResponse: CompanyServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): CompanyServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(params: HrisCompanyRetrieveParams, requestOptions: RequestOptions): Company =
        // get /employer/company
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CompanyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Company> = jsonHandler<Company>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(params: HrisCompanyRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<Company> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("employer", "company")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.executeAsync(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
