// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.EmploymentUpdateResponse
import com.tryfinch.api.models.SandboxEmploymentUpdateParams

interface EmploymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update sandbox employment */
    suspend fun update(
        individualId: String,
        params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmploymentUpdateResponse =
        update(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: SandboxEmploymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmploymentUpdateResponse

    /** @see [update] */
    suspend fun update(
        individualId: String,
        requestOptions: RequestOptions,
    ): EmploymentUpdateResponse =
        update(individualId, SandboxEmploymentUpdateParams.none(), requestOptions)

    /**
     * A view of [EmploymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /sandbox/employment/{individual_id}`, but is
         * otherwise the same as [EmploymentServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            individualId: String,
            params: SandboxEmploymentUpdateParams = SandboxEmploymentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmploymentUpdateResponse> =
            update(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: SandboxEmploymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmploymentUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            individualId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmploymentUpdateResponse> =
            update(individualId, SandboxEmploymentUpdateParams.none(), requestOptions)
    }
}
