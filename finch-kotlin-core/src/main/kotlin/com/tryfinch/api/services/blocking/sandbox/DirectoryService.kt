// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.SandboxDirectoryCreateParams

interface DirectoryService {

    /** Add new individuals to a sandbox company */
    fun create(
        params: SandboxDirectoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<JsonValue>
}
