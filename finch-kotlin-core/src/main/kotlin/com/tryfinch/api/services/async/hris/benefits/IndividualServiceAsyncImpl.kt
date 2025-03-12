// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.benefits

import com.tryfinch.api.core.ClientOptions
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
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualBenefit
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import com.tryfinch.api.models.UnenrolledIndividual

class IndividualServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IndividualServiceAsync {

    private val withRawResponse: IndividualServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IndividualServiceAsync.WithRawResponse = withRawResponse

    override suspend fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions,
    ): IndividualEnrolledIdsResponse =
        // get /employer/benefits/{benefit_id}/enrolled
        withRawResponse().enrolledIds(params, requestOptions).parse()

    override suspend fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions,
    ): HrisBenefitIndividualRetrieveManyBenefitsPageAsync =
        // get /employer/benefits/{benefit_id}/individuals
        withRawResponse().retrieveManyBenefits(params, requestOptions).parse()

    override suspend fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions,
    ): HrisBenefitIndividualUnenrollManyPageAsync =
        // delete /employer/benefits/{benefit_id}/individuals
        withRawResponse().unenrollMany(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndividualServiceAsync.WithRawResponse {

        private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

        private val enrolledIdsHandler: Handler<IndividualEnrolledIdsResponse> =
            jsonHandler<IndividualEnrolledIdsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndividualEnrolledIdsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "benefits", params.getPathParam(0), "enrolled")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { enrolledIdsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveManyBenefitsHandler: Handler<List<IndividualBenefit>> =
            jsonHandler<List<IndividualBenefit>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("employer", "benefits", params.getPathParam(0), "individuals")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveManyBenefitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HrisBenefitIndividualRetrieveManyBenefitsPageAsync.of(
                            IndividualServiceAsyncImpl(clientOptions),
                            params,
                            HrisBenefitIndividualRetrieveManyBenefitsPageAsync.Response.builder()
                                .items(it)
                                .build(),
                        )
                    }
            }
        }

        private val unenrollManyHandler: Handler<List<UnenrolledIndividual>> =
            jsonHandler<List<UnenrolledIndividual>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisBenefitIndividualUnenrollManyPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("employer", "benefits", params.getPathParam(0), "individuals")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { unenrollManyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HrisBenefitIndividualUnenrollManyPageAsync.of(
                            IndividualServiceAsyncImpl(clientOptions),
                            params,
                            HrisBenefitIndividualUnenrollManyPageAsync.Response.builder()
                                .items(it)
                                .build(),
                        )
                    }
            }
        }
    }
}
