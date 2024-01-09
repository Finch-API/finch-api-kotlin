// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmploymentUpdateResponseTest {

    @Test
    fun createEmploymentUpdateResponse() {
        val employmentUpdateResponse =
            EmploymentUpdateResponse.builder()
                .id("string")
                .classCode("string")
                .customFields(
                    listOf(
                        EmploymentUpdateResponse.CustomField.builder()
                            .name("string")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .department(EmploymentUpdateResponse.Department.builder().name("string").build())
                .employment(
                    EmploymentUpdateResponse.Employment.builder()
                        .subtype(EmploymentUpdateResponse.Employment.Subtype.FULL_TIME)
                        .type(EmploymentUpdateResponse.Employment.Type.EMPLOYEE)
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
                .manager(EmploymentUpdateResponse.Manager.builder().id("string").build())
                .middleName("string")
                .sourceId("string")
                .startDate("string")
                .title("string")
                .build()
        assertThat(employmentUpdateResponse).isNotNull
        assertThat(employmentUpdateResponse.id()).isEqualTo("string")
        assertThat(employmentUpdateResponse.classCode()).isEqualTo("string")
        assertThat(employmentUpdateResponse.customFields())
            .containsExactly(
                EmploymentUpdateResponse.CustomField.builder()
                    .name("string")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(employmentUpdateResponse.department())
            .isEqualTo(EmploymentUpdateResponse.Department.builder().name("string").build())
        assertThat(employmentUpdateResponse.employment())
            .isEqualTo(
                EmploymentUpdateResponse.Employment.builder()
                    .subtype(EmploymentUpdateResponse.Employment.Subtype.FULL_TIME)
                    .type(EmploymentUpdateResponse.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(employmentUpdateResponse.endDate()).isEqualTo("string")
        assertThat(employmentUpdateResponse.firstName()).isEqualTo("string")
        assertThat(employmentUpdateResponse.income())
            .isEqualTo(
                Income.builder()
                    .amount(123L)
                    .currency("string")
                    .effectiveDate("string")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentUpdateResponse.incomeHistory())
            .containsExactly(
                Income.builder()
                    .amount(123L)
                    .currency("string")
                    .effectiveDate("string")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentUpdateResponse.isActive()).isEqualTo(true)
        assertThat(employmentUpdateResponse.lastName()).isEqualTo("string")
        assertThat(employmentUpdateResponse.location())
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
        assertThat(employmentUpdateResponse.manager())
            .isEqualTo(EmploymentUpdateResponse.Manager.builder().id("string").build())
        assertThat(employmentUpdateResponse.middleName()).isEqualTo("string")
        assertThat(employmentUpdateResponse.sourceId()).isEqualTo("string")
        assertThat(employmentUpdateResponse.startDate()).isEqualTo("string")
        assertThat(employmentUpdateResponse.title()).isEqualTo("string")
    }
}
