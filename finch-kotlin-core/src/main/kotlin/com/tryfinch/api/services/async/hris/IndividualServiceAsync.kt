// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisIndividualRetrieveManyPageAsync
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams

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

    /** Read individual data, excluding income and employment data */
    suspend fun retrieveMany(
        params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisIndividualRetrieveManyPageAsync

    /** @see retrieveMany */
    suspend fun retrieveMany(requestOptions: RequestOptions): HrisIndividualRetrieveManyPageAsync =
        retrieveMany(HrisIndividualRetrieveManyParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /employer/individual`, but is otherwise the same as
         * [IndividualServiceAsync.retrieveMany].
         */
        @MustBeClosed
        suspend fun retrieveMany(
            params: HrisIndividualRetrieveManyParams = HrisIndividualRetrieveManyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisIndividualRetrieveManyPageAsync>

        /** @see retrieveMany */
        @MustBeClosed
        suspend fun retrieveMany(
            requestOptions: RequestOptions
        ): HttpResponseFor<HrisIndividualRetrieveManyPageAsync> =
            retrieveMany(HrisIndividualRetrieveManyParams.none(), requestOptions)
    }
}
