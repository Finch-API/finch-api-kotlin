// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.CompanyBenefit
import com.tryfinch.api.models.CreateCompanyBenefitsResponse
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitListPage
import com.tryfinch.api.models.HrisBenefitListParams
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsPage
import com.tryfinch.api.models.HrisBenefitListSupportedBenefitsParams
import com.tryfinch.api.models.HrisBenefitRetrieveParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import com.tryfinch.api.models.UpdateCompanyBenefitResponse
import com.tryfinch.api.services.blocking.hris.benefits.IndividualService

interface BenefitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BenefitService

    fun individuals(): IndividualService

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    fun create(
        params: HrisBenefitCreateParams = HrisBenefitCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateCompanyBenefitsResponse

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CreateCompanyBenefitsResponse =
        create(HrisBenefitCreateParams.none(), requestOptions)

    /** Lists deductions and contributions information for a given item */
    fun retrieve(
        benefitId: String,
        params: HrisBenefitRetrieveParams = HrisBenefitRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyBenefit = retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyBenefit

    /** @see [retrieve] */
    fun retrieve(benefitId: String, requestOptions: RequestOptions): CompanyBenefit =
        retrieve(benefitId, HrisBenefitRetrieveParams.none(), requestOptions)

    /** Updates an existing company-wide deduction or contribution */
    fun update(
        benefitId: String,
        params: HrisBenefitUpdateParams = HrisBenefitUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateCompanyBenefitResponse =
        update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateCompanyBenefitResponse

    /** @see [update] */
    fun update(benefitId: String, requestOptions: RequestOptions): UpdateCompanyBenefitResponse =
        update(benefitId, HrisBenefitUpdateParams.none(), requestOptions)

    /** List all company-wide deductions and contributions. */
    fun list(
        params: HrisBenefitListParams = HrisBenefitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): HrisBenefitListPage =
        list(HrisBenefitListParams.none(), requestOptions)

    /** Get deductions metadata */
    fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams =
            HrisBenefitListSupportedBenefitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListSupportedBenefitsPage

    /** @see [listSupportedBenefits] */
    fun listSupportedBenefits(
        requestOptions: RequestOptions
    ): HrisBenefitListSupportedBenefitsPage =
        listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none(), requestOptions)

    /** A view of [BenefitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BenefitService.WithRawResponse

        fun individuals(): IndividualService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/benefits`, but is otherwise the same as
         * [BenefitService.create].
         */
        @MustBeClosed
        fun create(
            params: HrisBenefitCreateParams = HrisBenefitCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateCompanyBenefitsResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<CreateCompanyBenefitsResponse> =
            create(HrisBenefitCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            benefitId: String,
            params: HrisBenefitRetrieveParams = HrisBenefitRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyBenefit> =
            retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: HrisBenefitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyBenefit>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyBenefit> =
            retrieve(benefitId, HrisBenefitRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitService.update].
         */
        @MustBeClosed
        fun update(
            benefitId: String,
            params: HrisBenefitUpdateParams = HrisBenefitUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateCompanyBenefitResponse> =
            update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: HrisBenefitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateCompanyBenefitResponse>

        /** @see [update] */
        @MustBeClosed
        fun update(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UpdateCompanyBenefitResponse> =
            update(benefitId, HrisBenefitUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits`, but is otherwise the same as
         * [BenefitService.list].
         */
        @MustBeClosed
        fun list(
            params: HrisBenefitListParams = HrisBenefitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HrisBenefitListPage> =
            list(HrisBenefitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/meta`, but is otherwise the same
         * as [BenefitService.listSupportedBenefits].
         */
        @MustBeClosed
        fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams =
                HrisBenefitListSupportedBenefitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitListSupportedBenefitsPage>

        /** @see [listSupportedBenefits] */
        @MustBeClosed
        fun listSupportedBenefits(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisBenefitListSupportedBenefitsPage> =
            listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none(), requestOptions)
    }
}
