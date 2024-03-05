// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmploymentDataTest {

    @Test
    fun createEmploymentData() {
        val employmentData =
            EmploymentData.builder()
                .id("string")
                .classCode("string")
                .customFields(
                    listOf(
                        EmploymentData.CustomField.builder()
                            .name("string")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .department(EmploymentData.Department.builder().name("string").build())
                .employment(
                    EmploymentData.Employment.builder()
                        .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                        .type(EmploymentData.Employment.Type.EMPLOYEE)
                        .build()
                )
                .endDate("string")
                .firstName("string")
                .income(
                    Income.builder()
                        .amount(123L)
                        .currency("string")
                        .effectiveDate("string")
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .incomeHistory(
                    listOf(
                        Income.builder()
                            .amount(123L)
                            .currency("string")
                            .effectiveDate("string")
                            .unit(Income.Unit.YEARLY)
                            .build()
                    )
                )
                .isActive(true)
                .lastName("string")
                .location(
                    Location.builder()
                        .city("string")
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .name("string")
                        .postalCode("string")
                        .sourceId("string")
                        .state("string")
                        .build()
                )
                .manager(EmploymentData.Manager.builder().id("string").build())
                .middleName("string")
                .sourceId("string")
                .startDate("string")
                .title("string")
                .workId("string")
                .build()
        assertThat(employmentData).isNotNull
        assertThat(employmentData.id()).isEqualTo("string")
        assertThat(employmentData.classCode()).isEqualTo("string")
        assertThat(employmentData.customFields())
            .containsExactly(
                EmploymentData.CustomField.builder()
                    .name("string")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(employmentData.department())
            .isEqualTo(EmploymentData.Department.builder().name("string").build())
        assertThat(employmentData.employment())
            .isEqualTo(
                EmploymentData.Employment.builder()
                    .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                    .type(EmploymentData.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(employmentData.endDate()).isEqualTo("string")
        assertThat(employmentData.firstName()).isEqualTo("string")
        assertThat(employmentData.income())
            .isEqualTo(
                Income.builder()
                    .amount(123L)
                    .currency("string")
                    .effectiveDate("string")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentData.incomeHistory())
            .containsExactly(
                Income.builder()
                    .amount(123L)
                    .currency("string")
                    .effectiveDate("string")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentData.isActive()).isEqualTo(true)
        assertThat(employmentData.lastName()).isEqualTo("string")
        assertThat(employmentData.location())
            .isEqualTo(
                Location.builder()
                    .city("string")
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .name("string")
                    .postalCode("string")
                    .sourceId("string")
                    .state("string")
                    .build()
            )
        assertThat(employmentData.manager())
            .isEqualTo(EmploymentData.Manager.builder().id("string").build())
        assertThat(employmentData.middleName()).isEqualTo("string")
        assertThat(employmentData.sourceId()).isEqualTo("string")
        assertThat(employmentData.startDate()).isEqualTo("string")
        assertThat(employmentData.title()).isEqualTo("string")
        assertThat(employmentData.workId()).isEqualTo("string")
    }
}
