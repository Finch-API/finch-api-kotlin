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

@JsonDeserialize(builder = PayStatementResponse.Builder::class)
@NoAutoDetect
class PayStatementResponse
private constructor(
    private val paymentId: JsonField<String>,
    private val code: JsonField<Long>,
    private val body: JsonField<PayStatementResponseBody>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun paymentId(): String? = paymentId.getNullable("payment_id")

    fun code(): Long? = code.getNullable("code")

    fun body(): PayStatementResponseBody? = body.getNullable("body")

    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId() = paymentId

    @JsonProperty("code") @ExcludeMissing fun _code() = code

    @JsonProperty("body") @ExcludeMissing fun _body() = body

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PayStatementResponse = apply {
        if (!validated) {
            paymentId()
            code()
            body()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var paymentId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var body: JsonField<PayStatementResponseBody> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(payStatementResponse: PayStatementResponse) = apply {
            this.paymentId = payStatementResponse.paymentId
            this.code = payStatementResponse.code
            this.body = payStatementResponse.body
            additionalProperties(payStatementResponse.additionalProperties)
        }

        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        @JsonProperty("payment_id")
        @ExcludeMissing
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        fun code(code: Long) = code(JsonField.of(code))

        @JsonProperty("code")
        @ExcludeMissing
        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun body(body: PayStatementResponseBody) = body(JsonField.of(body))

        @JsonProperty("body")
        @ExcludeMissing
        fun body(body: JsonField<PayStatementResponseBody>) = apply { this.body = body }

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

        fun build(): PayStatementResponse =
            PayStatementResponse(
                paymentId,
                code,
                body,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayStatementResponse && paymentId == other.paymentId && code == other.code && body == other.body && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(paymentId, code, body, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayStatementResponse{paymentId=$paymentId, code=$code, body=$body, additionalProperties=$additionalProperties}"
}
