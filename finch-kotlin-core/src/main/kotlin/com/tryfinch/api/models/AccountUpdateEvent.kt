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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

class AccountUpdateEvent
private constructor(
    private val accountId: JsonField<String>,
    private val companyId: JsonField<String>,
    private val connectionId: JsonField<String>,
    private val data: JsonField<Data>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_id") @ExcludeMissing companyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connection_id")
        @ExcludeMissing
        connectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(accountId, companyId, connectionId, data, eventType, mutableMapOf())

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .accountId(accountId)
            .companyId(companyId)
            .connectionId(connectionId)
            .build()

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun accountId(): String = accountId.getRequired("account_id")

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun companyId(): String = companyId.getRequired("company_id")

    /**
     * Unique Finch ID of the connection associated with the webhook event.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): String? = connectionId.getNullable("connection_id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Data? = data.getNullable("data")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventType(): EventType? = eventType.getNullable("event_type")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [companyId].
     *
     * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("company_id")
    @ExcludeMissing
    fun _companyId(): JsonField<String> = companyId

    /**
     * Returns the raw JSON value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection_id")
    @ExcludeMissing
    fun _connectionId(): JsonField<String> = connectionId

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

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
         * Returns a mutable builder for constructing an instance of [AccountUpdateEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .accountId()
         * .companyId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountUpdateEvent]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var companyId: JsonField<String>? = null
        private var connectionId: JsonField<String> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountUpdateEvent: AccountUpdateEvent) = apply {
            accountId = accountUpdateEvent.accountId
            companyId = accountUpdateEvent.companyId
            connectionId = accountUpdateEvent.connectionId
            data = accountUpdateEvent.data
            eventType = accountUpdateEvent.eventType
            additionalProperties = accountUpdateEvent.additionalProperties.toMutableMap()
        }

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @Deprecated("deprecated")
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * Sets [Builder.companyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /**
         * Sets [Builder.connectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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
         * Returns an immutable instance of [AccountUpdateEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountId()
         * .companyId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountUpdateEvent =
            AccountUpdateEvent(
                checkRequired("accountId", accountId),
                checkRequired("companyId", companyId),
                connectionId,
                data,
                eventType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountUpdateEvent = apply {
        if (validated) {
            return@apply
        }

        accountId()
        companyId()
        connectionId()
        data()?.validate()
        eventType()?.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (accountId.asKnown() == null) 0 else 1) +
            (if (companyId.asKnown() == null) 0 else 1) +
            (if (connectionId.asKnown() == null) 0 else 1) +
            (data.asKnown()?.validity() ?: 0) +
            (eventType.asKnown()?.validity() ?: 0)

    class Data
    private constructor(
        private val authenticationMethod: JsonField<AuthenticationMethod>,
        private val status: JsonField<ConnectionStatusType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("authentication_method")
            @ExcludeMissing
            authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<ConnectionStatusType> = JsonMissing.of(),
        ) : this(authenticationMethod, status, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authenticationMethod(): AuthenticationMethod =
            authenticationMethod.getRequired("authentication_method")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): ConnectionStatusType = status.getRequired("status")

        /**
         * Returns the raw JSON value of [authenticationMethod].
         *
         * Unlike [authenticationMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("authentication_method")
        @ExcludeMissing
        fun _authenticationMethod(): JsonField<AuthenticationMethod> = authenticationMethod

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<ConnectionStatusType> = status

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .authenticationMethod()
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var authenticationMethod: JsonField<AuthenticationMethod>? = null
            private var status: JsonField<ConnectionStatusType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                authenticationMethod = data.authenticationMethod
                status = data.status
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun authenticationMethod(authenticationMethod: AuthenticationMethod) =
                authenticationMethod(JsonField.of(authenticationMethod))

            /**
             * Sets [Builder.authenticationMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authenticationMethod] with a well-typed
             * [AuthenticationMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun authenticationMethod(authenticationMethod: JsonField<AuthenticationMethod>) =
                apply {
                    this.authenticationMethod = authenticationMethod
                }

            fun status(status: ConnectionStatusType) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [ConnectionStatusType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .authenticationMethod()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("authenticationMethod", authenticationMethod),
                    checkRequired("status", status),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            authenticationMethod().validate()
            status().validate()
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
            (authenticationMethod.asKnown()?.validity() ?: 0) + (status.asKnown()?.validity() ?: 0)

        class AuthenticationMethod
        private constructor(
            private val benefitsSupport: JsonField<BenefitsSupport>,
            private val supportedFields: JsonField<SupportedFields>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("benefits_support")
                @ExcludeMissing
                benefitsSupport: JsonField<BenefitsSupport> = JsonMissing.of(),
                @JsonProperty("supported_fields")
                @ExcludeMissing
                supportedFields: JsonField<SupportedFields> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(benefitsSupport, supportedFields, type, mutableMapOf())

            /**
             * Each benefit type and their supported features. If the benefit type is not supported,
             * the property will be null
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun benefitsSupport(): BenefitsSupport? =
                benefitsSupport.getNullable("benefits_support")

            /**
             * The supported data fields returned by our HR and payroll endpoints
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun supportedFields(): SupportedFields? =
                supportedFields.getNullable("supported_fields")

            /**
             * The type of authentication method.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Type? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [benefitsSupport].
             *
             * Unlike [benefitsSupport], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("benefits_support")
            @ExcludeMissing
            fun _benefitsSupport(): JsonField<BenefitsSupport> = benefitsSupport

            /**
             * Returns the raw JSON value of [supportedFields].
             *
             * Unlike [supportedFields], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("supported_fields")
            @ExcludeMissing
            fun _supportedFields(): JsonField<SupportedFields> = supportedFields

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [AuthenticationMethod].
                 */
                fun builder() = Builder()
            }

            /** A builder for [AuthenticationMethod]. */
            class Builder internal constructor() {

                private var benefitsSupport: JsonField<BenefitsSupport> = JsonMissing.of()
                private var supportedFields: JsonField<SupportedFields> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(authenticationMethod: AuthenticationMethod) = apply {
                    benefitsSupport = authenticationMethod.benefitsSupport
                    supportedFields = authenticationMethod.supportedFields
                    type = authenticationMethod.type
                    additionalProperties = authenticationMethod.additionalProperties.toMutableMap()
                }

                /**
                 * Each benefit type and their supported features. If the benefit type is not
                 * supported, the property will be null
                 */
                fun benefitsSupport(benefitsSupport: BenefitsSupport?) =
                    benefitsSupport(JsonField.ofNullable(benefitsSupport))

                /**
                 * Sets [Builder.benefitsSupport] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.benefitsSupport] with a well-typed
                 * [BenefitsSupport] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun benefitsSupport(benefitsSupport: JsonField<BenefitsSupport>) = apply {
                    this.benefitsSupport = benefitsSupport
                }

                /** The supported data fields returned by our HR and payroll endpoints */
                fun supportedFields(supportedFields: SupportedFields?) =
                    supportedFields(JsonField.ofNullable(supportedFields))

                /**
                 * Sets [Builder.supportedFields] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.supportedFields] with a well-typed
                 * [SupportedFields] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun supportedFields(supportedFields: JsonField<SupportedFields>) = apply {
                    this.supportedFields = supportedFields
                }

                /** The type of authentication method. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AuthenticationMethod].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AuthenticationMethod =
                    AuthenticationMethod(
                        benefitsSupport,
                        supportedFields,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AuthenticationMethod = apply {
                if (validated) {
                    return@apply
                }

                benefitsSupport()?.validate()
                supportedFields()?.validate()
                type()?.validate()
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
                (benefitsSupport.asKnown()?.validity() ?: 0) +
                    (supportedFields.asKnown()?.validity() ?: 0) +
                    (type.asKnown()?.validity() ?: 0)

            /** The supported data fields returned by our HR and payroll endpoints */
            class SupportedFields
            private constructor(
                private val company: JsonField<SupportedCompanyFields>,
                private val directory: JsonField<SupportedDirectoryFields>,
                private val employment: JsonField<SupportedEmploymentFields>,
                private val individual: JsonField<SupportedIndividualFields>,
                private val payGroup: JsonField<SupportedPayGroupFields>,
                private val payStatement: JsonField<SupportedPayStatementFields>,
                private val payment: JsonField<SupportedPaymentFields>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("company")
                    @ExcludeMissing
                    company: JsonField<SupportedCompanyFields> = JsonMissing.of(),
                    @JsonProperty("directory")
                    @ExcludeMissing
                    directory: JsonField<SupportedDirectoryFields> = JsonMissing.of(),
                    @JsonProperty("employment")
                    @ExcludeMissing
                    employment: JsonField<SupportedEmploymentFields> = JsonMissing.of(),
                    @JsonProperty("individual")
                    @ExcludeMissing
                    individual: JsonField<SupportedIndividualFields> = JsonMissing.of(),
                    @JsonProperty("pay_group")
                    @ExcludeMissing
                    payGroup: JsonField<SupportedPayGroupFields> = JsonMissing.of(),
                    @JsonProperty("pay_statement")
                    @ExcludeMissing
                    payStatement: JsonField<SupportedPayStatementFields> = JsonMissing.of(),
                    @JsonProperty("payment")
                    @ExcludeMissing
                    payment: JsonField<SupportedPaymentFields> = JsonMissing.of(),
                ) : this(
                    company,
                    directory,
                    employment,
                    individual,
                    payGroup,
                    payStatement,
                    payment,
                    mutableMapOf(),
                )

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun company(): SupportedCompanyFields? = company.getNullable("company")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun directory(): SupportedDirectoryFields? = directory.getNullable("directory")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun employment(): SupportedEmploymentFields? = employment.getNullable("employment")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun individual(): SupportedIndividualFields? = individual.getNullable("individual")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun payGroup(): SupportedPayGroupFields? = payGroup.getNullable("pay_group")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun payStatement(): SupportedPayStatementFields? =
                    payStatement.getNullable("pay_statement")

                /**
                 * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun payment(): SupportedPaymentFields? = payment.getNullable("payment")

                /**
                 * Returns the raw JSON value of [company].
                 *
                 * Unlike [company], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("company")
                @ExcludeMissing
                fun _company(): JsonField<SupportedCompanyFields> = company

                /**
                 * Returns the raw JSON value of [directory].
                 *
                 * Unlike [directory], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("directory")
                @ExcludeMissing
                fun _directory(): JsonField<SupportedDirectoryFields> = directory

                /**
                 * Returns the raw JSON value of [employment].
                 *
                 * Unlike [employment], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("employment")
                @ExcludeMissing
                fun _employment(): JsonField<SupportedEmploymentFields> = employment

                /**
                 * Returns the raw JSON value of [individual].
                 *
                 * Unlike [individual], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("individual")
                @ExcludeMissing
                fun _individual(): JsonField<SupportedIndividualFields> = individual

                /**
                 * Returns the raw JSON value of [payGroup].
                 *
                 * Unlike [payGroup], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("pay_group")
                @ExcludeMissing
                fun _payGroup(): JsonField<SupportedPayGroupFields> = payGroup

                /**
                 * Returns the raw JSON value of [payStatement].
                 *
                 * Unlike [payStatement], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("pay_statement")
                @ExcludeMissing
                fun _payStatement(): JsonField<SupportedPayStatementFields> = payStatement

                /**
                 * Returns the raw JSON value of [payment].
                 *
                 * Unlike [payment], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("payment")
                @ExcludeMissing
                fun _payment(): JsonField<SupportedPaymentFields> = payment

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
                     * Returns a mutable builder for constructing an instance of [SupportedFields].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [SupportedFields]. */
                class Builder internal constructor() {

                    private var company: JsonField<SupportedCompanyFields> = JsonMissing.of()
                    private var directory: JsonField<SupportedDirectoryFields> = JsonMissing.of()
                    private var employment: JsonField<SupportedEmploymentFields> = JsonMissing.of()
                    private var individual: JsonField<SupportedIndividualFields> = JsonMissing.of()
                    private var payGroup: JsonField<SupportedPayGroupFields> = JsonMissing.of()
                    private var payStatement: JsonField<SupportedPayStatementFields> =
                        JsonMissing.of()
                    private var payment: JsonField<SupportedPaymentFields> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(supportedFields: SupportedFields) = apply {
                        company = supportedFields.company
                        directory = supportedFields.directory
                        employment = supportedFields.employment
                        individual = supportedFields.individual
                        payGroup = supportedFields.payGroup
                        payStatement = supportedFields.payStatement
                        payment = supportedFields.payment
                        additionalProperties = supportedFields.additionalProperties.toMutableMap()
                    }

                    fun company(company: SupportedCompanyFields) = company(JsonField.of(company))

                    /**
                     * Sets [Builder.company] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.company] with a well-typed
                     * [SupportedCompanyFields] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun company(company: JsonField<SupportedCompanyFields>) = apply {
                        this.company = company
                    }

                    fun directory(directory: SupportedDirectoryFields) =
                        directory(JsonField.of(directory))

                    /**
                     * Sets [Builder.directory] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.directory] with a well-typed
                     * [SupportedDirectoryFields] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun directory(directory: JsonField<SupportedDirectoryFields>) = apply {
                        this.directory = directory
                    }

                    fun employment(employment: SupportedEmploymentFields) =
                        employment(JsonField.of(employment))

                    /**
                     * Sets [Builder.employment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.employment] with a well-typed
                     * [SupportedEmploymentFields] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun employment(employment: JsonField<SupportedEmploymentFields>) = apply {
                        this.employment = employment
                    }

                    fun individual(individual: SupportedIndividualFields) =
                        individual(JsonField.of(individual))

                    /**
                     * Sets [Builder.individual] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.individual] with a well-typed
                     * [SupportedIndividualFields] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun individual(individual: JsonField<SupportedIndividualFields>) = apply {
                        this.individual = individual
                    }

                    fun payGroup(payGroup: SupportedPayGroupFields) =
                        payGroup(JsonField.of(payGroup))

                    /**
                     * Sets [Builder.payGroup] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.payGroup] with a well-typed
                     * [SupportedPayGroupFields] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun payGroup(payGroup: JsonField<SupportedPayGroupFields>) = apply {
                        this.payGroup = payGroup
                    }

                    fun payStatement(payStatement: SupportedPayStatementFields) =
                        payStatement(JsonField.of(payStatement))

                    /**
                     * Sets [Builder.payStatement] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.payStatement] with a well-typed
                     * [SupportedPayStatementFields] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun payStatement(payStatement: JsonField<SupportedPayStatementFields>) = apply {
                        this.payStatement = payStatement
                    }

                    fun payment(payment: SupportedPaymentFields) = payment(JsonField.of(payment))

                    /**
                     * Sets [Builder.payment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.payment] with a well-typed
                     * [SupportedPaymentFields] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun payment(payment: JsonField<SupportedPaymentFields>) = apply {
                        this.payment = payment
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [SupportedFields].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): SupportedFields =
                        SupportedFields(
                            company,
                            directory,
                            employment,
                            individual,
                            payGroup,
                            payStatement,
                            payment,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SupportedFields = apply {
                    if (validated) {
                        return@apply
                    }

                    company()?.validate()
                    directory()?.validate()
                    employment()?.validate()
                    individual()?.validate()
                    payGroup()?.validate()
                    payStatement()?.validate()
                    payment()?.validate()
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
                    (company.asKnown()?.validity() ?: 0) +
                        (directory.asKnown()?.validity() ?: 0) +
                        (employment.asKnown()?.validity() ?: 0) +
                        (individual.asKnown()?.validity() ?: 0) +
                        (payGroup.asKnown()?.validity() ?: 0) +
                        (payStatement.asKnown()?.validity() ?: 0) +
                        (payment.asKnown()?.validity() ?: 0)

                class SupportedCompanyFields
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val accounts: JsonField<Accounts>,
                    private val departments: JsonField<Departments>,
                    private val ein: JsonField<Boolean>,
                    private val entity: JsonField<Entity>,
                    private val legalName: JsonField<Boolean>,
                    private val locations: JsonField<Locations>,
                    private val primaryEmail: JsonField<Boolean>,
                    private val primaryPhoneNumber: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("accounts")
                        @ExcludeMissing
                        accounts: JsonField<Accounts> = JsonMissing.of(),
                        @JsonProperty("departments")
                        @ExcludeMissing
                        departments: JsonField<Departments> = JsonMissing.of(),
                        @JsonProperty("ein")
                        @ExcludeMissing
                        ein: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("entity")
                        @ExcludeMissing
                        entity: JsonField<Entity> = JsonMissing.of(),
                        @JsonProperty("legal_name")
                        @ExcludeMissing
                        legalName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("locations")
                        @ExcludeMissing
                        locations: JsonField<Locations> = JsonMissing.of(),
                        @JsonProperty("primary_email")
                        @ExcludeMissing
                        primaryEmail: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("primary_phone_number")
                        @ExcludeMissing
                        primaryPhoneNumber: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(
                        id,
                        accounts,
                        departments,
                        ein,
                        entity,
                        legalName,
                        locations,
                        primaryEmail,
                        primaryPhoneNumber,
                        mutableMapOf(),
                    )

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Boolean? = id.getNullable("id")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun accounts(): Accounts? = accounts.getNullable("accounts")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun departments(): Departments? = departments.getNullable("departments")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun ein(): Boolean? = ein.getNullable("ein")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun entity(): Entity? = entity.getNullable("entity")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun legalName(): Boolean? = legalName.getNullable("legal_name")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun locations(): Locations? = locations.getNullable("locations")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun primaryEmail(): Boolean? = primaryEmail.getNullable("primary_email")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun primaryPhoneNumber(): Boolean? =
                        primaryPhoneNumber.getNullable("primary_phone_number")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    /**
                     * Returns the raw JSON value of [accounts].
                     *
                     * Unlike [accounts], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("accounts")
                    @ExcludeMissing
                    fun _accounts(): JsonField<Accounts> = accounts

                    /**
                     * Returns the raw JSON value of [departments].
                     *
                     * Unlike [departments], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("departments")
                    @ExcludeMissing
                    fun _departments(): JsonField<Departments> = departments

                    /**
                     * Returns the raw JSON value of [ein].
                     *
                     * Unlike [ein], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<Boolean> = ein

                    /**
                     * Returns the raw JSON value of [entity].
                     *
                     * Unlike [entity], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("entity")
                    @ExcludeMissing
                    fun _entity(): JsonField<Entity> = entity

                    /**
                     * Returns the raw JSON value of [legalName].
                     *
                     * Unlike [legalName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("legal_name")
                    @ExcludeMissing
                    fun _legalName(): JsonField<Boolean> = legalName

                    /**
                     * Returns the raw JSON value of [locations].
                     *
                     * Unlike [locations], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("locations")
                    @ExcludeMissing
                    fun _locations(): JsonField<Locations> = locations

                    /**
                     * Returns the raw JSON value of [primaryEmail].
                     *
                     * Unlike [primaryEmail], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("primary_email")
                    @ExcludeMissing
                    fun _primaryEmail(): JsonField<Boolean> = primaryEmail

                    /**
                     * Returns the raw JSON value of [primaryPhoneNumber].
                     *
                     * Unlike [primaryPhoneNumber], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("primary_phone_number")
                    @ExcludeMissing
                    fun _primaryPhoneNumber(): JsonField<Boolean> = primaryPhoneNumber

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
                         * Returns a mutable builder for constructing an instance of
                         * [SupportedCompanyFields].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [SupportedCompanyFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var accounts: JsonField<Accounts> = JsonMissing.of()
                        private var departments: JsonField<Departments> = JsonMissing.of()
                        private var ein: JsonField<Boolean> = JsonMissing.of()
                        private var entity: JsonField<Entity> = JsonMissing.of()
                        private var legalName: JsonField<Boolean> = JsonMissing.of()
                        private var locations: JsonField<Locations> = JsonMissing.of()
                        private var primaryEmail: JsonField<Boolean> = JsonMissing.of()
                        private var primaryPhoneNumber: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedCompanyFields: SupportedCompanyFields) = apply {
                            id = supportedCompanyFields.id
                            accounts = supportedCompanyFields.accounts
                            departments = supportedCompanyFields.departments
                            ein = supportedCompanyFields.ein
                            entity = supportedCompanyFields.entity
                            legalName = supportedCompanyFields.legalName
                            locations = supportedCompanyFields.locations
                            primaryEmail = supportedCompanyFields.primaryEmail
                            primaryPhoneNumber = supportedCompanyFields.primaryPhoneNumber
                            additionalProperties =
                                supportedCompanyFields.additionalProperties.toMutableMap()
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun accounts(accounts: Accounts) = accounts(JsonField.of(accounts))

                        /**
                         * Sets [Builder.accounts] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.accounts] with a well-typed [Accounts]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun accounts(accounts: JsonField<Accounts>) = apply {
                            this.accounts = accounts
                        }

                        fun departments(departments: Departments) =
                            departments(JsonField.of(departments))

                        /**
                         * Sets [Builder.departments] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.departments] with a well-typed
                         * [Departments] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun departments(departments: JsonField<Departments>) = apply {
                            this.departments = departments
                        }

                        fun ein(ein: Boolean) = ein(JsonField.of(ein))

                        /**
                         * Sets [Builder.ein] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.ein] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun ein(ein: JsonField<Boolean>) = apply { this.ein = ein }

                        fun entity(entity: Entity) = entity(JsonField.of(entity))

                        /**
                         * Sets [Builder.entity] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.entity] with a well-typed [Entity] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

                        fun legalName(legalName: Boolean) = legalName(JsonField.of(legalName))

                        /**
                         * Sets [Builder.legalName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.legalName] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun legalName(legalName: JsonField<Boolean>) = apply {
                            this.legalName = legalName
                        }

                        fun locations(locations: Locations) = locations(JsonField.of(locations))

                        /**
                         * Sets [Builder.locations] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.locations] with a well-typed [Locations]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun locations(locations: JsonField<Locations>) = apply {
                            this.locations = locations
                        }

                        fun primaryEmail(primaryEmail: Boolean) =
                            primaryEmail(JsonField.of(primaryEmail))

                        /**
                         * Sets [Builder.primaryEmail] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.primaryEmail] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun primaryEmail(primaryEmail: JsonField<Boolean>) = apply {
                            this.primaryEmail = primaryEmail
                        }

                        fun primaryPhoneNumber(primaryPhoneNumber: Boolean) =
                            primaryPhoneNumber(JsonField.of(primaryPhoneNumber))

                        /**
                         * Sets [Builder.primaryPhoneNumber] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.primaryPhoneNumber] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun primaryPhoneNumber(primaryPhoneNumber: JsonField<Boolean>) = apply {
                            this.primaryPhoneNumber = primaryPhoneNumber
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SupportedCompanyFields].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SupportedCompanyFields =
                            SupportedCompanyFields(
                                id,
                                accounts,
                                departments,
                                ein,
                                entity,
                                legalName,
                                locations,
                                primaryEmail,
                                primaryPhoneNumber,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): SupportedCompanyFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        accounts()?.validate()
                        departments()?.validate()
                        ein()
                        entity()?.validate()
                        legalName()
                        locations()?.validate()
                        primaryEmail()
                        primaryPhoneNumber()
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
                        (if (id.asKnown() == null) 0 else 1) +
                            (accounts.asKnown()?.validity() ?: 0) +
                            (departments.asKnown()?.validity() ?: 0) +
                            (if (ein.asKnown() == null) 0 else 1) +
                            (entity.asKnown()?.validity() ?: 0) +
                            (if (legalName.asKnown() == null) 0 else 1) +
                            (locations.asKnown()?.validity() ?: 0) +
                            (if (primaryEmail.asKnown() == null) 0 else 1) +
                            (if (primaryPhoneNumber.asKnown() == null) 0 else 1)

                    class Accounts
                    private constructor(
                        private val accountName: JsonField<Boolean>,
                        private val accountNumber: JsonField<Boolean>,
                        private val accountType: JsonField<Boolean>,
                        private val institutionName: JsonField<Boolean>,
                        private val routingNumber: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("account_name")
                            @ExcludeMissing
                            accountName: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("account_number")
                            @ExcludeMissing
                            accountNumber: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("account_type")
                            @ExcludeMissing
                            accountType: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("institution_name")
                            @ExcludeMissing
                            institutionName: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("routing_number")
                            @ExcludeMissing
                            routingNumber: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(
                            accountName,
                            accountNumber,
                            accountType,
                            institutionName,
                            routingNumber,
                            mutableMapOf(),
                        )

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun accountName(): Boolean? = accountName.getNullable("account_name")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun accountNumber(): Boolean? = accountNumber.getNullable("account_number")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun accountType(): Boolean? = accountType.getNullable("account_type")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun institutionName(): Boolean? =
                            institutionName.getNullable("institution_name")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun routingNumber(): Boolean? = routingNumber.getNullable("routing_number")

                        /**
                         * Returns the raw JSON value of [accountName].
                         *
                         * Unlike [accountName], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("account_name")
                        @ExcludeMissing
                        fun _accountName(): JsonField<Boolean> = accountName

                        /**
                         * Returns the raw JSON value of [accountNumber].
                         *
                         * Unlike [accountNumber], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun _accountNumber(): JsonField<Boolean> = accountNumber

                        /**
                         * Returns the raw JSON value of [accountType].
                         *
                         * Unlike [accountType], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("account_type")
                        @ExcludeMissing
                        fun _accountType(): JsonField<Boolean> = accountType

                        /**
                         * Returns the raw JSON value of [institutionName].
                         *
                         * Unlike [institutionName], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("institution_name")
                        @ExcludeMissing
                        fun _institutionName(): JsonField<Boolean> = institutionName

                        /**
                         * Returns the raw JSON value of [routingNumber].
                         *
                         * Unlike [routingNumber], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        fun _routingNumber(): JsonField<Boolean> = routingNumber

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
                             * Returns a mutable builder for constructing an instance of [Accounts].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Accounts]. */
                        class Builder internal constructor() {

                            private var accountName: JsonField<Boolean> = JsonMissing.of()
                            private var accountNumber: JsonField<Boolean> = JsonMissing.of()
                            private var accountType: JsonField<Boolean> = JsonMissing.of()
                            private var institutionName: JsonField<Boolean> = JsonMissing.of()
                            private var routingNumber: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(accounts: Accounts) = apply {
                                accountName = accounts.accountName
                                accountNumber = accounts.accountNumber
                                accountType = accounts.accountType
                                institutionName = accounts.institutionName
                                routingNumber = accounts.routingNumber
                                additionalProperties = accounts.additionalProperties.toMutableMap()
                            }

                            fun accountName(accountName: Boolean) =
                                accountName(JsonField.of(accountName))

                            /**
                             * Sets [Builder.accountName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.accountName] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun accountName(accountName: JsonField<Boolean>) = apply {
                                this.accountName = accountName
                            }

                            fun accountNumber(accountNumber: Boolean) =
                                accountNumber(JsonField.of(accountNumber))

                            /**
                             * Sets [Builder.accountNumber] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.accountNumber] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun accountNumber(accountNumber: JsonField<Boolean>) = apply {
                                this.accountNumber = accountNumber
                            }

                            fun accountType(accountType: Boolean) =
                                accountType(JsonField.of(accountType))

                            /**
                             * Sets [Builder.accountType] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.accountType] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun accountType(accountType: JsonField<Boolean>) = apply {
                                this.accountType = accountType
                            }

                            fun institutionName(institutionName: Boolean) =
                                institutionName(JsonField.of(institutionName))

                            /**
                             * Sets [Builder.institutionName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.institutionName] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun institutionName(institutionName: JsonField<Boolean>) = apply {
                                this.institutionName = institutionName
                            }

                            fun routingNumber(routingNumber: Boolean) =
                                routingNumber(JsonField.of(routingNumber))

                            /**
                             * Sets [Builder.routingNumber] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.routingNumber] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun routingNumber(routingNumber: JsonField<Boolean>) = apply {
                                this.routingNumber = routingNumber
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Accounts].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Accounts =
                                Accounts(
                                    accountName,
                                    accountNumber,
                                    accountType,
                                    institutionName,
                                    routingNumber,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Accounts = apply {
                            if (validated) {
                                return@apply
                            }

                            accountName()
                            accountNumber()
                            accountType()
                            institutionName()
                            routingNumber()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (accountName.asKnown() == null) 0 else 1) +
                                (if (accountNumber.asKnown() == null) 0 else 1) +
                                (if (accountType.asKnown() == null) 0 else 1) +
                                (if (institutionName.asKnown() == null) 0 else 1) +
                                (if (routingNumber.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Accounts && accountName == other.accountName && accountNumber == other.accountNumber && accountType == other.accountType && institutionName == other.institutionName && routingNumber == other.routingNumber && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(accountName, accountNumber, accountType, institutionName, routingNumber, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Accounts{accountName=$accountName, accountNumber=$accountNumber, accountType=$accountType, institutionName=$institutionName, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
                    }

                    class Departments
                    private constructor(
                        private val name: JsonField<Boolean>,
                        private val parent: JsonField<Parent>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("parent")
                            @ExcludeMissing
                            parent: JsonField<Parent> = JsonMissing.of(),
                        ) : this(name, parent, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun name(): Boolean? = name.getNullable("name")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun parent(): Parent? = parent.getNullable("parent")

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Boolean> = name

                        /**
                         * Returns the raw JSON value of [parent].
                         *
                         * Unlike [parent], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("parent")
                        @ExcludeMissing
                        fun _parent(): JsonField<Parent> = parent

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
                             * Returns a mutable builder for constructing an instance of
                             * [Departments].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Departments]. */
                        class Builder internal constructor() {

                            private var name: JsonField<Boolean> = JsonMissing.of()
                            private var parent: JsonField<Parent> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(departments: Departments) = apply {
                                name = departments.name
                                parent = departments.parent
                                additionalProperties =
                                    departments.additionalProperties.toMutableMap()
                            }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun parent(parent: Parent) = parent(JsonField.of(parent))

                            /**
                             * Sets [Builder.parent] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.parent] with a well-typed [Parent]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Departments].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Departments =
                                Departments(name, parent, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Departments = apply {
                            if (validated) {
                                return@apply
                            }

                            name()
                            parent()?.validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (name.asKnown() == null) 0 else 1) +
                                (parent.asKnown()?.validity() ?: 0)

                        class Parent
                        private constructor(
                            private val name: JsonField<Boolean>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("name")
                                @ExcludeMissing
                                name: JsonField<Boolean> = JsonMissing.of()
                            ) : this(name, mutableMapOf())

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun name(): Boolean? = name.getNullable("name")

                            /**
                             * Returns the raw JSON value of [name].
                             *
                             * Unlike [name], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [Parent].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [Parent]. */
                            class Builder internal constructor() {

                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(parent: Parent) = apply {
                                    name = parent.name
                                    additionalProperties =
                                        parent.additionalProperties.toMutableMap()
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                /**
                                 * Sets [Builder.name] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.name] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Parent].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Parent =
                                    Parent(name, additionalProperties.toMutableMap())
                            }

                            private var validated: Boolean = false

                            fun validate(): Parent = apply {
                                if (validated) {
                                    return@apply
                                }

                                name()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int = (if (name.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Parent && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Parent{name=$name, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Departments && name == other.name && parent == other.parent && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(name, parent, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Departments{name=$name, parent=$parent, additionalProperties=$additionalProperties}"
                    }

                    class Entity
                    private constructor(
                        private val subtype: JsonField<Boolean>,
                        private val type: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("subtype")
                            @ExcludeMissing
                            subtype: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(subtype, type, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun subtype(): Boolean? = subtype.getNullable("subtype")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun type(): Boolean? = type.getNullable("type")

                        /**
                         * Returns the raw JSON value of [subtype].
                         *
                         * Unlike [subtype], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("subtype")
                        @ExcludeMissing
                        fun _subtype(): JsonField<Boolean> = subtype

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

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
                             * Returns a mutable builder for constructing an instance of [Entity].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Entity]. */
                        class Builder internal constructor() {

                            private var subtype: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(entity: Entity) = apply {
                                subtype = entity.subtype
                                type = entity.type
                                additionalProperties = entity.additionalProperties.toMutableMap()
                            }

                            fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                            /**
                             * Sets [Builder.subtype] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.subtype] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun subtype(subtype: JsonField<Boolean>) = apply {
                                this.subtype = subtype
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Entity].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Entity =
                                Entity(subtype, type, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Entity = apply {
                            if (validated) {
                                return@apply
                            }

                            subtype()
                            type()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (subtype.asKnown() == null) 0 else 1) +
                                (if (type.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Entity && subtype == other.subtype && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Entity{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class Locations
                    private constructor(
                        private val city: JsonField<Boolean>,
                        private val country: JsonField<Boolean>,
                        private val line1: JsonField<Boolean>,
                        private val line2: JsonField<Boolean>,
                        private val postalCode: JsonField<Boolean>,
                        private val state: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("city")
                            @ExcludeMissing
                            city: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("country")
                            @ExcludeMissing
                            country: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("line1")
                            @ExcludeMissing
                            line1: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("line2")
                            @ExcludeMissing
                            line2: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("postal_code")
                            @ExcludeMissing
                            postalCode: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("state")
                            @ExcludeMissing
                            state: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun city(): Boolean? = city.getNullable("city")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun country(): Boolean? = country.getNullable("country")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun line1(): Boolean? = line1.getNullable("line1")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun line2(): Boolean? = line2.getNullable("line2")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun postalCode(): Boolean? = postalCode.getNullable("postal_code")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun state(): Boolean? = state.getNullable("state")

                        /**
                         * Returns the raw JSON value of [city].
                         *
                         * Unlike [city], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<Boolean> = city

                        /**
                         * Returns the raw JSON value of [country].
                         *
                         * Unlike [country], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<Boolean> = country

                        /**
                         * Returns the raw JSON value of [line1].
                         *
                         * Unlike [line1], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun _line1(): JsonField<Boolean> = line1

                        /**
                         * Returns the raw JSON value of [line2].
                         *
                         * Unlike [line2], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun _line2(): JsonField<Boolean> = line2

                        /**
                         * Returns the raw JSON value of [postalCode].
                         *
                         * Unlike [postalCode], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun _postalCode(): JsonField<Boolean> = postalCode

                        /**
                         * Returns the raw JSON value of [state].
                         *
                         * Unlike [state], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<Boolean> = state

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
                             * Returns a mutable builder for constructing an instance of
                             * [Locations].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Locations]. */
                        class Builder internal constructor() {

                            private var city: JsonField<Boolean> = JsonMissing.of()
                            private var country: JsonField<Boolean> = JsonMissing.of()
                            private var line1: JsonField<Boolean> = JsonMissing.of()
                            private var line2: JsonField<Boolean> = JsonMissing.of()
                            private var postalCode: JsonField<Boolean> = JsonMissing.of()
                            private var state: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(locations: Locations) = apply {
                                city = locations.city
                                country = locations.country
                                line1 = locations.line1
                                line2 = locations.line2
                                postalCode = locations.postalCode
                                state = locations.state
                                additionalProperties = locations.additionalProperties.toMutableMap()
                            }

                            fun city(city: Boolean) = city(JsonField.of(city))

                            /**
                             * Sets [Builder.city] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.city] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun city(city: JsonField<Boolean>) = apply { this.city = city }

                            fun country(country: Boolean) = country(JsonField.of(country))

                            /**
                             * Sets [Builder.country] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.country] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun country(country: JsonField<Boolean>) = apply {
                                this.country = country
                            }

                            fun line1(line1: Boolean) = line1(JsonField.of(line1))

                            /**
                             * Sets [Builder.line1] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.line1] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                            fun line2(line2: Boolean) = line2(JsonField.of(line2))

                            /**
                             * Sets [Builder.line2] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.line2] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                            fun postalCode(postalCode: Boolean) =
                                postalCode(JsonField.of(postalCode))

                            /**
                             * Sets [Builder.postalCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.postalCode] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun postalCode(postalCode: JsonField<Boolean>) = apply {
                                this.postalCode = postalCode
                            }

                            fun state(state: Boolean) = state(JsonField.of(state))

                            /**
                             * Sets [Builder.state] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.state] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun state(state: JsonField<Boolean>) = apply { this.state = state }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Locations].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Locations =
                                Locations(
                                    city,
                                    country,
                                    line1,
                                    line2,
                                    postalCode,
                                    state,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Locations = apply {
                            if (validated) {
                                return@apply
                            }

                            city()
                            country()
                            line1()
                            line2()
                            postalCode()
                            state()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (city.asKnown() == null) 0 else 1) +
                                (if (country.asKnown() == null) 0 else 1) +
                                (if (line1.asKnown() == null) 0 else 1) +
                                (if (line2.asKnown() == null) 0 else 1) +
                                (if (postalCode.asKnown() == null) 0 else 1) +
                                (if (state.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Locations && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Locations{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedCompanyFields && id == other.id && accounts == other.accounts && departments == other.departments && ein == other.ein && entity == other.entity && legalName == other.legalName && locations == other.locations && primaryEmail == other.primaryEmail && primaryPhoneNumber == other.primaryPhoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, accounts, departments, ein, entity, legalName, locations, primaryEmail, primaryPhoneNumber, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedCompanyFields{id=$id, accounts=$accounts, departments=$departments, ein=$ein, entity=$entity, legalName=$legalName, locations=$locations, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, additionalProperties=$additionalProperties}"
                }

                class SupportedDirectoryFields
                private constructor(
                    private val individuals: JsonField<Individuals>,
                    private val paging: JsonField<Paging>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("individuals")
                        @ExcludeMissing
                        individuals: JsonField<Individuals> = JsonMissing.of(),
                        @JsonProperty("paging")
                        @ExcludeMissing
                        paging: JsonField<Paging> = JsonMissing.of(),
                    ) : this(individuals, paging, mutableMapOf())

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun individuals(): Individuals? = individuals.getNullable("individuals")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun paging(): Paging? = paging.getNullable("paging")

                    /**
                     * Returns the raw JSON value of [individuals].
                     *
                     * Unlike [individuals], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("individuals")
                    @ExcludeMissing
                    fun _individuals(): JsonField<Individuals> = individuals

                    /**
                     * Returns the raw JSON value of [paging].
                     *
                     * Unlike [paging], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("paging")
                    @ExcludeMissing
                    fun _paging(): JsonField<Paging> = paging

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
                         * Returns a mutable builder for constructing an instance of
                         * [SupportedDirectoryFields].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [SupportedDirectoryFields]. */
                    class Builder internal constructor() {

                        private var individuals: JsonField<Individuals> = JsonMissing.of()
                        private var paging: JsonField<Paging> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedDirectoryFields: SupportedDirectoryFields) =
                            apply {
                                individuals = supportedDirectoryFields.individuals
                                paging = supportedDirectoryFields.paging
                                additionalProperties =
                                    supportedDirectoryFields.additionalProperties.toMutableMap()
                            }

                        fun individuals(individuals: Individuals) =
                            individuals(JsonField.of(individuals))

                        /**
                         * Sets [Builder.individuals] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.individuals] with a well-typed
                         * [Individuals] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun individuals(individuals: JsonField<Individuals>) = apply {
                            this.individuals = individuals
                        }

                        fun paging(paging: Paging) = paging(JsonField.of(paging))

                        /**
                         * Sets [Builder.paging] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.paging] with a well-typed [Paging] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SupportedDirectoryFields].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SupportedDirectoryFields =
                            SupportedDirectoryFields(
                                individuals,
                                paging,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): SupportedDirectoryFields = apply {
                        if (validated) {
                            return@apply
                        }

                        individuals()?.validate()
                        paging()?.validate()
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
                        (individuals.asKnown()?.validity() ?: 0) +
                            (paging.asKnown()?.validity() ?: 0)

                    class Individuals
                    private constructor(
                        private val id: JsonField<Boolean>,
                        private val department: JsonField<Boolean>,
                        private val firstName: JsonField<Boolean>,
                        private val isActive: JsonField<Boolean>,
                        private val lastName: JsonField<Boolean>,
                        private val manager: JsonField<Manager>,
                        private val middleName: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("id")
                            @ExcludeMissing
                            id: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("department")
                            @ExcludeMissing
                            department: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("first_name")
                            @ExcludeMissing
                            firstName: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("is_active")
                            @ExcludeMissing
                            isActive: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("last_name")
                            @ExcludeMissing
                            lastName: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("manager")
                            @ExcludeMissing
                            manager: JsonField<Manager> = JsonMissing.of(),
                            @JsonProperty("middle_name")
                            @ExcludeMissing
                            middleName: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(
                            id,
                            department,
                            firstName,
                            isActive,
                            lastName,
                            manager,
                            middleName,
                            mutableMapOf(),
                        )

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun id(): Boolean? = id.getNullable("id")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun department(): Boolean? = department.getNullable("department")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun firstName(): Boolean? = firstName.getNullable("first_name")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun isActive(): Boolean? = isActive.getNullable("is_active")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun lastName(): Boolean? = lastName.getNullable("last_name")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun manager(): Manager? = manager.getNullable("manager")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun middleName(): Boolean? = middleName.getNullable("middle_name")

                        /**
                         * Returns the raw JSON value of [id].
                         *
                         * Unlike [id], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                        /**
                         * Returns the raw JSON value of [department].
                         *
                         * Unlike [department], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("department")
                        @ExcludeMissing
                        fun _department(): JsonField<Boolean> = department

                        /**
                         * Returns the raw JSON value of [firstName].
                         *
                         * Unlike [firstName], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("first_name")
                        @ExcludeMissing
                        fun _firstName(): JsonField<Boolean> = firstName

                        /**
                         * Returns the raw JSON value of [isActive].
                         *
                         * Unlike [isActive], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("is_active")
                        @ExcludeMissing
                        fun _isActive(): JsonField<Boolean> = isActive

                        /**
                         * Returns the raw JSON value of [lastName].
                         *
                         * Unlike [lastName], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("last_name")
                        @ExcludeMissing
                        fun _lastName(): JsonField<Boolean> = lastName

                        /**
                         * Returns the raw JSON value of [manager].
                         *
                         * Unlike [manager], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("manager")
                        @ExcludeMissing
                        fun _manager(): JsonField<Manager> = manager

                        /**
                         * Returns the raw JSON value of [middleName].
                         *
                         * Unlike [middleName], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("middle_name")
                        @ExcludeMissing
                        fun _middleName(): JsonField<Boolean> = middleName

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
                             * Returns a mutable builder for constructing an instance of
                             * [Individuals].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Individuals]. */
                        class Builder internal constructor() {

                            private var id: JsonField<Boolean> = JsonMissing.of()
                            private var department: JsonField<Boolean> = JsonMissing.of()
                            private var firstName: JsonField<Boolean> = JsonMissing.of()
                            private var isActive: JsonField<Boolean> = JsonMissing.of()
                            private var lastName: JsonField<Boolean> = JsonMissing.of()
                            private var manager: JsonField<Manager> = JsonMissing.of()
                            private var middleName: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(individuals: Individuals) = apply {
                                id = individuals.id
                                department = individuals.department
                                firstName = individuals.firstName
                                isActive = individuals.isActive
                                lastName = individuals.lastName
                                manager = individuals.manager
                                middleName = individuals.middleName
                                additionalProperties =
                                    individuals.additionalProperties.toMutableMap()
                            }

                            fun id(id: Boolean) = id(JsonField.of(id))

                            /**
                             * Sets [Builder.id] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.id] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun id(id: JsonField<Boolean>) = apply { this.id = id }

                            fun department(department: Boolean) =
                                department(JsonField.of(department))

                            /**
                             * Sets [Builder.department] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.department] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun department(department: JsonField<Boolean>) = apply {
                                this.department = department
                            }

                            fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                            /**
                             * Sets [Builder.firstName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.firstName] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun firstName(firstName: JsonField<Boolean>) = apply {
                                this.firstName = firstName
                            }

                            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                            /**
                             * Sets [Builder.isActive] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.isActive] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun isActive(isActive: JsonField<Boolean>) = apply {
                                this.isActive = isActive
                            }

                            fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                            /**
                             * Sets [Builder.lastName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.lastName] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun lastName(lastName: JsonField<Boolean>) = apply {
                                this.lastName = lastName
                            }

                            fun manager(manager: Manager) = manager(JsonField.of(manager))

                            /**
                             * Sets [Builder.manager] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.manager] with a well-typed [Manager]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun manager(manager: JsonField<Manager>) = apply {
                                this.manager = manager
                            }

                            fun middleName(middleName: Boolean) =
                                middleName(JsonField.of(middleName))

                            /**
                             * Sets [Builder.middleName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.middleName] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun middleName(middleName: JsonField<Boolean>) = apply {
                                this.middleName = middleName
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Individuals].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Individuals =
                                Individuals(
                                    id,
                                    department,
                                    firstName,
                                    isActive,
                                    lastName,
                                    manager,
                                    middleName,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Individuals = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
                            department()
                            firstName()
                            isActive()
                            lastName()
                            manager()?.validate()
                            middleName()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (id.asKnown() == null) 0 else 1) +
                                (if (department.asKnown() == null) 0 else 1) +
                                (if (firstName.asKnown() == null) 0 else 1) +
                                (if (isActive.asKnown() == null) 0 else 1) +
                                (if (lastName.asKnown() == null) 0 else 1) +
                                (manager.asKnown()?.validity() ?: 0) +
                                (if (middleName.asKnown() == null) 0 else 1)

                        class Manager
                        private constructor(
                            private val id: JsonField<Boolean>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("id")
                                @ExcludeMissing
                                id: JsonField<Boolean> = JsonMissing.of()
                            ) : this(id, mutableMapOf())

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun id(): Boolean? = id.getNullable("id")

                            /**
                             * Returns the raw JSON value of [id].
                             *
                             * Unlike [id], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [Manager].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [Manager]. */
                            class Builder internal constructor() {

                                private var id: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(manager: Manager) = apply {
                                    id = manager.id
                                    additionalProperties =
                                        manager.additionalProperties.toMutableMap()
                                }

                                fun id(id: Boolean) = id(JsonField.of(id))

                                /**
                                 * Sets [Builder.id] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.id] with a well-typed [Boolean]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun id(id: JsonField<Boolean>) = apply { this.id = id }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Manager].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Manager =
                                    Manager(id, additionalProperties.toMutableMap())
                            }

                            private var validated: Boolean = false

                            fun validate(): Manager = apply {
                                if (validated) {
                                    return@apply
                                }

                                id()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int = (if (id.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Manager && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Manager{id=$id, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Individuals && id == other.id && department == other.department && firstName == other.firstName && isActive == other.isActive && lastName == other.lastName && manager == other.manager && middleName == other.middleName && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(id, department, firstName, isActive, lastName, manager, middleName, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Individuals{id=$id, department=$department, firstName=$firstName, isActive=$isActive, lastName=$lastName, manager=$manager, middleName=$middleName, additionalProperties=$additionalProperties}"
                    }

                    class Paging
                    private constructor(
                        private val count: JsonField<Boolean>,
                        private val offset: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("count")
                            @ExcludeMissing
                            count: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("offset")
                            @ExcludeMissing
                            offset: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(count, offset, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun count(): Boolean? = count.getNullable("count")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun offset(): Boolean? = offset.getNullable("offset")

                        /**
                         * Returns the raw JSON value of [count].
                         *
                         * Unlike [count], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("count")
                        @ExcludeMissing
                        fun _count(): JsonField<Boolean> = count

                        /**
                         * Returns the raw JSON value of [offset].
                         *
                         * Unlike [offset], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("offset")
                        @ExcludeMissing
                        fun _offset(): JsonField<Boolean> = offset

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
                             * Returns a mutable builder for constructing an instance of [Paging].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Paging]. */
                        class Builder internal constructor() {

                            private var count: JsonField<Boolean> = JsonMissing.of()
                            private var offset: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(paging: Paging) = apply {
                                count = paging.count
                                offset = paging.offset
                                additionalProperties = paging.additionalProperties.toMutableMap()
                            }

                            fun count(count: Boolean) = count(JsonField.of(count))

                            /**
                             * Sets [Builder.count] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.count] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun count(count: JsonField<Boolean>) = apply { this.count = count }

                            fun offset(offset: Boolean) = offset(JsonField.of(offset))

                            /**
                             * Sets [Builder.offset] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.offset] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun offset(offset: JsonField<Boolean>) = apply { this.offset = offset }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Paging].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Paging =
                                Paging(count, offset, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Paging = apply {
                            if (validated) {
                                return@apply
                            }

                            count()
                            offset()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (count.asKnown() == null) 0 else 1) +
                                (if (offset.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Paging && count == other.count && offset == other.offset && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(count, offset, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Paging{count=$count, offset=$offset, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedDirectoryFields && individuals == other.individuals && paging == other.paging && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(individuals, paging, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedDirectoryFields{individuals=$individuals, paging=$paging, additionalProperties=$additionalProperties}"
                }

                class SupportedEmploymentFields
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val classCode: JsonField<Boolean>,
                    private val customFields: JsonField<Boolean>,
                    private val department: JsonField<Department>,
                    private val employment: JsonField<Employment>,
                    private val employmentStatus: JsonField<Boolean>,
                    private val endDate: JsonField<Boolean>,
                    private val firstName: JsonField<Boolean>,
                    private val income: JsonField<Income>,
                    private val incomeHistory: JsonField<Boolean>,
                    private val isActive: JsonField<Boolean>,
                    private val lastName: JsonField<Boolean>,
                    private val location: JsonField<Location>,
                    private val manager: JsonField<Manager>,
                    private val middleName: JsonField<Boolean>,
                    private val startDate: JsonField<Boolean>,
                    private val title: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("class_code")
                        @ExcludeMissing
                        classCode: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("custom_fields")
                        @ExcludeMissing
                        customFields: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("department")
                        @ExcludeMissing
                        department: JsonField<Department> = JsonMissing.of(),
                        @JsonProperty("employment")
                        @ExcludeMissing
                        employment: JsonField<Employment> = JsonMissing.of(),
                        @JsonProperty("employment_status")
                        @ExcludeMissing
                        employmentStatus: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("end_date")
                        @ExcludeMissing
                        endDate: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("first_name")
                        @ExcludeMissing
                        firstName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("income")
                        @ExcludeMissing
                        income: JsonField<Income> = JsonMissing.of(),
                        @JsonProperty("income_history")
                        @ExcludeMissing
                        incomeHistory: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("is_active")
                        @ExcludeMissing
                        isActive: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("last_name")
                        @ExcludeMissing
                        lastName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("location")
                        @ExcludeMissing
                        location: JsonField<Location> = JsonMissing.of(),
                        @JsonProperty("manager")
                        @ExcludeMissing
                        manager: JsonField<Manager> = JsonMissing.of(),
                        @JsonProperty("middle_name")
                        @ExcludeMissing
                        middleName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("start_date")
                        @ExcludeMissing
                        startDate: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("title")
                        @ExcludeMissing
                        title: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(
                        id,
                        classCode,
                        customFields,
                        department,
                        employment,
                        employmentStatus,
                        endDate,
                        firstName,
                        income,
                        incomeHistory,
                        isActive,
                        lastName,
                        location,
                        manager,
                        middleName,
                        startDate,
                        title,
                        mutableMapOf(),
                    )

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Boolean? = id.getNullable("id")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun classCode(): Boolean? = classCode.getNullable("class_code")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun customFields(): Boolean? = customFields.getNullable("custom_fields")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun department(): Department? = department.getNullable("department")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun employment(): Employment? = employment.getNullable("employment")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun employmentStatus(): Boolean? =
                        employmentStatus.getNullable("employment_status")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun endDate(): Boolean? = endDate.getNullable("end_date")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun firstName(): Boolean? = firstName.getNullable("first_name")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun income(): Income? = income.getNullable("income")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun incomeHistory(): Boolean? = incomeHistory.getNullable("income_history")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun isActive(): Boolean? = isActive.getNullable("is_active")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun lastName(): Boolean? = lastName.getNullable("last_name")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun location(): Location? = location.getNullable("location")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun manager(): Manager? = manager.getNullable("manager")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun middleName(): Boolean? = middleName.getNullable("middle_name")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun startDate(): Boolean? = startDate.getNullable("start_date")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun title(): Boolean? = title.getNullable("title")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    /**
                     * Returns the raw JSON value of [classCode].
                     *
                     * Unlike [classCode], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("class_code")
                    @ExcludeMissing
                    fun _classCode(): JsonField<Boolean> = classCode

                    /**
                     * Returns the raw JSON value of [customFields].
                     *
                     * Unlike [customFields], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("custom_fields")
                    @ExcludeMissing
                    fun _customFields(): JsonField<Boolean> = customFields

                    /**
                     * Returns the raw JSON value of [department].
                     *
                     * Unlike [department], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("department")
                    @ExcludeMissing
                    fun _department(): JsonField<Department> = department

                    /**
                     * Returns the raw JSON value of [employment].
                     *
                     * Unlike [employment], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("employment")
                    @ExcludeMissing
                    fun _employment(): JsonField<Employment> = employment

                    /**
                     * Returns the raw JSON value of [employmentStatus].
                     *
                     * Unlike [employmentStatus], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("employment_status")
                    @ExcludeMissing
                    fun _employmentStatus(): JsonField<Boolean> = employmentStatus

                    /**
                     * Returns the raw JSON value of [endDate].
                     *
                     * Unlike [endDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("end_date")
                    @ExcludeMissing
                    fun _endDate(): JsonField<Boolean> = endDate

                    /**
                     * Returns the raw JSON value of [firstName].
                     *
                     * Unlike [firstName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("first_name")
                    @ExcludeMissing
                    fun _firstName(): JsonField<Boolean> = firstName

                    /**
                     * Returns the raw JSON value of [income].
                     *
                     * Unlike [income], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("income")
                    @ExcludeMissing
                    fun _income(): JsonField<Income> = income

                    /**
                     * Returns the raw JSON value of [incomeHistory].
                     *
                     * Unlike [incomeHistory], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("income_history")
                    @ExcludeMissing
                    fun _incomeHistory(): JsonField<Boolean> = incomeHistory

                    /**
                     * Returns the raw JSON value of [isActive].
                     *
                     * Unlike [isActive], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("is_active")
                    @ExcludeMissing
                    fun _isActive(): JsonField<Boolean> = isActive

                    /**
                     * Returns the raw JSON value of [lastName].
                     *
                     * Unlike [lastName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("last_name")
                    @ExcludeMissing
                    fun _lastName(): JsonField<Boolean> = lastName

                    /**
                     * Returns the raw JSON value of [location].
                     *
                     * Unlike [location], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("location")
                    @ExcludeMissing
                    fun _location(): JsonField<Location> = location

                    /**
                     * Returns the raw JSON value of [manager].
                     *
                     * Unlike [manager], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("manager")
                    @ExcludeMissing
                    fun _manager(): JsonField<Manager> = manager

                    /**
                     * Returns the raw JSON value of [middleName].
                     *
                     * Unlike [middleName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    fun _middleName(): JsonField<Boolean> = middleName

                    /**
                     * Returns the raw JSON value of [startDate].
                     *
                     * Unlike [startDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("start_date")
                    @ExcludeMissing
                    fun _startDate(): JsonField<Boolean> = startDate

                    /**
                     * Returns the raw JSON value of [title].
                     *
                     * Unlike [title], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<Boolean> = title

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
                         * Returns a mutable builder for constructing an instance of
                         * [SupportedEmploymentFields].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [SupportedEmploymentFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var classCode: JsonField<Boolean> = JsonMissing.of()
                        private var customFields: JsonField<Boolean> = JsonMissing.of()
                        private var department: JsonField<Department> = JsonMissing.of()
                        private var employment: JsonField<Employment> = JsonMissing.of()
                        private var employmentStatus: JsonField<Boolean> = JsonMissing.of()
                        private var endDate: JsonField<Boolean> = JsonMissing.of()
                        private var firstName: JsonField<Boolean> = JsonMissing.of()
                        private var income: JsonField<Income> = JsonMissing.of()
                        private var incomeHistory: JsonField<Boolean> = JsonMissing.of()
                        private var isActive: JsonField<Boolean> = JsonMissing.of()
                        private var lastName: JsonField<Boolean> = JsonMissing.of()
                        private var location: JsonField<Location> = JsonMissing.of()
                        private var manager: JsonField<Manager> = JsonMissing.of()
                        private var middleName: JsonField<Boolean> = JsonMissing.of()
                        private var startDate: JsonField<Boolean> = JsonMissing.of()
                        private var title: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedEmploymentFields: SupportedEmploymentFields) =
                            apply {
                                id = supportedEmploymentFields.id
                                classCode = supportedEmploymentFields.classCode
                                customFields = supportedEmploymentFields.customFields
                                department = supportedEmploymentFields.department
                                employment = supportedEmploymentFields.employment
                                employmentStatus = supportedEmploymentFields.employmentStatus
                                endDate = supportedEmploymentFields.endDate
                                firstName = supportedEmploymentFields.firstName
                                income = supportedEmploymentFields.income
                                incomeHistory = supportedEmploymentFields.incomeHistory
                                isActive = supportedEmploymentFields.isActive
                                lastName = supportedEmploymentFields.lastName
                                location = supportedEmploymentFields.location
                                manager = supportedEmploymentFields.manager
                                middleName = supportedEmploymentFields.middleName
                                startDate = supportedEmploymentFields.startDate
                                title = supportedEmploymentFields.title
                                additionalProperties =
                                    supportedEmploymentFields.additionalProperties.toMutableMap()
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun classCode(classCode: Boolean) = classCode(JsonField.of(classCode))

                        /**
                         * Sets [Builder.classCode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.classCode] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun classCode(classCode: JsonField<Boolean>) = apply {
                            this.classCode = classCode
                        }

                        fun customFields(customFields: Boolean) =
                            customFields(JsonField.of(customFields))

                        /**
                         * Sets [Builder.customFields] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.customFields] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun customFields(customFields: JsonField<Boolean>) = apply {
                            this.customFields = customFields
                        }

                        fun department(department: Department) =
                            department(JsonField.of(department))

                        /**
                         * Sets [Builder.department] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.department] with a well-typed
                         * [Department] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun department(department: JsonField<Department>) = apply {
                            this.department = department
                        }

                        fun employment(employment: Employment) =
                            employment(JsonField.of(employment))

                        /**
                         * Sets [Builder.employment] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.employment] with a well-typed
                         * [Employment] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun employment(employment: JsonField<Employment>) = apply {
                            this.employment = employment
                        }

                        fun employmentStatus(employmentStatus: Boolean) =
                            employmentStatus(JsonField.of(employmentStatus))

                        /**
                         * Sets [Builder.employmentStatus] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.employmentStatus] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun employmentStatus(employmentStatus: JsonField<Boolean>) = apply {
                            this.employmentStatus = employmentStatus
                        }

                        fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                        /**
                         * Sets [Builder.endDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.endDate] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun endDate(endDate: JsonField<Boolean>) = apply { this.endDate = endDate }

                        fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                        /**
                         * Sets [Builder.firstName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.firstName] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun firstName(firstName: JsonField<Boolean>) = apply {
                            this.firstName = firstName
                        }

                        fun income(income: Income) = income(JsonField.of(income))

                        /**
                         * Sets [Builder.income] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.income] with a well-typed [Income] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun income(income: JsonField<Income>) = apply { this.income = income }

                        fun incomeHistory(incomeHistory: Boolean) =
                            incomeHistory(JsonField.of(incomeHistory))

                        /**
                         * Sets [Builder.incomeHistory] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.incomeHistory] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun incomeHistory(incomeHistory: JsonField<Boolean>) = apply {
                            this.incomeHistory = incomeHistory
                        }

                        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                        /**
                         * Sets [Builder.isActive] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isActive] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isActive(isActive: JsonField<Boolean>) = apply {
                            this.isActive = isActive
                        }

                        fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                        /**
                         * Sets [Builder.lastName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lastName] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lastName(lastName: JsonField<Boolean>) = apply {
                            this.lastName = lastName
                        }

                        fun location(location: Location) = location(JsonField.of(location))

                        /**
                         * Sets [Builder.location] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.location] with a well-typed [Location]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun location(location: JsonField<Location>) = apply {
                            this.location = location
                        }

                        fun manager(manager: Manager) = manager(JsonField.of(manager))

                        /**
                         * Sets [Builder.manager] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.manager] with a well-typed [Manager]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

                        fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                        /**
                         * Sets [Builder.middleName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.middleName] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun middleName(middleName: JsonField<Boolean>) = apply {
                            this.middleName = middleName
                        }

                        fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                        /**
                         * Sets [Builder.startDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.startDate] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun startDate(startDate: JsonField<Boolean>) = apply {
                            this.startDate = startDate
                        }

                        fun title(title: Boolean) = title(JsonField.of(title))

                        /**
                         * Sets [Builder.title] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.title] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun title(title: JsonField<Boolean>) = apply { this.title = title }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SupportedEmploymentFields].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SupportedEmploymentFields =
                            SupportedEmploymentFields(
                                id,
                                classCode,
                                customFields,
                                department,
                                employment,
                                employmentStatus,
                                endDate,
                                firstName,
                                income,
                                incomeHistory,
                                isActive,
                                lastName,
                                location,
                                manager,
                                middleName,
                                startDate,
                                title,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): SupportedEmploymentFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        classCode()
                        customFields()
                        department()?.validate()
                        employment()?.validate()
                        employmentStatus()
                        endDate()
                        firstName()
                        income()?.validate()
                        incomeHistory()
                        isActive()
                        lastName()
                        location()?.validate()
                        manager()?.validate()
                        middleName()
                        startDate()
                        title()
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
                        (if (id.asKnown() == null) 0 else 1) +
                            (if (classCode.asKnown() == null) 0 else 1) +
                            (if (customFields.asKnown() == null) 0 else 1) +
                            (department.asKnown()?.validity() ?: 0) +
                            (employment.asKnown()?.validity() ?: 0) +
                            (if (employmentStatus.asKnown() == null) 0 else 1) +
                            (if (endDate.asKnown() == null) 0 else 1) +
                            (if (firstName.asKnown() == null) 0 else 1) +
                            (income.asKnown()?.validity() ?: 0) +
                            (if (incomeHistory.asKnown() == null) 0 else 1) +
                            (if (isActive.asKnown() == null) 0 else 1) +
                            (if (lastName.asKnown() == null) 0 else 1) +
                            (location.asKnown()?.validity() ?: 0) +
                            (manager.asKnown()?.validity() ?: 0) +
                            (if (middleName.asKnown() == null) 0 else 1) +
                            (if (startDate.asKnown() == null) 0 else 1) +
                            (if (title.asKnown() == null) 0 else 1)

                    class Department
                    private constructor(
                        private val name: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<Boolean> = JsonMissing.of()
                        ) : this(name, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun name(): Boolean? = name.getNullable("name")

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Boolean> = name

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
                             * Returns a mutable builder for constructing an instance of
                             * [Department].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Department]. */
                        class Builder internal constructor() {

                            private var name: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(department: Department) = apply {
                                name = department.name
                                additionalProperties =
                                    department.additionalProperties.toMutableMap()
                            }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Department].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Department =
                                Department(name, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Department = apply {
                            if (validated) {
                                return@apply
                            }

                            name()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = (if (name.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Department && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Department{name=$name, additionalProperties=$additionalProperties}"
                    }

                    class Employment
                    private constructor(
                        private val subtype: JsonField<Boolean>,
                        private val type: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("subtype")
                            @ExcludeMissing
                            subtype: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(subtype, type, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun subtype(): Boolean? = subtype.getNullable("subtype")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun type(): Boolean? = type.getNullable("type")

                        /**
                         * Returns the raw JSON value of [subtype].
                         *
                         * Unlike [subtype], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("subtype")
                        @ExcludeMissing
                        fun _subtype(): JsonField<Boolean> = subtype

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

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
                             * Returns a mutable builder for constructing an instance of
                             * [Employment].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Employment]. */
                        class Builder internal constructor() {

                            private var subtype: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(employment: Employment) = apply {
                                subtype = employment.subtype
                                type = employment.type
                                additionalProperties =
                                    employment.additionalProperties.toMutableMap()
                            }

                            fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                            /**
                             * Sets [Builder.subtype] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.subtype] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun subtype(subtype: JsonField<Boolean>) = apply {
                                this.subtype = subtype
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Employment].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Employment =
                                Employment(subtype, type, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Employment = apply {
                            if (validated) {
                                return@apply
                            }

                            subtype()
                            type()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (subtype.asKnown() == null) 0 else 1) +
                                (if (type.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Employment && subtype == other.subtype && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Employment{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class Income
                    private constructor(
                        private val amount: JsonField<Boolean>,
                        private val currency: JsonField<Boolean>,
                        private val unit: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("amount")
                            @ExcludeMissing
                            amount: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("currency")
                            @ExcludeMissing
                            currency: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("unit")
                            @ExcludeMissing
                            unit: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(amount, currency, unit, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun amount(): Boolean? = amount.getNullable("amount")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun currency(): Boolean? = currency.getNullable("currency")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun unit(): Boolean? = unit.getNullable("unit")

                        /**
                         * Returns the raw JSON value of [amount].
                         *
                         * Unlike [amount], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("amount")
                        @ExcludeMissing
                        fun _amount(): JsonField<Boolean> = amount

                        /**
                         * Returns the raw JSON value of [currency].
                         *
                         * Unlike [currency], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("currency")
                        @ExcludeMissing
                        fun _currency(): JsonField<Boolean> = currency

                        /**
                         * Returns the raw JSON value of [unit].
                         *
                         * Unlike [unit], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Boolean> = unit

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
                             * Returns a mutable builder for constructing an instance of [Income].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Income]. */
                        class Builder internal constructor() {

                            private var amount: JsonField<Boolean> = JsonMissing.of()
                            private var currency: JsonField<Boolean> = JsonMissing.of()
                            private var unit: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(income: Income) = apply {
                                amount = income.amount
                                currency = income.currency
                                unit = income.unit
                                additionalProperties = income.additionalProperties.toMutableMap()
                            }

                            fun amount(amount: Boolean) = amount(JsonField.of(amount))

                            /**
                             * Sets [Builder.amount] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.amount] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun amount(amount: JsonField<Boolean>) = apply { this.amount = amount }

                            fun currency(currency: Boolean) = currency(JsonField.of(currency))

                            /**
                             * Sets [Builder.currency] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.currency] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun currency(currency: JsonField<Boolean>) = apply {
                                this.currency = currency
                            }

                            fun unit(unit: Boolean) = unit(JsonField.of(unit))

                            /**
                             * Sets [Builder.unit] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.unit] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun unit(unit: JsonField<Boolean>) = apply { this.unit = unit }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Income].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Income =
                                Income(amount, currency, unit, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Income = apply {
                            if (validated) {
                                return@apply
                            }

                            amount()
                            currency()
                            unit()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (amount.asKnown() == null) 0 else 1) +
                                (if (currency.asKnown() == null) 0 else 1) +
                                (if (unit.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Income && amount == other.amount && currency == other.currency && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(amount, currency, unit, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Income{amount=$amount, currency=$currency, unit=$unit, additionalProperties=$additionalProperties}"
                    }

                    class Location
                    private constructor(
                        private val city: JsonField<Boolean>,
                        private val country: JsonField<Boolean>,
                        private val line1: JsonField<Boolean>,
                        private val line2: JsonField<Boolean>,
                        private val postalCode: JsonField<Boolean>,
                        private val state: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("city")
                            @ExcludeMissing
                            city: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("country")
                            @ExcludeMissing
                            country: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("line1")
                            @ExcludeMissing
                            line1: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("line2")
                            @ExcludeMissing
                            line2: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("postal_code")
                            @ExcludeMissing
                            postalCode: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("state")
                            @ExcludeMissing
                            state: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun city(): Boolean? = city.getNullable("city")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun country(): Boolean? = country.getNullable("country")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun line1(): Boolean? = line1.getNullable("line1")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun line2(): Boolean? = line2.getNullable("line2")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun postalCode(): Boolean? = postalCode.getNullable("postal_code")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun state(): Boolean? = state.getNullable("state")

                        /**
                         * Returns the raw JSON value of [city].
                         *
                         * Unlike [city], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<Boolean> = city

                        /**
                         * Returns the raw JSON value of [country].
                         *
                         * Unlike [country], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<Boolean> = country

                        /**
                         * Returns the raw JSON value of [line1].
                         *
                         * Unlike [line1], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun _line1(): JsonField<Boolean> = line1

                        /**
                         * Returns the raw JSON value of [line2].
                         *
                         * Unlike [line2], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun _line2(): JsonField<Boolean> = line2

                        /**
                         * Returns the raw JSON value of [postalCode].
                         *
                         * Unlike [postalCode], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun _postalCode(): JsonField<Boolean> = postalCode

                        /**
                         * Returns the raw JSON value of [state].
                         *
                         * Unlike [state], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<Boolean> = state

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
                             * Returns a mutable builder for constructing an instance of [Location].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Location]. */
                        class Builder internal constructor() {

                            private var city: JsonField<Boolean> = JsonMissing.of()
                            private var country: JsonField<Boolean> = JsonMissing.of()
                            private var line1: JsonField<Boolean> = JsonMissing.of()
                            private var line2: JsonField<Boolean> = JsonMissing.of()
                            private var postalCode: JsonField<Boolean> = JsonMissing.of()
                            private var state: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(location: Location) = apply {
                                city = location.city
                                country = location.country
                                line1 = location.line1
                                line2 = location.line2
                                postalCode = location.postalCode
                                state = location.state
                                additionalProperties = location.additionalProperties.toMutableMap()
                            }

                            fun city(city: Boolean) = city(JsonField.of(city))

                            /**
                             * Sets [Builder.city] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.city] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun city(city: JsonField<Boolean>) = apply { this.city = city }

                            fun country(country: Boolean) = country(JsonField.of(country))

                            /**
                             * Sets [Builder.country] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.country] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun country(country: JsonField<Boolean>) = apply {
                                this.country = country
                            }

                            fun line1(line1: Boolean) = line1(JsonField.of(line1))

                            /**
                             * Sets [Builder.line1] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.line1] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                            fun line2(line2: Boolean) = line2(JsonField.of(line2))

                            /**
                             * Sets [Builder.line2] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.line2] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                            fun postalCode(postalCode: Boolean) =
                                postalCode(JsonField.of(postalCode))

                            /**
                             * Sets [Builder.postalCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.postalCode] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun postalCode(postalCode: JsonField<Boolean>) = apply {
                                this.postalCode = postalCode
                            }

                            fun state(state: Boolean) = state(JsonField.of(state))

                            /**
                             * Sets [Builder.state] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.state] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun state(state: JsonField<Boolean>) = apply { this.state = state }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Location].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Location =
                                Location(
                                    city,
                                    country,
                                    line1,
                                    line2,
                                    postalCode,
                                    state,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Location = apply {
                            if (validated) {
                                return@apply
                            }

                            city()
                            country()
                            line1()
                            line2()
                            postalCode()
                            state()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (city.asKnown() == null) 0 else 1) +
                                (if (country.asKnown() == null) 0 else 1) +
                                (if (line1.asKnown() == null) 0 else 1) +
                                (if (line2.asKnown() == null) 0 else 1) +
                                (if (postalCode.asKnown() == null) 0 else 1) +
                                (if (state.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Location && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Location{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
                    }

                    class Manager
                    private constructor(
                        private val id: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("id")
                            @ExcludeMissing
                            id: JsonField<Boolean> = JsonMissing.of()
                        ) : this(id, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun id(): Boolean? = id.getNullable("id")

                        /**
                         * Returns the raw JSON value of [id].
                         *
                         * Unlike [id], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

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
                             * Returns a mutable builder for constructing an instance of [Manager].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Manager]. */
                        class Builder internal constructor() {

                            private var id: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(manager: Manager) = apply {
                                id = manager.id
                                additionalProperties = manager.additionalProperties.toMutableMap()
                            }

                            fun id(id: Boolean) = id(JsonField.of(id))

                            /**
                             * Sets [Builder.id] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.id] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun id(id: JsonField<Boolean>) = apply { this.id = id }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Manager].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Manager = Manager(id, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Manager = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = (if (id.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Manager && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Manager{id=$id, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedEmploymentFields && id == other.id && classCode == other.classCode && customFields == other.customFields && department == other.department && employment == other.employment && employmentStatus == other.employmentStatus && endDate == other.endDate && firstName == other.firstName && income == other.income && incomeHistory == other.incomeHistory && isActive == other.isActive && lastName == other.lastName && location == other.location && manager == other.manager && middleName == other.middleName && startDate == other.startDate && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, classCode, customFields, department, employment, employmentStatus, endDate, firstName, income, incomeHistory, isActive, lastName, location, manager, middleName, startDate, title, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedEmploymentFields{id=$id, classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, employmentStatus=$employmentStatus, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, location=$location, manager=$manager, middleName=$middleName, startDate=$startDate, title=$title, additionalProperties=$additionalProperties}"
                }

                class SupportedIndividualFields
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val dob: JsonField<Boolean>,
                    private val emails: JsonField<Emails>,
                    private val encryptedSsn: JsonField<Boolean>,
                    private val ethnicity: JsonField<Boolean>,
                    private val firstName: JsonField<Boolean>,
                    private val gender: JsonField<Boolean>,
                    private val lastName: JsonField<Boolean>,
                    private val middleName: JsonField<Boolean>,
                    private val phoneNumbers: JsonField<PhoneNumbers>,
                    private val preferredName: JsonField<Boolean>,
                    private val residence: JsonField<Residence>,
                    private val ssn: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("dob")
                        @ExcludeMissing
                        dob: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("emails")
                        @ExcludeMissing
                        emails: JsonField<Emails> = JsonMissing.of(),
                        @JsonProperty("encrypted_ssn")
                        @ExcludeMissing
                        encryptedSsn: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("ethnicity")
                        @ExcludeMissing
                        ethnicity: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("first_name")
                        @ExcludeMissing
                        firstName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("gender")
                        @ExcludeMissing
                        gender: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("last_name")
                        @ExcludeMissing
                        lastName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("middle_name")
                        @ExcludeMissing
                        middleName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("phone_numbers")
                        @ExcludeMissing
                        phoneNumbers: JsonField<PhoneNumbers> = JsonMissing.of(),
                        @JsonProperty("preferred_name")
                        @ExcludeMissing
                        preferredName: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("residence")
                        @ExcludeMissing
                        residence: JsonField<Residence> = JsonMissing.of(),
                        @JsonProperty("ssn")
                        @ExcludeMissing
                        ssn: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(
                        id,
                        dob,
                        emails,
                        encryptedSsn,
                        ethnicity,
                        firstName,
                        gender,
                        lastName,
                        middleName,
                        phoneNumbers,
                        preferredName,
                        residence,
                        ssn,
                        mutableMapOf(),
                    )

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Boolean? = id.getNullable("id")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun dob(): Boolean? = dob.getNullable("dob")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun emails(): Emails? = emails.getNullable("emails")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun encryptedSsn(): Boolean? = encryptedSsn.getNullable("encrypted_ssn")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun ethnicity(): Boolean? = ethnicity.getNullable("ethnicity")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun firstName(): Boolean? = firstName.getNullable("first_name")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun gender(): Boolean? = gender.getNullable("gender")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun lastName(): Boolean? = lastName.getNullable("last_name")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun middleName(): Boolean? = middleName.getNullable("middle_name")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun phoneNumbers(): PhoneNumbers? = phoneNumbers.getNullable("phone_numbers")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun preferredName(): Boolean? = preferredName.getNullable("preferred_name")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun residence(): Residence? = residence.getNullable("residence")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun ssn(): Boolean? = ssn.getNullable("ssn")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    /**
                     * Returns the raw JSON value of [dob].
                     *
                     * Unlike [dob], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<Boolean> = dob

                    /**
                     * Returns the raw JSON value of [emails].
                     *
                     * Unlike [emails], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("emails")
                    @ExcludeMissing
                    fun _emails(): JsonField<Emails> = emails

                    /**
                     * Returns the raw JSON value of [encryptedSsn].
                     *
                     * Unlike [encryptedSsn], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("encrypted_ssn")
                    @ExcludeMissing
                    fun _encryptedSsn(): JsonField<Boolean> = encryptedSsn

                    /**
                     * Returns the raw JSON value of [ethnicity].
                     *
                     * Unlike [ethnicity], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("ethnicity")
                    @ExcludeMissing
                    fun _ethnicity(): JsonField<Boolean> = ethnicity

                    /**
                     * Returns the raw JSON value of [firstName].
                     *
                     * Unlike [firstName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("first_name")
                    @ExcludeMissing
                    fun _firstName(): JsonField<Boolean> = firstName

                    /**
                     * Returns the raw JSON value of [gender].
                     *
                     * Unlike [gender], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("gender")
                    @ExcludeMissing
                    fun _gender(): JsonField<Boolean> = gender

                    /**
                     * Returns the raw JSON value of [lastName].
                     *
                     * Unlike [lastName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("last_name")
                    @ExcludeMissing
                    fun _lastName(): JsonField<Boolean> = lastName

                    /**
                     * Returns the raw JSON value of [middleName].
                     *
                     * Unlike [middleName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("middle_name")
                    @ExcludeMissing
                    fun _middleName(): JsonField<Boolean> = middleName

                    /**
                     * Returns the raw JSON value of [phoneNumbers].
                     *
                     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("phone_numbers")
                    @ExcludeMissing
                    fun _phoneNumbers(): JsonField<PhoneNumbers> = phoneNumbers

                    /**
                     * Returns the raw JSON value of [preferredName].
                     *
                     * Unlike [preferredName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("preferred_name")
                    @ExcludeMissing
                    fun _preferredName(): JsonField<Boolean> = preferredName

                    /**
                     * Returns the raw JSON value of [residence].
                     *
                     * Unlike [residence], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("residence")
                    @ExcludeMissing
                    fun _residence(): JsonField<Residence> = residence

                    /**
                     * Returns the raw JSON value of [ssn].
                     *
                     * Unlike [ssn], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("ssn") @ExcludeMissing fun _ssn(): JsonField<Boolean> = ssn

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
                         * Returns a mutable builder for constructing an instance of
                         * [SupportedIndividualFields].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [SupportedIndividualFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var dob: JsonField<Boolean> = JsonMissing.of()
                        private var emails: JsonField<Emails> = JsonMissing.of()
                        private var encryptedSsn: JsonField<Boolean> = JsonMissing.of()
                        private var ethnicity: JsonField<Boolean> = JsonMissing.of()
                        private var firstName: JsonField<Boolean> = JsonMissing.of()
                        private var gender: JsonField<Boolean> = JsonMissing.of()
                        private var lastName: JsonField<Boolean> = JsonMissing.of()
                        private var middleName: JsonField<Boolean> = JsonMissing.of()
                        private var phoneNumbers: JsonField<PhoneNumbers> = JsonMissing.of()
                        private var preferredName: JsonField<Boolean> = JsonMissing.of()
                        private var residence: JsonField<Residence> = JsonMissing.of()
                        private var ssn: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedIndividualFields: SupportedIndividualFields) =
                            apply {
                                id = supportedIndividualFields.id
                                dob = supportedIndividualFields.dob
                                emails = supportedIndividualFields.emails
                                encryptedSsn = supportedIndividualFields.encryptedSsn
                                ethnicity = supportedIndividualFields.ethnicity
                                firstName = supportedIndividualFields.firstName
                                gender = supportedIndividualFields.gender
                                lastName = supportedIndividualFields.lastName
                                middleName = supportedIndividualFields.middleName
                                phoneNumbers = supportedIndividualFields.phoneNumbers
                                preferredName = supportedIndividualFields.preferredName
                                residence = supportedIndividualFields.residence
                                ssn = supportedIndividualFields.ssn
                                additionalProperties =
                                    supportedIndividualFields.additionalProperties.toMutableMap()
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun dob(dob: Boolean) = dob(JsonField.of(dob))

                        /**
                         * Sets [Builder.dob] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.dob] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun dob(dob: JsonField<Boolean>) = apply { this.dob = dob }

                        fun emails(emails: Emails) = emails(JsonField.of(emails))

                        /**
                         * Sets [Builder.emails] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.emails] with a well-typed [Emails] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun emails(emails: JsonField<Emails>) = apply { this.emails = emails }

                        fun encryptedSsn(encryptedSsn: Boolean) =
                            encryptedSsn(JsonField.of(encryptedSsn))

                        /**
                         * Sets [Builder.encryptedSsn] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.encryptedSsn] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun encryptedSsn(encryptedSsn: JsonField<Boolean>) = apply {
                            this.encryptedSsn = encryptedSsn
                        }

                        fun ethnicity(ethnicity: Boolean) = ethnicity(JsonField.of(ethnicity))

                        /**
                         * Sets [Builder.ethnicity] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.ethnicity] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun ethnicity(ethnicity: JsonField<Boolean>) = apply {
                            this.ethnicity = ethnicity
                        }

                        fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                        /**
                         * Sets [Builder.firstName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.firstName] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun firstName(firstName: JsonField<Boolean>) = apply {
                            this.firstName = firstName
                        }

                        fun gender(gender: Boolean) = gender(JsonField.of(gender))

                        /**
                         * Sets [Builder.gender] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.gender] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun gender(gender: JsonField<Boolean>) = apply { this.gender = gender }

                        fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                        /**
                         * Sets [Builder.lastName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lastName] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lastName(lastName: JsonField<Boolean>) = apply {
                            this.lastName = lastName
                        }

                        fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                        /**
                         * Sets [Builder.middleName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.middleName] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun middleName(middleName: JsonField<Boolean>) = apply {
                            this.middleName = middleName
                        }

                        fun phoneNumbers(phoneNumbers: PhoneNumbers) =
                            phoneNumbers(JsonField.of(phoneNumbers))

                        /**
                         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.phoneNumbers] with a well-typed
                         * [PhoneNumbers] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun phoneNumbers(phoneNumbers: JsonField<PhoneNumbers>) = apply {
                            this.phoneNumbers = phoneNumbers
                        }

                        fun preferredName(preferredName: Boolean) =
                            preferredName(JsonField.of(preferredName))

                        /**
                         * Sets [Builder.preferredName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.preferredName] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun preferredName(preferredName: JsonField<Boolean>) = apply {
                            this.preferredName = preferredName
                        }

                        fun residence(residence: Residence) = residence(JsonField.of(residence))

                        /**
                         * Sets [Builder.residence] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.residence] with a well-typed [Residence]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun residence(residence: JsonField<Residence>) = apply {
                            this.residence = residence
                        }

                        fun ssn(ssn: Boolean) = ssn(JsonField.of(ssn))

                        /**
                         * Sets [Builder.ssn] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.ssn] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun ssn(ssn: JsonField<Boolean>) = apply { this.ssn = ssn }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SupportedIndividualFields].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SupportedIndividualFields =
                            SupportedIndividualFields(
                                id,
                                dob,
                                emails,
                                encryptedSsn,
                                ethnicity,
                                firstName,
                                gender,
                                lastName,
                                middleName,
                                phoneNumbers,
                                preferredName,
                                residence,
                                ssn,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): SupportedIndividualFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        dob()
                        emails()?.validate()
                        encryptedSsn()
                        ethnicity()
                        firstName()
                        gender()
                        lastName()
                        middleName()
                        phoneNumbers()?.validate()
                        preferredName()
                        residence()?.validate()
                        ssn()
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
                        (if (id.asKnown() == null) 0 else 1) +
                            (if (dob.asKnown() == null) 0 else 1) +
                            (emails.asKnown()?.validity() ?: 0) +
                            (if (encryptedSsn.asKnown() == null) 0 else 1) +
                            (if (ethnicity.asKnown() == null) 0 else 1) +
                            (if (firstName.asKnown() == null) 0 else 1) +
                            (if (gender.asKnown() == null) 0 else 1) +
                            (if (lastName.asKnown() == null) 0 else 1) +
                            (if (middleName.asKnown() == null) 0 else 1) +
                            (phoneNumbers.asKnown()?.validity() ?: 0) +
                            (if (preferredName.asKnown() == null) 0 else 1) +
                            (residence.asKnown()?.validity() ?: 0) +
                            (if (ssn.asKnown() == null) 0 else 1)

                    class Emails
                    private constructor(
                        private val data: JsonField<Boolean>,
                        private val type: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("data")
                            @ExcludeMissing
                            data: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(data, type, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun data(): Boolean? = data.getNullable("data")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun type(): Boolean? = type.getNullable("type")

                        /**
                         * Returns the raw JSON value of [data].
                         *
                         * Unlike [data], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Boolean> = data

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

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
                             * Returns a mutable builder for constructing an instance of [Emails].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Emails]. */
                        class Builder internal constructor() {

                            private var data: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(emails: Emails) = apply {
                                data = emails.data
                                type = emails.type
                                additionalProperties = emails.additionalProperties.toMutableMap()
                            }

                            fun data(data: Boolean) = data(JsonField.of(data))

                            /**
                             * Sets [Builder.data] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.data] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun data(data: JsonField<Boolean>) = apply { this.data = data }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Emails].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Emails =
                                Emails(data, type, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Emails = apply {
                            if (validated) {
                                return@apply
                            }

                            data()
                            type()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (data.asKnown() == null) 0 else 1) +
                                (if (type.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Emails && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Emails{data=$data, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class PhoneNumbers
                    private constructor(
                        private val data: JsonField<Boolean>,
                        private val type: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("data")
                            @ExcludeMissing
                            data: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(data, type, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun data(): Boolean? = data.getNullable("data")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun type(): Boolean? = type.getNullable("type")

                        /**
                         * Returns the raw JSON value of [data].
                         *
                         * Unlike [data], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Boolean> = data

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

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
                             * Returns a mutable builder for constructing an instance of
                             * [PhoneNumbers].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [PhoneNumbers]. */
                        class Builder internal constructor() {

                            private var data: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(phoneNumbers: PhoneNumbers) = apply {
                                data = phoneNumbers.data
                                type = phoneNumbers.type
                                additionalProperties =
                                    phoneNumbers.additionalProperties.toMutableMap()
                            }

                            fun data(data: Boolean) = data(JsonField.of(data))

                            /**
                             * Sets [Builder.data] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.data] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun data(data: JsonField<Boolean>) = apply { this.data = data }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [PhoneNumbers].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): PhoneNumbers =
                                PhoneNumbers(data, type, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): PhoneNumbers = apply {
                            if (validated) {
                                return@apply
                            }

                            data()
                            type()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (data.asKnown() == null) 0 else 1) +
                                (if (type.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PhoneNumbers && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PhoneNumbers{data=$data, type=$type, additionalProperties=$additionalProperties}"
                    }

                    class Residence
                    private constructor(
                        private val city: JsonField<Boolean>,
                        private val country: JsonField<Boolean>,
                        private val line1: JsonField<Boolean>,
                        private val line2: JsonField<Boolean>,
                        private val postalCode: JsonField<Boolean>,
                        private val state: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("city")
                            @ExcludeMissing
                            city: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("country")
                            @ExcludeMissing
                            country: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("line1")
                            @ExcludeMissing
                            line1: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("line2")
                            @ExcludeMissing
                            line2: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("postal_code")
                            @ExcludeMissing
                            postalCode: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("state")
                            @ExcludeMissing
                            state: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun city(): Boolean? = city.getNullable("city")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun country(): Boolean? = country.getNullable("country")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun line1(): Boolean? = line1.getNullable("line1")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun line2(): Boolean? = line2.getNullable("line2")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun postalCode(): Boolean? = postalCode.getNullable("postal_code")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun state(): Boolean? = state.getNullable("state")

                        /**
                         * Returns the raw JSON value of [city].
                         *
                         * Unlike [city], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<Boolean> = city

                        /**
                         * Returns the raw JSON value of [country].
                         *
                         * Unlike [country], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<Boolean> = country

                        /**
                         * Returns the raw JSON value of [line1].
                         *
                         * Unlike [line1], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("line1")
                        @ExcludeMissing
                        fun _line1(): JsonField<Boolean> = line1

                        /**
                         * Returns the raw JSON value of [line2].
                         *
                         * Unlike [line2], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("line2")
                        @ExcludeMissing
                        fun _line2(): JsonField<Boolean> = line2

                        /**
                         * Returns the raw JSON value of [postalCode].
                         *
                         * Unlike [postalCode], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("postal_code")
                        @ExcludeMissing
                        fun _postalCode(): JsonField<Boolean> = postalCode

                        /**
                         * Returns the raw JSON value of [state].
                         *
                         * Unlike [state], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<Boolean> = state

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
                             * Returns a mutable builder for constructing an instance of
                             * [Residence].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Residence]. */
                        class Builder internal constructor() {

                            private var city: JsonField<Boolean> = JsonMissing.of()
                            private var country: JsonField<Boolean> = JsonMissing.of()
                            private var line1: JsonField<Boolean> = JsonMissing.of()
                            private var line2: JsonField<Boolean> = JsonMissing.of()
                            private var postalCode: JsonField<Boolean> = JsonMissing.of()
                            private var state: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(residence: Residence) = apply {
                                city = residence.city
                                country = residence.country
                                line1 = residence.line1
                                line2 = residence.line2
                                postalCode = residence.postalCode
                                state = residence.state
                                additionalProperties = residence.additionalProperties.toMutableMap()
                            }

                            fun city(city: Boolean) = city(JsonField.of(city))

                            /**
                             * Sets [Builder.city] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.city] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun city(city: JsonField<Boolean>) = apply { this.city = city }

                            fun country(country: Boolean) = country(JsonField.of(country))

                            /**
                             * Sets [Builder.country] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.country] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun country(country: JsonField<Boolean>) = apply {
                                this.country = country
                            }

                            fun line1(line1: Boolean) = line1(JsonField.of(line1))

                            /**
                             * Sets [Builder.line1] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.line1] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                            fun line2(line2: Boolean) = line2(JsonField.of(line2))

                            /**
                             * Sets [Builder.line2] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.line2] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                            fun postalCode(postalCode: Boolean) =
                                postalCode(JsonField.of(postalCode))

                            /**
                             * Sets [Builder.postalCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.postalCode] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun postalCode(postalCode: JsonField<Boolean>) = apply {
                                this.postalCode = postalCode
                            }

                            fun state(state: Boolean) = state(JsonField.of(state))

                            /**
                             * Sets [Builder.state] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.state] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun state(state: JsonField<Boolean>) = apply { this.state = state }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Residence].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Residence =
                                Residence(
                                    city,
                                    country,
                                    line1,
                                    line2,
                                    postalCode,
                                    state,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Residence = apply {
                            if (validated) {
                                return@apply
                            }

                            city()
                            country()
                            line1()
                            line2()
                            postalCode()
                            state()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (city.asKnown() == null) 0 else 1) +
                                (if (country.asKnown() == null) 0 else 1) +
                                (if (line1.asKnown() == null) 0 else 1) +
                                (if (line2.asKnown() == null) 0 else 1) +
                                (if (postalCode.asKnown() == null) 0 else 1) +
                                (if (state.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Residence && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Residence{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedIndividualFields && id == other.id && dob == other.dob && emails == other.emails && encryptedSsn == other.encryptedSsn && ethnicity == other.ethnicity && firstName == other.firstName && gender == other.gender && lastName == other.lastName && middleName == other.middleName && phoneNumbers == other.phoneNumbers && preferredName == other.preferredName && residence == other.residence && ssn == other.ssn && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, dob, emails, encryptedSsn, ethnicity, firstName, gender, lastName, middleName, phoneNumbers, preferredName, residence, ssn, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedIndividualFields{id=$id, dob=$dob, emails=$emails, encryptedSsn=$encryptedSsn, ethnicity=$ethnicity, firstName=$firstName, gender=$gender, lastName=$lastName, middleName=$middleName, phoneNumbers=$phoneNumbers, preferredName=$preferredName, residence=$residence, ssn=$ssn, additionalProperties=$additionalProperties}"
                }

                class SupportedPayGroupFields
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val individualIds: JsonField<Boolean>,
                    private val name: JsonField<Boolean>,
                    private val payFrequencies: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("individual_ids")
                        @ExcludeMissing
                        individualIds: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("pay_frequencies")
                        @ExcludeMissing
                        payFrequencies: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(id, individualIds, name, payFrequencies, mutableMapOf())

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Boolean? = id.getNullable("id")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun individualIds(): Boolean? = individualIds.getNullable("individual_ids")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): Boolean? = name.getNullable("name")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun payFrequencies(): Boolean? = payFrequencies.getNullable("pay_frequencies")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    /**
                     * Returns the raw JSON value of [individualIds].
                     *
                     * Unlike [individualIds], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    fun _individualIds(): JsonField<Boolean> = individualIds

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Boolean> = name

                    /**
                     * Returns the raw JSON value of [payFrequencies].
                     *
                     * Unlike [payFrequencies], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    fun _payFrequencies(): JsonField<Boolean> = payFrequencies

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
                         * Returns a mutable builder for constructing an instance of
                         * [SupportedPayGroupFields].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [SupportedPayGroupFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var individualIds: JsonField<Boolean> = JsonMissing.of()
                        private var name: JsonField<Boolean> = JsonMissing.of()
                        private var payFrequencies: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedPayGroupFields: SupportedPayGroupFields) =
                            apply {
                                id = supportedPayGroupFields.id
                                individualIds = supportedPayGroupFields.individualIds
                                name = supportedPayGroupFields.name
                                payFrequencies = supportedPayGroupFields.payFrequencies
                                additionalProperties =
                                    supportedPayGroupFields.additionalProperties.toMutableMap()
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun individualIds(individualIds: Boolean) =
                            individualIds(JsonField.of(individualIds))

                        /**
                         * Sets [Builder.individualIds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.individualIds] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun individualIds(individualIds: JsonField<Boolean>) = apply {
                            this.individualIds = individualIds
                        }

                        fun name(name: Boolean) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<Boolean>) = apply { this.name = name }

                        fun payFrequencies(payFrequencies: Boolean) =
                            payFrequencies(JsonField.of(payFrequencies))

                        /**
                         * Sets [Builder.payFrequencies] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.payFrequencies] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun payFrequencies(payFrequencies: JsonField<Boolean>) = apply {
                            this.payFrequencies = payFrequencies
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SupportedPayGroupFields].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SupportedPayGroupFields =
                            SupportedPayGroupFields(
                                id,
                                individualIds,
                                name,
                                payFrequencies,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): SupportedPayGroupFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        individualIds()
                        name()
                        payFrequencies()
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
                        (if (id.asKnown() == null) 0 else 1) +
                            (if (individualIds.asKnown() == null) 0 else 1) +
                            (if (name.asKnown() == null) 0 else 1) +
                            (if (payFrequencies.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedPayGroupFields && id == other.id && individualIds == other.individualIds && name == other.name && payFrequencies == other.payFrequencies && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, individualIds, name, payFrequencies, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedPayGroupFields{id=$id, individualIds=$individualIds, name=$name, payFrequencies=$payFrequencies, additionalProperties=$additionalProperties}"
                }

                class SupportedPayStatementFields
                private constructor(
                    private val paging: JsonField<Paging>,
                    private val payStatements: JsonField<PayStatements>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("paging")
                        @ExcludeMissing
                        paging: JsonField<Paging> = JsonMissing.of(),
                        @JsonProperty("pay_statements")
                        @ExcludeMissing
                        payStatements: JsonField<PayStatements> = JsonMissing.of(),
                    ) : this(paging, payStatements, mutableMapOf())

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun paging(): Paging? = paging.getNullable("paging")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun payStatements(): PayStatements? =
                        payStatements.getNullable("pay_statements")

                    /**
                     * Returns the raw JSON value of [paging].
                     *
                     * Unlike [paging], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("paging")
                    @ExcludeMissing
                    fun _paging(): JsonField<Paging> = paging

                    /**
                     * Returns the raw JSON value of [payStatements].
                     *
                     * Unlike [payStatements], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("pay_statements")
                    @ExcludeMissing
                    fun _payStatements(): JsonField<PayStatements> = payStatements

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
                         * Returns a mutable builder for constructing an instance of
                         * [SupportedPayStatementFields].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [SupportedPayStatementFields]. */
                    class Builder internal constructor() {

                        private var paging: JsonField<Paging> = JsonMissing.of()
                        private var payStatements: JsonField<PayStatements> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            supportedPayStatementFields: SupportedPayStatementFields
                        ) = apply {
                            paging = supportedPayStatementFields.paging
                            payStatements = supportedPayStatementFields.payStatements
                            additionalProperties =
                                supportedPayStatementFields.additionalProperties.toMutableMap()
                        }

                        fun paging(paging: Paging) = paging(JsonField.of(paging))

                        /**
                         * Sets [Builder.paging] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.paging] with a well-typed [Paging] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

                        fun payStatements(payStatements: PayStatements) =
                            payStatements(JsonField.of(payStatements))

                        /**
                         * Sets [Builder.payStatements] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.payStatements] with a well-typed
                         * [PayStatements] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun payStatements(payStatements: JsonField<PayStatements>) = apply {
                            this.payStatements = payStatements
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SupportedPayStatementFields].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SupportedPayStatementFields =
                            SupportedPayStatementFields(
                                paging,
                                payStatements,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): SupportedPayStatementFields = apply {
                        if (validated) {
                            return@apply
                        }

                        paging()?.validate()
                        payStatements()?.validate()
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
                        (paging.asKnown()?.validity() ?: 0) +
                            (payStatements.asKnown()?.validity() ?: 0)

                    class Paging
                    private constructor(
                        private val count: JsonField<Boolean>,
                        private val offset: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("count")
                            @ExcludeMissing
                            count: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("offset")
                            @ExcludeMissing
                            offset: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(count, offset, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun count(): Boolean = count.getRequired("count")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun offset(): Boolean = offset.getRequired("offset")

                        /**
                         * Returns the raw JSON value of [count].
                         *
                         * Unlike [count], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("count")
                        @ExcludeMissing
                        fun _count(): JsonField<Boolean> = count

                        /**
                         * Returns the raw JSON value of [offset].
                         *
                         * Unlike [offset], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("offset")
                        @ExcludeMissing
                        fun _offset(): JsonField<Boolean> = offset

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
                             * Returns a mutable builder for constructing an instance of [Paging].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .count()
                             * .offset()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Paging]. */
                        class Builder internal constructor() {

                            private var count: JsonField<Boolean>? = null
                            private var offset: JsonField<Boolean>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(paging: Paging) = apply {
                                count = paging.count
                                offset = paging.offset
                                additionalProperties = paging.additionalProperties.toMutableMap()
                            }

                            fun count(count: Boolean) = count(JsonField.of(count))

                            /**
                             * Sets [Builder.count] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.count] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun count(count: JsonField<Boolean>) = apply { this.count = count }

                            fun offset(offset: Boolean) = offset(JsonField.of(offset))

                            /**
                             * Sets [Builder.offset] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.offset] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun offset(offset: JsonField<Boolean>) = apply { this.offset = offset }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Paging].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .count()
                             * .offset()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Paging =
                                Paging(
                                    checkRequired("count", count),
                                    checkRequired("offset", offset),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Paging = apply {
                            if (validated) {
                                return@apply
                            }

                            count()
                            offset()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (count.asKnown() == null) 0 else 1) +
                                (if (offset.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Paging && count == other.count && offset == other.offset && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(count, offset, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Paging{count=$count, offset=$offset, additionalProperties=$additionalProperties}"
                    }

                    class PayStatements
                    private constructor(
                        private val earnings: JsonField<Earnings>,
                        private val employeeDeductions: JsonField<EmployeeDeductions>,
                        private val employerContributions: JsonField<EmployerContributions>,
                        private val grossPay: JsonField<Boolean>,
                        private val individualId: JsonField<Boolean>,
                        private val netPay: JsonField<Boolean>,
                        private val paymentMethod: JsonField<Boolean>,
                        private val taxes: JsonField<Taxes>,
                        private val totalHours: JsonField<Boolean>,
                        private val type: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("earnings")
                            @ExcludeMissing
                            earnings: JsonField<Earnings> = JsonMissing.of(),
                            @JsonProperty("employee_deductions")
                            @ExcludeMissing
                            employeeDeductions: JsonField<EmployeeDeductions> = JsonMissing.of(),
                            @JsonProperty("employer_contributions")
                            @ExcludeMissing
                            employerContributions: JsonField<EmployerContributions> =
                                JsonMissing.of(),
                            @JsonProperty("gross_pay")
                            @ExcludeMissing
                            grossPay: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("individual_id")
                            @ExcludeMissing
                            individualId: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("net_pay")
                            @ExcludeMissing
                            netPay: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("payment_method")
                            @ExcludeMissing
                            paymentMethod: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("taxes")
                            @ExcludeMissing
                            taxes: JsonField<Taxes> = JsonMissing.of(),
                            @JsonProperty("total_hours")
                            @ExcludeMissing
                            totalHours: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(
                            earnings,
                            employeeDeductions,
                            employerContributions,
                            grossPay,
                            individualId,
                            netPay,
                            paymentMethod,
                            taxes,
                            totalHours,
                            type,
                            mutableMapOf(),
                        )

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun earnings(): Earnings? = earnings.getNullable("earnings")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun employeeDeductions(): EmployeeDeductions? =
                            employeeDeductions.getNullable("employee_deductions")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun employerContributions(): EmployerContributions? =
                            employerContributions.getNullable("employer_contributions")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun grossPay(): Boolean? = grossPay.getNullable("gross_pay")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun individualId(): Boolean? = individualId.getNullable("individual_id")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun netPay(): Boolean? = netPay.getNullable("net_pay")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun paymentMethod(): Boolean? = paymentMethod.getNullable("payment_method")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun taxes(): Taxes? = taxes.getNullable("taxes")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun totalHours(): Boolean? = totalHours.getNullable("total_hours")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun type(): Boolean? = type.getNullable("type")

                        /**
                         * Returns the raw JSON value of [earnings].
                         *
                         * Unlike [earnings], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("earnings")
                        @ExcludeMissing
                        fun _earnings(): JsonField<Earnings> = earnings

                        /**
                         * Returns the raw JSON value of [employeeDeductions].
                         *
                         * Unlike [employeeDeductions], this method doesn't throw if the JSON field
                         * has an unexpected type.
                         */
                        @JsonProperty("employee_deductions")
                        @ExcludeMissing
                        fun _employeeDeductions(): JsonField<EmployeeDeductions> =
                            employeeDeductions

                        /**
                         * Returns the raw JSON value of [employerContributions].
                         *
                         * Unlike [employerContributions], this method doesn't throw if the JSON
                         * field has an unexpected type.
                         */
                        @JsonProperty("employer_contributions")
                        @ExcludeMissing
                        fun _employerContributions(): JsonField<EmployerContributions> =
                            employerContributions

                        /**
                         * Returns the raw JSON value of [grossPay].
                         *
                         * Unlike [grossPay], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("gross_pay")
                        @ExcludeMissing
                        fun _grossPay(): JsonField<Boolean> = grossPay

                        /**
                         * Returns the raw JSON value of [individualId].
                         *
                         * Unlike [individualId], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("individual_id")
                        @ExcludeMissing
                        fun _individualId(): JsonField<Boolean> = individualId

                        /**
                         * Returns the raw JSON value of [netPay].
                         *
                         * Unlike [netPay], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("net_pay")
                        @ExcludeMissing
                        fun _netPay(): JsonField<Boolean> = netPay

                        /**
                         * Returns the raw JSON value of [paymentMethod].
                         *
                         * Unlike [paymentMethod], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("payment_method")
                        @ExcludeMissing
                        fun _paymentMethod(): JsonField<Boolean> = paymentMethod

                        /**
                         * Returns the raw JSON value of [taxes].
                         *
                         * Unlike [taxes], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("taxes")
                        @ExcludeMissing
                        fun _taxes(): JsonField<Taxes> = taxes

                        /**
                         * Returns the raw JSON value of [totalHours].
                         *
                         * Unlike [totalHours], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("total_hours")
                        @ExcludeMissing
                        fun _totalHours(): JsonField<Boolean> = totalHours

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Boolean> = type

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
                             * Returns a mutable builder for constructing an instance of
                             * [PayStatements].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [PayStatements]. */
                        class Builder internal constructor() {

                            private var earnings: JsonField<Earnings> = JsonMissing.of()
                            private var employeeDeductions: JsonField<EmployeeDeductions> =
                                JsonMissing.of()
                            private var employerContributions: JsonField<EmployerContributions> =
                                JsonMissing.of()
                            private var grossPay: JsonField<Boolean> = JsonMissing.of()
                            private var individualId: JsonField<Boolean> = JsonMissing.of()
                            private var netPay: JsonField<Boolean> = JsonMissing.of()
                            private var paymentMethod: JsonField<Boolean> = JsonMissing.of()
                            private var taxes: JsonField<Taxes> = JsonMissing.of()
                            private var totalHours: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(payStatements: PayStatements) = apply {
                                earnings = payStatements.earnings
                                employeeDeductions = payStatements.employeeDeductions
                                employerContributions = payStatements.employerContributions
                                grossPay = payStatements.grossPay
                                individualId = payStatements.individualId
                                netPay = payStatements.netPay
                                paymentMethod = payStatements.paymentMethod
                                taxes = payStatements.taxes
                                totalHours = payStatements.totalHours
                                type = payStatements.type
                                additionalProperties =
                                    payStatements.additionalProperties.toMutableMap()
                            }

                            fun earnings(earnings: Earnings) = earnings(JsonField.of(earnings))

                            /**
                             * Sets [Builder.earnings] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.earnings] with a well-typed
                             * [Earnings] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun earnings(earnings: JsonField<Earnings>) = apply {
                                this.earnings = earnings
                            }

                            fun employeeDeductions(employeeDeductions: EmployeeDeductions) =
                                employeeDeductions(JsonField.of(employeeDeductions))

                            /**
                             * Sets [Builder.employeeDeductions] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.employeeDeductions] with a
                             * well-typed [EmployeeDeductions] value instead. This method is
                             * primarily for setting the field to an undocumented or not yet
                             * supported value.
                             */
                            fun employeeDeductions(
                                employeeDeductions: JsonField<EmployeeDeductions>
                            ) = apply { this.employeeDeductions = employeeDeductions }

                            fun employerContributions(
                                employerContributions: EmployerContributions
                            ) = employerContributions(JsonField.of(employerContributions))

                            /**
                             * Sets [Builder.employerContributions] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.employerContributions] with a
                             * well-typed [EmployerContributions] value instead. This method is
                             * primarily for setting the field to an undocumented or not yet
                             * supported value.
                             */
                            fun employerContributions(
                                employerContributions: JsonField<EmployerContributions>
                            ) = apply { this.employerContributions = employerContributions }

                            fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                            /**
                             * Sets [Builder.grossPay] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.grossPay] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun grossPay(grossPay: JsonField<Boolean>) = apply {
                                this.grossPay = grossPay
                            }

                            fun individualId(individualId: Boolean) =
                                individualId(JsonField.of(individualId))

                            /**
                             * Sets [Builder.individualId] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.individualId] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun individualId(individualId: JsonField<Boolean>) = apply {
                                this.individualId = individualId
                            }

                            fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                            /**
                             * Sets [Builder.netPay] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.netPay] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                            fun paymentMethod(paymentMethod: Boolean) =
                                paymentMethod(JsonField.of(paymentMethod))

                            /**
                             * Sets [Builder.paymentMethod] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.paymentMethod] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun paymentMethod(paymentMethod: JsonField<Boolean>) = apply {
                                this.paymentMethod = paymentMethod
                            }

                            fun taxes(taxes: Taxes) = taxes(JsonField.of(taxes))

                            /**
                             * Sets [Builder.taxes] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.taxes] with a well-typed [Taxes]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun taxes(taxes: JsonField<Taxes>) = apply { this.taxes = taxes }

                            fun totalHours(totalHours: Boolean) =
                                totalHours(JsonField.of(totalHours))

                            /**
                             * Sets [Builder.totalHours] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.totalHours] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun totalHours(totalHours: JsonField<Boolean>) = apply {
                                this.totalHours = totalHours
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [PayStatements].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): PayStatements =
                                PayStatements(
                                    earnings,
                                    employeeDeductions,
                                    employerContributions,
                                    grossPay,
                                    individualId,
                                    netPay,
                                    paymentMethod,
                                    taxes,
                                    totalHours,
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): PayStatements = apply {
                            if (validated) {
                                return@apply
                            }

                            earnings()?.validate()
                            employeeDeductions()?.validate()
                            employerContributions()?.validate()
                            grossPay()
                            individualId()
                            netPay()
                            paymentMethod()
                            taxes()?.validate()
                            totalHours()
                            type()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (earnings.asKnown()?.validity() ?: 0) +
                                (employeeDeductions.asKnown()?.validity() ?: 0) +
                                (employerContributions.asKnown()?.validity() ?: 0) +
                                (if (grossPay.asKnown() == null) 0 else 1) +
                                (if (individualId.asKnown() == null) 0 else 1) +
                                (if (netPay.asKnown() == null) 0 else 1) +
                                (if (paymentMethod.asKnown() == null) 0 else 1) +
                                (taxes.asKnown()?.validity() ?: 0) +
                                (if (totalHours.asKnown() == null) 0 else 1) +
                                (if (type.asKnown() == null) 0 else 1)

                        class Earnings
                        private constructor(
                            private val amount: JsonField<Boolean>,
                            private val currency: JsonField<Boolean>,
                            private val name: JsonField<Boolean>,
                            private val type: JsonField<Boolean>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("amount")
                                @ExcludeMissing
                                amount: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("currency")
                                @ExcludeMissing
                                currency: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("name")
                                @ExcludeMissing
                                name: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Boolean> = JsonMissing.of(),
                            ) : this(amount, currency, name, type, mutableMapOf())

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun amount(): Boolean? = amount.getNullable("amount")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun currency(): Boolean? = currency.getNullable("currency")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun name(): Boolean? = name.getNullable("name")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun type(): Boolean? = type.getNullable("type")

                            /**
                             * Returns the raw JSON value of [amount].
                             *
                             * Unlike [amount], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun _amount(): JsonField<Boolean> = amount

                            /**
                             * Returns the raw JSON value of [currency].
                             *
                             * Unlike [currency], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun _currency(): JsonField<Boolean> = currency

                            /**
                             * Returns the raw JSON value of [name].
                             *
                             * Unlike [name], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Boolean> = type

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [Earnings].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [Earnings]. */
                            class Builder internal constructor() {

                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var type: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(earnings: Earnings) = apply {
                                    amount = earnings.amount
                                    currency = earnings.currency
                                    name = earnings.name
                                    type = earnings.type
                                    additionalProperties =
                                        earnings.additionalProperties.toMutableMap()
                                }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                /**
                                 * Sets [Builder.amount] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.amount] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                /**
                                 * Sets [Builder.currency] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.currency] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                /**
                                 * Sets [Builder.name] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.name] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Earnings].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Earnings =
                                    Earnings(
                                        amount,
                                        currency,
                                        name,
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): Earnings = apply {
                                if (validated) {
                                    return@apply
                                }

                                amount()
                                currency()
                                name()
                                type()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (amount.asKnown() == null) 0 else 1) +
                                    (if (currency.asKnown() == null) 0 else 1) +
                                    (if (name.asKnown() == null) 0 else 1) +
                                    (if (type.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Earnings && amount == other.amount && currency == other.currency && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(amount, currency, name, type, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Earnings{amount=$amount, currency=$currency, name=$name, type=$type, additionalProperties=$additionalProperties}"
                        }

                        class EmployeeDeductions
                        private constructor(
                            private val amount: JsonField<Boolean>,
                            private val currency: JsonField<Boolean>,
                            private val name: JsonField<Boolean>,
                            private val preTax: JsonField<Boolean>,
                            private val type: JsonField<Boolean>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("amount")
                                @ExcludeMissing
                                amount: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("currency")
                                @ExcludeMissing
                                currency: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("name")
                                @ExcludeMissing
                                name: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("pre_tax")
                                @ExcludeMissing
                                preTax: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Boolean> = JsonMissing.of(),
                            ) : this(amount, currency, name, preTax, type, mutableMapOf())

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun amount(): Boolean? = amount.getNullable("amount")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun currency(): Boolean? = currency.getNullable("currency")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun name(): Boolean? = name.getNullable("name")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun preTax(): Boolean? = preTax.getNullable("pre_tax")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun type(): Boolean? = type.getNullable("type")

                            /**
                             * Returns the raw JSON value of [amount].
                             *
                             * Unlike [amount], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun _amount(): JsonField<Boolean> = amount

                            /**
                             * Returns the raw JSON value of [currency].
                             *
                             * Unlike [currency], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun _currency(): JsonField<Boolean> = currency

                            /**
                             * Returns the raw JSON value of [name].
                             *
                             * Unlike [name], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

                            /**
                             * Returns the raw JSON value of [preTax].
                             *
                             * Unlike [preTax], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("pre_tax")
                            @ExcludeMissing
                            fun _preTax(): JsonField<Boolean> = preTax

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Boolean> = type

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [EmployeeDeductions].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [EmployeeDeductions]. */
                            class Builder internal constructor() {

                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var preTax: JsonField<Boolean> = JsonMissing.of()
                                private var type: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(employeeDeductions: EmployeeDeductions) = apply {
                                    amount = employeeDeductions.amount
                                    currency = employeeDeductions.currency
                                    name = employeeDeductions.name
                                    preTax = employeeDeductions.preTax
                                    type = employeeDeductions.type
                                    additionalProperties =
                                        employeeDeductions.additionalProperties.toMutableMap()
                                }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                /**
                                 * Sets [Builder.amount] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.amount] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                /**
                                 * Sets [Builder.currency] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.currency] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                /**
                                 * Sets [Builder.name] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.name] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun preTax(preTax: Boolean) = preTax(JsonField.of(preTax))

                                /**
                                 * Sets [Builder.preTax] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.preTax] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun preTax(preTax: JsonField<Boolean>) = apply {
                                    this.preTax = preTax
                                }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [EmployeeDeductions].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): EmployeeDeductions =
                                    EmployeeDeductions(
                                        amount,
                                        currency,
                                        name,
                                        preTax,
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): EmployeeDeductions = apply {
                                if (validated) {
                                    return@apply
                                }

                                amount()
                                currency()
                                name()
                                preTax()
                                type()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (amount.asKnown() == null) 0 else 1) +
                                    (if (currency.asKnown() == null) 0 else 1) +
                                    (if (name.asKnown() == null) 0 else 1) +
                                    (if (preTax.asKnown() == null) 0 else 1) +
                                    (if (type.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is EmployeeDeductions && amount == other.amount && currency == other.currency && name == other.name && preTax == other.preTax && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(amount, currency, name, preTax, type, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "EmployeeDeductions{amount=$amount, currency=$currency, name=$name, preTax=$preTax, type=$type, additionalProperties=$additionalProperties}"
                        }

                        class EmployerContributions
                        private constructor(
                            private val amount: JsonField<Boolean>,
                            private val currency: JsonField<Boolean>,
                            private val name: JsonField<Boolean>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("amount")
                                @ExcludeMissing
                                amount: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("currency")
                                @ExcludeMissing
                                currency: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("name")
                                @ExcludeMissing
                                name: JsonField<Boolean> = JsonMissing.of(),
                            ) : this(amount, currency, name, mutableMapOf())

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun amount(): Boolean? = amount.getNullable("amount")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun currency(): Boolean? = currency.getNullable("currency")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun name(): Boolean? = name.getNullable("name")

                            /**
                             * Returns the raw JSON value of [amount].
                             *
                             * Unlike [amount], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun _amount(): JsonField<Boolean> = amount

                            /**
                             * Returns the raw JSON value of [currency].
                             *
                             * Unlike [currency], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun _currency(): JsonField<Boolean> = currency

                            /**
                             * Returns the raw JSON value of [name].
                             *
                             * Unlike [name], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [EmployerContributions].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [EmployerContributions]. */
                            class Builder internal constructor() {

                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(employerContributions: EmployerContributions) =
                                    apply {
                                        amount = employerContributions.amount
                                        currency = employerContributions.currency
                                        name = employerContributions.name
                                        additionalProperties =
                                            employerContributions.additionalProperties
                                                .toMutableMap()
                                    }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                /**
                                 * Sets [Builder.amount] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.amount] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                /**
                                 * Sets [Builder.currency] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.currency] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                /**
                                 * Sets [Builder.name] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.name] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [EmployerContributions].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): EmployerContributions =
                                    EmployerContributions(
                                        amount,
                                        currency,
                                        name,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): EmployerContributions = apply {
                                if (validated) {
                                    return@apply
                                }

                                amount()
                                currency()
                                name()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (amount.asKnown() == null) 0 else 1) +
                                    (if (currency.asKnown() == null) 0 else 1) +
                                    (if (name.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is EmployerContributions && amount == other.amount && currency == other.currency && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(amount, currency, name, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "EmployerContributions{amount=$amount, currency=$currency, name=$name, additionalProperties=$additionalProperties}"
                        }

                        class Taxes
                        private constructor(
                            private val amount: JsonField<Boolean>,
                            private val currency: JsonField<Boolean>,
                            private val employer: JsonField<Boolean>,
                            private val name: JsonField<Boolean>,
                            private val type: JsonField<Boolean>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("amount")
                                @ExcludeMissing
                                amount: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("currency")
                                @ExcludeMissing
                                currency: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("employer")
                                @ExcludeMissing
                                employer: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("name")
                                @ExcludeMissing
                                name: JsonField<Boolean> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Boolean> = JsonMissing.of(),
                            ) : this(amount, currency, employer, name, type, mutableMapOf())

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun amount(): Boolean? = amount.getNullable("amount")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun currency(): Boolean? = currency.getNullable("currency")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun employer(): Boolean? = employer.getNullable("employer")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun name(): Boolean? = name.getNullable("name")

                            /**
                             * @throws FinchInvalidDataException if the JSON field has an unexpected
                             *   type (e.g. if the server responded with an unexpected value).
                             */
                            fun type(): Boolean? = type.getNullable("type")

                            /**
                             * Returns the raw JSON value of [amount].
                             *
                             * Unlike [amount], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun _amount(): JsonField<Boolean> = amount

                            /**
                             * Returns the raw JSON value of [currency].
                             *
                             * Unlike [currency], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun _currency(): JsonField<Boolean> = currency

                            /**
                             * Returns the raw JSON value of [employer].
                             *
                             * Unlike [employer], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("employer")
                            @ExcludeMissing
                            fun _employer(): JsonField<Boolean> = employer

                            /**
                             * Returns the raw JSON value of [name].
                             *
                             * Unlike [name], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("name")
                            @ExcludeMissing
                            fun _name(): JsonField<Boolean> = name

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Boolean> = type

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [Taxes].
                                 */
                                fun builder() = Builder()
                            }

                            /** A builder for [Taxes]. */
                            class Builder internal constructor() {

                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var employer: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var type: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(taxes: Taxes) = apply {
                                    amount = taxes.amount
                                    currency = taxes.currency
                                    employer = taxes.employer
                                    name = taxes.name
                                    type = taxes.type
                                    additionalProperties = taxes.additionalProperties.toMutableMap()
                                }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                /**
                                 * Sets [Builder.amount] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.amount] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                /**
                                 * Sets [Builder.currency] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.currency] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun employer(employer: Boolean) = employer(JsonField.of(employer))

                                /**
                                 * Sets [Builder.employer] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.employer] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun employer(employer: JsonField<Boolean>) = apply {
                                    this.employer = employer
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                /**
                                 * Sets [Builder.name] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.name] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [Taxes].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): Taxes =
                                    Taxes(
                                        amount,
                                        currency,
                                        employer,
                                        name,
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            fun validate(): Taxes = apply {
                                if (validated) {
                                    return@apply
                                }

                                amount()
                                currency()
                                employer()
                                name()
                                type()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            internal fun validity(): Int =
                                (if (amount.asKnown() == null) 0 else 1) +
                                    (if (currency.asKnown() == null) 0 else 1) +
                                    (if (employer.asKnown() == null) 0 else 1) +
                                    (if (name.asKnown() == null) 0 else 1) +
                                    (if (type.asKnown() == null) 0 else 1)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Taxes && amount == other.amount && currency == other.currency && employer == other.employer && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(amount, currency, employer, name, type, additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Taxes{amount=$amount, currency=$currency, employer=$employer, name=$name, type=$type, additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PayStatements && earnings == other.earnings && employeeDeductions == other.employeeDeductions && employerContributions == other.employerContributions && grossPay == other.grossPay && individualId == other.individualId && netPay == other.netPay && paymentMethod == other.paymentMethod && taxes == other.taxes && totalHours == other.totalHours && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(earnings, employeeDeductions, employerContributions, grossPay, individualId, netPay, paymentMethod, taxes, totalHours, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PayStatements{earnings=$earnings, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, grossPay=$grossPay, individualId=$individualId, netPay=$netPay, paymentMethod=$paymentMethod, taxes=$taxes, totalHours=$totalHours, type=$type, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedPayStatementFields && paging == other.paging && payStatements == other.payStatements && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(paging, payStatements, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedPayStatementFields{paging=$paging, payStatements=$payStatements, additionalProperties=$additionalProperties}"
                }

                class SupportedPaymentFields
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val companyDebit: JsonField<Boolean>,
                    private val debitDate: JsonField<Boolean>,
                    private val employeeTaxes: JsonField<Boolean>,
                    private val employerTaxes: JsonField<Boolean>,
                    private val grossPay: JsonField<Boolean>,
                    private val individualIds: JsonField<Boolean>,
                    private val netPay: JsonField<Boolean>,
                    private val payDate: JsonField<Boolean>,
                    private val payFrequencies: JsonField<Boolean>,
                    private val payGroupIds: JsonField<Boolean>,
                    private val payPeriod: JsonField<PayPeriod>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("company_debit")
                        @ExcludeMissing
                        companyDebit: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("debit_date")
                        @ExcludeMissing
                        debitDate: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("employee_taxes")
                        @ExcludeMissing
                        employeeTaxes: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("employer_taxes")
                        @ExcludeMissing
                        employerTaxes: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("gross_pay")
                        @ExcludeMissing
                        grossPay: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("individual_ids")
                        @ExcludeMissing
                        individualIds: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("net_pay")
                        @ExcludeMissing
                        netPay: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("pay_date")
                        @ExcludeMissing
                        payDate: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("pay_frequencies")
                        @ExcludeMissing
                        payFrequencies: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("pay_group_ids")
                        @ExcludeMissing
                        payGroupIds: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("pay_period")
                        @ExcludeMissing
                        payPeriod: JsonField<PayPeriod> = JsonMissing.of(),
                    ) : this(
                        id,
                        companyDebit,
                        debitDate,
                        employeeTaxes,
                        employerTaxes,
                        grossPay,
                        individualIds,
                        netPay,
                        payDate,
                        payFrequencies,
                        payGroupIds,
                        payPeriod,
                        mutableMapOf(),
                    )

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Boolean? = id.getNullable("id")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun companyDebit(): Boolean? = companyDebit.getNullable("company_debit")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun debitDate(): Boolean? = debitDate.getNullable("debit_date")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun employeeTaxes(): Boolean? = employeeTaxes.getNullable("employee_taxes")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun employerTaxes(): Boolean? = employerTaxes.getNullable("employer_taxes")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun grossPay(): Boolean? = grossPay.getNullable("gross_pay")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun individualIds(): Boolean? = individualIds.getNullable("individual_ids")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun netPay(): Boolean? = netPay.getNullable("net_pay")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun payDate(): Boolean? = payDate.getNullable("pay_date")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun payFrequencies(): Boolean? = payFrequencies.getNullable("pay_frequencies")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun payGroupIds(): Boolean? = payGroupIds.getNullable("pay_group_ids")

                    /**
                     * @throws FinchInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun payPeriod(): PayPeriod? = payPeriod.getNullable("pay_period")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Boolean> = id

                    /**
                     * Returns the raw JSON value of [companyDebit].
                     *
                     * Unlike [companyDebit], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("company_debit")
                    @ExcludeMissing
                    fun _companyDebit(): JsonField<Boolean> = companyDebit

                    /**
                     * Returns the raw JSON value of [debitDate].
                     *
                     * Unlike [debitDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("debit_date")
                    @ExcludeMissing
                    fun _debitDate(): JsonField<Boolean> = debitDate

                    /**
                     * Returns the raw JSON value of [employeeTaxes].
                     *
                     * Unlike [employeeTaxes], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("employee_taxes")
                    @ExcludeMissing
                    fun _employeeTaxes(): JsonField<Boolean> = employeeTaxes

                    /**
                     * Returns the raw JSON value of [employerTaxes].
                     *
                     * Unlike [employerTaxes], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("employer_taxes")
                    @ExcludeMissing
                    fun _employerTaxes(): JsonField<Boolean> = employerTaxes

                    /**
                     * Returns the raw JSON value of [grossPay].
                     *
                     * Unlike [grossPay], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("gross_pay")
                    @ExcludeMissing
                    fun _grossPay(): JsonField<Boolean> = grossPay

                    /**
                     * Returns the raw JSON value of [individualIds].
                     *
                     * Unlike [individualIds], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    fun _individualIds(): JsonField<Boolean> = individualIds

                    /**
                     * Returns the raw JSON value of [netPay].
                     *
                     * Unlike [netPay], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("net_pay")
                    @ExcludeMissing
                    fun _netPay(): JsonField<Boolean> = netPay

                    /**
                     * Returns the raw JSON value of [payDate].
                     *
                     * Unlike [payDate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("pay_date")
                    @ExcludeMissing
                    fun _payDate(): JsonField<Boolean> = payDate

                    /**
                     * Returns the raw JSON value of [payFrequencies].
                     *
                     * Unlike [payFrequencies], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    fun _payFrequencies(): JsonField<Boolean> = payFrequencies

                    /**
                     * Returns the raw JSON value of [payGroupIds].
                     *
                     * Unlike [payGroupIds], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("pay_group_ids")
                    @ExcludeMissing
                    fun _payGroupIds(): JsonField<Boolean> = payGroupIds

                    /**
                     * Returns the raw JSON value of [payPeriod].
                     *
                     * Unlike [payPeriod], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("pay_period")
                    @ExcludeMissing
                    fun _payPeriod(): JsonField<PayPeriod> = payPeriod

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
                         * Returns a mutable builder for constructing an instance of
                         * [SupportedPaymentFields].
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [SupportedPaymentFields]. */
                    class Builder internal constructor() {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var companyDebit: JsonField<Boolean> = JsonMissing.of()
                        private var debitDate: JsonField<Boolean> = JsonMissing.of()
                        private var employeeTaxes: JsonField<Boolean> = JsonMissing.of()
                        private var employerTaxes: JsonField<Boolean> = JsonMissing.of()
                        private var grossPay: JsonField<Boolean> = JsonMissing.of()
                        private var individualIds: JsonField<Boolean> = JsonMissing.of()
                        private var netPay: JsonField<Boolean> = JsonMissing.of()
                        private var payDate: JsonField<Boolean> = JsonMissing.of()
                        private var payFrequencies: JsonField<Boolean> = JsonMissing.of()
                        private var payGroupIds: JsonField<Boolean> = JsonMissing.of()
                        private var payPeriod: JsonField<PayPeriod> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedPaymentFields: SupportedPaymentFields) = apply {
                            id = supportedPaymentFields.id
                            companyDebit = supportedPaymentFields.companyDebit
                            debitDate = supportedPaymentFields.debitDate
                            employeeTaxes = supportedPaymentFields.employeeTaxes
                            employerTaxes = supportedPaymentFields.employerTaxes
                            grossPay = supportedPaymentFields.grossPay
                            individualIds = supportedPaymentFields.individualIds
                            netPay = supportedPaymentFields.netPay
                            payDate = supportedPaymentFields.payDate
                            payFrequencies = supportedPaymentFields.payFrequencies
                            payGroupIds = supportedPaymentFields.payGroupIds
                            payPeriod = supportedPaymentFields.payPeriod
                            additionalProperties =
                                supportedPaymentFields.additionalProperties.toMutableMap()
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun companyDebit(companyDebit: Boolean) =
                            companyDebit(JsonField.of(companyDebit))

                        /**
                         * Sets [Builder.companyDebit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.companyDebit] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun companyDebit(companyDebit: JsonField<Boolean>) = apply {
                            this.companyDebit = companyDebit
                        }

                        fun debitDate(debitDate: Boolean) = debitDate(JsonField.of(debitDate))

                        /**
                         * Sets [Builder.debitDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.debitDate] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun debitDate(debitDate: JsonField<Boolean>) = apply {
                            this.debitDate = debitDate
                        }

                        fun employeeTaxes(employeeTaxes: Boolean) =
                            employeeTaxes(JsonField.of(employeeTaxes))

                        /**
                         * Sets [Builder.employeeTaxes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.employeeTaxes] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun employeeTaxes(employeeTaxes: JsonField<Boolean>) = apply {
                            this.employeeTaxes = employeeTaxes
                        }

                        fun employerTaxes(employerTaxes: Boolean) =
                            employerTaxes(JsonField.of(employerTaxes))

                        /**
                         * Sets [Builder.employerTaxes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.employerTaxes] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun employerTaxes(employerTaxes: JsonField<Boolean>) = apply {
                            this.employerTaxes = employerTaxes
                        }

                        fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                        /**
                         * Sets [Builder.grossPay] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.grossPay] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun grossPay(grossPay: JsonField<Boolean>) = apply {
                            this.grossPay = grossPay
                        }

                        fun individualIds(individualIds: Boolean) =
                            individualIds(JsonField.of(individualIds))

                        /**
                         * Sets [Builder.individualIds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.individualIds] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun individualIds(individualIds: JsonField<Boolean>) = apply {
                            this.individualIds = individualIds
                        }

                        fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                        /**
                         * Sets [Builder.netPay] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.netPay] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                        fun payDate(payDate: Boolean) = payDate(JsonField.of(payDate))

                        /**
                         * Sets [Builder.payDate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.payDate] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun payDate(payDate: JsonField<Boolean>) = apply { this.payDate = payDate }

                        fun payFrequencies(payFrequencies: Boolean) =
                            payFrequencies(JsonField.of(payFrequencies))

                        /**
                         * Sets [Builder.payFrequencies] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.payFrequencies] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun payFrequencies(payFrequencies: JsonField<Boolean>) = apply {
                            this.payFrequencies = payFrequencies
                        }

                        fun payGroupIds(payGroupIds: Boolean) =
                            payGroupIds(JsonField.of(payGroupIds))

                        /**
                         * Sets [Builder.payGroupIds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.payGroupIds] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun payGroupIds(payGroupIds: JsonField<Boolean>) = apply {
                            this.payGroupIds = payGroupIds
                        }

                        fun payPeriod(payPeriod: PayPeriod) = payPeriod(JsonField.of(payPeriod))

                        /**
                         * Sets [Builder.payPeriod] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.payPeriod] with a well-typed [PayPeriod]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun payPeriod(payPeriod: JsonField<PayPeriod>) = apply {
                            this.payPeriod = payPeriod
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SupportedPaymentFields].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): SupportedPaymentFields =
                            SupportedPaymentFields(
                                id,
                                companyDebit,
                                debitDate,
                                employeeTaxes,
                                employerTaxes,
                                grossPay,
                                individualIds,
                                netPay,
                                payDate,
                                payFrequencies,
                                payGroupIds,
                                payPeriod,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): SupportedPaymentFields = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        companyDebit()
                        debitDate()
                        employeeTaxes()
                        employerTaxes()
                        grossPay()
                        individualIds()
                        netPay()
                        payDate()
                        payFrequencies()
                        payGroupIds()
                        payPeriod()?.validate()
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
                        (if (id.asKnown() == null) 0 else 1) +
                            (if (companyDebit.asKnown() == null) 0 else 1) +
                            (if (debitDate.asKnown() == null) 0 else 1) +
                            (if (employeeTaxes.asKnown() == null) 0 else 1) +
                            (if (employerTaxes.asKnown() == null) 0 else 1) +
                            (if (grossPay.asKnown() == null) 0 else 1) +
                            (if (individualIds.asKnown() == null) 0 else 1) +
                            (if (netPay.asKnown() == null) 0 else 1) +
                            (if (payDate.asKnown() == null) 0 else 1) +
                            (if (payFrequencies.asKnown() == null) 0 else 1) +
                            (if (payGroupIds.asKnown() == null) 0 else 1) +
                            (payPeriod.asKnown()?.validity() ?: 0)

                    class PayPeriod
                    private constructor(
                        private val endDate: JsonField<Boolean>,
                        private val startDate: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("end_date")
                            @ExcludeMissing
                            endDate: JsonField<Boolean> = JsonMissing.of(),
                            @JsonProperty("start_date")
                            @ExcludeMissing
                            startDate: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(endDate, startDate, mutableMapOf())

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun endDate(): Boolean? = endDate.getNullable("end_date")

                        /**
                         * @throws FinchInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun startDate(): Boolean? = startDate.getNullable("start_date")

                        /**
                         * Returns the raw JSON value of [endDate].
                         *
                         * Unlike [endDate], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("end_date")
                        @ExcludeMissing
                        fun _endDate(): JsonField<Boolean> = endDate

                        /**
                         * Returns the raw JSON value of [startDate].
                         *
                         * Unlike [startDate], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("start_date")
                        @ExcludeMissing
                        fun _startDate(): JsonField<Boolean> = startDate

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
                             * Returns a mutable builder for constructing an instance of
                             * [PayPeriod].
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [PayPeriod]. */
                        class Builder internal constructor() {

                            private var endDate: JsonField<Boolean> = JsonMissing.of()
                            private var startDate: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(payPeriod: PayPeriod) = apply {
                                endDate = payPeriod.endDate
                                startDate = payPeriod.startDate
                                additionalProperties = payPeriod.additionalProperties.toMutableMap()
                            }

                            fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                            /**
                             * Sets [Builder.endDate] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.endDate] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun endDate(endDate: JsonField<Boolean>) = apply {
                                this.endDate = endDate
                            }

                            fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                            /**
                             * Sets [Builder.startDate] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.startDate] with a well-typed
                             * [Boolean] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun startDate(startDate: JsonField<Boolean>) = apply {
                                this.startDate = startDate
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [PayPeriod].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): PayPeriod =
                                PayPeriod(endDate, startDate, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): PayPeriod = apply {
                            if (validated) {
                                return@apply
                            }

                            endDate()
                            startDate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (endDate.asKnown() == null) 0 else 1) +
                                (if (startDate.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PayPeriod && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(endDate, startDate, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PayPeriod{endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is SupportedPaymentFields && id == other.id && companyDebit == other.companyDebit && debitDate == other.debitDate && employeeTaxes == other.employeeTaxes && employerTaxes == other.employerTaxes && grossPay == other.grossPay && individualIds == other.individualIds && netPay == other.netPay && payDate == other.payDate && payFrequencies == other.payFrequencies && payGroupIds == other.payGroupIds && payPeriod == other.payPeriod && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, companyDebit, debitDate, employeeTaxes, employerTaxes, grossPay, individualIds, netPay, payDate, payFrequencies, payGroupIds, payPeriod, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SupportedPaymentFields{id=$id, companyDebit=$companyDebit, debitDate=$debitDate, employeeTaxes=$employeeTaxes, employerTaxes=$employerTaxes, grossPay=$grossPay, individualIds=$individualIds, netPay=$netPay, payDate=$payDate, payFrequencies=$payFrequencies, payGroupIds=$payGroupIds, payPeriod=$payPeriod, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SupportedFields && company == other.company && directory == other.directory && employment == other.employment && individual == other.individual && payGroup == other.payGroup && payStatement == other.payStatement && payment == other.payment && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(company, directory, employment, individual, payGroup, payStatement, payment, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SupportedFields{company=$company, directory=$directory, employment=$employment, individual=$individual, payGroup=$payGroup, payStatement=$payStatement, payment=$payment, additionalProperties=$additionalProperties}"
            }

            /** The type of authentication method. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ASSISTED = of("assisted")

                    val CREDENTIAL = of("credential")

                    val API_TOKEN = of("api_token")

                    val API_CREDENTIAL = of("api_credential")

                    val OAUTH = of("oauth")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ASSISTED,
                    CREDENTIAL,
                    API_TOKEN,
                    API_CREDENTIAL,
                    OAUTH,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ASSISTED,
                    CREDENTIAL,
                    API_TOKEN,
                    API_CREDENTIAL,
                    OAUTH,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ASSISTED -> Value.ASSISTED
                        CREDENTIAL -> Value.CREDENTIAL
                        API_TOKEN -> Value.API_TOKEN
                        API_CREDENTIAL -> Value.API_CREDENTIAL
                        OAUTH -> Value.OAUTH
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws FinchInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ASSISTED -> Known.ASSISTED
                        CREDENTIAL -> Known.CREDENTIAL
                        API_TOKEN -> Known.API_TOKEN
                        API_CREDENTIAL -> Known.API_CREDENTIAL
                        OAUTH -> Known.OAUTH
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthenticationMethod && benefitsSupport == other.benefitsSupport && supportedFields == other.supportedFields && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(benefitsSupport, supportedFields, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AuthenticationMethod{benefitsSupport=$benefitsSupport, supportedFields=$supportedFields, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && authenticationMethod == other.authenticationMethod && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(authenticationMethod, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{authenticationMethod=$authenticationMethod, status=$status, additionalProperties=$additionalProperties}"
    }

    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ACCOUNT_UPDATED = of("account.updated")

            fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            ACCOUNT_UPDATED
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_UPDATED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                ACCOUNT_UPDATED -> Value.ACCOUNT_UPDATED
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
                ACCOUNT_UPDATED -> Known.ACCOUNT_UPDATED
                else -> throw FinchInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountUpdateEvent && accountId == other.accountId && companyId == other.companyId && connectionId == other.connectionId && data == other.data && eventType == other.eventType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, companyId, connectionId, data, eventType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountUpdateEvent{accountId=$accountId, companyId=$companyId, connectionId=$connectionId, data=$data, eventType=$eventType, additionalProperties=$additionalProperties}"
}
