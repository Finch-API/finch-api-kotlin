// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.EmploymentUpdateResponse
import com.tryfinch.api.models.SandboxEmploymentUpdateParams

interface EmploymentService {

    /** Update sandbox employment */
    fun update(
        params: SandboxEmploymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmploymentUpdateResponse
}
