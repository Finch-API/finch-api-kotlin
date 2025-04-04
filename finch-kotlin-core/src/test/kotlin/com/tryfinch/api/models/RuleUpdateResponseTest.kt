// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleUpdateResponseTest {

    @Test
    fun create() {
        val ruleUpdateResponse =
            RuleUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .attributes(
                    RuleUpdateResponse.Attributes.builder()
                        .metadata(
                            RuleUpdateResponse.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    RuleUpdateResponse.Condition.builder()
                        .field("field")
                        .operator(RuleUpdateResponse.Condition.Operator.EQUALS)
                        .value("value")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(RuleUpdateResponse.EntityType.PAY_STATEMENT_ITEM)
                .priority(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(ruleUpdateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleUpdateResponse.attributes())
            .isEqualTo(
                RuleUpdateResponse.Attributes.builder()
                    .metadata(
                        RuleUpdateResponse.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(ruleUpdateResponse.conditions())
            .containsExactly(
                RuleUpdateResponse.Condition.builder()
                    .field("field")
                    .operator(RuleUpdateResponse.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
        assertThat(ruleUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleUpdateResponse.effectiveEndDate()).isEqualTo("effective_end_date")
        assertThat(ruleUpdateResponse.effectiveStartDate()).isEqualTo("effective_start_date")
        assertThat(ruleUpdateResponse.entityType())
            .isEqualTo(RuleUpdateResponse.EntityType.PAY_STATEMENT_ITEM)
        assertThat(ruleUpdateResponse.priority()).isEqualTo(0L)
        assertThat(ruleUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleUpdateResponse =
            RuleUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .attributes(
                    RuleUpdateResponse.Attributes.builder()
                        .metadata(
                            RuleUpdateResponse.Attributes.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    RuleUpdateResponse.Condition.builder()
                        .field("field")
                        .operator(RuleUpdateResponse.Condition.Operator.EQUALS)
                        .value("value")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(RuleUpdateResponse.EntityType.PAY_STATEMENT_ITEM)
                .priority(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRuleUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleUpdateResponse),
                jacksonTypeRef<RuleUpdateResponse>(),
            )

        assertThat(roundtrippedRuleUpdateResponse).isEqualTo(ruleUpdateResponse)
    }
}
