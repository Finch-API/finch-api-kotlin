// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams
import com.tryfinch.api.models.HrisDirectoryListPageAsync
import com.tryfinch.api.models.HrisDirectoryListParams

interface DirectoryServiceAsync {

    /** Read company directory and organization structure */
    suspend fun list(
        params: HrisDirectoryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisDirectoryListPageAsync

    /** Read company directory and organization structure */
    @Deprecated("use `list` instead")
    suspend fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisDirectoryListIndividualsPageAsync
}
