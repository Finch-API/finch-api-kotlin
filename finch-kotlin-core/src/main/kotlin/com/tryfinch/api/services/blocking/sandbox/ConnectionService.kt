// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ConnectionCreateResponse
import com.tryfinch.api.models.SandboxConnectionCreateParams
import com.tryfinch.api.services.blocking.sandbox.connections.AccountService

interface ConnectionService {

    fun accounts(): AccountService

    /** Create a new connection (new company/provider pair) with a new account */
    fun create(
        params: SandboxConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionCreateResponse
}
