// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
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
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ManualServiceAsync

    /**
     * Get a manual job by `job_id`. Manual jobs are completed by a human and include Assisted
     * Benefits jobs.
     */
    suspend fun retrieve(
        jobId: String,
        params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualAsyncJob = retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: JobManualRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualAsyncJob

    /** @see [retrieve] */
    suspend fun retrieve(jobId: String, requestOptions: RequestOptions): ManualAsyncJob =
        retrieve(jobId, JobManualRetrieveParams.none(), requestOptions)

    /**
     * A view of [ManualServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ManualServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /jobs/manual/{job_id}`, but is otherwise the same as
         * [ManualServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            jobId: String,
            params: JobManualRetrieveParams = JobManualRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualAsyncJob> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: JobManualRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualAsyncJob>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManualAsyncJob> =
            retrieve(jobId, JobManualRetrieveParams.none(), requestOptions)
    }
}
