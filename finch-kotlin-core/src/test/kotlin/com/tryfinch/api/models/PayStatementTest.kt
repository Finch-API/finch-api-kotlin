// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayStatementTest {

    @Test
    fun createPayStatement() {
        val payStatement =
            PayStatement.builder()
                .earnings(
                    listOf(
                        PayStatement.Earning.builder()
                            .amount(123L)
                            .currency("string")
                            .hours(42.23)
                            .name("string")
                            .type(PayStatement.Earning.Type.SALARY)
                            .build()
                    )
                )
                .employeeDeductions(
                    listOf(
                        PayStatement.EmployeeDeduction.builder()
                            .amount(123L)
                            .currency("string")
                            .name("string")
                            .preTax(true)
                            .type(BenefitType._401K)
                            .build()
                    )
                )
                .employerContributions(
                    listOf(
                        PayStatement.EmployerContribution.builder()
                            .amount(123L)
                            .currency("string")
                            .name("string")
                            .type(BenefitType._401K)
                            .build()
                    )
                )
                .grossPay(Money.builder().amount(123L).currency("string").build())
                .individualId("string")
                .netPay(Money.builder().amount(123L).currency("string").build())
                .paymentMethod(PayStatement.PaymentMethod.CHECK)
                .taxes(
                    listOf(
                        PayStatement.Tax.builder()
                            .amount(123L)
                            .currency("string")
                            .employer(true)
                            .name("string")
                            .type(PayStatement.Tax.Type.STATE)
                            .build()
                    )
                )
                .totalHours(42.23)
                .type(PayStatement.Type.REGULAR_PAYROLL)
                .build()
        assertThat(payStatement).isNotNull
        assertThat(payStatement.earnings())
            .containsExactly(
                PayStatement.Earning.builder()
                    .amount(123L)
                    .currency("string")
                    .hours(42.23)
                    .name("string")
                    .type(PayStatement.Earning.Type.SALARY)
                    .build()
            )
        assertThat(payStatement.employeeDeductions())
            .containsExactly(
                PayStatement.EmployeeDeduction.builder()
                    .amount(123L)
                    .currency("string")
                    .name("string")
                    .preTax(true)
                    .type(BenefitType._401K)
                    .build()
            )
        assertThat(payStatement.employerContributions())
            .containsExactly(
                PayStatement.EmployerContribution.builder()
                    .amount(123L)
                    .currency("string")
                    .name("string")
                    .type(BenefitType._401K)
                    .build()
            )
        assertThat(payStatement.grossPay())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payStatement.individualId()).isEqualTo("string")
        assertThat(payStatement.netPay())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payStatement.paymentMethod()).isEqualTo(PayStatement.PaymentMethod.CHECK)
        assertThat(payStatement.taxes())
            .containsExactly(
                PayStatement.Tax.builder()
                    .amount(123L)
                    .currency("string")
                    .employer(true)
                    .name("string")
                    .type(PayStatement.Tax.Type.STATE)
                    .build()
            )
        assertThat(payStatement.totalHours()).isEqualTo(42.23)
        assertThat(payStatement.type()).isEqualTo(PayStatement.Type.REGULAR_PAYROLL)
    }
}
