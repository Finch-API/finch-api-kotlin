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
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

class HrisCompanyPayStatementItemListPageResponse
private constructor(
    private val responses: JsonField<List<PayStatementItemListResponse>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("responses")
        @ExcludeMissing
        responses: JsonField<List<PayStatementItemListResponse>> = JsonMissing.of()
    ) : this(responses, mutableMapOf())

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun responses(): List<PayStatementItemListResponse> = responses.getRequired("responses")

    /**
     * Returns the raw JSON value of [responses].
     *
     * Unlike [responses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("responses")
    @ExcludeMissing
    fun _responses(): JsonField<List<PayStatementItemListResponse>> = responses

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisCompanyPayStatementItemListPageResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .responses()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [HrisCompanyPayStatementItemListPageResponse]. */
    class Builder internal constructor() {

        private var responses: JsonField<MutableList<PayStatementItemListResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            hrisCompanyPayStatementItemListPageResponse: HrisCompanyPayStatementItemListPageResponse
        ) = apply {
            responses =
                hrisCompanyPayStatementItemListPageResponse.responses.map { it.toMutableList() }
            additionalProperties =
                hrisCompanyPayStatementItemListPageResponse.additionalProperties.toMutableMap()
        }

        fun responses(responses: List<PayStatementItemListResponse>) =
            responses(JsonField.of(responses))

        /**
         * Sets [Builder.responses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responses] with a well-typed
         * `List<PayStatementItemListResponse>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun responses(responses: JsonField<List<PayStatementItemListResponse>>) = apply {
            this.responses = responses.map { it.toMutableList() }
        }

        /**
         * Adds a single [PayStatementItemListResponse] to [responses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResponse(response: PayStatementItemListResponse) = apply {
            responses =
                (responses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("responses", it).add(response)
                }
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

        /**
         * Returns an immutable instance of [HrisCompanyPayStatementItemListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .responses()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HrisCompanyPayStatementItemListPageResponse =
            HrisCompanyPayStatementItemListPageResponse(
                checkRequired("responses", responses).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HrisCompanyPayStatementItemListPageResponse = apply {
        if (validated) {
            return@apply
        }

        responses().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: FinchInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = (responses.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisCompanyPayStatementItemListPageResponse && responses == other.responses && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(responses, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HrisCompanyPayStatementItemListPageResponse{responses=$responses, additionalProperties=$additionalProperties}"
}
