// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayGroupListResponseTest {

    @Test
    fun create() {
        val payGroupListResponse =
            PayGroupListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .addPayFrequency(PayGroupListResponse.PayFrequency.ANNUALLY)
                .build()

        assertThat(payGroupListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payGroupListResponse.name()).isEqualTo("name")
        assertThat(payGroupListResponse.payFrequencies())
            .containsExactly(PayGroupListResponse.PayFrequency.ANNUALLY)
    }
}
