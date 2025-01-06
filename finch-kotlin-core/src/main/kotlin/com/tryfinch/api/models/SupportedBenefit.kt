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
class SupportedBenefit
@JsonCreator
private constructor(
    @JsonProperty("annual_maximum")
    @ExcludeMissing
    private val annualMaximum: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("catch_up")
    @ExcludeMissing
    private val catchUp: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("company_contribution")
    @ExcludeMissing
    private val companyContribution: JsonField<List<CompanyContribution?>> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("employee_deduction")
    @ExcludeMissing
    private val employeeDeduction: JsonField<List<EmployeeDeduction?>> = JsonMissing.of(),
    @JsonProperty("frequencies")
    @ExcludeMissing
    private val frequencies: JsonField<List<BenefitFrequency?>> = JsonMissing.of(),
    @JsonProperty("hsa_contribution_limit")
    @ExcludeMissing
    private val hsaContributionLimit: JsonField<List<HsaContributionLimit?>> = JsonMissing.of(),
    @JsonProperty("type")
    @ExcludeMissing
    private val type: JsonField<BenefitType> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Whether the provider supports an annual maximum for this benefit. */
    fun annualMaximum(): Boolean? = annualMaximum.getNullable("annual_maximum")

    /**
     * Whether the provider supports catch up for this benefit. This field will only be true for
     * retirement benefits.
     */
    fun catchUp(): Boolean? = catchUp.getNullable("catch_up")

    /** Supported contribution types. An empty array indicates contributions are not supported. */
    fun companyContribution(): List<CompanyContribution?>? =
        companyContribution.getNullable("company_contribution")

    fun description(): String? = description.getNullable("description")

    /** Supported deduction types. An empty array indicates deductions are not supported. */
    fun employeeDeduction(): List<EmployeeDeduction?>? =
        employeeDeduction.getNullable("employee_deduction")

    /** The list of frequencies supported by the provider for this benefit */
    fun frequencies(): List<BenefitFrequency?>? = frequencies.getNullable("frequencies")

    /**
     * Whether the provider supports HSA contribution limits. Empty if this feature is not supported
     * for the benefit. This array only has values for HSA benefits.
     */
    fun hsaContributionLimit(): List<HsaContributionLimit?>? =
        hsaContributionLimit.getNullable("hsa_contribution_limit")

    /** Type of benefit. */
    fun type(): BenefitType? = type.getNullable("type")

    /** Whether the provider supports an annual maximum for this benefit. */
    @JsonProperty("annual_maximum") @ExcludeMissing fun _annualMaximum() = annualMaximum

    /**
     * Whether the provider supports catch up for this benefit. This field will only be true for
     * retirement benefits.
     */
    @JsonProperty("catch_up") @ExcludeMissing fun _catchUp() = catchUp

    /** Supported contribution types. An empty array indicates contributions are not supported. */
    @JsonProperty("company_contribution")
    @ExcludeMissing
    fun _companyContribution() = companyContribution

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Supported deduction types. An empty array indicates deductions are not supported. */
    @JsonProperty("employee_deduction") @ExcludeMissing fun _employeeDeduction() = employeeDeduction

    /** The list of frequencies supported by the provider for this benefit */
    @JsonProperty("frequencies") @ExcludeMissing fun _frequencies() = frequencies

    /**
     * Whether the provider supports HSA contribution limits. Empty if this feature is not supported
     * for the benefit. This array only has values for HSA benefits.
     */
    @JsonProperty("hsa_contribution_limit")
    @ExcludeMissing
    fun _hsaContributionLimit() = hsaContributionLimit

    /** Type of benefit. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SupportedBenefit = apply {
        if (!validated) {
            annualMaximum()
            catchUp()
            companyContribution()
            description()
            employeeDeduction()
            frequencies()
            hsaContributionLimit()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var annualMaximum: JsonField<Boolean> = JsonMissing.of()
        private var catchUp: JsonField<Boolean> = JsonMissing.of()
        private var companyContribution: JsonField<List<CompanyContribution?>> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var employeeDeduction: JsonField<List<EmployeeDeduction?>> = JsonMissing.of()
        private var frequencies: JsonField<List<BenefitFrequency?>> = JsonMissing.of()
        private var hsaContributionLimit: JsonField<List<HsaContributionLimit?>> = JsonMissing.of()
        private var type: JsonField<BenefitType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(supportedBenefit: SupportedBenefit) = apply {
            annualMaximum = supportedBenefit.annualMaximum
            catchUp = supportedBenefit.catchUp
            companyContribution = supportedBenefit.companyContribution
            description = supportedBenefit.description
            employeeDeduction = supportedBenefit.employeeDeduction
            frequencies = supportedBenefit.frequencies
            hsaContributionLimit = supportedBenefit.hsaContributionLimit
            type = supportedBenefit.type
            additionalProperties = supportedBenefit.additionalProperties.toMutableMap()
        }

        /** Whether the provider supports an annual maximum for this benefit. */
        fun annualMaximum(annualMaximum: Boolean) = annualMaximum(JsonField.of(annualMaximum))

        /** Whether the provider supports an annual maximum for this benefit. */
        fun annualMaximum(annualMaximum: JsonField<Boolean>) = apply {
            this.annualMaximum = annualMaximum
        }

        /**
         * Whether the provider supports catch up for this benefit. This field will only be true for
         * retirement benefits.
         */
        fun catchUp(catchUp: Boolean) = catchUp(JsonField.of(catchUp))

        /**
         * Whether the provider supports catch up for this benefit. This field will only be true for
         * retirement benefits.
         */
        fun catchUp(catchUp: JsonField<Boolean>) = apply { this.catchUp = catchUp }

        /**
         * Supported contribution types. An empty array indicates contributions are not supported.
         */
        fun companyContribution(companyContribution: List<CompanyContribution?>) =
            companyContribution(JsonField.of(companyContribution))

        /**
         * Supported contribution types. An empty array indicates contributions are not supported.
         */
        fun companyContribution(companyContribution: JsonField<List<CompanyContribution?>>) =
            apply {
                this.companyContribution = companyContribution
            }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Supported deduction types. An empty array indicates deductions are not supported. */
        fun employeeDeduction(employeeDeduction: List<EmployeeDeduction?>) =
            employeeDeduction(JsonField.of(employeeDeduction))

        /** Supported deduction types. An empty array indicates deductions are not supported. */
        fun employeeDeduction(employeeDeduction: JsonField<List<EmployeeDeduction?>>) = apply {
            this.employeeDeduction = employeeDeduction
        }

        /** The list of frequencies supported by the provider for this benefit */
        fun frequencies(frequencies: List<BenefitFrequency?>) =
            frequencies(JsonField.of(frequencies))

        /** The list of frequencies supported by the provider for this benefit */
        fun frequencies(frequencies: JsonField<List<BenefitFrequency?>>) = apply {
            this.frequencies = frequencies
        }

        /**
         * Whether the provider supports HSA contribution limits. Empty if this feature is not
         * supported for the benefit. This array only has values for HSA benefits.
         */
        fun hsaContributionLimit(hsaContributionLimit: List<HsaContributionLimit?>) =
            hsaContributionLimit(JsonField.of(hsaContributionLimit))

        /**
         * Whether the provider supports HSA contribution limits. Empty if this feature is not
         * supported for the benefit. This array only has values for HSA benefits.
         */
        fun hsaContributionLimit(hsaContributionLimit: JsonField<List<HsaContributionLimit?>>) =
            apply {
                this.hsaContributionLimit = hsaContributionLimit
            }

        /** Type of benefit. */
        fun type(type: BenefitType) = type(JsonField.of(type))

        /** Type of benefit. */
        fun type(type: JsonField<BenefitType>) = apply { this.type = type }

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

        fun build(): SupportedBenefit =
            SupportedBenefit(
                annualMaximum,
                catchUp,
                companyContribution.map { it.toImmutable() },
                description,
                employeeDeduction.map { it.toImmutable() },
                frequencies.map { it.toImmutable() },
                hsaContributionLimit.map { it.toImmutable() },
                type,
                additionalProperties.toImmutable(),
            )
    }

    class CompanyContribution
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FIXED = of("fixed")

            val PERCENT = of("percent")

            fun of(value: String) = CompanyContribution(JsonField.of(value))
        }

        enum class Known {
            FIXED,
            PERCENT,
        }

        enum class Value {
            FIXED,
            PERCENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED -> Value.FIXED
                PERCENT -> Value.PERCENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED -> Known.FIXED
                PERCENT -> Known.PERCENT
                else -> throw FinchInvalidDataException("Unknown CompanyContribution: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CompanyContribution && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class EmployeeDeduction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FIXED = of("fixed")

            val PERCENT = of("percent")

            fun of(value: String) = EmployeeDeduction(JsonField.of(value))
        }

        enum class Known {
            FIXED,
            PERCENT,
        }

        enum class Value {
            FIXED,
            PERCENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED -> Value.FIXED
                PERCENT -> Value.PERCENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED -> Known.FIXED
                PERCENT -> Known.PERCENT
                else -> throw FinchInvalidDataException("Unknown EmployeeDeduction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INDIVIDUAL = of("individual")

            val FAMILY = of("family")

            fun of(value: String) = HsaContributionLimit(JsonField.of(value))
        }

        enum class Known {
            INDIVIDUAL,
            FAMILY,
        }

        enum class Value {
            INDIVIDUAL,
            FAMILY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INDIVIDUAL -> Value.INDIVIDUAL
                FAMILY -> Value.FAMILY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INDIVIDUAL -> Known.INDIVIDUAL
                FAMILY -> Known.FAMILY
                else -> throw FinchInvalidDataException("Unknown HsaContributionLimit: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is SupportedBenefit && annualMaximum == other.annualMaximum && catchUp == other.catchUp && companyContribution == other.companyContribution && description == other.description && employeeDeduction == other.employeeDeduction && frequencies == other.frequencies && hsaContributionLimit == other.hsaContributionLimit && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(annualMaximum, catchUp, companyContribution, description, employeeDeduction, frequencies, hsaContributionLimit, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SupportedBenefit{annualMaximum=$annualMaximum, catchUp=$catchUp, companyContribution=$companyContribution, description=$description, employeeDeduction=$employeeDeduction, frequencies=$frequencies, hsaContributionLimit=$hsaContributionLimit, type=$type, additionalProperties=$additionalProperties}"
}
