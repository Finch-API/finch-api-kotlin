// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmploymentUpdateResponseTest {

    @Test
    fun create() {
        val employmentUpdateResponse =
            EmploymentUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .classCode("class_code")
                .addCustomField(
                    EmploymentUpdateResponse.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .department(EmploymentUpdateResponse.Department.builder().name("name").build())
                .employment(
                    EmploymentUpdateResponse.Employment.builder()
                        .subtype(EmploymentUpdateResponse.Employment.Subtype.FULL_TIME)
                        .type(EmploymentUpdateResponse.Employment.Type.EMPLOYEE)
                        .build()
                )
                .employmentStatus(EmploymentUpdateResponse.EmploymentStatus.ACTIVE)
                .endDate("end_date")
                .firstName("first_name")
                .income(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate("effective_date")
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .addIncomeHistory(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate("effective_date")
                        .unit(Income.Unit.YEARLY)
                        .build()
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
                        .postalCode("postal_code")
                        .state("state")
                        .name("name")
                        .sourceId("source_id")
                        .build()
                )
                .manager(
                    EmploymentUpdateResponse.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .build()

        assertThat(employmentUpdateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(employmentUpdateResponse.classCode()).isEqualTo("class_code")
        assertThat(employmentUpdateResponse.customFields())
            .containsExactly(
                EmploymentUpdateResponse.CustomField.builder()
                    .name("name")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(employmentUpdateResponse.department())
            .isEqualTo(EmploymentUpdateResponse.Department.builder().name("name").build())
        assertThat(employmentUpdateResponse.employment())
            .isEqualTo(
                EmploymentUpdateResponse.Employment.builder()
                    .subtype(EmploymentUpdateResponse.Employment.Subtype.FULL_TIME)
                    .type(EmploymentUpdateResponse.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(employmentUpdateResponse.employmentStatus())
            .isEqualTo(EmploymentUpdateResponse.EmploymentStatus.ACTIVE)
        assertThat(employmentUpdateResponse.endDate()).isEqualTo("end_date")
        assertThat(employmentUpdateResponse.firstName()).isEqualTo("first_name")
        assertThat(employmentUpdateResponse.income())
            .isEqualTo(
                Income.builder()
                    .amount(0L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentUpdateResponse.incomeHistory())
            .containsExactly(
                Income.builder()
                    .amount(0L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(employmentUpdateResponse.isActive()).isEqualTo(true)
        assertThat(employmentUpdateResponse.lastName()).isEqualTo("last_name")
        assertThat(employmentUpdateResponse.latestRehireDate()).isEqualTo("latest_rehire_date")
        assertThat(employmentUpdateResponse.location())
            .isEqualTo(
                Location.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .name("name")
                    .sourceId("source_id")
                    .build()
            )
        assertThat(employmentUpdateResponse.manager())
            .isEqualTo(
                EmploymentUpdateResponse.Manager.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(employmentUpdateResponse.middleName()).isEqualTo("middle_name")
        assertThat(employmentUpdateResponse.sourceId()).isEqualTo("source_id")
        assertThat(employmentUpdateResponse.startDate()).isEqualTo("start_date")
        assertThat(employmentUpdateResponse.title()).isEqualTo("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val employmentUpdateResponse =
            EmploymentUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .classCode("class_code")
                .addCustomField(
                    EmploymentUpdateResponse.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .department(EmploymentUpdateResponse.Department.builder().name("name").build())
                .employment(
                    EmploymentUpdateResponse.Employment.builder()
                        .subtype(EmploymentUpdateResponse.Employment.Subtype.FULL_TIME)
                        .type(EmploymentUpdateResponse.Employment.Type.EMPLOYEE)
                        .build()
                )
                .employmentStatus(EmploymentUpdateResponse.EmploymentStatus.ACTIVE)
                .endDate("end_date")
                .firstName("first_name")
                .income(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate("effective_date")
                        .unit(Income.Unit.YEARLY)
                        .build()
                )
                .addIncomeHistory(
                    Income.builder()
                        .amount(0L)
                        .currency("currency")
                        .effectiveDate("effective_date")
                        .unit(Income.Unit.YEARLY)
                        .build()
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
                        .postalCode("postal_code")
                        .state("state")
                        .name("name")
                        .sourceId("source_id")
                        .build()
                )
                .manager(
                    EmploymentUpdateResponse.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .build()

        val roundtrippedEmploymentUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(employmentUpdateResponse),
                jacksonTypeRef<EmploymentUpdateResponse>(),
            )

        assertThat(roundtrippedEmploymentUpdateResponse).isEqualTo(employmentUpdateResponse)
    }
}
