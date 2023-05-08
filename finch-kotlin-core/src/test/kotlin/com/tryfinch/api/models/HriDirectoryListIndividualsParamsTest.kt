package com.tryfinch.api.models

import com.tryfinch.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HriDirectoryListIndividualsParamsTest {

    @Test
    fun createHriDirectoryListIndividualsParams() {
        HriDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()
    }

    @Test
    fun getQueryParams() {
        val params = HriDirectoryListIndividualsParams.builder().limit(123L).offset(123L).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("limit", listOf("123"))
        expected.put("offset", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = HriDirectoryListIndividualsParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
