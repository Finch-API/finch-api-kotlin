// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.CompanyUpdateResponse
import com.tryfinch.api.models.SandboxCompanyUpdateParams

interface CompanyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update a sandbox company's data */
    suspend fun update(
        params: SandboxCompanyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompanyUpdateResponse

    /**
     * A view of [CompanyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /sandbox/company`, but is otherwise the same as
         * [CompanyServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: SandboxCompanyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompanyUpdateResponse>
    }
}
