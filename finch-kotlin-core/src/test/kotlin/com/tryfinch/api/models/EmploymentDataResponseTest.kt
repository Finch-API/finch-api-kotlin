// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmploymentDataResponseTest {

    @Test
    fun createEmploymentDataResponse() {
        val employmentDataResponse =
            EmploymentDataResponse.builder()
                .body(
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
                        .latestRehireDate("string")
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
                )
                .code(123L)
                .individualId("string")
                .build()
        assertThat(employmentDataResponse).isNotNull
        assertThat(employmentDataResponse.body())
            .isEqualTo(
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
                    .latestRehireDate("string")
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
            )
        assertThat(employmentDataResponse.code()).isEqualTo(123L)
        assertThat(employmentDataResponse.individualId()).isEqualTo("string")
    }
}
