// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HrisCompanyPayStatementItemRuleCreateParamsTest {

    @Test
    fun create() {
        HrisCompanyPayStatementItemRuleCreateParams.builder()
            .addEntityId("550e8400-e29b-41d4-a716-446655440000")
            .attributes(
                HrisCompanyPayStatementItemRuleCreateParams.Attributes.builder()
                    .metadata(
                        HrisCompanyPayStatementItemRuleCreateParams.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
            .addCondition(
                HrisCompanyPayStatementItemRuleCreateParams.Condition.builder()
                    .field("field")
                    .operator(HrisCompanyPayStatementItemRuleCreateParams.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
            .effectiveEndDate("effective_end_date")
            .effectiveStartDate("effective_start_date")
            .entityType(HrisCompanyPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HrisCompanyPayStatementItemRuleCreateParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .attributes(
                    HrisCompanyPayStatementItemRuleCreateParams.Attributes.builder()
                        .metadata(
                            HrisCompanyPayStatementItemRuleCreateParams.Attributes.Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    HrisCompanyPayStatementItemRuleCreateParams.Condition.builder()
                        .field("field")
                        .operator(
                            HrisCompanyPayStatementItemRuleCreateParams.Condition.Operator.EQUALS
                        )
                        .value("value")
                        .build()
                )
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(
                    HrisCompanyPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("entity_ids[]", "550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HrisCompanyPayStatementItemRuleCreateParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            HrisCompanyPayStatementItemRuleCreateParams.builder()
                .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                .attributes(
                    HrisCompanyPayStatementItemRuleCreateParams.Attributes.builder()
                        .metadata(
                            HrisCompanyPayStatementItemRuleCreateParams.Attributes.Metadata
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addCondition(
                    HrisCompanyPayStatementItemRuleCreateParams.Condition.builder()
                        .field("field")
                        .operator(
                            HrisCompanyPayStatementItemRuleCreateParams.Condition.Operator.EQUALS
                        )
                        .value("value")
                        .build()
                )
                .effectiveEndDate("effective_end_date")
                .effectiveStartDate("effective_start_date")
                .entityType(
                    HrisCompanyPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM
                )
                .build()

        val body = params._body()

        assertThat(body.attributes())
            .isEqualTo(
                HrisCompanyPayStatementItemRuleCreateParams.Attributes.builder()
                    .metadata(
                        HrisCompanyPayStatementItemRuleCreateParams.Attributes.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.conditions())
            .containsExactly(
                HrisCompanyPayStatementItemRuleCreateParams.Condition.builder()
                    .field("field")
                    .operator(HrisCompanyPayStatementItemRuleCreateParams.Condition.Operator.EQUALS)
                    .value("value")
                    .build()
            )
        assertThat(body.effectiveEndDate()).isEqualTo("effective_end_date")
        assertThat(body.effectiveStartDate()).isEqualTo("effective_start_date")
        assertThat(body.entityType())
            .isEqualTo(HrisCompanyPayStatementItemRuleCreateParams.EntityType.PAY_STATEMENT_ITEM)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HrisCompanyPayStatementItemRuleCreateParams.builder().build()

        val body = params._body()
    }
}
