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

@JsonDeserialize(builder = ManualAsyncJob.Builder::class)
@NoAutoDetect
class ManualAsyncJob
private constructor(
    private val jobId: JsonField<String>,
    private val status: JsonField<Status>,
    private val body: JsonField<List<JsonValue>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun jobId(): String = jobId.getRequired("job_id")

    fun status(): Status = status.getRequired("status")

    /** Specific information about the job, such as individual statuses for batch jobs. */
    fun body(): List<JsonValue>? = body.getNullable("body")

    @JsonProperty("job_id") @ExcludeMissing fun _jobId() = jobId

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Specific information about the job, such as individual statuses for batch jobs. */
    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ManualAsyncJob = apply {
        if (!validated) {
            jobId()
            status()
            body()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManualAsyncJob &&
            this.jobId == other.jobId &&
            this.status == other.status &&
            this.body == other.body &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    jobId,
                    status,
                    body,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ManualAsyncJob{jobId=$jobId, status=$status, body=$body, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var jobId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var body: JsonField<List<JsonValue>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(manualAsyncJob: ManualAsyncJob) = apply {
            this.jobId = manualAsyncJob.jobId
            this.status = manualAsyncJob.status
            this.body = manualAsyncJob.body
            additionalProperties(manualAsyncJob.additionalProperties)
        }

        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        @JsonProperty("job_id")
        @ExcludeMissing
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Specific information about the job, such as individual statuses for batch jobs. */
        fun body(body: List<JsonValue>) = body(JsonField.of(body))

        /** Specific information about the job, such as individual statuses for batch jobs. */
        @JsonProperty("body")
        @ExcludeMissing
        fun body(body: JsonField<List<JsonValue>>) = apply { this.body = body }

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

        fun build(): ManualAsyncJob =
            ManualAsyncJob(
                jobId,
                status,
                body.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PENDING = Status(JsonField.of("pending"))

            val IN_PROGRESS = Status(JsonField.of("in_progress"))

            val ERROR = Status(JsonField.of("error"))

            val COMPLETE = Status(JsonField.of("complete"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            IN_PROGRESS,
            ERROR,
            COMPLETE,
        }

        enum class Value {
            PENDING,
            IN_PROGRESS,
            ERROR,
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                IN_PROGRESS -> Value.IN_PROGRESS
                ERROR -> Value.ERROR
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                IN_PROGRESS -> Known.IN_PROGRESS
                ERROR -> Known.ERROR
                COMPLETE -> Known.COMPLETE
                else -> throw FinchInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
