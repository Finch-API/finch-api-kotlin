package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomeTest {

    @Test
    fun createIncome() {
        val income =
            Income.builder()
                .amount(123L)
                .currency("string")
                .effectiveDate("string")
                .unit(Income.Unit.YEARLY)
                .build()
        assertThat(income).isNotNull
        assertThat(income.amount()).isEqualTo(123L)
        assertThat(income.currency()).isEqualTo("string")
        assertThat(income.effectiveDate()).isEqualTo("string")
        assertThat(income.unit()).isEqualTo(Income.Unit.YEARLY)
    }
}
