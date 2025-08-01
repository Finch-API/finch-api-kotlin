// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
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

interface BenefitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BenefitServiceAsync

    fun individuals(): IndividualServiceAsync

    /**
     * Creates a new company-wide deduction or contribution. Please use the `/providers` endpoint to
     * view available types for each provider.
     */
    suspend fun create(
        params: HrisBenefitCreateParams = HrisBenefitCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateCompanyBenefitsResponse

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): CreateCompanyBenefitsResponse =
        create(HrisBenefitCreateParams.none(), requestOptions)

    /** Lists deductions and contributions information for a given item */
    suspend fun retrieve(
        benefitId: String,
        params: HrisBenefitRetrieveParams = HrisBenefitRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyBenefit = retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: HrisBenefitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyBenefit

    /** @see retrieve */
    suspend fun retrieve(benefitId: String, requestOptions: RequestOptions): CompanyBenefit =
        retrieve(benefitId, HrisBenefitRetrieveParams.none(), requestOptions)

    /** Updates an existing company-wide deduction or contribution */
    suspend fun update(
        benefitId: String,
        params: HrisBenefitUpdateParams = HrisBenefitUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateCompanyBenefitResponse =
        update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: HrisBenefitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateCompanyBenefitResponse

    /** @see update */
    suspend fun update(
        benefitId: String,
        requestOptions: RequestOptions,
    ): UpdateCompanyBenefitResponse =
        update(benefitId, HrisBenefitUpdateParams.none(), requestOptions)

    /** List all company-wide deductions and contributions. */
    suspend fun list(
        params: HrisBenefitListParams = HrisBenefitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): HrisBenefitListPageAsync =
        list(HrisBenefitListParams.none(), requestOptions)

    /** Get deductions metadata */
    suspend fun listSupportedBenefits(
        params: HrisBenefitListSupportedBenefitsParams =
            HrisBenefitListSupportedBenefitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitListSupportedBenefitsPageAsync

    /** @see listSupportedBenefits */
    suspend fun listSupportedBenefits(
        requestOptions: RequestOptions
    ): HrisBenefitListSupportedBenefitsPageAsync =
        listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none(), requestOptions)

    /**
     * A view of [BenefitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BenefitServiceAsync.WithRawResponse

        fun individuals(): IndividualServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/benefits`, but is otherwise the same as
         * [BenefitServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: HrisBenefitCreateParams = HrisBenefitCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateCompanyBenefitsResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<CreateCompanyBenefitsResponse> =
            create(HrisBenefitCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            benefitId: String,
            params: HrisBenefitRetrieveParams = HrisBenefitRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyBenefit> =
            retrieve(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: HrisBenefitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyBenefit>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompanyBenefit> =
            retrieve(benefitId, HrisBenefitRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /employer/benefits/{benefit_id}`, but is otherwise
         * the same as [BenefitServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            benefitId: String,
            params: HrisBenefitUpdateParams = HrisBenefitUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateCompanyBenefitResponse> =
            update(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: HrisBenefitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateCompanyBenefitResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UpdateCompanyBenefitResponse> =
            update(benefitId, HrisBenefitUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits`, but is otherwise the same as
         * [BenefitServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: HrisBenefitListParams = HrisBenefitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisBenefitListPageAsync> =
            list(HrisBenefitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/meta`, but is otherwise the same
         * as [BenefitServiceAsync.listSupportedBenefits].
         */
        @MustBeClosed
        suspend fun listSupportedBenefits(
            params: HrisBenefitListSupportedBenefitsParams =
                HrisBenefitListSupportedBenefitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitListSupportedBenefitsPageAsync>

        /** @see listSupportedBenefits */
        @MustBeClosed
        suspend fun listSupportedBenefits(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisBenefitListSupportedBenefitsPageAsync> =
            listSupportedBenefits(HrisBenefitListSupportedBenefitsParams.none(), requestOptions)
    }
}
