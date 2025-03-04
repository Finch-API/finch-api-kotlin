// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.ProviderListPageAsync
import com.tryfinch.api.models.ProviderListParams

interface ProviderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Return details on all available payroll and HR systems. */
    suspend fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderListPageAsync

    /** Return details on all available payroll and HR systems. */
    suspend fun list(requestOptions: RequestOptions): ProviderListPageAsync =
        list(ProviderListParams.none(), requestOptions)

    /**
     * A view of [ProviderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /providers`, but is otherwise the same as
         * [ProviderServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ProviderListParams = ProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProviderListPageAsync>

        /**
         * Returns a raw HTTP response for `get /providers`, but is otherwise the same as
         * [ProviderServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ProviderListPageAsync> =
            list(ProviderListParams.none(), requestOptions)
    }
}
