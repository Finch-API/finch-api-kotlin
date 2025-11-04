// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AutomatedServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val automatedServiceAsync = client.jobs().automated()

        val automated =
            automatedServiceAsync.create(
                JobAutomatedCreateParams.builder().bodyDataSyncAll().build()
            )

        automated.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val automatedServiceAsync = client.jobs().automated()

        val automatedAsyncJob = automatedServiceAsync.retrieve("job_id")

        automatedAsyncJob.validate()
    }

    @Test
    suspend fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val automatedServiceAsync = client.jobs().automated()

        val automateds =
            automatedServiceAsync.list(
                JobAutomatedListParams.builder().limit(0L).offset(0L).build()
            )

        automateds.validate()
    }
}
