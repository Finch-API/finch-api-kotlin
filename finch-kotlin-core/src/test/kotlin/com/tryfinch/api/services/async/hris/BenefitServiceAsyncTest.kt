// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.BenefitFrequency
import com.tryfinch.api.models.BenefitType
import com.tryfinch.api.models.HrisBenefitCreateParams
import com.tryfinch.api.models.HrisBenefitUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BenefitServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val createCompanyBenefitsResponse =
            benefitServiceAsync.create(
                HrisBenefitCreateParams.builder()
                    .companyContribution(
                        HrisBenefitCreateParams.BenefitCompanyMatchContribution.builder()
                            .addTier(
                                HrisBenefitCreateParams.BenefitCompanyMatchContribution.Tier
                                    .builder()
                                    .match(1L)
                                    .threshold(1L)
                                    .build()
                            )
                            .type(
                                HrisBenefitCreateParams.BenefitCompanyMatchContribution.Type.MATCH
                            )
                            .build()
                    )
                    .description("description")
                    .frequency(BenefitFrequency.ONE_TIME)
                    .type(BenefitType._457)
                    .build()
            )

        createCompanyBenefitsResponse.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val companyBenefit = benefitServiceAsync.retrieve("benefit_id")

        companyBenefit.validate()
    }

    @Test
    suspend fun update() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val updateCompanyBenefitResponse =
            benefitServiceAsync.update(
                HrisBenefitUpdateParams.builder()
                    .benefitId("benefit_id")
                    .description("description")
                    .build()
            )

        updateCompanyBenefitResponse.validate()
    }

    @Test
    suspend fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val page = benefitServiceAsync.list()

        page.items().forEach { it.validate() }
    }

    @Test
    suspend fun listSupportedBenefits() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val benefitServiceAsync = client.hris().benefits()

        val page = benefitServiceAsync.listSupportedBenefits()

        page.items().forEach { it.validate() }
    }
}
