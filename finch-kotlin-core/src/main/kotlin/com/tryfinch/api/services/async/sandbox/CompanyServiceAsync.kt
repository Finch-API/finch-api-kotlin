// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.CompanyUpdateResponse
import com.tryfinch.api.models.SandboxCompanyUpdateParams

interface CompanyServiceAsync {

    /** Update a sandbox company's data */
    suspend fun update(
        params: SandboxCompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompanyUpdateResponse
}
