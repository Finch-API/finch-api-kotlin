// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ConnectionCreateResponse
import com.tryfinch.api.models.SandboxConnectionCreateParams
import com.tryfinch.api.services.async.sandbox.connections.AccountServiceAsync

interface ConnectionServiceAsync {

    fun accounts(): AccountServiceAsync

    /** Create a new connection (new company/provider pair) with a new account */
    suspend fun create(
        params: SandboxConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionCreateResponse
}
