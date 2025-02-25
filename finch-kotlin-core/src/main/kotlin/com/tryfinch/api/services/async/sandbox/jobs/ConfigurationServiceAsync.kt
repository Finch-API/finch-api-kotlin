// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox.jobs

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams

interface ConfigurationServiceAsync {

    /** Get configurations for sandbox jobs */
    suspend fun retrieve(
        params: SandboxJobConfigurationRetrieveParams =
            SandboxJobConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SandboxJobConfiguration>

    /** Get configurations for sandbox jobs */
    suspend fun retrieve(requestOptions: RequestOptions): List<SandboxJobConfiguration> =
        retrieve(SandboxJobConfigurationRetrieveParams.none(), requestOptions)

    /** Update configurations for sandbox jobs */
    suspend fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxJobConfiguration
}
