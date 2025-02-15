// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MoneyTest {

    @Test
    fun createMoney() {
        val money = Money.builder().amount(0L).currency("currency").build()
        assertThat(money).isNotNull
        assertThat(money.amount()).isEqualTo(0L)
        assertThat(money.currency()).isEqualTo("currency")
    }
}
