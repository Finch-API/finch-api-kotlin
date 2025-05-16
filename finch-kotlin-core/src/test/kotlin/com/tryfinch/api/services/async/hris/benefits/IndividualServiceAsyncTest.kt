// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.benefits

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.HrisBenefitIndividualUnenrollManyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IndividualServiceAsyncTest {

    @Test
    suspend fun enrolledIds() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualServiceAsync = client.hris().benefits().individuals()

        val response = individualServiceAsync.enrolledIds("benefit_id")

        response.validate()
    }

    @Test
    suspend fun retrieveManyBenefits() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualServiceAsync = client.hris().benefits().individuals()

        val page = individualServiceAsync.retrieveManyBenefits("benefit_id")

        page.items().forEach { it.validate() }
    }

    @Test
    suspend fun unenrollMany() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val individualServiceAsync = client.hris().benefits().individuals()

        val unenrolledIndividualBenefitResponse =
            individualServiceAsync.unenrollMany(
                HrisBenefitIndividualUnenrollManyParams.builder()
                    .benefitId("benefit_id")
                    .addIndividualId("string")
                    .build()
            )

        unenrolledIndividualBenefitResponse.validate()
    }
}
