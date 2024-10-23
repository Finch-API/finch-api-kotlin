// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox.connections

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AccountCreateResponse
import com.tryfinch.api.models.AccountUpdateResponse
import com.tryfinch.api.models.SandboxConnectionAccountCreateParams
import com.tryfinch.api.models.SandboxConnectionAccountUpdateParams

interface AccountServiceAsync {

    /** Create a new account for an existing connection (company/provider pair) */
    suspend fun create(
        params: SandboxConnectionAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountCreateResponse

    /**
     * Update an existing sandbox account. Change the connection status to understand how the Finch
     * API responds.
     */
    suspend fun update(
        params: SandboxConnectionAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountUpdateResponse
}
