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

@JsonDeserialize(builder = SupportPerBenefitType.Builder::class)
@NoAutoDetect
class SupportPerBenefitType
private constructor(
    private val companyBenefits: JsonField<OperationSupportMatrix>,
    private val individualBenefits: JsonField<OperationSupportMatrix>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun companyBenefits(): OperationSupportMatrix? = companyBenefits.getNullable("company_benefits")

    fun individualBenefits(): OperationSupportMatrix? =
        individualBenefits.getNullable("individual_benefits")

    @JsonProperty("company_benefits") @ExcludeMissing fun _companyBenefits() = companyBenefits

    @JsonProperty("individual_benefits")
    @ExcludeMissing
    fun _individualBenefits() = individualBenefits

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SupportPerBenefitType = apply {
        if (!validated) {
            companyBenefits()?.validate()
            individualBenefits()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var companyBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of()
        private var individualBenefits: JsonField<OperationSupportMatrix> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(supportPerBenefitType: SupportPerBenefitType) = apply {
            this.companyBenefits = supportPerBenefitType.companyBenefits
            this.individualBenefits = supportPerBenefitType.individualBenefits
            additionalProperties(supportPerBenefitType.additionalProperties)
        }

        fun companyBenefits(companyBenefits: OperationSupportMatrix) =
            companyBenefits(JsonField.of(companyBenefits))

        @JsonProperty("company_benefits")
        @ExcludeMissing
        fun companyBenefits(companyBenefits: JsonField<OperationSupportMatrix>) = apply {
            this.companyBenefits = companyBenefits
        }

        fun individualBenefits(individualBenefits: OperationSupportMatrix) =
            individualBenefits(JsonField.of(individualBenefits))

        @JsonProperty("individual_benefits")
        @ExcludeMissing
        fun individualBenefits(individualBenefits: JsonField<OperationSupportMatrix>) = apply {
            this.individualBenefits = individualBenefits
        }

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
