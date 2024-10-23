// File generated from our OpenAPI spec by Stainless.

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
