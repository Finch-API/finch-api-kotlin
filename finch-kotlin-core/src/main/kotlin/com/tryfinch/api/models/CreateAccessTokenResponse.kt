// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@NoAutoDetect
class CreateAccessTokenResponse
@JsonCreator
private constructor(
    @JsonProperty("access_token")
    @ExcludeMissing
    private val accessToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("client_type")
    @ExcludeMissing
    private val clientType: JsonField<ClientType> = JsonMissing.of(),
    @JsonProperty("company_id")
    @ExcludeMissing
    private val companyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_id")
    @ExcludeMissing
    private val connectionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("connection_type")
    @ExcludeMissing
    private val connectionType: JsonField<ConnectionType> = JsonMissing.of(),
    @JsonProperty("products")
    @ExcludeMissing
    private val products: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("token_type")
    @ExcludeMissing
    private val tokenType: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The access token for the connection. */
    fun accessToken(): String = accessToken.getRequired("access_token")

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The type of application associated with a token. */
    fun clientType(): ClientType = clientType.getRequired("client_type")

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID. */
    fun companyId(): String = companyId.getRequired("company_id")

    /** The Finch UUID of the connection associated with the `access_token`. */
    fun connectionId(): String = connectionId.getRequired("connection_id")

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

    /**
     * The ID of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    fun customerId(): String? = customerId.getNullable("customer_id")

    /** The RFC 8693 token type (Finch uses `bearer` tokens) */
    fun tokenType(): String? = tokenType.getNullable("token_type")

    /** The access token for the connection. */
    @JsonProperty("access_token")
    @ExcludeMissing
    fun _accessToken(): JsonField<String> = accessToken

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The type of application associated with a token. */
    @JsonProperty("client_type")
    @ExcludeMissing
    fun _clientType(): JsonField<ClientType> = clientType

    /** [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID. */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

    /** The Finch UUID of the connection associated with the `access_token`. */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    /**
     * The type of the connection associated with the token.
     * - `provider` - connection to an external provider
     * - `finch` - finch-generated data.
     */
    @JsonProperty("connection_type")
    @ExcludeMissing
    fun _connectionType(): JsonField<ConnectionType> = connectionType

    /** An array of the authorized products associated with the `access_token`. */
    @JsonProperty("products") @ExcludeMissing fun _products(): JsonField<List<String>> = products

    /** The ID of the provider associated with the `access_token`. */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /**
     * The ID of your customer you provided to Finch when a connect session was created for this
     * connection.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /** The RFC 8693 token type (Finch uses `bearer` tokens) */
    @JsonProperty("token_type") @ExcludeMissing fun _tokenType(): JsonField<String> = tokenType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreateAccessTokenResponse = apply {
        if (validated) {
            return@apply
        }

        accessToken()
        accountId()
        clientType()
        companyId()
        connectionId()
        connectionType()
        products()
        providerId()
        customerId()
        tokenType()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accessToken: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var clientType: JsonField<ClientType>? = null
        private var companyId: JsonField<String>? = null
        private var connectionId: JsonField<String>? = null
        private var connectionType: JsonField<ConnectionType>? = null
        private var products: JsonField<MutableList<String>>? = null
        private var providerId: JsonField<String>? = null
        private var customerId: JsonField<String> = JsonMissing.of()
        private var tokenType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(createAccessTokenResponse: CreateAccessTokenResponse) = apply {
            accessToken = createAccessTokenResponse.accessToken
            accountId = createAccessTokenResponse.accountId
            clientType = createAccessTokenResponse.clientType
            companyId = createAccessTokenResponse.companyId
            connectionId = createAccessTokenResponse.connectionId
            connectionType = createAccessTokenResponse.connectionType
            products = createAccessTokenResponse.products.map { it.toMutableList() }
            providerId = createAccessTokenResponse.providerId
            customerId = createAccessTokenResponse.customerId
            tokenType = createAccessTokenResponse.tokenType
            additionalProperties = createAccessTokenResponse.additionalProperties.toMutableMap()
        }

        /** The access token for the connection. */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /** The access token for the connection. */
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this account ID.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The type of application associated with a token. */
        fun clientType(clientType: ClientType) = clientType(JsonField.of(clientType))

        /** The type of application associated with a token. */
        fun clientType(clientType: JsonField<ClientType>) = apply { this.clientType = clientType }

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID.
         */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Use `connection_id` to identify the connection instead of this company ID.
         */
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** The Finch UUID of the connection associated with the `access_token`. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** The Finch UUID of the connection associated with the `access_token`. */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

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
        fun connectionType(connectionType: JsonField<ConnectionType>) = apply {
            this.connectionType = connectionType
        }

        /** An array of the authorized products associated with the `access_token`. */
        fun products(products: List<String>) = products(JsonField.of(products))

        /** An array of the authorized products associated with the `access_token`. */
        fun products(products: JsonField<List<String>>) = apply {
            this.products = products.map { it.toMutableList() }
        }

        /** An array of the authorized products associated with the `access_token`. */
        fun addProduct(product: String) = apply {
            products =
                (products ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(product)
                }
        }

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /** The ID of the provider associated with the `access_token`. */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        /**
         * The ID of your customer you provided to Finch when a connect session was created for this
         * connection.
         */
        fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

        /**
         * The ID of your customer you provided to Finch when a connect session was created for this
         * connection.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** The RFC 8693 token type (Finch uses `bearer` tokens) */
        fun tokenType(tokenType: String) = tokenType(JsonField.of(tokenType))

        /** The RFC 8693 token type (Finch uses `bearer` tokens) */
        fun tokenType(tokenType: JsonField<String>) = apply { this.tokenType = tokenType }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): CreateAccessTokenResponse =
            CreateAccessTokenResponse(
                checkNotNull(accessToken) { "`accessToken` is required but was not set" },
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(clientType) { "`clientType` is required but was not set" },
                checkNotNull(companyId) { "`companyId` is required but was not set" },
                checkNotNull(connectionId) { "`connectionId` is required but was not set" },
                checkNotNull(connectionType) { "`connectionType` is required but was not set" },
                checkNotNull(products) { "`products` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(providerId) { "`providerId` is required but was not set" },
                customerId,
                tokenType,
                additionalProperties.toImmutable(),
            )
    }

    class ClientType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PRODUCTION = of("production")

            val DEVELOPMENT = of("development")

            val SANDBOX = of("sandbox")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ClientType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ConnectionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PROVIDER = of("provider")

            val FINCH = of("finch")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConnectionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreateAccessTokenResponse && accessToken == other.accessToken && accountId == other.accountId && clientType == other.clientType && companyId == other.companyId && connectionId == other.connectionId && connectionType == other.connectionType && products == other.products && providerId == other.providerId && customerId == other.customerId && tokenType == other.tokenType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accessToken, accountId, clientType, companyId, connectionId, connectionType, products, providerId, customerId, tokenType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateAccessTokenResponse{accessToken=$accessToken, accountId=$accountId, clientType=$clientType, companyId=$companyId, connectionId=$connectionId, connectionType=$connectionType, products=$products, providerId=$providerId, customerId=$customerId, tokenType=$tokenType, additionalProperties=$additionalProperties}"
}
