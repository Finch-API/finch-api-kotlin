// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SupportedBenefitTest {

    @Test
    fun create() {
        val supportedBenefit =
            SupportedBenefit.builder()
                .annualMaximum(true)
                .catchUp(true)
                .addCompanyContribution(SupportedBenefit.CompanyContribution.FIXED)
                .description("description")
                .addEmployeeDeduction(SupportedBenefit.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.ONE_TIME)
                .addHsaContributionLimit(SupportedBenefit.HsaContributionLimit.INDIVIDUAL)
                .build()

        assertThat(supportedBenefit.annualMaximum()).isEqualTo(true)
        assertThat(supportedBenefit.catchUp()).isEqualTo(true)
        assertThat(supportedBenefit.companyContribution())
            .containsExactly(SupportedBenefit.CompanyContribution.FIXED)
        assertThat(supportedBenefit.description()).isEqualTo("description")
        assertThat(supportedBenefit.employeeDeduction())
            .containsExactly(SupportedBenefit.EmployeeDeduction.FIXED)
        assertThat(supportedBenefit.frequencies()).containsExactly(BenefitFrequency.ONE_TIME)
        assertThat(supportedBenefit.hsaContributionLimit())
            .containsExactly(SupportedBenefit.HsaContributionLimit.INDIVIDUAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val supportedBenefit =
            SupportedBenefit.builder()
                .annualMaximum(true)
                .catchUp(true)
                .addCompanyContribution(SupportedBenefit.CompanyContribution.FIXED)
                .description("description")
                .addEmployeeDeduction(SupportedBenefit.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.ONE_TIME)
                .addHsaContributionLimit(SupportedBenefit.HsaContributionLimit.INDIVIDUAL)
                .build()

        val roundtrippedSupportedBenefit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(supportedBenefit),
                jacksonTypeRef<SupportedBenefit>(),
            )

        assertThat(roundtrippedSupportedBenefit).isEqualTo(supportedBenefit)
    }
}
