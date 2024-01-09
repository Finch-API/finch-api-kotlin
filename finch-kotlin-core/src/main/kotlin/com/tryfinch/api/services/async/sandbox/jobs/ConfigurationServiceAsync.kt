// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.sandbox.jobs

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams

interface ConfigurationServiceAsync {

    /** Get configurations for sandbox jobs */
    suspend fun retrieve(
        params: SandboxJobConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<SandboxJobConfiguration>

    /** Update configurations for sandbox jobs */
    suspend fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SandboxJobConfiguration
}
