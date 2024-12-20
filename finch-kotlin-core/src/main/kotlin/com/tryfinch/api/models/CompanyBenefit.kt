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
class CompanyBenefit
@JsonCreator
private constructor(
    @JsonProperty("benefit_id")
    @ExcludeMissing
    private val benefitId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type")
    @ExcludeMissing
    private val type: JsonField<BenefitType> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("frequency")
    @ExcludeMissing
    private val frequency: JsonField<BenefitFrequency> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun benefitId(): String = benefitId.getRequired("benefit_id")

    /** Type of benefit. */
    fun type(): BenefitType? = type.getNullable("type")

    fun description(): String? = description.getNullable("description")

    fun frequency(): BenefitFrequency? = frequency.getNullable("frequency")

    @JsonProperty("benefit_id") @ExcludeMissing fun _benefitId() = benefitId

    /** Type of benefit. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("frequency") @ExcludeMissing fun _frequency() = frequency

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CompanyBenefit = apply {
        if (!validated) {
            benefitId()
            type()
            description()
            frequency()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var benefitId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<BenefitType> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var frequency: JsonField<BenefitFrequency> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(companyBenefit: CompanyBenefit) = apply {
            benefitId = companyBenefit.benefitId
            type = companyBenefit.type
            description = companyBenefit.description
            frequency = companyBenefit.frequency
            additionalProperties = companyBenefit.additionalProperties.toMutableMap()
        }

        fun benefitId(benefitId: String) = benefitId(JsonField.of(benefitId))

        fun benefitId(benefitId: JsonField<String>) = apply { this.benefitId = benefitId }

        /** Type of benefit. */
        fun type(type: BenefitType) = type(JsonField.of(type))

        /** Type of benefit. */
        fun type(type: JsonField<BenefitType>) = apply { this.type = type }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun frequency(frequency: BenefitFrequency) = frequency(JsonField.of(frequency))

        fun frequency(frequency: JsonField<BenefitFrequency>) = apply { this.frequency = frequency }

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

        fun build(): CompanyBenefit =
            CompanyBenefit(
                benefitId,
                type,
                description,
                frequency,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompanyBenefit && benefitId == other.benefitId && type == other.type && description == other.description && frequency == other.frequency && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(benefitId, type, description, frequency, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyBenefit{benefitId=$benefitId, type=$type, description=$description, frequency=$frequency, additionalProperties=$additionalProperties}"
}
