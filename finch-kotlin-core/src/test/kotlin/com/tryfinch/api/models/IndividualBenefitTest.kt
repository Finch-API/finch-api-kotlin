// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualBenefitTest {

    @Test
    fun createIndividualBenefit() {
        val individualBenefit =
            IndividualBenefit.builder()
                .body(
                    IndividualBenefit.Body.builder()
                        .annualMaximum(0L)
                        .catchUp(true)
                        .companyContribution(
                            BenefitContribution.builder()
                                .amount(0L)
                                .type(BenefitContribution.Type.FIXED)
                                .build()
                        )
                        .employeeDeduction(
                            BenefitContribution.builder()
                                .amount(0L)
                                .type(BenefitContribution.Type.FIXED)
                                .build()
                        )
                        .hsaContributionLimit(
                            IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL
                        )
                        .build()
                )
                .code(0L)
                .individualId("individual_id")
                .build()
        assertThat(individualBenefit).isNotNull
        assertThat(individualBenefit.body())
            .isEqualTo(
                IndividualBenefit.Body.builder()
                    .annualMaximum(0L)
                    .catchUp(true)
                    .companyContribution(
                        BenefitContribution.builder()
                            .amount(0L)
                            .type(BenefitContribution.Type.FIXED)
                            .build()
                    )
                    .employeeDeduction(
                        BenefitContribution.builder()
                            .amount(0L)
                            .type(BenefitContribution.Type.FIXED)
                            .build()
                    )
                    .hsaContributionLimit(IndividualBenefit.Body.HsaContributionLimit.INDIVIDUAL)
                    .build()
            )
        assertThat(individualBenefit.code()).isEqualTo(0L)
        assertThat(individualBenefit.individualId()).isEqualTo("individual_id")
    }
}
