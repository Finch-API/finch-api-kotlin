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
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = CreateAccessTokenResponse.Builder::class)
@NoAutoDetect
class CreateAccessTokenResponse
private constructor(
    private val accessToken: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val clientType: JsonField<ClientType>,
    private val companyId: JsonField<String>,
    private val connectionType: JsonField<ConnectionType>,
    private val products: JsonField<List<String>>,
    private val providerId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The access token for the connection. */
    fun accessToken(): String = accessToken.getRequired("access_token")

    /** The Finch UUID of the connection associated with the `access_token`. */
    fun connectionId(): String = connectionId.getRequired("connection_id")

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The type of application associated with a token. */
    fun clientType(): ClientType = clientType.getRequired("client_type")

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID. */
    fun companyId(): String = companyId.getRequired("company_id")

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    fun connectionType(): ConnectionType = connectionType.getRequired("connection_type")

    /** An array of the authorized products associated with the `access_token`. */
    fun products(): List<String> = products.getRequired("products")

    /** The ID of the provider associated with the `access_token`. */
    fun providerId(): String = providerId.getRequired("provider_id")

    /** The access token for the connection. */
    @JsonProperty("access_token") @ExcludeMissing fun _accessToken() = accessToken

    /** The Finch UUID of the connection associated with the `access_token`. */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The type of application associated with a token. */
    @JsonProperty("client_type") @ExcludeMissing fun _clientType() = clientType

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID. */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    @JsonProperty("connection_type") @ExcludeMissing fun _connectionType() = connectionType

    /** An array of the authorized products associated with the `access_token`. */
    @JsonProperty("products") @ExcludeMissing fun _products() = products

    /** The ID of the provider associated with the `access_token`. */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CreateAccessTokenResponse = apply {
        if (!validated) {
            accessToken()
            connectionId()
            accountId()
            clientType()
            companyId()
            connectionType()
            products()
            providerId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateAccessTokenResponse &&
            this.accessToken == other.accessToken &&
            this.connectionId == other.connectionId &&
            this.accountId == other.accountId &&
            this.clientType == other.clientType &&
            this.companyId == other.companyId &&
            this.connectionType == other.connectionType &&
            this.products == other.products &&
            this.providerId == other.providerId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accessToken,
                    connectionId,
                    accountId,
                    clientType,
                    companyId,
                    connectionType,
                    products,
                    providerId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CreateAccessTokenResponse{accessToken=$accessToken, connectionId=$connectionId, accountId=$accountId, clientType=$clientType, companyId=$companyId, connectionType=$connectionType, products=$products, providerId=$providerId, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accessToken: JsonField<String> = JsonMissing.of()
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var clientType: JsonField<ClientType> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var connectionType: JsonField<ConnectionType> = JsonMissing.of()
        private var products: JsonField<List<String>> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(createAccessTokenResponse: CreateAccessTokenResponse) = apply {
            this.accessToken = createAccessTokenResponse.accessToken
            this.connectionId = createAccessTokenResponse.connectionId
            this.accountId = createAccessTokenResponse.accountId
            this.clientType = createAccessTokenResponse.clientType
            this.companyId = createAccessTokenResponse.companyId
            this.connectionType = createAccessTokenResponse.connectionType
            this.products = createAccessTokenResponse.products
            this.providerId = createAccessTokenResponse.providerId
            additionalProperties(createAccessTokenResponse.additionalProperties)
        }

        /** The access token for the connection. */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /** The access token for the connection. */
        @JsonProperty("access_token")
        @ExcludeMissing
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** The Finch UUID of the connection associated with the `access_token`. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** The Finch UUID of the connection associated with the `access_token`. */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID.
         */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The type of application associated with a token. */
        fun clientType(clientType: ClientType) = clientType(JsonField.of(clientType))

        /** The type of application associated with a token. */
        @JsonProperty("client_type")
        @ExcludeMissing
        fun clientType(clientType: JsonField<ClientType>) = apply { this.clientType = clientType }

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID.
         */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID.
         */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /**
         * The type of the connection associated with the token.
         * - `provider` - connection to an external provider
         * - `finch` - finch-generated data.
         */
        fun connectionType(connectionType: ConnectionType) =
            connectionType(JsonField.of(connectionType))

        /**
         * The type of the connection associated with the token.
         * - `provider` - connection to an external provider
         * - `finch` - finch-generated data.
         */
        @JsonProperty("connection_type")
        @ExcludeMissing
        fun connectionType(connectionType: JsonField<ConnectionType>) = apply {
            this.connectionType = connectionType
        }

        /** An array of the authorized products associated with the `access_token`. */
        fun products(products: List<String>) = products(JsonField.of(products))

        /** An array of the authorized products associated with the `access_token`. */
        @JsonProperty("products")
        @ExcludeMissing
        fun products(products: JsonField<List<String>>) = apply { this.products = products }

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /** The ID of the provider associated with the `access_token`. */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

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

        fun build(): CreateAccessTokenResponse =
            CreateAccessTokenResponse(
                accessToken,
                connectionId,
                accountId,
                clientType,
                companyId,
                connectionType,
                products.map { it.toUnmodifiable() },
                providerId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class ClientType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ClientType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PRODUCTION = ClientType(JsonField.of("production"))

            val DEVELOPMENT = ClientType(JsonField.of("development"))

            val SANDBOX = ClientType(JsonField.of("sandbox"))

            fun of(value: String) = ClientType(JsonField.of(value))
        }

        enum class Known {
            PRODUCTION,
            DEVELOPMENT,
            SANDBOX,
        }

        enum class Value {
            PRODUCTION,
            DEVELOPMENT,
            SANDBOX,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PRODUCTION -> Value.PRODUCTION
                DEVELOPMENT -> Value.DEVELOPMENT
                SANDBOX -> Value.SANDBOX
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PRODUCTION -> Known.PRODUCTION
                DEVELOPMENT -> Known.DEVELOPMENT
                SANDBOX -> Known.SANDBOX
                else -> throw FinchInvalidDataException("Unknown ClientType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ConnectionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectionType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PROVIDER = ConnectionType(JsonField.of("provider"))

            val FINCH = ConnectionType(JsonField.of("finch"))

            fun of(value: String) = ConnectionType(JsonField.of(value))
        }

        enum class Known {
            PROVIDER,
            FINCH,
        }

        enum class Value {
            PROVIDER,
            FINCH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PROVIDER -> Value.PROVIDER
                FINCH -> Value.FINCH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PROVIDER -> Known.PROVIDER
                FINCH -> Known.FINCH
                else -> throw FinchInvalidDataException("Unknown ConnectionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
