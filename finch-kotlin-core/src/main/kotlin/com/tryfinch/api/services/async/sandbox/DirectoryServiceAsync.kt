// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.SandboxDirectoryCreateParams

interface DirectoryServiceAsync {

    /** Add new individuals to a sandbox company */
    suspend fun create(
        params: SandboxDirectoryCreateParams = SandboxDirectoryCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<JsonValue>

    /** Add new individuals to a sandbox company */
    suspend fun create(requestOptions: RequestOptions): List<JsonValue> =
        create(SandboxDirectoryCreateParams.none(), requestOptions)
}
