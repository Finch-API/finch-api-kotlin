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

/**
 * The employee's income as reported by the provider. This may not always be annualized income, but
 * may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
 * provider returns.
 */
@JsonDeserialize(builder = Income.Builder::class)
@NoAutoDetect
class Income
private constructor(
    private val unit: JsonField<Unit>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val effectiveDate: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
     * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
     */
    fun unit(): Unit? = unit.getNullable("unit")

    /** The income amount in cents. */
    fun amount(): Long? = amount.getNullable("amount")

    /** The currency code. */
    fun currency(): String? = currency.getNullable("currency")

    /** The date the income amount went into effect. */
    fun effectiveDate(): String? = effectiveDate.getNullable("effective_date")

    /**
     * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
     * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit() = unit

    /** The income amount in cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The currency code. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The date the income amount went into effect. */
    @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Income = apply {
        if (!validated) {
            unit()
            amount()
            currency()
            effectiveDate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Income &&
            this.unit == other.unit &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.effectiveDate == other.effectiveDate &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    unit,
                    amount,
                    currency,
                    effectiveDate,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Income{unit=$unit, amount=$amount, currency=$currency, effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var unit: JsonField<Unit> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var effectiveDate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(income: Income) = apply {
            this.unit = income.unit
            this.amount = income.amount
            this.currency = income.currency
            this.effectiveDate = income.effectiveDate
            additionalProperties(income.additionalProperties)
        }

        /**
         * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
         * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
         */
        fun unit(unit: Unit) = unit(JsonField.of(unit))

        /**
         * The income unit of payment. Options: `yearly`, `quarterly`, `monthly`, `semi_monthly`,
         * `bi_weekly`, `weekly`, `daily`, `hourly`, and `fixed`.
         */
        @JsonProperty("unit")
        @ExcludeMissing
        fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

        /** The income amount in cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The income amount in cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The currency code. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency code. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The date the income amount went into effect. */
        fun effectiveDate(effectiveDate: String) = effectiveDate(JsonField.of(effectiveDate))

        /** The date the income amount went into effect. */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun effectiveDate(effectiveDate: JsonField<String>) = apply {
            this.effectiveDate = effectiveDate
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

        fun build(): Income =
            Income(
                unit,
                amount,
                currency,
                effectiveDate,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Unit
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Unit && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val YEARLY = Unit(JsonField.of("yearly"))

            val QUARTERLY = Unit(JsonField.of("quarterly"))

            val MONTHLY = Unit(JsonField.of("monthly"))

            val SEMI_MONTHLY = Unit(JsonField.of("semi_monthly"))

            val BI_WEEKLY = Unit(JsonField.of("bi_weekly"))

            val WEEKLY = Unit(JsonField.of("weekly"))

            val DAILY = Unit(JsonField.of("daily"))

            val HOURLY = Unit(JsonField.of("hourly"))

            val FIXED = Unit(JsonField.of("fixed"))

            fun of(value: String) = Unit(JsonField.of(value))
        }

        enum class Known {
            YEARLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            HOURLY,
            FIXED,
        }

        enum class Value {
            YEARLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            HOURLY,
            FIXED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                YEARLY -> Value.YEARLY
                QUARTERLY -> Value.QUARTERLY
                MONTHLY -> Value.MONTHLY
                SEMI_MONTHLY -> Value.SEMI_MONTHLY
                BI_WEEKLY -> Value.BI_WEEKLY
                WEEKLY -> Value.WEEKLY
                DAILY -> Value.DAILY
                HOURLY -> Value.HOURLY
                FIXED -> Value.FIXED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                YEARLY -> Known.YEARLY
                QUARTERLY -> Known.QUARTERLY
                MONTHLY -> Known.MONTHLY
                SEMI_MONTHLY -> Known.SEMI_MONTHLY
                BI_WEEKLY -> Known.BI_WEEKLY
                WEEKLY -> Known.WEEKLY
                DAILY -> Known.DAILY
                HOURLY -> Known.HOURLY
                FIXED -> Known.FIXED
                else -> throw FinchInvalidDataException("Unknown Unit: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
