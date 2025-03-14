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
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@NoAutoDetect
class Company
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accounts")
    @ExcludeMissing
    private val accounts: JsonField<List<Account>> = JsonMissing.of(),
    @JsonProperty("departments")
    @ExcludeMissing
    private val departments: JsonField<List<Department?>> = JsonMissing.of(),
    @JsonProperty("ein") @ExcludeMissing private val ein: JsonField<String> = JsonMissing.of(),
    @JsonProperty("entity")
    @ExcludeMissing
    private val entity: JsonField<Entity> = JsonMissing.of(),
    @JsonProperty("legal_name")
    @ExcludeMissing
    private val legalName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("locations")
    @ExcludeMissing
    private val locations: JsonField<List<Location?>> = JsonMissing.of(),
    @JsonProperty("primary_email")
    @ExcludeMissing
    private val primaryEmail: JsonField<String> = JsonMissing.of(),
    @JsonProperty("primary_phone_number")
    @ExcludeMissing
    private val primaryPhoneNumber: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A stable Finch `id` (UUID v4) for the company. */
    fun id(): String = id.getRequired("id")

    /** An array of bank account objects associated with the payroll/HRIS system. */
    fun accounts(): List<Account>? = accounts.getNullable("accounts")

    /** The array of company departments. */
    fun departments(): List<Department?>? = departments.getNullable("departments")

    /** The employer identification number. */
    fun ein(): String? = ein.getNullable("ein")

    /** The entity type object. */
    fun entity(): Entity? = entity.getNullable("entity")

    /** The legal name of the company. */
    fun legalName(): String? = legalName.getNullable("legal_name")

    fun locations(): List<Location?>? = locations.getNullable("locations")

    /** The email of the main administrator on the account. */
    fun primaryEmail(): String? = primaryEmail.getNullable("primary_email")

    /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
    fun primaryPhoneNumber(): String? = primaryPhoneNumber.getNullable("primary_phone_number")

    /** A stable Finch `id` (UUID v4) for the company. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** An array of bank account objects associated with the payroll/HRIS system. */
    @JsonProperty("accounts") @ExcludeMissing fun _accounts(): JsonField<List<Account>> = accounts

    /** The array of company departments. */
    @JsonProperty("departments")
    @ExcludeMissing
    fun _departments(): JsonField<List<Department?>> = departments

    /** The employer identification number. */
    @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<String> = ein

    /** The entity type object. */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

    /** The legal name of the company. */
    @JsonProperty("legal_name") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

    @JsonProperty("locations")
    @ExcludeMissing
    fun _locations(): JsonField<List<Location?>> = locations

    /** The email of the main administrator on the account. */
    @JsonProperty("primary_email")
    @ExcludeMissing
    fun _primaryEmail(): JsonField<String> = primaryEmail

    /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
    @JsonProperty("primary_phone_number")
    @ExcludeMissing
    fun _primaryPhoneNumber(): JsonField<String> = primaryPhoneNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Company = apply {
        if (validated) {
            return@apply
        }

        id()
        accounts()?.forEach { it.validate() }
        departments()?.forEach { it?.validate() }
        ein()
        entity()?.validate()
        legalName()
        locations()?.forEach { it?.validate() }
        primaryEmail()
        primaryPhoneNumber()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [Company]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accounts: JsonField<MutableList<Account>>? = null
        private var departments: JsonField<MutableList<Department?>>? = null
        private var ein: JsonField<String>? = null
        private var entity: JsonField<Entity>? = null
        private var legalName: JsonField<String>? = null
        private var locations: JsonField<MutableList<Location?>>? = null
        private var primaryEmail: JsonField<String>? = null
        private var primaryPhoneNumber: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(company: Company) = apply {
            id = company.id
            accounts = company.accounts.map { it.toMutableList() }
            departments = company.departments.map { it.toMutableList() }
            ein = company.ein
            entity = company.entity
            legalName = company.legalName
            locations = company.locations.map { it.toMutableList() }
            primaryEmail = company.primaryEmail
            primaryPhoneNumber = company.primaryPhoneNumber
            additionalProperties = company.additionalProperties.toMutableMap()
        }

        /** A stable Finch `id` (UUID v4) for the company. */
        fun id(id: String) = id(JsonField.of(id))

        /** A stable Finch `id` (UUID v4) for the company. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: List<Account>?) = accounts(JsonField.ofNullable(accounts))

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: JsonField<List<Account>>) = apply {
            this.accounts = accounts.map { it.toMutableList() }
        }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun addAccount(account: Account) = apply {
            accounts =
                (accounts ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(account)
                }
        }

        /** The array of company departments. */
        fun departments(departments: List<Department?>?) =
            departments(JsonField.ofNullable(departments))

        /** The array of company departments. */
        fun departments(departments: JsonField<List<Department?>>) = apply {
            this.departments = departments.map { it.toMutableList() }
        }

        /** The array of company departments. */
        fun addDepartment(department: Department) = apply {
            departments =
                (departments ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(department)
                }
        }

        /** The employer identification number. */
        fun ein(ein: String?) = ein(JsonField.ofNullable(ein))

        /** The employer identification number. */
        fun ein(ein: JsonField<String>) = apply { this.ein = ein }

        /** The entity type object. */
        fun entity(entity: Entity?) = entity(JsonField.ofNullable(entity))

        /** The entity type object. */
        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

        /** The legal name of the company. */
        fun legalName(legalName: String?) = legalName(JsonField.ofNullable(legalName))

        /** The legal name of the company. */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        fun locations(locations: List<Location?>?) = locations(JsonField.ofNullable(locations))

        fun locations(locations: JsonField<List<Location?>>) = apply {
            this.locations = locations.map { it.toMutableList() }
        }

        fun addLocation(location: Location) = apply {
            locations =
                (locations ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(location)
                }
        }

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: String?) = primaryEmail(JsonField.ofNullable(primaryEmail))

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: JsonField<String>) = apply {
            this.primaryEmail = primaryEmail
        }

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: String?) =
            primaryPhoneNumber(JsonField.ofNullable(primaryPhoneNumber))

        /** The phone number of the main administrator on the account. Format: `XXXXXXXXXX` */
        fun primaryPhoneNumber(primaryPhoneNumber: JsonField<String>) = apply {
            this.primaryPhoneNumber = primaryPhoneNumber
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

        fun build(): Company =
            Company(
                checkRequired("id", id),
                checkRequired("accounts", accounts).map { it.toImmutable() },
                checkRequired("departments", departments).map { it.toImmutable() },
                checkRequired("ein", ein),
                checkRequired("entity", entity),
                checkRequired("legalName", legalName),
                checkRequired("locations", locations).map { it.toImmutable() },
                checkRequired("primaryEmail", primaryEmail),
                checkRequired("primaryPhoneNumber", primaryPhoneNumber),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Account
    @JsonCreator
    private constructor(
        @JsonProperty("account_name")
        @ExcludeMissing
        private val accountName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        private val accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_type")
        @ExcludeMissing
        private val accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("institution_name")
        @ExcludeMissing
        private val institutionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        private val routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the bank associated in the payroll/HRIS system. */
        fun accountName(): String? = accountName.getNullable("account_name")

        /** 10-12 digit number to specify the bank account */
        fun accountNumber(): String? = accountNumber.getNullable("account_number")

        /** The type of bank account. */
        fun accountType(): AccountType? = accountType.getNullable("account_type")

        /** Name of the banking institution. */
        fun institutionName(): String? = institutionName.getNullable("institution_name")

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         */
        fun routingNumber(): String? = routingNumber.getNullable("routing_number")

        /** The name of the bank associated in the payroll/HRIS system. */
        @JsonProperty("account_name")
        @ExcludeMissing
        fun _accountName(): JsonField<String> = accountName

        /** 10-12 digit number to specify the bank account */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /** The type of bank account. */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<AccountType> = accountType

        /** Name of the banking institution. */
        @JsonProperty("institution_name")
        @ExcludeMissing
        fun _institutionName(): JsonField<String> = institutionName

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Account = apply {
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

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Account]. */
        class Builder internal constructor() {

            private var accountName: JsonField<String> = JsonMissing.of()
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var accountType: JsonField<AccountType> = JsonMissing.of()
            private var institutionName: JsonField<String> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(account: Account) = apply {
                accountName = account.accountName
                accountNumber = account.accountNumber
                accountType = account.accountType
                institutionName = account.institutionName
                routingNumber = account.routingNumber
                additionalProperties = account.additionalProperties.toMutableMap()
            }

            /** The name of the bank associated in the payroll/HRIS system. */
            fun accountName(accountName: String?) = accountName(JsonField.ofNullable(accountName))

            /** The name of the bank associated in the payroll/HRIS system. */
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: String?) =
                accountNumber(JsonField.ofNullable(accountNumber))

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** The type of bank account. */
            fun accountType(accountType: AccountType?) =
                accountType(JsonField.ofNullable(accountType))

            /** The type of bank account. */
            fun accountType(accountType: JsonField<AccountType>) = apply {
                this.accountType = accountType
            }

            /** Name of the banking institution. */
            fun institutionName(institutionName: String?) =
                institutionName(JsonField.ofNullable(institutionName))

            /** Name of the banking institution. */
            fun institutionName(institutionName: JsonField<String>) = apply {
                this.institutionName = institutionName
            }

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            fun routingNumber(routingNumber: String?) =
                routingNumber(JsonField.ofNullable(routingNumber))

            /**
             * A nine-digit code that's based on the U.S. Bank location where your account was
             * opened.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
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

            fun build(): Account =
                Account(
                    accountName,
                    accountNumber,
                    accountType,
                    institutionName,
                    routingNumber,
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of bank account. */
        class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CHECKING = of("checking")

                val SAVINGS = of("savings")

                fun of(value: String) = AccountType(JsonField.of(value))
            }

            /** An enum containing [AccountType]'s known values. */
            enum class Known {
                CHECKING,
                SAVINGS,
            }

            /**
             * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AccountType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECKING,
                SAVINGS,
                /**
                 * An enum member indicating that [AccountType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CHECKING -> Value.CHECKING
                    SAVINGS -> Value.SAVINGS
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
                    CHECKING -> Known.CHECKING
                    SAVINGS -> Known.SAVINGS
                    else -> throw FinchInvalidDataException("Unknown AccountType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

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

            return /* spotless:off */ other is Account && accountName == other.accountName && accountNumber == other.accountNumber && accountType == other.accountType && institutionName == other.institutionName && routingNumber == other.routingNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountName, accountNumber, accountType, institutionName, routingNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{accountName=$accountName, accountNumber=$accountNumber, accountType=$accountType, institutionName=$institutionName, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Department
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent")
        @ExcludeMissing
        private val parent: JsonField<Parent> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The department name. */
        fun name(): String? = name.getNullable("name")

        /** The parent department, if present. */
        fun parent(): Parent? = parent.getNullable("parent")

        /** The department name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The parent department, if present. */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Department = apply {
            if (validated) {
                return@apply
            }

            name()
            parent()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Department]. */
        class Builder internal constructor() {

            private var name: JsonField<String> = JsonMissing.of()
            private var parent: JsonField<Parent> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(department: Department) = apply {
                name = department.name
                parent = department.parent
                additionalProperties = department.additionalProperties.toMutableMap()
            }

            /** The department name. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** The department name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The parent department, if present. */
            fun parent(parent: Parent?) = parent(JsonField.ofNullable(parent))

            /** The parent department, if present. */
            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

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

            fun build(): Department = Department(name, parent, additionalProperties.toImmutable())
        }

        /** The parent department, if present. */
        @NoAutoDetect
        class Parent
        @JsonCreator
        private constructor(
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The parent department's name. */
            fun name(): String? = name.getNullable("name")

            /** The parent department's name. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Parent = apply {
                if (validated) {
                    return@apply
                }

                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Parent]. */
            class Builder internal constructor() {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(parent: Parent) = apply {
                    name = parent.name
                    additionalProperties = parent.additionalProperties.toMutableMap()
                }

                /** The parent department's name. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** The parent department's name. */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
    @NoAutoDetect
    class Entity
    @JsonCreator
    private constructor(
        @JsonProperty("subtype")
        @ExcludeMissing
        private val subtype: JsonField<Subtype> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The tax payer subtype of the company. */
        fun subtype(): Subtype? = subtype.getNullable("subtype")

        /** The tax payer type of the company. */
        fun type(): Type? = type.getNullable("type")

        /** The tax payer subtype of the company. */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<Subtype> = subtype

        /** The tax payer type of the company. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Entity = apply {
            if (validated) {
                return@apply
            }

            subtype()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Entity]. */
        class Builder internal constructor() {

            private var subtype: JsonField<Subtype> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(entity: Entity) = apply {
                subtype = entity.subtype
                type = entity.type
                additionalProperties = entity.additionalProperties.toMutableMap()
            }

            /** The tax payer subtype of the company. */
            fun subtype(subtype: Subtype?) = subtype(JsonField.ofNullable(subtype))

            /** The tax payer subtype of the company. */
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

            /** The tax payer type of the company. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /** The tax payer type of the company. */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): Entity = Entity(subtype, type, additionalProperties.toImmutable())
        }

        /** The tax payer subtype of the company. */
        class Subtype @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val S_CORPORATION = of("s_corporation")

                val C_CORPORATION = of("c_corporation")

                val B_CORPORATION = of("b_corporation")

                fun of(value: String) = Subtype(JsonField.of(value))
            }

            /** An enum containing [Subtype]'s known values. */
            enum class Known {
                S_CORPORATION,
                C_CORPORATION,
                B_CORPORATION,
            }

            /**
             * An enum containing [Subtype]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Subtype] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                S_CORPORATION,
                C_CORPORATION,
                B_CORPORATION,
                /**
                 * An enum member indicating that [Subtype] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    S_CORPORATION -> Value.S_CORPORATION
                    C_CORPORATION -> Value.C_CORPORATION
                    B_CORPORATION -> Value.B_CORPORATION
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
                    S_CORPORATION -> Known.S_CORPORATION
                    C_CORPORATION -> Known.C_CORPORATION
                    B_CORPORATION -> Known.B_CORPORATION
                    else -> throw FinchInvalidDataException("Unknown Subtype: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Subtype && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The tax payer type of the company. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
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

            /** An enum containing [Type]'s known values. */
            enum class Known {
                LLC,
                LP,
                CORPORATION,
                SOLE_PROPRIETOR,
                NON_PROFIT,
                PARTNERSHIP,
                COOPERATIVE,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LLC,
                LP,
                CORPORATION,
                SOLE_PROPRIETOR,
                NON_PROFIT,
                PARTNERSHIP,
                COOPERATIVE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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
                    LLC -> Known.LLC
                    LP -> Known.LP
                    CORPORATION -> Known.CORPORATION
                    SOLE_PROPRIETOR -> Known.SOLE_PROPRIETOR
                    NON_PROFIT -> Known.NON_PROFIT
                    PARTNERSHIP -> Known.PARTNERSHIP
                    COOPERATIVE -> Known.COOPERATIVE
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

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

            return /* spotless:off */ other is Entity && subtype == other.subtype && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entity{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Company && id == other.id && accounts == other.accounts && departments == other.departments && ein == other.ein && entity == other.entity && legalName == other.legalName && locations == other.locations && primaryEmail == other.primaryEmail && primaryPhoneNumber == other.primaryPhoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accounts, departments, ein, entity, legalName, locations, primaryEmail, primaryPhoneNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Company{id=$id, accounts=$accounts, departments=$departments, ein=$ein, entity=$entity, legalName=$legalName, locations=$locations, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, additionalProperties=$additionalProperties}"
}
