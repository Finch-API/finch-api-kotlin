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
class SandboxJobConfiguration
@JsonCreator
private constructor(
    @JsonProperty("completion_status")
    @ExcludeMissing
    private val completionStatus: JsonField<CompletionStatus> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun completionStatus(): CompletionStatus = completionStatus.getRequired("completion_status")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("completion_status")
    @ExcludeMissing
    fun _completionStatus(): JsonField<CompletionStatus> = completionStatus

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SandboxJobConfiguration = apply {
        if (validated) {
            return@apply
        }

        completionStatus()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var completionStatus: JsonField<CompletionStatus>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(sandboxJobConfiguration: SandboxJobConfiguration) = apply {
            completionStatus = sandboxJobConfiguration.completionStatus
            type = sandboxJobConfiguration.type
            additionalProperties = sandboxJobConfiguration.additionalProperties.toMutableMap()
        }

        fun completionStatus(completionStatus: CompletionStatus) =
            completionStatus(JsonField.of(completionStatus))

        fun completionStatus(completionStatus: JsonField<CompletionStatus>) = apply {
            this.completionStatus = completionStatus
        }

        fun type(type: Type) = type(JsonField.of(type))

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

        fun build(): SandboxJobConfiguration =
            SandboxJobConfiguration(
                checkNotNull(completionStatus) { "`completionStatus` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    class CompletionStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val COMPLETE = of("complete")

            val REAUTH_ERROR = of("reauth_error")

            val PERMISSIONS_ERROR = of("permissions_error")

            val ERROR = of("error")

            fun of(value: String) = CompletionStatus(JsonField.of(value))
        }

        enum class Known {
            COMPLETE,
            REAUTH_ERROR,
            PERMISSIONS_ERROR,
            ERROR,
        }

        enum class Value {
            COMPLETE,
            REAUTH_ERROR,
            PERMISSIONS_ERROR,
            ERROR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPLETE -> Value.COMPLETE
                REAUTH_ERROR -> Value.REAUTH_ERROR
                PERMISSIONS_ERROR -> Value.PERMISSIONS_ERROR
                ERROR -> Value.ERROR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPLETE -> Known.COMPLETE
                REAUTH_ERROR -> Known.REAUTH_ERROR
                PERMISSIONS_ERROR -> Known.PERMISSIONS_ERROR
                ERROR -> Known.ERROR
                else -> throw FinchInvalidDataException("Unknown CompletionStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CompletionStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DATA_SYNC_ALL = of("data_sync_all")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DATA_SYNC_ALL,
        }

        enum class Value {
            DATA_SYNC_ALL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DATA_SYNC_ALL -> Value.DATA_SYNC_ALL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DATA_SYNC_ALL -> Known.DATA_SYNC_ALL
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

        return /* spotless:off */ other is SandboxJobConfiguration && completionStatus == other.completionStatus && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completionStatus, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SandboxJobConfiguration{completionStatus=$completionStatus, type=$type, additionalProperties=$additionalProperties}"
}
