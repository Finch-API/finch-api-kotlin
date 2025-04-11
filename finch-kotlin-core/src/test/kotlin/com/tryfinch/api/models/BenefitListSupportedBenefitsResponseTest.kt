// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BenefitListSupportedBenefitsResponseTest {

    @Test
    fun create() {
        val benefitListSupportedBenefitsResponse =
            BenefitListSupportedBenefitsResponse.builder()
                .annualMaximum(true)
                .catchUp(true)
                .addCompanyContribution(
                    BenefitListSupportedBenefitsResponse.CompanyContribution.FIXED
                )
                .description("description")
                .addEmployeeDeduction(BenefitListSupportedBenefitsResponse.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.ONE_TIME)
                .addHsaContributionLimit(
                    BenefitListSupportedBenefitsResponse.HsaContributionLimit.INDIVIDUAL
                )
                .build()

        assertThat(benefitListSupportedBenefitsResponse.annualMaximum()).isEqualTo(true)
        assertThat(benefitListSupportedBenefitsResponse.catchUp()).isEqualTo(true)
        assertThat(benefitListSupportedBenefitsResponse.companyContribution())
            .containsExactly(BenefitListSupportedBenefitsResponse.CompanyContribution.FIXED)
        assertThat(benefitListSupportedBenefitsResponse.description()).isEqualTo("description")
        assertThat(benefitListSupportedBenefitsResponse.employeeDeduction())
            .containsExactly(BenefitListSupportedBenefitsResponse.EmployeeDeduction.FIXED)
        assertThat(benefitListSupportedBenefitsResponse.frequencies())
            .containsExactly(BenefitFrequency.ONE_TIME)
        assertThat(benefitListSupportedBenefitsResponse.hsaContributionLimit())
            .containsExactly(BenefitListSupportedBenefitsResponse.HsaContributionLimit.INDIVIDUAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val benefitListSupportedBenefitsResponse =
            BenefitListSupportedBenefitsResponse.builder()
                .annualMaximum(true)
                .catchUp(true)
                .addCompanyContribution(
                    BenefitListSupportedBenefitsResponse.CompanyContribution.FIXED
                )
                .description("description")
                .addEmployeeDeduction(BenefitListSupportedBenefitsResponse.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.ONE_TIME)
                .addHsaContributionLimit(
                    BenefitListSupportedBenefitsResponse.HsaContributionLimit.INDIVIDUAL
                )
                .build()

        val roundtrippedBenefitListSupportedBenefitsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(benefitListSupportedBenefitsResponse),
                jacksonTypeRef<BenefitListSupportedBenefitsResponse>(),
            )

        assertThat(roundtrippedBenefitListSupportedBenefitsResponse)
            .isEqualTo(benefitListSupportedBenefitsResponse)
    }
}
