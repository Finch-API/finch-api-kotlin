// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisIndividualRetrieveManyPage
import com.tryfinch.api.models.HrisIndividualRetrieveManyParams

interface IndividualService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IndividualService

    /** Read individual data, excluding income and employment data */
    fun retrieveMany(
        params: HrisIndividualRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisIndividualRetrieveManyPage

    /** A view of [IndividualService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IndividualService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /employer/individual`, but is otherwise the same as
         * [IndividualService.retrieveMany].
         */
        @MustBeClosed
        fun retrieveMany(
            params: HrisIndividualRetrieveManyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HrisIndividualRetrieveManyPage>
    }
}
