// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisBenefitCreateParamsTest {

    @Test
    fun create() {
        HrisBenefitCreateParams.builder()
            .companyContribution(
                HrisBenefitCreateParams.BenefitCompanyMatchContribution.builder()
                    .addTier(
                        HrisBenefitCreateParams.BenefitCompanyMatchContribution.Tier.builder()
                            .match(1L)
                            .threshold(1L)
                            .build()
                    )
                    .type(HrisBenefitCreateParams.BenefitCompanyMatchContribution.Type.MATCH)
                    .build()
            )
            .description("description")
            .frequency(BenefitFrequency.EVERY_PAYCHECK)
            .type(BenefitType._457)
            .build()
    }

    @Test
    fun body() {
        val params =
            HrisBenefitCreateParams.builder()
                .companyContribution(
                    HrisBenefitCreateParams.BenefitCompanyMatchContribution.builder()
                        .addTier(
                            HrisBenefitCreateParams.BenefitCompanyMatchContribution.Tier.builder()
                                .match(1L)
                                .threshold(1L)
                                .build()
                        )
                        .type(HrisBenefitCreateParams.BenefitCompanyMatchContribution.Type.MATCH)
                        .build()
                )
                .description("description")
                .frequency(BenefitFrequency.EVERY_PAYCHECK)
                .type(BenefitType._457)
                .build()

        val body = params._body()

        assertThat(body.companyContribution())
            .isEqualTo(
                HrisBenefitCreateParams.BenefitCompanyMatchContribution.builder()
                    .addTier(
                        HrisBenefitCreateParams.BenefitCompanyMatchContribution.Tier.builder()
                            .match(1L)
                            .threshold(1L)
                            .build()
                    )
                    .type(HrisBenefitCreateParams.BenefitCompanyMatchContribution.Type.MATCH)
                    .build()
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.frequency()).isEqualTo(BenefitFrequency.EVERY_PAYCHECK)
        assertThat(body.type()).isEqualTo(BenefitType._457)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisBenefitCreateParams.builder().build()

        val body = params._body()
    }
}
