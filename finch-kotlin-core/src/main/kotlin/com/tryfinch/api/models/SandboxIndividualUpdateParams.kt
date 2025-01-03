// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

class SandboxIndividualUpdateParams
constructor(
    private val individualId: String,
    private val dob: String?,
    private val emails: List<Email>?,
    private val encryptedSsn: String?,
    private val ethnicity: Ethnicity?,
    private val firstName: String?,
    private val gender: Gender?,
    private val lastName: String?,
    private val middleName: String?,
    private val phoneNumbers: List<PhoneNumber?>?,
    private val preferredName: String?,
    private val residence: Location?,
    private val ssn: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun individualId(): String = individualId

    fun dob(): String? = dob

    fun emails(): List<Email>? = emails

    fun encryptedSsn(): String? = encryptedSsn

    fun ethnicity(): Ethnicity? = ethnicity

    fun firstName(): String? = firstName

    fun gender(): Gender? = gender

    fun lastName(): String? = lastName

    fun middleName(): String? = middleName

    fun phoneNumbers(): List<PhoneNumber?>? = phoneNumbers

    fun preferredName(): String? = preferredName

    fun residence(): Location? = residence

    fun ssn(): String? = ssn

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): SandboxIndividualUpdateBody {
        return SandboxIndividualUpdateBody(
            dob,
            emails,
            encryptedSsn,
            ethnicity,
            firstName,
            gender,
            lastName,
            middleName,
            phoneNumbers,
            preferredName,
            residence,
            ssn,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> individualId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SandboxIndividualUpdateBody.Builder::class)
    @NoAutoDetect
    class SandboxIndividualUpdateBody
    internal constructor(
        private val dob: String?,
        private val emails: List<Email>?,
        private val encryptedSsn: String?,
        private val ethnicity: Ethnicity?,
        private val firstName: String?,
        private val gender: Gender?,
        private val lastName: String?,
        private val middleName: String?,
        private val phoneNumbers: List<PhoneNumber?>?,
        private val preferredName: String?,
        private val residence: Location?,
        private val ssn: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("dob") fun dob(): String? = dob

        @JsonProperty("emails") fun emails(): List<Email>? = emails

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        @JsonProperty("encrypted_ssn") fun encryptedSsn(): String? = encryptedSsn

        /** The EEOC-defined ethnicity of the individual. */
        @JsonProperty("ethnicity") fun ethnicity(): Ethnicity? = ethnicity

        /** The legal first name of the individual. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /** The gender of the individual. */
        @JsonProperty("gender") fun gender(): Gender? = gender

        /** The legal last name of the individual. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name") fun middleName(): String? = middleName

        @JsonProperty("phone_numbers") fun phoneNumbers(): List<PhoneNumber?>? = phoneNumbers

        /** The preferred name of the individual. */
        @JsonProperty("preferred_name") fun preferredName(): String? = preferredName

        @JsonProperty("residence") fun residence(): Location? = residence

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        @JsonProperty("ssn") fun ssn(): String? = ssn

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var dob: String? = null
            private var emails: List<Email>? = null
            private var encryptedSsn: String? = null
            private var ethnicity: Ethnicity? = null
            private var firstName: String? = null
            private var gender: Gender? = null
            private var lastName: String? = null
            private var middleName: String? = null
            private var phoneNumbers: List<PhoneNumber?>? = null
            private var preferredName: String? = null
            private var residence: Location? = null
            private var ssn: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sandboxIndividualUpdateBody: SandboxIndividualUpdateBody) = apply {
                this.dob = sandboxIndividualUpdateBody.dob
                this.emails = sandboxIndividualUpdateBody.emails
                this.encryptedSsn = sandboxIndividualUpdateBody.encryptedSsn
                this.ethnicity = sandboxIndividualUpdateBody.ethnicity
                this.firstName = sandboxIndividualUpdateBody.firstName
                this.gender = sandboxIndividualUpdateBody.gender
                this.lastName = sandboxIndividualUpdateBody.lastName
                this.middleName = sandboxIndividualUpdateBody.middleName
                this.phoneNumbers = sandboxIndividualUpdateBody.phoneNumbers
                this.preferredName = sandboxIndividualUpdateBody.preferredName
                this.residence = sandboxIndividualUpdateBody.residence
                this.ssn = sandboxIndividualUpdateBody.ssn
                additionalProperties(sandboxIndividualUpdateBody.additionalProperties)
            }

            @JsonProperty("dob") fun dob(dob: String) = apply { this.dob = dob }

            @JsonProperty("emails") fun emails(emails: List<Email>) = apply { this.emails = emails }

            /**
             * Social Security Number of the individual in **encrypted** format. This field is only
             * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param
             * set in the body.
             */
            @JsonProperty("encrypted_ssn")
            fun encryptedSsn(encryptedSsn: String) = apply { this.encryptedSsn = encryptedSsn }

            /** The EEOC-defined ethnicity of the individual. */
            @JsonProperty("ethnicity")
            fun ethnicity(ethnicity: Ethnicity) = apply { this.ethnicity = ethnicity }

            /** The legal first name of the individual. */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /** The gender of the individual. */
            @JsonProperty("gender") fun gender(gender: Gender) = apply { this.gender = gender }

            /** The legal last name of the individual. */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            /** The legal middle name of the individual. */
            @JsonProperty("middle_name")
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            @JsonProperty("phone_numbers")
            fun phoneNumbers(phoneNumbers: List<PhoneNumber?>) = apply {
                this.phoneNumbers = phoneNumbers
            }

            /** The preferred name of the individual. */
            @JsonProperty("preferred_name")
            fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

            @JsonProperty("residence")
            fun residence(residence: Location) = apply { this.residence = residence }

            /**
             * Social Security Number of the individual. This field is only available with the `ssn`
             * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
             * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
             */
            @JsonProperty("ssn") fun ssn(ssn: String) = apply { this.ssn = ssn }

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

            fun build(): SandboxIndividualUpdateBody =
                SandboxIndividualUpdateBody(
                    dob,
                    emails?.toImmutable(),
                    encryptedSsn,
                    ethnicity,
                    firstName,
                    gender,
                    lastName,
                    middleName,
                    phoneNumbers?.toImmutable(),
                    preferredName,
                    residence,
                    ssn,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxIndividualUpdateBody && dob == other.dob && emails == other.emails && encryptedSsn == other.encryptedSsn && ethnicity == other.ethnicity && firstName == other.firstName && gender == other.gender && lastName == other.lastName && middleName == other.middleName && phoneNumbers == other.phoneNumbers && preferredName == other.preferredName && residence == other.residence && ssn == other.ssn && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dob, emails, encryptedSsn, ethnicity, firstName, gender, lastName, middleName, phoneNumbers, preferredName, residence, ssn, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxIndividualUpdateBody{dob=$dob, emails=$emails, encryptedSsn=$encryptedSsn, ethnicity=$ethnicity, firstName=$firstName, gender=$gender, lastName=$lastName, middleName=$middleName, phoneNumbers=$phoneNumbers, preferredName=$preferredName, residence=$residence, ssn=$ssn, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var individualId: String? = null
        private var dob: String? = null
        private var emails: MutableList<Email> = mutableListOf()
        private var encryptedSsn: String? = null
        private var ethnicity: Ethnicity? = null
        private var firstName: String? = null
        private var gender: Gender? = null
        private var lastName: String? = null
        private var middleName: String? = null
        private var phoneNumbers: MutableList<PhoneNumber?> = mutableListOf()
        private var preferredName: String? = null
        private var residence: Location? = null
        private var ssn: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(sandboxIndividualUpdateParams: SandboxIndividualUpdateParams) = apply {
            individualId = sandboxIndividualUpdateParams.individualId
            dob = sandboxIndividualUpdateParams.dob
            emails = sandboxIndividualUpdateParams.emails?.toMutableList() ?: mutableListOf()
            encryptedSsn = sandboxIndividualUpdateParams.encryptedSsn
            ethnicity = sandboxIndividualUpdateParams.ethnicity
            firstName = sandboxIndividualUpdateParams.firstName
            gender = sandboxIndividualUpdateParams.gender
            lastName = sandboxIndividualUpdateParams.lastName
            middleName = sandboxIndividualUpdateParams.middleName
            phoneNumbers =
                sandboxIndividualUpdateParams.phoneNumbers?.toMutableList() ?: mutableListOf()
            preferredName = sandboxIndividualUpdateParams.preferredName
            residence = sandboxIndividualUpdateParams.residence
            ssn = sandboxIndividualUpdateParams.ssn
            additionalHeaders = sandboxIndividualUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxIndividualUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                sandboxIndividualUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun individualId(individualId: String) = apply { this.individualId = individualId }

        fun dob(dob: String) = apply { this.dob = dob }

        fun emails(emails: List<Email>) = apply {
            this.emails.clear()
            this.emails.addAll(emails)
        }

        fun addEmail(email: Email) = apply { this.emails.add(email) }

        /**
         * Social Security Number of the individual in **encrypted** format. This field is only
         * available with the `ssn` scope enabled and the `options: { include: ['ssn'] }` param set
         * in the body.
         */
        fun encryptedSsn(encryptedSsn: String) = apply { this.encryptedSsn = encryptedSsn }

        /** The EEOC-defined ethnicity of the individual. */
        fun ethnicity(ethnicity: Ethnicity) = apply { this.ethnicity = ethnicity }

        /** The legal first name of the individual. */
        fun firstName(firstName: String) = apply { this.firstName = firstName }

        /** The gender of the individual. */
        fun gender(gender: Gender) = apply { this.gender = gender }

        /** The legal last name of the individual. */
        fun lastName(lastName: String) = apply { this.lastName = lastName }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String) = apply { this.middleName = middleName }

        fun phoneNumbers(phoneNumbers: List<PhoneNumber?>) = apply {
            this.phoneNumbers.clear()
            this.phoneNumbers.addAll(phoneNumbers)
        }

        fun addPhoneNumber(phoneNumber: PhoneNumber) = apply { this.phoneNumbers.add(phoneNumber) }

        /** The preferred name of the individual. */
        fun preferredName(preferredName: String) = apply { this.preferredName = preferredName }

        fun residence(residence: Location) = apply { this.residence = residence }

        /**
         * Social Security Number of the individual. This field is only available with the `ssn`
         * scope enabled and the `options: { include: ['ssn'] }` param set in the body.
         * [Click here to learn more about enabling the SSN field](/developer-resources/Enable-SSN-Field).
         */
        fun ssn(ssn: String) = apply { this.ssn = ssn }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): SandboxIndividualUpdateParams =
            SandboxIndividualUpdateParams(
                checkNotNull(individualId) { "`individualId` is required but was not set" },
                dob,
                emails.toImmutable().ifEmpty { null },
                encryptedSsn,
                ethnicity,
                firstName,
                gender,
                lastName,
                middleName,
                phoneNumbers.toImmutable().ifEmpty { null },
                preferredName,
                residence,
                ssn,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Email.Builder::class)
    @NoAutoDetect
    class Email
    private constructor(
        private val data: String?,
        private val type: Type?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("data") fun data(): String? = data

        @JsonProperty("type") fun type(): Type? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: String? = null
            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(email: Email) = apply {
                this.data = email.data
                this.type = email.type
                additionalProperties(email.additionalProperties)
            }

            @JsonProperty("data") fun data(data: String) = apply { this.data = data }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

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

            fun build(): Email =
                Email(
                    data,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val WORK = of("work")

                val PERSONAL = of("personal")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                WORK,
                PERSONAL,
            }

            enum class Value {
                WORK,
                PERSONAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    WORK -> Value.WORK
                    PERSONAL -> Value.PERSONAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    WORK -> Known.WORK
                    PERSONAL -> Known.PERSONAL
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

    class Ethnicity
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        enum class Value {
            ASIAN,
            WHITE,
            BLACK_OR_AFRICAN_AMERICAN,
            NATIVE_HAWAIIAN_OR_PACIFIC_ISLANDER,
            AMERICAN_INDIAN_OR_ALASKA_NATIVE,
            HISPANIC_OR_LATINO,
            TWO_OR_MORE_RACES,
            DECLINE_TO_SPECIFY,
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Ethnicity && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Gender
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FEMALE = of("female")

            val MALE = of("male")

            val OTHER = of("other")

            val DECLINE_TO_SPECIFY = of("decline_to_specify")

            fun of(value: String) = Gender(JsonField.of(value))
        }

        enum class Known {
            FEMALE,
            MALE,
            OTHER,
            DECLINE_TO_SPECIFY,
        }

        enum class Value {
            FEMALE,
            MALE,
            OTHER,
            DECLINE_TO_SPECIFY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FEMALE -> Value.FEMALE
                MALE -> Value.MALE
                OTHER -> Value.OTHER
                DECLINE_TO_SPECIFY -> Value.DECLINE_TO_SPECIFY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FEMALE -> Known.FEMALE
                MALE -> Known.MALE
                OTHER -> Known.OTHER
                DECLINE_TO_SPECIFY -> Known.DECLINE_TO_SPECIFY
                else -> throw FinchInvalidDataException("Unknown Gender: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Gender && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(builder = PhoneNumber.Builder::class)
    @NoAutoDetect
    class PhoneNumber
    private constructor(
        private val data: String?,
        private val type: Type?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("data") fun data(): String? = data

        @JsonProperty("type") fun type(): Type? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: String? = null
            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(phoneNumber: PhoneNumber) = apply {
                this.data = phoneNumber.data
                this.type = phoneNumber.type
                additionalProperties(phoneNumber.additionalProperties)
            }

            @JsonProperty("data") fun data(data: String) = apply { this.data = data }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

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

            fun build(): PhoneNumber =
                PhoneNumber(
                    data,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val WORK = of("work")

                val PERSONAL = of("personal")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                WORK,
                PERSONAL,
            }

            enum class Value {
                WORK,
                PERSONAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    WORK -> Value.WORK
                    PERSONAL -> Value.PERSONAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    WORK -> Known.WORK
                    PERSONAL -> Known.PERSONAL
                    else -> throw FinchInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is SandboxIndividualUpdateParams && individualId == other.individualId && dob == other.dob && emails == other.emails && encryptedSsn == other.encryptedSsn && ethnicity == other.ethnicity && firstName == other.firstName && gender == other.gender && lastName == other.lastName && middleName == other.middleName && phoneNumbers == other.phoneNumbers && preferredName == other.preferredName && residence == other.residence && ssn == other.ssn && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualId, dob, emails, encryptedSsn, ethnicity, firstName, gender, lastName, middleName, phoneNumbers, preferredName, residence, ssn, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SandboxIndividualUpdateParams{individualId=$individualId, dob=$dob, emails=$emails, encryptedSsn=$encryptedSsn, ethnicity=$ethnicity, firstName=$firstName, gender=$gender, lastName=$lastName, middleName=$middleName, phoneNumbers=$phoneNumbers, preferredName=$preferredName, residence=$residence, ssn=$ssn, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
