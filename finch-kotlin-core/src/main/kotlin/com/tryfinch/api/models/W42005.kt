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
 * A 2005 version of the W-4 tax form containing information on an individual's filing status,
 * dependents, and withholding details.
 */
@NoAutoDetect
class W42005
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("year") @ExcludeMissing private val year: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Detailed information specific to the 2005 W4 form. */
    fun data(): Data? = data.getNullable("data")

    /** Specifies the form type, indicating that this document is a 2005 W4 form. */
    fun type(): Type? = type.getNullable("type")

    /** The tax year this W4 document applies to. */
    fun year(): Double? = year.getNullable("year")

    /** Detailed information specific to the 2005 W4 form. */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /** Specifies the form type, indicating that this document is a 2005 W4 form. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** The tax year this W4 document applies to. */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Double> = year

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): W42005 = apply {
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

        fun builder() = Builder()
    }

    /** A builder for [W42005]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var year: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(w42005: W42005) = apply {
            data = w42005.data
            type = w42005.type
            year = w42005.year
            additionalProperties = w42005.additionalProperties.toMutableMap()
        }

        /** Detailed information specific to the 2005 W4 form. */
        fun data(data: Data) = data(JsonField.of(data))

        /** Detailed information specific to the 2005 W4 form. */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Specifies the form type, indicating that this document is a 2005 W4 form. */
        fun type(type: Type) = type(JsonField.of(type))

        /** Specifies the form type, indicating that this document is a 2005 W4 form. */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The tax year this W4 document applies to. */
        fun year(year: Double?) = year(JsonField.ofNullable(year))

        /** The tax year this W4 document applies to. */
        fun year(year: Double) = year(year as Double?)

        /** The tax year this W4 document applies to. */
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

        fun build(): W42005 = W42005(data, type, year, additionalProperties.toImmutable())
    }

    /** Detailed information specific to the 2005 W4 form. */
    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("additional_withholding")
        @ExcludeMissing
        private val additionalWithholding: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("exemption")
        @ExcludeMissing
        private val exemption: JsonField<Exemption> = JsonMissing.of(),
        @JsonProperty("filing_status")
        @ExcludeMissing
        private val filingStatus: JsonField<FilingStatus> = JsonMissing.of(),
        @JsonProperty("individual_id")
        @ExcludeMissing
        private val individualId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_number_of_allowances")
        @ExcludeMissing
        private val totalNumberOfAllowances: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Additional withholding amount (in cents). */
        fun additionalWithholding(): Long? =
            additionalWithholding.getNullable("additional_withholding")

        /** Indicates exemption status from federal tax withholding. */
        fun exemption(): Exemption? = exemption.getNullable("exemption")

        /** The individual's filing status for tax purposes. */
        fun filingStatus(): FilingStatus? = filingStatus.getNullable("filing_status")

        /** The unique identifier for the individual associated with this 2005 W4 form. */
        fun individualId(): String? = individualId.getNullable("individual_id")

        /** Total number of allowances claimed (in cents). */
        fun totalNumberOfAllowances(): Long? =
            totalNumberOfAllowances.getNullable("total_number_of_allowances")

        /** Additional withholding amount (in cents). */
        @JsonProperty("additional_withholding")
        @ExcludeMissing
        fun _additionalWithholding(): JsonField<Long> = additionalWithholding

        /** Indicates exemption status from federal tax withholding. */
        @JsonProperty("exemption")
        @ExcludeMissing
        fun _exemption(): JsonField<Exemption> = exemption

        /** The individual's filing status for tax purposes. */
        @JsonProperty("filing_status")
        @ExcludeMissing
        fun _filingStatus(): JsonField<FilingStatus> = filingStatus

        /** The unique identifier for the individual associated with this 2005 W4 form. */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        /** Total number of allowances claimed (in cents). */
        @JsonProperty("total_number_of_allowances")
        @ExcludeMissing
        fun _totalNumberOfAllowances(): JsonField<Long> = totalNumberOfAllowances

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            additionalWithholding()
            exemption()
            filingStatus()
            individualId()
            totalNumberOfAllowances()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var additionalWithholding: JsonField<Long> = JsonMissing.of()
            private var exemption: JsonField<Exemption> = JsonMissing.of()
            private var filingStatus: JsonField<FilingStatus> = JsonMissing.of()
            private var individualId: JsonField<String> = JsonMissing.of()
            private var totalNumberOfAllowances: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                additionalWithholding = data.additionalWithholding
                exemption = data.exemption
                filingStatus = data.filingStatus
                individualId = data.individualId
                totalNumberOfAllowances = data.totalNumberOfAllowances
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Additional withholding amount (in cents). */
            fun additionalWithholding(additionalWithholding: Long?) =
                additionalWithholding(JsonField.ofNullable(additionalWithholding))

            /** Additional withholding amount (in cents). */
            fun additionalWithholding(additionalWithholding: Long) =
                additionalWithholding(additionalWithholding as Long?)

            /** Additional withholding amount (in cents). */
            fun additionalWithholding(additionalWithholding: JsonField<Long>) = apply {
                this.additionalWithholding = additionalWithholding
            }

            /** Indicates exemption status from federal tax withholding. */
            fun exemption(exemption: Exemption) = exemption(JsonField.of(exemption))

            /** Indicates exemption status from federal tax withholding. */
            fun exemption(exemption: JsonField<Exemption>) = apply { this.exemption = exemption }

            /** The individual's filing status for tax purposes. */
            fun filingStatus(filingStatus: FilingStatus) = filingStatus(JsonField.of(filingStatus))

            /** The individual's filing status for tax purposes. */
            fun filingStatus(filingStatus: JsonField<FilingStatus>) = apply {
                this.filingStatus = filingStatus
            }

            /** The unique identifier for the individual associated with this 2005 W4 form. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /** The unique identifier for the individual associated with this 2005 W4 form. */
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
            }

            /** Total number of allowances claimed (in cents). */
            fun totalNumberOfAllowances(totalNumberOfAllowances: Long?) =
                totalNumberOfAllowances(JsonField.ofNullable(totalNumberOfAllowances))

            /** Total number of allowances claimed (in cents). */
            fun totalNumberOfAllowances(totalNumberOfAllowances: Long) =
                totalNumberOfAllowances(totalNumberOfAllowances as Long?)

            /** Total number of allowances claimed (in cents). */
            fun totalNumberOfAllowances(totalNumberOfAllowances: JsonField<Long>) = apply {
                this.totalNumberOfAllowances = totalNumberOfAllowances
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
                    additionalWithholding,
                    exemption,
                    filingStatus,
                    individualId,
                    totalNumberOfAllowances,
                    additionalProperties.toImmutable(),
                )
        }

        /** Indicates exemption status from federal tax withholding. */
        class Exemption @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val EXEMPT = of("exempt")

                val NON_EXEMPT = of("non_exempt")

                fun of(value: String) = Exemption(JsonField.of(value))
            }

            /** An enum containing [Exemption]'s known values. */
            enum class Known {
                EXEMPT,
                NON_EXEMPT,
            }

            /**
             * An enum containing [Exemption]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Exemption] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EXEMPT,
                NON_EXEMPT,
                /**
                 * An enum member indicating that [Exemption] was instantiated with an unknown
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
                    EXEMPT -> Value.EXEMPT
                    NON_EXEMPT -> Value.NON_EXEMPT
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
                    EXEMPT -> Known.EXEMPT
                    NON_EXEMPT -> Known.NON_EXEMPT
                    else -> throw FinchInvalidDataException("Unknown Exemption: $value")
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

                return /* spotless:off */ other is Exemption && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

                val MARRIED = of("married")

                val MARRIED_BUT_WITHHOLD_AT_HIGHER_SINGLE_RATE =
                    of("married_but_withhold_at_higher_single_rate")

                val SINGLE = of("single")

                fun of(value: String) = FilingStatus(JsonField.of(value))
            }

            /** An enum containing [FilingStatus]'s known values. */
            enum class Known {
                MARRIED,
                MARRIED_BUT_WITHHOLD_AT_HIGHER_SINGLE_RATE,
                SINGLE,
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
                MARRIED,
                MARRIED_BUT_WITHHOLD_AT_HIGHER_SINGLE_RATE,
                SINGLE,
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
                    MARRIED -> Value.MARRIED
                    MARRIED_BUT_WITHHOLD_AT_HIGHER_SINGLE_RATE ->
                        Value.MARRIED_BUT_WITHHOLD_AT_HIGHER_SINGLE_RATE
                    SINGLE -> Value.SINGLE
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
                    MARRIED -> Known.MARRIED
                    MARRIED_BUT_WITHHOLD_AT_HIGHER_SINGLE_RATE ->
                        Known.MARRIED_BUT_WITHHOLD_AT_HIGHER_SINGLE_RATE
                    SINGLE -> Known.SINGLE
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

            return /* spotless:off */ other is Data && additionalWithholding == other.additionalWithholding && exemption == other.exemption && filingStatus == other.filingStatus && individualId == other.individualId && totalNumberOfAllowances == other.totalNumberOfAllowances && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalWithholding, exemption, filingStatus, individualId, totalNumberOfAllowances, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{additionalWithholding=$additionalWithholding, exemption=$exemption, filingStatus=$filingStatus, individualId=$individualId, totalNumberOfAllowances=$totalNumberOfAllowances, additionalProperties=$additionalProperties}"
    }

    /** Specifies the form type, indicating that this document is a 2005 W4 form. */
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

            val W4_2005 = of("w4_2005")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            W4_2005
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
            W4_2005,
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
                W4_2005 -> Value.W4_2005
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
                W4_2005 -> Known.W4_2005
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

        return /* spotless:off */ other is W42005 && data == other.data && type == other.type && year == other.year && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, type, year, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "W42005{data=$data, type=$type, year=$year, additionalProperties=$additionalProperties}"
}
