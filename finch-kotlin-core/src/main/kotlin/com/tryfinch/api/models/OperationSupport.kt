// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.errors.FinchInvalidDataException

class OperationSupport
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OperationSupport && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val SUPPORTED = OperationSupport(JsonField.of("supported"))

        val NOT_SUPPORTED_BY_FINCH = OperationSupport(JsonField.of("not_supported_by_finch"))

        val NOT_SUPPORTED_BY_PROVIDER = OperationSupport(JsonField.of("not_supported_by_provider"))

        val CLIENT_ACCESS_ONLY = OperationSupport(JsonField.of("client_access_only"))

        fun of(value: String) = OperationSupport(JsonField.of(value))
    }

    enum class Known {
        SUPPORTED,
        NOT_SUPPORTED_BY_FINCH,
        NOT_SUPPORTED_BY_PROVIDER,
        CLIENT_ACCESS_ONLY,
    }

    enum class Value {
        SUPPORTED,
        NOT_SUPPORTED_BY_FINCH,
        NOT_SUPPORTED_BY_PROVIDER,
        CLIENT_ACCESS_ONLY,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            SUPPORTED -> Value.SUPPORTED
            NOT_SUPPORTED_BY_FINCH -> Value.NOT_SUPPORTED_BY_FINCH
            NOT_SUPPORTED_BY_PROVIDER -> Value.NOT_SUPPORTED_BY_PROVIDER
            CLIENT_ACCESS_ONLY -> Value.CLIENT_ACCESS_ONLY
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            SUPPORTED -> Known.SUPPORTED
            NOT_SUPPORTED_BY_FINCH -> Known.NOT_SUPPORTED_BY_FINCH
            NOT_SUPPORTED_BY_PROVIDER -> Known.NOT_SUPPORTED_BY_PROVIDER
            CLIENT_ACCESS_ONLY -> Known.CLIENT_ACCESS_ONLY
            else -> throw FinchInvalidDataException("Unknown OperationSupport: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
