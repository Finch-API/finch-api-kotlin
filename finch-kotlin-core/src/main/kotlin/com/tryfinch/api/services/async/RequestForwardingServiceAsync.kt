@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.RequestForwardingForwardParams
import com.tryfinch.api.models.RequestForwardingForwardResponse

interface RequestForwardingServiceAsync {

    /** The Forward API allows you to make direct requests to an employment system. */
    suspend fun forward(
        params: RequestForwardingForwardParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RequestForwardingForwardResponse
}
