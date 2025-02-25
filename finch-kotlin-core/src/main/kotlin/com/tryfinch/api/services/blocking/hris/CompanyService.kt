// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams

interface CompanyService {

    /** Read basic company data */
    fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** Read basic company data */
    fun retrieve(requestOptions: RequestOptions): Company =
        retrieve(HrisCompanyRetrieveParams.none(), requestOptions)
}
