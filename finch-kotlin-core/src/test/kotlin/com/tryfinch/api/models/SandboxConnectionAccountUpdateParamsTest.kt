// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxConnectionAccountUpdateParamsTest {

    @Test
    fun create() {
        SandboxConnectionAccountUpdateParams.builder()
            .connectionStatus(ConnectionStatusType.PENDING)
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxConnectionAccountUpdateParams.builder()
                .connectionStatus(ConnectionStatusType.PENDING)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.connectionStatus()).isEqualTo(ConnectionStatusType.PENDING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxConnectionAccountUpdateParams.builder().build()

        val body = params._body()

        assertNotNull(body)
    }
}
