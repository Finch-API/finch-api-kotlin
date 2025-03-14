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
class PayStatement
@JsonCreator
private constructor(
    @JsonProperty("earnings")
    @ExcludeMissing
    private val earnings: JsonField<List<Earning?>> = JsonMissing.of(),
    @JsonProperty("employee_deductions")
    @ExcludeMissing
    private val employeeDeductions: JsonField<List<EmployeeDeduction?>> = JsonMissing.of(),
    @JsonProperty("employer_contributions")
    @ExcludeMissing
    private val employerContributions: JsonField<List<EmployerContribution?>> = JsonMissing.of(),
    @JsonProperty("gross_pay")
    @ExcludeMissing
    private val grossPay: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("individual_id")
    @ExcludeMissing
    private val individualId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("net_pay")
    @ExcludeMissing
    private val netPay: JsonField<Money> = JsonMissing.of(),
    @JsonProperty("payment_method")
    @ExcludeMissing
    private val paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
    @JsonProperty("taxes")
    @ExcludeMissing
    private val taxes: JsonField<List<Tax?>> = JsonMissing.of(),
    @JsonProperty("total_hours")
    @ExcludeMissing
    private val totalHours: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The array of earnings objects associated with this pay statement */
    fun earnings(): List<Earning?>? = earnings.getNullable("earnings")

    /** The array of deductions objects associated with this pay statement. */
    fun employeeDeductions(): List<EmployeeDeduction?>? =
        employeeDeductions.getNullable("employee_deductions")

    fun employerContributions(): List<EmployerContribution?>? =
        employerContributions.getNullable("employer_contributions")

    fun grossPay(): Money? = grossPay.getNullable("gross_pay")

    /** A stable Finch `id` (UUID v4) for an individual in the company */
    fun individualId(): String? = individualId.getNullable("individual_id")

    fun netPay(): Money? = netPay.getNullable("net_pay")

    /** The payment method. */
    fun paymentMethod(): PaymentMethod? = paymentMethod.getNullable("payment_method")

    /** The array of taxes objects associated with this pay statement. */
    fun taxes(): List<Tax?>? = taxes.getNullable("taxes")

    /** The number of hours worked for this pay period */
    fun totalHours(): Double? = totalHours.getNullable("total_hours")

    /** The type of the payment associated with the pay statement. */
    fun type(): Type? = type.getNullable("type")

    /** The array of earnings objects associated with this pay statement */
    @JsonProperty("earnings") @ExcludeMissing fun _earnings(): JsonField<List<Earning?>> = earnings

    /** The array of deductions objects associated with this pay statement. */
    @JsonProperty("employee_deductions")
    @ExcludeMissing
    fun _employeeDeductions(): JsonField<List<EmployeeDeduction?>> = employeeDeductions

    @JsonProperty("employer_contributions")
    @ExcludeMissing
    fun _employerContributions(): JsonField<List<EmployerContribution?>> = employerContributions

    @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay(): JsonField<Money> = grossPay

    /** A stable Finch `id` (UUID v4) for an individual in the company */
    @JsonProperty("individual_id")
    @ExcludeMissing
    fun _individualId(): JsonField<String> = individualId

    @JsonProperty("net_pay") @ExcludeMissing fun _netPay(): JsonField<Money> = netPay

    /** The payment method. */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

    /** The array of taxes objects associated with this pay statement. */
    @JsonProperty("taxes") @ExcludeMissing fun _taxes(): JsonField<List<Tax?>> = taxes

    /** The number of hours worked for this pay period */
    @JsonProperty("total_hours") @ExcludeMissing fun _totalHours(): JsonField<Double> = totalHours

    /** The type of the payment associated with the pay statement. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PayStatement = apply {
        if (validated) {
            return@apply
        }

        earnings()?.forEach { it?.validate() }
        employeeDeductions()?.forEach { it?.validate() }
        employerContributions()?.forEach { it?.validate() }
        grossPay()?.validate()
        individualId()
        netPay()?.validate()
        paymentMethod()
        taxes()?.forEach { it?.validate() }
        totalHours()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [PayStatement]. */
    class Builder internal constructor() {

        private var earnings: JsonField<MutableList<Earning?>>? = null
        private var employeeDeductions: JsonField<MutableList<EmployeeDeduction?>>? = null
        private var employerContributions: JsonField<MutableList<EmployerContribution?>>? = null
        private var grossPay: JsonField<Money> = JsonMissing.of()
        private var individualId: JsonField<String> = JsonMissing.of()
        private var netPay: JsonField<Money> = JsonMissing.of()
        private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
        private var taxes: JsonField<MutableList<Tax?>>? = null
        private var totalHours: JsonField<Double> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(payStatement: PayStatement) = apply {
            earnings = payStatement.earnings.map { it.toMutableList() }
            employeeDeductions = payStatement.employeeDeductions.map { it.toMutableList() }
            employerContributions = payStatement.employerContributions.map { it.toMutableList() }
            grossPay = payStatement.grossPay
            individualId = payStatement.individualId
            netPay = payStatement.netPay
            paymentMethod = payStatement.paymentMethod
            taxes = payStatement.taxes.map { it.toMutableList() }
            totalHours = payStatement.totalHours
            type = payStatement.type
            additionalProperties = payStatement.additionalProperties.toMutableMap()
        }

        /** The array of earnings objects associated with this pay statement */
        fun earnings(earnings: List<Earning?>?) = earnings(JsonField.ofNullable(earnings))

        /** The array of earnings objects associated with this pay statement */
        fun earnings(earnings: JsonField<List<Earning?>>) = apply {
            this.earnings = earnings.map { it.toMutableList() }
        }

        /** The array of earnings objects associated with this pay statement */
        fun addEarning(earning: Earning) = apply {
            earnings =
                (earnings ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(earning)
                }
        }

        /** The array of deductions objects associated with this pay statement. */
        fun employeeDeductions(employeeDeductions: List<EmployeeDeduction?>?) =
            employeeDeductions(JsonField.ofNullable(employeeDeductions))

        /** The array of deductions objects associated with this pay statement. */
        fun employeeDeductions(employeeDeductions: JsonField<List<EmployeeDeduction?>>) = apply {
            this.employeeDeductions = employeeDeductions.map { it.toMutableList() }
        }

        /** The array of deductions objects associated with this pay statement. */
        fun addEmployeeDeduction(employeeDeduction: EmployeeDeduction) = apply {
            employeeDeductions =
                (employeeDeductions ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(employeeDeduction)
                }
        }

        fun employerContributions(employerContributions: List<EmployerContribution?>?) =
            employerContributions(JsonField.ofNullable(employerContributions))

        fun employerContributions(employerContributions: JsonField<List<EmployerContribution?>>) =
            apply {
                this.employerContributions = employerContributions.map { it.toMutableList() }
            }

        fun addEmployerContribution(employerContribution: EmployerContribution) = apply {
            employerContributions =
                (employerContributions ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(employerContribution)
                }
        }

        fun grossPay(grossPay: Money?) = grossPay(JsonField.ofNullable(grossPay))

        fun grossPay(grossPay: JsonField<Money>) = apply { this.grossPay = grossPay }

        /** A stable Finch `id` (UUID v4) for an individual in the company */
        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        /** A stable Finch `id` (UUID v4) for an individual in the company */
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        fun netPay(netPay: Money?) = netPay(JsonField.ofNullable(netPay))

        fun netPay(netPay: JsonField<Money>) = apply { this.netPay = netPay }

        /** The payment method. */
        fun paymentMethod(paymentMethod: PaymentMethod?) =
            paymentMethod(JsonField.ofNullable(paymentMethod))

        /** The payment method. */
        fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
            this.paymentMethod = paymentMethod
        }

        /** The array of taxes objects associated with this pay statement. */
        fun taxes(taxes: List<Tax?>?) = taxes(JsonField.ofNullable(taxes))

        /** The array of taxes objects associated with this pay statement. */
        fun taxes(taxes: JsonField<List<Tax?>>) = apply {
            this.taxes = taxes.map { it.toMutableList() }
        }

        /** The array of taxes objects associated with this pay statement. */
        fun addTax(tax: Tax) = apply {
            taxes =
                (taxes ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(tax)
                }
        }

        /** The number of hours worked for this pay period */
        fun totalHours(totalHours: Double?) = totalHours(JsonField.ofNullable(totalHours))

        /** The number of hours worked for this pay period */
        fun totalHours(totalHours: Double) = totalHours(totalHours as Double?)

        /** The number of hours worked for this pay period */
        fun totalHours(totalHours: JsonField<Double>) = apply { this.totalHours = totalHours }

        /** The type of the payment associated with the pay statement. */
        fun type(type: Type?) = type(JsonField.ofNullable(type))

        /** The type of the payment associated with the pay statement. */
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

        fun build(): PayStatement =
            PayStatement(
                (earnings ?: JsonMissing.of()).map { it.toImmutable() },
                (employeeDeductions ?: JsonMissing.of()).map { it.toImmutable() },
                (employerContributions ?: JsonMissing.of()).map { it.toImmutable() },
                grossPay,
                individualId,
                netPay,
                paymentMethod,
                (taxes ?: JsonMissing.of()).map { it.toImmutable() },
                totalHours,
                type,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Earning
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        private val attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hours")
        @ExcludeMissing
        private val hours: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The earnings amount in cents. */
        fun amount(): Long? = amount.getNullable("amount")

        fun attributes(): Attributes? = attributes.getNullable("attributes")

        /** The earnings currency code. */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * The number of hours associated with this earning. (For salaried employees, this could be
         * hours per pay period, `0` or `null`, depending on the provider).
         */
        fun hours(): Double? = hours.getNullable("hours")

        /** The exact name of the deduction from the pay statement. */
        fun name(): String? = name.getNullable("name")

        /** The type of earning. */
        fun type(): Type? = type.getNullable("type")

        /** The earnings amount in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        /** The earnings currency code. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * The number of hours associated with this earning. (For salaried employees, this could be
         * hours per pay period, `0` or `null`, depending on the provider).
         */
        @JsonProperty("hours") @ExcludeMissing fun _hours(): JsonField<Double> = hours

        /** The exact name of the deduction from the pay statement. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The type of earning. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Earning = apply {
            if (validated) {
                return@apply
            }

            amount()
            attributes()?.validate()
            currency()
            hours()
            name()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Earning]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var attributes: JsonField<Attributes> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var hours: JsonField<Double> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(earning: Earning) = apply {
                amount = earning.amount
                attributes = earning.attributes
                currency = earning.currency
                hours = earning.hours
                name = earning.name
                type = earning.type
                additionalProperties = earning.additionalProperties.toMutableMap()
            }

            /** The earnings amount in cents. */
            fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

            /** The earnings amount in cents. */
            fun amount(amount: Long) = amount(amount as Long?)

            /** The earnings amount in cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun attributes(attributes: Attributes?) = attributes(JsonField.ofNullable(attributes))

            fun attributes(attributes: JsonField<Attributes>) = apply {
                this.attributes = attributes
            }

            /** The earnings currency code. */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /** The earnings currency code. */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             */
            fun hours(hours: Double?) = hours(JsonField.ofNullable(hours))

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             */
            fun hours(hours: Double) = hours(hours as Double?)

            /**
             * The number of hours associated with this earning. (For salaried employees, this could
             * be hours per pay period, `0` or `null`, depending on the provider).
             */
            fun hours(hours: JsonField<Double>) = apply { this.hours = hours }

            /** The exact name of the deduction from the pay statement. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** The exact name of the deduction from the pay statement. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The type of earning. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /** The type of earning. */
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

            fun build(): Earning =
                Earning(
                    amount,
                    attributes,
                    currency,
                    hours,
                    name,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Attributes
        @JsonCreator
        private constructor(
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun metadata(): Metadata? = metadata.getNullable("metadata")

            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

                metadata()?.validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Attributes]. */
            class Builder internal constructor() {

                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(attributes: Attributes) = apply {
                    metadata = attributes.metadata
                    additionalProperties = attributes.additionalProperties.toMutableMap()
                }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

                fun build(): Attributes = Attributes(metadata, additionalProperties.toImmutable())
            }

            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<InnerMetadata> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                fun metadata(): InnerMetadata? = metadata.getNullable("metadata")

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<InnerMetadata> = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

                    metadata()?.validate()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var metadata: JsonField<InnerMetadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        this.metadata = metadata.metadata
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    fun metadata(metadata: InnerMetadata) = metadata(JsonField.of(metadata))

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    fun metadata(metadata: JsonField<InnerMetadata>) = apply {
                        this.metadata = metadata
                    }

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

                    fun build(): Metadata = Metadata(metadata, additionalProperties.toImmutable())
                }

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                @NoAutoDetect
                class InnerMetadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): InnerMetadata = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    /** A builder for [InnerMetadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(innerMetadata: InnerMetadata) = apply {
                            additionalProperties = innerMetadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): InnerMetadata =
                            InnerMetadata(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is InnerMetadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerMetadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Metadata{metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Attributes && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Attributes{metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /** The type of earning. */
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

            /** An enum containing [Type]'s known values. */
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Earning && amount == other.amount && attributes == other.attributes && currency == other.currency && hours == other.hours && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, attributes, currency, hours, name, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Earning{amount=$amount, attributes=$attributes, currency=$currency, hours=$hours, name=$name, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class EmployeeDeduction
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        private val attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pre_tax")
        @ExcludeMissing
        private val preTax: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<BenefitType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The deduction amount in cents. */
        fun amount(): Long? = amount.getNullable("amount")

        fun attributes(): Attributes? = attributes.getNullable("attributes")

        /** The deduction currency. */
        fun currency(): String? = currency.getNullable("currency")

        /** The deduction name from the pay statement. */
        fun name(): String? = name.getNullable("name")

        /** Boolean indicating if the deduction is pre-tax. */
        fun preTax(): Boolean? = preTax.getNullable("pre_tax")

        /** Type of benefit. */
        fun type(): BenefitType? = type.getNullable("type")

        /** The deduction amount in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        /** The deduction currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /** The deduction name from the pay statement. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Boolean indicating if the deduction is pre-tax. */
        @JsonProperty("pre_tax") @ExcludeMissing fun _preTax(): JsonField<Boolean> = preTax

        /** Type of benefit. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EmployeeDeduction = apply {
            if (validated) {
                return@apply
            }

            amount()
            attributes()?.validate()
            currency()
            name()
            preTax()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [EmployeeDeduction]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var attributes: JsonField<Attributes> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var preTax: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<BenefitType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(employeeDeduction: EmployeeDeduction) = apply {
                amount = employeeDeduction.amount
                attributes = employeeDeduction.attributes
                currency = employeeDeduction.currency
                name = employeeDeduction.name
                preTax = employeeDeduction.preTax
                type = employeeDeduction.type
                additionalProperties = employeeDeduction.additionalProperties.toMutableMap()
            }

            /** The deduction amount in cents. */
            fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

            /** The deduction amount in cents. */
            fun amount(amount: Long) = amount(amount as Long?)

            /** The deduction amount in cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun attributes(attributes: Attributes?) = attributes(JsonField.ofNullable(attributes))

            fun attributes(attributes: JsonField<Attributes>) = apply {
                this.attributes = attributes
            }

            /** The deduction currency. */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /** The deduction currency. */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The deduction name from the pay statement. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** The deduction name from the pay statement. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Boolean indicating if the deduction is pre-tax. */
            fun preTax(preTax: Boolean?) = preTax(JsonField.ofNullable(preTax))

            /** Boolean indicating if the deduction is pre-tax. */
            fun preTax(preTax: Boolean) = preTax(preTax as Boolean?)

            /** Boolean indicating if the deduction is pre-tax. */
            fun preTax(preTax: JsonField<Boolean>) = apply { this.preTax = preTax }

            /** Type of benefit. */
            fun type(type: BenefitType?) = type(JsonField.ofNullable(type))

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

            fun build(): EmployeeDeduction =
                EmployeeDeduction(
                    amount,
                    attributes,
                    currency,
                    name,
                    preTax,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Attributes
        @JsonCreator
        private constructor(
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun metadata(): Metadata? = metadata.getNullable("metadata")

            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

                metadata()?.validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Attributes]. */
            class Builder internal constructor() {

                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(attributes: Attributes) = apply {
                    metadata = attributes.metadata
                    additionalProperties = attributes.additionalProperties.toMutableMap()
                }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

                fun build(): Attributes = Attributes(metadata, additionalProperties.toImmutable())
            }

            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<InnerMetadata> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                fun metadata(): InnerMetadata? = metadata.getNullable("metadata")

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<InnerMetadata> = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

                    metadata()?.validate()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var metadata: JsonField<InnerMetadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        this.metadata = metadata.metadata
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    fun metadata(metadata: InnerMetadata) = metadata(JsonField.of(metadata))

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    fun metadata(metadata: JsonField<InnerMetadata>) = apply {
                        this.metadata = metadata
                    }

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

                    fun build(): Metadata = Metadata(metadata, additionalProperties.toImmutable())
                }

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                @NoAutoDetect
                class InnerMetadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): InnerMetadata = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    /** A builder for [InnerMetadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(innerMetadata: InnerMetadata) = apply {
                            additionalProperties = innerMetadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): InnerMetadata =
                            InnerMetadata(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is InnerMetadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerMetadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Metadata{metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Attributes && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Attributes{metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmployeeDeduction && amount == other.amount && attributes == other.attributes && currency == other.currency && name == other.name && preTax == other.preTax && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, attributes, currency, name, preTax, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmployeeDeduction{amount=$amount, attributes=$attributes, currency=$currency, name=$name, preTax=$preTax, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class EmployerContribution
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        private val attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<BenefitType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The contribution amount in cents. */
        fun amount(): Long? = amount.getNullable("amount")

        fun attributes(): Attributes? = attributes.getNullable("attributes")

        /** The contribution currency. */
        fun currency(): String? = currency.getNullable("currency")

        /** The contribution name from the pay statement. */
        fun name(): String? = name.getNullable("name")

        /** Type of benefit. */
        fun type(): BenefitType? = type.getNullable("type")

        /** The contribution amount in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        /** The contribution currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /** The contribution name from the pay statement. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Type of benefit. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<BenefitType> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EmployerContribution = apply {
            if (validated) {
                return@apply
            }

            amount()
            attributes()?.validate()
            currency()
            name()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [EmployerContribution]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var attributes: JsonField<Attributes> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var type: JsonField<BenefitType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(employerContribution: EmployerContribution) = apply {
                amount = employerContribution.amount
                attributes = employerContribution.attributes
                currency = employerContribution.currency
                name = employerContribution.name
                type = employerContribution.type
                additionalProperties = employerContribution.additionalProperties.toMutableMap()
            }

            /** The contribution amount in cents. */
            fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

            /** The contribution amount in cents. */
            fun amount(amount: Long) = amount(amount as Long?)

            /** The contribution amount in cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun attributes(attributes: Attributes?) = attributes(JsonField.ofNullable(attributes))

            fun attributes(attributes: JsonField<Attributes>) = apply {
                this.attributes = attributes
            }

            /** The contribution currency. */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /** The contribution currency. */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The contribution name from the pay statement. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** The contribution name from the pay statement. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Type of benefit. */
            fun type(type: BenefitType?) = type(JsonField.ofNullable(type))

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

            fun build(): EmployerContribution =
                EmployerContribution(
                    amount,
                    attributes,
                    currency,
                    name,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Attributes
        @JsonCreator
        private constructor(
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun metadata(): Metadata? = metadata.getNullable("metadata")

            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

                metadata()?.validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Attributes]. */
            class Builder internal constructor() {

                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(attributes: Attributes) = apply {
                    metadata = attributes.metadata
                    additionalProperties = attributes.additionalProperties.toMutableMap()
                }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

                fun build(): Attributes = Attributes(metadata, additionalProperties.toImmutable())
            }

            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<InnerMetadata> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                fun metadata(): InnerMetadata? = metadata.getNullable("metadata")

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<InnerMetadata> = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

                    metadata()?.validate()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var metadata: JsonField<InnerMetadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        this.metadata = metadata.metadata
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    fun metadata(metadata: InnerMetadata) = metadata(JsonField.of(metadata))

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    fun metadata(metadata: JsonField<InnerMetadata>) = apply {
                        this.metadata = metadata
                    }

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

                    fun build(): Metadata = Metadata(metadata, additionalProperties.toImmutable())
                }

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                @NoAutoDetect
                class InnerMetadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): InnerMetadata = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    /** A builder for [InnerMetadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(innerMetadata: InnerMetadata) = apply {
                            additionalProperties = innerMetadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): InnerMetadata =
                            InnerMetadata(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is InnerMetadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerMetadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Metadata{metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Attributes && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Attributes{metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EmployerContribution && amount == other.amount && attributes == other.attributes && currency == other.currency && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, attributes, currency, name, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmployerContribution{amount=$amount, attributes=$attributes, currency=$currency, name=$name, type=$type, additionalProperties=$additionalProperties}"
    }

    /** The payment method. */
    class PaymentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val CHECK = of("check")

            val DIRECT_DEPOSIT = of("direct_deposit")

            fun of(value: String) = PaymentMethod(JsonField.of(value))
        }

        /** An enum containing [PaymentMethod]'s known values. */
        enum class Known {
            CHECK,
            DIRECT_DEPOSIT,
        }

        /**
         * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHECK,
            DIRECT_DEPOSIT,
            /**
             * An enum member indicating that [PaymentMethod] was instantiated with an unknown
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
                CHECK -> Value.CHECK
                DIRECT_DEPOSIT -> Value.DIRECT_DEPOSIT
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
                CHECK -> Known.CHECK
                DIRECT_DEPOSIT -> Known.DIRECT_DEPOSIT
                else -> throw FinchInvalidDataException("Unknown PaymentMethod: $value")
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

            return /* spotless:off */ other is PaymentMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Tax
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        private val attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("employer")
        @ExcludeMissing
        private val employer: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The tax amount in cents. */
        fun amount(): Long? = amount.getNullable("amount")

        fun attributes(): Attributes? = attributes.getNullable("attributes")

        /** The currency code. */
        fun currency(): String? = currency.getNullable("currency")

        /** `true` if the amount is paid by the employers. */
        fun employer(): Boolean? = employer.getNullable("employer")

        /** The exact name of tax from the pay statement. */
        fun name(): String? = name.getNullable("name")

        /** The type of taxes. */
        fun type(): Type? = type.getNullable("type")

        /** The tax amount in cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        /** The currency code. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /** `true` if the amount is paid by the employers. */
        @JsonProperty("employer") @ExcludeMissing fun _employer(): JsonField<Boolean> = employer

        /** The exact name of tax from the pay statement. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The type of taxes. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tax = apply {
            if (validated) {
                return@apply
            }

            amount()
            attributes()?.validate()
            currency()
            employer()
            name()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Tax]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var attributes: JsonField<Attributes> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var employer: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tax: Tax) = apply {
                amount = tax.amount
                attributes = tax.attributes
                currency = tax.currency
                employer = tax.employer
                name = tax.name
                type = tax.type
                additionalProperties = tax.additionalProperties.toMutableMap()
            }

            /** The tax amount in cents. */
            fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

            /** The tax amount in cents. */
            fun amount(amount: Long) = amount(amount as Long?)

            /** The tax amount in cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun attributes(attributes: Attributes?) = attributes(JsonField.ofNullable(attributes))

            fun attributes(attributes: JsonField<Attributes>) = apply {
                this.attributes = attributes
            }

            /** The currency code. */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /** The currency code. */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** `true` if the amount is paid by the employers. */
            fun employer(employer: Boolean?) = employer(JsonField.ofNullable(employer))

            /** `true` if the amount is paid by the employers. */
            fun employer(employer: Boolean) = employer(employer as Boolean?)

            /** `true` if the amount is paid by the employers. */
            fun employer(employer: JsonField<Boolean>) = apply { this.employer = employer }

            /** The exact name of tax from the pay statement. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** The exact name of tax from the pay statement. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The type of taxes. */
            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /** The type of taxes. */
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

            fun build(): Tax =
                Tax(
                    amount,
                    attributes,
                    currency,
                    employer,
                    name,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Attributes
        @JsonCreator
        private constructor(
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun metadata(): Metadata? = metadata.getNullable("metadata")

            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

                metadata()?.validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Attributes]. */
            class Builder internal constructor() {

                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(attributes: Attributes) = apply {
                    metadata = attributes.metadata
                    additionalProperties = attributes.additionalProperties.toMutableMap()
                }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

                fun build(): Attributes = Attributes(metadata, additionalProperties.toImmutable())
            }

            @NoAutoDetect
            class Metadata
            @JsonCreator
            private constructor(
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<InnerMetadata> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                fun metadata(): InnerMetadata? = metadata.getNullable("metadata")

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<InnerMetadata> = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

                    metadata()?.validate()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var metadata: JsonField<InnerMetadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metadata: Metadata) = apply {
                        this.metadata = metadata.metadata
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    fun metadata(metadata: InnerMetadata) = metadata(JsonField.of(metadata))

                    /**
                     * The metadata to be attached to the entity by existing rules. It is a
                     * key-value pairs where the values can be of any type (string, number, boolean,
                     * object, array, etc.).
                     */
                    fun metadata(metadata: JsonField<InnerMetadata>) = apply {
                        this.metadata = metadata
                    }

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

                    fun build(): Metadata = Metadata(metadata, additionalProperties.toImmutable())
                }

                /**
                 * The metadata to be attached to the entity by existing rules. It is a key-value
                 * pairs where the values can be of any type (string, number, boolean, object,
                 * array, etc.).
                 */
                @NoAutoDetect
                class InnerMetadata
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): InnerMetadata = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    /** A builder for [InnerMetadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(innerMetadata: InnerMetadata) = apply {
                            additionalProperties = innerMetadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): InnerMetadata =
                            InnerMetadata(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is InnerMetadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InnerMetadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Metadata && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Metadata{metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Attributes && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Attributes{metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /** The type of taxes. */
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

                val STATE = of("state")

                val FEDERAL = of("federal")

                val LOCAL = of("local")

                val FICA = of("fica")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                STATE,
                FEDERAL,
                LOCAL,
                FICA,
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
                STATE,
                FEDERAL,
                LOCAL,
                FICA,
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
                    STATE -> Value.STATE
                    FEDERAL -> Value.FEDERAL
                    LOCAL -> Value.LOCAL
                    FICA -> Value.FICA
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
                    STATE -> Known.STATE
                    FEDERAL -> Known.FEDERAL
                    LOCAL -> Known.LOCAL
                    FICA -> Known.FICA
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

            return /* spotless:off */ other is Tax && amount == other.amount && attributes == other.attributes && currency == other.currency && employer == other.employer && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, attributes, currency, employer, name, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tax{amount=$amount, attributes=$attributes, currency=$currency, employer=$employer, name=$name, type=$type, additionalProperties=$additionalProperties}"
    }

    /** The type of the payment associated with the pay statement. */
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

            val REGULAR_PAYROLL = of("regular_payroll")

            val OFF_CYCLE_PAYROLL = of("off_cycle_payroll")

            val ONE_TIME_PAYMENT = of("one_time_payment")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            REGULAR_PAYROLL,
            OFF_CYCLE_PAYROLL,
            ONE_TIME_PAYMENT,
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
            REGULAR_PAYROLL,
            OFF_CYCLE_PAYROLL,
            ONE_TIME_PAYMENT,
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
                REGULAR_PAYROLL -> Value.REGULAR_PAYROLL
                OFF_CYCLE_PAYROLL -> Value.OFF_CYCLE_PAYROLL
                ONE_TIME_PAYMENT -> Value.ONE_TIME_PAYMENT
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
                REGULAR_PAYROLL -> Known.REGULAR_PAYROLL
                OFF_CYCLE_PAYROLL -> Known.OFF_CYCLE_PAYROLL
                ONE_TIME_PAYMENT -> Known.ONE_TIME_PAYMENT
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

        return /* spotless:off */ other is PayStatement && earnings == other.earnings && employeeDeductions == other.employeeDeductions && employerContributions == other.employerContributions && grossPay == other.grossPay && individualId == other.individualId && netPay == other.netPay && paymentMethod == other.paymentMethod && taxes == other.taxes && totalHours == other.totalHours && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(earnings, employeeDeductions, employerContributions, grossPay, individualId, netPay, paymentMethod, taxes, totalHours, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayStatement{earnings=$earnings, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, grossPay=$grossPay, individualId=$individualId, netPay=$netPay, paymentMethod=$paymentMethod, taxes=$taxes, totalHours=$totalHours, type=$type, additionalProperties=$additionalProperties}"
}
