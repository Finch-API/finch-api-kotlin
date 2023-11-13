// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IndividualTest {

    @Test
    fun createIndividual() {
        val individual =
            Individual.builder()
                .id("string")
                .dob("string")
                .emails(
                    listOf(
                        Individual.Email.builder()
                            .data("string")
                            .type(Individual.Email.Type.WORK)
                            .build()
                    )
                )
                .ethnicity(Individual.Ethnicity.ASIAN)
                .firstName("string")
                .gender(Individual.Gender.FEMALE)
                .lastName("string")
                .middleName("string")
                .phoneNumbers(
                    listOf(
                        Individual.PhoneNumber.builder()
                            .data("string")
                            .type(Individual.PhoneNumber.Type.WORK)
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
        assertThat(individual).isNotNull
        assertThat(individual.id()).isEqualTo("string")
        assertThat(individual.dob()).isEqualTo("string")
        assertThat(individual.emails())
            .containsExactly(
                Individual.Email.builder().data("string").type(Individual.Email.Type.WORK).build()
            )
        assertThat(individual.ethnicity()).isEqualTo(Individual.Ethnicity.ASIAN)
        assertThat(individual.firstName()).isEqualTo("string")
        assertThat(individual.gender()).isEqualTo(Individual.Gender.FEMALE)
        assertThat(individual.lastName()).isEqualTo("string")
        assertThat(individual.middleName()).isEqualTo("string")
        assertThat(individual.phoneNumbers())
            .containsExactly(
                Individual.PhoneNumber.builder()
                    .data("string")
                    .type(Individual.PhoneNumber.Type.WORK)
                    .build()
            )
        assertThat(individual.preferredName()).isEqualTo("string")
        assertThat(individual.residence())
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
        assertThat(individual.ssn()).isEqualTo("string")
    }
}
