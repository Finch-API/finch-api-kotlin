// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.IndividualUpdateResponse
import com.tryfinch.api.models.SandboxIndividualUpdateParams

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IndividualServiceAsync

    /** Update sandbox individual */
    suspend fun update(
        individualId: String,
        params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualUpdateResponse =
        update(params.toBuilder().individualId(individualId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: SandboxIndividualUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualUpdateResponse

    /** @see update */
    suspend fun update(
        individualId: String,
        requestOptions: RequestOptions,
    ): IndividualUpdateResponse =
        update(individualId, SandboxIndividualUpdateParams.none(), requestOptions)

    /**
     * A view of [IndividualServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IndividualServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /sandbox/individual/{individual_id}`, but is
         * otherwise the same as [IndividualServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            individualId: String,
            params: SandboxIndividualUpdateParams = SandboxIndividualUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualUpdateResponse> =
            update(params.toBuilder().individualId(individualId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: SandboxIndividualUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualUpdateResponse>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            individualId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndividualUpdateResponse> =
            update(individualId, SandboxIndividualUpdateParams.none(), requestOptions)
    }
}
