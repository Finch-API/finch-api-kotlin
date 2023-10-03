package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PayStatementResponseTest {

    @Test
    fun createPayStatementResponse() {
        val payStatementResponse =
            PayStatementResponse.builder()
                .body(
                    PayStatementResponseBody.builder()
                        .paging(Paging.builder().count(123L).offset(123L).build())
                        .payStatements(
                            listOf(
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
                                    .grossPay(
                                        Money.builder().amount(123L).currency("string").build()
                                    )
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
                            )
                        )
                        .build()
                )
                .code(123L)
                .paymentId("string")
                .build()
        assertThat(payStatementResponse).isNotNull
        assertThat(payStatementResponse.body())
            .isEqualTo(
                PayStatementResponseBody.builder()
                    .paging(Paging.builder().count(123L).offset(123L).build())
                    .payStatements(
                        listOf(
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
                        )
                    )
                    .build()
            )
        assertThat(payStatementResponse.code()).isEqualTo(123L)
        assertThat(payStatementResponse.paymentId()).isEqualTo("string")
    }
}
