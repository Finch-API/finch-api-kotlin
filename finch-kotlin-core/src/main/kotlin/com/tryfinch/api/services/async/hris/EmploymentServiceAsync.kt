// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisEmploymentRetrieveManyPageAsync
import com.tryfinch.api.models.HrisEmploymentRetrieveManyParams

interface EmploymentServiceAsync {

    /** Read individual employment and income data */
    suspend fun retrieveMany(
        params: HrisEmploymentRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisEmploymentRetrieveManyPageAsync
}
