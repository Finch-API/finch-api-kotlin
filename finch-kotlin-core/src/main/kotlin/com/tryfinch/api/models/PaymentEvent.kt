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
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = PaymentEvent.Builder::class)
@NoAutoDetect
class PaymentEvent
private constructor(
    private val connectionId: JsonField<String>,
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val data: JsonField<PaymentIdentifiers>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Unique Finch ID of the connection associated with the webhook event. */
    fun connectionId(): String? = connectionId.getNullable("connection_id")

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun companyId(): String = companyId.getRequired("company_id")

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    fun accountId(): String = accountId.getRequired("account_id")

    fun eventType(): EventType? = eventType.getNullable("event_type")

    fun data(): PaymentIdentifiers? = data.getNullable("data")

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .connectionId(connectionId)
            .companyId(companyId)
            .accountId(accountId)
            .build()

    /** Unique Finch ID of the connection associated with the webhook event. */
    @JsonProperty("connection_id") @ExcludeMissing fun _connectionId() = connectionId

    /**
     * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /**
     * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
     * `connection_id` instead to identify the connection associated with this event.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PaymentEvent = apply {
        if (!validated) {
            connectionId()
            companyId()
            accountId()
            eventType()
            data()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var connectionId: JsonField<String> = JsonMissing.of()
        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var data: JsonField<PaymentIdentifiers> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentEvent: PaymentEvent) = apply {
            this.connectionId = paymentEvent.connectionId
            this.companyId = paymentEvent.companyId
            this.accountId = paymentEvent.accountId
            this.eventType = paymentEvent.eventType
            this.data = paymentEvent.data
            additionalProperties(paymentEvent.additionalProperties)
        }

        /** Unique Finch ID of the connection associated with the webhook event. */
        fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

        /** Unique Finch ID of the connection associated with the webhook event. */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun connectionId(connectionId: JsonField<String>) = apply {
            this.connectionId = connectionId
        }

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /**
         * [DEPRECATED] Unique Finch ID of the company for which data has been updated. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * [DEPRECATED] Unique Finch ID of the employer account used to make this connection. Use
         * `connection_id` instead to identify the connection associated with this event.
         */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        @JsonProperty("event_type")
        @ExcludeMissing
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun data(data: PaymentIdentifiers) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<PaymentIdentifiers>) = apply { this.data = data }

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

        fun build(): PaymentEvent =
            PaymentEvent(
                connectionId,
                companyId,
                accountId,
                eventType,
                data,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = PaymentIdentifiers.Builder::class)
    @NoAutoDetect
    class PaymentIdentifiers
    private constructor(
        private val paymentId: JsonField<String>,
        private val payDate: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The ID of the payment. */
        fun paymentId(): String = paymentId.getRequired("payment_id")

        /** The date of the payment. */
        fun payDate(): String = payDate.getRequired("pay_date")

        /** The ID of the payment. */
        @JsonProperty("payment_id") @ExcludeMissing fun _paymentId() = paymentId

        /** The date of the payment. */
        @JsonProperty("pay_date") @ExcludeMissing fun _payDate() = payDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PaymentIdentifiers = apply {
            if (!validated) {
                paymentId()
                payDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var paymentId: JsonField<String> = JsonMissing.of()
            private var payDate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentIdentifiers: PaymentIdentifiers) = apply {
                this.paymentId = paymentIdentifiers.paymentId
                this.payDate = paymentIdentifiers.payDate
                additionalProperties(paymentIdentifiers.additionalProperties)
            }

            /** The ID of the payment. */
            fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

            /** The ID of the payment. */
            @JsonProperty("payment_id")
            @ExcludeMissing
            fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

            /** The date of the payment. */
            fun payDate(payDate: String) = payDate(JsonField.of(payDate))

            /** The date of the payment. */
            @JsonProperty("pay_date")
            @ExcludeMissing
            fun payDate(payDate: JsonField<String>) = apply { this.payDate = payDate }

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

            fun build(): PaymentIdentifiers =
                PaymentIdentifiers(
                    paymentId,
                    payDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentIdentifiers && paymentId == other.paymentId && payDate == other.payDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(paymentId, payDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentIdentifiers{paymentId=$paymentId, payDate=$payDate, additionalProperties=$additionalProperties}"
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PAYMENT_CREATED = of("payment.created")

            val PAYMENT_UPDATED = of("payment.updated")

            val PAYMENT_DELETED = of("payment.deleted")

            fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            PAYMENT_CREATED,
            PAYMENT_UPDATED,
            PAYMENT_DELETED,
        }

        enum class Value {
            PAYMENT_CREATED,
            PAYMENT_UPDATED,
            PAYMENT_DELETED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT_CREATED -> Value.PAYMENT_CREATED
                PAYMENT_UPDATED -> Value.PAYMENT_UPDATED
                PAYMENT_DELETED -> Value.PAYMENT_DELETED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT_CREATED -> Known.PAYMENT_CREATED
                PAYMENT_UPDATED -> Known.PAYMENT_UPDATED
                PAYMENT_DELETED -> Known.PAYMENT_DELETED
                else -> throw FinchInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentEvent && connectionId == other.connectionId && companyId == other.companyId && accountId == other.accountId && eventType == other.eventType && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(connectionId, companyId, accountId, eventType, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentEvent{connectionId=$connectionId, companyId=$companyId, accountId=$accountId, eventType=$eventType, data=$data, additionalProperties=$additionalProperties}"
}
