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
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

class BenefitFeaturesAndOperations
private constructor(
    private val supportedFeatures: JsonField<SupportedBenefit>,
    private val supportedOperations: JsonField<SupportPerBenefitType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("supported_features")
        @ExcludeMissing
        supportedFeatures: JsonField<SupportedBenefit> = JsonMissing.of(),
        @JsonProperty("supported_operations")
        @ExcludeMissing
        supportedOperations: JsonField<SupportPerBenefitType> = JsonMissing.of(),
    ) : this(supportedFeatures, supportedOperations, mutableMapOf())

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportedFeatures(): SupportedBenefit? = supportedFeatures.getNullable("supported_features")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportedOperations(): SupportPerBenefitType? =
        supportedOperations.getNullable("supported_operations")

    /**
     * Returns the raw JSON value of [supportedFeatures].
     *
     * Unlike [supportedFeatures], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supported_features")
    @ExcludeMissing
    fun _supportedFeatures(): JsonField<SupportedBenefit> = supportedFeatures

    /**
     * Returns the raw JSON value of [supportedOperations].
     *
     * Unlike [supportedOperations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supported_operations")
    @ExcludeMissing
    fun _supportedOperations(): JsonField<SupportPerBenefitType> = supportedOperations

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
         * Returns a mutable builder for constructing an instance of [BenefitFeaturesAndOperations].
         */
        fun builder() = Builder()
    }

    /** A builder for [BenefitFeaturesAndOperations]. */
    class Builder internal constructor() {

        private var supportedFeatures: JsonField<SupportedBenefit> = JsonMissing.of()
        private var supportedOperations: JsonField<SupportPerBenefitType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(benefitFeaturesAndOperations: BenefitFeaturesAndOperations) = apply {
            supportedFeatures = benefitFeaturesAndOperations.supportedFeatures
            supportedOperations = benefitFeaturesAndOperations.supportedOperations
            additionalProperties = benefitFeaturesAndOperations.additionalProperties.toMutableMap()
        }

        fun supportedFeatures(supportedFeatures: SupportedBenefit) =
            supportedFeatures(JsonField.of(supportedFeatures))

        /**
         * Sets [Builder.supportedFeatures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedFeatures] with a well-typed [SupportedBenefit]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun supportedFeatures(supportedFeatures: JsonField<SupportedBenefit>) = apply {
            this.supportedFeatures = supportedFeatures
        }

        fun supportedOperations(supportedOperations: SupportPerBenefitType) =
            supportedOperations(JsonField.of(supportedOperations))

        /**
         * Sets [Builder.supportedOperations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedOperations] with a well-typed
         * [SupportPerBenefitType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun supportedOperations(supportedOperations: JsonField<SupportPerBenefitType>) = apply {
            this.supportedOperations = supportedOperations
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
         * Returns an immutable instance of [BenefitFeaturesAndOperations].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BenefitFeaturesAndOperations =
            BenefitFeaturesAndOperations(
                supportedFeatures,
                supportedOperations,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BenefitFeaturesAndOperations = apply {
        if (validated) {
            return@apply
        }

        supportedFeatures()?.validate()
        supportedOperations()?.validate()
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
    internal fun validity(): Int =
        (supportedFeatures.asKnown()?.validity() ?: 0) +
            (supportedOperations.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BenefitFeaturesAndOperations && supportedFeatures == other.supportedFeatures && supportedOperations == other.supportedOperations && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(supportedFeatures, supportedOperations, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BenefitFeaturesAndOperations{supportedFeatures=$supportedFeatures, supportedOperations=$supportedOperations, additionalProperties=$additionalProperties}"
}
