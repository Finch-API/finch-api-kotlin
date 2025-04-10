// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobAutomatedCreateParamsTest {

    @Test
    fun create() {
        JobAutomatedCreateParams.builder()
            .body(
                JobAutomatedCreateParams.Body.DataSyncAll.builder()
                    .type(JobAutomatedCreateParams.Body.DataSyncAll.Type.DATA_SYNC_ALL)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            JobAutomatedCreateParams.builder()
                .body(
                    JobAutomatedCreateParams.Body.DataSyncAll.builder()
                        .type(JobAutomatedCreateParams.Body.DataSyncAll.Type.DATA_SYNC_ALL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                JobAutomatedCreateParams.Body.ofDataSyncAll(
                    JobAutomatedCreateParams.Body.DataSyncAll.builder()
                        .type(JobAutomatedCreateParams.Body.DataSyncAll.Type.DATA_SYNC_ALL)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = JobAutomatedCreateParams.builder().build()

        val body = params._body()
    }
}
