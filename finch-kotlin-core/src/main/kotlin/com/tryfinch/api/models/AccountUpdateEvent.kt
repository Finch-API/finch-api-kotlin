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

@JsonDeserialize(builder = AccountUpdateEvent.Builder::class)
@NoAutoDetect
class AccountUpdateEvent
private constructor(
    private val connectionId: JsonField<String>,
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique Finch ID of the connection associated with the webhook event. */
    fun connectionId(): String? = connectionId.getNullable("connection_id")

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun companyId(): String = companyId.getRequired("company_id")

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun accountId(): String = accountId.getRequired("account_id")

    fun eventType(): EventType? = eventType.getNullable("event_type")

    fun data(): Data? = data.getNullable("data")

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .connectionId(connectionId)
            .companyId(companyId)
            .accountId(accountId)
            .build()

    /** Unique Finch ID of the connection associated with the webhook event. */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountUpdateEvent = apply {
        if (!validated) {
            connectionId()
            companyId()
            accountId()
            eventType()
            data()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountUpdateEvent &&
            this.connectionId == other.connectionId &&
            this.companyId == other.companyId &&
            this.accountId == other.accountId &&
            this.eventType == other.eventType &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    connectionId,
                    companyId,
                    accountId,
                    eventType,
                    data,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountUpdateEvent{connectionId=$connectionId, companyId=$companyId, accountId=$accountId, eventType=$eventType, data=$data, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var connectionId: JsonField<String> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountUpdateEvent: AccountUpdateEvent) = apply {
            this.connectionId = accountUpdateEvent.connectionId
            this.companyId = accountUpdateEvent.companyId
            this.accountId = accountUpdateEvent.accountId
            this.eventType = accountUpdateEvent.eventType
            this.data = accountUpdateEvent.data
            additionalProperties(accountUpdateEvent.additionalProperties)
        }

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** Unique Finch ID of the connection associated with the webhook event. */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        @JsonProperty("event_type")
        @ExcludeMissing
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): AccountUpdateEvent =
            AccountUpdateEvent(
                connectionId,
                companyId,
                accountId,
                eventType,
                data,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val status: JsonField<ConnectionStatusType>,
        private val authenticationMethod: JsonField<AuthenticationMethod>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun status(): ConnectionStatusType = status.getRequired("status")

        fun authenticationMethod(): AuthenticationMethod =
            authenticationMethod.getRequired("authentication_method")

        @JsonProperty("status") @ExcludeMissing fun _status() = status

        @JsonProperty("authentication_method")
        @ExcludeMissing
        fun _authenticationMethod() = authenticationMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                status()
                authenticationMethod().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.status == other.status &&
                this.authenticationMethod == other.authenticationMethod &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        status,
                        authenticationMethod,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{status=$status, authenticationMethod=$authenticationMethod, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var status: JsonField<ConnectionStatusType> = JsonMissing.of()
            private var authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.status = data.status
                this.authenticationMethod = data.authenticationMethod
                additionalProperties(data.additionalProperties)
            }

            fun status(status: ConnectionStatusType) = status(JsonField.of(status))

            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<ConnectionStatusType>) = apply { this.status = status }

            fun authenticationMethod(authenticationMethod: AuthenticationMethod) =
                authenticationMethod(JsonField.of(authenticationMethod))

            @JsonProperty("authentication_method")
            @ExcludeMissing
            fun authenticationMethod(authenticationMethod: JsonField<AuthenticationMethod>) =
                apply {
                    this.authenticationMethod = authenticationMethod
                }

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

            fun build(): Data =
                Data(
                    status,
                    authenticationMethod,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = AuthenticationMethod.Builder::class)
        @NoAutoDetect
        class AuthenticationMethod
        private constructor(
            private val type: JsonField<Type>,
            private val benefitsSupport: JsonField<BenefitsSupport>,
            private val supportedFields: JsonField<SupportedFields>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The type of authentication method. */
            fun type(): Type? = type.getNullable("type")

            /**
             * Each benefit type and their supported features. If the benefit type is not supported,
             * the property will be null
             */
            fun benefitsSupport(): BenefitsSupport? =
                benefitsSupport.getNullable("benefits_support")

            /** The supported data fields returned by our HR and payroll endpoints */
            fun supportedFields(): SupportedFields? =
                supportedFields.getNullable("supported_fields")

            /** The type of authentication method. */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /**
             * Each benefit type and their supported features. If the benefit type is not supported,
             * the property will be null
             */
            @JsonProperty("benefits_support")
            @ExcludeMissing
            fun _benefitsSupport() = benefitsSupport

            /** The supported data fields returned by our HR and payroll endpoints */
            @JsonProperty("supported_fields")
            @ExcludeMissing
            fun _supportedFields() = supportedFields

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AuthenticationMethod = apply {
                if (!validated) {
                    type()
                    benefitsSupport()?.validate()
                    supportedFields()?.validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AuthenticationMethod &&
                    this.type == other.type &&
                    this.benefitsSupport == other.benefitsSupport &&
                    this.supportedFields == other.supportedFields &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            benefitsSupport,
                            supportedFields,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AuthenticationMethod{type=$type, benefitsSupport=$benefitsSupport, supportedFields=$supportedFields, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var benefitsSupport: JsonField<BenefitsSupport> = JsonMissing.of()
                private var supportedFields: JsonField<SupportedFields> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(authenticationMethod: AuthenticationMethod) = apply {
                    this.type = authenticationMethod.type
                    this.benefitsSupport = authenticationMethod.benefitsSupport
                    this.supportedFields = authenticationMethod.supportedFields
                    additionalProperties(authenticationMethod.additionalProperties)
                }

                /** The type of authentication method. */
                fun type(type: Type) = type(JsonField.of(type))

                /** The type of authentication method. */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Each benefit type and their supported features. If the benefit type is not
                 * supported, the property will be null
                 */
                fun benefitsSupport(benefitsSupport: BenefitsSupport) =
                    benefitsSupport(JsonField.of(benefitsSupport))

                /**
                 * Each benefit type and their supported features. If the benefit type is not
                 * supported, the property will be null
                 */
                @JsonProperty("benefits_support")
                @ExcludeMissing
                fun benefitsSupport(benefitsSupport: JsonField<BenefitsSupport>) = apply {
                    this.benefitsSupport = benefitsSupport
                }

                /** The supported data fields returned by our HR and payroll endpoints */
                fun supportedFields(supportedFields: SupportedFields) =
                    supportedFields(JsonField.of(supportedFields))

                /** The supported data fields returned by our HR and payroll endpoints */
                @JsonProperty("supported_fields")
                @ExcludeMissing
                fun supportedFields(supportedFields: JsonField<SupportedFields>) = apply {
                    this.supportedFields = supportedFields
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AuthenticationMethod =
                    AuthenticationMethod(
                        type,
                        benefitsSupport,
                        supportedFields,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** The supported data fields returned by our HR and payroll endpoints */
            @JsonDeserialize(builder = SupportedFields.Builder::class)
            @NoAutoDetect
            class SupportedFields
            private constructor(
                private val company: JsonField<SupportedCompanyFields>,
                private val directory: JsonField<SupportedDirectoryFields>,
                private val individual: JsonField<SupportedIndividualFields>,
                private val employment: JsonField<SupportedEmploymentFields>,
                private val payment: JsonField<SupportedPaymentFields>,
                private val payStatement: JsonField<SupportedPayStatementFields>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun company(): SupportedCompanyFields? = company.getNullable("company")

                fun directory(): SupportedDirectoryFields? = directory.getNullable("directory")

                fun individual(): SupportedIndividualFields? = individual.getNullable("individual")

                fun employment(): SupportedEmploymentFields? = employment.getNullable("employment")

                fun payment(): SupportedPaymentFields? = payment.getNullable("payment")

                fun payStatement(): SupportedPayStatementFields? =
                    payStatement.getNullable("pay_statement")

                @JsonProperty("company") @ExcludeMissing fun _company() = company

                @JsonProperty("directory") @ExcludeMissing fun _directory() = directory

                @JsonProperty("individual") @ExcludeMissing fun _individual() = individual

                @JsonProperty("employment") @ExcludeMissing fun _employment() = employment

                @JsonProperty("payment") @ExcludeMissing fun _payment() = payment

                @JsonProperty("pay_statement") @ExcludeMissing fun _payStatement() = payStatement

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SupportedFields = apply {
                    if (!validated) {
                        company()?.validate()
                        directory()?.validate()
                        individual()?.validate()
                        employment()?.validate()
                        payment()?.validate()
                        payStatement()?.validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SupportedFields &&
                        this.company == other.company &&
                        this.directory == other.directory &&
                        this.individual == other.individual &&
                        this.employment == other.employment &&
                        this.payment == other.payment &&
                        this.payStatement == other.payStatement &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                company,
                                directory,
                                individual,
                                employment,
                                payment,
                                payStatement,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "SupportedFields{company=$company, directory=$directory, individual=$individual, employment=$employment, payment=$payment, payStatement=$payStatement, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var company: JsonField<SupportedCompanyFields> = JsonMissing.of()
                    private var directory: JsonField<SupportedDirectoryFields> = JsonMissing.of()
                    private var individual: JsonField<SupportedIndividualFields> = JsonMissing.of()
                    private var employment: JsonField<SupportedEmploymentFields> = JsonMissing.of()
                    private var payment: JsonField<SupportedPaymentFields> = JsonMissing.of()
                    private var payStatement: JsonField<SupportedPayStatementFields> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(supportedFields: SupportedFields) = apply {
                        this.company = supportedFields.company
                        this.directory = supportedFields.directory
                        this.individual = supportedFields.individual
                        this.employment = supportedFields.employment
                        this.payment = supportedFields.payment
                        this.payStatement = supportedFields.payStatement
                        additionalProperties(supportedFields.additionalProperties)
                    }

                    fun company(company: SupportedCompanyFields) = company(JsonField.of(company))

                    @JsonProperty("company")
                    @ExcludeMissing
                    fun company(company: JsonField<SupportedCompanyFields>) = apply {
                        this.company = company
                    }

                    fun directory(directory: SupportedDirectoryFields) =
                        directory(JsonField.of(directory))

                    @JsonProperty("directory")
                    @ExcludeMissing
                    fun directory(directory: JsonField<SupportedDirectoryFields>) = apply {
                        this.directory = directory
                    }

                    fun individual(individual: SupportedIndividualFields) =
                        individual(JsonField.of(individual))

                    @JsonProperty("individual")
                    @ExcludeMissing
                    fun individual(individual: JsonField<SupportedIndividualFields>) = apply {
                        this.individual = individual
                    }

                    fun employment(employment: SupportedEmploymentFields) =
                        employment(JsonField.of(employment))

                    @JsonProperty("employment")
                    @ExcludeMissing
                    fun employment(employment: JsonField<SupportedEmploymentFields>) = apply {
                        this.employment = employment
                    }

                    fun payment(payment: SupportedPaymentFields) = payment(JsonField.of(payment))

                    @JsonProperty("payment")
                    @ExcludeMissing
                    fun payment(payment: JsonField<SupportedPaymentFields>) = apply {
                        this.payment = payment
                    }

                    fun payStatement(payStatement: SupportedPayStatementFields) =
                        payStatement(JsonField.of(payStatement))

                    @JsonProperty("pay_statement")
                    @ExcludeMissing
                    fun payStatement(payStatement: JsonField<SupportedPayStatementFields>) = apply {
                        this.payStatement = payStatement
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): SupportedFields =
                        SupportedFields(
                            company,
                            directory,
                            individual,
                            employment,
                            payment,
                            payStatement,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = SupportedCompanyFields.Builder::class)
                @NoAutoDetect
                class SupportedCompanyFields
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val legalName: JsonField<Boolean>,
                    private val entity: JsonField<Entity>,
                    private val primaryEmail: JsonField<Boolean>,
                    private val primaryPhoneNumber: JsonField<Boolean>,
                    private val ein: JsonField<Boolean>,
                    private val accounts: JsonField<Accounts>,
                    private val departments: JsonField<Departments>,
                    private val locations: JsonField<Locations>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun id(): Boolean? = id.getNullable("id")

                    fun legalName(): Boolean? = legalName.getNullable("legal_name")

                    fun entity(): Entity? = entity.getNullable("entity")

                    fun primaryEmail(): Boolean? = primaryEmail.getNullable("primary_email")

                    fun primaryPhoneNumber(): Boolean? =
                        primaryPhoneNumber.getNullable("primary_phone_number")

                    fun ein(): Boolean? = ein.getNullable("ein")

                    fun accounts(): Accounts? = accounts.getNullable("accounts")

                    fun departments(): Departments? = departments.getNullable("departments")

                    fun locations(): Locations? = locations.getNullable("locations")

                    @JsonProperty("id") @ExcludeMissing fun _id() = id

                    @JsonProperty("legal_name") @ExcludeMissing fun _legalName() = legalName

                    @JsonProperty("entity") @ExcludeMissing fun _entity() = entity

                    @JsonProperty("primary_email")
                    @ExcludeMissing
                    fun _primaryEmail() = primaryEmail

                    @JsonProperty("primary_phone_number")
                    @ExcludeMissing
                    fun _primaryPhoneNumber() = primaryPhoneNumber

                    @JsonProperty("ein") @ExcludeMissing fun _ein() = ein

                    @JsonProperty("accounts") @ExcludeMissing fun _accounts() = accounts

                    @JsonProperty("departments") @ExcludeMissing fun _departments() = departments

                    @JsonProperty("locations") @ExcludeMissing fun _locations() = locations

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): SupportedCompanyFields = apply {
                        if (!validated) {
                            id()
                            legalName()
                            entity()?.validate()
                            primaryEmail()
                            primaryPhoneNumber()
                            ein()
                            accounts()?.validate()
                            departments()?.validate()
                            locations()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SupportedCompanyFields &&
                            this.id == other.id &&
                            this.legalName == other.legalName &&
                            this.entity == other.entity &&
                            this.primaryEmail == other.primaryEmail &&
                            this.primaryPhoneNumber == other.primaryPhoneNumber &&
                            this.ein == other.ein &&
                            this.accounts == other.accounts &&
                            this.departments == other.departments &&
                            this.locations == other.locations &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    id,
                                    legalName,
                                    entity,
                                    primaryEmail,
                                    primaryPhoneNumber,
                                    ein,
                                    accounts,
                                    departments,
                                    locations,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "SupportedCompanyFields{id=$id, legalName=$legalName, entity=$entity, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, ein=$ein, accounts=$accounts, departments=$departments, locations=$locations, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var legalName: JsonField<Boolean> = JsonMissing.of()
                        private var entity: JsonField<Entity> = JsonMissing.of()
                        private var primaryEmail: JsonField<Boolean> = JsonMissing.of()
                        private var primaryPhoneNumber: JsonField<Boolean> = JsonMissing.of()
                        private var ein: JsonField<Boolean> = JsonMissing.of()
                        private var accounts: JsonField<Accounts> = JsonMissing.of()
                        private var departments: JsonField<Departments> = JsonMissing.of()
                        private var locations: JsonField<Locations> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedCompanyFields: SupportedCompanyFields) = apply {
                            this.id = supportedCompanyFields.id
                            this.legalName = supportedCompanyFields.legalName
                            this.entity = supportedCompanyFields.entity
                            this.primaryEmail = supportedCompanyFields.primaryEmail
                            this.primaryPhoneNumber = supportedCompanyFields.primaryPhoneNumber
                            this.ein = supportedCompanyFields.ein
                            this.accounts = supportedCompanyFields.accounts
                            this.departments = supportedCompanyFields.departments
                            this.locations = supportedCompanyFields.locations
                            additionalProperties(supportedCompanyFields.additionalProperties)
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        @JsonProperty("id")
                        @ExcludeMissing
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun legalName(legalName: Boolean) = legalName(JsonField.of(legalName))

                        @JsonProperty("legal_name")
                        @ExcludeMissing
                        fun legalName(legalName: JsonField<Boolean>) = apply {
                            this.legalName = legalName
                        }

                        fun entity(entity: Entity) = entity(JsonField.of(entity))

                        @JsonProperty("entity")
                        @ExcludeMissing
                        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

                        fun primaryEmail(primaryEmail: Boolean) =
                            primaryEmail(JsonField.of(primaryEmail))

                        @JsonProperty("primary_email")
                        @ExcludeMissing
                        fun primaryEmail(primaryEmail: JsonField<Boolean>) = apply {
                            this.primaryEmail = primaryEmail
                        }

                        fun primaryPhoneNumber(primaryPhoneNumber: Boolean) =
                            primaryPhoneNumber(JsonField.of(primaryPhoneNumber))

                        @JsonProperty("primary_phone_number")
                        @ExcludeMissing
                        fun primaryPhoneNumber(primaryPhoneNumber: JsonField<Boolean>) = apply {
                            this.primaryPhoneNumber = primaryPhoneNumber
                        }

                        fun ein(ein: Boolean) = ein(JsonField.of(ein))

                        @JsonProperty("ein")
                        @ExcludeMissing
                        fun ein(ein: JsonField<Boolean>) = apply { this.ein = ein }

                        fun accounts(accounts: Accounts) = accounts(JsonField.of(accounts))

                        @JsonProperty("accounts")
                        @ExcludeMissing
                        fun accounts(accounts: JsonField<Accounts>) = apply {
                            this.accounts = accounts
                        }

                        fun departments(departments: Departments) =
                            departments(JsonField.of(departments))

                        @JsonProperty("departments")
                        @ExcludeMissing
                        fun departments(departments: JsonField<Departments>) = apply {
                            this.departments = departments
                        }

                        fun locations(locations: Locations) = locations(JsonField.of(locations))

                        @JsonProperty("locations")
                        @ExcludeMissing
                        fun locations(locations: JsonField<Locations>) = apply {
                            this.locations = locations
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): SupportedCompanyFields =
                            SupportedCompanyFields(
                                id,
                                legalName,
                                entity,
                                primaryEmail,
                                primaryPhoneNumber,
                                ein,
                                accounts,
                                departments,
                                locations,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = Accounts.Builder::class)
                    @NoAutoDetect
                    class Accounts
                    private constructor(
                        private val routingNumber: JsonField<Boolean>,
                        private val accountName: JsonField<Boolean>,
                        private val institutionName: JsonField<Boolean>,
                        private val accountType: JsonField<Boolean>,
                        private val accountNumber: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun routingNumber(): Boolean? = routingNumber.getNullable("routing_number")

                        fun accountName(): Boolean? = accountName.getNullable("account_name")

                        fun institutionName(): Boolean? =
                            institutionName.getNullable("institution_name")

                        fun accountType(): Boolean? = accountType.getNullable("account_type")

                        fun accountNumber(): Boolean? = accountNumber.getNullable("account_number")

                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        fun _routingNumber() = routingNumber

                        @JsonProperty("account_name")
                        @ExcludeMissing
                        fun _accountName() = accountName

                        @JsonProperty("institution_name")
                        @ExcludeMissing
                        fun _institutionName() = institutionName

                        @JsonProperty("account_type")
                        @ExcludeMissing
                        fun _accountType() = accountType

                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun _accountNumber() = accountNumber

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Accounts = apply {
                            if (!validated) {
                                routingNumber()
                                accountName()
                                institutionName()
                                accountType()
                                accountNumber()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Accounts &&
                                this.routingNumber == other.routingNumber &&
                                this.accountName == other.accountName &&
                                this.institutionName == other.institutionName &&
                                this.accountType == other.accountType &&
                                this.accountNumber == other.accountNumber &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        routingNumber,
                                        accountName,
                                        institutionName,
                                        accountType,
                                        accountNumber,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Accounts{routingNumber=$routingNumber, accountName=$accountName, institutionName=$institutionName, accountType=$accountType, accountNumber=$accountNumber, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var routingNumber: JsonField<Boolean> = JsonMissing.of()
                            private var accountName: JsonField<Boolean> = JsonMissing.of()
                            private var institutionName: JsonField<Boolean> = JsonMissing.of()
                            private var accountType: JsonField<Boolean> = JsonMissing.of()
                            private var accountNumber: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(accounts: Accounts) = apply {
                                this.routingNumber = accounts.routingNumber
                                this.accountName = accounts.accountName
                                this.institutionName = accounts.institutionName
                                this.accountType = accounts.accountType
                                this.accountNumber = accounts.accountNumber
                                additionalProperties(accounts.additionalProperties)
                            }

                            fun routingNumber(routingNumber: Boolean) =
                                routingNumber(JsonField.of(routingNumber))

                            @JsonProperty("routing_number")
                            @ExcludeMissing
                            fun routingNumber(routingNumber: JsonField<Boolean>) = apply {
                                this.routingNumber = routingNumber
                            }

                            fun accountName(accountName: Boolean) =
                                accountName(JsonField.of(accountName))

                            @JsonProperty("account_name")
                            @ExcludeMissing
                            fun accountName(accountName: JsonField<Boolean>) = apply {
                                this.accountName = accountName
                            }

                            fun institutionName(institutionName: Boolean) =
                                institutionName(JsonField.of(institutionName))

                            @JsonProperty("institution_name")
                            @ExcludeMissing
                            fun institutionName(institutionName: JsonField<Boolean>) = apply {
                                this.institutionName = institutionName
                            }

                            fun accountType(accountType: Boolean) =
                                accountType(JsonField.of(accountType))

                            @JsonProperty("account_type")
                            @ExcludeMissing
                            fun accountType(accountType: JsonField<Boolean>) = apply {
                                this.accountType = accountType
                            }

                            fun accountNumber(accountNumber: Boolean) =
                                accountNumber(JsonField.of(accountNumber))

                            @JsonProperty("account_number")
                            @ExcludeMissing
                            fun accountNumber(accountNumber: JsonField<Boolean>) = apply {
                                this.accountNumber = accountNumber
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Accounts =
                                Accounts(
                                    routingNumber,
                                    accountName,
                                    institutionName,
                                    accountType,
                                    accountNumber,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    @JsonDeserialize(builder = Departments.Builder::class)
                    @NoAutoDetect
                    class Departments
                    private constructor(
                        private val name: JsonField<Boolean>,
                        private val parent: JsonField<Parent>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun name(): Boolean? = name.getNullable("name")

                        fun parent(): Parent? = parent.getNullable("parent")

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonProperty("parent") @ExcludeMissing fun _parent() = parent

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Departments = apply {
                            if (!validated) {
                                name()
                                parent()?.validate()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Departments &&
                                this.name == other.name &&
                                this.parent == other.parent &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        name,
                                        parent,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Departments{name=$name, parent=$parent, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var name: JsonField<Boolean> = JsonMissing.of()
                            private var parent: JsonField<Parent> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(departments: Departments) = apply {
                                this.name = departments.name
                                this.parent = departments.parent
                                additionalProperties(departments.additionalProperties)
                            }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun parent(parent: Parent) = parent(JsonField.of(parent))

                            @JsonProperty("parent")
                            @ExcludeMissing
                            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Departments =
                                Departments(
                                    name,
                                    parent,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        @JsonDeserialize(builder = Parent.Builder::class)
                        @NoAutoDetect
                        class Parent
                        private constructor(
                            private val name: JsonField<Boolean>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun name(): Boolean? = name.getNullable("name")

                            @JsonProperty("name") @ExcludeMissing fun _name() = name

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Parent = apply {
                                if (!validated) {
                                    name()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Parent &&
                                    this.name == other.name &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode = Objects.hash(name, additionalProperties)
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Parent{name=$name, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(parent: Parent) = apply {
                                    this.name = parent.name
                                    additionalProperties(parent.additionalProperties)
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Parent =
                                    Parent(name, additionalProperties.toUnmodifiable())
                            }
                        }
                    }

                    @JsonDeserialize(builder = Entity.Builder::class)
                    @NoAutoDetect
                    class Entity
                    private constructor(
                        private val type: JsonField<Boolean>,
                        private val subtype: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun type(): Boolean? = type.getNullable("type")

                        fun subtype(): Boolean? = subtype.getNullable("subtype")

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Entity = apply {
                            if (!validated) {
                                type()
                                subtype()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Entity &&
                                this.type == other.type &&
                                this.subtype == other.subtype &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        type,
                                        subtype,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Entity{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var subtype: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(entity: Entity) = apply {
                                this.type = entity.type
                                this.subtype = entity.subtype
                                additionalProperties(entity.additionalProperties)
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                            @JsonProperty("subtype")
                            @ExcludeMissing
                            fun subtype(subtype: JsonField<Boolean>) = apply {
                                this.subtype = subtype
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Entity =
                                Entity(
                                    type,
                                    subtype,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    @JsonDeserialize(builder = Locations.Builder::class)
                    @NoAutoDetect
                    class Locations
                    private constructor(
                        private val line1: JsonField<Boolean>,
                        private val line2: JsonField<Boolean>,
                        private val city: JsonField<Boolean>,
                        private val state: JsonField<Boolean>,
                        private val postalCode: JsonField<Boolean>,
                        private val country: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun line1(): Boolean? = line1.getNullable("line1")

                        fun line2(): Boolean? = line2.getNullable("line2")

                        fun city(): Boolean? = city.getNullable("city")

                        fun state(): Boolean? = state.getNullable("state")

                        fun postalCode(): Boolean? = postalCode.getNullable("postal_code")

                        fun country(): Boolean? = country.getNullable("country")

                        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                        @JsonProperty("city") @ExcludeMissing fun _city() = city

                        @JsonProperty("state") @ExcludeMissing fun _state() = state

                        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

                        @JsonProperty("country") @ExcludeMissing fun _country() = country

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Locations = apply {
                            if (!validated) {
                                line1()
                                line2()
                                city()
                                state()
                                postalCode()
                                country()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Locations &&
                                this.line1 == other.line1 &&
                                this.line2 == other.line2 &&
                                this.city == other.city &&
                                this.state == other.state &&
                                this.postalCode == other.postalCode &&
                                this.country == other.country &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        line1,
                                        line2,
                                        city,
                                        state,
                                        postalCode,
                                        country,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Locations{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var line1: JsonField<Boolean> = JsonMissing.of()
                            private var line2: JsonField<Boolean> = JsonMissing.of()
                            private var city: JsonField<Boolean> = JsonMissing.of()
                            private var state: JsonField<Boolean> = JsonMissing.of()
                            private var postalCode: JsonField<Boolean> = JsonMissing.of()
                            private var country: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(locations: Locations) = apply {
                                this.line1 = locations.line1
                                this.line2 = locations.line2
                                this.city = locations.city
                                this.state = locations.state
                                this.postalCode = locations.postalCode
                                this.country = locations.country
                                additionalProperties(locations.additionalProperties)
                            }

                            fun line1(line1: Boolean) = line1(JsonField.of(line1))

                            @JsonProperty("line1")
                            @ExcludeMissing
                            fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                            fun line2(line2: Boolean) = line2(JsonField.of(line2))

                            @JsonProperty("line2")
                            @ExcludeMissing
                            fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                            fun city(city: Boolean) = city(JsonField.of(city))

                            @JsonProperty("city")
                            @ExcludeMissing
                            fun city(city: JsonField<Boolean>) = apply { this.city = city }

                            fun state(state: Boolean) = state(JsonField.of(state))

                            @JsonProperty("state")
                            @ExcludeMissing
                            fun state(state: JsonField<Boolean>) = apply { this.state = state }

                            fun postalCode(postalCode: Boolean) =
                                postalCode(JsonField.of(postalCode))

                            @JsonProperty("postal_code")
                            @ExcludeMissing
                            fun postalCode(postalCode: JsonField<Boolean>) = apply {
                                this.postalCode = postalCode
                            }

                            fun country(country: Boolean) = country(JsonField.of(country))

                            @JsonProperty("country")
                            @ExcludeMissing
                            fun country(country: JsonField<Boolean>) = apply {
                                this.country = country
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Locations =
                                Locations(
                                    line1,
                                    line2,
                                    city,
                                    state,
                                    postalCode,
                                    country,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }

                @JsonDeserialize(builder = SupportedDirectoryFields.Builder::class)
                @NoAutoDetect
                class SupportedDirectoryFields
                private constructor(
                    private val paging: JsonField<Paging>,
                    private val individuals: JsonField<Individuals>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun paging(): Paging? = paging.getNullable("paging")

                    fun individuals(): Individuals? = individuals.getNullable("individuals")

                    @JsonProperty("paging") @ExcludeMissing fun _paging() = paging

                    @JsonProperty("individuals") @ExcludeMissing fun _individuals() = individuals

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): SupportedDirectoryFields = apply {
                        if (!validated) {
                            paging()?.validate()
                            individuals()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SupportedDirectoryFields &&
                            this.paging == other.paging &&
                            this.individuals == other.individuals &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    paging,
                                    individuals,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "SupportedDirectoryFields{paging=$paging, individuals=$individuals, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var paging: JsonField<Paging> = JsonMissing.of()
                        private var individuals: JsonField<Individuals> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedDirectoryFields: SupportedDirectoryFields) =
                            apply {
                                this.paging = supportedDirectoryFields.paging
                                this.individuals = supportedDirectoryFields.individuals
                                additionalProperties(supportedDirectoryFields.additionalProperties)
                            }

                        fun paging(paging: Paging) = paging(JsonField.of(paging))

                        @JsonProperty("paging")
                        @ExcludeMissing
                        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

                        fun individuals(individuals: Individuals) =
                            individuals(JsonField.of(individuals))

                        @JsonProperty("individuals")
                        @ExcludeMissing
                        fun individuals(individuals: JsonField<Individuals>) = apply {
                            this.individuals = individuals
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): SupportedDirectoryFields =
                            SupportedDirectoryFields(
                                paging,
                                individuals,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = Individuals.Builder::class)
                    @NoAutoDetect
                    class Individuals
                    private constructor(
                        private val id: JsonField<Boolean>,
                        private val firstName: JsonField<Boolean>,
                        private val middleName: JsonField<Boolean>,
                        private val lastName: JsonField<Boolean>,
                        private val isActive: JsonField<Boolean>,
                        private val department: JsonField<Boolean>,
                        private val manager: JsonField<Manager>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun id(): Boolean? = id.getNullable("id")

                        fun firstName(): Boolean? = firstName.getNullable("first_name")

                        fun middleName(): Boolean? = middleName.getNullable("middle_name")

                        fun lastName(): Boolean? = lastName.getNullable("last_name")

                        fun isActive(): Boolean? = isActive.getNullable("is_active")

                        fun department(): Boolean? = department.getNullable("department")

                        fun manager(): Manager? = manager.getNullable("manager")

                        @JsonProperty("id") @ExcludeMissing fun _id() = id

                        @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

                        @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

                        @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

                        @JsonProperty("is_active") @ExcludeMissing fun _isActive() = isActive

                        @JsonProperty("department") @ExcludeMissing fun _department() = department

                        @JsonProperty("manager") @ExcludeMissing fun _manager() = manager

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Individuals = apply {
                            if (!validated) {
                                id()
                                firstName()
                                middleName()
                                lastName()
                                isActive()
                                department()
                                manager()?.validate()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Individuals &&
                                this.id == other.id &&
                                this.firstName == other.firstName &&
                                this.middleName == other.middleName &&
                                this.lastName == other.lastName &&
                                this.isActive == other.isActive &&
                                this.department == other.department &&
                                this.manager == other.manager &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        id,
                                        firstName,
                                        middleName,
                                        lastName,
                                        isActive,
                                        department,
                                        manager,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Individuals{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, isActive=$isActive, department=$department, manager=$manager, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var id: JsonField<Boolean> = JsonMissing.of()
                            private var firstName: JsonField<Boolean> = JsonMissing.of()
                            private var middleName: JsonField<Boolean> = JsonMissing.of()
                            private var lastName: JsonField<Boolean> = JsonMissing.of()
                            private var isActive: JsonField<Boolean> = JsonMissing.of()
                            private var department: JsonField<Boolean> = JsonMissing.of()
                            private var manager: JsonField<Manager> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(individuals: Individuals) = apply {
                                this.id = individuals.id
                                this.firstName = individuals.firstName
                                this.middleName = individuals.middleName
                                this.lastName = individuals.lastName
                                this.isActive = individuals.isActive
                                this.department = individuals.department
                                this.manager = individuals.manager
                                additionalProperties(individuals.additionalProperties)
                            }

                            fun id(id: Boolean) = id(JsonField.of(id))

                            @JsonProperty("id")
                            @ExcludeMissing
                            fun id(id: JsonField<Boolean>) = apply { this.id = id }

                            fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                            @JsonProperty("first_name")
                            @ExcludeMissing
                            fun firstName(firstName: JsonField<Boolean>) = apply {
                                this.firstName = firstName
                            }

                            fun middleName(middleName: Boolean) =
                                middleName(JsonField.of(middleName))

                            @JsonProperty("middle_name")
                            @ExcludeMissing
                            fun middleName(middleName: JsonField<Boolean>) = apply {
                                this.middleName = middleName
                            }

                            fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                            @JsonProperty("last_name")
                            @ExcludeMissing
                            fun lastName(lastName: JsonField<Boolean>) = apply {
                                this.lastName = lastName
                            }

                            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                            @JsonProperty("is_active")
                            @ExcludeMissing
                            fun isActive(isActive: JsonField<Boolean>) = apply {
                                this.isActive = isActive
                            }

                            fun department(department: Boolean) =
                                department(JsonField.of(department))

                            @JsonProperty("department")
                            @ExcludeMissing
                            fun department(department: JsonField<Boolean>) = apply {
                                this.department = department
                            }

                            fun manager(manager: Manager) = manager(JsonField.of(manager))

                            @JsonProperty("manager")
                            @ExcludeMissing
                            fun manager(manager: JsonField<Manager>) = apply {
                                this.manager = manager
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Individuals =
                                Individuals(
                                    id,
                                    firstName,
                                    middleName,
                                    lastName,
                                    isActive,
                                    department,
                                    manager,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        @JsonDeserialize(builder = Manager.Builder::class)
                        @NoAutoDetect
                        class Manager
                        private constructor(
                            private val id: JsonField<Boolean>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun id(): Boolean? = id.getNullable("id")

                            @JsonProperty("id") @ExcludeMissing fun _id() = id

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Manager = apply {
                                if (!validated) {
                                    id()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Manager &&
                                    this.id == other.id &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode = Objects.hash(id, additionalProperties)
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Manager{id=$id, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var id: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(manager: Manager) = apply {
                                    this.id = manager.id
                                    additionalProperties(manager.additionalProperties)
                                }

                                fun id(id: Boolean) = id(JsonField.of(id))

                                @JsonProperty("id")
                                @ExcludeMissing
                                fun id(id: JsonField<Boolean>) = apply { this.id = id }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Manager =
                                    Manager(id, additionalProperties.toUnmodifiable())
                            }
                        }
                    }

                    @JsonDeserialize(builder = Paging.Builder::class)
                    @NoAutoDetect
                    class Paging
                    private constructor(
                        private val count: JsonField<Boolean>,
                        private val offset: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun count(): Boolean? = count.getNullable("count")

                        fun offset(): Boolean? = offset.getNullable("offset")

                        @JsonProperty("count") @ExcludeMissing fun _count() = count

                        @JsonProperty("offset") @ExcludeMissing fun _offset() = offset

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Paging = apply {
                            if (!validated) {
                                count()
                                offset()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Paging &&
                                this.count == other.count &&
                                this.offset == other.offset &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        count,
                                        offset,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Paging{count=$count, offset=$offset, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var count: JsonField<Boolean> = JsonMissing.of()
                            private var offset: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(paging: Paging) = apply {
                                this.count = paging.count
                                this.offset = paging.offset
                                additionalProperties(paging.additionalProperties)
                            }

                            fun count(count: Boolean) = count(JsonField.of(count))

                            @JsonProperty("count")
                            @ExcludeMissing
                            fun count(count: JsonField<Boolean>) = apply { this.count = count }

                            fun offset(offset: Boolean) = offset(JsonField.of(offset))

                            @JsonProperty("offset")
                            @ExcludeMissing
                            fun offset(offset: JsonField<Boolean>) = apply { this.offset = offset }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Paging =
                                Paging(
                                    count,
                                    offset,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }

                @JsonDeserialize(builder = SupportedEmploymentFields.Builder::class)
                @NoAutoDetect
                class SupportedEmploymentFields
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val firstName: JsonField<Boolean>,
                    private val middleName: JsonField<Boolean>,
                    private val lastName: JsonField<Boolean>,
                    private val title: JsonField<Boolean>,
                    private val startDate: JsonField<Boolean>,
                    private val endDate: JsonField<Boolean>,
                    private val isActive: JsonField<Boolean>,
                    private val incomeHistory: JsonField<Boolean>,
                    private val classCode: JsonField<Boolean>,
                    private val customFields: JsonField<Boolean>,
                    private val department: JsonField<Department>,
                    private val employment: JsonField<Employment>,
                    private val income: JsonField<Income>,
                    private val location: JsonField<Location>,
                    private val manager: JsonField<Manager>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun id(): Boolean? = id.getNullable("id")

                    fun firstName(): Boolean? = firstName.getNullable("first_name")

                    fun middleName(): Boolean? = middleName.getNullable("middle_name")

                    fun lastName(): Boolean? = lastName.getNullable("last_name")

                    fun title(): Boolean? = title.getNullable("title")

                    fun startDate(): Boolean? = startDate.getNullable("start_date")

                    fun endDate(): Boolean? = endDate.getNullable("end_date")

                    fun isActive(): Boolean? = isActive.getNullable("is_active")

                    fun incomeHistory(): Boolean? = incomeHistory.getNullable("income_history")

                    fun classCode(): Boolean? = classCode.getNullable("class_code")

                    fun customFields(): Boolean? = customFields.getNullable("custom_fields")

                    fun department(): Department? = department.getNullable("department")

                    fun employment(): Employment? = employment.getNullable("employment")

                    fun income(): Income? = income.getNullable("income")

                    fun location(): Location? = location.getNullable("location")

                    fun manager(): Manager? = manager.getNullable("manager")

                    @JsonProperty("id") @ExcludeMissing fun _id() = id

                    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

                    @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

                    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

                    @JsonProperty("title") @ExcludeMissing fun _title() = title

                    @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

                    @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

                    @JsonProperty("is_active") @ExcludeMissing fun _isActive() = isActive

                    @JsonProperty("income_history")
                    @ExcludeMissing
                    fun _incomeHistory() = incomeHistory

                    @JsonProperty("class_code") @ExcludeMissing fun _classCode() = classCode

                    @JsonProperty("custom_fields")
                    @ExcludeMissing
                    fun _customFields() = customFields

                    @JsonProperty("department") @ExcludeMissing fun _department() = department

                    @JsonProperty("employment") @ExcludeMissing fun _employment() = employment

                    @JsonProperty("income") @ExcludeMissing fun _income() = income

                    @JsonProperty("location") @ExcludeMissing fun _location() = location

                    @JsonProperty("manager") @ExcludeMissing fun _manager() = manager

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): SupportedEmploymentFields = apply {
                        if (!validated) {
                            id()
                            firstName()
                            middleName()
                            lastName()
                            title()
                            startDate()
                            endDate()
                            isActive()
                            incomeHistory()
                            classCode()
                            customFields()
                            department()?.validate()
                            employment()?.validate()
                            income()?.validate()
                            location()?.validate()
                            manager()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SupportedEmploymentFields &&
                            this.id == other.id &&
                            this.firstName == other.firstName &&
                            this.middleName == other.middleName &&
                            this.lastName == other.lastName &&
                            this.title == other.title &&
                            this.startDate == other.startDate &&
                            this.endDate == other.endDate &&
                            this.isActive == other.isActive &&
                            this.incomeHistory == other.incomeHistory &&
                            this.classCode == other.classCode &&
                            this.customFields == other.customFields &&
                            this.department == other.department &&
                            this.employment == other.employment &&
                            this.income == other.income &&
                            this.location == other.location &&
                            this.manager == other.manager &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    id,
                                    firstName,
                                    middleName,
                                    lastName,
                                    title,
                                    startDate,
                                    endDate,
                                    isActive,
                                    incomeHistory,
                                    classCode,
                                    customFields,
                                    department,
                                    employment,
                                    income,
                                    location,
                                    manager,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "SupportedEmploymentFields{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, title=$title, startDate=$startDate, endDate=$endDate, isActive=$isActive, incomeHistory=$incomeHistory, classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, income=$income, location=$location, manager=$manager, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var firstName: JsonField<Boolean> = JsonMissing.of()
                        private var middleName: JsonField<Boolean> = JsonMissing.of()
                        private var lastName: JsonField<Boolean> = JsonMissing.of()
                        private var title: JsonField<Boolean> = JsonMissing.of()
                        private var startDate: JsonField<Boolean> = JsonMissing.of()
                        private var endDate: JsonField<Boolean> = JsonMissing.of()
                        private var isActive: JsonField<Boolean> = JsonMissing.of()
                        private var incomeHistory: JsonField<Boolean> = JsonMissing.of()
                        private var classCode: JsonField<Boolean> = JsonMissing.of()
                        private var customFields: JsonField<Boolean> = JsonMissing.of()
                        private var department: JsonField<Department> = JsonMissing.of()
                        private var employment: JsonField<Employment> = JsonMissing.of()
                        private var income: JsonField<Income> = JsonMissing.of()
                        private var location: JsonField<Location> = JsonMissing.of()
                        private var manager: JsonField<Manager> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedEmploymentFields: SupportedEmploymentFields) =
                            apply {
                                this.id = supportedEmploymentFields.id
                                this.firstName = supportedEmploymentFields.firstName
                                this.middleName = supportedEmploymentFields.middleName
                                this.lastName = supportedEmploymentFields.lastName
                                this.title = supportedEmploymentFields.title
                                this.startDate = supportedEmploymentFields.startDate
                                this.endDate = supportedEmploymentFields.endDate
                                this.isActive = supportedEmploymentFields.isActive
                                this.incomeHistory = supportedEmploymentFields.incomeHistory
                                this.classCode = supportedEmploymentFields.classCode
                                this.customFields = supportedEmploymentFields.customFields
                                this.department = supportedEmploymentFields.department
                                this.employment = supportedEmploymentFields.employment
                                this.income = supportedEmploymentFields.income
                                this.location = supportedEmploymentFields.location
                                this.manager = supportedEmploymentFields.manager
                                additionalProperties(supportedEmploymentFields.additionalProperties)
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        @JsonProperty("id")
                        @ExcludeMissing
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                        @JsonProperty("first_name")
                        @ExcludeMissing
                        fun firstName(firstName: JsonField<Boolean>) = apply {
                            this.firstName = firstName
                        }

                        fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                        @JsonProperty("middle_name")
                        @ExcludeMissing
                        fun middleName(middleName: JsonField<Boolean>) = apply {
                            this.middleName = middleName
                        }

                        fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                        @JsonProperty("last_name")
                        @ExcludeMissing
                        fun lastName(lastName: JsonField<Boolean>) = apply {
                            this.lastName = lastName
                        }

                        fun title(title: Boolean) = title(JsonField.of(title))

                        @JsonProperty("title")
                        @ExcludeMissing
                        fun title(title: JsonField<Boolean>) = apply { this.title = title }

                        fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                        @JsonProperty("start_date")
                        @ExcludeMissing
                        fun startDate(startDate: JsonField<Boolean>) = apply {
                            this.startDate = startDate
                        }

                        fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                        @JsonProperty("end_date")
                        @ExcludeMissing
                        fun endDate(endDate: JsonField<Boolean>) = apply { this.endDate = endDate }

                        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

                        @JsonProperty("is_active")
                        @ExcludeMissing
                        fun isActive(isActive: JsonField<Boolean>) = apply {
                            this.isActive = isActive
                        }

                        fun incomeHistory(incomeHistory: Boolean) =
                            incomeHistory(JsonField.of(incomeHistory))

                        @JsonProperty("income_history")
                        @ExcludeMissing
                        fun incomeHistory(incomeHistory: JsonField<Boolean>) = apply {
                            this.incomeHistory = incomeHistory
                        }

                        fun classCode(classCode: Boolean) = classCode(JsonField.of(classCode))

                        @JsonProperty("class_code")
                        @ExcludeMissing
                        fun classCode(classCode: JsonField<Boolean>) = apply {
                            this.classCode = classCode
                        }

                        fun customFields(customFields: Boolean) =
                            customFields(JsonField.of(customFields))

                        @JsonProperty("custom_fields")
                        @ExcludeMissing
                        fun customFields(customFields: JsonField<Boolean>) = apply {
                            this.customFields = customFields
                        }

                        fun department(department: Department) =
                            department(JsonField.of(department))

                        @JsonProperty("department")
                        @ExcludeMissing
                        fun department(department: JsonField<Department>) = apply {
                            this.department = department
                        }

                        fun employment(employment: Employment) =
                            employment(JsonField.of(employment))

                        @JsonProperty("employment")
                        @ExcludeMissing
                        fun employment(employment: JsonField<Employment>) = apply {
                            this.employment = employment
                        }

                        fun income(income: Income) = income(JsonField.of(income))

                        @JsonProperty("income")
                        @ExcludeMissing
                        fun income(income: JsonField<Income>) = apply { this.income = income }

                        fun location(location: Location) = location(JsonField.of(location))

                        @JsonProperty("location")
                        @ExcludeMissing
                        fun location(location: JsonField<Location>) = apply {
                            this.location = location
                        }

                        fun manager(manager: Manager) = manager(JsonField.of(manager))

                        @JsonProperty("manager")
                        @ExcludeMissing
                        fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): SupportedEmploymentFields =
                            SupportedEmploymentFields(
                                id,
                                firstName,
                                middleName,
                                lastName,
                                title,
                                startDate,
                                endDate,
                                isActive,
                                incomeHistory,
                                classCode,
                                customFields,
                                department,
                                employment,
                                income,
                                location,
                                manager,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = Department.Builder::class)
                    @NoAutoDetect
                    class Department
                    private constructor(
                        private val name: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun name(): Boolean? = name.getNullable("name")

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Department = apply {
                            if (!validated) {
                                name()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Department &&
                                this.name == other.name &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(name, additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Department{name=$name, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var name: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(department: Department) = apply {
                                this.name = department.name
                                additionalProperties(department.additionalProperties)
                            }

                            fun name(name: Boolean) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<Boolean>) = apply { this.name = name }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Department =
                                Department(name, additionalProperties.toUnmodifiable())
                        }
                    }

                    @JsonDeserialize(builder = Employment.Builder::class)
                    @NoAutoDetect
                    class Employment
                    private constructor(
                        private val type: JsonField<Boolean>,
                        private val subtype: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun type(): Boolean? = type.getNullable("type")

                        fun subtype(): Boolean? = subtype.getNullable("subtype")

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Employment = apply {
                            if (!validated) {
                                type()
                                subtype()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Employment &&
                                this.type == other.type &&
                                this.subtype == other.subtype &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        type,
                                        subtype,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Employment{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var subtype: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(employment: Employment) = apply {
                                this.type = employment.type
                                this.subtype = employment.subtype
                                additionalProperties(employment.additionalProperties)
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun subtype(subtype: Boolean) = subtype(JsonField.of(subtype))

                            @JsonProperty("subtype")
                            @ExcludeMissing
                            fun subtype(subtype: JsonField<Boolean>) = apply {
                                this.subtype = subtype
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Employment =
                                Employment(
                                    type,
                                    subtype,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    @JsonDeserialize(builder = Income.Builder::class)
                    @NoAutoDetect
                    class Income
                    private constructor(
                        private val amount: JsonField<Boolean>,
                        private val currency: JsonField<Boolean>,
                        private val unit: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun amount(): Boolean? = amount.getNullable("amount")

                        fun currency(): Boolean? = currency.getNullable("currency")

                        fun unit(): Boolean? = unit.getNullable("unit")

                        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                        @JsonProperty("unit") @ExcludeMissing fun _unit() = unit

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Income = apply {
                            if (!validated) {
                                amount()
                                currency()
                                unit()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Income &&
                                this.amount == other.amount &&
                                this.currency == other.currency &&
                                this.unit == other.unit &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        amount,
                                        currency,
                                        unit,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Income{amount=$amount, currency=$currency, unit=$unit, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var amount: JsonField<Boolean> = JsonMissing.of()
                            private var currency: JsonField<Boolean> = JsonMissing.of()
                            private var unit: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(income: Income) = apply {
                                this.amount = income.amount
                                this.currency = income.currency
                                this.unit = income.unit
                                additionalProperties(income.additionalProperties)
                            }

                            fun amount(amount: Boolean) = amount(JsonField.of(amount))

                            @JsonProperty("amount")
                            @ExcludeMissing
                            fun amount(amount: JsonField<Boolean>) = apply { this.amount = amount }

                            fun currency(currency: Boolean) = currency(JsonField.of(currency))

                            @JsonProperty("currency")
                            @ExcludeMissing
                            fun currency(currency: JsonField<Boolean>) = apply {
                                this.currency = currency
                            }

                            fun unit(unit: Boolean) = unit(JsonField.of(unit))

                            @JsonProperty("unit")
                            @ExcludeMissing
                            fun unit(unit: JsonField<Boolean>) = apply { this.unit = unit }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Income =
                                Income(
                                    amount,
                                    currency,
                                    unit,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    @JsonDeserialize(builder = Location.Builder::class)
                    @NoAutoDetect
                    class Location
                    private constructor(
                        private val line1: JsonField<Boolean>,
                        private val line2: JsonField<Boolean>,
                        private val city: JsonField<Boolean>,
                        private val state: JsonField<Boolean>,
                        private val postalCode: JsonField<Boolean>,
                        private val country: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun line1(): Boolean? = line1.getNullable("line1")

                        fun line2(): Boolean? = line2.getNullable("line2")

                        fun city(): Boolean? = city.getNullable("city")

                        fun state(): Boolean? = state.getNullable("state")

                        fun postalCode(): Boolean? = postalCode.getNullable("postal_code")

                        fun country(): Boolean? = country.getNullable("country")

                        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                        @JsonProperty("city") @ExcludeMissing fun _city() = city

                        @JsonProperty("state") @ExcludeMissing fun _state() = state

                        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

                        @JsonProperty("country") @ExcludeMissing fun _country() = country

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Location = apply {
                            if (!validated) {
                                line1()
                                line2()
                                city()
                                state()
                                postalCode()
                                country()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Location &&
                                this.line1 == other.line1 &&
                                this.line2 == other.line2 &&
                                this.city == other.city &&
                                this.state == other.state &&
                                this.postalCode == other.postalCode &&
                                this.country == other.country &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        line1,
                                        line2,
                                        city,
                                        state,
                                        postalCode,
                                        country,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Location{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var line1: JsonField<Boolean> = JsonMissing.of()
                            private var line2: JsonField<Boolean> = JsonMissing.of()
                            private var city: JsonField<Boolean> = JsonMissing.of()
                            private var state: JsonField<Boolean> = JsonMissing.of()
                            private var postalCode: JsonField<Boolean> = JsonMissing.of()
                            private var country: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(location: Location) = apply {
                                this.line1 = location.line1
                                this.line2 = location.line2
                                this.city = location.city
                                this.state = location.state
                                this.postalCode = location.postalCode
                                this.country = location.country
                                additionalProperties(location.additionalProperties)
                            }

                            fun line1(line1: Boolean) = line1(JsonField.of(line1))

                            @JsonProperty("line1")
                            @ExcludeMissing
                            fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                            fun line2(line2: Boolean) = line2(JsonField.of(line2))

                            @JsonProperty("line2")
                            @ExcludeMissing
                            fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                            fun city(city: Boolean) = city(JsonField.of(city))

                            @JsonProperty("city")
                            @ExcludeMissing
                            fun city(city: JsonField<Boolean>) = apply { this.city = city }

                            fun state(state: Boolean) = state(JsonField.of(state))

                            @JsonProperty("state")
                            @ExcludeMissing
                            fun state(state: JsonField<Boolean>) = apply { this.state = state }

                            fun postalCode(postalCode: Boolean) =
                                postalCode(JsonField.of(postalCode))

                            @JsonProperty("postal_code")
                            @ExcludeMissing
                            fun postalCode(postalCode: JsonField<Boolean>) = apply {
                                this.postalCode = postalCode
                            }

                            fun country(country: Boolean) = country(JsonField.of(country))

                            @JsonProperty("country")
                            @ExcludeMissing
                            fun country(country: JsonField<Boolean>) = apply {
                                this.country = country
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Location =
                                Location(
                                    line1,
                                    line2,
                                    city,
                                    state,
                                    postalCode,
                                    country,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    @JsonDeserialize(builder = Manager.Builder::class)
                    @NoAutoDetect
                    class Manager
                    private constructor(
                        private val id: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun id(): Boolean? = id.getNullable("id")

                        @JsonProperty("id") @ExcludeMissing fun _id() = id

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Manager = apply {
                            if (!validated) {
                                id()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Manager &&
                                this.id == other.id &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(id, additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Manager{id=$id, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var id: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(manager: Manager) = apply {
                                this.id = manager.id
                                additionalProperties(manager.additionalProperties)
                            }

                            fun id(id: Boolean) = id(JsonField.of(id))

                            @JsonProperty("id")
                            @ExcludeMissing
                            fun id(id: JsonField<Boolean>) = apply { this.id = id }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Manager =
                                Manager(id, additionalProperties.toUnmodifiable())
                        }
                    }
                }

                @JsonDeserialize(builder = SupportedIndividualFields.Builder::class)
                @NoAutoDetect
                class SupportedIndividualFields
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val firstName: JsonField<Boolean>,
                    private val middleName: JsonField<Boolean>,
                    private val lastName: JsonField<Boolean>,
                    private val preferredName: JsonField<Boolean>,
                    private val dob: JsonField<Boolean>,
                    private val gender: JsonField<Boolean>,
                    private val ethnicity: JsonField<Boolean>,
                    private val ssn: JsonField<Boolean>,
                    private val encryptedSsn: JsonField<Boolean>,
                    private val emails: JsonField<Emails>,
                    private val phoneNumbers: JsonField<PhoneNumbers>,
                    private val residence: JsonField<Residence>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun id(): Boolean? = id.getNullable("id")

                    fun firstName(): Boolean? = firstName.getNullable("first_name")

                    fun middleName(): Boolean? = middleName.getNullable("middle_name")

                    fun lastName(): Boolean? = lastName.getNullable("last_name")

                    fun preferredName(): Boolean? = preferredName.getNullable("preferred_name")

                    fun dob(): Boolean? = dob.getNullable("dob")

                    fun gender(): Boolean? = gender.getNullable("gender")

                    fun ethnicity(): Boolean? = ethnicity.getNullable("ethnicity")

                    fun ssn(): Boolean? = ssn.getNullable("ssn")

                    fun encryptedSsn(): Boolean? = encryptedSsn.getNullable("encrypted_ssn")

                    fun emails(): Emails? = emails.getNullable("emails")

                    fun phoneNumbers(): PhoneNumbers? = phoneNumbers.getNullable("phone_numbers")

                    fun residence(): Residence? = residence.getNullable("residence")

                    @JsonProperty("id") @ExcludeMissing fun _id() = id

                    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

                    @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

                    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

                    @JsonProperty("preferred_name")
                    @ExcludeMissing
                    fun _preferredName() = preferredName

                    @JsonProperty("dob") @ExcludeMissing fun _dob() = dob

                    @JsonProperty("gender") @ExcludeMissing fun _gender() = gender

                    @JsonProperty("ethnicity") @ExcludeMissing fun _ethnicity() = ethnicity

                    @JsonProperty("ssn") @ExcludeMissing fun _ssn() = ssn

                    @JsonProperty("encrypted_ssn")
                    @ExcludeMissing
                    fun _encryptedSsn() = encryptedSsn

                    @JsonProperty("emails") @ExcludeMissing fun _emails() = emails

                    @JsonProperty("phone_numbers")
                    @ExcludeMissing
                    fun _phoneNumbers() = phoneNumbers

                    @JsonProperty("residence") @ExcludeMissing fun _residence() = residence

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): SupportedIndividualFields = apply {
                        if (!validated) {
                            id()
                            firstName()
                            middleName()
                            lastName()
                            preferredName()
                            dob()
                            gender()
                            ethnicity()
                            ssn()
                            encryptedSsn()
                            emails()?.validate()
                            phoneNumbers()?.validate()
                            residence()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SupportedIndividualFields &&
                            this.id == other.id &&
                            this.firstName == other.firstName &&
                            this.middleName == other.middleName &&
                            this.lastName == other.lastName &&
                            this.preferredName == other.preferredName &&
                            this.dob == other.dob &&
                            this.gender == other.gender &&
                            this.ethnicity == other.ethnicity &&
                            this.ssn == other.ssn &&
                            this.encryptedSsn == other.encryptedSsn &&
                            this.emails == other.emails &&
                            this.phoneNumbers == other.phoneNumbers &&
                            this.residence == other.residence &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    id,
                                    firstName,
                                    middleName,
                                    lastName,
                                    preferredName,
                                    dob,
                                    gender,
                                    ethnicity,
                                    ssn,
                                    encryptedSsn,
                                    emails,
                                    phoneNumbers,
                                    residence,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "SupportedIndividualFields{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, preferredName=$preferredName, dob=$dob, gender=$gender, ethnicity=$ethnicity, ssn=$ssn, encryptedSsn=$encryptedSsn, emails=$emails, phoneNumbers=$phoneNumbers, residence=$residence, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var firstName: JsonField<Boolean> = JsonMissing.of()
                        private var middleName: JsonField<Boolean> = JsonMissing.of()
                        private var lastName: JsonField<Boolean> = JsonMissing.of()
                        private var preferredName: JsonField<Boolean> = JsonMissing.of()
                        private var dob: JsonField<Boolean> = JsonMissing.of()
                        private var gender: JsonField<Boolean> = JsonMissing.of()
                        private var ethnicity: JsonField<Boolean> = JsonMissing.of()
                        private var ssn: JsonField<Boolean> = JsonMissing.of()
                        private var encryptedSsn: JsonField<Boolean> = JsonMissing.of()
                        private var emails: JsonField<Emails> = JsonMissing.of()
                        private var phoneNumbers: JsonField<PhoneNumbers> = JsonMissing.of()
                        private var residence: JsonField<Residence> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedIndividualFields: SupportedIndividualFields) =
                            apply {
                                this.id = supportedIndividualFields.id
                                this.firstName = supportedIndividualFields.firstName
                                this.middleName = supportedIndividualFields.middleName
                                this.lastName = supportedIndividualFields.lastName
                                this.preferredName = supportedIndividualFields.preferredName
                                this.dob = supportedIndividualFields.dob
                                this.gender = supportedIndividualFields.gender
                                this.ethnicity = supportedIndividualFields.ethnicity
                                this.ssn = supportedIndividualFields.ssn
                                this.encryptedSsn = supportedIndividualFields.encryptedSsn
                                this.emails = supportedIndividualFields.emails
                                this.phoneNumbers = supportedIndividualFields.phoneNumbers
                                this.residence = supportedIndividualFields.residence
                                additionalProperties(supportedIndividualFields.additionalProperties)
                            }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        @JsonProperty("id")
                        @ExcludeMissing
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun firstName(firstName: Boolean) = firstName(JsonField.of(firstName))

                        @JsonProperty("first_name")
                        @ExcludeMissing
                        fun firstName(firstName: JsonField<Boolean>) = apply {
                            this.firstName = firstName
                        }

                        fun middleName(middleName: Boolean) = middleName(JsonField.of(middleName))

                        @JsonProperty("middle_name")
                        @ExcludeMissing
                        fun middleName(middleName: JsonField<Boolean>) = apply {
                            this.middleName = middleName
                        }

                        fun lastName(lastName: Boolean) = lastName(JsonField.of(lastName))

                        @JsonProperty("last_name")
                        @ExcludeMissing
                        fun lastName(lastName: JsonField<Boolean>) = apply {
                            this.lastName = lastName
                        }

                        fun preferredName(preferredName: Boolean) =
                            preferredName(JsonField.of(preferredName))

                        @JsonProperty("preferred_name")
                        @ExcludeMissing
                        fun preferredName(preferredName: JsonField<Boolean>) = apply {
                            this.preferredName = preferredName
                        }

                        fun dob(dob: Boolean) = dob(JsonField.of(dob))

                        @JsonProperty("dob")
                        @ExcludeMissing
                        fun dob(dob: JsonField<Boolean>) = apply { this.dob = dob }

                        fun gender(gender: Boolean) = gender(JsonField.of(gender))

                        @JsonProperty("gender")
                        @ExcludeMissing
                        fun gender(gender: JsonField<Boolean>) = apply { this.gender = gender }

                        fun ethnicity(ethnicity: Boolean) = ethnicity(JsonField.of(ethnicity))

                        @JsonProperty("ethnicity")
                        @ExcludeMissing
                        fun ethnicity(ethnicity: JsonField<Boolean>) = apply {
                            this.ethnicity = ethnicity
                        }

                        fun ssn(ssn: Boolean) = ssn(JsonField.of(ssn))

                        @JsonProperty("ssn")
                        @ExcludeMissing
                        fun ssn(ssn: JsonField<Boolean>) = apply { this.ssn = ssn }

                        fun encryptedSsn(encryptedSsn: Boolean) =
                            encryptedSsn(JsonField.of(encryptedSsn))

                        @JsonProperty("encrypted_ssn")
                        @ExcludeMissing
                        fun encryptedSsn(encryptedSsn: JsonField<Boolean>) = apply {
                            this.encryptedSsn = encryptedSsn
                        }

                        fun emails(emails: Emails) = emails(JsonField.of(emails))

                        @JsonProperty("emails")
                        @ExcludeMissing
                        fun emails(emails: JsonField<Emails>) = apply { this.emails = emails }

                        fun phoneNumbers(phoneNumbers: PhoneNumbers) =
                            phoneNumbers(JsonField.of(phoneNumbers))

                        @JsonProperty("phone_numbers")
                        @ExcludeMissing
                        fun phoneNumbers(phoneNumbers: JsonField<PhoneNumbers>) = apply {
                            this.phoneNumbers = phoneNumbers
                        }

                        fun residence(residence: Residence) = residence(JsonField.of(residence))

                        @JsonProperty("residence")
                        @ExcludeMissing
                        fun residence(residence: JsonField<Residence>) = apply {
                            this.residence = residence
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): SupportedIndividualFields =
                            SupportedIndividualFields(
                                id,
                                firstName,
                                middleName,
                                lastName,
                                preferredName,
                                dob,
                                gender,
                                ethnicity,
                                ssn,
                                encryptedSsn,
                                emails,
                                phoneNumbers,
                                residence,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = Emails.Builder::class)
                    @NoAutoDetect
                    class Emails
                    private constructor(
                        private val data: JsonField<Boolean>,
                        private val type: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun data(): Boolean? = data.getNullable("data")

                        fun type(): Boolean? = type.getNullable("type")

                        @JsonProperty("data") @ExcludeMissing fun _data() = data

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Emails = apply {
                            if (!validated) {
                                data()
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Emails &&
                                this.data == other.data &&
                                this.type == other.type &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        data,
                                        type,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Emails{data=$data, type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var data: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(emails: Emails) = apply {
                                this.data = emails.data
                                this.type = emails.type
                                additionalProperties(emails.additionalProperties)
                            }

                            fun data(data: Boolean) = data(JsonField.of(data))

                            @JsonProperty("data")
                            @ExcludeMissing
                            fun data(data: JsonField<Boolean>) = apply { this.data = data }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Emails =
                                Emails(
                                    data,
                                    type,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    @JsonDeserialize(builder = PhoneNumbers.Builder::class)
                    @NoAutoDetect
                    class PhoneNumbers
                    private constructor(
                        private val data: JsonField<Boolean>,
                        private val type: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun data(): Boolean? = data.getNullable("data")

                        fun type(): Boolean? = type.getNullable("type")

                        @JsonProperty("data") @ExcludeMissing fun _data() = data

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): PhoneNumbers = apply {
                            if (!validated) {
                                data()
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PhoneNumbers &&
                                this.data == other.data &&
                                this.type == other.type &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        data,
                                        type,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "PhoneNumbers{data=$data, type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var data: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(phoneNumbers: PhoneNumbers) = apply {
                                this.data = phoneNumbers.data
                                this.type = phoneNumbers.type
                                additionalProperties(phoneNumbers.additionalProperties)
                            }

                            fun data(data: Boolean) = data(JsonField.of(data))

                            @JsonProperty("data")
                            @ExcludeMissing
                            fun data(data: JsonField<Boolean>) = apply { this.data = data }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): PhoneNumbers =
                                PhoneNumbers(
                                    data,
                                    type,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    @JsonDeserialize(builder = Residence.Builder::class)
                    @NoAutoDetect
                    class Residence
                    private constructor(
                        private val city: JsonField<Boolean>,
                        private val country: JsonField<Boolean>,
                        private val line1: JsonField<Boolean>,
                        private val line2: JsonField<Boolean>,
                        private val postalCode: JsonField<Boolean>,
                        private val state: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun city(): Boolean? = city.getNullable("city")

                        fun country(): Boolean? = country.getNullable("country")

                        fun line1(): Boolean? = line1.getNullable("line1")

                        fun line2(): Boolean? = line2.getNullable("line2")

                        fun postalCode(): Boolean? = postalCode.getNullable("postal_code")

                        fun state(): Boolean? = state.getNullable("state")

                        @JsonProperty("city") @ExcludeMissing fun _city() = city

                        @JsonProperty("country") @ExcludeMissing fun _country() = country

                        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

                        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

                        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

                        @JsonProperty("state") @ExcludeMissing fun _state() = state

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Residence = apply {
                            if (!validated) {
                                city()
                                country()
                                line1()
                                line2()
                                postalCode()
                                state()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Residence &&
                                this.city == other.city &&
                                this.country == other.country &&
                                this.line1 == other.line1 &&
                                this.line2 == other.line2 &&
                                this.postalCode == other.postalCode &&
                                this.state == other.state &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        city,
                                        country,
                                        line1,
                                        line2,
                                        postalCode,
                                        state,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Residence{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var city: JsonField<Boolean> = JsonMissing.of()
                            private var country: JsonField<Boolean> = JsonMissing.of()
                            private var line1: JsonField<Boolean> = JsonMissing.of()
                            private var line2: JsonField<Boolean> = JsonMissing.of()
                            private var postalCode: JsonField<Boolean> = JsonMissing.of()
                            private var state: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(residence: Residence) = apply {
                                this.city = residence.city
                                this.country = residence.country
                                this.line1 = residence.line1
                                this.line2 = residence.line2
                                this.postalCode = residence.postalCode
                                this.state = residence.state
                                additionalProperties(residence.additionalProperties)
                            }

                            fun city(city: Boolean) = city(JsonField.of(city))

                            @JsonProperty("city")
                            @ExcludeMissing
                            fun city(city: JsonField<Boolean>) = apply { this.city = city }

                            fun country(country: Boolean) = country(JsonField.of(country))

                            @JsonProperty("country")
                            @ExcludeMissing
                            fun country(country: JsonField<Boolean>) = apply {
                                this.country = country
                            }

                            fun line1(line1: Boolean) = line1(JsonField.of(line1))

                            @JsonProperty("line1")
                            @ExcludeMissing
                            fun line1(line1: JsonField<Boolean>) = apply { this.line1 = line1 }

                            fun line2(line2: Boolean) = line2(JsonField.of(line2))

                            @JsonProperty("line2")
                            @ExcludeMissing
                            fun line2(line2: JsonField<Boolean>) = apply { this.line2 = line2 }

                            fun postalCode(postalCode: Boolean) =
                                postalCode(JsonField.of(postalCode))

                            @JsonProperty("postal_code")
                            @ExcludeMissing
                            fun postalCode(postalCode: JsonField<Boolean>) = apply {
                                this.postalCode = postalCode
                            }

                            fun state(state: Boolean) = state(JsonField.of(state))

                            @JsonProperty("state")
                            @ExcludeMissing
                            fun state(state: JsonField<Boolean>) = apply { this.state = state }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Residence =
                                Residence(
                                    city,
                                    country,
                                    line1,
                                    line2,
                                    postalCode,
                                    state,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }

                @JsonDeserialize(builder = SupportedPayStatementFields.Builder::class)
                @NoAutoDetect
                class SupportedPayStatementFields
                private constructor(
                    private val paging: JsonField<Paging>,
                    private val payStatements: JsonField<PayStatements>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun paging(): Paging? = paging.getNullable("paging")

                    fun payStatements(): PayStatements? =
                        payStatements.getNullable("pay_statements")

                    @JsonProperty("paging") @ExcludeMissing fun _paging() = paging

                    @JsonProperty("pay_statements")
                    @ExcludeMissing
                    fun _payStatements() = payStatements

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): SupportedPayStatementFields = apply {
                        if (!validated) {
                            paging()?.validate()
                            payStatements()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SupportedPayStatementFields &&
                            this.paging == other.paging &&
                            this.payStatements == other.payStatements &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    paging,
                                    payStatements,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "SupportedPayStatementFields{paging=$paging, payStatements=$payStatements, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var paging: JsonField<Paging> = JsonMissing.of()
                        private var payStatements: JsonField<PayStatements> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            supportedPayStatementFields: SupportedPayStatementFields
                        ) = apply {
                            this.paging = supportedPayStatementFields.paging
                            this.payStatements = supportedPayStatementFields.payStatements
                            additionalProperties(supportedPayStatementFields.additionalProperties)
                        }

                        fun paging(paging: Paging) = paging(JsonField.of(paging))

                        @JsonProperty("paging")
                        @ExcludeMissing
                        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

                        fun payStatements(payStatements: PayStatements) =
                            payStatements(JsonField.of(payStatements))

                        @JsonProperty("pay_statements")
                        @ExcludeMissing
                        fun payStatements(payStatements: JsonField<PayStatements>) = apply {
                            this.payStatements = payStatements
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): SupportedPayStatementFields =
                            SupportedPayStatementFields(
                                paging,
                                payStatements,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = Paging.Builder::class)
                    @NoAutoDetect
                    class Paging
                    private constructor(
                        private val count: JsonField<Boolean>,
                        private val offset: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun count(): Boolean = count.getRequired("count")

                        fun offset(): Boolean = offset.getRequired("offset")

                        @JsonProperty("count") @ExcludeMissing fun _count() = count

                        @JsonProperty("offset") @ExcludeMissing fun _offset() = offset

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Paging = apply {
                            if (!validated) {
                                count()
                                offset()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Paging &&
                                this.count == other.count &&
                                this.offset == other.offset &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        count,
                                        offset,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Paging{count=$count, offset=$offset, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var count: JsonField<Boolean> = JsonMissing.of()
                            private var offset: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(paging: Paging) = apply {
                                this.count = paging.count
                                this.offset = paging.offset
                                additionalProperties(paging.additionalProperties)
                            }

                            fun count(count: Boolean) = count(JsonField.of(count))

                            @JsonProperty("count")
                            @ExcludeMissing
                            fun count(count: JsonField<Boolean>) = apply { this.count = count }

                            fun offset(offset: Boolean) = offset(JsonField.of(offset))

                            @JsonProperty("offset")
                            @ExcludeMissing
                            fun offset(offset: JsonField<Boolean>) = apply { this.offset = offset }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Paging =
                                Paging(
                                    count,
                                    offset,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }

                    @JsonDeserialize(builder = PayStatements.Builder::class)
                    @NoAutoDetect
                    class PayStatements
                    private constructor(
                        private val individualId: JsonField<Boolean>,
                        private val type: JsonField<Boolean>,
                        private val paymentMethod: JsonField<Boolean>,
                        private val totalHours: JsonField<Boolean>,
                        private val grossPay: JsonField<Boolean>,
                        private val netPay: JsonField<Boolean>,
                        private val earnings: JsonField<Earnings>,
                        private val employeeDeductions: JsonField<EmployeeDeductions>,
                        private val employerContributions: JsonField<EmployerContributions>,
                        private val employerDeductions: JsonField<EmployerDeductions>,
                        private val taxes: JsonField<Taxes>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun individualId(): Boolean? = individualId.getNullable("individual_id")

                        fun type(): Boolean? = type.getNullable("type")

                        fun paymentMethod(): Boolean? = paymentMethod.getNullable("payment_method")

                        fun totalHours(): Boolean? = totalHours.getNullable("total_hours")

                        fun grossPay(): Boolean? = grossPay.getNullable("gross_pay")

                        fun netPay(): Boolean? = netPay.getNullable("net_pay")

                        fun earnings(): Earnings? = earnings.getNullable("earnings")

                        fun employeeDeductions(): EmployeeDeductions? =
                            employeeDeductions.getNullable("employee_deductions")

                        fun employerContributions(): EmployerContributions? =
                            employerContributions.getNullable("employer_contributions")

                        /** [DEPRECATED] Use `employer_contributions` instead */
                        fun employerDeductions(): EmployerDeductions? =
                            employerDeductions.getNullable("employer_deductions")

                        fun taxes(): Taxes? = taxes.getNullable("taxes")

                        @JsonProperty("individual_id")
                        @ExcludeMissing
                        fun _individualId() = individualId

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonProperty("payment_method")
                        @ExcludeMissing
                        fun _paymentMethod() = paymentMethod

                        @JsonProperty("total_hours") @ExcludeMissing fun _totalHours() = totalHours

                        @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay() = grossPay

                        @JsonProperty("net_pay") @ExcludeMissing fun _netPay() = netPay

                        @JsonProperty("earnings") @ExcludeMissing fun _earnings() = earnings

                        @JsonProperty("employee_deductions")
                        @ExcludeMissing
                        fun _employeeDeductions() = employeeDeductions

                        @JsonProperty("employer_contributions")
                        @ExcludeMissing
                        fun _employerContributions() = employerContributions

                        /** [DEPRECATED] Use `employer_contributions` instead */
                        @JsonProperty("employer_deductions")
                        @ExcludeMissing
                        fun _employerDeductions() = employerDeductions

                        @JsonProperty("taxes") @ExcludeMissing fun _taxes() = taxes

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): PayStatements = apply {
                            if (!validated) {
                                individualId()
                                type()
                                paymentMethod()
                                totalHours()
                                grossPay()
                                netPay()
                                earnings()?.validate()
                                employeeDeductions()?.validate()
                                employerContributions()?.validate()
                                employerDeductions()?.validate()
                                taxes()?.validate()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PayStatements &&
                                this.individualId == other.individualId &&
                                this.type == other.type &&
                                this.paymentMethod == other.paymentMethod &&
                                this.totalHours == other.totalHours &&
                                this.grossPay == other.grossPay &&
                                this.netPay == other.netPay &&
                                this.earnings == other.earnings &&
                                this.employeeDeductions == other.employeeDeductions &&
                                this.employerContributions == other.employerContributions &&
                                this.employerDeductions == other.employerDeductions &&
                                this.taxes == other.taxes &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        individualId,
                                        type,
                                        paymentMethod,
                                        totalHours,
                                        grossPay,
                                        netPay,
                                        earnings,
                                        employeeDeductions,
                                        employerContributions,
                                        employerDeductions,
                                        taxes,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "PayStatements{individualId=$individualId, type=$type, paymentMethod=$paymentMethod, totalHours=$totalHours, grossPay=$grossPay, netPay=$netPay, earnings=$earnings, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, employerDeductions=$employerDeductions, taxes=$taxes, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var individualId: JsonField<Boolean> = JsonMissing.of()
                            private var type: JsonField<Boolean> = JsonMissing.of()
                            private var paymentMethod: JsonField<Boolean> = JsonMissing.of()
                            private var totalHours: JsonField<Boolean> = JsonMissing.of()
                            private var grossPay: JsonField<Boolean> = JsonMissing.of()
                            private var netPay: JsonField<Boolean> = JsonMissing.of()
                            private var earnings: JsonField<Earnings> = JsonMissing.of()
                            private var employeeDeductions: JsonField<EmployeeDeductions> =
                                JsonMissing.of()
                            private var employerContributions: JsonField<EmployerContributions> =
                                JsonMissing.of()
                            private var employerDeductions: JsonField<EmployerDeductions> =
                                JsonMissing.of()
                            private var taxes: JsonField<Taxes> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(payStatements: PayStatements) = apply {
                                this.individualId = payStatements.individualId
                                this.type = payStatements.type
                                this.paymentMethod = payStatements.paymentMethod
                                this.totalHours = payStatements.totalHours
                                this.grossPay = payStatements.grossPay
                                this.netPay = payStatements.netPay
                                this.earnings = payStatements.earnings
                                this.employeeDeductions = payStatements.employeeDeductions
                                this.employerContributions = payStatements.employerContributions
                                this.employerDeductions = payStatements.employerDeductions
                                this.taxes = payStatements.taxes
                                additionalProperties(payStatements.additionalProperties)
                            }

                            fun individualId(individualId: Boolean) =
                                individualId(JsonField.of(individualId))

                            @JsonProperty("individual_id")
                            @ExcludeMissing
                            fun individualId(individualId: JsonField<Boolean>) = apply {
                                this.individualId = individualId
                            }

                            fun type(type: Boolean) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Boolean>) = apply { this.type = type }

                            fun paymentMethod(paymentMethod: Boolean) =
                                paymentMethod(JsonField.of(paymentMethod))

                            @JsonProperty("payment_method")
                            @ExcludeMissing
                            fun paymentMethod(paymentMethod: JsonField<Boolean>) = apply {
                                this.paymentMethod = paymentMethod
                            }

                            fun totalHours(totalHours: Boolean) =
                                totalHours(JsonField.of(totalHours))

                            @JsonProperty("total_hours")
                            @ExcludeMissing
                            fun totalHours(totalHours: JsonField<Boolean>) = apply {
                                this.totalHours = totalHours
                            }

                            fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                            @JsonProperty("gross_pay")
                            @ExcludeMissing
                            fun grossPay(grossPay: JsonField<Boolean>) = apply {
                                this.grossPay = grossPay
                            }

                            fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                            @JsonProperty("net_pay")
                            @ExcludeMissing
                            fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                            fun earnings(earnings: Earnings) = earnings(JsonField.of(earnings))

                            @JsonProperty("earnings")
                            @ExcludeMissing
                            fun earnings(earnings: JsonField<Earnings>) = apply {
                                this.earnings = earnings
                            }

                            fun employeeDeductions(employeeDeductions: EmployeeDeductions) =
                                employeeDeductions(JsonField.of(employeeDeductions))

                            @JsonProperty("employee_deductions")
                            @ExcludeMissing
                            fun employeeDeductions(
                                employeeDeductions: JsonField<EmployeeDeductions>
                            ) = apply { this.employeeDeductions = employeeDeductions }

                            fun employerContributions(
                                employerContributions: EmployerContributions
                            ) = employerContributions(JsonField.of(employerContributions))

                            @JsonProperty("employer_contributions")
                            @ExcludeMissing
                            fun employerContributions(
                                employerContributions: JsonField<EmployerContributions>
                            ) = apply { this.employerContributions = employerContributions }

                            /** [DEPRECATED] Use `employer_contributions` instead */
                            fun employerDeductions(employerDeductions: EmployerDeductions) =
                                employerDeductions(JsonField.of(employerDeductions))

                            /** [DEPRECATED] Use `employer_contributions` instead */
                            @JsonProperty("employer_deductions")
                            @ExcludeMissing
                            fun employerDeductions(
                                employerDeductions: JsonField<EmployerDeductions>
                            ) = apply { this.employerDeductions = employerDeductions }

                            fun taxes(taxes: Taxes) = taxes(JsonField.of(taxes))

                            @JsonProperty("taxes")
                            @ExcludeMissing
                            fun taxes(taxes: JsonField<Taxes>) = apply { this.taxes = taxes }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): PayStatements =
                                PayStatements(
                                    individualId,
                                    type,
                                    paymentMethod,
                                    totalHours,
                                    grossPay,
                                    netPay,
                                    earnings,
                                    employeeDeductions,
                                    employerContributions,
                                    employerDeductions,
                                    taxes,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        @JsonDeserialize(builder = Earnings.Builder::class)
                        @NoAutoDetect
                        class Earnings
                        private constructor(
                            private val type: JsonField<Boolean>,
                            private val name: JsonField<Boolean>,
                            private val amount: JsonField<Boolean>,
                            private val currency: JsonField<Boolean>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun type(): Boolean? = type.getNullable("type")

                            fun name(): Boolean? = name.getNullable("name")

                            fun amount(): Boolean? = amount.getNullable("amount")

                            fun currency(): Boolean? = currency.getNullable("currency")

                            @JsonProperty("type") @ExcludeMissing fun _type() = type

                            @JsonProperty("name") @ExcludeMissing fun _name() = name

                            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Earnings = apply {
                                if (!validated) {
                                    type()
                                    name()
                                    amount()
                                    currency()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Earnings &&
                                    this.type == other.type &&
                                    this.name == other.name &&
                                    this.amount == other.amount &&
                                    this.currency == other.currency &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            type,
                                            name,
                                            amount,
                                            currency,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Earnings{type=$type, name=$name, amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var type: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(earnings: Earnings) = apply {
                                    this.type = earnings.type
                                    this.name = earnings.name
                                    this.amount = earnings.amount
                                    this.currency = earnings.currency
                                    additionalProperties(earnings.additionalProperties)
                                }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                @JsonProperty("type")
                                @ExcludeMissing
                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                @JsonProperty("amount")
                                @ExcludeMissing
                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                @JsonProperty("currency")
                                @ExcludeMissing
                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Earnings =
                                    Earnings(
                                        type,
                                        name,
                                        amount,
                                        currency,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }
                        }

                        @JsonDeserialize(builder = EmployeeDeductions.Builder::class)
                        @NoAutoDetect
                        class EmployeeDeductions
                        private constructor(
                            private val name: JsonField<Boolean>,
                            private val amount: JsonField<Boolean>,
                            private val type: JsonField<Boolean>,
                            private val preTax: JsonField<Boolean>,
                            private val currency: JsonField<Boolean>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun name(): Boolean? = name.getNullable("name")

                            fun amount(): Boolean? = amount.getNullable("amount")

                            fun type(): Boolean? = type.getNullable("type")

                            fun preTax(): Boolean? = preTax.getNullable("pre_tax")

                            fun currency(): Boolean? = currency.getNullable("currency")

                            @JsonProperty("name") @ExcludeMissing fun _name() = name

                            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                            @JsonProperty("type") @ExcludeMissing fun _type() = type

                            @JsonProperty("pre_tax") @ExcludeMissing fun _preTax() = preTax

                            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): EmployeeDeductions = apply {
                                if (!validated) {
                                    name()
                                    amount()
                                    type()
                                    preTax()
                                    currency()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is EmployeeDeductions &&
                                    this.name == other.name &&
                                    this.amount == other.amount &&
                                    this.type == other.type &&
                                    this.preTax == other.preTax &&
                                    this.currency == other.currency &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            name,
                                            amount,
                                            type,
                                            preTax,
                                            currency,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "EmployeeDeductions{name=$name, amount=$amount, type=$type, preTax=$preTax, currency=$currency, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var type: JsonField<Boolean> = JsonMissing.of()
                                private var preTax: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(employeeDeductions: EmployeeDeductions) = apply {
                                    this.name = employeeDeductions.name
                                    this.amount = employeeDeductions.amount
                                    this.type = employeeDeductions.type
                                    this.preTax = employeeDeductions.preTax
                                    this.currency = employeeDeductions.currency
                                    additionalProperties(employeeDeductions.additionalProperties)
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                @JsonProperty("amount")
                                @ExcludeMissing
                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                @JsonProperty("type")
                                @ExcludeMissing
                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

                                fun preTax(preTax: Boolean) = preTax(JsonField.of(preTax))

                                @JsonProperty("pre_tax")
                                @ExcludeMissing
                                fun preTax(preTax: JsonField<Boolean>) = apply {
                                    this.preTax = preTax
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                @JsonProperty("currency")
                                @ExcludeMissing
                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): EmployeeDeductions =
                                    EmployeeDeductions(
                                        name,
                                        amount,
                                        type,
                                        preTax,
                                        currency,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }
                        }

                        @JsonDeserialize(builder = EmployerContributions.Builder::class)
                        @NoAutoDetect
                        class EmployerContributions
                        private constructor(
                            private val name: JsonField<Boolean>,
                            private val amount: JsonField<Boolean>,
                            private val currency: JsonField<Boolean>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun name(): Boolean? = name.getNullable("name")

                            fun amount(): Boolean? = amount.getNullable("amount")

                            fun currency(): Boolean? = currency.getNullable("currency")

                            @JsonProperty("name") @ExcludeMissing fun _name() = name

                            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): EmployerContributions = apply {
                                if (!validated) {
                                    name()
                                    amount()
                                    currency()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is EmployerContributions &&
                                    this.name == other.name &&
                                    this.amount == other.amount &&
                                    this.currency == other.currency &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            name,
                                            amount,
                                            currency,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "EmployerContributions{name=$name, amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(employerContributions: EmployerContributions) =
                                    apply {
                                        this.name = employerContributions.name
                                        this.amount = employerContributions.amount
                                        this.currency = employerContributions.currency
                                        additionalProperties(
                                            employerContributions.additionalProperties
                                        )
                                    }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                @JsonProperty("amount")
                                @ExcludeMissing
                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                @JsonProperty("currency")
                                @ExcludeMissing
                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): EmployerContributions =
                                    EmployerContributions(
                                        name,
                                        amount,
                                        currency,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }
                        }

                        /** [DEPRECATED] Use `employer_contributions` instead */
                        @JsonDeserialize(builder = EmployerDeductions.Builder::class)
                        @NoAutoDetect
                        class EmployerDeductions
                        private constructor(
                            private val name: JsonField<Boolean>,
                            private val amount: JsonField<Boolean>,
                            private val currency: JsonField<Boolean>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun name(): Boolean? = name.getNullable("name")

                            fun amount(): Boolean? = amount.getNullable("amount")

                            fun currency(): Boolean? = currency.getNullable("currency")

                            @JsonProperty("name") @ExcludeMissing fun _name() = name

                            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): EmployerDeductions = apply {
                                if (!validated) {
                                    name()
                                    amount()
                                    currency()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is EmployerDeductions &&
                                    this.name == other.name &&
                                    this.amount == other.amount &&
                                    this.currency == other.currency &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            name,
                                            amount,
                                            currency,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "EmployerDeductions{name=$name, amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(employerDeductions: EmployerDeductions) = apply {
                                    this.name = employerDeductions.name
                                    this.amount = employerDeductions.amount
                                    this.currency = employerDeductions.currency
                                    additionalProperties(employerDeductions.additionalProperties)
                                }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                @JsonProperty("amount")
                                @ExcludeMissing
                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                @JsonProperty("currency")
                                @ExcludeMissing
                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): EmployerDeductions =
                                    EmployerDeductions(
                                        name,
                                        amount,
                                        currency,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }
                        }

                        @JsonDeserialize(builder = Taxes.Builder::class)
                        @NoAutoDetect
                        class Taxes
                        private constructor(
                            private val type: JsonField<Boolean>,
                            private val name: JsonField<Boolean>,
                            private val employer: JsonField<Boolean>,
                            private val amount: JsonField<Boolean>,
                            private val currency: JsonField<Boolean>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun type(): Boolean? = type.getNullable("type")

                            fun name(): Boolean? = name.getNullable("name")

                            fun employer(): Boolean? = employer.getNullable("employer")

                            fun amount(): Boolean? = amount.getNullable("amount")

                            fun currency(): Boolean? = currency.getNullable("currency")

                            @JsonProperty("type") @ExcludeMissing fun _type() = type

                            @JsonProperty("name") @ExcludeMissing fun _name() = name

                            @JsonProperty("employer") @ExcludeMissing fun _employer() = employer

                            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Taxes = apply {
                                if (!validated) {
                                    type()
                                    name()
                                    employer()
                                    amount()
                                    currency()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Taxes &&
                                    this.type == other.type &&
                                    this.name == other.name &&
                                    this.employer == other.employer &&
                                    this.amount == other.amount &&
                                    this.currency == other.currency &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            type,
                                            name,
                                            employer,
                                            amount,
                                            currency,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Taxes{type=$type, name=$name, employer=$employer, amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var type: JsonField<Boolean> = JsonMissing.of()
                                private var name: JsonField<Boolean> = JsonMissing.of()
                                private var employer: JsonField<Boolean> = JsonMissing.of()
                                private var amount: JsonField<Boolean> = JsonMissing.of()
                                private var currency: JsonField<Boolean> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(taxes: Taxes) = apply {
                                    this.type = taxes.type
                                    this.name = taxes.name
                                    this.employer = taxes.employer
                                    this.amount = taxes.amount
                                    this.currency = taxes.currency
                                    additionalProperties(taxes.additionalProperties)
                                }

                                fun type(type: Boolean) = type(JsonField.of(type))

                                @JsonProperty("type")
                                @ExcludeMissing
                                fun type(type: JsonField<Boolean>) = apply { this.type = type }

                                fun name(name: Boolean) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<Boolean>) = apply { this.name = name }

                                fun employer(employer: Boolean) = employer(JsonField.of(employer))

                                @JsonProperty("employer")
                                @ExcludeMissing
                                fun employer(employer: JsonField<Boolean>) = apply {
                                    this.employer = employer
                                }

                                fun amount(amount: Boolean) = amount(JsonField.of(amount))

                                @JsonProperty("amount")
                                @ExcludeMissing
                                fun amount(amount: JsonField<Boolean>) = apply {
                                    this.amount = amount
                                }

                                fun currency(currency: Boolean) = currency(JsonField.of(currency))

                                @JsonProperty("currency")
                                @ExcludeMissing
                                fun currency(currency: JsonField<Boolean>) = apply {
                                    this.currency = currency
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Taxes =
                                    Taxes(
                                        type,
                                        name,
                                        employer,
                                        amount,
                                        currency,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }
                        }
                    }
                }

                @JsonDeserialize(builder = SupportedPaymentFields.Builder::class)
                @NoAutoDetect
                class SupportedPaymentFields
                private constructor(
                    private val id: JsonField<Boolean>,
                    private val payDate: JsonField<Boolean>,
                    private val debitDate: JsonField<Boolean>,
                    private val companyDebit: JsonField<Boolean>,
                    private val grossPay: JsonField<Boolean>,
                    private val netPay: JsonField<Boolean>,
                    private val employerTaxes: JsonField<Boolean>,
                    private val employeeTaxes: JsonField<Boolean>,
                    private val individualIds: JsonField<Boolean>,
                    private val payPeriod: JsonField<PayPeriod>,
                    private val payGroupIds: JsonField<Boolean>,
                    private val payFrequencies: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun id(): Boolean? = id.getNullable("id")

                    fun payDate(): Boolean? = payDate.getNullable("pay_date")

                    fun debitDate(): Boolean? = debitDate.getNullable("debit_date")

                    fun companyDebit(): Boolean? = companyDebit.getNullable("company_debit")

                    fun grossPay(): Boolean? = grossPay.getNullable("gross_pay")

                    fun netPay(): Boolean? = netPay.getNullable("net_pay")

                    fun employerTaxes(): Boolean? = employerTaxes.getNullable("employer_taxes")

                    fun employeeTaxes(): Boolean? = employeeTaxes.getNullable("employee_taxes")

                    fun individualIds(): Boolean? = individualIds.getNullable("individual_ids")

                    fun payPeriod(): PayPeriod? = payPeriod.getNullable("pay_period")

                    fun payGroupIds(): Boolean? = payGroupIds.getNullable("pay_group_ids")

                    fun payFrequencies(): Boolean? = payFrequencies.getNullable("pay_frequencies")

                    @JsonProperty("id") @ExcludeMissing fun _id() = id

                    @JsonProperty("pay_date") @ExcludeMissing fun _payDate() = payDate

                    @JsonProperty("debit_date") @ExcludeMissing fun _debitDate() = debitDate

                    @JsonProperty("company_debit")
                    @ExcludeMissing
                    fun _companyDebit() = companyDebit

                    @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay() = grossPay

                    @JsonProperty("net_pay") @ExcludeMissing fun _netPay() = netPay

                    @JsonProperty("employer_taxes")
                    @ExcludeMissing
                    fun _employerTaxes() = employerTaxes

                    @JsonProperty("employee_taxes")
                    @ExcludeMissing
                    fun _employeeTaxes() = employeeTaxes

                    @JsonProperty("individual_ids")
                    @ExcludeMissing
                    fun _individualIds() = individualIds

                    @JsonProperty("pay_period") @ExcludeMissing fun _payPeriod() = payPeriod

                    @JsonProperty("pay_group_ids") @ExcludeMissing fun _payGroupIds() = payGroupIds

                    @JsonProperty("pay_frequencies")
                    @ExcludeMissing
                    fun _payFrequencies() = payFrequencies

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): SupportedPaymentFields = apply {
                        if (!validated) {
                            id()
                            payDate()
                            debitDate()
                            companyDebit()
                            grossPay()
                            netPay()
                            employerTaxes()
                            employeeTaxes()
                            individualIds()
                            payPeriod()?.validate()
                            payGroupIds()
                            payFrequencies()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SupportedPaymentFields &&
                            this.id == other.id &&
                            this.payDate == other.payDate &&
                            this.debitDate == other.debitDate &&
                            this.companyDebit == other.companyDebit &&
                            this.grossPay == other.grossPay &&
                            this.netPay == other.netPay &&
                            this.employerTaxes == other.employerTaxes &&
                            this.employeeTaxes == other.employeeTaxes &&
                            this.individualIds == other.individualIds &&
                            this.payPeriod == other.payPeriod &&
                            this.payGroupIds == other.payGroupIds &&
                            this.payFrequencies == other.payFrequencies &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    id,
                                    payDate,
                                    debitDate,
                                    companyDebit,
                                    grossPay,
                                    netPay,
                                    employerTaxes,
                                    employeeTaxes,
                                    individualIds,
                                    payPeriod,
                                    payGroupIds,
                                    payFrequencies,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "SupportedPaymentFields{id=$id, payDate=$payDate, debitDate=$debitDate, companyDebit=$companyDebit, grossPay=$grossPay, netPay=$netPay, employerTaxes=$employerTaxes, employeeTaxes=$employeeTaxes, individualIds=$individualIds, payPeriod=$payPeriod, payGroupIds=$payGroupIds, payFrequencies=$payFrequencies, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var id: JsonField<Boolean> = JsonMissing.of()
                        private var payDate: JsonField<Boolean> = JsonMissing.of()
                        private var debitDate: JsonField<Boolean> = JsonMissing.of()
                        private var companyDebit: JsonField<Boolean> = JsonMissing.of()
                        private var grossPay: JsonField<Boolean> = JsonMissing.of()
                        private var netPay: JsonField<Boolean> = JsonMissing.of()
                        private var employerTaxes: JsonField<Boolean> = JsonMissing.of()
                        private var employeeTaxes: JsonField<Boolean> = JsonMissing.of()
                        private var individualIds: JsonField<Boolean> = JsonMissing.of()
                        private var payPeriod: JsonField<PayPeriod> = JsonMissing.of()
                        private var payGroupIds: JsonField<Boolean> = JsonMissing.of()
                        private var payFrequencies: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(supportedPaymentFields: SupportedPaymentFields) = apply {
                            this.id = supportedPaymentFields.id
                            this.payDate = supportedPaymentFields.payDate
                            this.debitDate = supportedPaymentFields.debitDate
                            this.companyDebit = supportedPaymentFields.companyDebit
                            this.grossPay = supportedPaymentFields.grossPay
                            this.netPay = supportedPaymentFields.netPay
                            this.employerTaxes = supportedPaymentFields.employerTaxes
                            this.employeeTaxes = supportedPaymentFields.employeeTaxes
                            this.individualIds = supportedPaymentFields.individualIds
                            this.payPeriod = supportedPaymentFields.payPeriod
                            this.payGroupIds = supportedPaymentFields.payGroupIds
                            this.payFrequencies = supportedPaymentFields.payFrequencies
                            additionalProperties(supportedPaymentFields.additionalProperties)
                        }

                        fun id(id: Boolean) = id(JsonField.of(id))

                        @JsonProperty("id")
                        @ExcludeMissing
                        fun id(id: JsonField<Boolean>) = apply { this.id = id }

                        fun payDate(payDate: Boolean) = payDate(JsonField.of(payDate))

                        @JsonProperty("pay_date")
                        @ExcludeMissing
                        fun payDate(payDate: JsonField<Boolean>) = apply { this.payDate = payDate }

                        fun debitDate(debitDate: Boolean) = debitDate(JsonField.of(debitDate))

                        @JsonProperty("debit_date")
                        @ExcludeMissing
                        fun debitDate(debitDate: JsonField<Boolean>) = apply {
                            this.debitDate = debitDate
                        }

                        fun companyDebit(companyDebit: Boolean) =
                            companyDebit(JsonField.of(companyDebit))

                        @JsonProperty("company_debit")
                        @ExcludeMissing
                        fun companyDebit(companyDebit: JsonField<Boolean>) = apply {
                            this.companyDebit = companyDebit
                        }

                        fun grossPay(grossPay: Boolean) = grossPay(JsonField.of(grossPay))

                        @JsonProperty("gross_pay")
                        @ExcludeMissing
                        fun grossPay(grossPay: JsonField<Boolean>) = apply {
                            this.grossPay = grossPay
                        }

                        fun netPay(netPay: Boolean) = netPay(JsonField.of(netPay))

                        @JsonProperty("net_pay")
                        @ExcludeMissing
                        fun netPay(netPay: JsonField<Boolean>) = apply { this.netPay = netPay }

                        fun employerTaxes(employerTaxes: Boolean) =
                            employerTaxes(JsonField.of(employerTaxes))

                        @JsonProperty("employer_taxes")
                        @ExcludeMissing
                        fun employerTaxes(employerTaxes: JsonField<Boolean>) = apply {
                            this.employerTaxes = employerTaxes
                        }

                        fun employeeTaxes(employeeTaxes: Boolean) =
                            employeeTaxes(JsonField.of(employeeTaxes))

                        @JsonProperty("employee_taxes")
                        @ExcludeMissing
                        fun employeeTaxes(employeeTaxes: JsonField<Boolean>) = apply {
                            this.employeeTaxes = employeeTaxes
                        }

                        fun individualIds(individualIds: Boolean) =
                            individualIds(JsonField.of(individualIds))

                        @JsonProperty("individual_ids")
                        @ExcludeMissing
                        fun individualIds(individualIds: JsonField<Boolean>) = apply {
                            this.individualIds = individualIds
                        }

                        fun payPeriod(payPeriod: PayPeriod) = payPeriod(JsonField.of(payPeriod))

                        @JsonProperty("pay_period")
                        @ExcludeMissing
                        fun payPeriod(payPeriod: JsonField<PayPeriod>) = apply {
                            this.payPeriod = payPeriod
                        }

                        fun payGroupIds(payGroupIds: Boolean) =
                            payGroupIds(JsonField.of(payGroupIds))

                        @JsonProperty("pay_group_ids")
                        @ExcludeMissing
                        fun payGroupIds(payGroupIds: JsonField<Boolean>) = apply {
                            this.payGroupIds = payGroupIds
                        }

                        fun payFrequencies(payFrequencies: Boolean) =
                            payFrequencies(JsonField.of(payFrequencies))

                        @JsonProperty("pay_frequencies")
                        @ExcludeMissing
                        fun payFrequencies(payFrequencies: JsonField<Boolean>) = apply {
                            this.payFrequencies = payFrequencies
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): SupportedPaymentFields =
                            SupportedPaymentFields(
                                id,
                                payDate,
                                debitDate,
                                companyDebit,
                                grossPay,
                                netPay,
                                employerTaxes,
                                employeeTaxes,
                                individualIds,
                                payPeriod,
                                payGroupIds,
                                payFrequencies,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(builder = PayPeriod.Builder::class)
                    @NoAutoDetect
                    class PayPeriod
                    private constructor(
                        private val startDate: JsonField<Boolean>,
                        private val endDate: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun startDate(): Boolean? = startDate.getNullable("start_date")

                        fun endDate(): Boolean? = endDate.getNullable("end_date")

                        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

                        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): PayPeriod = apply {
                            if (!validated) {
                                startDate()
                                endDate()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PayPeriod &&
                                this.startDate == other.startDate &&
                                this.endDate == other.endDate &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        startDate,
                                        endDate,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "PayPeriod{startDate=$startDate, endDate=$endDate, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var startDate: JsonField<Boolean> = JsonMissing.of()
                            private var endDate: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(payPeriod: PayPeriod) = apply {
                                this.startDate = payPeriod.startDate
                                this.endDate = payPeriod.endDate
                                additionalProperties(payPeriod.additionalProperties)
                            }

                            fun startDate(startDate: Boolean) = startDate(JsonField.of(startDate))

                            @JsonProperty("start_date")
                            @ExcludeMissing
                            fun startDate(startDate: JsonField<Boolean>) = apply {
                                this.startDate = startDate
                            }

                            fun endDate(endDate: Boolean) = endDate(JsonField.of(endDate))

                            @JsonProperty("end_date")
                            @ExcludeMissing
                            fun endDate(endDate: JsonField<Boolean>) = apply {
                                this.endDate = endDate
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): PayPeriod =
                                PayPeriod(
                                    startDate,
                                    endDate,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }
                    }
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ASSISTED = Type(JsonField.of("assisted"))

                    val CREDENTIAL = Type(JsonField.of("credential"))

                    val API_TOKEN = Type(JsonField.of("api_token"))

                    val API_CREDENTIAL = Type(JsonField.of("api_credential"))

                    val OAUTH = Type(JsonField.of("oauth"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    ASSISTED,
                    CREDENTIAL,
                    API_TOKEN,
                    API_CREDENTIAL,
                    OAUTH,
                }

                enum class Value {
                    ASSISTED,
                    CREDENTIAL,
                    API_TOKEN,
                    API_CREDENTIAL,
                    OAUTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ASSISTED -> Value.ASSISTED
                        CREDENTIAL -> Value.CREDENTIAL
                        API_TOKEN -> Value.API_TOKEN
                        API_CREDENTIAL -> Value.API_CREDENTIAL
                        OAUTH -> Value.OAUTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ASSISTED -> Known.ASSISTED
                        CREDENTIAL -> Known.CREDENTIAL
                        API_TOKEN -> Known.API_TOKEN
                        API_CREDENTIAL -> Known.API_CREDENTIAL
                        OAUTH -> Known.OAUTH
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCOUNT_UPDATED = EventType(JsonField.of("account.updated"))

            fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_UPDATED,
        }

        enum class Value {
            ACCOUNT_UPDATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_UPDATED -> Value.ACCOUNT_UPDATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_UPDATED -> Known.ACCOUNT_UPDATED
                else -> throw FinchInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
