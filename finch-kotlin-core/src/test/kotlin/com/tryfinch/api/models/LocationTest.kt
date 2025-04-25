// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationTest {

    @Test
    fun create() {
        val location =
            Location.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .name("name")
                .sourceId("source_id")
                .build()

        assertThat(location.city()).isEqualTo("city")
        assertThat(location.country()).isEqualTo("country")
        assertThat(location.line1()).isEqualTo("line1")
        assertThat(location.line2()).isEqualTo("line2")
        assertThat(location.postalCode()).isEqualTo("postal_code")
        assertThat(location.state()).isEqualTo("state")
        assertThat(location.name()).isEqualTo("name")
        assertThat(location.sourceId()).isEqualTo("source_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val location =
            Location.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .name("name")
                .sourceId("source_id")
                .build()

        val roundtrippedLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(location),
                jacksonTypeRef<Location>(),
            )

        assertThat(roundtrippedLocation).isEqualTo(location)
    }
}
