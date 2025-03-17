// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxDirectoryCreateParamsTest {

    @Test
    fun create() {
        SandboxDirectoryCreateParams.builder()
            .addBody(
                SandboxDirectoryCreateParams.IndividualOrEmployment.builder()
                    .classCode("class_code")
                    .addCustomField(
                        SandboxDirectoryCreateParams.IndividualOrEmployment.CustomField.builder()
                            .name("name")
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .department(
                        SandboxDirectoryCreateParams.IndividualOrEmployment.Department.builder()
                            .name("name")
                            .build()
                    )
                    .dob("dob")
                    .addEmail(
                        SandboxDirectoryCreateParams.IndividualOrEmployment.Email.builder()
                            .data("data")
                            .type(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Email.Type.WORK
                            )
                            .build()
                    )
                    .employment(
                        SandboxDirectoryCreateParams.IndividualOrEmployment.Employment.builder()
                            .subtype(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Employment
                                    .Subtype
                                    .FULL_TIME
                            )
                            .type(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.Employment.Type
                                    .EMPLOYEE
                            )
                            .build()
                    )
                    .employmentStatus(
                        SandboxDirectoryCreateParams.IndividualOrEmployment.EmploymentStatus.ACTIVE
                    )
                    .encryptedSsn("encrypted_ssn")
                    .endDate("end_date")
                    .ethnicity(SandboxDirectoryCreateParams.IndividualOrEmployment.Ethnicity.ASIAN)
                    .firstName("first_name")
                    .gender(SandboxDirectoryCreateParams.IndividualOrEmployment.Gender.FEMALE)
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
                    .manager(
                        SandboxDirectoryCreateParams.IndividualOrEmployment.Manager.builder()
                            .id("id")
                            .build()
                    )
                    .middleName("middle_name")
                    .addPhoneNumber(
                        SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber.builder()
                            .data("data")
                            .type(
                                SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber.Type
                                    .WORK
                            )
                            .build()
                    )
                    .preferredName("preferred_name")
                    .residence(
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
                    .sourceId("source_id")
                    .ssn("ssn")
                    .startDate("start_date")
                    .title("title")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxDirectoryCreateParams.builder()
                .addBody(
                    SandboxDirectoryCreateParams.IndividualOrEmployment.builder()
                        .classCode("class_code")
                        .addCustomField(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.CustomField
                                .builder()
                                .name("name")
                                .value(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .department(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Department.builder()
                                .name("name")
                                .build()
                        )
                        .dob("dob")
                        .addEmail(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Email.builder()
                                .data("data")
                                .type(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Email.Type
                                        .WORK
                                )
                                .build()
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
                        .employmentStatus(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.EmploymentStatus
                                .ACTIVE
                        )
                        .encryptedSsn("encrypted_ssn")
                        .endDate("end_date")
                        .ethnicity(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Ethnicity.ASIAN
                        )
                        .firstName("first_name")
                        .gender(SandboxDirectoryCreateParams.IndividualOrEmployment.Gender.FEMALE)
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
                        .manager(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Manager.builder()
                                .id("id")
                                .build()
                        )
                        .middleName("middle_name")
                        .addPhoneNumber(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber
                                .builder()
                                .data("data")
                                .type(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber
                                        .Type
                                        .WORK
                                )
                                .build()
                        )
                        .preferredName("preferred_name")
                        .residence(
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
                        .sourceId("source_id")
                        .ssn("ssn")
                        .startDate("start_date")
                        .title("title")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                listOf(
                    SandboxDirectoryCreateParams.IndividualOrEmployment.builder()
                        .classCode("class_code")
                        .addCustomField(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.CustomField
                                .builder()
                                .name("name")
                                .value(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .department(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Department.builder()
                                .name("name")
                                .build()
                        )
                        .dob("dob")
                        .addEmail(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Email.builder()
                                .data("data")
                                .type(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Email.Type
                                        .WORK
                                )
                                .build()
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
                        .employmentStatus(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.EmploymentStatus
                                .ACTIVE
                        )
                        .encryptedSsn("encrypted_ssn")
                        .endDate("end_date")
                        .ethnicity(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Ethnicity.ASIAN
                        )
                        .firstName("first_name")
                        .gender(SandboxDirectoryCreateParams.IndividualOrEmployment.Gender.FEMALE)
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
                        .manager(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.Manager.builder()
                                .id("id")
                                .build()
                        )
                        .middleName("middle_name")
                        .addPhoneNumber(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber
                                .builder()
                                .data("data")
                                .type(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.PhoneNumber
                                        .Type
                                        .WORK
                                )
                                .build()
                        )
                        .preferredName("preferred_name")
                        .residence(
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
                        .sourceId("source_id")
                        .ssn("ssn")
                        .startDate("start_date")
                        .title("title")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SandboxDirectoryCreateParams.builder().build()

        val body = params._body()
    }
}
