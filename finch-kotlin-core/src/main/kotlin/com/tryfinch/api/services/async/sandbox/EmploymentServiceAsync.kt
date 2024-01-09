// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.EmploymentUpdateResponse
import com.tryfinch.api.models.SandboxEmploymentUpdateParams

interface EmploymentServiceAsync {

    /** Update sandbox employment */
    suspend fun update(
        params: SandboxEmploymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EmploymentUpdateResponse
}
