// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris.benefits

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyPageAsync
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse

interface IndividualServiceAsync {

    /** Lists individuals currently enrolled in a given deduction. */
    suspend fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IndividualEnrolledIdsResponse

    /** Get enrollment information for the given individuals. */
    suspend fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisBenefitIndividualRetrieveManyBenefitsPageAsync

    /** Unenroll individuals from a deduction or contribution */
    suspend fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisBenefitIndividualUnenrollManyPageAsync
}
