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
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@NoAutoDetect
class Individual
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dob") @ExcludeMissing private val dob: JsonField<String> = JsonMissing.of(),
    @JsonProperty("emails")
    @ExcludeMissing
    private val emails: JsonField<List<Email>> = JsonMissing.of(),
    @JsonProperty("encrypted_ssn")
    @ExcludeMissing
    private val encryptedSsn: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ethnicity")
    @ExcludeMissing
    private val ethnicity: JsonField<Ethnicity> = JsonMissing.of(),
    @JsonProperty("first_name")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("gender")
    @ExcludeMissing
    private val gender: JsonField<Gender> = JsonMissing.of(),
    @JsonProperty("last_name")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("middle_name")
    @ExcludeMissing
    private val middleName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("phone_numbers")
    @ExcludeMissing
    private val phoneNumbers: JsonField<List<PhoneNumber?>> = JsonMissing.of(),
    @JsonProperty("preferred_name")
    @ExcludeMissing
    private val preferredName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("residence")
    @ExcludeMissing
    private val residence: JsonField<Location> = JsonMissing.of(),
    @JsonProperty("ssn") @ExcludeMissing private val ssn: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A stable Finch `id` (UUID v4) for an individual in the company. */
    fun id(): String? = id.getNullable("id")

    fun dob(): String? = dob.getNullable("dob")

    fun emails(): List<Email>? = emails.getNullable("emails")

    /**
     * Social Security Number of the individual in **encrypted** format. This field is only
     * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set in
     * the body.
     */
    fun encryptedSsn(): String? = encryptedSsn.getNullable("encrypted_ssn")

    /** The EEOC-defined ethnicity of the individual. */
    fun ethnicity(): Ethnicity? = ethnicity.getNullable("ethnicity")

    /** The legal first name of the individual. */
    fun firstName(): String? = firstName.getNullable("first_name")

    /** The gender of the individual. */
    fun gender(): Gender? = gender.getNullable("gender")

    /** The legal last name of the individual. */
    fun lastName(): String? = lastName.getNullable("last_name")

    /** The legal middle name of the individual. */
    fun middleName(): String? = middleName.getNullable("middle_name")

    fun phoneNumbers(): List<PhoneNumber?>? = phoneNumbers.getNullable("phone_numbers")

    /** The preferred name of the individual. */
    fun preferredName(): String? = preferredName.getNullable("preferred_name")

    fun residence(): Location? = residence.getNullable("residence")

    /**
     * Social Security Number of the individual. This field is only available with the `ssn` scope
     * enabled and the `options: { include: ['ssn'] }` param set in the body.
     * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
     */
    fun ssn(): String? = ssn.getNullable("ssn")

    /** A stable Finch `id` (UUID v4) for an individual in the company. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("dob") @ExcludeMissing fun _dob(): JsonField<String> = dob

    @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<List<Email>> = emails

    /**
     * Social Security Number of the individual in **encrypted** format. This field is only
     * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set in
     * the body.
     */
    @JsonProperty("encrypted_ssn")
    @ExcludeMissing
    fun _encryptedSsn(): JsonField<String> = encryptedSsn

    /** The EEOC-defined ethnicity of the individual. */
    @JsonProperty("ethnicity") @ExcludeMissing fun _ethnicity(): JsonField<Ethnicity> = ethnicity

    /** The legal first name of the individual. */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /** The gender of the individual. */
    @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

    /** The legal last name of the individual. */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /** The legal middle name of the individual. */
    @JsonProperty("middle_name") @ExcludeMissing fun _middleName(): JsonField<String> = middleName

    @JsonProperty("phone_numbers")
    @ExcludeMissing
    fun _phoneNumbers(): JsonField<List<PhoneNumber?>> = phoneNumbers

    /** The preferred name of the individual. */
    @JsonProperty("preferred_name")
    @ExcludeMissing
    fun _preferredName(): JsonField<String> = preferredName

    @JsonProperty("residence") @ExcludeMissing fun _residence(): JsonField<Location> = residence

    /**
     * Social Security Number of the individual. This field is only available with the `ssn` scope
     * enabled and the `options: { include: ['ssn'] }` param set in the body.
     * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
     */
    @JsonProperty("ssn") @ExcludeMissing fun _ssn(): JsonField<String> = ssn

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Individual = apply {
        if (validated) {
            return@apply
        }

        id()
        dob()
        emails()?.forEach { it.validate() }
        encryptedSsn()
        ethnicity()
        firstName()
        gender()
        lastName()
        middleName()
        phoneNumbers()?.forEach { it?.validate() }
        preferredName()
        residence()?.validate()
        ssn()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [Individual]. */
        fun builder() = Builder()
    }

    /** A builder for [Individual]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var dob: JsonField<String> = JsonMissing.of()
        private var emails: JsonField<MutableList<Email>>? = null
        private var encryptedSsn: JsonField<String> = JsonMissing.of()
        private var ethnicity: JsonField<Ethnicity> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var gender: JsonField<Gender> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var phoneNumbers: JsonField<MutableList<PhoneNumber?>>? = null
        private var preferredName: JsonField<String> = JsonMissing.of()
        private var residence: JsonField<Location> = JsonMissing.of()
        private var ssn: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(individual: Individual) = apply {
            id = individual.id
            dob = individual.dob
            emails = individual.emails.map { it.toMutableList() }
            encryptedSsn = individual.encryptedSsn
            ethnicity = individual.ethnicity
            firstName = individual.firstName
            gender = individual.gender
            lastName = individual.lastName
            middleName = individual.middleName
            phoneNumbers = individual.phoneNumbers.map { it.toMutableList() }
            preferredName = individual.preferredName
            residence = individual.residence
            ssn = individual.ssn
            additionalProperties = individual.additionalProperties.toMutableMap()
        }

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: String) = id(JsonField.of(id))

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun dob(dob: String?) = dob(JsonField.ofNullable(dob))

        fun dob(dob: JsonField<String>) = apply { this.dob = dob }

        fun emails(emails: List<Email>?) = emails(JsonField.ofNullable(emails))

        fun emails(emails: JsonField<List<Email>>) = apply {
            this.emails = emails.map { it.toMutableList() }
        }

        fun addEmail(email: Email) = apply {
            emails =
                (emails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("emails", it).add(email)
                }
        }

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        fun encryptedSsn(encryptedSsn: String?) = encryptedSsn(JsonField.ofNullable(encryptedSsn))

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        fun encryptedSsn(encryptedSsn: JsonField<String>) = apply {
            this.encryptedSsn = encryptedSsn
        }

        /** The EEOC-defined ethnicity of the individual. */
        fun ethnicity(ethnicity: Ethnicity?) = ethnicity(JsonField.ofNullable(ethnicity))

        /** The EEOC-defined ethnicity of the individual. */
        fun ethnicity(ethnicity: JsonField<Ethnicity>) = apply { this.ethnicity = ethnicity }

        /** The legal first name of the individual. */
        fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

        /** The legal first name of the individual. */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The gender of the individual. */
        fun gender(gender: Gender?) = gender(JsonField.ofNullable(gender))

        /** The gender of the individual. */
        fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

        /** The legal last name of the individual. */
        fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

        /** The legal last name of the individual. */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

        /** The legal middle name of the individual. */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber?>?) =
            phoneNumbers(JsonField.ofNullable(phoneNumbers))

        fun phoneNumbers(phoneNumbers: JsonField<List<PhoneNumber?>>) = apply {
            this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
        }

        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
            phoneNumbers =
                (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phoneNumbers", it).add(phoneNumber)
                }
        }

        /** The preferred name of the individual. */
        fun preferredName(preferredName: String?) =
            preferredName(JsonField.ofNullable(preferredName))

        /** The preferred name of the individual. */
        fun preferredName(preferredName: JsonField<String>) = apply {
            this.preferredName = preferredName
        }

        fun residence(residence: Location?) = residence(JsonField.ofNullable(residence))

        fun residence(residence: JsonField<Location>) = apply { this.residence = residence }

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        fun ssn(ssn: String?) = ssn(JsonField.ofNullable(ssn))

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        fun ssn(ssn: JsonField<String>) = apply { this.ssn = ssn }

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

        fun build(): Individual =
            Individual(
                id,
                dob,
                (emails ?: JsonMissing.of()).map { it.toImmutable() },
                encryptedSsn,
                ethnicity,
                firstName,
                gender,
                lastName,
                middleName,
                (phoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                preferredName,
                residence,
                ssn,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Email
    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): String? = data.getNullable("data")

        fun type(): Type? = type.getNullable("type")

        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Email = apply {
            if (validated) {
                return@apply
            }

            data()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Email]. */
            fun builder() = Builder()
        }

        /** A builder for [Email]. */
        class Builder internal constructor() {

            private var data: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(email: Email) = apply {
                data = email.data
                type = email.type
                additionalProperties = email.additionalProperties.toMutableMap()
            }

            fun data(data: String) = data(JsonField.of(data))

            fun data(data: JsonField<String>) = apply { this.data = data }

            fun type(type: Type?) = type(JsonField.ofNullable(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): Email = Email(data, type, additionalProperties.toImmutable())
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val WORK = of("work")

                val PERSONAL = of("personal")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                WORK,
                PERSONAL,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WORK,
                PERSONAL,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WORK -> Value.WORK
                    PERSONAL -> Value.PERSONAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WORK -> Known.WORK
                    PERSONAL -> Known.PERSONAL
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Email && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Email{data=$data, type=$type, additionalProperties=$additionalProperties}"
    }

    /** The EEOC-defined ethnicity of the individual. */
    class Ethnicity @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ASIAN = of("asian")

            val WHITE = of("white")

            val BLACK_OR_AFRICAN_AMERICAN = of("black_or_african_american")

            val NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER = of("native_hawaiian_or_pacific_islander")

            val AMERICAN_INDIAN_OR_ALASKA_NATIVE = of("american_indian_or_alaska_native")

            val HISPANIC_OR_LATINO = of("hispanic_or_latino")

            val TWO_OR_MORE_RACES = of("two_or_more_races")

            val DECLINE_TO_SPECIFY = of("decline_to_specify")

            fun of(value: String) = Ethnicity(JsonField.of(value))
        }

        /** An enum containing [Ethnicity]'s known values. */
        enum class Known {
            ASIAN,
            WHITE,
            BLACK_OR_AFRICAN_AMERICAN,
            NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER,
            AMERICAN_INDIAN_OR_ALASKA_NATIVE,
            HISPANIC_OR_LATINO,
            TWO_OR_MORE_RACES,
            DECLINE_TO_SPECIFY,
        }

        /**
         * An enum containing [Ethnicity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Ethnicity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASIAN,
            WHITE,
            BLACK_OR_AFRICAN_AMERICAN,
            NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER,
            AMERICAN_INDIAN_OR_ALASKA_NATIVE,
            HISPANIC_OR_LATINO,
            TWO_OR_MORE_RACES,
            DECLINE_TO_SPECIFY,
            /**
             * An enum member indicating that [Ethnicity] was instantiated with an unknown value.
             */
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
                ASIAN -> Value.ASIAN
                WHITE -> Value.WHITE
                BLACK_OR_AFRICAN_AMERICAN -> Value.BLACK_OR_AFRICAN_AMERICAN
                NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER -> Value.NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER
                AMERICAN_INDIAN_OR_ALASKA_NATIVE -> Value.AMERICAN_INDIAN_OR_ALASKA_NATIVE
                HISPANIC_OR_LATINO -> Value.HISPANIC_OR_LATINO
                TWO_OR_MORE_RACES -> Value.TWO_OR_MORE_RACES
                DECLINE_TO_SPECIFY -> Value.DECLINE_TO_SPECIFY
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
                ASIAN -> Known.ASIAN
                WHITE -> Known.WHITE
                BLACK_OR_AFRICAN_AMERICAN -> Known.BLACK_OR_AFRICAN_AMERICAN
                NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER -> Known.NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER
                AMERICAN_INDIAN_OR_ALASKA_NATIVE -> Known.AMERICAN_INDIAN_OR_ALASKA_NATIVE
                HISPANIC_OR_LATINO -> Known.HISPANIC_OR_LATINO
                TWO_OR_MORE_RACES -> Known.TWO_OR_MORE_RACES
                DECLINE_TO_SPECIFY -> Known.DECLINE_TO_SPECIFY
                else -> throw FinchInvalidDataException("Unknown Ethnicity: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Ethnicity && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The gender of the individual. */
    class Gender @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val FEMALE = of("female")

            val MALE = of("male")

            val OTHER = of("other")

            val DECLINE_TO_SPECIFY = of("decline_to_specify")

            fun of(value: String) = Gender(JsonField.of(value))
        }

        /** An enum containing [Gender]'s known values. */
        enum class Known {
            FEMALE,
            MALE,
            OTHER,
            DECLINE_TO_SPECIFY,
        }

        /**
         * An enum containing [Gender]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Gender] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FEMALE,
            MALE,
            OTHER,
            DECLINE_TO_SPECIFY,
            /** An enum member indicating that [Gender] was instantiated with an unknown value. */
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
                FEMALE -> Value.FEMALE
                MALE -> Value.MALE
                OTHER -> Value.OTHER
                DECLINE_TO_SPECIFY -> Value.DECLINE_TO_SPECIFY
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
                FEMALE -> Known.FEMALE
                MALE -> Known.MALE
                OTHER -> Known.OTHER
                DECLINE_TO_SPECIFY -> Known.DECLINE_TO_SPECIFY
                else -> throw FinchInvalidDataException("Unknown Gender: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Gender && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class PhoneNumber
    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): String? = data.getNullable("data")

        fun type(): Type? = type.getNullable("type")

        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PhoneNumber = apply {
            if (validated) {
                return@apply
            }

            data()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
            fun builder() = Builder()
        }

        /** A builder for [PhoneNumber]. */
        class Builder internal constructor() {

            private var data: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(phoneNumber: PhoneNumber) = apply {
                data = phoneNumber.data
                type = phoneNumber.type
                additionalProperties = phoneNumber.additionalProperties.toMutableMap()
            }

            fun data(data: String?) = data(JsonField.ofNullable(data))

            fun data(data: JsonField<String>) = apply { this.data = data }

            fun type(type: Type?) = type(JsonField.ofNullable(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): PhoneNumber = PhoneNumber(data, type, additionalProperties.toImmutable())
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val WORK = of("work")

                val PERSONAL = of("personal")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                WORK,
                PERSONAL,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WORK,
                PERSONAL,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WORK -> Value.WORK
                    PERSONAL -> Value.PERSONAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws FinchInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WORK -> Known.WORK
                    PERSONAL -> Known.PERSONAL
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws FinchInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PhoneNumber && data == other.data && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhoneNumber{data=$data, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Individual && id == other.id && dob == other.dob && emails == other.emails && encryptedSsn == other.encryptedSsn && ethnicity == other.ethnicity && firstName == other.firstName && gender == other.gender && lastName == other.lastName && middleName == other.middleName && phoneNumbers == other.phoneNumbers && preferredName == other.preferredName && residence == other.residence && ssn == other.ssn && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, dob, emails, encryptedSsn, ethnicity, firstName, gender, lastName, middleName, phoneNumbers, preferredName, residence, ssn, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Individual{id=$id, dob=$dob, emails=$emails, encryptedSsn=$encryptedSsn, ethnicity=$ethnicity, firstName=$firstName, gender=$gender, lastName=$lastName, middleName=$middleName, phoneNumbers=$phoneNumbers, preferredName=$preferredName, residence=$residence, ssn=$ssn, additionalProperties=$additionalProperties}"
}
