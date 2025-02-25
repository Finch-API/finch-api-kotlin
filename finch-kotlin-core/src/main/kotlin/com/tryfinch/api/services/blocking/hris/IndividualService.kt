// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisIndividualRetrieveManyPage
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams

interface IndividualService {

    /** Read individual data, excluding income and employment data */
    fun retrieveMany(
        params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisIndividualRetrieveManyPage

    /** Read individual data, excluding income and employment data */
    fun retrieveMany(requestOptions: RequestOptions): HrisIndividualRetrieveManyPage =
        retrieveMany(HrisIndividualRetrieveManyParams.none(), requestOptions)
}
