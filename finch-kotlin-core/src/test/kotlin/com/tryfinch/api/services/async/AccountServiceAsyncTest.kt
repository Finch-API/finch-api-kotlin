// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.AccountDisconnectEntityParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceAsyncTest {

    @Test
    suspend fun disconnect() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountServiceAsync = client.account()

        val disconnectResponse = accountServiceAsync.disconnect()

        disconnectResponse.validate()
    }

    @Test
    suspend fun disconnectEntity() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountServiceAsync = client.account()

        val disconnectEntityResponse =
            accountServiceAsync.disconnectEntity(
                AccountDisconnectEntityParams.builder()
                    .addEntityId("3c90c3cc-0d44-4b50-8888-8dd25736052a")
                    .addEntityId("5e6f7a8b-9c10-4d11-a12b-c13d14e15f16")
                    .build()
            )

        disconnectEntityResponse.validate()
    }

    @Test
    suspend fun introspect() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val accountServiceAsync = client.account()

        val introspection = accountServiceAsync.introspect()

        introspection.validate()
    }
}
