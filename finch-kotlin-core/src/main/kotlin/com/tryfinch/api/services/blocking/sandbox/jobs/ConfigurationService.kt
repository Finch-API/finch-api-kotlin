// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.jobs

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams

interface ConfigurationService {

    /** Get configurations for sandbox jobs */
    fun retrieve(
        params: SandboxJobConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<SandboxJobConfiguration>

    /** Update configurations for sandbox jobs */
    fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SandboxJobConfiguration
}
