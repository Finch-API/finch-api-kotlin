// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.handlers.withErrorHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.json
import com.tryfinch.api.core.prepare
import com.tryfinch.api.errors.FinchError
import com.tryfinch.api.models.CompanyBenefit
import com.tryfinch.api.models.CreateCompanyBenefitsResponse
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitListPage
import com.tryfinch.api.models.HrisBenefitListParams
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsPage
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HrisBenefitRetrieveParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import com.tryfinch.api.models.SupportedBenefit
import com.tryfinch.api.models.UpdateCompanyBenefitResponse
import com.tryfinch.api.services.blocking.hris.benefits.IndividualService
import com.tryfinch.api.services.blocking.hris.benefits.IndividualServiceImpl

class BenefitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BenefitService {

    private val errorHandler: Handler<FinchError> = errorHandler(clientOptions.jsonMapper)

    private val individuals: IndividualService by lazy { IndividualServiceImpl(clientOptions) }

    override fun individuals(): IndividualService = individuals

    private val createHandler: Handler<CreateCompanyBenefitsResponse> =
        jsonHandler<CreateCompanyBenefitsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    override fun create(
        params: HrisBenefitCreateParams,
        requestOptions: RequestOptions,
    ): CreateCompanyBenefitsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "benefits")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<CompanyBenefit> =
        jsonHandler<CompanyBenefit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Lists deductions and contributions information for a given item */
    override fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions,
    ): CompanyBenefit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<UpdateCompanyBenefitResponse> =
        jsonHandler<UpdateCompanyBenefitResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Updates an existing company-wide deduction or contribution */
    override fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions,
    ): UpdateCompanyBenefitResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("employer", "benefits", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<List<CompanyBenefit>> =
        jsonHandler<List<CompanyBenefit>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all company-wide deductions and contributions. */
    override fun list(
        params: HrisBenefitListParams,
        requestOptions: RequestOptions,
    ): HrisBenefitListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.forEach { it.validate() }
                }
            }
            .let {
                HrisBenefitListPage.of(
                    this,
                    params,
                    HrisBenefitListPage.Response.builder().items(it).build(),
                )
            }
    }

    private val listSupportedBenefitsHandler: Handler<List<SupportedBenefit>> =
        jsonHandler<List<SupportedBenefit>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get deductions metadata */
    override fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams,
        requestOptions: RequestOptions,
    ): HrisBenefitListSupportedBenefitsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("employer", "benefits", "meta")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listSupportedBenefitsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.forEach { it.validate() }
                }
            }
            .let {
                HrisBenefitListSupportedBenefitsPage.of(
                    this,
                    params,
                    HrisBenefitListSupportedBenefitsPage.Response.builder().items(it).build(),
                )
            }
    }
}
