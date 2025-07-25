// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.connect

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.ConnectSessionNewParams
import com.tryfinch.api.models.ConnectSessionReauthenticateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceAsyncTest {

    @Disabled("prism tests are broken")
    @Test
    suspend fun new() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val sessionServiceAsync = client.connect().sessions()

        val response =
            sessionServiceAsync.new(
                ConnectSessionNewParams.builder()
                    .customerId("x")
                    .customerName("x")
                    .addProduct(ConnectSessionNewParams.ConnectProducts.COMPANY)
                    .customerEmail("dev@stainless.com")
                    .integration(
                        ConnectSessionNewParams.Integration.builder()
                            .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
                            .provider("provider")
                            .build()
                    )
                    .manual(true)
                    .minutesToExpire(1.0)
                    .redirectUri("redirect_uri")
                    .sandbox(ConnectSessionNewParams.Sandbox.FINCH)
                    .build()
            )

        response.validate()
    }

    @Disabled("prism tests are broken")
    @Test
    suspend fun reauthenticate() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val sessionServiceAsync = client.connect().sessions()

        val response =
            sessionServiceAsync.reauthenticate(
                ConnectSessionReauthenticateParams.builder()
                    .connectionId("connection_id")
                    .minutesToExpire(0L)
                    .addProduct(ConnectSessionReauthenticateParams.ConnectProducts.COMPANY)
                    .redirectUri("https://example.com")
                    .build()
            )

        response.validate()
    }
}
