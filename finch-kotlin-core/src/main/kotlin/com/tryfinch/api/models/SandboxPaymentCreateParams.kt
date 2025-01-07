// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

/** Add a new sandbox payment */
class SandboxPaymentCreateParams
constructor(
    private val body: SandboxPaymentCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun endDate(): String? = body.endDate()

    fun payStatements(): List<PayStatement>? = body.payStatements()

    fun startDate(): String? = body.startDate()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): SandboxPaymentCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    /**
     * Fields to configure the payment. Takes all fields from the `/payment` endpoint. All fields
     * are optional.
     */
    @NoAutoDetect
    class SandboxPaymentCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("end_date") private val endDate: String?,
        @JsonProperty("pay_statements") private val payStatements: List<PayStatement>?,
        @JsonProperty("start_date") private val startDate: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("end_date") fun endDate(): String? = endDate

        @JsonProperty("pay_statements") fun payStatements(): List<PayStatement>? = payStatements

        @JsonProperty("start_date") fun startDate(): String? = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var endDate: String? = null
            private var payStatements: MutableList<PayStatement>? = null
            private var startDate: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sandboxPaymentCreateBody: SandboxPaymentCreateBody) = apply {
                endDate = sandboxPaymentCreateBody.endDate
                payStatements = sandboxPaymentCreateBody.payStatements?.toMutableList()
                startDate = sandboxPaymentCreateBody.startDate
                additionalProperties = sandboxPaymentCreateBody.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: String?) = apply { this.endDate = endDate }

            fun payStatements(payStatements: List<PayStatement>?) = apply {
                this.payStatements = payStatements?.toMutableList()
            }

            fun addPayStatement(payStatement: PayStatement) = apply {
                payStatements = (payStatements ?: mutableListOf()).apply { add(payStatement) }
            }

            fun startDate(startDate: String?) = apply { this.startDate = startDate }

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

            fun build(): SandboxPaymentCreateBody =
                SandboxPaymentCreateBody(
                    endDate,
                    payStatements?.toImmutable(),
                    startDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxPaymentCreateBody && endDate == other.endDate && payStatements == other.payStatements && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, payStatements, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxPaymentCreateBody{endDate=$endDate, payStatements=$payStatements, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: SandboxPaymentCreateBody.Builder = SandboxPaymentCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(sandboxPaymentCreateParams: SandboxPaymentCreateParams) = apply {
            body = sandboxPaymentCreateParams.body.toBuilder()
            additionalHeaders = sandboxPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        fun endDate(endDate: String?) = apply { body.endDate(endDate) }

        fun payStatements(payStatements: List<PayStatement>?) = apply {
            body.payStatements(payStatements)
        }

        fun addPayStatement(payStatement: PayStatement) = apply {
            body.addPayStatement(payStatement)
        }

        fun startDate(startDate: String?) = apply { body.startDate(startDate) }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): SandboxPaymentCreateParams =
            SandboxPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class PayStatement
    @JsonCreator
    private constructor(
        @JsonProperty("earnings") private val earnings: List<Earning?>?,
        @JsonProperty("employee_deductions")
        private val employeeDeductions: List<EmployeeDeduction?>?,
        @JsonProperty("employer_contributions")
        private val employerContributions: List<EmployerContribution?>?,
        @JsonProperty("gross_pay") private val grossPay: Money?,
        @JsonProperty("individual_id") private val individualId: String?,
        @JsonProperty("net_pay") private val netPay: Money?,
        @JsonProperty("payment_method") private val paymentMethod: PaymentMethod?,
        @JsonProperty("taxes") private val taxes: List<Tax?>?,
        @JsonProperty("total_hours") private val totalHours: Double?,
        @JsonProperty("type") private val type: Type?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The array of earnings objects associated with this pay statement */
        @JsonProperty("earnings") fun earnings(): List<Earning?>? = earnings

        /** The array of deductions objects associated with this pay statement. */
        @JsonProperty("employee_deductions")
        fun employeeDeductions(): List<EmployeeDeduction?>? = employeeDeductions

        @JsonProperty("employer_contributions")
        fun employerContributions(): List<EmployerContribution?>? = employerContributions

        @JsonProperty("gross_pay") fun grossPay(): Money? = grossPay

        /** A stable Finch `id` (UUID v4) for an individual in the company */
        @JsonProperty("individual_id") fun individualId(): String? = individualId

        @JsonProperty("net_pay") fun netPay(): Money? = netPay

        /** The payment method. */
        @JsonProperty("payment_method") fun paymentMethod(): PaymentMethod? = paymentMethod

        /** The array of taxes objects associated with this pay statement. */
        @JsonProperty("taxes") fun taxes(): List<Tax?>? = taxes

        /** The number of hours worked for this pay period */
        @JsonProperty("total_hours") fun totalHours(): Double? = totalHours

        /** The type of the payment associated with the pay statement. */
        @JsonProperty("type") fun type(): Type? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var earnings: MutableList<Earning?>? = null
            private var employeeDeductions: MutableList<EmployeeDeduction?>? = null
            private var employerContributions: MutableList<EmployerContribution?>? = null
            private var grossPay: Money? = null
            private var individualId: String? = null
            private var netPay: Money? = null
            private var paymentMethod: PaymentMethod? = null
            private var taxes: MutableList<Tax?>? = null
            private var totalHours: Double? = null
            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(payStatement: PayStatement) = apply {
                earnings = payStatement.earnings?.toMutableList()
                employeeDeductions = payStatement.employeeDeductions?.toMutableList()
                employerContributions = payStatement.employerContributions?.toMutableList()
                grossPay = payStatement.grossPay
                individualId = payStatement.individualId
                netPay = payStatement.netPay
                paymentMethod = payStatement.paymentMethod
                taxes = payStatement.taxes?.toMutableList()
                totalHours = payStatement.totalHours
                type = payStatement.type
                additionalProperties = payStatement.additionalProperties.toMutableMap()
            }

            /** The array of earnings objects associated with this pay statement */
            fun earnings(earnings: List<Earning?>?) = apply {
                this.earnings = earnings?.toMutableList()
            }

            /** The array of earnings objects associated with this pay statement */
            fun addEarning(earning: Earning) = apply {
                earnings = (earnings ?: mutableListOf()).apply { add(earning) }
            }

            /** The array of deductions objects associated with this pay statement. */
            fun employeeDeductions(employeeDeductions: List<EmployeeDeduction?>?) = apply {
                this.employeeDeductions = employeeDeductions?.toMutableList()
            }

            /** The array of deductions objects associated with this pay statement. */
            fun addEmployeeDeduction(employeeDeduction: EmployeeDeduction) = apply {
                employeeDeductions =
                    (employeeDeductions ?: mutableListOf()).apply { add(employeeDeduction) }
            }

            fun employerContributions(employerContributions: List<EmployerContribution?>?) = apply {
                this.employerContributions = employerContributions?.toMutableList()
            }

            fun addEmployerContribution(employerContribution: EmployerContribution) = apply {
                employerContributions =
                    (employerContributions ?: mutableListOf()).apply { add(employerContribution) }
            }

            fun grossPay(grossPay: Money?) = apply { this.grossPay = grossPay }

            /** A stable Finch `id` (UUID v4) for an individual in the company */
            fun individualId(individualId: String?) = apply { this.individualId = individualId }

            fun netPay(netPay: Money?) = apply { this.netPay = netPay }

            /** The payment method. */
            fun paymentMethod(paymentMethod: PaymentMethod?) = apply {
                this.paymentMethod = paymentMethod
            }

            /** The array of taxes objects associated with this pay statement. */
            fun taxes(taxes: List<Tax?>?) = apply { this.taxes = taxes?.toMutableList() }

            /** The array of taxes objects associated with this pay statement. */
            fun addTax(tax: Tax) = apply { taxes = (taxes ?: mutableListOf()).apply { add(tax) } }

            /** The number of hours worked for this pay period */
            fun totalHours(totalHours: Double?) = apply { this.totalHours = totalHours }

            /** The number of hours worked for this pay period */
            fun totalHours(totalHours: Double) = totalHours(totalHours as Double?)

            /** The type of the payment associated with the pay statement. */
            fun type(type: Type?) = apply { this.type = type }

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

            fun build(): PayStatement =
                PayStatement(
                    earnings?.toImmutable(),
                    employeeDeductions?.toImmutable(),
                    employerContributions?.toImmutable(),
                    grossPay,
                    individualId,
                    netPay,
                    paymentMethod,
                    taxes?.toImmutable(),
                    totalHours,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Earning
        @JsonCreator
        private constructor(
            @JsonProperty("amount") private val amount: Long?,
            @JsonProperty("currency") private val currency: String?,
            @JsonProperty("hours") private val hours: Double?,
            @JsonProperty("name") private val name: String?,
            @JsonProperty("type") private val type: Type?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The earnings amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The earnings currency code. */
            @JsonProperty("currency") fun currency(): String? = currency

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             */
            @JsonProperty("hours") fun hours(): Double? = hours

            /** The exact name of the deduction from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** The type of earning. */
            @JsonProperty("type") fun type(): Type? = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: Long? = null
                private var currency: String? = null
                private var hours: Double? = null
                private var name: String? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(earning: Earning) = apply {
                    amount = earning.amount
                    currency = earning.currency
                    hours = earning.hours
                    name = earning.name
                    type = earning.type
                    additionalProperties = earning.additionalProperties.toMutableMap()
                }

                /** The earnings amount in cents. */
                fun amount(amount: Long?) = apply { this.amount = amount }

                /** The earnings amount in cents. */
                fun amount(amount: Long) = amount(amount as Long?)

                /** The earnings currency code. */
                fun currency(currency: String?) = apply { this.currency = currency }

                /**
                 * The number of hours associated with this earning. (For salaried employees, this
                 * could be hours per pay period, `0` or `null`, depending on the provider).
                 */
                fun hours(hours: Double?) = apply { this.hours = hours }

                /**
                 * The number of hours associated with this earning. (For salaried employees, this
                 * could be hours per pay period, `0` or `null`, depending on the provider).
                 */
                fun hours(hours: Double) = hours(hours as Double?)

                /** The exact name of the deduction from the pay statement. */
                fun name(name: String?) = apply { this.name = name }

                /** The type of earning. */
                fun type(type: Type?) = apply { this.type = type }

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

                fun build(): Earning =
                    Earning(
                        amount,
                        currency,
                        hours,
                        name,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val SALARY = of("salary")

                    val WAGE = of("wage")

                    val REIMBURSEMENT = of("reimbursement")

                    val OVERTIME = of("overtime")

                    val SEVERANCE = of("severance")

                    val DOUBLE_OVERTIME = of("double_overtime")

                    val PTO = of("pto")

                    val SICK = of("sick")

                    val BONUS = of("bonus")

                    val COMMISSION = of("commission")

                    val TIPS = of("tips")

                    val _1099 = of("1099")

                    val OTHER = of("other")

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

                return /* spotless:off */ other is Earning && amount == other.amount && currency == other.currency && hours == other.hours && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, hours, name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Earning{amount=$amount, currency=$currency, hours=$hours, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class EmployeeDeduction
        @JsonCreator
        private constructor(
            @JsonProperty("amount") private val amount: Long?,
            @JsonProperty("currency") private val currency: String?,
            @JsonProperty("name") private val name: String?,
            @JsonProperty("pre_tax") private val preTax: Boolean?,
            @JsonProperty("type") private val type: BenefitType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The deduction amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The deduction currency. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** The deduction name from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** Boolean indicating if the deduction is pre-tax. */
            @JsonProperty("pre_tax") fun preTax(): Boolean? = preTax

            /** Type of benefit. */
            @JsonProperty("type") fun type(): BenefitType? = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: Long? = null
                private var currency: String? = null
                private var name: String? = null
                private var preTax: Boolean? = null
                private var type: BenefitType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(employeeDeduction: EmployeeDeduction) = apply {
                    amount = employeeDeduction.amount
                    currency = employeeDeduction.currency
                    name = employeeDeduction.name
                    preTax = employeeDeduction.preTax
                    type = employeeDeduction.type
                    additionalProperties = employeeDeduction.additionalProperties.toMutableMap()
                }

                /** The deduction amount in cents. */
                fun amount(amount: Long?) = apply { this.amount = amount }

                /** The deduction amount in cents. */
                fun amount(amount: Long) = amount(amount as Long?)

                /** The deduction currency. */
                fun currency(currency: String?) = apply { this.currency = currency }

                /** The deduction name from the pay statement. */
                fun name(name: String?) = apply { this.name = name }

                /** Boolean indicating if the deduction is pre-tax. */
                fun preTax(preTax: Boolean?) = apply { this.preTax = preTax }

                /** Boolean indicating if the deduction is pre-tax. */
                fun preTax(preTax: Boolean) = preTax(preTax as Boolean?)

                /** Type of benefit. */
                fun type(type: BenefitType?) = apply { this.type = type }

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

                fun build(): EmployeeDeduction =
                    EmployeeDeduction(
                        amount,
                        currency,
                        name,
                        preTax,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EmployeeDeduction && amount == other.amount && currency == other.currency && name == other.name && preTax == other.preTax && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, name, preTax, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmployeeDeduction{amount=$amount, currency=$currency, name=$name, preTax=$preTax, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class EmployerContribution
        @JsonCreator
        private constructor(
            @JsonProperty("amount") private val amount: Long?,
            @JsonProperty("currency") private val currency: String?,
            @JsonProperty("name") private val name: String?,
            @JsonProperty("type") private val type: BenefitType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The contribution amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The contribution currency. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** The contribution name from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** Type of benefit. */
            @JsonProperty("type") fun type(): BenefitType? = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: Long? = null
                private var currency: String? = null
                private var name: String? = null
                private var type: BenefitType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(employerContribution: EmployerContribution) = apply {
                    amount = employerContribution.amount
                    currency = employerContribution.currency
                    name = employerContribution.name
                    type = employerContribution.type
                    additionalProperties = employerContribution.additionalProperties.toMutableMap()
                }

                /** The contribution amount in cents. */
                fun amount(amount: Long?) = apply { this.amount = amount }

                /** The contribution amount in cents. */
                fun amount(amount: Long) = amount(amount as Long?)

                /** The contribution currency. */
                fun currency(currency: String?) = apply { this.currency = currency }

                /** The contribution name from the pay statement. */
                fun name(name: String?) = apply { this.name = name }

                /** Type of benefit. */
                fun type(type: BenefitType?) = apply { this.type = type }

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

                fun build(): EmployerContribution =
                    EmployerContribution(
                        amount,
                        currency,
                        name,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EmployerContribution && amount == other.amount && currency == other.currency && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmployerContribution{amount=$amount, currency=$currency, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        class PaymentMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val CHECK = of("check")

                val DIRECT_DEPOSIT = of("direct_deposit")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Tax
        @JsonCreator
        private constructor(
            @JsonProperty("amount") private val amount: Long?,
            @JsonProperty("currency") private val currency: String?,
            @JsonProperty("employer") private val employer: Boolean?,
            @JsonProperty("name") private val name: String?,
            @JsonProperty("type") private val type: Type?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The tax amount in cents. */
            @JsonProperty("amount") fun amount(): Long? = amount

            /** The currency code. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** `true` if the amount is paid by the employers. */
            @JsonProperty("employer") fun employer(): Boolean? = employer

            /** The exact name of tax from the pay statement. */
            @JsonProperty("name") fun name(): String? = name

            /** The type of taxes. */
            @JsonProperty("type") fun type(): Type? = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: Long? = null
                private var currency: String? = null
                private var employer: Boolean? = null
                private var name: String? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tax: Tax) = apply {
                    amount = tax.amount
                    currency = tax.currency
                    employer = tax.employer
                    name = tax.name
                    type = tax.type
                    additionalProperties = tax.additionalProperties.toMutableMap()
                }

                /** The tax amount in cents. */
                fun amount(amount: Long?) = apply { this.amount = amount }

                /** The tax amount in cents. */
                fun amount(amount: Long) = amount(amount as Long?)

                /** The currency code. */
                fun currency(currency: String?) = apply { this.currency = currency }

                /** `true` if the amount is paid by the employers. */
                fun employer(employer: Boolean?) = apply { this.employer = employer }

                /** `true` if the amount is paid by the employers. */
                fun employer(employer: Boolean) = employer(employer as Boolean?)

                /** The exact name of tax from the pay statement. */
                fun name(name: String?) = apply { this.name = name }

                /** The type of taxes. */
                fun type(type: Type?) = apply { this.type = type }

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

                fun build(): Tax =
                    Tax(
                        amount,
                        currency,
                        employer,
                        name,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val STATE = of("state")

                    val FEDERAL = of("federal")

                    val LOCAL = of("local")

                    val FICA = of("fica")

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

                return /* spotless:off */ other is Tax && amount == other.amount && currency == other.currency && employer == other.employer && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, employer, name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tax{amount=$amount, currency=$currency, employer=$employer, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val REGULAR_PAYROLL = of("regular_payroll")

                val OFF_CYCLE_PAYROLL = of("off_cycle_payroll")

                val ONE_TIME_PAYMENT = of("one_time_payment")

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

            return /* spotless:off */ other is PayStatement && earnings == other.earnings && employeeDeductions == other.employeeDeductions && employerContributions == other.employerContributions && grossPay == other.grossPay && individualId == other.individualId && netPay == other.netPay && paymentMethod == other.paymentMethod && taxes == other.taxes && totalHours == other.totalHours && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(earnings, employeeDeductions, employerContributions, grossPay, individualId, netPay, paymentMethod, taxes, totalHours, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PayStatement{earnings=$earnings, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, grossPay=$grossPay, individualId=$individualId, netPay=$netPay, paymentMethod=$paymentMethod, taxes=$taxes, totalHours=$totalHours, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SandboxPaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SandboxPaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
