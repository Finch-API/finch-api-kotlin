// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentTest {

    @Test
    fun create() {
        val payment =
            Payment.builder()
                .id("id")
                .companyDebit(Money.builder().amount(0L).currency("currency").build())
                .debitDate("debit_date")
                .employeeTaxes(Money.builder().amount(0L).currency("currency").build())
                .employerTaxes(Money.builder().amount(0L).currency("currency").build())
                .grossPay(Money.builder().amount(0L).currency("currency").build())
                .addIndividualId("string")
                .netPay(Money.builder().amount(0L).currency("currency").build())
                .payDate("pay_date")
                .addPayFrequency(Payment.PayFrequency.ANNUALLY)
                .addPayGroupId("string")
                .payPeriod(
                    Payment.PayPeriod.builder().endDate("end_date").startDate("start_date").build()
                )
                .build()

        assertThat(payment.id()).isEqualTo("id")
        assertThat(payment.companyDebit())
            .isEqualTo(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.debitDate()).isEqualTo("debit_date")
        assertThat(payment.employeeTaxes())
            .isEqualTo(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.employerTaxes())
            .isEqualTo(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.grossPay())
            .isEqualTo(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.individualIds()).containsExactly("string")
        assertThat(payment.netPay())
            .isEqualTo(Money.builder().amount(0L).currency("currency").build())
        assertThat(payment.payDate()).isEqualTo("pay_date")
        assertThat(payment.payFrequencies()).containsExactly(Payment.PayFrequency.ANNUALLY)
        assertThat(payment.payGroupIds()).containsExactly("string")
        assertThat(payment.payPeriod())
            .isEqualTo(
                Payment.PayPeriod.builder().endDate("end_date").startDate("start_date").build()
            )
    }
}
