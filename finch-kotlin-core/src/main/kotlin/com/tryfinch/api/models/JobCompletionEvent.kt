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

@JsonDeserialize(builder = JobCompletionEvent.Builder::class)
@NoAutoDetect
class JobCompletionEvent
private constructor(
    private val companyId: JsonField<String>,
    private val accountId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val data: JsonField<Data>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique Finch id of the company for which data has been updated. */
    fun companyId(): String = companyId.getRequired("company_id")

    /** Unique Finch id of the employer account that was used to make this connection. */
    fun accountId(): String = accountId.getRequired("account_id")

    fun eventType(): EventType? = eventType.getNullable("event_type")

    fun data(): Data? = data.getNullable("data")

    fun toBaseWebhookEvent(): BaseWebhookEvent =
        BaseWebhookEvent.builder().companyId(companyId).accountId(accountId).build()

    /** Unique Finch id of the company for which data has been updated. */
    @JsonProperty("company_id") @ExcludeMissing fun _companyId() = companyId

    /** Unique Finch id of the employer account that was used to make this connection. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): JobCompletionEvent = apply {
        if (!validated) {
            companyId()
            accountId()
            eventType()
            data()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobCompletionEvent &&
            this.companyId == other.companyId &&
            this.accountId == other.accountId &&
            this.eventType == other.eventType &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    companyId,
                    accountId,
                    eventType,
                    data,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "JobCompletionEvent{companyId=$companyId, accountId=$accountId, eventType=$eventType, data=$data, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var companyId: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<EventType> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(jobCompletionEvent: JobCompletionEvent) = apply {
            this.companyId = jobCompletionEvent.companyId
            this.accountId = jobCompletionEvent.accountId
            this.eventType = jobCompletionEvent.eventType
            this.data = jobCompletionEvent.data
            additionalProperties(jobCompletionEvent.additionalProperties)
        }

        /** Unique Finch id of the company for which data has been updated. */
        fun companyId(companyId: String) = companyId(JsonField.of(companyId))

        /** Unique Finch id of the company for which data has been updated. */
        @JsonProperty("company_id")
        @ExcludeMissing
        fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

        /** Unique Finch id of the employer account that was used to make this connection. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** Unique Finch id of the employer account that was used to make this connection. */
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
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): JobCompletionEvent =
            JobCompletionEvent(
                companyId,
                accountId,
                eventType,
                data,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val jobId: JsonField<String>,
        private val jobUrl: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The id of the job which has completed. */
        fun jobId(): String = jobId.getRequired("job_id")

        /** The url to query the result of the job. */
        fun jobUrl(): String = jobUrl.getRequired("job_url")

        /** The id of the job which has completed. */
        @JsonProperty("job_id") @ExcludeMissing fun _jobId() = jobId

        /** The url to query the result of the job. */
        @JsonProperty("job_url") @ExcludeMissing fun _jobUrl() = jobUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                jobId()
                jobUrl()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.jobId == other.jobId &&
                this.jobUrl == other.jobUrl &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        jobId,
                        jobUrl,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{jobId=$jobId, jobUrl=$jobUrl, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var jobId: JsonField<String> = JsonMissing.of()
            private var jobUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                this.jobId = data.jobId
                this.jobUrl = data.jobUrl
                additionalProperties(data.additionalProperties)
            }

            /** The id of the job which has completed. */
            fun jobId(jobId: String) = jobId(JsonField.of(jobId))

            /** The id of the job which has completed. */
            @JsonProperty("job_id")
            @ExcludeMissing
            fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

            /** The url to query the result of the job. */
            fun jobUrl(jobUrl: String) = jobUrl(JsonField.of(jobUrl))

            /** The url to query the result of the job. */
            @JsonProperty("job_url")
            @ExcludeMissing
            fun jobUrl(jobUrl: JsonField<String>) = apply { this.jobUrl = jobUrl }

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

            fun build(): Data =
                Data(
                    jobId,
                    jobUrl,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class EventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val JOB_BENEFIT_CREATE_UPDATED = EventType(JsonField.of("job.benefit_create.updated"))

            val JOB_BENEFIT_ENROLL_UPDATED = EventType(JsonField.of("job.benefit_enroll.updated"))

            val JOB_BENEFIT_REGISTER_UPDATED =
                EventType(JsonField.of("job.benefit_register.updated"))

            val JOB_BENEFIT_UNENROLL_UPDATED =
                EventType(JsonField.of("job.benefit_unenroll.updated"))

            val JOB_BENEFIT_UPDATE_UPDATED = EventType(JsonField.of("job.benefit_update.updated"))

            val JOB_DATA_SYNC_ALL_UPDATED = EventType(JsonField.of("job.data_sync_all.updated"))

            fun of(value: String) = EventType(JsonField.of(value))
        }

        enum class Known {
            JOB_BENEFIT_CREATE_UPDATED,
            JOB_BENEFIT_ENROLL_UPDATED,
            JOB_BENEFIT_REGISTER_UPDATED,
            JOB_BENEFIT_UNENROLL_UPDATED,
            JOB_BENEFIT_UPDATE_UPDATED,
            JOB_DATA_SYNC_ALL_UPDATED,
        }

        enum class Value {
            JOB_BENEFIT_CREATE_UPDATED,
            JOB_BENEFIT_ENROLL_UPDATED,
            JOB_BENEFIT_REGISTER_UPDATED,
            JOB_BENEFIT_UNENROLL_UPDATED,
            JOB_BENEFIT_UPDATE_UPDATED,
            JOB_DATA_SYNC_ALL_UPDATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                JOB_BENEFIT_CREATE_UPDATED -> Value.JOB_BENEFIT_CREATE_UPDATED
                JOB_BENEFIT_ENROLL_UPDATED -> Value.JOB_BENEFIT_ENROLL_UPDATED
                JOB_BENEFIT_REGISTER_UPDATED -> Value.JOB_BENEFIT_REGISTER_UPDATED
                JOB_BENEFIT_UNENROLL_UPDATED -> Value.JOB_BENEFIT_UNENROLL_UPDATED
                JOB_BENEFIT_UPDATE_UPDATED -> Value.JOB_BENEFIT_UPDATE_UPDATED
                JOB_DATA_SYNC_ALL_UPDATED -> Value.JOB_DATA_SYNC_ALL_UPDATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                JOB_BENEFIT_CREATE_UPDATED -> Known.JOB_BENEFIT_CREATE_UPDATED
                JOB_BENEFIT_ENROLL_UPDATED -> Known.JOB_BENEFIT_ENROLL_UPDATED
                JOB_BENEFIT_REGISTER_UPDATED -> Known.JOB_BENEFIT_REGISTER_UPDATED
                JOB_BENEFIT_UNENROLL_UPDATED -> Known.JOB_BENEFIT_UNENROLL_UPDATED
                JOB_BENEFIT_UPDATE_UPDATED -> Known.JOB_BENEFIT_UPDATE_UPDATED
                JOB_DATA_SYNC_ALL_UPDATED -> Known.JOB_DATA_SYNC_ALL_UPDATED
                else -> throw FinchInvalidDataException("Unknown EventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
