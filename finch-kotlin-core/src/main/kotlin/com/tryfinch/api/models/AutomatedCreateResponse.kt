// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = AutomatedCreateResponse.Builder::class)
@NoAutoDetect
class AutomatedCreateResponse
private constructor(
    private val jobId: JsonField<String>,
    private val jobUrl: JsonField<String>,
    private val allowedRefreshes: JsonField<Long>,
    private val remainingRefreshes: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The id of the job that has been created. */
    fun jobId(): String = jobId.getRequired("job_id")

    /** The url that can be used to retrieve the job status */
    fun jobUrl(): String = jobUrl.getRequired("job_url")

    /** The number of allowed refreshes per hour (per hour, fixed window) */
    fun allowedRefreshes(): Long = allowedRefreshes.getRequired("allowed_refreshes")

    /** The number of remaining refreshes available (per hour, fixed window) */
    fun remainingRefreshes(): Long = remainingRefreshes.getRequired("remaining_refreshes")

    /** The id of the job that has been created. */
    @JsonProperty("job_id") @ExcludeMissing fun _jobId() = jobId

    /** The url that can be used to retrieve the job status */
    @JsonProperty("job_url") @ExcludeMissing fun _jobUrl() = jobUrl

    /** The number of allowed refreshes per hour (per hour, fixed window) */
    @JsonProperty("allowed_refreshes") @ExcludeMissing fun _allowedRefreshes() = allowedRefreshes

    /** The number of remaining refreshes available (per hour, fixed window) */
    @JsonProperty("remaining_refreshes")
    @ExcludeMissing
    fun _remainingRefreshes() = remainingRefreshes

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AutomatedCreateResponse = apply {
        if (!validated) {
            jobId()
            jobUrl()
            allowedRefreshes()
            remainingRefreshes()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var jobId: JsonField<String> = JsonMissing.of()
        private var jobUrl: JsonField<String> = JsonMissing.of()
        private var allowedRefreshes: JsonField<Long> = JsonMissing.of()
        private var remainingRefreshes: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(automatedCreateResponse: AutomatedCreateResponse) = apply {
            this.jobId = automatedCreateResponse.jobId
            this.jobUrl = automatedCreateResponse.jobUrl
            this.allowedRefreshes = automatedCreateResponse.allowedRefreshes
            this.remainingRefreshes = automatedCreateResponse.remainingRefreshes
            additionalProperties(automatedCreateResponse.additionalProperties)
        }

        /** The id of the job that has been created. */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /** The id of the job that has been created. */
        @JsonProperty("job_id")
        @ExcludeMissing
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** The url that can be used to retrieve the job status */
        fun jobUrl(jobUrl: String) = jobUrl(JsonField.of(jobUrl))

        /** The url that can be used to retrieve the job status */
        @JsonProperty("job_url")
        @ExcludeMissing
        fun jobUrl(jobUrl: JsonField<String>) = apply { this.jobUrl = jobUrl }

        /** The number of allowed refreshes per hour (per hour, fixed window) */
        fun allowedRefreshes(allowedRefreshes: Long) =
            allowedRefreshes(JsonField.of(allowedRefreshes))

        /** The number of allowed refreshes per hour (per hour, fixed window) */
        @JsonProperty("allowed_refreshes")
        @ExcludeMissing
        fun allowedRefreshes(allowedRefreshes: JsonField<Long>) = apply {
            this.allowedRefreshes = allowedRefreshes
        }

        /** The number of remaining refreshes available (per hour, fixed window) */
        fun remainingRefreshes(remainingRefreshes: Long) =
            remainingRefreshes(JsonField.of(remainingRefreshes))

        /** The number of remaining refreshes available (per hour, fixed window) */
        @JsonProperty("remaining_refreshes")
        @ExcludeMissing
        fun remainingRefreshes(remainingRefreshes: JsonField<Long>) = apply {
            this.remainingRefreshes = remainingRefreshes
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

        fun build(): AutomatedCreateResponse =
            AutomatedCreateResponse(
                jobId,
                jobUrl,
                allowedRefreshes,
                remainingRefreshes,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AutomatedCreateResponse && jobId == other.jobId && jobUrl == other.jobUrl && allowedRefreshes == other.allowedRefreshes && remainingRefreshes == other.remainingRefreshes && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(jobId, jobUrl, allowedRefreshes, remainingRefreshes, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutomatedCreateResponse{jobId=$jobId, jobUrl=$jobUrl, allowedRefreshes=$allowedRefreshes, remainingRefreshes=$remainingRefreshes, additionalProperties=$additionalProperties}"
}
