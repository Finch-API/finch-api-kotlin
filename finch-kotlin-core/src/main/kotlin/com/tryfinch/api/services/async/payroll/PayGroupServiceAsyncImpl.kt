// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.payroll

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
import com.tryfinch.api.models.PayGroupListResponse
import com.tryfinch.api.models.PayGroupRetrieveResponse
import com.tryfinch.api.models.PayrollPayGroupListPage
import com.tryfinch.api.models.PayrollPayGroupListPageAsync
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams

class PayGroupServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : PayGroupServiceAsync {

    private val withRawResponse: PayGroupServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): PayGroupServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(params: PayrollPayGroupRetrieveParams, requestOptions: RequestOptions): PayGroupRetrieveResponse =
        // get /employer/pay-groups/{pay_group_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(params: PayrollPayGroupListParams, requestOptions: RequestOptions): PayrollPayGroupListPageAsync =
        // get /employer/pay-groups
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : PayGroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<PayGroupRetrieveResponse> = jsonHandler<PayGroupRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(params: PayrollPayGroupRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<PayGroupRetrieveResponse> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("employer", "pay-groups", params.getPathParam(0))
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

        private val listHandler: Handler<List<PayGroupListResponse>> = jsonHandler<List<PayGroupListResponse>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(params: PayrollPayGroupListParams, requestOptions: RequestOptions): HttpResponseFor<PayrollPayGroupListPageAsync> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("employer", "pay-groups")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.executeAsync(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.forEach { it.validate() }
                  }
              }
              .let {
                  PayrollPayGroupListPageAsync.of(PayGroupServiceAsyncImpl(clientOptions), params, PayrollPayGroupListPageAsync.Response.builder()
                      .items(it)
                      .build())
              }
          }
        }
    }
}
