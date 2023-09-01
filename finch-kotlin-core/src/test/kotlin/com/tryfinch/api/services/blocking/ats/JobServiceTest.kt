package com.tryfinch.api.services.blocking.ats

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.*
import com.tryfinch.api.models.AtsJobListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class JobServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val jobService = client.ats().jobs()
        val job = jobService.retrieve(AtsJobRetrieveParams.builder().jobId("string").build())
        println(job)
        job.validate()
    }

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("test-api-key")
                .build()
        val jobService = client.ats().jobs()
        val response = jobService.list(AtsJobListParams.builder().build())
        println(response)
        response.jobs().forEach { it.validate() }
    }
}
