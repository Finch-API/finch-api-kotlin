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

@JsonDeserialize(builder = Paging.Builder::class)
@NoAutoDetect
class Paging
private constructor(
    private val count: JsonField<Long>,
    private val offset: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The total number of elements for the entire query (not just the given page) */
    fun count(): Long? = count.getNullable("count")

    /** The current start index of the returned list of elements */
    fun offset(): Long? = offset.getNullable("offset")

    /** The total number of elements for the entire query (not just the given page) */
    @JsonProperty("count") @ExcludeMissing fun _count() = count

    /** The current start index of the returned list of elements */
    @JsonProperty("offset") @ExcludeMissing fun _offset() = offset

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Paging = apply {
        if (!validated) {
            count()
            offset()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var count: JsonField<Long> = JsonMissing.of()
        private var offset: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paging: Paging) = apply {
            this.count = paging.count
            this.offset = paging.offset
            additionalProperties(paging.additionalProperties)
        }

        /** The total number of elements for the entire query (not just the given page) */
        fun count(count: Long) = count(JsonField.of(count))

        /** The total number of elements for the entire query (not just the given page) */
        @JsonProperty("count")
        @ExcludeMissing
        fun count(count: JsonField<Long>) = apply { this.count = count }

        /** The current start index of the returned list of elements */
        fun offset(offset: Long) = offset(JsonField.of(offset))

        /** The current start index of the returned list of elements */
        @JsonProperty("offset")
        @ExcludeMissing
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

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

        fun build(): Paging =
            Paging(
                count,
                offset,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Paging && count == other.count && offset == other.offset && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(count, offset, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Paging{count=$count, offset=$offset, additionalProperties=$additionalProperties}"
}
