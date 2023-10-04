// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProviderTest {

    @Test
    fun createProvider() {
        val provider =
            Provider.builder()
                .id("string")
                .displayName("string")
                .icon("string")
                .logo("string")
                .manual(true)
                .mfaRequired(true)
                .primaryColor("string")
                .products(listOf("string"))
                .build()
        assertThat(provider).isNotNull
        assertThat(provider.id()).isEqualTo("string")
        assertThat(provider.displayName()).isEqualTo("string")
        assertThat(provider.icon()).isEqualTo("string")
        assertThat(provider.logo()).isEqualTo("string")
        assertThat(provider.manual()).isEqualTo(true)
        assertThat(provider.mfaRequired()).isEqualTo(true)
        assertThat(provider.primaryColor()).isEqualTo("string")
        assertThat(provider.products()).containsExactly("string")
    }
}
