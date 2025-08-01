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
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** Add a new sandbox payment */
class SandboxPaymentCreateParams
private constructor(
    private val body: CreateSandboxPaymentRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): LocalDate? = body.endDate()

    /**
     * Array of pay statements to include in the payment.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payStatements(): List<PayStatement>? = body.payStatements()

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): LocalDate? = body.startDate()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<LocalDate> = body._endDate()

    /**
     * Returns the raw JSON value of [payStatements].
     *
     * Unlike [payStatements], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payStatements(): JsonField<List<PayStatement>> = body._payStatements()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<LocalDate> = body._startDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SandboxPaymentCreateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [SandboxPaymentCreateParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [SandboxPaymentCreateParams]. */
    class Builder internal constructor() {

        private var body: CreateSandboxPaymentRequest.Builder =
            CreateSandboxPaymentRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(sandboxPaymentCreateParams: SandboxPaymentCreateParams) = apply {
            body = sandboxPaymentCreateParams.body.toBuilder()
            additionalHeaders = sandboxPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endDate]
         * - [payStatements]
         * - [startDate]
         */
        fun body(body: CreateSandboxPaymentRequest) = apply { this.body = body.toBuilder() }

        fun endDate(endDate: LocalDate) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endDate(endDate: JsonField<LocalDate>) = apply { body.endDate(endDate) }

        /** Array of pay statements to include in the payment. */
        fun payStatements(payStatements: List<PayStatement>) = apply {
            body.payStatements(payStatements)
        }

        /**
         * Sets [Builder.payStatements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payStatements] with a well-typed `List<PayStatement>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payStatements(payStatements: JsonField<List<PayStatement>>) = apply {
            body.payStatements(payStatements)
        }

        /**
         * Adds a single [PayStatement] to [payStatements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayStatement(payStatement: PayStatement) = apply {
            body.addPayStatement(payStatement)
        }

        fun startDate(startDate: LocalDate) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { body.startDate(startDate) }

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

        /**
         * Returns an immutable instance of [SandboxPaymentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SandboxPaymentCreateParams =
            SandboxPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreateSandboxPaymentRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Fields to configure the payment. Takes all fields from the `/payment` endpoint. All fields
     * are optional.
     */
    class CreateSandboxPaymentRequest
    private constructor(
        private val endDate: JsonField<LocalDate>,
        private val payStatements: JsonField<List<PayStatement>>,
        private val startDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("pay_statements")
            @ExcludeMissing
            payStatements: JsonField<List<PayStatement>> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(endDate, payStatements, startDate, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): LocalDate? = endDate.getNullable("end_date")

        /**
         * Array of pay statements to include in the payment.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payStatements(): List<PayStatement>? = payStatements.getNullable("pay_statements")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): LocalDate? = startDate.getNullable("start_date")

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /**
         * Returns the raw JSON value of [payStatements].
         *
         * Unlike [payStatements], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pay_statements")
        @ExcludeMissing
        fun _payStatements(): JsonField<List<PayStatement>> = payStatements

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

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
             * Returns a mutable builder for constructing an instance of
             * [CreateSandboxPaymentRequest].
             */
            fun builder() = Builder()
        }

        /** A builder for [CreateSandboxPaymentRequest]. */
        class Builder internal constructor() {

            private var endDate: JsonField<LocalDate> = JsonMissing.of()
            private var payStatements: JsonField<MutableList<PayStatement>>? = null
            private var startDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(createSandboxPaymentRequest: CreateSandboxPaymentRequest) = apply {
                endDate = createSandboxPaymentRequest.endDate
                payStatements = createSandboxPaymentRequest.payStatements.map { it.toMutableList() }
                startDate = createSandboxPaymentRequest.startDate
                additionalProperties =
                    createSandboxPaymentRequest.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            /** Array of pay statements to include in the payment. */
            fun payStatements(payStatements: List<PayStatement>) =
                payStatements(JsonField.of(payStatements))

            /**
             * Sets [Builder.payStatements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payStatements] with a well-typed
             * `List<PayStatement>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun payStatements(payStatements: JsonField<List<PayStatement>>) = apply {
                this.payStatements = payStatements.map { it.toMutableList() }
            }

            /**
             * Adds a single [PayStatement] to [payStatements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayStatement(payStatement: PayStatement) = apply {
                payStatements =
                    (payStatements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("payStatements", it).add(payStatement)
                    }
            }

            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

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
             * Returns an immutable instance of [CreateSandboxPaymentRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreateSandboxPaymentRequest =
                CreateSandboxPaymentRequest(
                    endDate,
                    (payStatements ?: JsonMissing.of()).map { it.toImmutable() },
                    startDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreateSandboxPaymentRequest = apply {
            if (validated) {
                return@apply
            }

            endDate()
            payStatements()?.forEach { it.validate() }
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
            (if (endDate.asKnown() == null) 0 else 1) +
                (payStatements.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (startDate.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreateSandboxPaymentRequest && endDate == other.endDate && payStatements == other.payStatements && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, payStatements, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateSandboxPaymentRequest{endDate=$endDate, payStatements=$payStatements, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    class PayStatement
    private constructor(
        private val individualId: JsonField<String>,
        private val earnings: JsonField<List<Earning>>,
        private val employeeDeductions: JsonField<List<EmployeeDeduction>>,
        private val employerContributions: JsonField<List<EmployerContribution>>,
        private val grossPay: JsonField<Long>,
        private val netPay: JsonField<Long>,
        private val paymentMethod: JsonField<PaymentMethod>,
        private val taxes: JsonField<List<Tax>>,
        private val totalHours: JsonField<Double>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("individual_id")
            @ExcludeMissing
            individualId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("earnings")
            @ExcludeMissing
            earnings: JsonField<List<Earning>> = JsonMissing.of(),
            @JsonProperty("employee_deductions")
            @ExcludeMissing
            employeeDeductions: JsonField<List<EmployeeDeduction>> = JsonMissing.of(),
            @JsonProperty("employer_contributions")
            @ExcludeMissing
            employerContributions: JsonField<List<EmployerContribution>> = JsonMissing.of(),
            @JsonProperty("gross_pay") @ExcludeMissing grossPay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("net_pay") @ExcludeMissing netPay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("payment_method")
            @ExcludeMissing
            paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
            @JsonProperty("taxes") @ExcludeMissing taxes: JsonField<List<Tax>> = JsonMissing.of(),
            @JsonProperty("total_hours")
            @ExcludeMissing
            totalHours: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            individualId,
            earnings,
            employeeDeductions,
            employerContributions,
            grossPay,
            netPay,
            paymentMethod,
            taxes,
            totalHours,
            type,
            mutableMapOf(),
        )

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun individualId(): String = individualId.getRequired("individual_id")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun earnings(): List<Earning>? = earnings.getNullable("earnings")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employeeDeductions(): List<EmployeeDeduction>? =
            employeeDeductions.getNullable("employee_deductions")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employerContributions(): List<EmployerContribution>? =
            employerContributions.getNullable("employer_contributions")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun grossPay(): Long? = grossPay.getNullable("gross_pay")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun netPay(): Long? = netPay.getNullable("net_pay")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentMethod(): PaymentMethod? = paymentMethod.getNullable("payment_method")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxes(): List<Tax>? = taxes.getNullable("taxes")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalHours(): Double? = totalHours.getNullable("total_hours")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Type? = type.getNullable("type")

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
         * Returns the raw JSON value of [earnings].
         *
         * Unlike [earnings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("earnings")
        @ExcludeMissing
        fun _earnings(): JsonField<List<Earning>> = earnings

        /**
         * Returns the raw JSON value of [employeeDeductions].
         *
         * Unlike [employeeDeductions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("employee_deductions")
        @ExcludeMissing
        fun _employeeDeductions(): JsonField<List<EmployeeDeduction>> = employeeDeductions

        /**
         * Returns the raw JSON value of [employerContributions].
         *
         * Unlike [employerContributions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("employer_contributions")
        @ExcludeMissing
        fun _employerContributions(): JsonField<List<EmployerContribution>> = employerContributions

        /**
         * Returns the raw JSON value of [grossPay].
         *
         * Unlike [grossPay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gross_pay") @ExcludeMissing fun _grossPay(): JsonField<Long> = grossPay

        /**
         * Returns the raw JSON value of [netPay].
         *
         * Unlike [netPay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("net_pay") @ExcludeMissing fun _netPay(): JsonField<Long> = netPay

        /**
         * Returns the raw JSON value of [paymentMethod].
         *
         * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method")
        @ExcludeMissing
        fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

        /**
         * Returns the raw JSON value of [taxes].
         *
         * Unlike [taxes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taxes") @ExcludeMissing fun _taxes(): JsonField<List<Tax>> = taxes

        /**
         * Returns the raw JSON value of [totalHours].
         *
         * Unlike [totalHours], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_hours")
        @ExcludeMissing
        fun _totalHours(): JsonField<Double> = totalHours

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [PayStatement].
             *
             * The following fields are required:
             * ```kotlin
             * .individualId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PayStatement]. */
        class Builder internal constructor() {

            private var individualId: JsonField<String>? = null
            private var earnings: JsonField<MutableList<Earning>>? = null
            private var employeeDeductions: JsonField<MutableList<EmployeeDeduction>>? = null
            private var employerContributions: JsonField<MutableList<EmployerContribution>>? = null
            private var grossPay: JsonField<Long> = JsonMissing.of()
            private var netPay: JsonField<Long> = JsonMissing.of()
            private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
            private var taxes: JsonField<MutableList<Tax>>? = null
            private var totalHours: JsonField<Double> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(payStatement: PayStatement) = apply {
                individualId = payStatement.individualId
                earnings = payStatement.earnings.map { it.toMutableList() }
                employeeDeductions = payStatement.employeeDeductions.map { it.toMutableList() }
                employerContributions =
                    payStatement.employerContributions.map { it.toMutableList() }
                grossPay = payStatement.grossPay
                netPay = payStatement.netPay
                paymentMethod = payStatement.paymentMethod
                taxes = payStatement.taxes.map { it.toMutableList() }
                totalHours = payStatement.totalHours
                type = payStatement.type
                additionalProperties = payStatement.additionalProperties.toMutableMap()
            }

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

            fun earnings(earnings: List<Earning>) = earnings(JsonField.of(earnings))

            /**
             * Sets [Builder.earnings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.earnings] with a well-typed `List<Earning>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun earnings(earnings: JsonField<List<Earning>>) = apply {
                this.earnings = earnings.map { it.toMutableList() }
            }

            /**
             * Adds a single [Earning] to [earnings].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEarning(earning: Earning) = apply {
                earnings =
                    (earnings ?: JsonField.of(mutableListOf())).also {
                        checkKnown("earnings", it).add(earning)
                    }
            }

            fun employeeDeductions(employeeDeductions: List<EmployeeDeduction>) =
                employeeDeductions(JsonField.of(employeeDeductions))

            /**
             * Sets [Builder.employeeDeductions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employeeDeductions] with a well-typed
             * `List<EmployeeDeduction>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun employeeDeductions(employeeDeductions: JsonField<List<EmployeeDeduction>>) = apply {
                this.employeeDeductions = employeeDeductions.map { it.toMutableList() }
            }

            /**
             * Adds a single [EmployeeDeduction] to [employeeDeductions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmployeeDeduction(employeeDeduction: EmployeeDeduction) = apply {
                employeeDeductions =
                    (employeeDeductions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("employeeDeductions", it).add(employeeDeduction)
                    }
            }

            fun employerContributions(employerContributions: List<EmployerContribution>) =
                employerContributions(JsonField.of(employerContributions))

            /**
             * Sets [Builder.employerContributions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employerContributions] with a well-typed
             * `List<EmployerContribution>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun employerContributions(
                employerContributions: JsonField<List<EmployerContribution>>
            ) = apply {
                this.employerContributions = employerContributions.map { it.toMutableList() }
            }

            /**
             * Adds a single [EmployerContribution] to [employerContributions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmployerContribution(employerContribution: EmployerContribution) = apply {
                employerContributions =
                    (employerContributions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("employerContributions", it).add(employerContribution)
                    }
            }

            fun grossPay(grossPay: Long) = grossPay(JsonField.of(grossPay))

            /**
             * Sets [Builder.grossPay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grossPay] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grossPay(grossPay: JsonField<Long>) = apply { this.grossPay = grossPay }

            fun netPay(netPay: Long) = netPay(JsonField.of(netPay))

            /**
             * Sets [Builder.netPay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netPay] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun netPay(netPay: JsonField<Long>) = apply { this.netPay = netPay }

            fun paymentMethod(paymentMethod: PaymentMethod?) =
                paymentMethod(JsonField.ofNullable(paymentMethod))

            /**
             * Sets [Builder.paymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
                this.paymentMethod = paymentMethod
            }

            fun taxes(taxes: List<Tax>) = taxes(JsonField.of(taxes))

            /**
             * Sets [Builder.taxes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxes] with a well-typed `List<Tax>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxes(taxes: JsonField<List<Tax>>) = apply {
                this.taxes = taxes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tax] to [taxes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTax(tax: Tax) = apply {
                taxes =
                    (taxes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("taxes", it).add(tax)
                    }
            }

            fun totalHours(totalHours: Double) = totalHours(JsonField.of(totalHours))

            /**
             * Sets [Builder.totalHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalHours] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalHours(totalHours: JsonField<Double>) = apply { this.totalHours = totalHours }

            fun type(type: Type?) = type(JsonField.ofNullable(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            /**
             * Returns an immutable instance of [PayStatement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .individualId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PayStatement =
                PayStatement(
                    checkRequired("individualId", individualId),
                    (earnings ?: JsonMissing.of()).map { it.toImmutable() },
                    (employeeDeductions ?: JsonMissing.of()).map { it.toImmutable() },
                    (employerContributions ?: JsonMissing.of()).map { it.toImmutable() },
                    grossPay,
                    netPay,
                    paymentMethod,
                    (taxes ?: JsonMissing.of()).map { it.toImmutable() },
                    totalHours,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PayStatement = apply {
            if (validated) {
                return@apply
            }

            individualId()
            earnings()?.forEach { it.validate() }
            employeeDeductions()?.forEach { it.validate() }
            employerContributions()?.forEach { it.validate() }
            grossPay()
            netPay()
            paymentMethod()?.validate()
            taxes()?.forEach { it.validate() }
            totalHours()
            type()?.validate()
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
            (if (individualId.asKnown() == null) 0 else 1) +
                (earnings.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (employeeDeductions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (employerContributions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (grossPay.asKnown() == null) 0 else 1) +
                (if (netPay.asKnown() == null) 0 else 1) +
                (paymentMethod.asKnown()?.validity() ?: 0) +
                (taxes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (totalHours.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0)

        class Earning
        private constructor(
            private val amount: JsonField<Long>,
            private val hours: JsonField<Double>,
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("hours") @ExcludeMissing hours: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, hours, name, type, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Long? = amount.getNullable("amount")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hours(): Double? = hours.getNullable("hours")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Type? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [hours].
             *
             * Unlike [hours], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hours") @ExcludeMissing fun _hours(): JsonField<Double> = hours

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                /** Returns a mutable builder for constructing an instance of [Earning]. */
                fun builder() = Builder()
            }

            /** A builder for [Earning]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var hours: JsonField<Double> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(earning: Earning) = apply {
                    amount = earning.amount
                    hours = earning.hours
                    name = earning.name
                    type = earning.type
                    additionalProperties = earning.additionalProperties.toMutableMap()
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun hours(hours: Double) = hours(JsonField.of(hours))

                /**
                 * Sets [Builder.hours] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hours] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hours(hours: JsonField<Double>) = apply { this.hours = hours }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [Earning].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Earning =
                    Earning(amount, hours, name, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Earning = apply {
                if (validated) {
                    return@apply
                }

                amount()
                hours()
                name()
                type()?.validate()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (hours.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val BONUS = of("bonus")

                    val COMMISSION = of("commission")

                    val DOUBLE_OVERTIME = of("double_overtime")

                    val OTHER = of("other")

                    val OVERTIME = of("overtime")

                    val PTO = of("pto")

                    val REIMBURSEMENT = of("reimbursement")

                    val SALARY = of("salary")

                    val SEVERANCE = of("severance")

                    val SICK = of("sick")

                    val TIPS = of("tips")

                    val WAGE = of("wage")

                    val _1099 = of("1099")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    BONUS,
                    COMMISSION,
                    DOUBLE_OVERTIME,
                    OTHER,
                    OVERTIME,
                    PTO,
                    REIMBURSEMENT,
                    SALARY,
                    SEVERANCE,
                    SICK,
                    TIPS,
                    WAGE,
                    _1099,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BONUS,
                    COMMISSION,
                    DOUBLE_OVERTIME,
                    OTHER,
                    OVERTIME,
                    PTO,
                    REIMBURSEMENT,
                    SALARY,
                    SEVERANCE,
                    SICK,
                    TIPS,
                    WAGE,
                    _1099,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BONUS -> Value.BONUS
                        COMMISSION -> Value.COMMISSION
                        DOUBLE_OVERTIME -> Value.DOUBLE_OVERTIME
                        OTHER -> Value.OTHER
                        OVERTIME -> Value.OVERTIME
                        PTO -> Value.PTO
                        REIMBURSEMENT -> Value.REIMBURSEMENT
                        SALARY -> Value.SALARY
                        SEVERANCE -> Value.SEVERANCE
                        SICK -> Value.SICK
                        TIPS -> Value.TIPS
                        WAGE -> Value.WAGE
                        _1099 -> Value._1099
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
                        BONUS -> Known.BONUS
                        COMMISSION -> Known.COMMISSION
                        DOUBLE_OVERTIME -> Known.DOUBLE_OVERTIME
                        OTHER -> Known.OTHER
                        OVERTIME -> Known.OVERTIME
                        PTO -> Known.PTO
                        REIMBURSEMENT -> Known.REIMBURSEMENT
                        SALARY -> Known.SALARY
                        SEVERANCE -> Known.SEVERANCE
                        SICK -> Known.SICK
                        TIPS -> Known.TIPS
                        WAGE -> Known.WAGE
                        _1099 -> Known._1099
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Earning && amount == other.amount && hours == other.hours && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, hours, name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Earning{amount=$amount, hours=$hours, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        class EmployeeDeduction
        private constructor(
            private val amount: JsonField<Long>,
            private val name: JsonField<String>,
            private val preTax: JsonField<Boolean>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pre_tax")
                @ExcludeMissing
                preTax: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, name, preTax, type, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Long? = amount.getNullable("amount")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun preTax(): Boolean? = preTax.getNullable("pre_tax")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Type? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [preTax].
             *
             * Unlike [preTax], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pre_tax") @ExcludeMissing fun _preTax(): JsonField<Boolean> = preTax

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [EmployeeDeduction].
                 */
                fun builder() = Builder()
            }

            /** A builder for [EmployeeDeduction]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var preTax: JsonField<Boolean> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(employeeDeduction: EmployeeDeduction) = apply {
                    amount = employeeDeduction.amount
                    name = employeeDeduction.name
                    preTax = employeeDeduction.preTax
                    type = employeeDeduction.type
                    additionalProperties = employeeDeduction.additionalProperties.toMutableMap()
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun preTax(preTax: Boolean) = preTax(JsonField.of(preTax))

                /**
                 * Sets [Builder.preTax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preTax] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun preTax(preTax: JsonField<Boolean>) = apply { this.preTax = preTax }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [EmployeeDeduction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EmployeeDeduction =
                    EmployeeDeduction(
                        amount,
                        name,
                        preTax,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EmployeeDeduction = apply {
                if (validated) {
                    return@apply
                }

                amount()
                name()
                preTax()
                type()?.validate()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (preTax.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val _457 = of("457")

                    val _401K = of("401k")

                    val _401K_ROTH = of("401k_roth")

                    val _401K_LOAN = of("401k_loan")

                    val _403B = of("403b")

                    val _403B_ROTH = of("403b_roth")

                    val _457_ROTH = of("457_roth")

                    val COMMUTER = of("commuter")

                    val CUSTOM_POST_TAX = of("custom_post_tax")

                    val CUSTOM_PRE_TAX = of("custom_pre_tax")

                    val FSA_DEPENDENT_CARE = of("fsa_dependent_care")

                    val FSA_MEDICAL = of("fsa_medical")

                    val HSA_POST = of("hsa_post")

                    val HSA_PRE = of("hsa_pre")

                    val S125_DENTAL = of("s125_dental")

                    val S125_MEDICAL = of("s125_medical")

                    val S125_VISION = of("s125_vision")

                    val SIMPLE = of("simple")

                    val SIMPLE_IRA = of("simple_ira")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    _457,
                    _401K,
                    _401K_ROTH,
                    _401K_LOAN,
                    _403B,
                    _403B_ROTH,
                    _457_ROTH,
                    COMMUTER,
                    CUSTOM_POST_TAX,
                    CUSTOM_PRE_TAX,
                    FSA_DEPENDENT_CARE,
                    FSA_MEDICAL,
                    HSA_POST,
                    HSA_PRE,
                    S125_DENTAL,
                    S125_MEDICAL,
                    S125_VISION,
                    SIMPLE,
                    SIMPLE_IRA,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    _457,
                    _401K,
                    _401K_ROTH,
                    _401K_LOAN,
                    _403B,
                    _403B_ROTH,
                    _457_ROTH,
                    COMMUTER,
                    CUSTOM_POST_TAX,
                    CUSTOM_PRE_TAX,
                    FSA_DEPENDENT_CARE,
                    FSA_MEDICAL,
                    HSA_POST,
                    HSA_PRE,
                    S125_DENTAL,
                    S125_MEDICAL,
                    S125_VISION,
                    SIMPLE,
                    SIMPLE_IRA,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        _457 -> Value._457
                        _401K -> Value._401K
                        _401K_ROTH -> Value._401K_ROTH
                        _401K_LOAN -> Value._401K_LOAN
                        _403B -> Value._403B
                        _403B_ROTH -> Value._403B_ROTH
                        _457_ROTH -> Value._457_ROTH
                        COMMUTER -> Value.COMMUTER
                        CUSTOM_POST_TAX -> Value.CUSTOM_POST_TAX
                        CUSTOM_PRE_TAX -> Value.CUSTOM_PRE_TAX
                        FSA_DEPENDENT_CARE -> Value.FSA_DEPENDENT_CARE
                        FSA_MEDICAL -> Value.FSA_MEDICAL
                        HSA_POST -> Value.HSA_POST
                        HSA_PRE -> Value.HSA_PRE
                        S125_DENTAL -> Value.S125_DENTAL
                        S125_MEDICAL -> Value.S125_MEDICAL
                        S125_VISION -> Value.S125_VISION
                        SIMPLE -> Value.SIMPLE
                        SIMPLE_IRA -> Value.SIMPLE_IRA
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
                        _457 -> Known._457
                        _401K -> Known._401K
                        _401K_ROTH -> Known._401K_ROTH
                        _401K_LOAN -> Known._401K_LOAN
                        _403B -> Known._403B
                        _403B_ROTH -> Known._403B_ROTH
                        _457_ROTH -> Known._457_ROTH
                        COMMUTER -> Known.COMMUTER
                        CUSTOM_POST_TAX -> Known.CUSTOM_POST_TAX
                        CUSTOM_PRE_TAX -> Known.CUSTOM_PRE_TAX
                        FSA_DEPENDENT_CARE -> Known.FSA_DEPENDENT_CARE
                        FSA_MEDICAL -> Known.FSA_MEDICAL
                        HSA_POST -> Known.HSA_POST
                        HSA_PRE -> Known.HSA_PRE
                        S125_DENTAL -> Known.S125_DENTAL
                        S125_MEDICAL -> Known.S125_MEDICAL
                        S125_VISION -> Known.S125_VISION
                        SIMPLE -> Known.SIMPLE
                        SIMPLE_IRA -> Known.SIMPLE_IRA
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EmployeeDeduction && amount == other.amount && name == other.name && preTax == other.preTax && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, name, preTax, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmployeeDeduction{amount=$amount, name=$name, preTax=$preTax, type=$type, additionalProperties=$additionalProperties}"
        }

        class EmployerContribution
        private constructor(
            private val amount: JsonField<Long>,
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, name, type, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Long? = amount.getNullable("amount")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Type? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [EmployerContribution].
                 */
                fun builder() = Builder()
            }

            /** A builder for [EmployerContribution]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(employerContribution: EmployerContribution) = apply {
                    amount = employerContribution.amount
                    name = employerContribution.name
                    type = employerContribution.type
                    additionalProperties = employerContribution.additionalProperties.toMutableMap()
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [EmployerContribution].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EmployerContribution =
                    EmployerContribution(amount, name, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): EmployerContribution = apply {
                if (validated) {
                    return@apply
                }

                amount()
                name()
                type()?.validate()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val _457 = of("457")

                    val _401K = of("401k")

                    val _401K_ROTH = of("401k_roth")

                    val _401K_LOAN = of("401k_loan")

                    val _403B = of("403b")

                    val _403B_ROTH = of("403b_roth")

                    val _457_ROTH = of("457_roth")

                    val COMMUTER = of("commuter")

                    val CUSTOM_POST_TAX = of("custom_post_tax")

                    val CUSTOM_PRE_TAX = of("custom_pre_tax")

                    val FSA_DEPENDENT_CARE = of("fsa_dependent_care")

                    val FSA_MEDICAL = of("fsa_medical")

                    val HSA_POST = of("hsa_post")

                    val HSA_PRE = of("hsa_pre")

                    val S125_DENTAL = of("s125_dental")

                    val S125_MEDICAL = of("s125_medical")

                    val S125_VISION = of("s125_vision")

                    val SIMPLE = of("simple")

                    val SIMPLE_IRA = of("simple_ira")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    _457,
                    _401K,
                    _401K_ROTH,
                    _401K_LOAN,
                    _403B,
                    _403B_ROTH,
                    _457_ROTH,
                    COMMUTER,
                    CUSTOM_POST_TAX,
                    CUSTOM_PRE_TAX,
                    FSA_DEPENDENT_CARE,
                    FSA_MEDICAL,
                    HSA_POST,
                    HSA_PRE,
                    S125_DENTAL,
                    S125_MEDICAL,
                    S125_VISION,
                    SIMPLE,
                    SIMPLE_IRA,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    _457,
                    _401K,
                    _401K_ROTH,
                    _401K_LOAN,
                    _403B,
                    _403B_ROTH,
                    _457_ROTH,
                    COMMUTER,
                    CUSTOM_POST_TAX,
                    CUSTOM_PRE_TAX,
                    FSA_DEPENDENT_CARE,
                    FSA_MEDICAL,
                    HSA_POST,
                    HSA_PRE,
                    S125_DENTAL,
                    S125_MEDICAL,
                    S125_VISION,
                    SIMPLE,
                    SIMPLE_IRA,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        _457 -> Value._457
                        _401K -> Value._401K
                        _401K_ROTH -> Value._401K_ROTH
                        _401K_LOAN -> Value._401K_LOAN
                        _403B -> Value._403B
                        _403B_ROTH -> Value._403B_ROTH
                        _457_ROTH -> Value._457_ROTH
                        COMMUTER -> Value.COMMUTER
                        CUSTOM_POST_TAX -> Value.CUSTOM_POST_TAX
                        CUSTOM_PRE_TAX -> Value.CUSTOM_PRE_TAX
                        FSA_DEPENDENT_CARE -> Value.FSA_DEPENDENT_CARE
                        FSA_MEDICAL -> Value.FSA_MEDICAL
                        HSA_POST -> Value.HSA_POST
                        HSA_PRE -> Value.HSA_PRE
                        S125_DENTAL -> Value.S125_DENTAL
                        S125_MEDICAL -> Value.S125_MEDICAL
                        S125_VISION -> Value.S125_VISION
                        SIMPLE -> Value.SIMPLE
                        SIMPLE_IRA -> Value.SIMPLE_IRA
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
                        _457 -> Known._457
                        _401K -> Known._401K
                        _401K_ROTH -> Known._401K_ROTH
                        _401K_LOAN -> Known._401K_LOAN
                        _403B -> Known._403B
                        _403B_ROTH -> Known._403B_ROTH
                        _457_ROTH -> Known._457_ROTH
                        COMMUTER -> Known.COMMUTER
                        CUSTOM_POST_TAX -> Known.CUSTOM_POST_TAX
                        CUSTOM_PRE_TAX -> Known.CUSTOM_PRE_TAX
                        FSA_DEPENDENT_CARE -> Known.FSA_DEPENDENT_CARE
                        FSA_MEDICAL -> Known.FSA_MEDICAL
                        HSA_POST -> Known.HSA_POST
                        HSA_PRE -> Known.HSA_PRE
                        S125_DENTAL -> Known.S125_DENTAL
                        S125_MEDICAL -> Known.S125_MEDICAL
                        S125_VISION -> Known.S125_VISION
                        SIMPLE -> Known.SIMPLE
                        SIMPLE_IRA -> Known.SIMPLE_IRA
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EmployerContribution && amount == other.amount && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmployerContribution{amount=$amount, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        class PaymentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val CHECK = of("check")

                val DIRECT_DEPOSIT = of("direct_deposit")

                val OTHER = of("other")

                fun of(value: String) = PaymentMethod(JsonField.of(value))
            }

            /** An enum containing [PaymentMethod]'s known values. */
            enum class Known {
                CHECK,
                DIRECT_DEPOSIT,
                OTHER,
            }

            /**
             * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECK,
                DIRECT_DEPOSIT,
                OTHER,
                /**
                 * An enum member indicating that [PaymentMethod] was instantiated with an unknown
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
                    CHECK -> Value.CHECK
                    DIRECT_DEPOSIT -> Value.DIRECT_DEPOSIT
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
                    CHECK -> Known.CHECK
                    DIRECT_DEPOSIT -> Known.DIRECT_DEPOSIT
                    OTHER -> Known.OTHER
                    else -> throw FinchInvalidDataException("Unknown PaymentMethod: $value")
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

            private var validated: Boolean = false

            fun validate(): PaymentMethod = apply {
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

                return /* spotless:off */ other is PaymentMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Tax
        private constructor(
            private val amount: JsonField<Long>,
            private val employer: JsonField<Boolean>,
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("employer")
                @ExcludeMissing
                employer: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(amount, employer, name, type, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amount(): Long? = amount.getNullable("amount")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun employer(): Boolean? = employer.getNullable("employer")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Type? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [employer].
             *
             * Unlike [employer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("employer") @ExcludeMissing fun _employer(): JsonField<Boolean> = employer

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                /** Returns a mutable builder for constructing an instance of [Tax]. */
                fun builder() = Builder()
            }

            /** A builder for [Tax]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var employer: JsonField<Boolean> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tax: Tax) = apply {
                    amount = tax.amount
                    employer = tax.employer
                    name = tax.name
                    type = tax.type
                    additionalProperties = tax.additionalProperties.toMutableMap()
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun employer(employer: Boolean) = employer(JsonField.of(employer))

                /**
                 * Sets [Builder.employer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.employer] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun employer(employer: JsonField<Boolean>) = apply { this.employer = employer }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [Tax].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Tax =
                    Tax(amount, employer, name, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Tax = apply {
                if (validated) {
                    return@apply
                }

                amount()
                employer()
                name()
                type()?.validate()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (employer.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val FEDERAL = of("federal")

                    val FICA = of("fica")

                    val LOCAL = of("local")

                    val STATE = of("state")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FEDERAL,
                    FICA,
                    LOCAL,
                    STATE,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FEDERAL,
                    FICA,
                    LOCAL,
                    STATE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FEDERAL -> Value.FEDERAL
                        FICA -> Value.FICA
                        LOCAL -> Value.LOCAL
                        STATE -> Value.STATE
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
                        FEDERAL -> Known.FEDERAL
                        FICA -> Known.FICA
                        LOCAL -> Known.LOCAL
                        STATE -> Known.STATE
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tax && amount == other.amount && employer == other.employer && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, employer, name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tax{amount=$amount, employer=$employer, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

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

                val OFF_CYCLE_PAYROLL = of("off_cycle_payroll")

                val ONE_TIME_PAYMENT = of("one_time_payment")

                val REGULAR_PAYROLL = of("regular_payroll")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                OFF_CYCLE_PAYROLL,
                ONE_TIME_PAYMENT,
                REGULAR_PAYROLL,
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
                OFF_CYCLE_PAYROLL,
                ONE_TIME_PAYMENT,
                REGULAR_PAYROLL,
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
                    OFF_CYCLE_PAYROLL -> Value.OFF_CYCLE_PAYROLL
                    ONE_TIME_PAYMENT -> Value.ONE_TIME_PAYMENT
                    REGULAR_PAYROLL -> Value.REGULAR_PAYROLL
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
                    OFF_CYCLE_PAYROLL -> Known.OFF_CYCLE_PAYROLL
                    ONE_TIME_PAYMENT -> Known.ONE_TIME_PAYMENT
                    REGULAR_PAYROLL -> Known.REGULAR_PAYROLL
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

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PayStatement && individualId == other.individualId && earnings == other.earnings && employeeDeductions == other.employeeDeductions && employerContributions == other.employerContributions && grossPay == other.grossPay && netPay == other.netPay && paymentMethod == other.paymentMethod && taxes == other.taxes && totalHours == other.totalHours && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(individualId, earnings, employeeDeductions, employerContributions, grossPay, netPay, paymentMethod, taxes, totalHours, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PayStatement{individualId=$individualId, earnings=$earnings, employeeDeductions=$employeeDeductions, employerContributions=$employerContributions, grossPay=$grossPay, netPay=$netPay, paymentMethod=$paymentMethod, taxes=$taxes, totalHours=$totalHours, type=$type, additionalProperties=$additionalProperties}"
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
