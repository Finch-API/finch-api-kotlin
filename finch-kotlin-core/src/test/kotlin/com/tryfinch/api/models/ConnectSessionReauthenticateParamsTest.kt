// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectSessionReauthenticateParamsTest {

    @Test
    fun create() {
        ConnectSessionReauthenticateParams.builder()
            .connectionId("connection_id")
            .minutesToExpire(0L)
            .addProduct(ConnectSessionReauthenticateParams.ConnectProducts.COMPANY)
            .redirectUri("https://example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            ConnectSessionReauthenticateParams.builder()
                .connectionId("connection_id")
                .minutesToExpire(0L)
                .addProduct(ConnectSessionReauthenticateParams.ConnectProducts.COMPANY)
                .redirectUri("https://example.com")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.connectionId()).isEqualTo("connection_id")
        assertThat(body.minutesToExpire()).isEqualTo(0L)
        assertThat(body.products())
            .isEqualTo(listOf(ConnectSessionReauthenticateParams.ConnectProducts.COMPANY))
        assertThat(body.redirectUri()).isEqualTo("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConnectSessionReauthenticateParams.builder().connectionId("connection_id").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.connectionId()).isEqualTo("connection_id")
    }
}
