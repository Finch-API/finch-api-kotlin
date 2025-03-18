// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentEventTest {

    @Test
    fun create() {
        val paymentEvent =
            PaymentEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(
                    PaymentEvent.PaymentIdentifiers.builder()
                        .payDate("pay_date")
                        .paymentId("payment_id")
                        .build()
                )
                .eventType(PaymentEvent.EventType.PAYMENT_CREATED)
                .build()

        assertThat(paymentEvent.accountId()).isEqualTo("account_id")
        assertThat(paymentEvent.companyId()).isEqualTo("company_id")
        assertThat(paymentEvent.connectionId()).isEqualTo("connection_id")
        assertThat(paymentEvent.data())
            .isEqualTo(
                PaymentEvent.PaymentIdentifiers.builder()
                    .payDate("pay_date")
                    .paymentId("payment_id")
                    .build()
            )
        assertThat(paymentEvent.eventType()).isEqualTo(PaymentEvent.EventType.PAYMENT_CREATED)
    }
}
