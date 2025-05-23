// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryEventTest {

    @Test
    fun create() {
        val directoryEvent =
            DirectoryEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(DirectoryEvent.Data.builder().individualId("individual_id").build())
                .eventType(DirectoryEvent.EventType.DIRECTORY_CREATED)
                .build()

        assertThat(directoryEvent.accountId()).isEqualTo("account_id")
        assertThat(directoryEvent.companyId()).isEqualTo("company_id")
        assertThat(directoryEvent.connectionId()).isEqualTo("connection_id")
        assertThat(directoryEvent.data())
            .isEqualTo(DirectoryEvent.Data.builder().individualId("individual_id").build())
        assertThat(directoryEvent.eventType()).isEqualTo(DirectoryEvent.EventType.DIRECTORY_CREATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val directoryEvent =
            DirectoryEvent.builder()
                .accountId("account_id")
                .companyId("company_id")
                .connectionId("connection_id")
                .data(DirectoryEvent.Data.builder().individualId("individual_id").build())
                .eventType(DirectoryEvent.EventType.DIRECTORY_CREATED)
                .build()

        val roundtrippedDirectoryEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directoryEvent),
                jacksonTypeRef<DirectoryEvent>(),
            )

        assertThat(roundtrippedDirectoryEvent).isEqualTo(directoryEvent)
    }
}
