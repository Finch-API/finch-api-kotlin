// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.JobCreateResponse
import com.tryfinch.api.models.SandboxJobCreateParams
import com.tryfinch.api.services.async.sandbox.jobs.ConfigurationServiceAsync

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun configuration(): ConfigurationServiceAsync

    /** Enqueue a new sandbox job */
    suspend fun create(params: SandboxJobCreateParams, requestOptions: RequestOptions = RequestOptions.none()): JobCreateResponse

    /**
     * A view of [JobServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun configuration(): ConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/jobs`, but is otherwise the same
         * as [JobServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: SandboxJobCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<JobCreateResponse>
    }
}
