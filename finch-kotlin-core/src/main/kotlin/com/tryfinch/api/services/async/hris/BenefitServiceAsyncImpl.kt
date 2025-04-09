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
import com.tryfinch.api.models.BenefitListSupportedBenefitsResponse
import com.tryfinch.api.models.CompanyBenefit
import com.tryfinch.api.models.CreateCompanyBenefitsResponse
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitListPageAsync
import com.tryfinch.api.models.HrisBenefitListParams
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HrisBenefitRetrieveParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import com.tryfinch.api.models.UpdateCompanyBenefitResponse
import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsync
import com.tryfinch.api.services.async.hris.benefits.IndividualServiceAsyncImpl

class BenefitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BenefitServiceAsync {

    private val withRawResponse: BenefitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val individuals: IndividualServiceAsync by lazy {
        IndividualServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): BenefitServiceAsync.WithRawResponse = withRawResponse

    override fun individuals(): IndividualServiceAsync = individuals

    override suspend fun create(
        params: HrisBenefitCreateParams,
        requestOptions: RequestOptions,
    ): CreateCompanyBenefitsResponse =
        // post /employer/benefits
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions,
    ): CompanyBenefit =
        // get /employer/benefits/{benefit_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions,
    ): UpdateCompanyBenefitResponse =
        // post /employer/benefits/{benefit_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: HrisBenefitListParams,
        requestOptions: RequestOptions,
    ): HrisBenefitListPageAsync =
        // get /employer/benefits
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions,
    ): HrisBenefitListSupportedBenefitsPageAsync =
        // get /employer/benefits/meta
        withRawResponse().listSupportedBenefits(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BenefitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val individuals: IndividualServiceAsync.WithRawResponse by lazy {
            IndividualServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun individuals(): IndividualServiceAsync.WithRawResponse = individuals

        private val createHandler: Handler<CreateCompanyBenefitsResponse> =
            jsonHandler<CreateCompanyBenefitsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: HrisBenefitCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateCompanyBenefitsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("employer", "benefits")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<CompanyBenefit> =
            jsonHandler<CompanyBenefit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: HrisBenefitRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyBenefit> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "benefits", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<UpdateCompanyBenefitResponse> =
            jsonHandler<UpdateCompanyBenefitResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: HrisBenefitUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UpdateCompanyBenefitResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("employer", "benefits", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<CompanyBenefit>> =
            jsonHandler<List<CompanyBenefit>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: HrisBenefitListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisBenefitListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "benefits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HrisBenefitListPageAsync.of(
                            BenefitServiceAsyncImpl(clientOptions),
                            params,
                            HrisBenefitListPageAsync.Response.builder().items(it).build(),
                        )
                    }
            }
        }

        private val listSupportedBenefitsHandler:
            Handler<List<BenefitListSupportedBenefitsResponse>> =
            jsonHandler<List<BenefitListSupportedBenefitsResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisBenefitListSupportedBenefitsPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "benefits", "meta")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listSupportedBenefitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it?.forEach { it.validate() }
                        }
                    }
                    .let {
                        HrisBenefitListSupportedBenefitsPageAsync.of(
                            BenefitServiceAsyncImpl(clientOptions),
                            params,
                            HrisBenefitListSupportedBenefitsPageAsync.Response.builder()
                                .items(it)
                                .build(),
                        )
                    }
            }
        }
    }
}
