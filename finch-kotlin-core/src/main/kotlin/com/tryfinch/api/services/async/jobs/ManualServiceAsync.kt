// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.JobManualRetrieveParams
import com.tryfinch.api.models.ManualAsyncJob

interface ManualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get a manual job by `job_id`. Manual jobs are completed by a human and include Assisted
     * Benefits jobs.
     */
    suspend fun retrieve(
        params: JobManualRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualAsyncJob

    /**
     * A view of [ManualServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /jobs/manual/{job_id}`, but is otherwise the same as
         * [ManualServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: JobManualRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualAsyncJob>
    }
}
