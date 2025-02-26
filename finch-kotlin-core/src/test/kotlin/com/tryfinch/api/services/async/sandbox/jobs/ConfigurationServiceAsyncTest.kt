// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ConfigurationServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val configurationServiceAsync = client.sandbox().jobs().configuration()

        val sandboxJobConfigurations = configurationServiceAsync.retrieve()

        sandboxJobConfigurations.forEach { it.validate() }
    }

    @Test
    suspend fun update() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val configurationServiceAsync = client.sandbox().jobs().configuration()

        val sandboxJobConfiguration =
            configurationServiceAsync.update(
                SandboxJobConfigurationUpdateParams.builder()
                    .sandboxJobConfiguration(
                        SandboxJobConfiguration.builder()
                            .completionStatus(SandboxJobConfiguration.CompletionStatus.COMPLETE)
                            .type(SandboxJobConfiguration.Type.DATA_SYNC_ALL)
                            .build()
                    )
                    .build()
            )

        sandboxJobConfiguration.validate()
    }
}
