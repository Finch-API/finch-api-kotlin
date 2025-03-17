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

/**
 * Each benefit type and their supported features. If the benefit type is not supported, the
 * property will be null
 */
@NoAutoDetect
class BenefitsSupport
@JsonCreator
private constructor(
    @JsonProperty("commuter")
    @ExcludeMissing
    private val commuter: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("custom_post_tax")
    @ExcludeMissing
    private val customPostTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("custom_pre_tax")
    @ExcludeMissing
    private val customPreTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("fsa_dependent_care")
    @ExcludeMissing
    private val fsaDependentCare: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("fsa_medical")
    @ExcludeMissing
    private val fsaMedical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("hsa_post")
    @ExcludeMissing
    private val hsaPost: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("hsa_pre")
    @ExcludeMissing
    private val hsaPre: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("s125_dental")
    @ExcludeMissing
    private val s125Dental: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("s125_medical")
    @ExcludeMissing
    private val s125Medical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("s125_vision")
    @ExcludeMissing
    private val s125Vision: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("simple")
    @ExcludeMissing
    private val simple: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonProperty("simple_ira")
    @ExcludeMissing
    private val simpleIra: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commuter(): BenefitFeaturesAndOperations? = commuter.getNullable("commuter")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customPostTax(): BenefitFeaturesAndOperations? =
        customPostTax.getNullable("custom_post_tax")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customPreTax(): BenefitFeaturesAndOperations? = customPreTax.getNullable("custom_pre_tax")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fsaDependentCare(): BenefitFeaturesAndOperations? =
        fsaDependentCare.getNullable("fsa_dependent_care")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fsaMedical(): BenefitFeaturesAndOperations? = fsaMedical.getNullable("fsa_medical")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsaPost(): BenefitFeaturesAndOperations? = hsaPost.getNullable("hsa_post")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hsaPre(): BenefitFeaturesAndOperations? = hsaPre.getNullable("hsa_pre")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s125Dental(): BenefitFeaturesAndOperations? = s125Dental.getNullable("s125_dental")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s125Medical(): BenefitFeaturesAndOperations? = s125Medical.getNullable("s125_medical")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s125Vision(): BenefitFeaturesAndOperations? = s125Vision.getNullable("s125_vision")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simple(): BenefitFeaturesAndOperations? = simple.getNullable("simple")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun simpleIra(): BenefitFeaturesAndOperations? = simpleIra.getNullable("simple_ira")

    /**
     * Returns the raw JSON value of [commuter].
     *
     * Unlike [commuter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commuter")
    @ExcludeMissing
    fun _commuter(): JsonField<BenefitFeaturesAndOperations> = commuter

    /**
     * Returns the raw JSON value of [customPostTax].
     *
     * Unlike [customPostTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_post_tax")
    @ExcludeMissing
    fun _customPostTax(): JsonField<BenefitFeaturesAndOperations> = customPostTax

    /**
     * Returns the raw JSON value of [customPreTax].
     *
     * Unlike [customPreTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_pre_tax")
    @ExcludeMissing
    fun _customPreTax(): JsonField<BenefitFeaturesAndOperations> = customPreTax

    /**
     * Returns the raw JSON value of [fsaDependentCare].
     *
     * Unlike [fsaDependentCare], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fsa_dependent_care")
    @ExcludeMissing
    fun _fsaDependentCare(): JsonField<BenefitFeaturesAndOperations> = fsaDependentCare

    /**
     * Returns the raw JSON value of [fsaMedical].
     *
     * Unlike [fsaMedical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fsa_medical")
    @ExcludeMissing
    fun _fsaMedical(): JsonField<BenefitFeaturesAndOperations> = fsaMedical

    /**
     * Returns the raw JSON value of [hsaPost].
     *
     * Unlike [hsaPost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hsa_post")
    @ExcludeMissing
    fun _hsaPost(): JsonField<BenefitFeaturesAndOperations> = hsaPost

    /**
     * Returns the raw JSON value of [hsaPre].
     *
     * Unlike [hsaPre], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hsa_pre")
    @ExcludeMissing
    fun _hsaPre(): JsonField<BenefitFeaturesAndOperations> = hsaPre

    /**
     * Returns the raw JSON value of [s125Dental].
     *
     * Unlike [s125Dental], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s125_dental")
    @ExcludeMissing
    fun _s125Dental(): JsonField<BenefitFeaturesAndOperations> = s125Dental

    /**
     * Returns the raw JSON value of [s125Medical].
     *
     * Unlike [s125Medical], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s125_medical")
    @ExcludeMissing
    fun _s125Medical(): JsonField<BenefitFeaturesAndOperations> = s125Medical

    /**
     * Returns the raw JSON value of [s125Vision].
     *
     * Unlike [s125Vision], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s125_vision")
    @ExcludeMissing
    fun _s125Vision(): JsonField<BenefitFeaturesAndOperations> = s125Vision

    /**
     * Returns the raw JSON value of [simple].
     *
     * Unlike [simple], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("simple")
    @ExcludeMissing
    fun _simple(): JsonField<BenefitFeaturesAndOperations> = simple

    /**
     * Returns the raw JSON value of [simpleIra].
     *
     * Unlike [simpleIra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("simple_ira")
    @ExcludeMissing
    fun _simpleIra(): JsonField<BenefitFeaturesAndOperations> = simpleIra

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BenefitsSupport = apply {
        if (validated) {
            return@apply
        }

        commuter()?.validate()
        customPostTax()?.validate()
        customPreTax()?.validate()
        fsaDependentCare()?.validate()
        fsaMedical()?.validate()
        hsaPost()?.validate()
        hsaPre()?.validate()
        s125Dental()?.validate()
        s125Medical()?.validate()
        s125Vision()?.validate()
        simple()?.validate()
        simpleIra()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [BenefitsSupport]. */
        fun builder() = Builder()
    }

    /** A builder for [BenefitsSupport]. */
    class Builder internal constructor() {

        private var commuter: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var customPostTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var customPreTax: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var fsaDependentCare: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var fsaMedical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var hsaPost: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var hsaPre: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var s125Dental: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var s125Medical: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var s125Vision: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var simple: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var simpleIra: JsonField<BenefitFeaturesAndOperations> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(benefitsSupport: BenefitsSupport) = apply {
            commuter = benefitsSupport.commuter
            customPostTax = benefitsSupport.customPostTax
            customPreTax = benefitsSupport.customPreTax
            fsaDependentCare = benefitsSupport.fsaDependentCare
            fsaMedical = benefitsSupport.fsaMedical
            hsaPost = benefitsSupport.hsaPost
            hsaPre = benefitsSupport.hsaPre
            s125Dental = benefitsSupport.s125Dental
            s125Medical = benefitsSupport.s125Medical
            s125Vision = benefitsSupport.s125Vision
            simple = benefitsSupport.simple
            simpleIra = benefitsSupport.simpleIra
            additionalProperties = benefitsSupport.additionalProperties.toMutableMap()
        }

        fun commuter(commuter: BenefitFeaturesAndOperations?) =
            commuter(JsonField.ofNullable(commuter))

        /**
         * Sets [Builder.commuter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commuter] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun commuter(commuter: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.commuter = commuter
        }

        fun customPostTax(customPostTax: BenefitFeaturesAndOperations?) =
            customPostTax(JsonField.ofNullable(customPostTax))

        /**
         * Sets [Builder.customPostTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customPostTax] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customPostTax(customPostTax: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.customPostTax = customPostTax
        }

        fun customPreTax(customPreTax: BenefitFeaturesAndOperations?) =
            customPreTax(JsonField.ofNullable(customPreTax))

        /**
         * Sets [Builder.customPreTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customPreTax] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customPreTax(customPreTax: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.customPreTax = customPreTax
        }

        fun fsaDependentCare(fsaDependentCare: BenefitFeaturesAndOperations?) =
            fsaDependentCare(JsonField.ofNullable(fsaDependentCare))

        /**
         * Sets [Builder.fsaDependentCare] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fsaDependentCare] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun fsaDependentCare(fsaDependentCare: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.fsaDependentCare = fsaDependentCare
        }

        fun fsaMedical(fsaMedical: BenefitFeaturesAndOperations?) =
            fsaMedical(JsonField.ofNullable(fsaMedical))

        /**
         * Sets [Builder.fsaMedical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fsaMedical] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun fsaMedical(fsaMedical: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.fsaMedical = fsaMedical
        }

        fun hsaPost(hsaPost: BenefitFeaturesAndOperations?) = hsaPost(JsonField.ofNullable(hsaPost))

        /**
         * Sets [Builder.hsaPost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsaPost] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun hsaPost(hsaPost: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.hsaPost = hsaPost
        }

        fun hsaPre(hsaPre: BenefitFeaturesAndOperations?) = hsaPre(JsonField.ofNullable(hsaPre))

        /**
         * Sets [Builder.hsaPre] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hsaPre] with a well-typed [BenefitFeaturesAndOperations]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hsaPre(hsaPre: JsonField<BenefitFeaturesAndOperations>) = apply { this.hsaPre = hsaPre }

        fun s125Dental(s125Dental: BenefitFeaturesAndOperations?) =
            s125Dental(JsonField.ofNullable(s125Dental))

        /**
         * Sets [Builder.s125Dental] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s125Dental] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun s125Dental(s125Dental: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Dental = s125Dental
        }

        fun s125Medical(s125Medical: BenefitFeaturesAndOperations?) =
            s125Medical(JsonField.ofNullable(s125Medical))

        /**
         * Sets [Builder.s125Medical] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s125Medical] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun s125Medical(s125Medical: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Medical = s125Medical
        }

        fun s125Vision(s125Vision: BenefitFeaturesAndOperations?) =
            s125Vision(JsonField.ofNullable(s125Vision))

        /**
         * Sets [Builder.s125Vision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s125Vision] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun s125Vision(s125Vision: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.s125Vision = s125Vision
        }

        fun simple(simple: BenefitFeaturesAndOperations?) = simple(JsonField.ofNullable(simple))

        /**
         * Sets [Builder.simple] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simple] with a well-typed [BenefitFeaturesAndOperations]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun simple(simple: JsonField<BenefitFeaturesAndOperations>) = apply { this.simple = simple }

        fun simpleIra(simpleIra: BenefitFeaturesAndOperations?) =
            simpleIra(JsonField.ofNullable(simpleIra))

        /**
         * Sets [Builder.simpleIra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.simpleIra] with a well-typed
         * [BenefitFeaturesAndOperations] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun simpleIra(simpleIra: JsonField<BenefitFeaturesAndOperations>) = apply {
            this.simpleIra = simpleIra
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
         * Returns an immutable instance of [BenefitsSupport].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BenefitsSupport =
            BenefitsSupport(
                commuter,
                customPostTax,
                customPreTax,
                fsaDependentCare,
                fsaMedical,
                hsaPost,
                hsaPre,
                s125Dental,
                s125Medical,
                s125Vision,
                simple,
                simpleIra,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BenefitsSupport && commuter == other.commuter && customPostTax == other.customPostTax && customPreTax == other.customPreTax && fsaDependentCare == other.fsaDependentCare && fsaMedical == other.fsaMedical && hsaPost == other.hsaPost && hsaPre == other.hsaPre && s125Dental == other.s125Dental && s125Medical == other.s125Medical && s125Vision == other.s125Vision && simple == other.simple && simpleIra == other.simpleIra && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(commuter, customPostTax, customPreTax, fsaDependentCare, fsaMedical, hsaPost, hsaPre, s125Dental, s125Medical, s125Vision, simple, simpleIra, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BenefitsSupport{commuter=$commuter, customPostTax=$customPostTax, customPreTax=$customPreTax, fsaDependentCare=$fsaDependentCare, fsaMedical=$fsaMedical, hsaPost=$hsaPost, hsaPre=$hsaPre, s125Dental=$s125Dental, s125Medical=$s125Medical, s125Vision=$s125Vision, simple=$simple, simpleIra=$simpleIra, additionalProperties=$additionalProperties}"
}
