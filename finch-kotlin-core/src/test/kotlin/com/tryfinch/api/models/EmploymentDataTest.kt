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
                .id("id")
                .classCode("class_code")
                .customFields(
                    listOf(
                        EmploymentData.CustomField.builder()
                            .name("name")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .department(EmploymentData.Department.builder().name("name").build())
                .employment(
                    EmploymentData.Employment.builder()
                        .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                        .type(EmploymentData.Employment.Type.EMPLOYEE)
                        .build()
                )
                .endDate("end_date")
                .firstName("first_name")
                .income(
                    Income.builder()
                        .amount(123L)
                        .currency("currency")
                        .effectiveDate("effective_date")
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .incomeHistory(
                    listOf(
                        Income.builder()
                            .amount(123L)
                            .currency("currency")
                            .effectiveDate("effective_date")
                            .unit(Income.Unit.YEARLY)
                            .build()
                    )
                )
                .isActive(true)
                .lastName("last_name")
                .latestRehireDate("latest_rehire_date")
                .location(
                    Location.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .name("name")
                        .postalCode("postal_code")
                        .sourceId("source_id")
                        .state("state")
                        .build()
                )
                .manager(EmploymentData.Manager.builder().id("id").build())
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .workId("work_id")
                .build()
        assertThat(employmentData).isNotNull
        assertThat(employmentData.id()).isEqualTo("id")
        assertThat(employmentData.classCode()).isEqualTo("class_code")
        assertThat(employmentData.customFields())
            .containsExactly(
                EmploymentData.CustomField.builder()
                    .name("name")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(employmentData.department())
            .isEqualTo(EmploymentData.Department.builder().name("name").build())
        assertThat(employmentData.employment())
            .isEqualTo(
                EmploymentData.Employment.builder()
                    .subtype(EmploymentData.Employment.Subtype.FULL_TIME)
                    .type(EmploymentData.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(employmentData.endDate()).isEqualTo("end_date")
        assertThat(employmentData.firstName()).isEqualTo("first_name")
        assertThat(employmentData.income())
            .isEqualTo(
                Income.builder()
                    .amount(123L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentData.incomeHistory())
            .containsExactly(
                Income.builder()
                    .amount(123L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentData.isActive()).isEqualTo(true)
        assertThat(employmentData.lastName()).isEqualTo("last_name")
        assertThat(employmentData.latestRehireDate()).isEqualTo("latest_rehire_date")
        assertThat(employmentData.location())
            .isEqualTo(
                Location.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .name("name")
                    .postalCode("postal_code")
                    .sourceId("source_id")
                    .state("state")
                    .build()
            )
        assertThat(employmentData.manager())
            .isEqualTo(EmploymentData.Manager.builder().id("id").build())
        assertThat(employmentData.middleName()).isEqualTo("middle_name")
        assertThat(employmentData.sourceId()).isEqualTo("source_id")
        assertThat(employmentData.startDate()).isEqualTo("start_date")
        assertThat(employmentData.title()).isEqualTo("title")
        assertThat(employmentData.workId()).isEqualTo("work_id")
    }
}
