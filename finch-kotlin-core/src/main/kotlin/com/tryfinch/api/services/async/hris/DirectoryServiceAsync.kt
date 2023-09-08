@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisDirectoryListIndividualsPageAsync
import com.tryfinch.api.models.HrisDirectoryListIndividualsParams

interface DirectoryServiceAsync {

    /** Read company directory and organization structure */
    suspend fun listIndividuals(
        params: HrisDirectoryListIndividualsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisDirectoryListIndividualsPageAsync
}
