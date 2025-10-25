// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.benefits

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPage
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse
import com.tryfinch.api.models.UnenrolledIndividualBenefitResponse

interface IndividualService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IndividualService

    /** Lists individuals currently enrolled in a given deduction. */
    fun enrolledIds(
        benefitId: String,
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualEnrolledIdsResponse =
        enrolledIds(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see enrolledIds */
    fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualEnrolledIdsResponse

    /** Get enrollment information for the given individuals. */
    fun retrieveManyBenefits(
        benefitId: String,
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitIndividualRetrieveManyBenefitsPage =
        retrieveManyBenefits(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see retrieveManyBenefits */
    fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitIndividualRetrieveManyBenefitsPage

    /** Unenroll individuals from a deduction or contribution */
    fun unenrollMany(
        benefitId: String,
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnenrolledIndividualBenefitResponse =
        unenrollMany(params.toBuilder().benefitId(benefitId).build(), requestOptions)

    /** @see unenrollMany */
    fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UnenrolledIndividualBenefitResponse

    /** A view of [IndividualService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IndividualService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/enrolled`, but is
         * otherwise the same as [IndividualService.enrolledIds].
         */
        @MustBeClosed
        fun enrolledIds(
            benefitId: String,
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualEnrolledIdsResponse> =
            enrolledIds(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see enrolledIds */
        @MustBeClosed
        fun enrolledIds(
            params: HrisBenefitIndividualEnrolledIdsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualEnrolledIdsResponse>

        /**
         * Returns a raw HTTP response for `get /employer/benefits/{benefit_id}/individuals`, but is
         * otherwise the same as [IndividualService.retrieveManyBenefits].
         */
        @MustBeClosed
        fun retrieveManyBenefits(
            benefitId: String,
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage> =
            retrieveManyBenefits(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see retrieveManyBenefits */
        @MustBeClosed
        fun retrieveManyBenefits(
            params: HrisBenefitIndividualRetrieveManyBenefitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisBenefitIndividualRetrieveManyBenefitsPage>

        /**
         * Returns a raw HTTP response for `delete /employer/benefits/{benefit_id}/individuals`, but
         * is otherwise the same as [IndividualService.unenrollMany].
         */
        @MustBeClosed
        fun unenrollMany(
            benefitId: String,
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse> =
            unenrollMany(params.toBuilder().benefitId(benefitId).build(), requestOptions)

        /** @see unenrollMany */
        @MustBeClosed
        fun unenrollMany(
            params: HrisBenefitIndividualUnenrollManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UnenrolledIndividualBenefitResponse>
    }
}
