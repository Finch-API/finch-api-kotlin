package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UnenrolledIndividualTest {

    @Test
    fun createUnenrolledIndividual() {
        val unenrolledIndividual =
            UnenrolledIndividual.builder()
                .body(
                    UnenrolledIndividual.Body.builder()
                        .finchCode("string")
                        .message("string")
                        .name("string")
                        .build()
                )
                .code(123L)
                .individualId("string")
                .build()
        assertThat(unenrolledIndividual).isNotNull
        assertThat(unenrolledIndividual.body())
            .isEqualTo(
                UnenrolledIndividual.Body.builder()
                    .finchCode("string")
                    .message("string")
                    .name("string")
                    .build()
            )
        assertThat(unenrolledIndividual.code()).isEqualTo(123L)
        assertThat(unenrolledIndividual.individualId()).isEqualTo("string")
    }
}
