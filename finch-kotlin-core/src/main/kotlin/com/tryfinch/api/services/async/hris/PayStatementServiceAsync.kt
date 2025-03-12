// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisPayStatementRetrieveManyPageAsync
import com.tryfinch.api.models.HrisPayStatementRetrieveManyParams

interface PayStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that
     * supports Benefits.
     */
    suspend fun retrieveMany(params: HrisPayStatementRetrieveManyParams, requestOptions: RequestOptions = RequestOptions.none()): HrisPayStatementRetrieveManyPageAsync

    /**
     * A view of [PayStatementServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /employer/pay-statement`, but is otherwise
         * the same as [PayStatementServiceAsync.retrieveMany].
         */
        @MustBeClosed
        suspend fun retrieveMany(params: HrisPayStatementRetrieveManyParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HrisPayStatementRetrieveManyPageAsync>
    }
}
