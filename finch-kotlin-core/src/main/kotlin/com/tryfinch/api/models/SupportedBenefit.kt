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

class SupportedBenefit
private constructor(
    private val annualMaximum: JsonField<Boolean>,
    private val companyContribution: JsonField<List<CompanyContribution?>>,
    private val description: JsonField<String>,
    private val employeeDeduction: JsonField<List<EmployeeDeduction?>>,
    private val frequencies: JsonField<List<BenefitFrequency?>>,
    private val catchUp: JsonField<Boolean>,
    private val hsaContributionLimit: JsonField<List<HsaContributionLimit?>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("annual_maximum")
        @ExcludeMissing
        annualMaximum: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("company_contribution")
        @ExcludeMissing
        companyContribution: JsonField<List<CompanyContribution?>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("employee_deduction")
        @ExcludeMissing
        employeeDeduction: JsonField<List<EmployeeDeduction?>> = JsonMissing.of(),
        @JsonProperty("frequencies")
        @ExcludeMissing
        frequencies: JsonField<List<BenefitFrequency?>> = JsonMissing.of(),
        @JsonProperty("catch_up") @ExcludeMissing catchUp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hsa_contribution_limit")
        @ExcludeMissing
        hsaContributionLimit: JsonField<List<HsaContributionLimit?>> = JsonMissing.of(),
    ) : this(
        annualMaximum,
        companyContribution,
        description,
        employeeDeduction,
        frequencies,
        catchUp,
        hsaContributionLimit,
        mutableMapOf(),
    )

    /**
     * Whether the provider supports an annual maximum for this benefit.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun annualMaximum(): Boolean? = annualMaximum.getNullable("annual_maximum")

    /**
     * Supported contribution types. An empty array indicates contributions are not supported.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyContribution(): List<CompanyContribution?>? =
        companyContribution.getNullable("company_contribution")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * Supported deduction types. An empty array indicates deductions are not supported.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun employeeDeduction(): List<EmployeeDeduction?>? =
        employeeDeduction.getNullable("employee_deduction")

    /**
     * The list of frequencies supported by the provider for this benefit
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frequencies(): List<BenefitFrequency?> = frequencies.getRequired("frequencies")

    /**
     * Whether the provider supports catch up for this benefit. This field will only be true for
     * retirement benefits.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun catchUp(): Boolean? = catchUp.getNullable("catch_up")

    /**
     * Whether the provider supports HSA contribution limits. Empty if this feature is not supported
     * for the benefit. This array only has values for HSA benefits.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsaContributionLimit(): List<HsaContributionLimit?>? =
        hsaContributionLimit.getNullable("hsa_contribution_limit")

    /**
     * Returns the raw JSON value of [annualMaximum].
     *
     * Unlike [annualMaximum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("annual_maximum")
    @ExcludeMissing
    fun _annualMaximum(): JsonField<Boolean> = annualMaximum

    /**
     * Returns the raw JSON value of [companyContribution].
     *
     * Unlike [companyContribution], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("company_contribution")
    @ExcludeMissing
    fun _companyContribution(): JsonField<List<CompanyContribution?>> = companyContribution

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [employeeDeduction].
     *
     * Unlike [employeeDeduction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("employee_deduction")
    @ExcludeMissing
    fun _employeeDeduction(): JsonField<List<EmployeeDeduction?>> = employeeDeduction

    /**
     * Returns the raw JSON value of [frequencies].
     *
     * Unlike [frequencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequencies")
    @ExcludeMissing
    fun _frequencies(): JsonField<List<BenefitFrequency?>> = frequencies

    /**
     * Returns the raw JSON value of [catchUp].
     *
     * Unlike [catchUp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("catch_up") @ExcludeMissing fun _catchUp(): JsonField<Boolean> = catchUp

    /**
     * Returns the raw JSON value of [hsaContributionLimit].
     *
     * Unlike [hsaContributionLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hsa_contribution_limit")
    @ExcludeMissing
    fun _hsaContributionLimit(): JsonField<List<HsaContributionLimit?>> = hsaContributionLimit

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
         * Returns a mutable builder for constructing an instance of [SupportedBenefit].
         *
         * The following fields are required:
         * ```kotlin
         * .annualMaximum()
         * .companyContribution()
         * .description()
         * .employeeDeduction()
         * .frequencies()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SupportedBenefit]. */
    class Builder internal constructor() {

        private var annualMaximum: JsonField<Boolean>? = null
        private var companyContribution: JsonField<MutableList<CompanyContribution?>>? = null
        private var description: JsonField<String>? = null
        private var employeeDeduction: JsonField<MutableList<EmployeeDeduction?>>? = null
        private var frequencies: JsonField<MutableList<BenefitFrequency?>>? = null
        private var catchUp: JsonField<Boolean> = JsonMissing.of()
        private var hsaContributionLimit: JsonField<MutableList<HsaContributionLimit?>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(supportedBenefit: SupportedBenefit) = apply {
            annualMaximum = supportedBenefit.annualMaximum
            companyContribution = supportedBenefit.companyContribution.map { it.toMutableList() }
            description = supportedBenefit.description
            employeeDeduction = supportedBenefit.employeeDeduction.map { it.toMutableList() }
            frequencies = supportedBenefit.frequencies.map { it.toMutableList() }
            catchUp = supportedBenefit.catchUp
            hsaContributionLimit = supportedBenefit.hsaContributionLimit.map { it.toMutableList() }
            additionalProperties = supportedBenefit.additionalProperties.toMutableMap()
        }

        /** Whether the provider supports an annual maximum for this benefit. */
        fun annualMaximum(annualMaximum: Boolean?) =
            annualMaximum(JsonField.ofNullable(annualMaximum))

        /**
         * Alias for [Builder.annualMaximum].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun annualMaximum(annualMaximum: Boolean) = annualMaximum(annualMaximum as Boolean?)

        /**
         * Sets [Builder.annualMaximum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annualMaximum] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun annualMaximum(annualMaximum: JsonField<Boolean>) = apply {
            this.annualMaximum = annualMaximum
        }

        /**
         * Supported contribution types. An empty array indicates contributions are not supported.
         */
        fun companyContribution(companyContribution: List<CompanyContribution?>?) =
            companyContribution(JsonField.ofNullable(companyContribution))

        /**
         * Sets [Builder.companyContribution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyContribution] with a well-typed
         * `List<CompanyContribution?>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun companyContribution(companyContribution: JsonField<List<CompanyContribution?>>) =
            apply {
                this.companyContribution = companyContribution.map { it.toMutableList() }
            }

        /**
         * Adds a single [CompanyContribution] to [Builder.companyContribution].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCompanyContribution(companyContribution: CompanyContribution) = apply {
            this.companyContribution =
                (this.companyContribution ?: JsonField.of(mutableListOf())).also {
                    checkKnown("companyContribution", it).add(companyContribution)
                }
        }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Supported deduction types. An empty array indicates deductions are not supported. */
        fun employeeDeduction(employeeDeduction: List<EmployeeDeduction?>?) =
            employeeDeduction(JsonField.ofNullable(employeeDeduction))

        /**
         * Sets [Builder.employeeDeduction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.employeeDeduction] with a well-typed
         * `List<EmployeeDeduction?>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun employeeDeduction(employeeDeduction: JsonField<List<EmployeeDeduction?>>) = apply {
            this.employeeDeduction = employeeDeduction.map { it.toMutableList() }
        }

        /**
         * Adds a single [EmployeeDeduction] to [Builder.employeeDeduction].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmployeeDeduction(employeeDeduction: EmployeeDeduction) = apply {
            this.employeeDeduction =
                (this.employeeDeduction ?: JsonField.of(mutableListOf())).also {
                    checkKnown("employeeDeduction", it).add(employeeDeduction)
                }
        }

        /** The list of frequencies supported by the provider for this benefit */
        fun frequencies(frequencies: List<BenefitFrequency?>) =
            frequencies(JsonField.of(frequencies))

        /**
         * Sets [Builder.frequencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequencies] with a well-typed `List<BenefitFrequency?>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun frequencies(frequencies: JsonField<List<BenefitFrequency?>>) = apply {
            this.frequencies = frequencies.map { it.toMutableList() }
        }

        /**
         * Adds a single [BenefitFrequency] to [frequencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFrequency(frequency: BenefitFrequency) = apply {
            frequencies =
                (frequencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("frequencies", it).add(frequency)
                }
        }

        /**
         * Whether the provider supports catch up for this benefit. This field will only be true for
         * retirement benefits.
         */
        fun catchUp(catchUp: Boolean?) = catchUp(JsonField.ofNullable(catchUp))

        /**
         * Alias for [Builder.catchUp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun catchUp(catchUp: Boolean) = catchUp(catchUp as Boolean?)

        /**
         * Sets [Builder.catchUp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.catchUp] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

        /**
         * Whether the provider supports HSA contribution limits. Empty if this feature is not
         * supported for the benefit. This array only has values for HSA benefits.
         */
        fun hsaContributionLimit(hsaContributionLimit: List<HsaContributionLimit?>?) =
            hsaContributionLimit(JsonField.ofNullable(hsaContributionLimit))

        /**
         * Sets [Builder.hsaContributionLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsaContributionLimit] with a well-typed
         * `List<HsaContributionLimit?>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun hsaContributionLimit(hsaContributionLimit: JsonField<List<HsaContributionLimit?>>) =
            apply {
                this.hsaContributionLimit = hsaContributionLimit.map { it.toMutableList() }
            }

        /**
         * Adds a single [HsaContributionLimit] to [Builder.hsaContributionLimit].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHsaContributionLimit(hsaContributionLimit: HsaContributionLimit) = apply {
            this.hsaContributionLimit =
                (this.hsaContributionLimit ?: JsonField.of(mutableListOf())).also {
                    checkKnown("hsaContributionLimit", it).add(hsaContributionLimit)
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

        /**
         * Returns an immutable instance of [SupportedBenefit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .annualMaximum()
         * .companyContribution()
         * .description()
         * .employeeDeduction()
         * .frequencies()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SupportedBenefit =
            SupportedBenefit(
                checkRequired("annualMaximum", annualMaximum),
                checkRequired("companyContribution", companyContribution).map { it.toImmutable() },
                checkRequired("description", description),
                checkRequired("employeeDeduction", employeeDeduction).map { it.toImmutable() },
                checkRequired("frequencies", frequencies).map { it.toImmutable() },
                catchUp,
                (hsaContributionLimit ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SupportedBenefit = apply {
        if (validated) {
            return@apply
        }

        annualMaximum()
        companyContribution()?.forEach { it?.validate() }
        description()
        employeeDeduction()?.forEach { it?.validate() }
        frequencies().forEach { it?.validate() }
        catchUp()
        hsaContributionLimit()?.forEach { it?.validate() }
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
        (if (annualMaximum.asKnown() == null) 0 else 1) +
            (companyContribution.asKnown()?.sumOf { (it?.validity() ?: 0).toInt() } ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (employeeDeduction.asKnown()?.sumOf { (it?.validity() ?: 0).toInt() } ?: 0) +
            (frequencies.asKnown()?.sumOf { (it?.validity() ?: 0).toInt() } ?: 0) +
            (if (catchUp.asKnown() == null) 0 else 1) +
            (hsaContributionLimit.asKnown()?.sumOf { (it?.validity() ?: 0).toInt() } ?: 0)

    class CompanyContribution
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val FIXED = of("fixed")

            val PERCENT = of("percent")

            fun of(value: String) = CompanyContribution(JsonField.of(value))
        }

        /** An enum containing [CompanyContribution]'s known values. */
        enum class Known {
            FIXED,
            PERCENT,
        }

        /**
         * An enum containing [CompanyContribution]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CompanyContribution] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIXED,
            PERCENT,
            /**
             * An enum member indicating that [CompanyContribution] was instantiated with an unknown
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
                FIXED -> Value.FIXED
                PERCENT -> Value.PERCENT
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
                FIXED -> Known.FIXED
                PERCENT -> Known.PERCENT
                else -> throw FinchInvalidDataException("Unknown CompanyContribution: $value")
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

        fun validate(): CompanyContribution = apply {
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

            return /* spotless:off */ other is CompanyContribution && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class EmployeeDeduction @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val FIXED = of("fixed")

            val PERCENT = of("percent")

            fun of(value: String) = EmployeeDeduction(JsonField.of(value))
        }

        /** An enum containing [EmployeeDeduction]'s known values. */
        enum class Known {
            FIXED,
            PERCENT,
        }

        /**
         * An enum containing [EmployeeDeduction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EmployeeDeduction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIXED,
            PERCENT,
            /**
             * An enum member indicating that [EmployeeDeduction] was instantiated with an unknown
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
                FIXED -> Value.FIXED
                PERCENT -> Value.PERCENT
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
                FIXED -> Known.FIXED
                PERCENT -> Known.PERCENT
                else -> throw FinchInvalidDataException("Unknown EmployeeDeduction: $value")
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

        fun validate(): EmployeeDeduction = apply {
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

            return /* spotless:off */ other is EmployeeDeduction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class HsaContributionLimit
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val FAMILY = of("family")

            val INDIVIDUAL = of("individual")

            fun of(value: String) = HsaContributionLimit(JsonField.of(value))
        }

        /** An enum containing [HsaContributionLimit]'s known values. */
        enum class Known {
            FAMILY,
            INDIVIDUAL,
        }

        /**
         * An enum containing [HsaContributionLimit]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [HsaContributionLimit] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FAMILY,
            INDIVIDUAL,
            /**
             * An enum member indicating that [HsaContributionLimit] was instantiated with an
             * unknown value.
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
                FAMILY -> Value.FAMILY
                INDIVIDUAL -> Value.INDIVIDUAL
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
                FAMILY -> Known.FAMILY
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw FinchInvalidDataException("Unknown HsaContributionLimit: $value")
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

        fun validate(): HsaContributionLimit = apply {
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

            return /* spotless:off */ other is HsaContributionLimit && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SupportedBenefit && annualMaximum == other.annualMaximum && companyContribution == other.companyContribution && description == other.description && employeeDeduction == other.employeeDeduction && frequencies == other.frequencies && catchUp == other.catchUp && hsaContributionLimit == other.hsaContributionLimit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(annualMaximum, companyContribution, description, employeeDeduction, frequencies, catchUp, hsaContributionLimit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SupportedBenefit{annualMaximum=$annualMaximum, companyContribution=$companyContribution, description=$description, employeeDeduction=$employeeDeduction, frequencies=$frequencies, catchUp=$catchUp, hsaContributionLimit=$hsaContributionLimit, additionalProperties=$additionalProperties}"
}
