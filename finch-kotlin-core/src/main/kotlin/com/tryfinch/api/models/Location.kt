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

class Location
private constructor(
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val line1: JsonField<String>,
    private val line2: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val state: JsonField<String>,
    private val name: JsonField<String>,
    private val sourceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_id") @ExcludeMissing sourceId: JsonField<String> = JsonMissing.of(),
    ) : this(city, country, line1, line2, postalCode, state, name, sourceId, mutableMapOf())

    /**
     * City, district, suburb, town, or village.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun city(): String? = city.getNullable("city")

    /**
     * The 2-letter ISO 3166 country code.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun country(): String? = country.getNullable("country")

    /**
     * Street address or PO box.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun line1(): String? = line1.getNullable("line1")

    /**
     * Apartment, suite, unit, or building.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun line2(): String? = line2.getNullable("line2")

    /**
     * The postal code or zip code.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCode(): String? = postalCode.getNullable("postal_code")

    /**
     * The state code.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): String? = state.getNullable("state")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceId(): String? = sourceId.getNullable("source_id")

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [line1].
     *
     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

    /**
     * Returns the raw JSON value of [line2].
     *
     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sourceId].
     *
     * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

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
         * Returns a mutable builder for constructing an instance of [Location].
         *
         * The following fields are required:
         * ```kotlin
         * .city()
         * .country()
         * .line1()
         * .line2()
         * .postalCode()
         * .state()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Location]. */
    class Builder internal constructor() {

        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var line1: JsonField<String>? = null
        private var line2: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var state: JsonField<String>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(location: Location) = apply {
            city = location.city
            country = location.country
            line1 = location.line1
            line2 = location.line2
            postalCode = location.postalCode
            state = location.state
            name = location.name
            sourceId = location.sourceId
            additionalProperties = location.additionalProperties.toMutableMap()
        }

        /** City, district, suburb, town, or village. */
        fun city(city: String?) = city(JsonField.ofNullable(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** The 2-letter ISO 3166 country code. */
        fun country(country: String?) = country(JsonField.ofNullable(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Street address or PO box. */
        fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

        /**
         * Sets [Builder.line1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

        /** Apartment, suite, unit, or building. */
        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

        /**
         * Sets [Builder.line2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

        /** The postal code or zip code. */
        fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** The state code. */
        fun state(state: String?) = state(JsonField.ofNullable(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        fun name(name: String?) = name(JsonField.ofNullable(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun sourceId(sourceId: String?) = sourceId(JsonField.ofNullable(sourceId))

        /**
         * Sets [Builder.sourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

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
         * Returns an immutable instance of [Location].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .city()
         * .country()
         * .line1()
         * .line2()
         * .postalCode()
         * .state()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Location =
            Location(
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("line1", line1),
                checkRequired("line2", line2),
                checkRequired("postalCode", postalCode),
                checkRequired("state", state),
                name,
                sourceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Location = apply {
        if (validated) {
            return@apply
        }

        city()
        country()
        line1()
        line2()
        postalCode()
        state()
        name()
        sourceId()
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
        (if (city.asKnown() == null) 0 else 1) +
            (if (country.asKnown() == null) 0 else 1) +
            (if (line1.asKnown() == null) 0 else 1) +
            (if (line2.asKnown() == null) 0 else 1) +
            (if (postalCode.asKnown() == null) 0 else 1) +
            (if (state.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (if (sourceId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Location && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && name == other.name && sourceId == other.sourceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, name, sourceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Location{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, name=$name, sourceId=$sourceId, additionalProperties=$additionalProperties}"
}
