// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnrolledIndividualTest {

    @Test
    fun create() {
        val enrolledIndividual =
            EnrolledIndividual.builder()
                .body(
                    EnrolledIndividual.Body.builder()
                        .finchCode("finch_code")
                        .message("message")
                        .name("name")
                        .build()
                )
                .code(EnrolledIndividual.Code.OK)
                .individualId("individual_id")
                .build()

        assertThat(enrolledIndividual.body())
            .isEqualTo(
                EnrolledIndividual.Body.builder()
                    .finchCode("finch_code")
                    .message("message")
                    .name("name")
                    .build()
            )
        assertThat(enrolledIndividual.code()).isEqualTo(EnrolledIndividual.Code.OK)
        assertThat(enrolledIndividual.individualId()).isEqualTo("individual_id")
    }
}
