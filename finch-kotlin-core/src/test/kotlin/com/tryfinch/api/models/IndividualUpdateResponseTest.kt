// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualUpdateResponseTest {

    @Test
    fun createIndividualUpdateResponse() {
        val individualUpdateResponse =
            IndividualUpdateResponse.builder()
                .id("string")
                .dob("string")
                .emails(
                    listOf(
                        IndividualUpdateResponse.Email.builder()
                            .data("string")
                            .type(IndividualUpdateResponse.Email.Type.WORK)
                            .build()
                    )
                )
                .encryptedSsn("string")
                .ethnicity(IndividualUpdateResponse.Ethnicity.ASIAN)
                .firstName("string")
                .gender(IndividualUpdateResponse.Gender.FEMALE)
                .lastName("string")
                .middleName("string")
                .phoneNumbers(
                    listOf(
                        IndividualUpdateResponse.PhoneNumber.builder()
                            .data("string")
                            .type(IndividualUpdateResponse.PhoneNumber.Type.WORK)
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
                .ssn("string")
                .build()
        assertThat(individualUpdateResponse).isNotNull
        assertThat(individualUpdateResponse.id()).isEqualTo("string")
        assertThat(individualUpdateResponse.dob()).isEqualTo("string")
        assertThat(individualUpdateResponse.emails())
            .containsExactly(
                IndividualUpdateResponse.Email.builder()
                    .data("string")
                    .type(IndividualUpdateResponse.Email.Type.WORK)
                    .build()
            )
        assertThat(individualUpdateResponse.encryptedSsn()).isEqualTo("string")
        assertThat(individualUpdateResponse.ethnicity())
            .isEqualTo(IndividualUpdateResponse.Ethnicity.ASIAN)
        assertThat(individualUpdateResponse.firstName()).isEqualTo("string")
        assertThat(individualUpdateResponse.gender())
            .isEqualTo(IndividualUpdateResponse.Gender.FEMALE)
        assertThat(individualUpdateResponse.lastName()).isEqualTo("string")
        assertThat(individualUpdateResponse.middleName()).isEqualTo("string")
        assertThat(individualUpdateResponse.phoneNumbers())
            .containsExactly(
                IndividualUpdateResponse.PhoneNumber.builder()
                    .data("string")
                    .type(IndividualUpdateResponse.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(individualUpdateResponse.preferredName()).isEqualTo("string")
        assertThat(individualUpdateResponse.residence())
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
        assertThat(individualUpdateResponse.ssn()).isEqualTo("string")
    }
}
