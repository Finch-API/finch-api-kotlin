// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisIndividualRetrieveManyPageAsync
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams

interface IndividualServiceAsync {

    /** Read individual data, excluding income and employment data */
    suspend fun retrieveMany(
        params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisIndividualRetrieveManyPageAsync

    /** Read individual data, excluding income and employment data */
    suspend fun retrieveMany(requestOptions: RequestOptions): HrisIndividualRetrieveManyPageAsync =
        retrieveMany(HrisIndividualRetrieveManyParams.none(), requestOptions)
}
