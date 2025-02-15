// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomeTest {

    @Test
    fun createIncome() {
        val income =
            Income.builder()
                .amount(0L)
                .currency("currency")
                .effectiveDate("effective_date")
                .unit(Income.Unit.YEARLY)
                .build()
        assertThat(income).isNotNull
        assertThat(income.amount()).isEqualTo(0L)
        assertThat(income.currency()).isEqualTo("currency")
        assertThat(income.effectiveDate()).isEqualTo("effective_date")
        assertThat(income.unit()).isEqualTo(Income.Unit.YEARLY)
    }
}
