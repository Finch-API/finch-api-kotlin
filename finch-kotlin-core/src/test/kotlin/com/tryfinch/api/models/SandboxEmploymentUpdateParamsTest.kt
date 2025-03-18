// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxEmploymentUpdateParamsTest {

    @Test
    fun create() {
        SandboxEmploymentUpdateParams.builder()
            .individualId("individual_id")
            .classCode("class_code")
            .addCustomField(
                SandboxEmploymentUpdateParams.CustomField.builder()
                    .name("name")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
            .department(SandboxEmploymentUpdateParams.Department.builder().name("name").build())
            .employment(
                SandboxEmploymentUpdateParams.Employment.builder()
                    .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                    .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
                    .build()
            )
            .employmentStatus(SandboxEmploymentUpdateParams.EmploymentStatus.ACTIVE)
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
                    .name("name")
                    .postalCode("postal_code")
                    .sourceId("source_id")
                    .state("state")
                    .build()
            )
            .manager(SandboxEmploymentUpdateParams.Manager.builder().id("id").build())
            .middleName("middle_name")
            .sourceId("source_id")
            .startDate("start_date")
            .title("title")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SandboxEmploymentUpdateParams.builder().individualId("individual_id").build()

        assertThat(params._pathParam(0)).isEqualTo("individual_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SandboxEmploymentUpdateParams.builder()
                .individualId("individual_id")
                .classCode("class_code")
                .addCustomField(
                    SandboxEmploymentUpdateParams.CustomField.builder()
                        .name("name")
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .department(SandboxEmploymentUpdateParams.Department.builder().name("name").build())
                .employment(
                    SandboxEmploymentUpdateParams.Employment.builder()
                        .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                        .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
                        .build()
                )
                .employmentStatus(SandboxEmploymentUpdateParams.EmploymentStatus.ACTIVE)
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
                        .name("name")
                        .postalCode("postal_code")
                        .sourceId("source_id")
                        .state("state")
                        .build()
                )
                .manager(SandboxEmploymentUpdateParams.Manager.builder().id("id").build())
                .middleName("middle_name")
                .sourceId("source_id")
                .startDate("start_date")
                .title("title")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.classCode()).isEqualTo("class_code")
        assertThat(body.customFields())
            .containsExactly(
                SandboxEmploymentUpdateParams.CustomField.builder()
                    .name("name")
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(body.department())
            .isEqualTo(SandboxEmploymentUpdateParams.Department.builder().name("name").build())
        assertThat(body.employment())
            .isEqualTo(
                SandboxEmploymentUpdateParams.Employment.builder()
                    .subtype(SandboxEmploymentUpdateParams.Employment.Subtype.FULL_TIME)
                    .type(SandboxEmploymentUpdateParams.Employment.Type.EMPLOYEE)
                    .build()
            )
        assertThat(body.employmentStatus())
            .isEqualTo(SandboxEmploymentUpdateParams.EmploymentStatus.ACTIVE)
        assertThat(body.endDate()).isEqualTo("end_date")
        assertThat(body.firstName()).isEqualTo("first_name")
        assertThat(body.income())
            .isEqualTo(
                Income.builder()
                    .amount(0L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(body.incomeHistory())
            .containsExactly(
                Income.builder()
                    .amount(0L)
                    .currency("currency")
                    .effectiveDate("effective_date")
                    .unit(Income.Unit.YEARLY)
                    .build()
            )
        assertThat(body.isActive()).isEqualTo(true)
        assertThat(body.lastName()).isEqualTo("last_name")
        assertThat(body.latestRehireDate()).isEqualTo("latest_rehire_date")
        assertThat(body.location())
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
        assertThat(body.manager())
            .isEqualTo(SandboxEmploymentUpdateParams.Manager.builder().id("id").build())
        assertThat(body.middleName()).isEqualTo("middle_name")
        assertThat(body.sourceId()).isEqualTo("source_id")
        assertThat(body.startDate()).isEqualTo("start_date")
        assertThat(body.title()).isEqualTo("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxEmploymentUpdateParams.builder().individualId("individual_id").build()

        val body = params._body()

        assertNotNull(body)
    }
}
