// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

class PayStatementItemListResponse
private constructor(
    private val attributes: JsonField<Attributes>,
    private val category: JsonField<Category>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(attributes, category, name, mutableMapOf())

    /**
     * The attributes of the pay statement item.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributes(): Attributes = attributes.getRequired("attributes")

    /**
     * The category of the pay statement item.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = category.getRequired("category")

    /**
     * The name of the pay statement item.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [attributes].
     *
     * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attributes")
    @ExcludeMissing
    fun _attributes(): JsonField<Attributes> = attributes

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [PayStatementItemListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .attributes()
         * .category()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PayStatementItemListResponse]. */
    class Builder internal constructor() {

        private var attributes: JsonField<Attributes>? = null
        private var category: JsonField<Category>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(payStatementItemListResponse: PayStatementItemListResponse) = apply {
            attributes = payStatementItemListResponse.attributes
            category = payStatementItemListResponse.category
            name = payStatementItemListResponse.name
            additionalProperties = payStatementItemListResponse.additionalProperties.toMutableMap()
        }

        /** The attributes of the pay statement item. */
        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        /** The category of the pay statement item. */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** The name of the pay statement item. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [PayStatementItemListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .attributes()
         * .category()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PayStatementItemListResponse =
            PayStatementItemListResponse(
                checkRequired("attributes", attributes),
                checkRequired("category", category),
                checkRequired("name", name),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PayStatementItemListResponse = apply {
        if (validated) {
            return@apply
        }

        attributes().validate()
        category().validate()
        name()
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
        (attributes.asKnown()?.validity() ?: 0) +
            (category.asKnown()?.validity() ?: 0) +
            (if (name.asKnown() == null) 0 else 1)

    /** The attributes of the pay statement item. */
    class Attributes
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val employer: JsonField<Boolean>,
        private val preTax: JsonField<Boolean>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("employer")
            @ExcludeMissing
            employer: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pre_tax") @ExcludeMissing preTax: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(metadata, employer, preTax, type, mutableMapOf())

        /**
         * The metadata of the pay statement item derived by the rules engine if available. Each
         * attribute will be a key-value pair defined by a rule.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * `true` if the amount is paid by the employers. This field is only available for taxes.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employer(): Boolean? = employer.getNullable("employer")

        /**
         * `true` if the pay statement item is pre-tax. This field is only available for employee
         * deductions.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preTax(): Boolean? = preTax.getNullable("pre_tax")

        /**
         * The type of the pay statement item.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): String? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [employer].
         *
         * Unlike [employer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("employer") @ExcludeMissing fun _employer(): JsonField<Boolean> = employer

        /**
         * Returns the raw JSON value of [preTax].
         *
         * Unlike [preTax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pre_tax") @ExcludeMissing fun _preTax(): JsonField<Boolean> = preTax

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
             * Returns a mutable builder for constructing an instance of [Attributes].
             *
             * The following fields are required:
             * ```kotlin
             * .metadata()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var metadata: JsonField<Metadata>? = null
            private var employer: JsonField<Boolean> = JsonMissing.of()
            private var preTax: JsonField<Boolean> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                metadata = attributes.metadata
                employer = attributes.employer
                preTax = attributes.preTax
                type = attributes.type
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            /**
             * The metadata of the pay statement item derived by the rules engine if available. Each
             * attribute will be a key-value pair defined by a rule.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * `true` if the amount is paid by the employers. This field is only available for
             * taxes.
             */
            fun employer(employer: Boolean?) = employer(JsonField.ofNullable(employer))

            /**
             * Alias for [Builder.employer].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun employer(employer: Boolean) = employer(employer as Boolean?)

            /**
             * Sets [Builder.employer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employer] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun employer(employer: JsonField<Boolean>) = apply { this.employer = employer }

            /**
             * `true` if the pay statement item is pre-tax. This field is only available for
             * employee deductions.
             */
            fun preTax(preTax: Boolean?) = preTax(JsonField.ofNullable(preTax))

            /**
             * Alias for [Builder.preTax].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun preTax(preTax: Boolean) = preTax(preTax as Boolean?)

            /**
             * Sets [Builder.preTax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preTax] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preTax(preTax: JsonField<Boolean>) = apply { this.preTax = preTax }

            /** The type of the pay statement item. */
            fun type(type: String?) = type(JsonField.ofNullable(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Attributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .metadata()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Attributes =
                Attributes(
                    checkRequired("metadata", metadata),
                    employer,
                    preTax,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            metadata()?.validate()
            employer()
            preTax()
            type()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (metadata.asKnown()?.validity() ?: 0) +
                (if (employer.asKnown() == null) 0 else 1) +
                (if (preTax.asKnown() == null) 0 else 1) +
                (if (type.asKnown() == null) 0 else 1)

        /**
         * The metadata of the pay statement item derived by the rules engine if available. Each
         * attribute will be a key-value pair defined by a rule.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Attributes && metadata == other.metadata && employer == other.employer && preTax == other.preTax && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, employer, preTax, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{metadata=$metadata, employer=$employer, preTax=$preTax, type=$type, additionalProperties=$additionalProperties}"
    }

    /** The category of the pay statement item. */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val EARNINGS = of("earnings")

            val TAXES = of("taxes")

            val EMPLOYEE_DEDUCTIONS = of("employee_deductions")

            val EMPLOYER_CONTRIBUTIONS = of("employer_contributions")

            fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            EARNINGS,
            TAXES,
            EMPLOYEE_DEDUCTIONS,
            EMPLOYER_CONTRIBUTIONS,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EARNINGS,
            TAXES,
            EMPLOYEE_DEDUCTIONS,
            EMPLOYER_CONTRIBUTIONS,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EARNINGS -> Value.EARNINGS
                TAXES -> Value.TAXES
                EMPLOYEE_DEDUCTIONS -> Value.EMPLOYEE_DEDUCTIONS
                EMPLOYER_CONTRIBUTIONS -> Value.EMPLOYER_CONTRIBUTIONS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws FinchInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                EARNINGS -> Known.EARNINGS
                TAXES -> Known.TAXES
                EMPLOYEE_DEDUCTIONS -> Known.EMPLOYEE_DEDUCTIONS
                EMPLOYER_CONTRIBUTIONS -> Known.EMPLOYER_CONTRIBUTIONS
                else -> throw FinchInvalidDataException("Unknown Category: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws FinchInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Category = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayStatementItemListResponse && attributes == other.attributes && category == other.category && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(attributes, category, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PayStatementItemListResponse{attributes=$attributes, category=$category, name=$name, additionalProperties=$additionalProperties}"
}
