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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

/** Create a new connection (new company/provider pair) with a new account */
class SandboxConnectionCreateParams
private constructor(
    private val body: SandboxConnectionCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The provider associated with the connection */
    fun providerId(): String = body.providerId()

    fun authenticationType(): AuthenticationType? = body.authenticationType()

    /**
     * Optional: the size of the employer to be created with this connection. Defaults to 20. Note
     * that if this is higher than 100, historical payroll data will not be generated, and instead
     * only one pay period will be created.
     */
    fun employeeSize(): Long? = body.employeeSize()

    fun products(): List<String>? = body.products()

    /** The provider associated with the connection */
    fun _providerId(): JsonField<String> = body._providerId()

    fun _authenticationType(): JsonField<AuthenticationType> = body._authenticationType()

    /**
     * Optional: the size of the employer to be created with this connection. Defaults to 20. Note
     * that if this is higher than 100, historical payroll data will not be generated, and instead
     * only one pay period will be created.
     */
    fun _employeeSize(): JsonField<Long> = body._employeeSize()

    fun _products(): JsonField<List<String>> = body._products()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): SandboxConnectionCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SandboxConnectionCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authentication_type")
        @ExcludeMissing
        private val authenticationType: JsonField<AuthenticationType> = JsonMissing.of(),
        @JsonProperty("employee_size")
        @ExcludeMissing
        private val employeeSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("products")
        @ExcludeMissing
        private val products: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The provider associated with the connection */
        fun providerId(): String = providerId.getRequired("provider_id")

        fun authenticationType(): AuthenticationType? =
            authenticationType.getNullable("authentication_type")

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        fun employeeSize(): Long? = employeeSize.getNullable("employee_size")

        fun products(): List<String>? = products.getNullable("products")

        /** The provider associated with the connection */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("authentication_type")
        @ExcludeMissing
        fun _authenticationType(): JsonField<AuthenticationType> = authenticationType

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        @JsonProperty("employee_size")
        @ExcludeMissing
        fun _employeeSize(): JsonField<Long> = employeeSize

        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<String>> = products

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SandboxConnectionCreateBody = apply {
            if (validated) {
                return@apply
            }

            providerId()
            authenticationType()
            employeeSize()
            products()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var providerId: JsonField<String>? = null
            private var authenticationType: JsonField<AuthenticationType> = JsonMissing.of()
            private var employeeSize: JsonField<Long> = JsonMissing.of()
            private var products: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sandboxConnectionCreateBody: SandboxConnectionCreateBody) = apply {
                providerId = sandboxConnectionCreateBody.providerId
                authenticationType = sandboxConnectionCreateBody.authenticationType
                employeeSize = sandboxConnectionCreateBody.employeeSize
                products = sandboxConnectionCreateBody.products.map { it.toMutableList() }
                additionalProperties =
                    sandboxConnectionCreateBody.additionalProperties.toMutableMap()
            }

            /** The provider associated with the connection */
            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /** The provider associated with the connection */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun authenticationType(authenticationType: AuthenticationType) =
                authenticationType(JsonField.of(authenticationType))

            fun authenticationType(authenticationType: JsonField<AuthenticationType>) = apply {
                this.authenticationType = authenticationType
            }

            /**
             * Optional: the size of the employer to be created with this connection. Defaults
             * to 20. Note that if this is higher than 100, historical payroll data will not be
             * generated, and instead only one pay period will be created.
             */
            fun employeeSize(employeeSize: Long) = employeeSize(JsonField.of(employeeSize))

            /**
             * Optional: the size of the employer to be created with this connection. Defaults
             * to 20. Note that if this is higher than 100, historical payroll data will not be
             * generated, and instead only one pay period will be created.
             */
            fun employeeSize(employeeSize: JsonField<Long>) = apply {
                this.employeeSize = employeeSize
            }

            fun products(products: List<String>) = products(JsonField.of(products))

            fun products(products: JsonField<List<String>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

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

            fun build(): SandboxConnectionCreateBody =
                SandboxConnectionCreateBody(
                    checkRequired("providerId", providerId),
                    authenticationType,
                    employeeSize,
                    (products ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxConnectionCreateBody && providerId == other.providerId && authenticationType == other.authenticationType && employeeSize == other.employeeSize && products == other.products && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(providerId, authenticationType, employeeSize, products, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxConnectionCreateBody{providerId=$providerId, authenticationType=$authenticationType, employeeSize=$employeeSize, products=$products, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var body: SandboxConnectionCreateBody.Builder =
            SandboxConnectionCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(sandboxConnectionCreateParams: SandboxConnectionCreateParams) = apply {
            body = sandboxConnectionCreateParams.body.toBuilder()
            additionalHeaders = sandboxConnectionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxConnectionCreateParams.additionalQueryParams.toBuilder()
        }

        /** The provider associated with the connection */
        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        /** The provider associated with the connection */
        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        fun authenticationType(authenticationType: AuthenticationType) = apply {
            body.authenticationType(authenticationType)
        }

        fun authenticationType(authenticationType: JsonField<AuthenticationType>) = apply {
            body.authenticationType(authenticationType)
        }

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        fun employeeSize(employeeSize: Long) = apply { body.employeeSize(employeeSize) }

        /**
         * Optional: the size of the employer to be created with this connection. Defaults to 20.
         * Note that if this is higher than 100, historical payroll data will not be generated, and
         * instead only one pay period will be created.
         */
        fun employeeSize(employeeSize: JsonField<Long>) = apply { body.employeeSize(employeeSize) }

        fun products(products: List<String>) = apply { body.products(products) }

        fun products(products: JsonField<List<String>>) = apply { body.products(products) }

        fun addProduct(product: String) = apply { body.addProduct(product) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): SandboxConnectionCreateParams =
            SandboxConnectionCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is SandboxConnectionCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SandboxConnectionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
