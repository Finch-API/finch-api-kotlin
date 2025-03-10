// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.Company
import com.tryfinch.api.models.HrisCompanyRetrieveParams

interface CompanyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read basic company data */
    suspend fun retrieve(
        params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Company

    /** @see [retrieve] */
    suspend fun retrieve(requestOptions: RequestOptions): Company =
        retrieve(HrisCompanyRetrieveParams.none(), requestOptions)

    /**
     * A view of [CompanyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/company`, but is otherwise the same as
         * [CompanyServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: HrisCompanyRetrieveParams = HrisCompanyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Company>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(requestOptions: RequestOptions): HttpResponseFor<Company> =
            retrieve(HrisCompanyRetrieveParams.none(), requestOptions)
    }
}
