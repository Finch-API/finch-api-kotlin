@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.Application
import com.tryfinch.api.models.AtsApplicationListPageAsync
import com.tryfinch.api.models.AtsApplicationListParams
import com.tryfinch.api.models.AtsApplicationRetrieveParams

interface ApplicationServiceAsync {

    /** Gets an application from an organization. */
    suspend fun retrieve(
        params: AtsApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Application

    /** Gets all of an organization's applications. */
    suspend fun list(
        params: AtsApplicationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AtsApplicationListPageAsync
}
