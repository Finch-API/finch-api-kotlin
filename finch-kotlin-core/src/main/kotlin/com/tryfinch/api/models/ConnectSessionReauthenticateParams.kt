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
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

/** Create a new Connect session for reauthenticating an existing connection */
class ConnectSessionReauthenticateParams
private constructor(
    private val body: ReauthenticateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The ID of the existing connection to reauthenticate
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionId(): String = body.connectionId()

    /**
     * The number of minutes until the session expires (defaults to 43,200, which is 30 days)
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minutesToExpire(): Long = body.minutesToExpire()

    /**
     * The products to request access to (optional for reauthentication)
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun products(): List<ConnectProducts>? = body.products()

    /**
     * The URI to redirect to after the Connect flow is completed
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun redirectUri(): String? = body.redirectUri()

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _connectionId(): JsonField<String> = body._connectionId()

    /**
     * Returns the raw JSON value of [minutesToExpire].
     *
     * Unlike [minutesToExpire], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minutesToExpire(): JsonField<Long> = body._minutesToExpire()

    /**
     * Returns the raw JSON value of [products].
     *
     * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _products(): JsonField<List<ConnectProducts>> = body._products()

    /**
     * Returns the raw JSON value of [redirectUri].
     *
     * Unlike [redirectUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _redirectUri(): JsonField<String> = body._redirectUri()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConnectSessionReauthenticateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .connectionId()
         * .minutesToExpire()
         * .products()
         * .redirectUri()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ConnectSessionReauthenticateParams]. */
    class Builder internal constructor() {

        private var body: ReauthenticateRequest.Builder = ReauthenticateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(connectSessionReauthenticateParams: ConnectSessionReauthenticateParams) =
            apply {
                body = connectSessionReauthenticateParams.body.toBuilder()
                additionalHeaders = connectSessionReauthenticateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    connectSessionReauthenticateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [connectionId]
         * - [minutesToExpire]
         * - [products]
         * - [redirectUri]
         */
        fun body(body: ReauthenticateRequest) = apply { this.body = body.toBuilder() }

        /** The ID of the existing connection to reauthenticate */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            body.connectionId(connectionId)
        }

        /**
         * The number of minutes until the session expires (defaults to 43,200, which is 30 days)
         */
        fun minutesToExpire(minutesToExpire: Long) = apply { body.minutesToExpire(minutesToExpire) }

        /**
         * Sets [Builder.minutesToExpire] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minutesToExpire] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minutesToExpire(minutesToExpire: JsonField<Long>) = apply {
            body.minutesToExpire(minutesToExpire)
        }

        /** The products to request access to (optional for reauthentication) */
        fun products(products: List<ConnectProducts>?) = apply { body.products(products) }

        /**
         * Sets [Builder.products] to an arbitrary JSON value.
         *
         * You should usually call [Builder.products] with a well-typed `List<ConnectProducts>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun products(products: JsonField<List<ConnectProducts>>) = apply { body.products(products) }

        /**
         * Adds a single [ConnectProducts] to [products].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProduct(product: ConnectProducts) = apply { body.addProduct(product) }

        /** The URI to redirect to after the Connect flow is completed */
        fun redirectUri(redirectUri: String?) = apply { body.redirectUri(redirectUri) }

        /**
         * Sets [Builder.redirectUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectUri(redirectUri: JsonField<String>) = apply { body.redirectUri(redirectUri) }

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

        /**
         * Returns an immutable instance of [ConnectSessionReauthenticateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .connectionId()
         * .minutesToExpire()
         * .products()
         * .redirectUri()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConnectSessionReauthenticateParams =
            ConnectSessionReauthenticateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ReauthenticateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class ReauthenticateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val connectionId: JsonField<String>,
        private val minutesToExpire: JsonField<Long>,
        private val products: JsonField<List<ConnectProducts>>,
        private val redirectUri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minutes_to_expire")
            @ExcludeMissing
            minutesToExpire: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("products")
            @ExcludeMissing
            products: JsonField<List<ConnectProducts>> = JsonMissing.of(),
            @JsonProperty("redirect_uri")
            @ExcludeMissing
            redirectUri: JsonField<String> = JsonMissing.of(),
        ) : this(connectionId, minutesToExpire, products, redirectUri, mutableMapOf())

        /**
         * The ID of the existing connection to reauthenticate
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun connectionId(): String = connectionId.getRequired("connection_id")

        /**
         * The number of minutes until the session expires (defaults to 43,200, which is 30 days)
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minutesToExpire(): Long = minutesToExpire.getRequired("minutes_to_expire")

        /**
         * The products to request access to (optional for reauthentication)
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun products(): List<ConnectProducts>? = products.getNullable("products")

        /**
         * The URI to redirect to after the Connect flow is completed
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun redirectUri(): String? = redirectUri.getNullable("redirect_uri")

        /**
         * Returns the raw JSON value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): JsonField<String> = connectionId

        /**
         * Returns the raw JSON value of [minutesToExpire].
         *
         * Unlike [minutesToExpire], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minutes_to_expire")
        @ExcludeMissing
        fun _minutesToExpire(): JsonField<Long> = minutesToExpire

        /**
         * Returns the raw JSON value of [products].
         *
         * Unlike [products], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("products")
        @ExcludeMissing
        fun _products(): JsonField<List<ConnectProducts>> = products

        /**
         * Returns the raw JSON value of [redirectUri].
         *
         * Unlike [redirectUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("redirect_uri")
        @ExcludeMissing
        fun _redirectUri(): JsonField<String> = redirectUri

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ReauthenticateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .connectionId()
             * .minutesToExpire()
             * .products()
             * .redirectUri()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ReauthenticateRequest]. */
        class Builder internal constructor() {

            private var connectionId: JsonField<String>? = null
            private var minutesToExpire: JsonField<Long>? = null
            private var products: JsonField<MutableList<ConnectProducts>>? = null
            private var redirectUri: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(reauthenticateRequest: ReauthenticateRequest) = apply {
                connectionId = reauthenticateRequest.connectionId
                minutesToExpire = reauthenticateRequest.minutesToExpire
                products = reauthenticateRequest.products.map { it.toMutableList() }
                redirectUri = reauthenticateRequest.redirectUri
                additionalProperties = reauthenticateRequest.additionalProperties.toMutableMap()
            }

            /** The ID of the existing connection to reauthenticate */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: JsonField<String>) = apply {
                this.connectionId = connectionId
            }

            /**
             * The number of minutes until the session expires (defaults to 43,200, which is 30
             * days)
             */
            fun minutesToExpire(minutesToExpire: Long) =
                minutesToExpire(JsonField.of(minutesToExpire))

            /**
             * Sets [Builder.minutesToExpire] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minutesToExpire] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minutesToExpire(minutesToExpire: JsonField<Long>) = apply {
                this.minutesToExpire = minutesToExpire
            }

            /** The products to request access to (optional for reauthentication) */
            fun products(products: List<ConnectProducts>?) =
                products(JsonField.ofNullable(products))

            /**
             * Sets [Builder.products] to an arbitrary JSON value.
             *
             * You should usually call [Builder.products] with a well-typed `List<ConnectProducts>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun products(products: JsonField<List<ConnectProducts>>) = apply {
                this.products = products.map { it.toMutableList() }
            }

            /**
             * Adds a single [ConnectProducts] to [products].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProduct(product: ConnectProducts) = apply {
                products =
                    (products ?: JsonField.of(mutableListOf())).also {
                        checkKnown("products", it).add(product)
                    }
            }

            /** The URI to redirect to after the Connect flow is completed */
            fun redirectUri(redirectUri: String?) = redirectUri(JsonField.ofNullable(redirectUri))

            /**
             * Sets [Builder.redirectUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirectUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redirectUri(redirectUri: JsonField<String>) = apply {
                this.redirectUri = redirectUri
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

            /**
             * Returns an immutable instance of [ReauthenticateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .connectionId()
             * .minutesToExpire()
             * .products()
             * .redirectUri()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReauthenticateRequest =
                ReauthenticateRequest(
                    checkRequired("connectionId", connectionId),
                    checkRequired("minutesToExpire", minutesToExpire),
                    checkRequired("products", products).map { it.toImmutable() },
                    checkRequired("redirectUri", redirectUri),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReauthenticateRequest = apply {
            if (validated) {
                return@apply
            }

            connectionId()
            minutesToExpire()
            products()?.forEach { it.validate() }
            redirectUri()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (connectionId.asKnown() == null) 0 else 1) +
                (if (minutesToExpire.asKnown() == null) 0 else 1) +
                (products.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (redirectUri.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReauthenticateRequest &&
                connectionId == other.connectionId &&
                minutesToExpire == other.minutesToExpire &&
                products == other.products &&
                redirectUri == other.redirectUri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(connectionId, minutesToExpire, products, redirectUri, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReauthenticateRequest{connectionId=$connectionId, minutesToExpire=$minutesToExpire, products=$products, redirectUri=$redirectUri, additionalProperties=$additionalProperties}"
    }

    /** The Finch products that can be requested during the Connect flow. */
    class ConnectProducts @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BENEFITS = of("benefits")

            val COMPANY = of("company")

            val DEDUCTION = of("deduction")

            val DIRECTORY = of("directory")

            val DOCUMENTS = of("documents")

            val EMPLOYMENT = of("employment")

            val INDIVIDUAL = of("individual")

            val PAYMENT = of("payment")

            val PAY_STATEMENT = of("pay_statement")

            val SSN = of("ssn")

            fun of(value: String) = ConnectProducts(JsonField.of(value))
        }

        /** An enum containing [ConnectProducts]'s known values. */
        enum class Known {
            BENEFITS,
            COMPANY,
            DEDUCTION,
            DIRECTORY,
            DOCUMENTS,
            EMPLOYMENT,
            INDIVIDUAL,
            PAYMENT,
            PAY_STATEMENT,
            SSN,
        }

        /**
         * An enum containing [ConnectProducts]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConnectProducts] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BENEFITS,
            COMPANY,
            DEDUCTION,
            DIRECTORY,
            DOCUMENTS,
            EMPLOYMENT,
            INDIVIDUAL,
            PAYMENT,
            PAY_STATEMENT,
            SSN,
            /**
             * An enum member indicating that [ConnectProducts] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BENEFITS -> Value.BENEFITS
                COMPANY -> Value.COMPANY
                DEDUCTION -> Value.DEDUCTION
                DIRECTORY -> Value.DIRECTORY
                DOCUMENTS -> Value.DOCUMENTS
                EMPLOYMENT -> Value.EMPLOYMENT
                INDIVIDUAL -> Value.INDIVIDUAL
                PAYMENT -> Value.PAYMENT
                PAY_STATEMENT -> Value.PAY_STATEMENT
                SSN -> Value.SSN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                BENEFITS -> Known.BENEFITS
                COMPANY -> Known.COMPANY
                DEDUCTION -> Known.DEDUCTION
                DIRECTORY -> Known.DIRECTORY
                DOCUMENTS -> Known.DOCUMENTS
                EMPLOYMENT -> Known.EMPLOYMENT
                INDIVIDUAL -> Known.INDIVIDUAL
                PAYMENT -> Known.PAYMENT
                PAY_STATEMENT -> Known.PAY_STATEMENT
                SSN -> Known.SSN
                else -> throw FinchInvalidDataException("Unknown ConnectProducts: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): ConnectProducts = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConnectProducts && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectSessionReauthenticateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConnectSessionReauthenticateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
