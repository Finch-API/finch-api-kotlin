// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyBenefitTest {

    @Test
    fun create() {
        val companyBenefit =
            CompanyBenefit.builder()
                .benefitId("benefit_id")
                .description("description")
                .frequency(BenefitFrequency.ONE_TIME)
                .type(BenefitType._401K)
                .build()

        assertThat(companyBenefit.benefitId()).isEqualTo("benefit_id")
        assertThat(companyBenefit.description()).isEqualTo("description")
        assertThat(companyBenefit.frequency()).isEqualTo(BenefitFrequency.ONE_TIME)
        assertThat(companyBenefit.type()).isEqualTo(BenefitType._401K)
    }
}
