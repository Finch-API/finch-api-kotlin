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
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@NoAutoDetect
class SupportPerBenefitType
@JsonCreator
private constructor(
    @JsonProperty("company_benefits")
    @ExcludeMissing
    private val companyBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of(),
    @JsonProperty("individual_benefits")
    @ExcludeMissing
    private val individualBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyBenefits(): OperationSupportMatrix? = companyBenefits.getNullable("company_benefits")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualBenefits(): OperationSupportMatrix? =
        individualBenefits.getNullable("individual_benefits")

    /**
     * Returns the raw JSON value of [companyBenefits].
     *
     * Unlike [companyBenefits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_benefits")
    @ExcludeMissing
    fun _companyBenefits(): JsonField<OperationSupportMatrix> = companyBenefits

    /**
     * Returns the raw JSON value of [individualBenefits].
     *
     * Unlike [individualBenefits], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("individual_benefits")
    @ExcludeMissing
    fun _individualBenefits(): JsonField<OperationSupportMatrix> = individualBenefits

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SupportPerBenefitType = apply {
        if (validated) {
            return@apply
        }

        companyBenefits()?.validate()
        individualBenefits()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [SupportPerBenefitType]. */
        fun builder() = Builder()
    }

    /** A builder for [SupportPerBenefitType]. */
    class Builder internal constructor() {

        private var companyBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of()
        private var individualBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(supportPerBenefitType: SupportPerBenefitType) = apply {
            companyBenefits = supportPerBenefitType.companyBenefits
            individualBenefits = supportPerBenefitType.individualBenefits
            additionalProperties = supportPerBenefitType.additionalProperties.toMutableMap()
        }

        fun companyBenefits(companyBenefits: OperationSupportMatrix) =
            companyBenefits(JsonField.of(companyBenefits))

        /**
         * Sets [Builder.companyBenefits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyBenefits] with a well-typed
         * [OperationSupportMatrix] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun companyBenefits(companyBenefits: JsonField<OperationSupportMatrix>) = apply {
            this.companyBenefits = companyBenefits
        }

        fun individualBenefits(individualBenefits: OperationSupportMatrix) =
            individualBenefits(JsonField.of(individualBenefits))

        /**
         * Sets [Builder.individualBenefits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualBenefits] with a well-typed
         * [OperationSupportMatrix] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun individualBenefits(individualBenefits: JsonField<OperationSupportMatrix>) = apply {
            this.individualBenefits = individualBenefits
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

        fun build(): SupportPerBenefitType =
            SupportPerBenefitType(
                companyBenefits,
                individualBenefits,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SupportPerBenefitType && companyBenefits == other.companyBenefits && individualBenefits == other.individualBenefits && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(companyBenefits, individualBenefits, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SupportPerBenefitType{companyBenefits=$companyBenefits, individualBenefits=$individualBenefits, additionalProperties=$additionalProperties}"
}
