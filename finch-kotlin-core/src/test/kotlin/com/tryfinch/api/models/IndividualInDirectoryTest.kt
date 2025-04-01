// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualInDirectoryTest {

    @Test
    fun create() {
        val individualInDirectory =
            IndividualInDirectory.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .department(IndividualInDirectory.Department.builder().name("name").build())
                .firstName("first_name")
                .isActive(true)
                .lastName("last_name")
                .manager(
                    IndividualInDirectory.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .build()

        assertThat(individualInDirectory.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(individualInDirectory.department())
            .isEqualTo(IndividualInDirectory.Department.builder().name("name").build())
        assertThat(individualInDirectory.firstName()).isEqualTo("first_name")
        assertThat(individualInDirectory.isActive()).isEqualTo(true)
        assertThat(individualInDirectory.lastName()).isEqualTo("last_name")
        assertThat(individualInDirectory.manager())
            .isEqualTo(
                IndividualInDirectory.Manager.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(individualInDirectory.middleName()).isEqualTo("middle_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualInDirectory =
            IndividualInDirectory.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .department(IndividualInDirectory.Department.builder().name("name").build())
                .firstName("first_name")
                .isActive(true)
                .lastName("last_name")
                .manager(
                    IndividualInDirectory.Manager.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .middleName("middle_name")
                .build()

        val roundtrippedIndividualInDirectory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualInDirectory),
                jacksonTypeRef<IndividualInDirectory>(),
            )

        assertThat(roundtrippedIndividualInDirectory).isEqualTo(individualInDirectory)
    }
}
