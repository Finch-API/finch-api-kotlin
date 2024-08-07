// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualBenefitTest {

    @Test
    fun createIndividualBenefit() {
        val individualBenefit =
            IndividualBenefit.builder()
                .body(
                    IndividualBenefit.Body.builder()
                        .annualMaximum(123L)
                        .catchUp(true)
                        .companyContribution(
                            BenefitContribution.builder()
                                .amount(123L)
                                .type(BenefitContribution.Type.FIXED)
                                .build()
                        )
                        .employeeDeduction(
                            BenefitContribution.builder()
                                .amount(123L)
                                .type(BenefitContribution.Type.FIXED)
                                .build()
                        )
                        .hsaContributionLimit(
                            IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL
                        )
                        .build()
                )
                .code(123L)
                .individualId("individual_id")
                .build()
        assertThat(individualBenefit).isNotNull
        assertThat(individualBenefit.body())
            .isEqualTo(
                IndividualBenefit.Body.builder()
                    .annualMaximum(123L)
                    .catchUp(true)
                    .companyContribution(
                        BenefitContribution.builder()
                            .amount(123L)
                            .type(BenefitContribution.Type.FIXED)
                            .build()
                    )
                    .employeeDeduction(
                        BenefitContribution.builder()
                            .amount(123L)
                            .type(BenefitContribution.Type.FIXED)
                            .build()
                    )
                    .hsaContributionLimit(IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL)
                    .build()
            )
        assertThat(individualBenefit.code()).isEqualTo(123L)
        assertThat(individualBenefit.individualId()).isEqualTo("individual_id")
    }
}
