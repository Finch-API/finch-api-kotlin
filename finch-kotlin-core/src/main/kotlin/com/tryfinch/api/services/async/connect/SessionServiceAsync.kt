// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.connect

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import com.tryfinch.api.models.SessionNewResponse
import com.tryfinch.api.models.SessionReauthenticateResponse

interface SessionServiceAsync {

    /** Create a new connect session for an employer */
    suspend fun new(
        params: ConnectSessionNewParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SessionNewResponse

    /** Create a new Connect session for reauthenticating an existing connection */
    suspend fun reauthenticate(
        params: ConnectSessionReauthenticateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SessionReauthenticateResponse
}
