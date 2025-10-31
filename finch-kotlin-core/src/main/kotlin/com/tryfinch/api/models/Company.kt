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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

class Company
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accounts: JsonField<List<Account>>,
    private val departments: JsonField<List<Department?>>,
    private val ein: JsonField<String>,
    private val entity: JsonField<Entity>,
    private val legalName: JsonField<String>,
    private val locations: JsonField<List<Location?>>,
    private val primaryEmail: JsonField<String>,
    private val primaryPhoneNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accounts")
        @ExcludeMissing
        accounts: JsonField<List<Account>> = JsonMissing.of(),
        @JsonProperty("departments")
        @ExcludeMissing
        departments: JsonField<List<Department?>> = JsonMissing.of(),
        @JsonProperty("ein") @ExcludeMissing ein: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonField<Entity> = JsonMissing.of(),
        @JsonProperty("legal_name") @ExcludeMissing legalName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locations")
        @ExcludeMissing
        locations: JsonField<List<Location?>> = JsonMissing.of(),
        @JsonProperty("primary_email")
        @ExcludeMissing
        primaryEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_phone_number")
        @ExcludeMissing
        primaryPhoneNumber: JsonField<String> = JsonMissing.of(),
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
     * A stable Finch `id` (UUID v4) for the company.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * An array of bank account objects associated with the payroll/HRIS system.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accounts(): List<Account>? = accounts.getNullable("accounts")

    /**
     * The array of company departments.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun departments(): List<Department?>? = departments.getNullable("departments")

    /**
     * The employer identification number.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ein(): String? = ein.getNullable("ein")

    /**
     * The entity type object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entity(): Entity? = entity.getNullable("entity")

    /**
     * The legal name of the company.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalName(): String? = legalName.getNullable("legal_name")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locations(): List<Location?>? = locations.getNullable("locations")

    /**
     * The email of the main administrator on the account.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryEmail(): String? = primaryEmail.getNullable("primary_email")

    /**
     * The phone number of the main administrator on the account. Format: E.164, with extension
     * where applicable, e.g. `+NNNNNNNNNNN xExtension`
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryPhoneNumber(): String? = primaryPhoneNumber.getNullable("primary_phone_number")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accounts].
     *
     * Unlike [accounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accounts") @ExcludeMissing fun _accounts(): JsonField<List<Account>> = accounts

    /**
     * Returns the raw JSON value of [departments].
     *
     * Unlike [departments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("departments")
    @ExcludeMissing
    fun _departments(): JsonField<List<Department?>> = departments

    /**
     * Returns the raw JSON value of [ein].
     *
     * Unlike [ein], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ein") @ExcludeMissing fun _ein(): JsonField<String> = ein

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

    /**
     * Returns the raw JSON value of [legalName].
     *
     * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legal_name") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

    /**
     * Returns the raw JSON value of [locations].
     *
     * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locations")
    @ExcludeMissing
    fun _locations(): JsonField<List<Location?>> = locations

    /**
     * Returns the raw JSON value of [primaryEmail].
     *
     * Unlike [primaryEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_email")
    @ExcludeMissing
    fun _primaryEmail(): JsonField<String> = primaryEmail

    /**
     * Returns the raw JSON value of [primaryPhoneNumber].
     *
     * Unlike [primaryPhoneNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("primary_phone_number")
    @ExcludeMissing
    fun _primaryPhoneNumber(): JsonField<String> = primaryPhoneNumber

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
         * Returns a mutable builder for constructing an instance of [Company].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accounts()
         * .departments()
         * .ein()
         * .entity()
         * .legalName()
         * .locations()
         * .primaryEmail()
         * .primaryPhoneNumber()
         * ```
         */
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** An array of bank account objects associated with the payroll/HRIS system. */
        fun accounts(accounts: List<Account>?) = accounts(JsonField.ofNullable(accounts))

        /**
         * Sets [Builder.accounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accounts] with a well-typed `List<Account>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accounts(accounts: JsonField<List<Account>>) = apply {
            this.accounts = accounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Account] to [accounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccount(account: Account) = apply {
            accounts =
                (accounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accounts", it).add(account)
                }
        }

        /** The array of company departments. */
        fun departments(departments: List<Department?>?) =
            departments(JsonField.ofNullable(departments))

        /**
         * Sets [Builder.departments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.departments] with a well-typed `List<Department?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun departments(departments: JsonField<List<Department?>>) = apply {
            this.departments = departments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Department] to [departments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDepartment(department: Department) = apply {
            departments =
                (departments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("departments", it).add(department)
                }
        }

        /** The employer identification number. */
        fun ein(ein: String?) = ein(JsonField.ofNullable(ein))

        /**
         * Sets [Builder.ein] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ein] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ein(ein: JsonField<String>) = apply { this.ein = ein }

        /** The entity type object. */
        fun entity(entity: Entity?) = entity(JsonField.ofNullable(entity))

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [Entity] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

        /** The legal name of the company. */
        fun legalName(legalName: String?) = legalName(JsonField.ofNullable(legalName))

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        fun locations(locations: List<Location?>?) = locations(JsonField.ofNullable(locations))

        /**
         * Sets [Builder.locations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locations] with a well-typed `List<Location?>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locations(locations: JsonField<List<Location?>>) = apply {
            this.locations = locations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Location] to [locations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLocation(location: Location) = apply {
            locations =
                (locations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("locations", it).add(location)
                }
        }

        /** The email of the main administrator on the account. */
        fun primaryEmail(primaryEmail: String?) = primaryEmail(JsonField.ofNullable(primaryEmail))

        /**
         * Sets [Builder.primaryEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryEmail(primaryEmail: JsonField<String>) = apply {
            this.primaryEmail = primaryEmail
        }

        /**
         * The phone number of the main administrator on the account. Format: E.164, with extension
         * where applicable, e.g. `+NNNNNNNNNNN xExtension`
         */
        fun primaryPhoneNumber(primaryPhoneNumber: String?) =
            primaryPhoneNumber(JsonField.ofNullable(primaryPhoneNumber))

        /**
         * Sets [Builder.primaryPhoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryPhoneNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [Company].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accounts()
         * .departments()
         * .ein()
         * .entity()
         * .legalName()
         * .locations()
         * .primaryEmail()
         * .primaryPhoneNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
        (if (id.asKnown() == null) 0 else 1) +
            (accounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (departments.asKnown()?.sumOf { (it?.validity() ?: 0).toInt() } ?: 0) +
            (if (ein.asKnown() == null) 0 else 1) +
            (entity.asKnown()?.validity() ?: 0) +
            (if (legalName.asKnown() == null) 0 else 1) +
            (locations.asKnown()?.sumOf { (it?.validity() ?: 0).toInt() } ?: 0) +
            (if (primaryEmail.asKnown() == null) 0 else 1) +
            (if (primaryPhoneNumber.asKnown() == null) 0 else 1)

    class Account
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountName: JsonField<String>,
        private val accountNumber: JsonField<String>,
        private val accountType: JsonField<AccountType>,
        private val institutionName: JsonField<String>,
        private val routingNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_name")
            @ExcludeMissing
            accountName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_type")
            @ExcludeMissing
            accountType: JsonField<AccountType> = JsonMissing.of(),
            @JsonProperty("institution_name")
            @ExcludeMissing
            institutionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountName,
            accountNumber,
            accountType,
            institutionName,
            routingNumber,
            mutableMapOf(),
        )

        /**
         * The name of the bank associated in the payroll/HRIS system.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountName(): String? = accountName.getNullable("account_name")

        /**
         * 10-12 digit number to specify the bank account
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountNumber(): String? = accountNumber.getNullable("account_number")

        /**
         * The type of bank account.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountType(): AccountType? = accountType.getNullable("account_type")

        /**
         * Name of the banking institution.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun institutionName(): String? = institutionName.getNullable("institution_name")

        /**
         * A nine-digit code that's based on the U.S. Bank location where your account was opened.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routingNumber(): String? = routingNumber.getNullable("routing_number")

        /**
         * Returns the raw JSON value of [accountName].
         *
         * Unlike [accountName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_name")
        @ExcludeMissing
        fun _accountName(): JsonField<String> = accountName

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<AccountType> = accountType

        /**
         * Returns the raw JSON value of [institutionName].
         *
         * Unlike [institutionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("institution_name")
        @ExcludeMissing
        fun _institutionName(): JsonField<String> = institutionName

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

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
             * Returns a mutable builder for constructing an instance of [Account].
             *
             * The following fields are required:
             * ```kotlin
             * .accountName()
             * .accountNumber()
             * .accountType()
             * .institutionName()
             * .routingNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Account]. */
        class Builder internal constructor() {

            private var accountName: JsonField<String>? = null
            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonField<AccountType>? = null
            private var institutionName: JsonField<String>? = null
            private var routingNumber: JsonField<String>? = null
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

            /**
             * Sets [Builder.accountName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountName(accountName: JsonField<String>) = apply {
                this.accountName = accountName
            }

            /** 10-12 digit number to specify the bank account */
            fun accountNumber(accountNumber: String?) =
                accountNumber(JsonField.ofNullable(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** The type of bank account. */
            fun accountType(accountType: AccountType?) =
                accountType(JsonField.ofNullable(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed [AccountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonField<AccountType>) = apply {
                this.accountType = accountType
            }

            /** Name of the banking institution. */
            fun institutionName(institutionName: String?) =
                institutionName(JsonField.ofNullable(institutionName))

            /**
             * Sets [Builder.institutionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.institutionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Account].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountName()
             * .accountNumber()
             * .accountType()
             * .institutionName()
             * .routingNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Account =
                Account(
                    checkRequired("accountName", accountName),
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("accountType", accountType),
                    checkRequired("institutionName", institutionName),
                    checkRequired("routingNumber", routingNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Account = apply {
            if (validated) {
                return@apply
            }

            accountName()
            accountNumber()
            accountType()?.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (accountName.asKnown() == null) 0 else 1) +
                (if (accountNumber.asKnown() == null) 0 else 1) +
                (accountType.asKnown()?.validity() ?: 0) +
                (if (institutionName.asKnown() == null) 0 else 1) +
                (if (routingNumber.asKnown() == null) 0 else 1)

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

            private var validated: Boolean = false

            fun validate(): AccountType = apply {
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

                return other is AccountType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Account &&
                accountName == other.accountName &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                institutionName == other.institutionName &&
                routingNumber == other.routingNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountName,
                accountNumber,
                accountType,
                institutionName,
                routingNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{accountName=$accountName, accountNumber=$accountNumber, accountType=$accountType, institutionName=$institutionName, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
    }

    class Department
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val parent: JsonField<Parent>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent") @ExcludeMissing parent: JsonField<Parent> = JsonMissing.of(),
        ) : this(name, parent, mutableMapOf())

        /**
         * The department name.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * The parent department, if present.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parent(): Parent? = parent.getNullable("parent")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [parent].
         *
         * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

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
             * Returns a mutable builder for constructing an instance of [Department].
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .parent()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Department]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var parent: JsonField<Parent>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(department: Department) = apply {
                name = department.name
                parent = department.parent
                additionalProperties = department.additionalProperties.toMutableMap()
            }

            /** The department name. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The parent department, if present. */
            fun parent(parent: Parent?) = parent(JsonField.ofNullable(parent))

            /**
             * Sets [Builder.parent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parent] with a well-typed [Parent] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Department].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * .parent()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Department =
                Department(
                    checkRequired("name", name),
                    checkRequired("parent", parent),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Department = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (name.asKnown() == null) 0 else 1) + (parent.asKnown()?.validity() ?: 0)

        /** The parent department, if present. */
        class Parent
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
            ) : this(name, mutableMapOf())

            /**
             * The parent department's name.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [Parent].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Parent]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(parent: Parent) = apply {
                    name = parent.name
                    additionalProperties = parent.additionalProperties.toMutableMap()
                }

                /** The parent department's name. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Parent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Parent =
                    Parent(checkRequired("name", name), additionalProperties.toMutableMap())
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = (if (name.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parent &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Parent{name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Department &&
                name == other.name &&
                parent == other.parent &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, parent, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Department{name=$name, parent=$parent, additionalProperties=$additionalProperties}"
    }

    /** The entity type object. */
    class Entity
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val subtype: JsonField<Subtype>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("subtype") @ExcludeMissing subtype: JsonField<Subtype> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(subtype, type, mutableMapOf())

        /**
         * The tax payer subtype of the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subtype(): Subtype? = subtype.getNullable("subtype")

        /**
         * The tax payer type of the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Type? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [subtype].
         *
         * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<Subtype> = subtype

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
             * Returns a mutable builder for constructing an instance of [Entity].
             *
             * The following fields are required:
             * ```kotlin
             * .subtype()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Entity]. */
        class Builder internal constructor() {

            private var subtype: JsonField<Subtype>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(entity: Entity) = apply {
                subtype = entity.subtype
                type = entity.type
                additionalProperties = entity.additionalProperties.toMutableMap()
            }

            /** The tax payer subtype of the company. */
            fun subtype(subtype: Subtype?) = subtype(JsonField.ofNullable(subtype))

            /**
             * Sets [Builder.subtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtype] with a well-typed [Subtype] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

            /** The tax payer type of the company. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [Entity].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .subtype()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Entity =
                Entity(
                    checkRequired("subtype", subtype),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Entity = apply {
            if (validated) {
                return@apply
            }

            subtype()?.validate()
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
            (subtype.asKnown()?.validity() ?: 0) + (type.asKnown()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): Subtype = apply {
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

                return other is Subtype && value == other.value
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entity &&
                subtype == other.subtype &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entity{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Company &&
            id == other.id &&
            accounts == other.accounts &&
            departments == other.departments &&
            ein == other.ein &&
            entity == other.entity &&
            legalName == other.legalName &&
            locations == other.locations &&
            primaryEmail == other.primaryEmail &&
            primaryPhoneNumber == other.primaryPhoneNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accounts,
            departments,
            ein,
            entity,
            legalName,
            locations,
            primaryEmail,
            primaryPhoneNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Company{id=$id, accounts=$accounts, departments=$departments, ein=$ein, entity=$entity, legalName=$legalName, locations=$locations, primaryEmail=$primaryEmail, primaryPhoneNumber=$primaryPhoneNumber, additionalProperties=$additionalProperties}"
}
