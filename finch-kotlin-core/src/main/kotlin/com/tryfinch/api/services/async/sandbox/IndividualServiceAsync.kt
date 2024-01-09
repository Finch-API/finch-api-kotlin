// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.IndividualUpdateResponse
import com.tryfinch.api.models.SandboxIndividualUpdateParams

interface IndividualServiceAsync {

    /** Update sandbox individual */
    suspend fun update(
        params: SandboxIndividualUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IndividualUpdateResponse
}
