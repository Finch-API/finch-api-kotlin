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

@JsonDeserialize(builder = IndividualEvent.Builder::class)
@NoAutoDetect
class IndividualEvent
private constructor(
    private val connectionId: JsonField<String>,
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

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

    fun data(): Data? = data.getNullable("data")

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

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder()
            .connectionId(connectionId)
            .companyId(companyId)
            .accountId(accountId)
            .build()

    private var validated: Boolean = false

    fun validate(): IndividualEvent = apply {
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
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(individualEvent: IndividualEvent) = apply {
            connectionId = individualEvent.connectionId
            companyId = individualEvent.companyId
            accountId = individualEvent.accountId
            eventType = individualEvent.eventType
            data = individualEvent.data
            additionalProperties = individualEvent.additionalProperties.toMutableMap()
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

        fun data(data: Data) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): IndividualEvent =
            IndividualEvent(
                connectionId,
                companyId,
                accountId,
                eventType,
                data,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val individualId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The ID of the individual related to the event. */
        fun individualId(): String? = individualId.getNullable("individual_id")

        /** The ID of the individual related to the event. */
        @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                individualId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var individualId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                individualId = data.individualId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The ID of the individual related to the event. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /** The ID of the individual related to the event. */
            @JsonProperty("individual_id")
            @ExcludeMissing
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Data = Data(individualId, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(individualId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{individualId=$individualId, additionalProperties=$additionalProperties}"
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INDIVIDUAL_CREATED = of("individual.created")

            val INDIVIDUAL_UPDATED = of("individual.updated")

            val INDIVIDUAL_DELETED = of("individual.deleted")

            fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            INDIVIDUAL_CREATED,
            INDIVIDUAL_UPDATED,
            INDIVIDUAL_DELETED,
        }

        enum class Value {
            INDIVIDUAL_CREATED,
            INDIVIDUAL_UPDATED,
            INDIVIDUAL_DELETED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INDIVIDUAL_CREATED -> Value.INDIVIDUAL_CREATED
                INDIVIDUAL_UPDATED -> Value.INDIVIDUAL_UPDATED
                INDIVIDUAL_DELETED -> Value.INDIVIDUAL_DELETED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INDIVIDUAL_CREATED -> Known.INDIVIDUAL_CREATED
                INDIVIDUAL_UPDATED -> Known.INDIVIDUAL_UPDATED
                INDIVIDUAL_DELETED -> Known.INDIVIDUAL_DELETED
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

        return /* spotless:off */ other is IndividualEvent && connectionId == other.connectionId && companyId == other.companyId && accountId == other.accountId && eventType == other.eventType && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(connectionId, companyId, accountId, eventType, data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndividualEvent{connectionId=$connectionId, companyId=$companyId, accountId=$accountId, eventType=$eventType, data=$data, additionalProperties=$additionalProperties}"
}
