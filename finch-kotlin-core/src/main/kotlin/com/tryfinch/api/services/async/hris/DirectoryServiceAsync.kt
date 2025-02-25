// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPageAsync
import com.tryfinch.api.models.HrisDirectoryListParams

interface DirectoryServiceAsync {

    /** Read company directory and organization structure */
    suspend fun list(
        params: HrisDirectoryListParams = HrisDirectoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListPageAsync

    /** Read company directory and organization structure */
    suspend fun list(requestOptions: RequestOptions): HrisDirectoryListPageAsync =
        list(HrisDirectoryListParams.none(), requestOptions)

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    suspend fun listIndividuals(
        params: HrisDirectoryListIndividualsParams = HrisDirectoryListIndividualsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisDirectoryListIndividualsPageAsync

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    suspend fun listIndividuals(
        requestOptions: RequestOptions
    ): HrisDirectoryListIndividualsPageAsync =
        listIndividuals(HrisDirectoryListIndividualsParams.none(), requestOptions)
}
