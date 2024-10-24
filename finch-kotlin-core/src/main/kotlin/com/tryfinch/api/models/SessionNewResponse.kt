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
import com.tryfinch.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = SessionNewResponse.Builder::class)
@NoAutoDetect
class SessionNewResponse
private constructor(
    private val sessionId: JsonField<String>,
    private val connectUrl: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The unique identifier for the created connect session */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /** The Connect URL to redirect the user to for authentication */
    fun connectUrl(): String = connectUrl.getRequired("connect_url")

    /** The unique identifier for the created connect session */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId() = sessionId

    /** The Connect URL to redirect the user to for authentication */
    @JsonProperty("connect_url") @ExcludeMissing fun _connectUrl() = connectUrl

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SessionNewResponse = apply {
        if (!validated) {
            sessionId()
            connectUrl()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionNewResponse &&
            this.sessionId == other.sessionId &&
            this.connectUrl == other.connectUrl &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    sessionId,
                    connectUrl,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "SessionNewResponse{sessionId=$sessionId, connectUrl=$connectUrl, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var sessionId: JsonField<String> = JsonMissing.of()
        private var connectUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(sessionNewResponse: SessionNewResponse) = apply {
            this.sessionId = sessionNewResponse.sessionId
            this.connectUrl = sessionNewResponse.connectUrl
            additionalProperties(sessionNewResponse.additionalProperties)
        }

        /** The unique identifier for the created connect session */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /** The unique identifier for the created connect session */
        @JsonProperty("session_id")
        @ExcludeMissing
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /** The Connect URL to redirect the user to for authentication */
        fun connectUrl(connectUrl: String) = connectUrl(JsonField.of(connectUrl))

        /** The Connect URL to redirect the user to for authentication */
        @JsonProperty("connect_url")
        @ExcludeMissing
        fun connectUrl(connectUrl: JsonField<String>) = apply { this.connectUrl = connectUrl }

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

        fun build(): SessionNewResponse =
            SessionNewResponse(
                sessionId,
                connectUrl,
                additionalProperties.toUnmodifiable(),
            )
    }
}
