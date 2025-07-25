// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.BaseDeserializer
import com.tryfinch.api.core.BaseSerializer
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.allMaxBy
import com.tryfinch.api.core.checkKnown
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = EmploymentData.Deserializer::class)
@JsonSerialize(using = EmploymentData.Serializer::class)
class EmploymentData
private constructor(
    private val unionMember0: UnionMember0? = null,
    private val batchError: BatchError? = null,
    private val _json: JsonValue? = null,
) {

    fun unionMember0(): UnionMember0? = unionMember0

    fun batchError(): BatchError? = batchError

    fun isUnionMember0(): Boolean = unionMember0 != null

    fun isBatchError(): Boolean = batchError != null

    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

    fun asBatchError(): BatchError = batchError.getOrThrow("batchError")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
            batchError != null -> visitor.visitBatchError(batchError)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): EmploymentData = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnionMember0(unionMember0: UnionMember0) {
                    unionMember0.validate()
                }

                override fun visitBatchError(batchError: BatchError) {
                    batchError.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitUnionMember0(unionMember0: UnionMember0) = unionMember0.validity()

                override fun visitBatchError(batchError: BatchError) = batchError.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EmploymentData && unionMember0 == other.unionMember0 && batchError == other.batchError /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(unionMember0, batchError) /* spotless:on */

    override fun toString(): String =
        when {
            unionMember0 != null -> "EmploymentData{unionMember0=$unionMember0}"
            batchError != null -> "EmploymentData{batchError=$batchError}"
            _json != null -> "EmploymentData{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EmploymentData")
        }

    companion object {

        fun ofUnionMember0(unionMember0: UnionMember0) = EmploymentData(unionMember0 = unionMember0)

        fun ofBatchError(batchError: BatchError) = EmploymentData(batchError = batchError)
    }

    /**
     * An interface that defines how to map each variant of [EmploymentData] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitUnionMember0(unionMember0: UnionMember0): T

        fun visitBatchError(batchError: BatchError): T

        /**
         * Maps an unknown variant of [EmploymentData] to a value of type [T].
         *
         * An instance of [EmploymentData] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws FinchInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw FinchInvalidDataException("Unknown EmploymentData: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<EmploymentData>(EmploymentData::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): EmploymentData {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                            EmploymentData(unionMember0 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BatchError>())?.let {
                            EmploymentData(batchError = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> EmploymentData(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<EmploymentData>(EmploymentData::class) {

        override fun serialize(
            value: EmploymentData,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                value.batchError != null -> generator.writeObject(value.batchError)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EmploymentData")
            }
        }
    }

    class UnionMember0
    private constructor(
        private val id: JsonField<String>,
        private val classCode: JsonField<String>,
        private val department: JsonField<Department>,
        private val employment: JsonField<Employment>,
        private val employmentStatus: JsonField<EmploymentStatus>,
        private val endDate: JsonField<String>,
        private val firstName: JsonField<String>,
        private val isActive: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val latestRehireDate: JsonField<String>,
        private val location: JsonField<Location>,
        private val manager: JsonField<Manager>,
        private val middleName: JsonField<String>,
        private val startDate: JsonField<String>,
        private val title: JsonField<String>,
        private val customFields: JsonField<List<CustomField>>,
        private val income: JsonField<Income>,
        private val incomeHistory: JsonField<List<Income?>>,
        private val sourceId: JsonField<String>,
        private val workId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("class_code")
            @ExcludeMissing
            classCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("department")
            @ExcludeMissing
            department: JsonField<Department> = JsonMissing.of(),
            @JsonProperty("employment")
            @ExcludeMissing
            employment: JsonField<Employment> = JsonMissing.of(),
            @JsonProperty("employment_status")
            @ExcludeMissing
            employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of(),
            @JsonProperty("end_date") @ExcludeMissing endDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latest_rehire_date")
            @ExcludeMissing
            latestRehireDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<Location> = JsonMissing.of(),
            @JsonProperty("manager") @ExcludeMissing manager: JsonField<Manager> = JsonMissing.of(),
            @JsonProperty("middle_name")
            @ExcludeMissing
            middleName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<List<CustomField>> = JsonMissing.of(),
            @JsonProperty("income") @ExcludeMissing income: JsonField<Income> = JsonMissing.of(),
            @JsonProperty("income_history")
            @ExcludeMissing
            incomeHistory: JsonField<List<Income?>> = JsonMissing.of(),
            @JsonProperty("source_id")
            @ExcludeMissing
            sourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("work_id") @ExcludeMissing workId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            classCode,
            department,
            employment,
            employmentStatus,
            endDate,
            firstName,
            isActive,
            lastName,
            latestRehireDate,
            location,
            manager,
            middleName,
            startDate,
            title,
            customFields,
            income,
            incomeHistory,
            sourceId,
            workId,
            mutableMapOf(),
        )

        /**
         * A stable Finch `id` (UUID v4) for an individual in the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Worker's compensation classification code for this employee
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun classCode(): String? = classCode.getNullable("class_code")

        /**
         * The department object.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun department(): Department? = department.getNullable("department")

        /**
         * The employment object.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employment(): Employment? = employment.getNullable("employment")

        /**
         * The detailed employment status of the individual. Available options: `active`,
         * `deceased`, `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun employmentStatus(): EmploymentStatus? =
            employmentStatus.getNullable("employment_status")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): String? = endDate.getNullable("end_date")

        /**
         * The legal first name of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("first_name")

        /**
         * `true` if the individual an an active employee or contractor at the company.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Boolean? = isActive.getNullable("is_active")

        /**
         * The legal last name of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("last_name")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun latestRehireDate(): String? = latestRehireDate.getNullable("latest_rehire_date")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun location(): Location? = location.getNullable("location")

        /**
         * The manager object representing the manager of the individual within the org.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun manager(): Manager? = manager.getNullable("manager")

        /**
         * The legal middle name of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun middleName(): String? = middleName.getNullable("middle_name")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): String? = startDate.getNullable("start_date")

        /**
         * The current title of the individual.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): String? = title.getNullable("title")

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customFields(): List<CustomField>? = customFields.getNullable("custom_fields")

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun income(): Income? = income.getNullable("income")

        /**
         * The array of income history.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun incomeHistory(): List<Income?>? = incomeHistory.getNullable("income_history")

        /**
         * The source system's unique employment identifier for this individual
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sourceId(): String? = sourceId.getNullable("source_id")

        /**
         * This field is deprecated in favour of `source_id`
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun workId(): String? = workId.getNullable("work_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [classCode].
         *
         * Unlike [classCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("class_code") @ExcludeMissing fun _classCode(): JsonField<String> = classCode

        /**
         * Returns the raw JSON value of [department].
         *
         * Unlike [department], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("department")
        @ExcludeMissing
        fun _department(): JsonField<Department> = department

        /**
         * Returns the raw JSON value of [employment].
         *
         * Unlike [employment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("employment")
        @ExcludeMissing
        fun _employment(): JsonField<Employment> = employment

        /**
         * Returns the raw JSON value of [employmentStatus].
         *
         * Unlike [employmentStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("employment_status")
        @ExcludeMissing
        fun _employmentStatus(): JsonField<EmploymentStatus> = employmentStatus

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<String> = endDate

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [latestRehireDate].
         *
         * Unlike [latestRehireDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("latest_rehire_date")
        @ExcludeMissing
        fun _latestRehireDate(): JsonField<String> = latestRehireDate

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

        /**
         * Returns the raw JSON value of [manager].
         *
         * Unlike [manager], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("manager") @ExcludeMissing fun _manager(): JsonField<Manager> = manager

        /**
         * Returns the raw JSON value of [middleName].
         *
         * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("middle_name")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate(): JsonField<String> = startDate

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<List<CustomField>> = customFields

        /**
         * Returns the raw JSON value of [income].
         *
         * Unlike [income], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("income") @ExcludeMissing fun _income(): JsonField<Income> = income

        /**
         * Returns the raw JSON value of [incomeHistory].
         *
         * Unlike [incomeHistory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("income_history")
        @ExcludeMissing
        fun _incomeHistory(): JsonField<List<Income?>> = incomeHistory

        /**
         * Returns the raw JSON value of [sourceId].
         *
         * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

        /**
         * Returns the raw JSON value of [workId].
         *
         * Unlike [workId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("work_id")
        @ExcludeMissing
        fun _workId(): JsonField<String> = workId

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
             * Returns a mutable builder for constructing an instance of [UnionMember0].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .classCode()
             * .department()
             * .employment()
             * .employmentStatus()
             * .endDate()
             * .firstName()
             * .isActive()
             * .lastName()
             * .latestRehireDate()
             * .location()
             * .manager()
             * .middleName()
             * .startDate()
             * .title()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UnionMember0]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var classCode: JsonField<String>? = null
            private var department: JsonField<Department>? = null
            private var employment: JsonField<Employment>? = null
            private var employmentStatus: JsonField<EmploymentStatus>? = null
            private var endDate: JsonField<String>? = null
            private var firstName: JsonField<String>? = null
            private var isActive: JsonField<Boolean>? = null
            private var lastName: JsonField<String>? = null
            private var latestRehireDate: JsonField<String>? = null
            private var location: JsonField<Location>? = null
            private var manager: JsonField<Manager>? = null
            private var middleName: JsonField<String>? = null
            private var startDate: JsonField<String>? = null
            private var title: JsonField<String>? = null
            private var customFields: JsonField<MutableList<CustomField>>? = null
            private var income: JsonField<Income> = JsonMissing.of()
            private var incomeHistory: JsonField<MutableList<Income?>>? = null
            private var sourceId: JsonField<String> = JsonMissing.of()
            private var workId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unionMember0: UnionMember0) = apply {
                id = unionMember0.id
                classCode = unionMember0.classCode
                department = unionMember0.department
                employment = unionMember0.employment
                employmentStatus = unionMember0.employmentStatus
                endDate = unionMember0.endDate
                firstName = unionMember0.firstName
                isActive = unionMember0.isActive
                lastName = unionMember0.lastName
                latestRehireDate = unionMember0.latestRehireDate
                location = unionMember0.location
                manager = unionMember0.manager
                middleName = unionMember0.middleName
                startDate = unionMember0.startDate
                title = unionMember0.title
                customFields = unionMember0.customFields.map { it.toMutableList() }
                income = unionMember0.income
                incomeHistory = unionMember0.incomeHistory.map { it.toMutableList() }
                sourceId = unionMember0.sourceId
                workId = unionMember0.workId
                additionalProperties = unionMember0.additionalProperties.toMutableMap()
            }

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Worker's compensation classification code for this employee */
            fun classCode(classCode: String?) = classCode(JsonField.ofNullable(classCode))

            /**
             * Sets [Builder.classCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classCode(classCode: JsonField<String>) = apply { this.classCode = classCode }

            /** The department object. */
            fun department(department: Department?) = department(JsonField.ofNullable(department))

            /**
             * Sets [Builder.department] to an arbitrary JSON value.
             *
             * You should usually call [Builder.department] with a well-typed [Department] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun department(department: JsonField<Department>) = apply {
                this.department = department
            }

            /** The employment object. */
            fun employment(employment: Employment?) = employment(JsonField.ofNullable(employment))

            /**
             * Sets [Builder.employment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employment] with a well-typed [Employment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun employment(employment: JsonField<Employment>) = apply {
                this.employment = employment
            }

            /**
             * The detailed employment status of the individual. Available options: `active`,
             * `deceased`, `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
             */
            fun employmentStatus(employmentStatus: EmploymentStatus?) =
                employmentStatus(JsonField.ofNullable(employmentStatus))

            /**
             * Sets [Builder.employmentStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.employmentStatus] with a well-typed
             * [EmploymentStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
                this.employmentStatus = employmentStatus
            }

            fun endDate(endDate: String?) = endDate(JsonField.ofNullable(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

            /** The legal first name of the individual. */
            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** `true` if the individual an an active employee or contractor at the company. */
            fun isActive(isActive: Boolean?) = isActive(JsonField.ofNullable(isActive))

            /**
             * Alias for [Builder.isActive].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isActive(isActive: Boolean) = isActive(isActive as Boolean?)

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            /** The legal last name of the individual. */
            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun latestRehireDate(latestRehireDate: String?) =
                latestRehireDate(JsonField.ofNullable(latestRehireDate))

            /**
             * Sets [Builder.latestRehireDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latestRehireDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latestRehireDate(latestRehireDate: JsonField<String>) = apply {
                this.latestRehireDate = latestRehireDate
            }

            fun location(location: Location?) = location(JsonField.ofNullable(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [Location] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<Location>) = apply { this.location = location }

            /** The manager object representing the manager of the individual within the org. */
            fun manager(manager: Manager?) = manager(JsonField.ofNullable(manager))

            /**
             * Sets [Builder.manager] to an arbitrary JSON value.
             *
             * You should usually call [Builder.manager] with a well-typed [Manager] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

            /** The legal middle name of the individual. */
            fun middleName(middleName: String?) = middleName(JsonField.ofNullable(middleName))

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            fun startDate(startDate: String?) = startDate(JsonField.ofNullable(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

            /** The current title of the individual. */
            fun title(title: String?) = title(JsonField.ofNullable(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            fun customFields(customFields: List<CustomField>?) =
                customFields(JsonField.ofNullable(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed `List<CustomField>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customFields(customFields: JsonField<List<CustomField>>) = apply {
                this.customFields = customFields.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomField] to [customFields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomField(customField: CustomField) = apply {
                customFields =
                    (customFields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customFields", it).add(customField)
                    }
            }

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            fun income(income: Income?) = income(JsonField.ofNullable(income))

            /**
             * Sets [Builder.income] to an arbitrary JSON value.
             *
             * You should usually call [Builder.income] with a well-typed [Income] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun income(income: JsonField<Income>) = apply { this.income = income }

            /** The array of income history. */
            fun incomeHistory(incomeHistory: List<Income?>?) =
                incomeHistory(JsonField.ofNullable(incomeHistory))

            /**
             * Sets [Builder.incomeHistory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.incomeHistory] with a well-typed `List<Income?>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun incomeHistory(incomeHistory: JsonField<List<Income?>>) = apply {
                this.incomeHistory = incomeHistory.map { it.toMutableList() }
            }

            /**
             * Adds a single [Income] to [Builder.incomeHistory].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIncomeHistory(incomeHistory: Income) = apply {
                this.incomeHistory =
                    (this.incomeHistory ?: JsonField.of(mutableListOf())).also {
                        checkKnown("incomeHistory", it).add(incomeHistory)
                    }
            }

            /** The source system's unique employment identifier for this individual */
            fun sourceId(sourceId: String?) = sourceId(JsonField.ofNullable(sourceId))

            /**
             * Sets [Builder.sourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

            /** This field is deprecated in favour of `source_id` */
            @Deprecated("deprecated")
            fun workId(workId: String?) = workId(JsonField.ofNullable(workId))

            /**
             * Sets [Builder.workId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun workId(workId: JsonField<String>) = apply { this.workId = workId }

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
             * Returns an immutable instance of [UnionMember0].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .classCode()
             * .department()
             * .employment()
             * .employmentStatus()
             * .endDate()
             * .firstName()
             * .isActive()
             * .lastName()
             * .latestRehireDate()
             * .location()
             * .manager()
             * .middleName()
             * .startDate()
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember0 =
                UnionMember0(
                    checkRequired("id", id),
                    checkRequired("classCode", classCode),
                    checkRequired("department", department),
                    checkRequired("employment", employment),
                    checkRequired("employmentStatus", employmentStatus),
                    checkRequired("endDate", endDate),
                    checkRequired("firstName", firstName),
                    checkRequired("isActive", isActive),
                    checkRequired("lastName", lastName),
                    checkRequired("latestRehireDate", latestRehireDate),
                    checkRequired("location", location),
                    checkRequired("manager", manager),
                    checkRequired("middleName", middleName),
                    checkRequired("startDate", startDate),
                    checkRequired("title", title),
                    (customFields ?: JsonMissing.of()).map { it.toImmutable() },
                    income,
                    (incomeHistory ?: JsonMissing.of()).map { it.toImmutable() },
                    sourceId,
                    workId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember0 = apply {
            if (validated) {
                return@apply
            }

            id()
            classCode()
            department()?.validate()
            employment()?.validate()
            employmentStatus()?.validate()
            endDate()
            firstName()
            isActive()
            lastName()
            latestRehireDate()
            location()?.validate()
            manager()?.validate()
            middleName()
            startDate()
            title()
            customFields()?.forEach { it.validate() }
            income()?.validate()
            incomeHistory()?.forEach { it?.validate() }
            sourceId()
            workId()
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
            (if (id.asKnown() == null) 0 else 1) +
                (if (classCode.asKnown() == null) 0 else 1) +
                (department.asKnown()?.validity() ?: 0) +
                (employment.asKnown()?.validity() ?: 0) +
                (employmentStatus.asKnown()?.validity() ?: 0) +
                (if (endDate.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (if (isActive.asKnown() == null) 0 else 1) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (if (latestRehireDate.asKnown() == null) 0 else 1) +
                (location.asKnown()?.validity() ?: 0) +
                (manager.asKnown()?.validity() ?: 0) +
                (if (middleName.asKnown() == null) 0 else 1) +
                (if (startDate.asKnown() == null) 0 else 1) +
                (if (title.asKnown() == null) 0 else 1) +
                (customFields.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (income.asKnown()?.validity() ?: 0) +
                (incomeHistory.asKnown()?.sumOf { (it?.validity() ?: 0).toInt() } ?: 0) +
                (if (sourceId.asKnown() == null) 0 else 1) +
                (if (workId.asKnown() == null) 0 else 1)

        /** The department object. */
        class Department
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
            ) : this(name, mutableMapOf())

            /**
             * The name of the department associated with the individual.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

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
                 * Returns a mutable builder for constructing an instance of [Department].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Department]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(department: Department) = apply {
                    name = department.name
                    additionalProperties = department.additionalProperties.toMutableMap()
                }

                /** The name of the department associated with the individual. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Department].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Department =
                    Department(checkRequired("name", name), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Department = apply {
                if (validated) {
                    return@apply
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = (if (name.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Department && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Department{name=$name, additionalProperties=$additionalProperties}"
        }

        /** The employment object. */
        class Employment
        private constructor(
            private val subtype: JsonField<Subtype>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("subtype")
                @ExcludeMissing
                subtype: JsonField<Subtype> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(subtype, type, mutableMapOf())

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subtype(): Subtype? = subtype.getNullable("subtype")

            /**
             * The main employment type of the individual.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Type? = type.getNullable("type")

            /**
             * Returns the raw JSON value of [subtype].
             *
             * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<Subtype> = subtype

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Employment].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .subtype()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Employment]. */
            class Builder internal constructor() {

                private var subtype: JsonField<Subtype>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(employment: Employment) = apply {
                    subtype = employment.subtype
                    type = employment.type
                    additionalProperties = employment.additionalProperties.toMutableMap()
                }

                /**
                 * The secondary employment type of the individual. Options: `full_time`,
                 * `part_time`, `intern`, `temp`, `seasonal` and `individual_contractor`.
                 */
                fun subtype(subtype: Subtype?) = subtype(JsonField.ofNullable(subtype))

                /**
                 * Sets [Builder.subtype] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtype] with a well-typed [Subtype] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

                /** The main employment type of the individual. */
                fun type(type: Type?) = type(JsonField.ofNullable(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Employment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .subtype()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Employment =
                    Employment(
                        checkRequired("subtype", subtype),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Employment = apply {
                if (validated) {
                    return@apply
                }

                subtype()?.validate()
                type()?.validate()
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
                (subtype.asKnown()?.validity() ?: 0) + (type.asKnown()?.validity() ?: 0)

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            class Subtype @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val FULL_TIME = of("full_time")

                    val INTERN = of("intern")

                    val PART_TIME = of("part_time")

                    val TEMP = of("temp")

                    val SEASONAL = of("seasonal")

                    val INDIVIDUAL_CONTRACTOR = of("individual_contractor")

                    fun of(value: String) = Subtype(JsonField.of(value))
                }

                /** An enum containing [Subtype]'s known values. */
                enum class Known {
                    FULL_TIME,
                    INTERN,
                    PART_TIME,
                    TEMP,
                    SEASONAL,
                    INDIVIDUAL_CONTRACTOR,
                }

                /**
                 * An enum containing [Subtype]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Subtype] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FULL_TIME,
                    INTERN,
                    PART_TIME,
                    TEMP,
                    SEASONAL,
                    INDIVIDUAL_CONTRACTOR,
                    /**
                     * An enum member indicating that [Subtype] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FULL_TIME -> Value.FULL_TIME
                        INTERN -> Value.INTERN
                        PART_TIME -> Value.PART_TIME
                        TEMP -> Value.TEMP
                        SEASONAL -> Value.SEASONAL
                        INDIVIDUAL_CONTRACTOR -> Value.INDIVIDUAL_CONTRACTOR
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
                        FULL_TIME -> Known.FULL_TIME
                        INTERN -> Known.INTERN
                        PART_TIME -> Known.PART_TIME
                        TEMP -> Known.TEMP
                        SEASONAL -> Known.SEASONAL
                        INDIVIDUAL_CONTRACTOR -> Known.INDIVIDUAL_CONTRACTOR
                        else -> throw FinchInvalidDataException("Unknown Subtype: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Subtype = apply {
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

                    return /* spotless:off */ other is Subtype && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The main employment type of the individual. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val EMPLOYEE = of("employee")

                    val CONTRACTOR = of("contractor")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    EMPLOYEE,
                    CONTRACTOR,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EMPLOYEE,
                    CONTRACTOR,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EMPLOYEE -> Value.EMPLOYEE
                        CONTRACTOR -> Value.CONTRACTOR
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
                        EMPLOYEE -> Known.EMPLOYEE
                        CONTRACTOR -> Known.CONTRACTOR
                        else -> throw FinchInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws FinchInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw FinchInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Employment && subtype == other.subtype && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(subtype, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Employment{subtype=$subtype, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * The detailed employment status of the individual. Available options: `active`,
         * `deceased`, `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
         */
        class EmploymentStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val ACTIVE = of("active")

                val DECEASED = of("deceased")

                val LEAVE = of("leave")

                val ONBOARDING = of("onboarding")

                val PREHIRE = of("prehire")

                val RETIRED = of("retired")

                val TERMINATED = of("terminated")

                fun of(value: String) = EmploymentStatus(JsonField.of(value))
            }

            /** An enum containing [EmploymentStatus]'s known values. */
            enum class Known {
                ACTIVE,
                DECEASED,
                LEAVE,
                ONBOARDING,
                PREHIRE,
                RETIRED,
                TERMINATED,
            }

            /**
             * An enum containing [EmploymentStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [EmploymentStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTIVE,
                DECEASED,
                LEAVE,
                ONBOARDING,
                PREHIRE,
                RETIRED,
                TERMINATED,
                /**
                 * An enum member indicating that [EmploymentStatus] was instantiated with an
                 * unknown value.
                 */
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
                    ACTIVE -> Value.ACTIVE
                    DECEASED -> Value.DECEASED
                    LEAVE -> Value.LEAVE
                    ONBOARDING -> Value.ONBOARDING
                    PREHIRE -> Value.PREHIRE
                    RETIRED -> Value.RETIRED
                    TERMINATED -> Value.TERMINATED
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
                    ACTIVE -> Known.ACTIVE
                    DECEASED -> Known.DECEASED
                    LEAVE -> Known.LEAVE
                    ONBOARDING -> Known.ONBOARDING
                    PREHIRE -> Known.PREHIRE
                    RETIRED -> Known.RETIRED
                    TERMINATED -> Known.TERMINATED
                    else -> throw FinchInvalidDataException("Unknown EmploymentStatus: $value")
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

            private var validated: Boolean = false

            fun validate(): EmploymentStatus = apply {
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

                return /* spotless:off */ other is EmploymentStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The manager object representing the manager of the individual within the org. */
        class Manager
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
            ) : this(id, mutableMapOf())

            /**
             * A stable Finch `id` (UUID v4) for an individual in the company.
             *
             * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                 * Returns a mutable builder for constructing an instance of [Manager].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Manager]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(manager: Manager) = apply {
                    id = manager.id
                    additionalProperties = manager.additionalProperties.toMutableMap()
                }

                /** A stable Finch `id` (UUID v4) for an individual in the company. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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
                 * Returns an immutable instance of [Manager].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Manager =
                    Manager(checkRequired("id", id), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Manager = apply {
                if (validated) {
                    return@apply
                }

                id()
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
            internal fun validity(): Int = (if (id.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Manager && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Manager{id=$id, additionalProperties=$additionalProperties}"
        }

        class CustomField
        private constructor(
            private val name: JsonField<String>,
            private val value: JsonField<Value>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
            ) : this(name, value, mutableMapOf())

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun value(): Value? = value.getNullable("value")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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

                /** Returns a mutable builder for constructing an instance of [CustomField]. */
                fun builder() = Builder()
            }

            /** A builder for [CustomField]. */
            class Builder internal constructor() {

                private var name: JsonField<String> = JsonMissing.of()
                private var value: JsonField<Value> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(customField: CustomField) = apply {
                    name = customField.name
                    value = customField.value
                    additionalProperties = customField.additionalProperties.toMutableMap()
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun value(value: Value?) = value(JsonField.ofNullable(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Value] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Value>) = apply { this.value = value }

                /** Alias for calling [value] with `Value.ofString(string)`. */
                fun value(string: String) = value(Value.ofString(string))

                /** Alias for calling [value] with `Value.ofJsonValues(jsonValues)`. */
                fun valueOfJsonValues(jsonValues: List<JsonValue>) =
                    value(Value.ofJsonValues(jsonValues))

                /** Alias for calling [value] with `Value.ofJson(json)`. */
                fun value(json: JsonValue) = value(Value.ofJson(json))

                /** Alias for calling [value] with `Value.ofDouble(double)`. */
                fun value(double: Double) = value(Value.ofDouble(double))

                /** Alias for calling [value] with `Value.ofBoolean(boolean)`. */
                fun value(boolean: Boolean) = value(Value.ofBoolean(boolean))

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
                 * Returns an immutable instance of [CustomField].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomField =
                    CustomField(name, value, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): CustomField = apply {
                if (validated) {
                    return@apply
                }

                name()
                value()?.validate()
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
                (if (name.asKnown() == null) 0 else 1) + (value.asKnown()?.validity() ?: 0)

            @JsonDeserialize(using = Value.Deserializer::class)
            @JsonSerialize(using = Value.Serializer::class)
            class Value
            private constructor(
                private val string: String? = null,
                private val jsonValues: List<JsonValue>? = null,
                private val json: JsonValue? = null,
                private val double: Double? = null,
                private val boolean: Boolean? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): String? = string

                fun jsonValues(): List<JsonValue>? = jsonValues

                fun json(): JsonValue? = json

                fun double(): Double? = double

                fun boolean(): Boolean? = boolean

                fun isString(): Boolean = string != null

                fun isJsonValues(): Boolean = jsonValues != null

                fun isJson(): Boolean = json != null

                fun isDouble(): Boolean = double != null

                fun isBoolean(): Boolean = boolean != null

                fun asString(): String = string.getOrThrow("string")

                fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

                fun asJson(): JsonValue = json.getOrThrow("json")

                fun asDouble(): Double = double.getOrThrow("double")

                fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        jsonValues != null -> visitor.visitJsonValues(jsonValues)
                        json != null -> visitor.visitJson(json)
                        double != null -> visitor.visitDouble(double)
                        boolean != null -> visitor.visitBoolean(boolean)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Value = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitJsonValues(jsonValues: List<JsonValue>) {}

                            override fun visitJson(json: JsonValue) {}

                            override fun visitDouble(double: Double) {}

                            override fun visitBoolean(boolean: Boolean) {}
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitJsonValues(jsonValues: List<JsonValue>) =
                                jsonValues.size

                            override fun visitJson(json: JsonValue) = 1

                            override fun visitDouble(double: Double) = 1

                            override fun visitBoolean(boolean: Boolean) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Value && string == other.string && jsonValues == other.jsonValues && json == other.json && double == other.double && boolean == other.boolean /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, jsonValues, json, double, boolean) /* spotless:on */

                override fun toString(): String =
                    when {
                        string != null -> "Value{string=$string}"
                        jsonValues != null -> "Value{jsonValues=$jsonValues}"
                        json != null -> "Value{json=$json}"
                        double != null -> "Value{double=$double}"
                        boolean != null -> "Value{boolean=$boolean}"
                        _json != null -> "Value{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Value")
                    }

                companion object {

                    fun ofString(string: String) = Value(string = string)

                    fun ofJsonValues(jsonValues: List<JsonValue>) =
                        Value(jsonValues = jsonValues.toImmutable())

                    fun ofJson(json: JsonValue) = Value(json = json)

                    fun ofDouble(double: Double) = Value(double = double)

                    fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)
                }

                /**
                 * An interface that defines how to map each variant of [Value] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitJsonValues(jsonValues: List<JsonValue>): T

                    fun visitJson(json: JsonValue): T

                    fun visitDouble(double: Double): T

                    fun visitBoolean(boolean: Boolean): T

                    /**
                     * Maps an unknown variant of [Value] to a value of type [T].
                     *
                     * An instance of [Value] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws FinchInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw FinchInvalidDataException("Unknown Value: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Value(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                        Value(jsonValues = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        Value(double = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                        Value(boolean = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                        Value(json = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants.
                            0 -> Value(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Value>(Value::class) {

                    override fun serialize(
                        value: Value,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.jsonValues != null -> generator.writeObject(value.jsonValues)
                            value.json != null -> generator.writeObject(value.json)
                            value.double != null -> generator.writeObject(value.double)
                            value.boolean != null -> generator.writeObject(value.boolean)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomField && name == other.name && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CustomField{name=$name, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UnionMember0 && id == other.id && classCode == other.classCode && department == other.department && employment == other.employment && employmentStatus == other.employmentStatus && endDate == other.endDate && firstName == other.firstName && isActive == other.isActive && lastName == other.lastName && latestRehireDate == other.latestRehireDate && location == other.location && manager == other.manager && middleName == other.middleName && startDate == other.startDate && title == other.title && customFields == other.customFields && income == other.income && incomeHistory == other.incomeHistory && sourceId == other.sourceId && workId == other.workId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, classCode, department, employment, employmentStatus, endDate, firstName, isActive, lastName, latestRehireDate, location, manager, middleName, startDate, title, customFields, income, incomeHistory, sourceId, workId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember0{id=$id, classCode=$classCode, department=$department, employment=$employment, employmentStatus=$employmentStatus, endDate=$endDate, firstName=$firstName, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, startDate=$startDate, title=$title, customFields=$customFields, income=$income, incomeHistory=$incomeHistory, sourceId=$sourceId, workId=$workId, additionalProperties=$additionalProperties}"
    }

    class BatchError
    private constructor(
        private val code: JsonField<Double>,
        private val message: JsonField<String>,
        private val name: JsonField<String>,
        private val finchCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("finch_code")
            @ExcludeMissing
            finchCode: JsonField<String> = JsonMissing.of(),
        ) : this(code, message, name, finchCode, mutableMapOf())

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): Double = code.getRequired("code")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun finchCode(): String? = finchCode.getNullable("finch_code")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Double> = code

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [finchCode].
         *
         * Unlike [finchCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("finch_code") @ExcludeMissing fun _finchCode(): JsonField<String> = finchCode

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
             * Returns a mutable builder for constructing an instance of [BatchError].
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * .message()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BatchError]. */
        class Builder internal constructor() {

            private var code: JsonField<Double>? = null
            private var message: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var finchCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(batchError: BatchError) = apply {
                code = batchError.code
                message = batchError.message
                name = batchError.name
                finchCode = batchError.finchCode
                additionalProperties = batchError.additionalProperties.toMutableMap()
            }

            fun code(code: Double) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<Double>) = apply { this.code = code }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun finchCode(finchCode: String) = finchCode(JsonField.of(finchCode))

            /**
             * Sets [Builder.finchCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finchCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun finchCode(finchCode: JsonField<String>) = apply { this.finchCode = finchCode }

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
             * Returns an immutable instance of [BatchError].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * .message()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BatchError =
                BatchError(
                    checkRequired("code", code),
                    checkRequired("message", message),
                    checkRequired("name", name),
                    finchCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BatchError = apply {
            if (validated) {
                return@apply
            }

            code()
            message()
            name()
            finchCode()
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
            (if (code.asKnown() == null) 0 else 1) +
                (if (message.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (finchCode.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BatchError && code == other.code && message == other.message && name == other.name && finchCode == other.finchCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, message, name, finchCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BatchError{code=$code, message=$message, name=$name, finchCode=$finchCode, additionalProperties=$additionalProperties}"
    }
}
