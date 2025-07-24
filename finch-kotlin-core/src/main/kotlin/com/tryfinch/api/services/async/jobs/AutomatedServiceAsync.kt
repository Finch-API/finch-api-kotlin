// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.AutomatedAsyncJob
import com.tryfinch.api.models.AutomatedCreateResponse
import com.tryfinch.api.models.AutomatedListResponse
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams

interface AutomatedServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AutomatedServiceAsync

    /**
     * Enqueue an automated job.
     *
     * `data_sync_all`: Enqueue a job to re-sync all data for a connection. `data_sync_all` has a
     * concurrency limit of 1 job at a time per connection. This means that if this endpoint is
     * called while a job is already in progress for this connection, Finch will return the `job_id`
     * of the job that is currently in progress. Finch allows a fixed window rate limit of 1 forced
     * refresh per hour per connection.
     *
     * `w4_form_employee_sync`: Enqueues a job for sync W-4 data for a particular individual,
     * identified by `individual_id`. This feature is currently in beta.
     *
     * This endpoint is available for _Scale_ tier customers as an add-on. To request access to this
     * endpoint, please contact your Finch account manager.
     */
    suspend fun create(
        params: JobAutomatedCreateParams = JobAutomatedCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomatedCreateResponse

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): AutomatedCreateResponse =
        create(JobAutomatedCreateParams.none(), requestOptions)

    /** Get an automated job by `job_id`. */
    suspend fun retrieve(
        jobId: String,
        params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomatedAsyncJob = retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: JobAutomatedRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomatedAsyncJob

    /** @see retrieve */
    suspend fun retrieve(jobId: String, requestOptions: RequestOptions): AutomatedAsyncJob =
        retrieve(jobId, JobAutomatedRetrieveParams.none(), requestOptions)

    /**
     * Get all automated jobs. Automated jobs are completed by a machine. By default, jobs are
     * sorted in descending order by submission time. For scheduled jobs such as data syncs, only
     * the next scheduled job is shown.
     */
    suspend fun list(
        params: JobAutomatedListParams = JobAutomatedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomatedListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AutomatedListResponse =
        list(JobAutomatedListParams.none(), requestOptions)

    /**
     * A view of [AutomatedServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AutomatedServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /jobs/automated`, but is otherwise the same as
         * [AutomatedServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: JobAutomatedCreateParams = JobAutomatedCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomatedCreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<AutomatedCreateResponse> =
            create(JobAutomatedCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /jobs/automated/{job_id}`, but is otherwise the same
         * as [AutomatedServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            jobId: String,
            params: JobAutomatedRetrieveParams = JobAutomatedRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomatedAsyncJob> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: JobAutomatedRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomatedAsyncJob>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutomatedAsyncJob> =
            retrieve(jobId, JobAutomatedRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /jobs/automated`, but is otherwise the same as
         * [AutomatedServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: JobAutomatedListParams = JobAutomatedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomatedListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AutomatedListResponse> =
            list(JobAutomatedListParams.none(), requestOptions)
    }
}
