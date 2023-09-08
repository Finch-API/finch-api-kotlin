package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentTest {

    @Test
    fun createPayment() {
        val payment =
            Payment.builder()
                .id("e8b90071-0c11-471c-86e8-e303ef2f6782")
                .companyDebit(Money.builder().amount(123L).currency("string").build())
                .debitDate("string")
                .employeeTaxes(Money.builder().amount(123L).currency("string").build())
                .employerTaxes(Money.builder().amount(123L).currency("string").build())
                .grossPay(Money.builder().amount(123L).currency("string").build())
                .individualIds(listOf("e8b90071-0c11-471c-86e8-e303ef2f6782"))
                .netPay(Money.builder().amount(123L).currency("string").build())
                .payDate("string")
                .payPeriod(
                    Payment.PayPeriod.builder().endDate("string").startDate("string").build()
                )
                .build()
        assertThat(payment).isNotNull
        assertThat(payment.id()).isEqualTo("e8b90071-0c11-471c-86e8-e303ef2f6782")
        assertThat(payment.companyDebit())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.debitDate()).isEqualTo("string")
        assertThat(payment.employeeTaxes())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.employerTaxes())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.grossPay())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.individualIds()).containsExactly("e8b90071-0c11-471c-86e8-e303ef2f6782")
        assertThat(payment.netPay())
            .isEqualTo(Money.builder().amount(123L).currency("string").build())
        assertThat(payment.payDate()).isEqualTo("string")
        assertThat(payment.payPeriod())
            .isEqualTo(Payment.PayPeriod.builder().endDate("string").startDate("string").build())
    }
}
