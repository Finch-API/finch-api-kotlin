// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualInDirectoryTest {

    @Test
    fun create() {
        val individualInDirectory =
            IndividualInDirectory.builder()
                .id("id")
                .department(IndividualInDirectory.Department.builder().name("name").build())
                .firstName("first_name")
                .isActive(true)
                .lastName("last_name")
                .manager(IndividualInDirectory.Manager.builder().id("id").build())
                .middleName("middle_name")
                .build()

        assertThat(individualInDirectory.id()).isEqualTo("id")
        assertThat(individualInDirectory.department())
            .isEqualTo(IndividualInDirectory.Department.builder().name("name").build())
        assertThat(individualInDirectory.firstName()).isEqualTo("first_name")
        assertThat(individualInDirectory.isActive()).isEqualTo(true)
        assertThat(individualInDirectory.lastName()).isEqualTo("last_name")
        assertThat(individualInDirectory.manager())
            .isEqualTo(IndividualInDirectory.Manager.builder().id("id").build())
        assertThat(individualInDirectory.middleName()).isEqualTo("middle_name")
    }
}
