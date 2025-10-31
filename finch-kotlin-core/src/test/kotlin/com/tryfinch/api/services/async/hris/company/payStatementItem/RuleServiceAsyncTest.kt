// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris.company.payStatementItem

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleCreateParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleDeleteParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleListParams
import com.tryfinch.api.models.HrisCompanyPayStatementItemRuleUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RuleServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val ruleServiceAsync = client.hris().company().payStatementItem().rules()

        val rule =
            ruleServiceAsync.create(
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
                                HrisCompanyPayStatementItemRuleCreateParams.Condition.Operator
                                    .EQUALS
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
            )

        rule.validate()
    }

    @Test
    suspend fun update() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val ruleServiceAsync = client.hris().company().payStatementItem().rules()

        val rule =
            ruleServiceAsync.update(
                HrisCompanyPayStatementItemRuleUpdateParams.builder()
                    .ruleId("rule_id")
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .optionalProperty(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        rule.validate()
    }

    @Test
    suspend fun list() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val ruleServiceAsync = client.hris().company().payStatementItem().rules()

        val page =
            ruleServiceAsync.list(
                HrisCompanyPayStatementItemRuleListParams.builder()
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )

        page.response().validate()
    }

    @Test
    suspend fun delete() {
        val client =
            FinchOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val ruleServiceAsync = client.hris().company().payStatementItem().rules()

        val rule =
            ruleServiceAsync.delete(
                HrisCompanyPayStatementItemRuleDeleteParams.builder()
                    .ruleId("rule_id")
                    .addEntityId("550e8400-e29b-41d4-a716-446655440000")
                    .build()
            )

        rule.validate()
    }
}
