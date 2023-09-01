package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EnrolledIndividualTest {

    @Test
    fun createEnrolledIndividual() {
        val enrolledIndividual =
            EnrolledIndividual.builder()
                .body(
                    EnrolledIndividual.Body.builder()
                        .finchCode("string")
                        .message("string")
                        .name("string")
                        .build()
                )
                .code(EnrolledIndividual.Code.OK)
                .individualId("string")
                .build()
        assertThat(enrolledIndividual).isNotNull
        assertThat(enrolledIndividual.body())
            .isEqualTo(
                EnrolledIndividual.Body.builder()
                    .finchCode("string")
                    .message("string")
                    .name("string")
                    .build()
            )
        assertThat(enrolledIndividual.code()).isEqualTo(EnrolledIndividual.Code.OK)
        assertThat(enrolledIndividual.individualId()).isEqualTo("string")
    }
}
