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
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects

class SandboxPaymentCreateParams
constructor(
    private val endDate: String?,
    private val payStatements: List<PayStatement>?,
    private val startDate: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun endDate(): String? = endDate

    fun payStatements(): List<PayStatement>? = payStatements

    fun startDate(): String? = startDate

    internal fun getBody(): SandboxPaymentCreateBody {
        return SandboxPaymentCreateBody(
            endDate,
            payStatements,
            startDate,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /**
     * Fields to configure the payment. Takes all fields from the `/payment` endpoint. All fields
     * are optional.
     */
    @JsonDeserialize(builder = SandboxPaymentCreateBody.Builder::class)
    @NoAutoDetect
    class SandboxPaymentCreateBody
    internal constructor(
        private val endDate: String?,
        private val payStatements: List<PayStatement>?,
        private val startDate: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("end_date") fun endDate(): String? = endDate

        @JsonProperty("pay_statements") fun payStatements(): List<PayStatement>? = payStatements

        @JsonProperty("start_date") fun startDate(): String? = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SandboxPaymentCreateBody &&
                this.endDate == other.endDate &&
                this.payStatements == other.payStatements &&
                this.startDate == other.startDate &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        endDate,
                        payStatements,
                        startDate,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SandboxPaymentCreateBody{endDate=$endDate, payStatements=$payStatements, startDate=$startDate, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var endDate: String? = null
            private var payStatements: List<PayStatement>? = null
            private var startDate: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sandboxPaymentCreateBody: SandboxPaymentCreateBody) = apply {
                this.endDate = sandboxPaymentCreateBody.endDate
                this.payStatements = sandboxPaymentCreateBody.payStatements
                this.startDate = sandboxPaymentCreateBody.startDate
                additionalProperties(sandboxPaymentCreateBody.additionalProperties)
            }

            @JsonProperty("end_date")
            fun endDate(endDate: String) = apply { this.endDate = endDate }

            @JsonProperty("pay_statements")
            fun payStatements(payStatements: List<PayStatement>) = apply {
                this.payStatements = payStatements
            }

            @JsonProperty("start_date")
            fun startDate(startDate: String) = apply { this.startDate = startDate }

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

            fun build(): SandboxPaymentCreateBody =
                SandboxPaymentCreateBody(
                    endDate,
                    payStatements?.toUnmodifiable(),
                    startDate,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxPaymentCreateParams &&
            this.endDate == other.endDate &&
            this.payStatements == other.payStatements &&
            this.startDate == other.startDate &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            endDate,
            payStatements,
            startDate,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SandboxPaymentCreateParams{endDate=$endDate, payStatements=$payStatements, startDate=$startDate, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var endDate: String? = null
        private var payStatements: MutableList<PayStatement> = mutableListOf()
        private var startDate: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(sandboxPaymentCreateParams: SandboxPaymentCreateParams) = apply {
            this.endDate = sandboxPaymentCreateParams.endDate
            this.payStatements(sandboxPaymentCreateParams.payStatements ?: listOf())
            this.startDate = sandboxPaymentCreateParams.startDate
            additionalQueryParams(sandboxPaymentCreateParams.additionalQueryParams)
            additionalHeaders(sandboxPaymentCreateParams.additionalHeaders)
            additionalBodyProperties(sandboxPaymentCreateParams.additionalBodyProperties)
        }

        fun endDate(endDate: String) = apply { this.endDate = endDate }

        fun payStatements(payStatements: List<PayStatement>) = apply {
            this.payStatements.clear()
            this.payStatements.addAll(payStatements)
        }

        fun addPayStatement(payStatement: PayStatement) = apply {
            this.payStatements.add(payStatement)
        }

        fun startDate(startDate: String) = apply { this.startDate = startDate }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SandboxPaymentCreateParams =
            SandboxPaymentCreateParams(
                endDate,
                if (payStatements.size == 0) null else payStatements.toUnmodifiable(),
                startDate,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = PayStatement.Builder::class)
    @NoAutoDetect
    class PayStatement
    private constructor(
        private val individualId: String?,
        private val type: Type?,
        private val paymentMethod: PaymentMethod?,
        private val totalHours: Double?,
        private val grossPay: Money?,
        private val netPay: Money?,
        private val earnings: List<Earning?>?,
        private val taxes: List<Tax?>?,
        private val employeeDeductions: List<EmployeeDeduction?>?,
        private val employerContributions: List<EmployerContribution?>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A stable Finch `id` (UUID v4) for an individual in the company */
        @JsonProperty("individual_id") fun individualId(): String? = individualId

        /** The type of the payment associated with the pay statement. */
        @JsonProperty("type") fun type(): Type? = type

        /** The payment method. */
        @JsonProperty("payment_method") fun paymentMethod(): PaymentMethod? = paymentMethod

        /** The number of hours worked for this pay period */
        @JsonProperty("total_hours") fun totalHours(): Double? = totalHours

        @JsonProperty("gross_pay") fun grossPay(): Money? = grossPay

        @JsonProperty("net_pay") fun netPay(): Money? = netPay

        /** The array of earnings objects associated with this pay statement */
        @JsonProperty("earnings") fun earnings(): List<Earning?>? = earnings

        /** The array of taxes objects associated with this pay statement. */
        @JsonProperty("taxes") fun taxes(): List<Tax?>? = taxes

        /** The array of deductions objects associated with this pay statement. */
        @JsonProperty("employee_deductions")
        fun employeeDeductions(): List<EmployeeDeduction?>? = employeeDeductions

        @JsonProperty("employer_contributions")
        fun employerContributions(): List<EmployerContribution?>? = employerContributions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PayStatement &&
                this.individualId == other.individualId &&
                this.type == other.type &&
                this.paymentMethod == other.paymentMethod &&
                this.totalHours == other.totalHours &&
                this.grossPay == other.grossPay &&
                this.netPay == other.netPay &&
                this.earnings == other.earnings &&
                this.taxes == other.taxes &&
                this.employeeDeductions == other.employeeDeductions &&
                this.employerContributions == other.employerContributions &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        individualId,
                        type,
                        paymentMethod,
                        totalHours,
                        grossPay,
                        netPay,
                        earnings,
                        taxes,
                        employeeDeductions,
                        employerContributions,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PayStatement{individualId=$individualId, type=$type, paymentMethod=$paymentMethod, totalHours=$totalHours, grossPay=$grossPay, netPay=$netPay, earnings=$earnings, taxes=$taxes, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var individualId: String? = null
            private var type: Type? = null
            private var paymentMethod: PaymentMethod? = null
            private var totalHours: Double? = null
            private var grossPay: Money? = null
            private var netPay: Money? = null
            private var earnings: List<Earning?>? = null
            private var taxes: List<Tax?>? = null
            private var employeeDeductions: List<EmployeeDeduction?>? = null
            private var employerContributions: List<EmployerContribution?>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(payStatement: PayStatement) = apply {
                this.individualId = payStatement.individualId
                this.type = payStatement.type
                this.paymentMethod = payStatement.paymentMethod
                this.totalHours = payStatement.totalHours
                this.grossPay = payStatement.grossPay
                this.netPay = payStatement.netPay
                this.earnings = payStatement.earnings
                this.taxes = payStatement.taxes
                this.employeeDeductions = payStatement.employeeDeductions
                this.employerContributions = payStatement.employerContributions
                additionalProperties(payStatement.additionalProperties)
            }

            /** A stable Finch `id` (UUID v4) for an individual in the company */
            @JsonProperty("individual_id")
            fun individualId(individualId: String) = apply { this.individualId = individualId }

            /** The type of the payment associated with the pay statement. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** The payment method. */
            @JsonProperty("payment_method")
            fun paymentMethod(paymentMethod: PaymentMethod) = apply {
                this.paymentMethod = paymentMethod
            }

            /** The number of hours worked for this pay period */
            @JsonProperty("total_hours")
            fun totalHours(totalHours: Double) = apply { this.totalHours = totalHours }

            @JsonProperty("gross_pay")
            fun grossPay(grossPay: Money) = apply { this.grossPay = grossPay }

            @JsonProperty("net_pay") fun netPay(netPay: Money) = apply { this.netPay = netPay }

            /** The array of earnings objects associated with this pay statement */
            @JsonProperty("earnings")
            fun earnings(earnings: List<Earning?>) = apply { this.earnings = earnings }

            /** The array of taxes objects associated with this pay statement. */
            @JsonProperty("taxes") fun taxes(taxes: List<Tax?>) = apply { this.taxes = taxes }

            /** The array of deductions objects associated with this pay statement. */
            @JsonProperty("employee_deductions")
            fun employeeDeductions(employeeDeductions: List<EmployeeDeduction?>) = apply {
                this.employeeDeductions = employeeDeductions
            }

            @JsonProperty("employer_contributions")
            fun employerContributions(employerContributions: List<EmployerContribution?>) = apply {
                this.employerContributions = employerContributions
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

            fun build(): PayStatement =
                PayStatement(
                    individualId,
                    type,
                    paymentMethod,
                    totalHours,
                    grossPay,
                    netPay,
                    earnings?.toUnmodifiable(),
                    taxes?.toUnmodifiable(),
                    employeeDeductions?.toUnmodifiable(),
                    employerContributions?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Earning.Builder::class)
        @NoAutoDetect
        class Earning
        private constructor(
            private val type: Type?,
            private val name: String?,
            private val amount: Long?,
            private val currency: String?,
            private val hours: Double?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The type of earning. */
            @JsonProperty("type") fun type(): Type? = type

            /** The exact name of the deduction from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** The earnings amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The earnings currency code. */
            @JsonProperty("currency") fun currency(): String? = currency

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             */
            @JsonProperty("hours") fun hours(): Double? = hours

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Earning &&
                    this.type == other.type &&
                    this.name == other.name &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.hours == other.hours &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            name,
                            amount,
                            currency,
                            hours,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Earning{type=$type, name=$name, amount=$amount, currency=$currency, hours=$hours, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: Type? = null
                private var name: String? = null
                private var amount: Long? = null
                private var currency: String? = null
                private var hours: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(earning: Earning) = apply {
                    this.type = earning.type
                    this.name = earning.name
                    this.amount = earning.amount
                    this.currency = earning.currency
                    this.hours = earning.hours
                    additionalProperties(earning.additionalProperties)
                }

                /** The type of earning. */
                @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

                /** The exact name of the deduction from the pay statement. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The earnings amount in cents. */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /** The earnings currency code. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                /**
                 * The number of hours associated with this earning. (For salaried employees, this
                 * could be hours per pay period, `0` or `null`, depending on the provider).
                 */
                @JsonProperty("hours") fun hours(hours: Double) = apply { this.hours = hours }

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

                fun build(): Earning =
                    Earning(
                        type,
                        name,
                        amount,
                        currency,
                        hours,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val SALARY = Type(JsonField.of("salary"))

                    val WAGE = Type(JsonField.of("wage"))

                    val REIMBURSEMENT = Type(JsonField.of("reimbursement"))

                    val OVERTIME = Type(JsonField.of("overtime"))

                    val SEVERANCE = Type(JsonField.of("severance"))

                    val DOUBLE_OVERTIME = Type(JsonField.of("double_overtime"))

                    val PTO = Type(JsonField.of("pto"))

                    val SICK = Type(JsonField.of("sick"))

                    val BONUS = Type(JsonField.of("bonus"))

                    val COMMISSION = Type(JsonField.of("commission"))

                    val TIPS = Type(JsonField.of("tips"))

                    val _1099 = Type(JsonField.of("1099"))

                    val OTHER = Type(JsonField.of("other"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    SALARY,
                    WAGE,
                    REIMBURSEMENT,
                    OVERTIME,
                    SEVERANCE,
                    DOUBLE_OVERTIME,
                    PTO,
                    SICK,
                    BONUS,
                    COMMISSION,
                    TIPS,
                    _1099,
                    OTHER,
                }

                enum class Value {
                    SALARY,
                    WAGE,
                    REIMBURSEMENT,
                    OVERTIME,
                    SEVERANCE,
                    DOUBLE_OVERTIME,
                    PTO,
                    SICK,
                    BONUS,
                    COMMISSION,
                    TIPS,
                    _1099,
                    OTHER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SALARY -> Value.SALARY
                        WAGE -> Value.WAGE
                        REIMBURSEMENT -> Value.REIMBURSEMENT
                        OVERTIME -> Value.OVERTIME
                        SEVERANCE -> Value.SEVERANCE
                        DOUBLE_OVERTIME -> Value.DOUBLE_OVERTIME
                        PTO -> Value.PTO
                        SICK -> Value.SICK
                        BONUS -> Value.BONUS
                        COMMISSION -> Value.COMMISSION
                        TIPS -> Value.TIPS
                        _1099 -> Value._1099
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SALARY -> Known.SALARY
                        WAGE -> Known.WAGE
                        REIMBURSEMENT -> Known.REIMBURSEMENT
                        OVERTIME -> Known.OVERTIME
                        SEVERANCE -> Known.SEVERANCE
                        DOUBLE_OVERTIME -> Known.DOUBLE_OVERTIME
                        PTO -> Known.PTO
                        SICK -> Known.SICK
                        BONUS -> Known.BONUS
                        COMMISSION -> Known.COMMISSION
                        TIPS -> Known.TIPS
                        _1099 -> Known._1099
                        OTHER -> Known.OTHER
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = EmployeeDeduction.Builder::class)
        @NoAutoDetect
        class EmployeeDeduction
        private constructor(
            private val name: String?,
            private val amount: Long?,
            private val currency: String?,
            private val preTax: Boolean?,
            private val type: BenefitType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The deduction name from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** The deduction amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The deduction currency. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** Boolean indicating if the deduction is pre-tax. */
            @JsonProperty("pre_tax") fun preTax(): Boolean? = preTax

            /** Type of benefit. */
            @JsonProperty("type") fun type(): BenefitType? = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EmployeeDeduction &&
                    this.name == other.name &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.preTax == other.preTax &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            amount,
                            currency,
                            preTax,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "EmployeeDeduction{name=$name, amount=$amount, currency=$currency, preTax=$preTax, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var amount: Long? = null
                private var currency: String? = null
                private var preTax: Boolean? = null
                private var type: BenefitType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(employeeDeduction: EmployeeDeduction) = apply {
                    this.name = employeeDeduction.name
                    this.amount = employeeDeduction.amount
                    this.currency = employeeDeduction.currency
                    this.preTax = employeeDeduction.preTax
                    this.type = employeeDeduction.type
                    additionalProperties(employeeDeduction.additionalProperties)
                }

                /** The deduction name from the pay statement. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The deduction amount in cents. */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /** The deduction currency. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                /** Boolean indicating if the deduction is pre-tax. */
                @JsonProperty("pre_tax")
                fun preTax(preTax: Boolean) = apply { this.preTax = preTax }

                /** Type of benefit. */
                @JsonProperty("type") fun type(type: BenefitType) = apply { this.type = type }

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

                fun build(): EmployeeDeduction =
                    EmployeeDeduction(
                        name,
                        amount,
                        currency,
                        preTax,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = EmployerContribution.Builder::class)
        @NoAutoDetect
        class EmployerContribution
        private constructor(
            private val name: String?,
            private val amount: Long?,
            private val currency: String?,
            private val type: BenefitType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The contribution name from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** The contribution amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The contribution currency. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** Type of benefit. */
            @JsonProperty("type") fun type(): BenefitType? = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EmployerContribution &&
                    this.name == other.name &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            amount,
                            currency,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "EmployerContribution{name=$name, amount=$amount, currency=$currency, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var amount: Long? = null
                private var currency: String? = null
                private var type: BenefitType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(employerContribution: EmployerContribution) = apply {
                    this.name = employerContribution.name
                    this.amount = employerContribution.amount
                    this.currency = employerContribution.currency
                    this.type = employerContribution.type
                    additionalProperties(employerContribution.additionalProperties)
                }

                /** The contribution name from the pay statement. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The contribution amount in cents. */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /** The contribution currency. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                /** Type of benefit. */
                @JsonProperty("type") fun type(type: BenefitType) = apply { this.type = type }

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

                fun build(): EmployerContribution =
                    EmployerContribution(
                        name,
                        amount,
                        currency,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class PaymentMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentMethod && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val CHECK = PaymentMethod(JsonField.of("check"))

                val DIRECT_DEPOSIT = PaymentMethod(JsonField.of("direct_deposit"))

                fun of(value: String) = PaymentMethod(JsonField.of(value))
            }

            enum class Known {
                CHECK,
                DIRECT_DEPOSIT,
            }

            enum class Value {
                CHECK,
                DIRECT_DEPOSIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHECK -> Value.CHECK
                    DIRECT_DEPOSIT -> Value.DIRECT_DEPOSIT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECK -> Known.CHECK
                    DIRECT_DEPOSIT -> Known.DIRECT_DEPOSIT
                    else -> throw FinchInvalidDataException("Unknown PaymentMethod: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = Tax.Builder::class)
        @NoAutoDetect
        class Tax
        private constructor(
            private val type: Type?,
            private val name: String?,
            private val employer: Boolean?,
            private val amount: Long?,
            private val currency: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The type of taxes. */
            @JsonProperty("type") fun type(): Type? = type

            /** The exact name of tax from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** `true` if the amount is paid by the employers. */
            @JsonProperty("employer") fun employer(): Boolean? = employer

            /** The tax amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The currency code. */
            @JsonProperty("currency") fun currency(): String? = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tax &&
                    this.type == other.type &&
                    this.name == other.name &&
                    this.employer == other.employer &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            name,
                            employer,
                            amount,
                            currency,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Tax{type=$type, name=$name, employer=$employer, amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: Type? = null
                private var name: String? = null
                private var employer: Boolean? = null
                private var amount: Long? = null
                private var currency: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tax: Tax) = apply {
                    this.type = tax.type
                    this.name = tax.name
                    this.employer = tax.employer
                    this.amount = tax.amount
                    this.currency = tax.currency
                    additionalProperties(tax.additionalProperties)
                }

                /** The type of taxes. */
                @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

                /** The exact name of tax from the pay statement. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** `true` if the amount is paid by the employers. */
                @JsonProperty("employer")
                fun employer(employer: Boolean) = apply { this.employer = employer }

                /** The tax amount in cents. */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /** The currency code. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

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

                fun build(): Tax =
                    Tax(
                        type,
                        name,
                        employer,
                        amount,
                        currency,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val STATE = Type(JsonField.of("state"))

                    val FEDERAL = Type(JsonField.of("federal"))

                    val LOCAL = Type(JsonField.of("local"))

                    val FICA = Type(JsonField.of("fica"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    STATE,
                    FEDERAL,
                    LOCAL,
                    FICA,
                }

                enum class Value {
                    STATE,
                    FEDERAL,
                    LOCAL,
                    FICA,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        STATE -> Value.STATE
                        FEDERAL -> Value.FEDERAL
                        LOCAL -> Value.LOCAL
                        FICA -> Value.FICA
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        STATE -> Known.STATE
                        FEDERAL -> Known.FEDERAL
                        LOCAL -> Known.LOCAL
                        FICA -> Known.FICA
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val REGULAR_PAYROLL = Type(JsonField.of("regular_payroll"))

                val OFF_CYCLE_PAYROLL = Type(JsonField.of("off_cycle_payroll"))

                val ONE_TIME_PAYMENT = Type(JsonField.of("one_time_payment"))

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                REGULAR_PAYROLL,
                OFF_CYCLE_PAYROLL,
                ONE_TIME_PAYMENT,
            }

            enum class Value {
                REGULAR_PAYROLL,
                OFF_CYCLE_PAYROLL,
                ONE_TIME_PAYMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    REGULAR_PAYROLL -> Value.REGULAR_PAYROLL
                    OFF_CYCLE_PAYROLL -> Value.OFF_CYCLE_PAYROLL
                    ONE_TIME_PAYMENT -> Value.ONE_TIME_PAYMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    REGULAR_PAYROLL -> Known.REGULAR_PAYROLL
                    OFF_CYCLE_PAYROLL -> Known.OFF_CYCLE_PAYROLL
                    ONE_TIME_PAYMENT -> Known.ONE_TIME_PAYMENT
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
