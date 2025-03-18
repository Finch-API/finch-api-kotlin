// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualTest {

    @Test
    fun create() {
        val individual =
            Individual.builder()
                .id("id")
                .dob("dob")
                .addEmail(
                    Individual.Email.builder().data("data").type(Individual.Email.Type.WORK).build()
                )
                .encryptedSsn("encrypted_ssn")
                .ethnicity(Individual.Ethnicity.ASIAN)
                .firstName("first_name")
                .gender(Individual.Gender.FEMALE)
                .lastName("last_name")
                .middleName("middle_name")
                .addPhoneNumber(
                    Individual.PhoneNumber.builder()
                        .data("data")
                        .type(Individual.PhoneNumber.Type.WORK)
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
                .ssn("ssn")
                .build()

        assertThat(individual.id()).isEqualTo("id")
        assertThat(individual.dob()).isEqualTo("dob")
        assertThat(individual.emails())
            .containsExactly(
                Individual.Email.builder().data("data").type(Individual.Email.Type.WORK).build()
            )
        assertThat(individual.encryptedSsn()).isEqualTo("encrypted_ssn")
        assertThat(individual.ethnicity()).isEqualTo(Individual.Ethnicity.ASIAN)
        assertThat(individual.firstName()).isEqualTo("first_name")
        assertThat(individual.gender()).isEqualTo(Individual.Gender.FEMALE)
        assertThat(individual.lastName()).isEqualTo("last_name")
        assertThat(individual.middleName()).isEqualTo("middle_name")
        assertThat(individual.phoneNumbers())
            .containsExactly(
                Individual.PhoneNumber.builder()
                    .data("data")
                    .type(Individual.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(individual.preferredName()).isEqualTo("preferred_name")
        assertThat(individual.residence())
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
        assertThat(individual.ssn()).isEqualTo("ssn")
    }
}
