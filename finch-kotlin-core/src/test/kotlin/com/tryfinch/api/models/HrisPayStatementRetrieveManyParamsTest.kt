// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisPayStatementRetrieveManyParamsTest {

    @Test
    fun createHrisPayStatementRetrieveManyParams() {
        HrisPayStatementRetrieveManyParams.builder()
            .requests(
                listOf(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("payment_id")
                        .limit(0L)
                        .offset(0L)
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisPayStatementRetrieveManyParams.Request.builder()
                            .paymentId("payment_id")
                            .limit(0L)
                            .offset(0L)
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("payment_id")
                        .limit(0L)
                        .offset(0L)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            HrisPayStatementRetrieveManyParams.builder()
                .requests(
                    listOf(
                        HrisPayStatementRetrieveManyParams.Request.builder()
                            .paymentId("payment_id")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.requests())
            .isEqualTo(
                listOf(
                    HrisPayStatementRetrieveManyParams.Request.builder()
                        .paymentId("payment_id")
                        .build()
                )
            )
    }
}
