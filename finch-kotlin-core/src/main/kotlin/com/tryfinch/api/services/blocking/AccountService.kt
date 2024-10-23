// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AccountDisconnectParams
import com.tryfinch.api.models.AccountIntrospectParams
import com.tryfinch.api.models.DisconnectResponse
import com.tryfinch.api.models.Introspection

interface AccountService {

    /** Disconnect one or more `access_token`s from your application. */
    fun disconnect(
        params: AccountDisconnectParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DisconnectResponse

    /** Read account information associated with an `access_token` */
    fun introspect(
        params: AccountIntrospectParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Introspection
}
