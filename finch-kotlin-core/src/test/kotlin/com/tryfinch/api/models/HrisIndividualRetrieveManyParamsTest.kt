// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisIndividualRetrieveManyParamsTest {

    @Test
    fun create() {
        HrisIndividualRetrieveManyParams.builder()
            .options(
                HrisIndividualRetrieveManyParams.Options.builder().addInclude("string").build()
            )
            .addRequest(
                HrisIndividualRetrieveManyParams.Request.builder()
                    .individualId("individual_id")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            HrisIndividualRetrieveManyParams.builder()
                .options(
                    HrisIndividualRetrieveManyParams.Options.builder().addInclude("string").build()
                )
                .addRequest(
                    HrisIndividualRetrieveManyParams.Request.builder()
                        .individualId("individual_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.options())
            .isEqualTo(
                HrisIndividualRetrieveManyParams.Options.builder().addInclude("string").build()
            )
        assertThat(body.requests())
            .containsExactly(
                HrisIndividualRetrieveManyParams.Request.builder()
                    .individualId("individual_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisIndividualRetrieveManyParams.builder().build()

        val body = params._body()
    }
}
