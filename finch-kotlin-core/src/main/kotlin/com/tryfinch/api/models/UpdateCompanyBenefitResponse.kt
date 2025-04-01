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
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

class UpdateCompanyBenefitResponse
private constructor(
    private val benefitId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("benefit_id") @ExcludeMissing benefitId: JsonField<String> = JsonMissing.of()
    ) : this(benefitId, mutableMapOf())

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun benefitId(): String = benefitId.getRequired("benefit_id")

    /**
     * Returns the raw JSON value of [benefitId].
     *
     * Unlike [benefitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId(): JsonField<String> = benefitId

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
         * Returns a mutable builder for constructing an instance of [UpdateCompanyBenefitResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .benefitId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UpdateCompanyBenefitResponse]. */
    class Builder internal constructor() {

        private var benefitId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(updateCompanyBenefitResponse: UpdateCompanyBenefitResponse) = apply {
            benefitId = updateCompanyBenefitResponse.benefitId
            additionalProperties = updateCompanyBenefitResponse.additionalProperties.toMutableMap()
        }

        fun benefitId(benefitId: String) = benefitId(JsonField.of(benefitId))

        /**
         * Sets [Builder.benefitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.benefitId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun benefitId(benefitId: JsonField<String>) = apply { this.benefitId = benefitId }

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
         * Returns an immutable instance of [UpdateCompanyBenefitResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .benefitId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UpdateCompanyBenefitResponse =
            UpdateCompanyBenefitResponse(
                checkRequired("benefitId", benefitId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UpdateCompanyBenefitResponse = apply {
        if (validated) {
            return@apply
        }

        benefitId()
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
    internal fun validity(): Int = (if (benefitId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UpdateCompanyBenefitResponse && benefitId == other.benefitId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(benefitId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateCompanyBenefitResponse{benefitId=$benefitId, additionalProperties=$additionalProperties}"
}
