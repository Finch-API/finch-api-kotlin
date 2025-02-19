// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris.benefits

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisBenefitIndividualEnrolledIdsParams
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsPage
import com.tryfinch.api.models.HrisBenefitIndividualRetrieveManyBenefitsParams
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyPage
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import com.tryfinch.api.models.IndividualEnrolledIdsResponse

interface IndividualService {

    /** Lists individuals currently enrolled in a given deduction. */
    fun enrolledIds(
        params: HrisBenefitIndividualEnrolledIdsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualEnrolledIdsResponse

    /** Get enrollment information for the given individuals. */
    fun retrieveManyBenefits(
        params: HrisBenefitIndividualRetrieveManyBenefitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitIndividualRetrieveManyBenefitsPage

    /** Unenroll individuals from a deduction or contribution */
    fun unenrollMany(
        params: HrisBenefitIndividualUnenrollManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisBenefitIndividualUnenrollManyPage
}
