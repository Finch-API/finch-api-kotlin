// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AutomatedAsyncJob
import com.tryfinch.api.models.AutomatedCreateResponse
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListPageAsync
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams

interface AutomatedServiceAsync {

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
    suspend fun create(requestOptions: RequestOptions): AutomatedCreateResponse =
        create(JobAutomatedCreateParams.none(), requestOptions)

    /** Get an automated job by `job_id`. */
    suspend fun retrieve(
        params: JobAutomatedRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomatedAsyncJob

    /**
     * Get all automated jobs. Automated jobs are completed by a machine. By default, jobs are
     * sorted in descending order by submission time. For scheduled jobs such as data syncs, only
     * the next scheduled job is shown.
     */
    suspend fun list(
        params: JobAutomatedListParams = JobAutomatedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobAutomatedListPageAsync

    /**
     * Get all automated jobs. Automated jobs are completed by a machine. By default, jobs are
     * sorted in descending order by submission time. For scheduled jobs such as data syncs, only
     * the next scheduled job is shown.
     */
    suspend fun list(requestOptions: RequestOptions): JobAutomatedListPageAsync =
        list(JobAutomatedListParams.none(), requestOptions)
}
