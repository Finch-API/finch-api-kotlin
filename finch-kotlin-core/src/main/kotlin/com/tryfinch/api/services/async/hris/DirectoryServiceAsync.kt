// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPageAsync
import com.tryfinch.api.models.HrisDirectoryListParams

interface DirectoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read company directory and organization structure */
    suspend fun list(params: HrisDirectoryListParams = HrisDirectoryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HrisDirectoryListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): HrisDirectoryListPageAsync = list(HrisDirectoryListParams.none(), requestOptions)

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    suspend fun listIndividuals(params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HrisDirectoryListIndividualsPageAsync

    /** @see [listIndividuals] */
    @Deprecated("use `list` instead")
    suspend fun listIndividuals(requestOptions: RequestOptions): HrisDirectoryListIndividualsPageAsync = listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)

    /**
     * A view of [DirectoryServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the
         * same as [DirectoryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: HrisDirectoryListParams = HrisDirectoryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HrisDirectoryListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<HrisDirectoryListPageAsync> = list(HrisDirectoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/directory`, but is otherwise the
         * same as [DirectoryServiceAsync.listIndividuals].
         */
        @Deprecated("use `list` instead")
        @MustBeClosed
        suspend fun listIndividuals(params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<HrisDirectoryListIndividualsPageAsync>

        /** @see [listIndividuals] */
        @Deprecated("use `list` instead")
        @MustBeClosed
        suspend fun listIndividuals(requestOptions: RequestOptions): HttpResponseFor<HrisDirectoryListIndividualsPageAsync> = listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)
    }
}
