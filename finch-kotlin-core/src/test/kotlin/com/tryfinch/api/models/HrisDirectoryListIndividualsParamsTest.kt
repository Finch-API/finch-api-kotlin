// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HrisDirectoryListIndividualsParamsTest {

    @Test
    fun createHrisDirectoryListIndividualsParams() {
        HrisDirectoryListIndividualsParams.builder().limit(0L).offset(0L).build()
    }

    @Test
    fun getQueryParams() {
        val params = HrisDirectoryListIndividualsParams.builder().limit(0L).offset(0L).build()
        val expected = QueryParams.builder()
        expected.put("limit", "0")
        expected.put("offset", "0")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = HrisDirectoryListIndividualsParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
