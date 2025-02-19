// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.JobCreateResponse
import com.tryfinch.api.models.SandboxJobCreateParams
import com.tryfinch.api.services.async.sandbox.jobs.ConfigurationServiceAsync

interface JobServiceAsync {

    fun configuration(): ConfigurationServiceAsync

    /** Enqueue a new sandbox job */
    suspend fun create(
        params: SandboxJobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobCreateResponse
}
