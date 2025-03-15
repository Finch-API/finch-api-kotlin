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

/**
 * A 2020 version of the W-4 tax form containing information on an individual's filing status,
 * dependents, and withholding details.
 */
@NoAutoDetect
class W42020
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("year") @ExcludeMissing private val year: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Detailed information specific to the 2020 W4 form.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Data? = data.getNullable("data")

    /**
     * Specifies the form type, indicating that this document is a 2020 W4 form.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Type? = type.getNullable("type")

    /**
     * The tax year this W4 document applies to.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun year(): Double? = year.getNullable("year")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [year].
     *
     * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Double> = year

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): W42020 = apply {
        if (validated) {
            return@apply
        }

        data()?.validate()
        type()
        year()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [W42020]. */
        fun builder() = Builder()
    }

    /** A builder for [W42020]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var year: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(w42020: W42020) = apply {
            data = w42020.data
            type = w42020.type
            year = w42020.year
            additionalProperties = w42020.additionalProperties.toMutableMap()
        }

        /** Detailed information specific to the 2020 W4 form. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Specifies the form type, indicating that this document is a 2020 W4 form. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The tax year this W4 document applies to. */
        fun year(year: Double?) = year(JsonField.ofNullable(year))

        /**
         * Alias for [Builder.year].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun year(year: Double) = year(year as Double?)

        /**
         * Sets [Builder.year] to an arbitrary JSON value.
         *
         * You should usually call [Builder.year] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun year(year: JsonField<Double>) = apply { this.year = year }

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

        fun build(): W42020 = W42020(data, type, year, additionalProperties.toImmutable())
    }

    /** Detailed information specific to the 2020 W4 form. */
    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("amount_for_other_dependents")
        @ExcludeMissing
        private val amountForOtherDependents: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount_for_qualifying_children_under_17")
        @ExcludeMissing
        private val amountForQualifyingChildrenUnder17: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("deductions")
        @ExcludeMissing
        private val deductions: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("extra_withholding")
        @ExcludeMissing
        private val extraWithholding: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("filing_status")
        @ExcludeMissing
        private val filingStatus: JsonField<FilingStatus> = JsonMissing.of(),
        @JsonProperty("individual_id")
        @ExcludeMissing
        private val individualId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_income")
        @ExcludeMissing
        private val otherIncome: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_claim_dependent_and_other_credits")
        @ExcludeMissing
        private val totalClaimDependentAndOtherCredits: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount claimed for dependents other than qualifying children under 17 (in cents).
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountForOtherDependents(): Long? =
            amountForOtherDependents.getNullable("amount_for_other_dependents")

        /**
         * Amount claimed for dependents under 17 years old (in cents).
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun amountForQualifyingChildrenUnder17(): Long? =
            amountForQualifyingChildrenUnder17.getNullable(
                "amount_for_qualifying_children_under_17"
            )

        /**
         * Deductible expenses (in cents).
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deductions(): Long? = deductions.getNullable("deductions")

        /**
         * Additional withholding amount (in cents).
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun extraWithholding(): Long? = extraWithholding.getNullable("extra_withholding")

        /**
         * The individual's filing status for tax purposes.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filingStatus(): FilingStatus? = filingStatus.getNullable("filing_status")

        /**
         * The unique identifier for the individual associated with this document.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun individualId(): String? = individualId.getNullable("individual_id")

        /**
         * Additional income from sources outside of primary employment (in cents).
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun otherIncome(): Long? = otherIncome.getNullable("other_income")

        /**
         * Total amount claimed for dependents and other credits (in cents).
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalClaimDependentAndOtherCredits(): Long? =
            totalClaimDependentAndOtherCredits.getNullable(
                "total_claim_dependent_and_other_credits"
            )

        /**
         * Returns the raw JSON value of [amountForOtherDependents].
         *
         * Unlike [amountForOtherDependents], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("amount_for_other_dependents")
        @ExcludeMissing
        fun _amountForOtherDependents(): JsonField<Long> = amountForOtherDependents

        /**
         * Returns the raw JSON value of [amountForQualifyingChildrenUnder17].
         *
         * Unlike [amountForQualifyingChildrenUnder17], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("amount_for_qualifying_children_under_17")
        @ExcludeMissing
        fun _amountForQualifyingChildrenUnder17(): JsonField<Long> =
            amountForQualifyingChildrenUnder17

        /**
         * Returns the raw JSON value of [deductions].
         *
         * Unlike [deductions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deductions") @ExcludeMissing fun _deductions(): JsonField<Long> = deductions

        /**
         * Returns the raw JSON value of [extraWithholding].
         *
         * Unlike [extraWithholding], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("extra_withholding")
        @ExcludeMissing
        fun _extraWithholding(): JsonField<Long> = extraWithholding

        /**
         * Returns the raw JSON value of [filingStatus].
         *
         * Unlike [filingStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("filing_status")
        @ExcludeMissing
        fun _filingStatus(): JsonField<FilingStatus> = filingStatus

        /**
         * Returns the raw JSON value of [individualId].
         *
         * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        /**
         * Returns the raw JSON value of [otherIncome].
         *
         * Unlike [otherIncome], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("other_income")
        @ExcludeMissing
        fun _otherIncome(): JsonField<Long> = otherIncome

        /**
         * Returns the raw JSON value of [totalClaimDependentAndOtherCredits].
         *
         * Unlike [totalClaimDependentAndOtherCredits], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("total_claim_dependent_and_other_credits")
        @ExcludeMissing
        fun _totalClaimDependentAndOtherCredits(): JsonField<Long> =
            totalClaimDependentAndOtherCredits

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            amountForOtherDependents()
            amountForQualifyingChildrenUnder17()
            deductions()
            extraWithholding()
            filingStatus()
            individualId()
            otherIncome()
            totalClaimDependentAndOtherCredits()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Data]. */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var amountForOtherDependents: JsonField<Long> = JsonMissing.of()
            private var amountForQualifyingChildrenUnder17: JsonField<Long> = JsonMissing.of()
            private var deductions: JsonField<Long> = JsonMissing.of()
            private var extraWithholding: JsonField<Long> = JsonMissing.of()
            private var filingStatus: JsonField<FilingStatus> = JsonMissing.of()
            private var individualId: JsonField<String> = JsonMissing.of()
            private var otherIncome: JsonField<Long> = JsonMissing.of()
            private var totalClaimDependentAndOtherCredits: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                amountForOtherDependents = data.amountForOtherDependents
                amountForQualifyingChildrenUnder17 = data.amountForQualifyingChildrenUnder17
                deductions = data.deductions
                extraWithholding = data.extraWithholding
                filingStatus = data.filingStatus
                individualId = data.individualId
                otherIncome = data.otherIncome
                totalClaimDependentAndOtherCredits = data.totalClaimDependentAndOtherCredits
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Amount claimed for dependents other than qualifying children under 17 (in cents). */
            fun amountForOtherDependents(amountForOtherDependents: Long?) =
                amountForOtherDependents(JsonField.ofNullable(amountForOtherDependents))

            /**
             * Alias for [Builder.amountForOtherDependents].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun amountForOtherDependents(amountForOtherDependents: Long) =
                amountForOtherDependents(amountForOtherDependents as Long?)

            /**
             * Sets [Builder.amountForOtherDependents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountForOtherDependents] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun amountForOtherDependents(amountForOtherDependents: JsonField<Long>) = apply {
                this.amountForOtherDependents = amountForOtherDependents
            }

            /** Amount claimed for dependents under 17 years old (in cents). */
            fun amountForQualifyingChildrenUnder17(amountForQualifyingChildrenUnder17: Long?) =
                amountForQualifyingChildrenUnder17(
                    JsonField.ofNullable(amountForQualifyingChildrenUnder17)
                )

            /**
             * Alias for [Builder.amountForQualifyingChildrenUnder17].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun amountForQualifyingChildrenUnder17(amountForQualifyingChildrenUnder17: Long) =
                amountForQualifyingChildrenUnder17(amountForQualifyingChildrenUnder17 as Long?)

            /**
             * Sets [Builder.amountForQualifyingChildrenUnder17] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amountForQualifyingChildrenUnder17] with a
             * well-typed [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun amountForQualifyingChildrenUnder17(
                amountForQualifyingChildrenUnder17: JsonField<Long>
            ) = apply {
                this.amountForQualifyingChildrenUnder17 = amountForQualifyingChildrenUnder17
            }

            /** Deductible expenses (in cents). */
            fun deductions(deductions: Long?) = deductions(JsonField.ofNullable(deductions))

            /**
             * Alias for [Builder.deductions].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun deductions(deductions: Long) = deductions(deductions as Long?)

            /**
             * Sets [Builder.deductions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deductions] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deductions(deductions: JsonField<Long>) = apply { this.deductions = deductions }

            /** Additional withholding amount (in cents). */
            fun extraWithholding(extraWithholding: Long?) =
                extraWithholding(JsonField.ofNullable(extraWithholding))

            /**
             * Alias for [Builder.extraWithholding].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun extraWithholding(extraWithholding: Long) =
                extraWithholding(extraWithholding as Long?)

            /**
             * Sets [Builder.extraWithholding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extraWithholding] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extraWithholding(extraWithholding: JsonField<Long>) = apply {
                this.extraWithholding = extraWithholding
            }

            /** The individual's filing status for tax purposes. */
            fun filingStatus(filingStatus: FilingStatus?) =
                filingStatus(JsonField.ofNullable(filingStatus))

            /**
             * Sets [Builder.filingStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filingStatus] with a well-typed [FilingStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filingStatus(filingStatus: JsonField<FilingStatus>) = apply {
                this.filingStatus = filingStatus
            }

            /** The unique identifier for the individual associated with this document. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /**
             * Sets [Builder.individualId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individualId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
            }

            /** Additional income from sources outside of primary employment (in cents). */
            fun otherIncome(otherIncome: Long?) = otherIncome(JsonField.ofNullable(otherIncome))

            /**
             * Alias for [Builder.otherIncome].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun otherIncome(otherIncome: Long) = otherIncome(otherIncome as Long?)

            /**
             * Sets [Builder.otherIncome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.otherIncome] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun otherIncome(otherIncome: JsonField<Long>) = apply { this.otherIncome = otherIncome }

            /** Total amount claimed for dependents and other credits (in cents). */
            fun totalClaimDependentAndOtherCredits(totalClaimDependentAndOtherCredits: Long?) =
                totalClaimDependentAndOtherCredits(
                    JsonField.ofNullable(totalClaimDependentAndOtherCredits)
                )

            /**
             * Alias for [Builder.totalClaimDependentAndOtherCredits].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalClaimDependentAndOtherCredits(totalClaimDependentAndOtherCredits: Long) =
                totalClaimDependentAndOtherCredits(totalClaimDependentAndOtherCredits as Long?)

            /**
             * Sets [Builder.totalClaimDependentAndOtherCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalClaimDependentAndOtherCredits] with a
             * well-typed [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun totalClaimDependentAndOtherCredits(
                totalClaimDependentAndOtherCredits: JsonField<Long>
            ) = apply {
                this.totalClaimDependentAndOtherCredits = totalClaimDependentAndOtherCredits
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

            fun build(): Data =
                Data(
                    amountForOtherDependents,
                    amountForQualifyingChildrenUnder17,
                    deductions,
                    extraWithholding,
                    filingStatus,
                    individualId,
                    otherIncome,
                    totalClaimDependentAndOtherCredits,
                    additionalProperties.toImmutable(),
                )
        }

        /** The individual's filing status for tax purposes. */
        class FilingStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val HEAD_OF_HOUSEHOLD = of("head_of_household")

                val MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE =
                    of("married_filing_jointly_or_qualifying_surviving_spouse")

                val SINGLE_OR_MARRIED_FILING_SEPARATELY = of("single_or_married_filing_separately")

                fun of(value: String) = FilingStatus(JsonField.of(value))
            }

            /** An enum containing [FilingStatus]'s known values. */
            enum class Known {
                HEAD_OF_HOUSEHOLD,
                MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE,
                SINGLE_OR_MARRIED_FILING_SEPARATELY,
            }

            /**
             * An enum containing [FilingStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FilingStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HEAD_OF_HOUSEHOLD,
                MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE,
                SINGLE_OR_MARRIED_FILING_SEPARATELY,
                /**
                 * An enum member indicating that [FilingStatus] was instantiated with an unknown
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
                    HEAD_OF_HOUSEHOLD -> Value.HEAD_OF_HOUSEHOLD
                    MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE ->
                        Value.MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE
                    SINGLE_OR_MARRIED_FILING_SEPARATELY -> Value.SINGLE_OR_MARRIED_FILING_SEPARATELY
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
                    HEAD_OF_HOUSEHOLD -> Known.HEAD_OF_HOUSEHOLD
                    MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE ->
                        Known.MARRIED_FILING_JOINTLY_OR_QUALIFYING_SURVIVING_SPOUSE
                    SINGLE_OR_MARRIED_FILING_SEPARATELY -> Known.SINGLE_OR_MARRIED_FILING_SEPARATELY
                    else -> throw FinchInvalidDataException("Unknown FilingStatus: $value")
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

                return /* spotless:off */ other is FilingStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && amountForOtherDependents == other.amountForOtherDependents && amountForQualifyingChildrenUnder17 == other.amountForQualifyingChildrenUnder17 && deductions == other.deductions && extraWithholding == other.extraWithholding && filingStatus == other.filingStatus && individualId == other.individualId && otherIncome == other.otherIncome && totalClaimDependentAndOtherCredits == other.totalClaimDependentAndOtherCredits && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amountForOtherDependents, amountForQualifyingChildrenUnder17, deductions, extraWithholding, filingStatus, individualId, otherIncome, totalClaimDependentAndOtherCredits, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{amountForOtherDependents=$amountForOtherDependents, amountForQualifyingChildrenUnder17=$amountForQualifyingChildrenUnder17, deductions=$deductions, extraWithholding=$extraWithholding, filingStatus=$filingStatus, individualId=$individualId, otherIncome=$otherIncome, totalClaimDependentAndOtherCredits=$totalClaimDependentAndOtherCredits, additionalProperties=$additionalProperties}"
    }

    /** Specifies the form type, indicating that this document is a 2020 W4 form. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val W4_2020 = of("w4_2020")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            W4_2020
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            W4_2020,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                W4_2020 -> Value.W4_2020
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
                W4_2020 -> Known.W4_2020
                else -> throw FinchInvalidDataException("Unknown Type: $value")
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

        return /* spotless:off */ other is W42020 && data == other.data && type == other.type && year == other.year && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, type, year, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "W42020{data=$data, type=$type, year=$year, additionalProperties=$additionalProperties}"
}
