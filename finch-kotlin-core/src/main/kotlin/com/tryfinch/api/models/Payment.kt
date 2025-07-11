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

class Payment
private constructor(
    private val id: JsonField<String>,
    private val companyDebit: JsonField<Money>,
    private val debitDate: JsonField<String>,
    private val employeeTaxes: JsonField<Money>,
    private val employerTaxes: JsonField<Money>,
    private val grossPay: JsonField<Money>,
    private val individualIds: JsonField<List<String>>,
    private val netPay: JsonField<Money>,
    private val payDate: JsonField<String>,
    private val payFrequencies: JsonField<List<PayFrequency>>,
    private val payGroupIds: JsonField<List<String>>,
    private val payPeriod: JsonField<PayPeriod>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_debit")
        @ExcludeMissing
        companyDebit: JsonField<Money> = JsonMissing.of(),
        @JsonProperty("debit_date") @ExcludeMissing debitDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("employee_taxes")
        @ExcludeMissing
        employeeTaxes: JsonField<Money> = JsonMissing.of(),
        @JsonProperty("employer_taxes")
        @ExcludeMissing
        employerTaxes: JsonField<Money> = JsonMissing.of(),
        @JsonProperty("gross_pay") @ExcludeMissing grossPay: JsonField<Money> = JsonMissing.of(),
        @JsonProperty("individual_ids")
        @ExcludeMissing
        individualIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("net_pay") @ExcludeMissing netPay: JsonField<Money> = JsonMissing.of(),
        @JsonProperty("pay_date") @ExcludeMissing payDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pay_frequencies")
        @ExcludeMissing
        payFrequencies: JsonField<List<PayFrequency>> = JsonMissing.of(),
        @JsonProperty("pay_group_ids")
        @ExcludeMissing
        payGroupIds: JsonField<List<String>> = JsonMissing.of(),
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
     * The unique id for the payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDebit(): Money? = companyDebit.getNullable("company_debit")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debitDate(): String? = debitDate.getNullable("debit_date")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun employeeTaxes(): Money? = employeeTaxes.getNullable("employee_taxes")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun employerTaxes(): Money? = employerTaxes.getNullable("employer_taxes")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grossPay(): Money? = grossPay.getNullable("gross_pay")

    /**
     * Array of every individual on this payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualIds(): List<String>? = individualIds.getNullable("individual_ids")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netPay(): Money? = netPay.getNullable("net_pay")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payDate(): String? = payDate.getNullable("pay_date")

    /**
     * List of pay frequencies associated with this payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payFrequencies(): List<PayFrequency>? = payFrequencies.getNullable("pay_frequencies")

    /**
     * Array of the Finch id (uuidv4) of every pay group associated with this payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payGroupIds(): List<String>? = payGroupIds.getNullable("pay_group_ids")

    /**
     * The pay period object.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payPeriod(): PayPeriod? = payPeriod.getNullable("pay_period")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [companyDebit].
     *
     * Unlike [companyDebit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_debit")
    @ExcludeMissing
    fun _companyDebit(): JsonField<Money> = companyDebit

    /**
     * Returns the raw JSON value of [debitDate].
     *
     * Unlike [debitDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debit_date") @ExcludeMissing fun _debitDate(): JsonField<String> = debitDate

    /**
     * Returns the raw JSON value of [employeeTaxes].
     *
     * Unlike [employeeTaxes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("employee_taxes")
    @ExcludeMissing
    fun _employeeTaxes(): JsonField<Money> = employeeTaxes

    /**
     * Returns the raw JSON value of [employerTaxes].
     *
     * Unlike [employerTaxes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("employer_taxes")
    @ExcludeMissing
    fun _employerTaxes(): JsonField<Money> = employerTaxes

    /**
     * Returns the raw JSON value of [grossPay].
     *
     * Unlike [grossPay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay(): JsonField<Money> = grossPay

    /**
     * Returns the raw JSON value of [individualIds].
     *
     * Unlike [individualIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individual_ids")
    @ExcludeMissing
    fun _individualIds(): JsonField<List<String>> = individualIds

    /**
     * Returns the raw JSON value of [netPay].
     *
     * Unlike [netPay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_pay") @ExcludeMissing fun _netPay(): JsonField<Money> = netPay

    /**
     * Returns the raw JSON value of [payDate].
     *
     * Unlike [payDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_date") @ExcludeMissing fun _payDate(): JsonField<String> = payDate

    /**
     * Returns the raw JSON value of [payFrequencies].
     *
     * Unlike [payFrequencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_frequencies")
    @ExcludeMissing
    fun _payFrequencies(): JsonField<List<PayFrequency>> = payFrequencies

    /**
     * Returns the raw JSON value of [payGroupIds].
     *
     * Unlike [payGroupIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_group_ids")
    @ExcludeMissing
    fun _payGroupIds(): JsonField<List<String>> = payGroupIds

    /**
     * Returns the raw JSON value of [payPeriod].
     *
     * Unlike [payPeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pay_period") @ExcludeMissing fun _payPeriod(): JsonField<PayPeriod> = payPeriod

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
         * Returns a mutable builder for constructing an instance of [Payment].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .companyDebit()
         * .debitDate()
         * .employeeTaxes()
         * .employerTaxes()
         * .grossPay()
         * .individualIds()
         * .netPay()
         * .payDate()
         * .payFrequencies()
         * .payGroupIds()
         * .payPeriod()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Payment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var companyDebit: JsonField<Money>? = null
        private var debitDate: JsonField<String>? = null
        private var employeeTaxes: JsonField<Money>? = null
        private var employerTaxes: JsonField<Money>? = null
        private var grossPay: JsonField<Money>? = null
        private var individualIds: JsonField<MutableList<String>>? = null
        private var netPay: JsonField<Money>? = null
        private var payDate: JsonField<String>? = null
        private var payFrequencies: JsonField<MutableList<PayFrequency>>? = null
        private var payGroupIds: JsonField<MutableList<String>>? = null
        private var payPeriod: JsonField<PayPeriod>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(payment: Payment) = apply {
            id = payment.id
            companyDebit = payment.companyDebit
            debitDate = payment.debitDate
            employeeTaxes = payment.employeeTaxes
            employerTaxes = payment.employerTaxes
            grossPay = payment.grossPay
            individualIds = payment.individualIds.map { it.toMutableList() }
            netPay = payment.netPay
            payDate = payment.payDate
            payFrequencies = payment.payFrequencies.map { it.toMutableList() }
            payGroupIds = payment.payGroupIds.map { it.toMutableList() }
            payPeriod = payment.payPeriod
            additionalProperties = payment.additionalProperties.toMutableMap()
        }

        /** The unique id for the payment. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun companyDebit(companyDebit: Money?) = companyDebit(JsonField.ofNullable(companyDebit))

        /**
         * Sets [Builder.companyDebit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyDebit] with a well-typed [Money] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyDebit(companyDebit: JsonField<Money>) = apply {
            this.companyDebit = companyDebit
        }

        fun debitDate(debitDate: String?) = debitDate(JsonField.ofNullable(debitDate))

        /**
         * Sets [Builder.debitDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debitDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debitDate(debitDate: JsonField<String>) = apply { this.debitDate = debitDate }

        fun employeeTaxes(employeeTaxes: Money?) =
            employeeTaxes(JsonField.ofNullable(employeeTaxes))

        /**
         * Sets [Builder.employeeTaxes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employeeTaxes] with a well-typed [Money] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun employeeTaxes(employeeTaxes: JsonField<Money>) = apply {
            this.employeeTaxes = employeeTaxes
        }

        fun employerTaxes(employerTaxes: Money?) =
            employerTaxes(JsonField.ofNullable(employerTaxes))

        /**
         * Sets [Builder.employerTaxes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employerTaxes] with a well-typed [Money] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun employerTaxes(employerTaxes: JsonField<Money>) = apply {
            this.employerTaxes = employerTaxes
        }

        fun grossPay(grossPay: Money?) = grossPay(JsonField.ofNullable(grossPay))

        /**
         * Sets [Builder.grossPay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grossPay] with a well-typed [Money] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun grossPay(grossPay: JsonField<Money>) = apply { this.grossPay = grossPay }

        /** Array of every individual on this payment. */
        fun individualIds(individualIds: List<String>?) =
            individualIds(JsonField.ofNullable(individualIds))

        /**
         * Sets [Builder.individualIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun individualIds(individualIds: JsonField<List<String>>) = apply {
            this.individualIds = individualIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [individualIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndividualId(individualId: String) = apply {
            individualIds =
                (individualIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("individualIds", it).add(individualId)
                }
        }

        fun netPay(netPay: Money?) = netPay(JsonField.ofNullable(netPay))

        /**
         * Sets [Builder.netPay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netPay] with a well-typed [Money] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netPay(netPay: JsonField<Money>) = apply { this.netPay = netPay }

        fun payDate(payDate: String?) = payDate(JsonField.ofNullable(payDate))

        /**
         * Sets [Builder.payDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

        /** List of pay frequencies associated with this payment. */
        fun payFrequencies(payFrequencies: List<PayFrequency>?) =
            payFrequencies(JsonField.ofNullable(payFrequencies))

        /**
         * Sets [Builder.payFrequencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payFrequencies] with a well-typed `List<PayFrequency>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payFrequencies(payFrequencies: JsonField<List<PayFrequency>>) = apply {
            this.payFrequencies = payFrequencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [PayFrequency] to [payFrequencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayFrequency(payFrequency: PayFrequency) = apply {
            payFrequencies =
                (payFrequencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("payFrequencies", it).add(payFrequency)
                }
        }

        /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
        fun payGroupIds(payGroupIds: List<String>?) = payGroupIds(JsonField.ofNullable(payGroupIds))

        /**
         * Sets [Builder.payGroupIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payGroupIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payGroupIds(payGroupIds: JsonField<List<String>>) = apply {
            this.payGroupIds = payGroupIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [payGroupIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayGroupId(payGroupId: String) = apply {
            payGroupIds =
                (payGroupIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("payGroupIds", it).add(payGroupId)
                }
        }

        /** The pay period object. */
        fun payPeriod(payPeriod: PayPeriod?) = payPeriod(JsonField.ofNullable(payPeriod))

        /**
         * Sets [Builder.payPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payPeriod] with a well-typed [PayPeriod] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payPeriod(payPeriod: JsonField<PayPeriod>) = apply { this.payPeriod = payPeriod }

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
         * Returns an immutable instance of [Payment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .companyDebit()
         * .debitDate()
         * .employeeTaxes()
         * .employerTaxes()
         * .grossPay()
         * .individualIds()
         * .netPay()
         * .payDate()
         * .payFrequencies()
         * .payGroupIds()
         * .payPeriod()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Payment =
            Payment(
                checkRequired("id", id),
                checkRequired("companyDebit", companyDebit),
                checkRequired("debitDate", debitDate),
                checkRequired("employeeTaxes", employeeTaxes),
                checkRequired("employerTaxes", employerTaxes),
                checkRequired("grossPay", grossPay),
                checkRequired("individualIds", individualIds).map { it.toImmutable() },
                checkRequired("netPay", netPay),
                checkRequired("payDate", payDate),
                checkRequired("payFrequencies", payFrequencies).map { it.toImmutable() },
                checkRequired("payGroupIds", payGroupIds).map { it.toImmutable() },
                checkRequired("payPeriod", payPeriod),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Payment = apply {
        if (validated) {
            return@apply
        }

        id()
        companyDebit()?.validate()
        debitDate()
        employeeTaxes()?.validate()
        employerTaxes()?.validate()
        grossPay()?.validate()
        individualIds()
        netPay()?.validate()
        payDate()
        payFrequencies()?.forEach { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (companyDebit.asKnown()?.validity() ?: 0) +
            (if (debitDate.asKnown() == null) 0 else 1) +
            (employeeTaxes.asKnown()?.validity() ?: 0) +
            (employerTaxes.asKnown()?.validity() ?: 0) +
            (grossPay.asKnown()?.validity() ?: 0) +
            (individualIds.asKnown()?.size ?: 0) +
            (netPay.asKnown()?.validity() ?: 0) +
            (if (payDate.asKnown() == null) 0 else 1) +
            (payFrequencies.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (payGroupIds.asKnown()?.size ?: 0) +
            (payPeriod.asKnown()?.validity() ?: 0)

    class PayFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val ANNUALLY = of("annually")

            val BI_WEEKLY = of("bi_weekly")

            val DAILY = of("daily")

            val MONTHLY = of("monthly")

            val OTHER = of("other")

            val QUARTERLY = of("quarterly")

            val SEMI_ANNUALLY = of("semi_annually")

            val SEMI_MONTHLY = of("semi_monthly")

            val WEEKLY = of("weekly")

            fun of(value: String) = PayFrequency(JsonField.of(value))
        }

        /** An enum containing [PayFrequency]'s known values. */
        enum class Known {
            ANNUALLY,
            BI_WEEKLY,
            DAILY,
            MONTHLY,
            OTHER,
            QUARTERLY,
            SEMI_ANNUALLY,
            SEMI_MONTHLY,
            WEEKLY,
        }

        /**
         * An enum containing [PayFrequency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PayFrequency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANNUALLY,
            BI_WEEKLY,
            DAILY,
            MONTHLY,
            OTHER,
            QUARTERLY,
            SEMI_ANNUALLY,
            SEMI_MONTHLY,
            WEEKLY,
            /**
             * An enum member indicating that [PayFrequency] was instantiated with an unknown value.
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
                ANNUALLY -> Value.ANNUALLY
                BI_WEEKLY -> Value.BI_WEEKLY
                DAILY -> Value.DAILY
                MONTHLY -> Value.MONTHLY
                OTHER -> Value.OTHER
                QUARTERLY -> Value.QUARTERLY
                SEMI_ANNUALLY -> Value.SEMI_ANNUALLY
                SEMI_MONTHLY -> Value.SEMI_MONTHLY
                WEEKLY -> Value.WEEKLY
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
                ANNUALLY -> Known.ANNUALLY
                BI_WEEKLY -> Known.BI_WEEKLY
                DAILY -> Known.DAILY
                MONTHLY -> Known.MONTHLY
                OTHER -> Known.OTHER
                QUARTERLY -> Known.QUARTERLY
                SEMI_ANNUALLY -> Known.SEMI_ANNUALLY
                SEMI_MONTHLY -> Known.SEMI_MONTHLY
                WEEKLY -> Known.WEEKLY
                else -> throw FinchInvalidDataException("Unknown PayFrequency: $value")
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

        fun validate(): PayFrequency = apply {
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

            return /* spotless:off */ other is PayFrequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The pay period object. */
    class PayPeriod
    private constructor(
        private val endDate: JsonField<String>,
        private val startDate: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_date") @ExcludeMissing endDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<String> = JsonMissing.of(),
        ) : this(endDate, startDate, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): String? = endDate.getNullable("end_date")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): String? = startDate.getNullable("start_date")

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<String> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<String> = startDate

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
             * Returns a mutable builder for constructing an instance of [PayPeriod].
             *
             * The following fields are required:
             * ```kotlin
             * .endDate()
             * .startDate()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PayPeriod]. */
        class Builder internal constructor() {

            private var endDate: JsonField<String>? = null
            private var startDate: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(payPeriod: PayPeriod) = apply {
                endDate = payPeriod.endDate
                startDate = payPeriod.startDate
                additionalProperties = payPeriod.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: String?) = endDate(JsonField.ofNullable(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

            fun startDate(startDate: String?) = startDate(JsonField.ofNullable(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

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
             * Returns an immutable instance of [PayPeriod].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .endDate()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PayPeriod =
                PayPeriod(
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    additionalProperties.toMutableMap(),
                )
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (endDate.asKnown() == null) 0 else 1) + (if (startDate.asKnown() == null) 0 else 1)

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

        return /* spotless:off */ other is Payment && id == other.id && companyDebit == other.companyDebit && debitDate == other.debitDate && employeeTaxes == other.employeeTaxes && employerTaxes == other.employerTaxes && grossPay == other.grossPay && individualIds == other.individualIds && netPay == other.netPay && payDate == other.payDate && payFrequencies == other.payFrequencies && payGroupIds == other.payGroupIds && payPeriod == other.payPeriod && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, companyDebit, debitDate, employeeTaxes, employerTaxes, grossPay, individualIds, netPay, payDate, payFrequencies, payGroupIds, payPeriod, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{id=$id, companyDebit=$companyDebit, debitDate=$debitDate, employeeTaxes=$employeeTaxes, employerTaxes=$employerTaxes, grossPay=$grossPay, individualIds=$individualIds, netPay=$netPay, payDate=$payDate, payFrequencies=$payFrequencies, payGroupIds=$payGroupIds, payPeriod=$payPeriod, additionalProperties=$additionalProperties}"
}
