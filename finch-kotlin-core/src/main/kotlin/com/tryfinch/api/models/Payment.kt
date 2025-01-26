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
class Payment
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_debit")
    @ExcludeMissing
    private val companyDebit: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("debit_date")
    @ExcludeMissing
    private val debitDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("employee_taxes")
    @ExcludeMissing
    private val employeeTaxes: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("employer_taxes")
    @ExcludeMissing
    private val employerTaxes: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("gross_pay")
    @ExcludeMissing
    private val grossPay: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("individual_ids")
    @ExcludeMissing
    private val individualIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("net_pay")
    @ExcludeMissing
    private val netPay: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("pay_date")
    @ExcludeMissing
    private val payDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("pay_frequencies")
    @ExcludeMissing
    private val payFrequencies: JsonField<List<PayFrequency>> = JsonMissing.of(),
    @JsonProperty("pay_group_ids")
    @ExcludeMissing
    private val payGroupIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("pay_period")
    @ExcludeMissing
    private val payPeriod: JsonField<PayPeriod> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The unique id for the payment. */
    fun id(): String? = id.getNullable("id")

    fun companyDebit(): Money? = companyDebit.getNullable("company_debit")

    fun debitDate(): String? = debitDate.getNullable("debit_date")

    fun employeeTaxes(): Money? = employeeTaxes.getNullable("employee_taxes")

    fun employerTaxes(): Money? = employerTaxes.getNullable("employer_taxes")

    fun grossPay(): Money? = grossPay.getNullable("gross_pay")

    /** Array of every individual on this payment. */
    fun individualIds(): List<String>? = individualIds.getNullable("individual_ids")

    fun netPay(): Money? = netPay.getNullable("net_pay")

    fun payDate(): String? = payDate.getNullable("pay_date")

    /** List of pay frequencies associated with this payment. */
    fun payFrequencies(): List<PayFrequency>? = payFrequencies.getNullable("pay_frequencies")

    /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
    fun payGroupIds(): List<String>? = payGroupIds.getNullable("pay_group_ids")

    /** The pay period object. */
    fun payPeriod(): PayPeriod? = payPeriod.getNullable("pay_period")

    /** The unique id for the payment. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("company_debit")
    @ExcludeMissing
    fun _companyDebit(): JsonField<Money> = companyDebit

    @JsonProperty("debit_date") @ExcludeMissing fun _debitDate(): JsonField<String> = debitDate

    @JsonProperty("employee_taxes")
    @ExcludeMissing
    fun _employeeTaxes(): JsonField<Money> = employeeTaxes

    @JsonProperty("employer_taxes")
    @ExcludeMissing
    fun _employerTaxes(): JsonField<Money> = employerTaxes

    @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay(): JsonField<Money> = grossPay

    /** Array of every individual on this payment. */
    @JsonProperty("individual_ids")
    @ExcludeMissing
    fun _individualIds(): JsonField<List<String>> = individualIds

    @JsonProperty("net_pay") @ExcludeMissing fun _netPay(): JsonField<Money> = netPay

    @JsonProperty("pay_date") @ExcludeMissing fun _payDate(): JsonField<String> = payDate

    /** List of pay frequencies associated with this payment. */
    @JsonProperty("pay_frequencies")
    @ExcludeMissing
    fun _payFrequencies(): JsonField<List<PayFrequency>> = payFrequencies

    /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
    @JsonProperty("pay_group_ids")
    @ExcludeMissing
    fun _payGroupIds(): JsonField<List<String>> = payGroupIds

    /** The pay period object. */
    @JsonProperty("pay_period") @ExcludeMissing fun _payPeriod(): JsonField<PayPeriod> = payPeriod

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
        payFrequencies()
        payGroupIds()
        payPeriod()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var companyDebit: JsonField<Money> = JsonMissing.of()
        private var debitDate: JsonField<String> = JsonMissing.of()
        private var employeeTaxes: JsonField<Money> = JsonMissing.of()
        private var employerTaxes: JsonField<Money> = JsonMissing.of()
        private var grossPay: JsonField<Money> = JsonMissing.of()
        private var individualIds: JsonField<MutableList<String>>? = null
        private var netPay: JsonField<Money> = JsonMissing.of()
        private var payDate: JsonField<String> = JsonMissing.of()
        private var payFrequencies: JsonField<MutableList<PayFrequency>>? = null
        private var payGroupIds: JsonField<MutableList<String>>? = null
        private var payPeriod: JsonField<PayPeriod> = JsonMissing.of()
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

        /** The unique id for the payment. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun companyDebit(companyDebit: Money?) = companyDebit(JsonField.ofNullable(companyDebit))

        fun companyDebit(companyDebit: JsonField<Money>) = apply {
            this.companyDebit = companyDebit
        }

        fun debitDate(debitDate: String?) = debitDate(JsonField.ofNullable(debitDate))

        fun debitDate(debitDate: JsonField<String>) = apply { this.debitDate = debitDate }

        fun employeeTaxes(employeeTaxes: Money?) =
            employeeTaxes(JsonField.ofNullable(employeeTaxes))

        fun employeeTaxes(employeeTaxes: JsonField<Money>) = apply {
            this.employeeTaxes = employeeTaxes
        }

        fun employerTaxes(employerTaxes: Money?) =
            employerTaxes(JsonField.ofNullable(employerTaxes))

        fun employerTaxes(employerTaxes: JsonField<Money>) = apply {
            this.employerTaxes = employerTaxes
        }

        fun grossPay(grossPay: Money?) = grossPay(JsonField.ofNullable(grossPay))

        fun grossPay(grossPay: JsonField<Money>) = apply { this.grossPay = grossPay }

        /** Array of every individual on this payment. */
        fun individualIds(individualIds: List<String>?) =
            individualIds(JsonField.ofNullable(individualIds))

        /** Array of every individual on this payment. */
        fun individualIds(individualIds: JsonField<List<String>>) = apply {
            this.individualIds = individualIds.map { it.toMutableList() }
        }

        /** Array of every individual on this payment. */
        fun addIndividualId(individualId: String) = apply {
            individualIds =
                (individualIds ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(individualId)
                }
        }

        fun netPay(netPay: Money?) = netPay(JsonField.ofNullable(netPay))

        fun netPay(netPay: JsonField<Money>) = apply { this.netPay = netPay }

        fun payDate(payDate: String?) = payDate(JsonField.ofNullable(payDate))

        fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

        /** List of pay frequencies associated with this payment. */
        fun payFrequencies(payFrequencies: List<PayFrequency>?) =
            payFrequencies(JsonField.ofNullable(payFrequencies))

        /** List of pay frequencies associated with this payment. */
        fun payFrequencies(payFrequencies: JsonField<List<PayFrequency>>) = apply {
            this.payFrequencies = payFrequencies.map { it.toMutableList() }
        }

        /** List of pay frequencies associated with this payment. */
        fun addPayFrequency(payFrequency: PayFrequency) = apply {
            payFrequencies =
                (payFrequencies ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(payFrequency)
                }
        }

        /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
        fun payGroupIds(payGroupIds: List<String>?) = payGroupIds(JsonField.ofNullable(payGroupIds))

        /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
        fun payGroupIds(payGroupIds: JsonField<List<String>>) = apply {
            this.payGroupIds = payGroupIds.map { it.toMutableList() }
        }

        /** Array of the Finch id (uuidv4) of every pay group associated with this payment. */
        fun addPayGroupId(payGroupId: String) = apply {
            payGroupIds =
                (payGroupIds ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(payGroupId)
                }
        }

        /** The pay period object. */
        fun payPeriod(payPeriod: PayPeriod?) = payPeriod(JsonField.ofNullable(payPeriod))

        /** The pay period object. */
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

        fun build(): Payment =
            Payment(
                id,
                companyDebit,
                debitDate,
                employeeTaxes,
                employerTaxes,
                grossPay,
                (individualIds ?: JsonMissing.of()).map { it.toImmutable() },
                netPay,
                payDate,
                (payFrequencies ?: JsonMissing.of()).map { it.toImmutable() },
                (payGroupIds ?: JsonMissing.of()).map { it.toImmutable() },
                payPeriod,
                additionalProperties.toImmutable(),
            )
    }

    class PayFrequency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ANNUALLY = of("annually")

            val SEMI_ANNUALLY = of("semi_annually")

            val QUARTERLY = of("quarterly")

            val MONTHLY = of("monthly")

            val SEMI_MONTHLY = of("semi_monthly")

            val BI_WEEKLY = of("bi_weekly")

            val WEEKLY = of("weekly")

            val DAILY = of("daily")

            val OTHER = of("other")

            fun of(value: String) = PayFrequency(JsonField.of(value))
        }

        enum class Known {
            ANNUALLY,
            SEMI_ANNUALLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            OTHER,
        }

        enum class Value {
            ANNUALLY,
            SEMI_ANNUALLY,
            QUARTERLY,
            MONTHLY,
            SEMI_MONTHLY,
            BI_WEEKLY,
            WEEKLY,
            DAILY,
            OTHER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ANNUALLY -> Value.ANNUALLY
                SEMI_ANNUALLY -> Value.SEMI_ANNUALLY
                QUARTERLY -> Value.QUARTERLY
                MONTHLY -> Value.MONTHLY
                SEMI_MONTHLY -> Value.SEMI_MONTHLY
                BI_WEEKLY -> Value.BI_WEEKLY
                WEEKLY -> Value.WEEKLY
                DAILY -> Value.DAILY
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ANNUALLY -> Known.ANNUALLY
                SEMI_ANNUALLY -> Known.SEMI_ANNUALLY
                QUARTERLY -> Known.QUARTERLY
                MONTHLY -> Known.MONTHLY
                SEMI_MONTHLY -> Known.SEMI_MONTHLY
                BI_WEEKLY -> Known.BI_WEEKLY
                WEEKLY -> Known.WEEKLY
                DAILY -> Known.DAILY
                OTHER -> Known.OTHER
                else -> throw FinchInvalidDataException("Unknown PayFrequency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
    @NoAutoDetect
    class PayPeriod
    @JsonCreator
    private constructor(
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun endDate(): String? = endDate.getNullable("end_date")

        fun startDate(): String? = startDate.getNullable("start_date")

        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<String> = endDate

        @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<String> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PayPeriod = apply {
            if (validated) {
                return@apply
            }

            endDate()
            startDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var endDate: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(payPeriod: PayPeriod) = apply {
                endDate = payPeriod.endDate
                startDate = payPeriod.startDate
                additionalProperties = payPeriod.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: String?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

            fun startDate(startDate: String?) = startDate(JsonField.ofNullable(startDate))

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

            fun build(): PayPeriod =
                PayPeriod(
                    endDate,
                    startDate,
                    additionalProperties.toImmutable(),
                )
        }

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
