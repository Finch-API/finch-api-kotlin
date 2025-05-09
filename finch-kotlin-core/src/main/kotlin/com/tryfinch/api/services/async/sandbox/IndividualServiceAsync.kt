// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.IndividualUpdateResponse
import com.tryfinch.api.models.SandboxIndividualUpdateParams

interface IndividualServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update sandbox individual */
    suspend fun update(
        params: SandboxIndividualUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndividualUpdateResponse

    /**
     * A view of [IndividualServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /sandbox/individual/{individual_id}`, but is
         * otherwise the same as [IndividualServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: SandboxIndividualUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndividualUpdateResponse>
    }
}
