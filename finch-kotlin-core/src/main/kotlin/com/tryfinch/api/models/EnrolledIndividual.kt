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

@JsonDeserialize(builder = EnrolledIndividual.Builder::class)
@NoAutoDetect
class EnrolledIndividual
private constructor(
    private val individualId: JsonField<String>,
    private val code: JsonField<Code>,
    private val body: JsonField<Body>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun individualId(): String? = individualId.getNullable("individual_id")

    /** HTTP status code. Either 201 or 200 */
    fun code(): Code? = code.getNullable("code")

    fun body(): Body? = body.getNullable("body")

    @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

    /** HTTP status code. Either 201 or 200 */
    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EnrolledIndividual = apply {
        if (!validated) {
            individualId()
            code()
            body()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EnrolledIndividual &&
            this.individualId == other.individualId &&
            this.code == other.code &&
            this.body == other.body &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    individualId,
                    code,
                    body,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "EnrolledIndividual{individualId=$individualId, code=$code, body=$body, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var individualId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<Code> = JsonMissing.of()
        private var body: JsonField<Body> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(enrolledIndividual: EnrolledIndividual) = apply {
            this.individualId = enrolledIndividual.individualId
            this.code = enrolledIndividual.code
            this.body = enrolledIndividual.body
            additionalProperties(enrolledIndividual.additionalProperties)
        }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        @JsonProperty("individual_id")
        @ExcludeMissing
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        /** HTTP status code. Either 201 or 200 */
        fun code(code: Code) = code(JsonField.of(code))

        /** HTTP status code. Either 201 or 200 */
        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Code>) = apply { this.code = code }

        fun body(body: Body) = body(JsonField.of(body))

        @JsonProperty("body")
        @ExcludeMissing
        fun body(body: JsonField<Body>) = apply { this.body = body }

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

        fun build(): EnrolledIndividual =
            EnrolledIndividual(
                individualId,
                code,
                body,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Body.Builder::class)
    @NoAutoDetect
    class Body
    private constructor(
        private val name: JsonField<String>,
        private val finchCode: JsonField<String>,
        private val message: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Identifier indicating whether the benefit was newly enrolled or updated. */
        fun name(): String? = name.getNullable("name")

        /** A descriptive identifier for the response */
        fun finchCode(): String? = finchCode.getNullable("finch_code")

        /** Short description in English that provides more information about the response. */
        fun message(): String? = message.getNullable("message")

        /** Identifier indicating whether the benefit was newly enrolled or updated. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** A descriptive identifier for the response */
        @JsonProperty("finch_code") @ExcludeMissing fun _finchCode() = finchCode

        /** Short description in English that provides more information about the response. */
        @JsonProperty("message") @ExcludeMissing fun _message() = message

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Body = apply {
            if (!validated) {
                name()
                finchCode()
                message()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                this.name == other.name &&
                this.finchCode == other.finchCode &&
                this.message == other.message &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        finchCode,
                        message,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Body{name=$name, finchCode=$finchCode, message=$message, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var finchCode: JsonField<String> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                this.name = body.name
                this.finchCode = body.finchCode
                this.message = body.message
                additionalProperties(body.additionalProperties)
            }

            /** Identifier indicating whether the benefit was newly enrolled or updated. */
            fun name(name: String) = name(JsonField.of(name))

            /** Identifier indicating whether the benefit was newly enrolled or updated. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** A descriptive identifier for the response */
            fun finchCode(finchCode: String) = finchCode(JsonField.of(finchCode))

            /** A descriptive identifier for the response */
            @JsonProperty("finch_code")
            @ExcludeMissing
            fun finchCode(finchCode: JsonField<String>) = apply { this.finchCode = finchCode }

            /** Short description in English that provides more information about the response. */
            fun message(message: String) = message(JsonField.of(message))

            /** Short description in English that provides more information about the response. */
            @JsonProperty("message")
            @ExcludeMissing
            fun message(message: JsonField<String>) = apply { this.message = message }

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

            fun build(): Body =
                Body(
                    name,
                    finchCode,
                    message,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Code
    @JsonCreator
    private constructor(
        private val value: JsonField<Int>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Int> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Code && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val OK = Code(JsonField.of(200))

            val CREATED = Code(JsonField.of(201))

            val NOT_FOUND = Code(JsonField.of(404))

            val FORBIDDEN = Code(JsonField.of(403))

            fun of(value: Int) = Code(JsonField.of(value))
        }

        enum class Known {
            OK,
            CREATED,
            NOT_FOUND,
            FORBIDDEN,
        }

        enum class Value {
            OK,
            CREATED,
            NOT_FOUND,
            FORBIDDEN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OK -> Value.OK
                CREATED -> Value.CREATED
                NOT_FOUND -> Value.NOT_FOUND
                FORBIDDEN -> Value.FORBIDDEN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OK -> Known.OK
                CREATED -> Known.CREATED
                NOT_FOUND -> Known.NOT_FOUND
                FORBIDDEN -> Known.FORBIDDEN
                else -> throw FinchInvalidDataException("Unknown Code: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
