// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams

interface CompanyServiceAsync {

    /** Read basic company data */
    suspend fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** Read basic company data */
    suspend fun retrieve(requestOptions: RequestOptions): Company =
        retrieve(HrisCompanyRetrieveParams.none(), requestOptions)
}
