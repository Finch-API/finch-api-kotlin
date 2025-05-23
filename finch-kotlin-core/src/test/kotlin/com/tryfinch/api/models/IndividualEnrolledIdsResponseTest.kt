// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndividualEnrolledIdsResponseTest {

    @Test
    fun create() {
        val individualEnrolledIdsResponse =
            IndividualEnrolledIdsResponse.builder()
                .benefitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addIndividualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(individualEnrolledIdsResponse.benefitId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(individualEnrolledIdsResponse.individualIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val individualEnrolledIdsResponse =
            IndividualEnrolledIdsResponse.builder()
                .benefitId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addIndividualId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedIndividualEnrolledIdsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(individualEnrolledIdsResponse),
                jacksonTypeRef<IndividualEnrolledIdsResponse>(),
            )

        assertThat(roundtrippedIndividualEnrolledIdsResponse)
            .isEqualTo(individualEnrolledIdsResponse)
    }
}
