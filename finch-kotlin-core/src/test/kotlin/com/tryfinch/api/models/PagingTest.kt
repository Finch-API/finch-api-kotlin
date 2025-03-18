// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagingTest {

    @Test
    fun create() {
        val paging = Paging.builder().count(0L).offset(0L).build()

        assertThat(paging.count()).isEqualTo(0L)
        assertThat(paging.offset()).isEqualTo(0L)
    }
}
