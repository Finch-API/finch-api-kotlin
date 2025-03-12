// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.jobs

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.JobAutomatedCreateParams
import com.tryfinch.api.models.JobAutomatedListParams
import com.tryfinch.api.models.JobAutomatedRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AutomatedServiceAsyncTest {

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
                JobAutomatedCreateParams.builder()
                    .body(
                        JobAutomatedCreateParams.Body.DataSyncAll.builder()
                            .type(JobAutomatedCreateParams.Body.DataSyncAll.Type.DATA_SYNC_ALL)
                            .build()
                    )
                    .build()
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

        val automatedAsyncJob =
            automatedServiceAsync.retrieve(
                JobAutomatedRetrieveParams.builder().jobId("job_id").build()
            )

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

        val automated =
            automatedServiceAsync.list(
                JobAutomatedListParams.builder().limit(0L).offset(0L).build()
            )

        automated.validate()
    }
}
