// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SupportedBenefitTest {

    @Test
    fun createSupportedBenefit() {
        val supportedBenefit =
            SupportedBenefit.builder()
                .annualMaximum(true)
                .catchUp(true)
                .addCompanyContribution(SupportedBenefit.CompanyContribution.FIXED)
                .description("description")
                .addEmployeeDeduction(SupportedBenefit.EmployeeDeduction.FIXED)
                .addFrequency(BenefitFrequency.ONE_TIME)
                .addHsaContributionLimit(SupportedBenefit.HsaContributionLimit.INDIVIDUAL)
                .type(BenefitType._401K)
                .build()
        assertThat(supportedBenefit).isNotNull
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
        assertThat(supportedBenefit.type()).isEqualTo(BenefitType._401K)
    }
}
