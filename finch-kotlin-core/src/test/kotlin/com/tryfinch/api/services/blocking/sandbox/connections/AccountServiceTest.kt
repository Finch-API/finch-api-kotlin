// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.connections

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.ConnectionStatusType
import com.tryfinch.api.models.SandboxConnectionAccountCreateParams
import com.tryfinch.api.models.SandboxConnectionAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceTest {

    @Disabled("prism tests are broken")
    @Test
    fun create() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountService = client.sandbox().connections().accounts()

        val account =
            accountService.create(
                SandboxConnectionAccountCreateParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .providerId("provider_id")
                    .authenticationType(
                        SandboxConnectionAccountCreateParams.AuthenticationType.CREDENTIAL
                    )
                    .addProduct("string")
                    .build()
            )

        account.validate()
    }

    @Test
    fun update() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountService = client.sandbox().connections().accounts()

        val account =
            accountService.update(
                SandboxConnectionAccountUpdateParams.builder()
                    .connectionStatus(ConnectionStatusType.REAUTH)
                    .build()
            )

        account.validate()
    }
}
