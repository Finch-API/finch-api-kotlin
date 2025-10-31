// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val documentServiceAsync = client.hris().documents()

        val documents =
            documentServiceAsync.list(
                HrisDocumentListParams.builder()
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .addIndividualId("string")
                    .limit(0L)
                    .offset(0L)
                    .addType(HrisDocumentListParams.Type.W4_2020)
                    .build()
            )

        documents.validate()
    }

    @Test
    suspend fun retreive() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val documentServiceAsync = client.hris().documents()

        val response =
            documentServiceAsync.retreive(
                HrisDocumentRetreiveParams.builder()
                    .documentId("document_id")
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )

        response.validate()
    }
}
