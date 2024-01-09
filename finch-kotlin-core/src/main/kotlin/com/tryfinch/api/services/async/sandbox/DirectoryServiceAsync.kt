// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.sandbox

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.SandboxDirectoryCreateParams

interface DirectoryServiceAsync {

    /** Add new individuals to a sandbox company */
    suspend fun create(
        params: SandboxDirectoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<JsonValue>
}
