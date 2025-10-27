// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IndividualServiceAsyncTest {

    @Test
    suspend fun retrieveMany() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualServiceAsync = client.hris().individuals()

        val page = individualServiceAsync.retrieveMany()

        page.response().validate()
    }
}
