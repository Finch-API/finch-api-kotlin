// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = AccountUpdateResponse.Builder::class)
@NoAutoDetect
class AccountUpdateResponse
private constructor(
    private val connectionId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val authenticationType: JsonField<AuthenticationType>,
    private val companyId: JsonField<String>,
    private val providerId: JsonField<String>,
    private val products: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The ID of the new connection */
    fun connectionId(): String? = connectionId.getNullable("connection_id")

    /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
    fun accountId(): String = accountId.getRequired("account_id")

    fun authenticationType(): AuthenticationType =
        authenticationType.getRequired("authentication_type")

    /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
    fun companyId(): String = companyId.getRequired("company_id")

    /** The ID of the provider associated with the `access_token` */
    fun providerId(): String = providerId.getRequired("provider_id")

    fun products(): List<String> = products.getRequired("products")

    /** The ID of the new connection */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("authentication_type")
    @ExcludeMissing
    fun _authenticationType() = authenticationType

    /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /** The ID of the provider associated with the `access_token` */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonProperty("products") @ExcludeMissing fun _products() = products

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountUpdateResponse = apply {
        if (!validated) {
            connectionId()
            accountId()
            authenticationType()
            companyId()
            providerId()
            products()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var connectionId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var authenticationType: JsonField<AuthenticationType> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountUpdateResponse: AccountUpdateResponse) = apply {
            this.connectionId = accountUpdateResponse.connectionId
            this.accountId = accountUpdateResponse.accountId
            this.authenticationType = accountUpdateResponse.authenticationType
            this.companyId = accountUpdateResponse.companyId
            this.providerId = accountUpdateResponse.providerId
            this.products = accountUpdateResponse.products
            additionalProperties(accountUpdateResponse.additionalProperties)
        }

        /** The ID of the new connection */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** The ID of the new connection */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun authenticationType(authenticationType: AuthenticationType) =
            authenticationType(JsonField.of(authenticationType))

        @JsonProperty("authentication_type")
        @ExcludeMissing
        fun authenticationType(authenticationType: JsonField<AuthenticationType>) = apply {
            this.authenticationType = authenticationType
        }

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** [DEPRECATED] Use `connection_id` to associate a connection with an access token */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** The ID of the provider associated with the `access_token` */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /** The ID of the provider associated with the `access_token` */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun products(products: List<String>) = products(JsonField.of(products))

        @JsonProperty("products")
        @ExcludeMissing
        fun products(products: JsonField<List<String>>) = apply { this.products = products }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): AccountUpdateResponse =
            AccountUpdateResponse(
                connectionId,
                accountId,
                authenticationType,
                companyId,
                providerId,
                products.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class AuthenticationType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CREDENTIAL = of("credential")

            val API_TOKEN = of("api_token")

            val OAUTH = of("oauth")

            val ASSISTED = of("assisted")

            fun of(value: String) = AuthenticationType(JsonField.of(value))
        }

        enum class Known {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
        }

        enum class Value {
            CREDENTIAL,
            API_TOKEN,
            OAUTH,
            ASSISTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDENTIAL -> Value.CREDENTIAL
                API_TOKEN -> Value.API_TOKEN
                OAUTH -> Value.OAUTH
                ASSISTED -> Value.ASSISTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDENTIAL -> Known.CREDENTIAL
                API_TOKEN -> Known.API_TOKEN
                OAUTH -> Known.OAUTH
                ASSISTED -> Known.ASSISTED
                else -> throw FinchInvalidDataException("Unknown AuthenticationType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AuthenticationType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountUpdateResponse && connectionId == other.connectionId && accountId == other.accountId && authenticationType == other.authenticationType && companyId == other.companyId && providerId == other.providerId && products == other.products && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(connectionId, accountId, authenticationType, companyId, providerId, products, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountUpdateResponse{connectionId=$connectionId, accountId=$accountId, authenticationType=$authenticationType, companyId=$companyId, providerId=$providerId, products=$products, additionalProperties=$additionalProperties}"
}
