// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentResponseTest {

    @Test
    fun create() {
        val documentResponse =
            DocumentResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .individualId("individual_id")
                .type(DocumentResponse.Type.W4_2020)
                .url("https://example.com")
                .year(0.0)
                .build()

        assertThat(documentResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(documentResponse.individualId()).isEqualTo("individual_id")
        assertThat(documentResponse.type()).isEqualTo(DocumentResponse.Type.W4_2020)
        assertThat(documentResponse.url()).isEqualTo("https://example.com")
        assertThat(documentResponse.year()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentResponse =
            DocumentResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .individualId("individual_id")
                .type(DocumentResponse.Type.W4_2020)
                .url("https://example.com")
                .year(0.0)
                .build()

        val roundtrippedDocumentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentResponse),
                jacksonTypeRef<DocumentResponse>(),
            )

        assertThat(roundtrippedDocumentResponse).isEqualTo(documentResponse)
    }
}
