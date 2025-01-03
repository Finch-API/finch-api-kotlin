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

@JsonDeserialize(builder = CompanyUpdateResponse.Builder::class)
@NoAutoDetect
class CompanyUpdateResponse
private constructor(
    private val legalName: JsonField<String>,
    private val entity: JsonField<Entity>,
    private val primaryEmail: JsonField<String>,
    private val primaryPhoneNumber: JsonField<String>,
    private val departments: JsonField<List<Department?>>,
    private val ein: JsonField<String>,
    private val locations: JsonField<List<Location?>>,
    private val accounts: JsonField<List<Account>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The legal name of the company. */
    fun legalName(): String? = legalName.getNullable("legal_name")

    /** The entity type object. */
    fun entity(): Entity? = entity.getNullable("entity")

    /** The email of the main administrator on the account. */
    fun primaryEmail(): String? = primaryEmail.getNullable("primary_email")

    /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
    fun primaryPhoneNumber(): String? = primaryPhoneNumber.getNullable("primary_phone_number")

    /** The array of company departments. */
    fun departments(): List<Department?>? = departments.getNullable("departments")

    /** The employer identification number. */
    fun ein(): String? = ein.getNullable("ein")

    fun locations(): List<Location?>? = locations.getNullable("locations")

    /** An array of bank account objects associated with the payroll/HRIS system. */
    fun accounts(): List<Account>? = accounts.getNullable("accounts")

    /** The legal name of the company. */
    @JsonProperty("legal_name") @ExcludeMissing fun _legalName() = legalName

    /** The entity type object. */
    @JsonProperty("entity") @ExcludeMissing fun _entity() = entity

    /** The email of the main administrator on the account. */
    @JsonProperty("primary_email") @ExcludeMissing fun _primaryEmail() = primaryEmail

    /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
    @JsonProperty("primary_phone_number")
    @ExcludeMissing
    fun _primaryPhoneNumber() = primaryPhoneNumber

    /** The array of company departments. */
    @JsonProperty("departments") @ExcludeMissing fun _departments() = departments

    /** The employer identification number. */
    @JsonProperty("ein") @ExcludeMissing fun _ein() = ein

    @JsonProperty("locations") @ExcludeMissing fun _locations() = locations

    /** An array of bank account objects associated with the payroll/HRIS system. */
    @JsonProperty("accounts") @ExcludeMissing fun _accounts() = accounts

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CompanyUpdateResponse = apply {
        if (!validated) {
            legalName()
            entity()?.validate()
            primaryEmail()
            primaryPhoneNumber()
            departments()?.forEach { it?.validate() }
            ein()
            locations()?.forEach { it?.validate() }
            accounts()?.forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var legalName: JsonField<String> = JsonMissing.of()
        private var entity: JsonField<Entity> = JsonMissing.of()
        private var primaryEmail: JsonField<String> = JsonMissing.of()
        private var primaryPhoneNumber: JsonField<String> = JsonMissing.of()
        private var departments: JsonField<List<Department?>> = JsonMissing.of()
        private var ein: JsonField<String> = JsonMissing.of()
        private var locations: JsonField<List<Location?>> = JsonMissing.of()
        private var accounts: JsonField<List<Account>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(companyUpdateResponse: CompanyUpdateResponse) = apply {
            this.legalName = companyUpdateResponse.legalName
            this.entity = companyUpdateResponse.entity
            this.primaryEmail = companyUpdateResponse.primaryEmail
            this.primaryPhoneNumber = companyUpdateResponse.primaryPhoneNumber
            this.departments = companyUpdateResponse.departments
            this.ein = companyUpdateResponse.ein
            this.locations = companyUpdateResponse.locations
            this.accounts = companyUpdateResponse.accounts
            additionalProperties(companyUpdateResponse.additionalProperties)
        }

        /** The legal name of the company. */
        fun legalName(legalName: String) = legalName(JsonField.of(legalName))

        /** The legal name of the company. */
        @JsonProperty("legal_name")
        @ExcludeMissing
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        /** The entity type object. */
        fun entity(entity: Entity) = entity(JsonField.of(entity))

        /** The entity type object. */
        @JsonProperty("entity")
        @ExcludeMissing
        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: String) = primaryEmail(JsonField.of(primaryEmail))

        /** The email of the main administrator on the account. */
        @JsonProperty("primary_email")
        @ExcludeMissing
        fun primaryEmail(primaryEmail: JsonField<String>) = apply {
            this.primaryEmail = primaryEmail
        }

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: String) =
            primaryPhoneNumber(JsonField.of(primaryPhoneNumber))

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        @JsonProperty("primary_phone_number")
        @ExcludeMissing
        fun primaryPhoneNumber(primaryPhoneNumber: JsonField<String>) = apply {
            this.primaryPhoneNumber = primaryPhoneNumber
        }

        /** The array of company departments. */
        fun departments(departments: List<Department?>) = departments(JsonField.of(departments))

        /** The array of company departments. */
        @JsonProperty("departments")
        @ExcludeMissing
        fun departments(departments: JsonField<List<Department?>>) = apply {
            this.departments = departments
        }

        /** The employer identification number. */
        fun ein(ein: String) = ein(JsonField.of(ein))

        /** The employer identification number. */
        @JsonProperty("ein")
        @ExcludeMissing
        fun ein(ein: JsonField<String>) = apply { this.ein = ein }

        fun locations(locations: List<Location?>) = locations(JsonField.of(locations))

        @JsonProperty("locations")
        @ExcludeMissing
        fun locations(locations: JsonField<List<Location?>>) = apply { this.locations = locations }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: List<Account>) = accounts(JsonField.of(accounts))

        /** An array of bank account objects associated with the payroll/HRIS system. */
        @JsonProperty("accounts")
        @ExcludeMissing
        fun accounts(accounts: JsonField<List<Account>>) = apply { this.accounts = accounts }

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

        fun build(): CompanyUpdateResponse =
            CompanyUpdateResponse(
                legalName,
                entity,
                primaryEmail,
                primaryPhoneNumber,
                departments.map { it.toImmutable() },
                ein,
                locations.map { it.toImmutable() },
                accounts.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Account.Builder::class)
    @NoAutoDetect
    class Account
    private constructor(
        private val routingNumber: JsonField<String>,
        private val accountName: JsonField<String>,
        private val institutionName: JsonField<String>,
        private val accountType: JsonField<AccountType>,
        private val accountNumber: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         */
        fun routingNumber(): String? = routingNumber.getNullable("routing_number")

        /** The name of the bank associated in the payroll/HRIS system. */
        fun accountName(): String? = accountName.getNullable("account_name")

        /** Name of the banking institution. */
        fun institutionName(): String? = institutionName.getNullable("institution_name")

        /** The type of bank account. */
        fun accountType(): AccountType? = accountType.getNullable("account_type")

        /** 10-12 digit number to specify the bank account */
        fun accountNumber(): String? = accountNumber.getNullable("account_number")

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         */
        @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

        /** The name of the bank associated in the payroll/HRIS system. */
        @JsonProperty("account_name") @ExcludeMissing fun _accountName() = accountName

        /** Name of the banking institution. */
        @JsonProperty("institution_name") @ExcludeMissing fun _institutionName() = institutionName

        /** The type of bank account. */
        @JsonProperty("account_type") @ExcludeMissing fun _accountType() = accountType

        /** 10-12 digit number to specify the bank account */
        @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Account = apply {
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

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var accountName: JsonField<String> = JsonMissing.of()
            private var institutionName: JsonField<String> = JsonMissing.of()
            private var accountType: JsonField<AccountType> = JsonMissing.of()
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(account: Account) = apply {
                this.routingNumber = account.routingNumber
                this.accountName = account.accountName
                this.institutionName = account.institutionName
                this.accountType = account.accountType
                this.accountNumber = account.accountNumber
                additionalProperties(account.additionalProperties)
            }

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /** The name of the bank associated in the payroll/HRIS system. */
            fun accountName(accountName: String) = accountName(JsonField.of(accountName))

            /** The name of the bank associated in the payroll/HRIS system. */
            @JsonProperty("account_name")
            @ExcludeMissing
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            /** Name of the banking institution. */
            fun institutionName(institutionName: String) =
                institutionName(JsonField.of(institutionName))

            /** Name of the banking institution. */
            @JsonProperty("institution_name")
            @ExcludeMissing
            fun institutionName(institutionName: JsonField<String>) = apply {
                this.institutionName = institutionName
            }

            /** The type of bank account. */
            fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

            /** The type of bank account. */
            @JsonProperty("account_type")
            @ExcludeMissing
            fun accountType(accountType: JsonField<AccountType>) = apply {
                this.accountType = accountType
            }

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /** 10-12 digit number to specify the bank account */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
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

            fun build(): Account =
                Account(
                    routingNumber,
                    accountName,
                    institutionName,
                    accountType,
                    accountNumber,
                    additionalProperties.toImmutable(),
                )
        }

        class AccountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CHECKING = of("checking")

                val SAVINGS = of("savings")

                fun of(value: String) = AccountType(JsonField.of(value))
            }

            enum class Known {
                CHECKING,
                SAVINGS,
            }

            enum class Value {
                CHECKING,
                SAVINGS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHECKING -> Value.CHECKING
                    SAVINGS -> Value.SAVINGS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECKING -> Known.CHECKING
                    SAVINGS -> Known.SAVINGS
                    else -> throw FinchInvalidDataException("Unknown AccountType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Account && routingNumber == other.routingNumber && accountName == other.accountName && institutionName == other.institutionName && accountType == other.accountType && accountNumber == other.accountNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(routingNumber, accountName, institutionName, accountType, accountNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{routingNumber=$routingNumber, accountName=$accountName, institutionName=$institutionName, accountType=$accountType, accountNumber=$accountNumber, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Department.Builder::class)
    @NoAutoDetect
    class Department
    private constructor(
        private val name: JsonField<String>,
        private val parent: JsonField<Parent>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The department name. */
        fun name(): String? = name.getNullable("name")

        /** The parent department, if present. */
        fun parent(): Parent? = parent.getNullable("parent")

        /** The department name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The parent department, if present. */
        @JsonProperty("parent") @ExcludeMissing fun _parent() = parent

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Department = apply {
            if (!validated) {
                name()
                parent()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var parent: JsonField<Parent> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(department: Department) = apply {
                this.name = department.name
                this.parent = department.parent
                additionalProperties(department.additionalProperties)
            }

            /** The department name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The department name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The parent department, if present. */
            fun parent(parent: Parent) = parent(JsonField.of(parent))

            /** The parent department, if present. */
            @JsonProperty("parent")
            @ExcludeMissing
            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

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

            fun build(): Department =
                Department(
                    name,
                    parent,
                    additionalProperties.toImmutable(),
                )
        }

        /** The parent department, if present. */
        @JsonDeserialize(builder = Parent.Builder::class)
        @NoAutoDetect
        class Parent
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The parent department's name. */
            fun name(): String? = name.getNullable("name")

            /** The parent department's name. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Parent = apply {
                if (!validated) {
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(parent: Parent) = apply {
                    this.name = parent.name
                    additionalProperties(parent.additionalProperties)
                }

                /** The parent department's name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The parent department's name. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Parent = Parent(name, additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is Department && name == other.name && parent == other.parent && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, parent, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Department{name=$name, parent=$parent, additionalProperties=$additionalProperties}"
    }

    /** The entity type object. */
    @JsonDeserialize(builder = Entity.Builder::class)
    @NoAutoDetect
    class Entity
    private constructor(
        private val type: JsonField<Type>,
        private val subtype: JsonField<Subtype>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The tax payer type of the company. */
        fun type(): Type? = type.getNullable("type")

        /** The tax payer subtype of the company. */
        fun subtype(): Subtype? = subtype.getNullable("subtype")

        /** The tax payer type of the company. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /** The tax payer subtype of the company. */
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

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var subtype: JsonField<Subtype> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(entity: Entity) = apply {
                this.type = entity.type
                this.subtype = entity.subtype
                additionalProperties(entity.additionalProperties)
            }

            /** The tax payer type of the company. */
            fun type(type: Type) = type(JsonField.of(type))

            /** The tax payer type of the company. */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The tax payer subtype of the company. */
            fun subtype(subtype: Subtype) = subtype(JsonField.of(subtype))

            /** The tax payer subtype of the company. */
            @JsonProperty("subtype")
            @ExcludeMissing
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

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

            fun build(): Entity =
                Entity(
                    type,
                    subtype,
                    additionalProperties.toImmutable(),
                )
        }

        class Subtype
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val S_CORPORATION = of("s_corporation")

                val C_CORPORATION = of("c_corporation")

                val B_CORPORATION = of("b_corporation")

                fun of(value: String) = Subtype(JsonField.of(value))
            }

            enum class Known {
                S_CORPORATION,
                C_CORPORATION,
                B_CORPORATION,
            }

            enum class Value {
                S_CORPORATION,
                C_CORPORATION,
                B_CORPORATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    S_CORPORATION -> Value.S_CORPORATION
                    C_CORPORATION -> Value.C_CORPORATION
                    B_CORPORATION -> Value.B_CORPORATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    S_CORPORATION -> Known.S_CORPORATION
                    C_CORPORATION -> Known.C_CORPORATION
                    B_CORPORATION -> Known.B_CORPORATION
                    else -> throw FinchInvalidDataException("Unknown Subtype: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Subtype && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val LLC = of("llc")

                val LP = of("lp")

                val CORPORATION = of("corporation")

                val SOLE_PROPRIETOR = of("sole_proprietor")

                val NON_PROFIT = of("non_profit")

                val PARTNERSHIP = of("partnership")

                val COOPERATIVE = of("cooperative")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                LLC,
                LP,
                CORPORATION,
                SOLE_PROPRIETOR,
                NON_PROFIT,
                PARTNERSHIP,
                COOPERATIVE,
            }

            enum class Value {
                LLC,
                LP,
                CORPORATION,
                SOLE_PROPRIETOR,
                NON_PROFIT,
                PARTNERSHIP,
                COOPERATIVE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LLC -> Value.LLC
                    LP -> Value.LP
                    CORPORATION -> Value.CORPORATION
                    SOLE_PROPRIETOR -> Value.SOLE_PROPRIETOR
                    NON_PROFIT -> Value.NON_PROFIT
                    PARTNERSHIP -> Value.PARTNERSHIP
                    COOPERATIVE -> Value.COOPERATIVE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LLC -> Known.LLC
                    LP -> Known.LP
                    CORPORATION -> Known.CORPORATION
                    SOLE_PROPRIETOR -> Known.SOLE_PROPRIETOR
                    NON_PROFIT -> Known.NON_PROFIT
                    PARTNERSHIP -> Known.PARTNERSHIP
                    COOPERATIVE -> Known.COOPERATIVE
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is Entity && type == other.type && subtype == other.subtype && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, subtype, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entity{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompanyUpdateResponse && legalName == other.legalName && entity == other.entity && primaryEmail == other.primaryEmail && primaryPhoneNumber == other.primaryPhoneNumber && departments == other.departments && ein == other.ein && locations == other.locations && accounts == other.accounts && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(legalName, entity, primaryEmail, primaryPhoneNumber, departments, ein, locations, accounts, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyUpdateResponse{legalName=$legalName, entity=$entity, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, departments=$departments, ein=$ein, locations=$locations, accounts=$accounts, additionalProperties=$additionalProperties}"
}
