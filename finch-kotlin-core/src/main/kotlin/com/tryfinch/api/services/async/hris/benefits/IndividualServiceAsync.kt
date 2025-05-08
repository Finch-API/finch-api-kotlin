// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.benefits

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import com.tryfinch.api.models.UnenrolledIndividualBenefitResponse

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Lists individuals currently enrolled in a given deduction. */
    suspend fun enrolledIds(
        benefitId: String,
        params: HrisBenefitIndividualEnrolledIdsParams =
            HrisBenefitIndividualEnrolledIdsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualEnrolledIdsResponse =
        enrolledIds(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [enrolledIds] */
    suspend fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualEnrolledIdsResponse

    /** @see [enrolledIds] */
    suspend fun enrolledIds(
        benefitId: String,
        requestOptions: RequestOptions,
    ): IndividualEnrolledIdsResponse =
        enrolledIds(benefitId, HrisBenefitIndividualEnrolledIdsParams.none(), requestOptions)

    /** Get enrollment information for the given individuals. */
    suspend fun retrieveManyBenefits(
        benefitId: String,
        params: HrisBenefitIndividualRetrieveManyBenefitsParams =
            HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitIndividualRetrieveManyBenefitsPageAsync =
        retrieveManyBenefits(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [retrieveManyBenefits] */
    suspend fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitIndividualRetrieveManyBenefitsPageAsync

    /** @see [retrieveManyBenefits] */
    suspend fun retrieveManyBenefits(
        benefitId: String,
        requestOptions: RequestOptions,
    ): HrisBenefitIndividualRetrieveManyBenefitsPageAsync =
        retrieveManyBenefits(
            benefitId,
            HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
            requestOptions,
        )

    /** Unenroll individuals from a deduction or contribution */
    suspend fun unenrollMany(
        benefitId: String,
        params: HrisBenefitIndividualUnenrollManyParams =
            HrisBenefitIndividualUnenrollManyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnenrolledIndividualBenefitResponse =
        unenrollMany(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see [unenrollMany] */
    suspend fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnenrolledIndividualBenefitResponse

    /** @see [unenrollMany] */
    suspend fun unenrollMany(
        benefitId: String,
        requestOptions: RequestOptions,
    ): UnenrolledIndividualBenefitResponse =
        unenrollMany(benefitId, HrisBenefitIndividualUnenrollManyParams.none(), requestOptions)

    /**
     * A view of [IndividualServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/enrolled`, but is
         * otherwise the same as [IndividualServiceAsync.enrolledIds].
         */
        @MustBeClosed
        suspend fun enrolledIds(
            benefitId: String,
            params: HrisBenefitIndividualEnrolledIdsParams =
                HrisBenefitIndividualEnrolledIdsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualEnrolledIdsResponse> =
            enrolledIds(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [enrolledIds] */
        @MustBeClosed
        suspend fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualEnrolledIdsResponse>

        /** @see [enrolledIds] */
        @MustBeClosed
        suspend fun enrolledIds(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndividualEnrolledIdsResponse> =
            enrolledIds(benefitId, HrisBenefitIndividualEnrolledIdsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/individuals`, but is
         * otherwise the same as [IndividualServiceAsync.retrieveManyBenefits].
         */
        @MustBeClosed
        suspend fun retrieveManyBenefits(
            benefitId: String,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams =
                HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> =
            retrieveManyBenefits(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [retrieveManyBenefits] */
        @MustBeClosed
        suspend fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync>

        /** @see [retrieveManyBenefits] */
        @MustBeClosed
        suspend fun retrieveManyBenefits(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPageAsync> =
            retrieveManyBenefits(
                benefitId,
                HrisBenefitIndividualRetrieveManyBenefitsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete /employer/benefits/{benefit_id}/individuals`, but
         * is otherwise the same as [IndividualServiceAsync.unenrollMany].
         */
        @MustBeClosed
        suspend fun unenrollMany(
            benefitId: String,
            params: HrisBenefitIndividualUnenrollManyParams =
                HrisBenefitIndividualUnenrollManyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse> =
            unenrollMany(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see [unenrollMany] */
        @MustBeClosed
        suspend fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse>

        /** @see [unenrollMany] */
        @MustBeClosed
        suspend fun unenrollMany(
            benefitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse> =
            unenrollMany(benefitId, HrisBenefitIndividualUnenrollManyParams.none(), requestOptions)
    }
}
