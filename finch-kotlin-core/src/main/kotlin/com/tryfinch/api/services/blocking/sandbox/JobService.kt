// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.JobCreateResponse
import com.tryfinch.api.models.SandboxJobCreateParams
import com.tryfinch.api.services.blocking.sandbox.jobs.ConfigurationService

interface JobService {

    fun configuration(): ConfigurationService

    /** Enqueue a new sandbox job */
    fun create(
        params: SandboxJobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): JobCreateResponse
}
