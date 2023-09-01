@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisIndividualRetrieveManyPageAsync
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams

interface IndividualServiceAsync {

    /** Read individual data, excluding income and employment data */
    suspend fun retrieveMany(
        params: HrisIndividualRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisIndividualRetrieveManyPageAsync
}
