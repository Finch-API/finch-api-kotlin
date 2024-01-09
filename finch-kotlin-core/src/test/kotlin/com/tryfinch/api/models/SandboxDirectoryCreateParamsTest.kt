// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SandboxDirectoryCreateParamsTest {

    @Test
    fun createSandboxDirectoryCreateParams() {
        SandboxDirectoryCreateParams.builder()
            .body(
                listOf(
                    SandboxDirectoryCreateParams.IndividualOrEmployment.builder()
                        .classCode("string")
                        .customFields(
                            listOf(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.CustomField
                                    .builder()
                                    .name("string")
                                    .value(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                        )
                        .department(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Department.builder()
                                .name("string")
                                .build()
                        )
                        .dob("string")
                        .emails(
                            listOf(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Email.builder()
                                    .data("string")
                                    .type(
                                        SandboxDirectoryCreateParams.IndividualOrEmployment.Email
                                            .Type
                                            .WORK
                                    )
                                    .build()
                            )
                        )
                        .employment(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Employment.builder()
                                .subtype(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Employment
                                        .Subtype
                                        .FULL_TIME
                                )
                                .type(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Employment
                                        .Type
                                        .EMPLOYEE
                                )
                                .build()
                        )
                        .encryptedSsn("string")
                        .endDate("string")
                        .ethnicity(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Ethnicity.ASIAN
                        )
                        .firstName("string")
                        .gender(SandboxDirectoryCreateParams.IndividualOrEmployment.Gender.FEMALE)
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
                        .manager(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Manager.builder()
                                .id("string")
                                .build()
                        )
                        .middleName("string")
                        .phoneNumbers(
                            listOf(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber
                                    .builder()
                                    .data("string")
                                    .type(
                                        SandboxDirectoryCreateParams.IndividualOrEmployment
                                            .PhoneNumber
                                            .Type
                                            .WORK
                                    )
                                    .build()
                            )
                        )
                        .preferredName("string")
                        .residence(
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
                        .sourceId("string")
                        .ssn("string")
                        .startDate("string")
                        .title("string")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SandboxDirectoryCreateParams.builder()
                .body(
                    listOf(
                        SandboxDirectoryCreateParams.IndividualOrEmployment.builder()
                            .classCode("string")
                            .customFields(
                                listOf(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.CustomField
                                        .builder()
                                        .name("string")
                                        .value(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                            )
                            .department(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Department
                                    .builder()
                                    .name("string")
                                    .build()
                            )
                            .dob("string")
                            .emails(
                                listOf(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Email
                                        .builder()
                                        .data("string")
                                        .type(
                                            SandboxDirectoryCreateParams.IndividualOrEmployment
                                                .Email
                                                .Type
                                                .WORK
                                        )
                                        .build()
                                )
                            )
                            .employment(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Employment
                                    .builder()
                                    .subtype(
                                        SandboxDirectoryCreateParams.IndividualOrEmployment
                                            .Employment
                                            .Subtype
                                            .FULL_TIME
                                    )
                                    .type(
                                        SandboxDirectoryCreateParams.IndividualOrEmployment
                                            .Employment
                                            .Type
                                            .EMPLOYEE
                                    )
                                    .build()
                            )
                            .encryptedSsn("string")
                            .endDate("string")
                            .ethnicity(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Ethnicity.ASIAN
                            )
                            .firstName("string")
                            .gender(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Gender.FEMALE
                            )
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
                            .manager(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Manager
                                    .builder()
                                    .id("string")
                                    .build()
                            )
                            .middleName("string")
                            .phoneNumbers(
                                listOf(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber
                                        .builder()
                                        .data("string")
                                        .type(
                                            SandboxDirectoryCreateParams.IndividualOrEmployment
                                                .PhoneNumber
                                                .Type
                                                .WORK
                                        )
                                        .build()
                                )
                            )
                            .preferredName("string")
                            .residence(
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
                            .sourceId("string")
                            .ssn("string")
                            .startDate("string")
                            .title("string")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.body())
            .isEqualTo(
                listOf(
                    SandboxDirectoryCreateParams.IndividualOrEmployment.builder()
                        .classCode("string")
                        .customFields(
                            listOf(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.CustomField
                                    .builder()
                                    .name("string")
                                    .value(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                        )
                        .department(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Department.builder()
                                .name("string")
                                .build()
                        )
                        .dob("string")
                        .emails(
                            listOf(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Email.builder()
                                    .data("string")
                                    .type(
                                        SandboxDirectoryCreateParams.IndividualOrEmployment.Email
                                            .Type
                                            .WORK
                                    )
                                    .build()
                            )
                        )
                        .employment(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Employment.builder()
                                .subtype(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Employment
                                        .Subtype
                                        .FULL_TIME
                                )
                                .type(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Employment
                                        .Type
                                        .EMPLOYEE
                                )
                                .build()
                        )
                        .encryptedSsn("string")
                        .endDate("string")
                        .ethnicity(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Ethnicity.ASIAN
                        )
                        .firstName("string")
                        .gender(SandboxDirectoryCreateParams.IndividualOrEmployment.Gender.FEMALE)
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
                        .manager(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Manager.builder()
                                .id("string")
                                .build()
                        )
                        .middleName("string")
                        .phoneNumbers(
                            listOf(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber
                                    .builder()
                                    .data("string")
                                    .type(
                                        SandboxDirectoryCreateParams.IndividualOrEmployment
                                            .PhoneNumber
                                            .Type
                                            .WORK
                                    )
                                    .build()
                            )
                        )
                        .preferredName("string")
                        .residence(
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
                        .sourceId("string")
                        .ssn("string")
                        .startDate("string")
                        .title("string")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SandboxDirectoryCreateParams.builder()
                .body(listOf(SandboxDirectoryCreateParams.IndividualOrEmployment.builder().build()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.body())
            .isEqualTo(
                listOf(SandboxDirectoryCreateParams.IndividualOrEmployment.builder().build())
            )
    }
}