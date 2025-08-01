// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.SandboxConnectionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConnectionServiceTest {

    @Disabled("prism tests are broken")
    @Test
    fun create() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val connectionService = client.sandbox().connections()

        val connection =
            connectionService.create(
                SandboxConnectionCreateParams.builder()
                    .providerId("provider_id")
                    .authenticationType(SandboxConnectionCreateParams.AuthenticationType.CREDENTIAL)
                    .employeeSize(0L)
                    .addProduct("string")
                    .build()
            )

        connection.validate()
    }
}
