// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class EmploymentDataResponse
@JsonCreator
private constructor(
    @JsonProperty("body")
    @ExcludeMissing
    private val body: JsonField<EmploymentData> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("individual_id")
    @ExcludeMissing
    private val individualId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun body(): EmploymentData? = body.getNullable("body")

    fun code(): Long? = code.getNullable("code")

    fun individualId(): String? = individualId.getNullable("individual_id")

    @JsonProperty("body") @ExcludeMissing fun _body(): JsonField<EmploymentData> = body

    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

    @JsonProperty("individual_id")
    @ExcludeMissing
    fun _individualId(): JsonField<String> = individualId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EmploymentDataResponse = apply {
        if (validated) {
            return@apply
        }

        body()?.validate()
        code()
        individualId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [EmploymentDataResponse]. */
    class Builder internal constructor() {

        private var body: JsonField<EmploymentData> = JsonMissing.of()
        private var code: JsonField<Long> = JsonMissing.of()
        private var individualId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(employmentDataResponse: EmploymentDataResponse) = apply {
            body = employmentDataResponse.body
            code = employmentDataResponse.code
            individualId = employmentDataResponse.individualId
            additionalProperties = employmentDataResponse.additionalProperties.toMutableMap()
        }

        fun body(body: EmploymentData) = body(JsonField.of(body))

        fun body(body: JsonField<EmploymentData>) = apply { this.body = body }

        fun code(code: Long) = code(JsonField.of(code))

        fun code(code: JsonField<Long>) = apply { this.code = code }

        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

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

        fun build(): EmploymentDataResponse =
            EmploymentDataResponse(body, code, individualId, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EmploymentDataResponse && body == other.body && code == other.code && individualId == other.individualId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(body, code, individualId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmploymentDataResponse{body=$body, code=$code, individualId=$individualId, additionalProperties=$additionalProperties}"
}
