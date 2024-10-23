// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.connect

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse

interface SessionService {

    /** Create a new connect session for an employer */
    fun new(
        params: ConnectSessionNewParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SessionNewResponse

    /** Create a new Connect session for reauthenticating an existing connection */
    fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SessionReauthenticateResponse
}
