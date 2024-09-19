// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DirectoryServiceTest {

    @Test
    fun callCreate() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .clientId("4ab15e51-11ad-49f4-acae-f343b7794375")
                .clientSecret("My Client Secret")
                .build()
        val directoryService = client.sandbox().directory()
        val directoryCreateResponse =
            directoryService.create(
                SandboxDirectoryCreateParams.builder()
                    .body(
                        listOf(
                            SandboxDirectoryCreateParams.IndividualOrEmployment.builder()
                                .classCode("class_code")
                                .customFields(
                                    listOf(
                                        SandboxDirectoryCreateParams.IndividualOrEmployment
                                            .CustomField
                                            .builder()
                                            .name("name")
                                            .value(JsonValue.from(mapOf<String, Any>()))
                                            .build()
                                    )
                                )
                                .department(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Department
                                        .builder()
                                        .name("name")
                                        .build()
                                )
                                .dob("dob")
                                .emails(
                                    listOf(
                                        SandboxDirectoryCreateParams.IndividualOrEmployment.Email
                                            .builder()
                                            .data("data")
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
                                .encryptedSsn("encrypted_ssn")
                                .endDate("end_date")
                                .ethnicity(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Ethnicity
                                        .ASIAN
                                )
                                .firstName("first_name")
                                .gender(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Gender
                                        .FEMALE
                                )
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
                                .manager(
                                    SandboxDirectoryCreateParams.IndividualOrEmployment.Manager
                                        .builder()
                                        .id("id")
                                        .build()
                                )
                                .middleName("middle_name")
                                .phoneNumbers(
                                    listOf(
                                        SandboxDirectoryCreateParams.IndividualOrEmployment
                                            .PhoneNumber
                                            .builder()
                                            .data("data")
                                            .type(
                                                SandboxDirectoryCreateParams.IndividualOrEmployment
                                                    .PhoneNumber
                                                    .Type
                                                    .WORK
                                            )
                                            .build()
                                    )
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
                    .build()
            )
        println(directoryCreateResponse)
    }
}
