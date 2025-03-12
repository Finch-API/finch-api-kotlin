// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentResponseTest {

    @Test
    fun createDocumentResponse() {
        val documentResponse =
            DocumentResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .individualId("individual_id")
                .type(DocumentResponse.Type.W4_2020)
                .url("https://example.com")
                .year(0.0)
                .build()
        assertThat(documentResponse).isNotNull
        assertThat(documentResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(documentResponse.individualId()).isEqualTo("individual_id")
        assertThat(documentResponse.type()).isEqualTo(DocumentResponse.Type.W4_2020)
        assertThat(documentResponse.url()).isEqualTo("https://example.com")
        assertThat(documentResponse.year()).isEqualTo(0.0)
    }
}
