// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayStatementTest {

    @Test
    fun create() {
        val payStatement =
            PayStatement.builder()
                .addEarning(
                    PayStatement.Earning.builder()
                        .amount(0L)
                        .currency("currency")
                        .hours(0.0)
                        .name("name")
                        .type(PayStatement.Earning.Type.SALARY)
                        .attributes(
                            PayStatement.Earning.Attributes.builder()
                                .metadata(
                                    PayStatement.Earning.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.Earning.Attributes.Metadata.InnerMetadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf<String, Any>()),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .addEmployeeDeduction(
                    PayStatement.EmployeeDeduction.builder()
                        .amount(0L)
                        .currency("currency")
                        .name("name")
                        .preTax(true)
                        .type(BenefitType._457)
                        .attributes(
                            PayStatement.EmployeeDeduction.Attributes.builder()
                                .metadata(
                                    PayStatement.EmployeeDeduction.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.EmployeeDeduction.Attributes.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf<String, Any>()),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .addEmployerContribution(
                    PayStatement.EmployerContribution.builder()
                        .currency("currency")
                        .name("name")
                        .type(BenefitType._457)
                        .amount(0L)
                        .attributes(
                            PayStatement.EmployerContribution.Attributes.builder()
                                .metadata(
                                    PayStatement.EmployerContribution.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.EmployerContribution.Attributes.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf<String, Any>()),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .grossPay(Money.builder().amount(0L).currency("currency").build())
                .individualId("individual_id")
                .netPay(Money.builder().amount(0L).currency("currency").build())
                .paymentMethod(PayStatement.PaymentMethod.CHECK)
                .addTax(
                    PayStatement.Tax.builder()
                        .currency("currency")
                        .employer(true)
                        .name("name")
                        .type(PayStatement.Tax.Type.STATE)
                        .amount(0L)
                        .attributes(
                            PayStatement.Tax.Attributes.builder()
                                .metadata(
                                    PayStatement.Tax.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.Tax.Attributes.Metadata.InnerMetadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf<String, Any>()),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .totalHours(0.0)
                .type(PayStatement.Type.OFF_CYCLE_PAYROLL)
                .build()

        assertThat(payStatement.earnings())
            .containsExactly(
                PayStatement.Earning.builder()
                    .amount(0L)
                    .currency("currency")
                    .hours(0.0)
                    .name("name")
                    .type(PayStatement.Earning.Type.SALARY)
                    .attributes(
                        PayStatement.Earning.Attributes.builder()
                            .metadata(
                                PayStatement.Earning.Attributes.Metadata.builder()
                                    .metadata(
                                        PayStatement.Earning.Attributes.Metadata.InnerMetadata
                                            .builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(payStatement.employeeDeductions())
            .containsExactly(
                PayStatement.EmployeeDeduction.builder()
                    .amount(0L)
                    .currency("currency")
                    .name("name")
                    .preTax(true)
                    .type(BenefitType._457)
                    .attributes(
                        PayStatement.EmployeeDeduction.Attributes.builder()
                            .metadata(
                                PayStatement.EmployeeDeduction.Attributes.Metadata.builder()
                                    .metadata(
                                        PayStatement.EmployeeDeduction.Attributes.Metadata
                                            .InnerMetadata
                                            .builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(payStatement.employerContributions())
            .containsExactly(
                PayStatement.EmployerContribution.builder()
                    .currency("currency")
                    .name("name")
                    .type(BenefitType._457)
                    .amount(0L)
                    .attributes(
                        PayStatement.EmployerContribution.Attributes.builder()
                            .metadata(
                                PayStatement.EmployerContribution.Attributes.Metadata.builder()
                                    .metadata(
                                        PayStatement.EmployerContribution.Attributes.Metadata
                                            .InnerMetadata
                                            .builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(payStatement.grossPay())
            .isEqualTo(Money.builder().amount(0L).currency("currency").build())
        assertThat(payStatement.individualId()).isEqualTo("individual_id")
        assertThat(payStatement.netPay())
            .isEqualTo(Money.builder().amount(0L).currency("currency").build())
        assertThat(payStatement.paymentMethod()).isEqualTo(PayStatement.PaymentMethod.CHECK)
        assertThat(payStatement.taxes())
            .containsExactly(
                PayStatement.Tax.builder()
                    .currency("currency")
                    .employer(true)
                    .name("name")
                    .type(PayStatement.Tax.Type.STATE)
                    .amount(0L)
                    .attributes(
                        PayStatement.Tax.Attributes.builder()
                            .metadata(
                                PayStatement.Tax.Attributes.Metadata.builder()
                                    .metadata(
                                        PayStatement.Tax.Attributes.Metadata.InnerMetadata.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(payStatement.totalHours()).isEqualTo(0.0)
        assertThat(payStatement.type()).isEqualTo(PayStatement.Type.OFF_CYCLE_PAYROLL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payStatement =
            PayStatement.builder()
                .addEarning(
                    PayStatement.Earning.builder()
                        .amount(0L)
                        .currency("currency")
                        .hours(0.0)
                        .name("name")
                        .type(PayStatement.Earning.Type.SALARY)
                        .attributes(
                            PayStatement.Earning.Attributes.builder()
                                .metadata(
                                    PayStatement.Earning.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.Earning.Attributes.Metadata.InnerMetadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf<String, Any>()),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .addEmployeeDeduction(
                    PayStatement.EmployeeDeduction.builder()
                        .amount(0L)
                        .currency("currency")
                        .name("name")
                        .preTax(true)
                        .type(BenefitType._457)
                        .attributes(
                            PayStatement.EmployeeDeduction.Attributes.builder()
                                .metadata(
                                    PayStatement.EmployeeDeduction.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.EmployeeDeduction.Attributes.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf<String, Any>()),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .addEmployerContribution(
                    PayStatement.EmployerContribution.builder()
                        .currency("currency")
                        .name("name")
                        .type(BenefitType._457)
                        .amount(0L)
                        .attributes(
                            PayStatement.EmployerContribution.Attributes.builder()
                                .metadata(
                                    PayStatement.EmployerContribution.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.EmployerContribution.Attributes.Metadata
                                                .InnerMetadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf<String, Any>()),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .grossPay(Money.builder().amount(0L).currency("currency").build())
                .individualId("individual_id")
                .netPay(Money.builder().amount(0L).currency("currency").build())
                .paymentMethod(PayStatement.PaymentMethod.CHECK)
                .addTax(
                    PayStatement.Tax.builder()
                        .currency("currency")
                        .employer(true)
                        .name("name")
                        .type(PayStatement.Tax.Type.STATE)
                        .amount(0L)
                        .attributes(
                            PayStatement.Tax.Attributes.builder()
                                .metadata(
                                    PayStatement.Tax.Attributes.Metadata.builder()
                                        .metadata(
                                            PayStatement.Tax.Attributes.Metadata.InnerMetadata
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf<String, Any>()),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .totalHours(0.0)
                .type(PayStatement.Type.OFF_CYCLE_PAYROLL)
                .build()

        val roundtrippedPayStatement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payStatement),
                jacksonTypeRef<PayStatement>(),
            )

        assertThat(roundtrippedPayStatement).isEqualTo(payStatement)
    }
}
