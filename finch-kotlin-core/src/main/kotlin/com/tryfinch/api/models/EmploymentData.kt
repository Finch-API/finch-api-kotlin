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
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@NoAutoDetect
class EmploymentData
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("first_name")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("middle_name")
    @ExcludeMissing
    private val middleName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("last_name")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("title") @ExcludeMissing private val title: JsonField<String> = JsonMissing.of(),
    @JsonProperty("manager")
    @ExcludeMissing
    private val manager: JsonField<Manager> = JsonMissing.of(),
    @JsonProperty("department")
    @ExcludeMissing
    private val department: JsonField<Department> = JsonMissing.of(),
    @JsonProperty("employment")
    @ExcludeMissing
    private val employment: JsonField<Employment> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("latest_rehire_date")
    @ExcludeMissing
    private val latestRehireDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("is_active")
    @ExcludeMissing
    private val isActive: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("employment_status")
    @ExcludeMissing
    private val employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of(),
    @JsonProperty("class_code")
    @ExcludeMissing
    private val classCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("location")
    @ExcludeMissing
    private val location: JsonField<Location> = JsonMissing.of(),
    @JsonProperty("income")
    @ExcludeMissing
    private val income: JsonField<Income> = JsonMissing.of(),
    @JsonProperty("income_history")
    @ExcludeMissing
    private val incomeHistory: JsonField<List<Income?>> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<List<CustomField>> = JsonMissing.of(),
    @JsonProperty("source_id")
    @ExcludeMissing
    private val sourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("work_id")
    @ExcludeMissing
    private val workId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** string A stable Finch `id` (UUID v4) for an individual in the company. */
    fun id(): String? = id.getNullable("id")

    /** The legal first name of the individual. */
    fun firstName(): String? = firstName.getNullable("first_name")

    /** The legal middle name of the individual. */
    fun middleName(): String? = middleName.getNullable("middle_name")

    /** The legal last name of the individual. */
    fun lastName(): String? = lastName.getNullable("last_name")

    /** The current title of the individual. */
    fun title(): String? = title.getNullable("title")

    /** The manager object representing the manager of the individual within the org. */
    fun manager(): Manager? = manager.getNullable("manager")

    /** The department object. */
    fun department(): Department? = department.getNullable("department")

    /** The employment object. */
    fun employment(): Employment? = employment.getNullable("employment")

    fun startDate(): String? = startDate.getNullable("start_date")

    fun endDate(): String? = endDate.getNullable("end_date")

    fun latestRehireDate(): String? = latestRehireDate.getNullable("latest_rehire_date")

    /** `true` if the individual an an active employee or contractor at the company. */
    fun isActive(): Boolean? = isActive.getNullable("is_active")

    /**
     * The detailed employment status of the individual. Available options: `active`, `deceased`,
     * `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
     */
    fun employmentStatus(): EmploymentStatus? = employmentStatus.getNullable("employment_status")

    /** Worker's compensation classification code for this employee */
    fun classCode(): String? = classCode.getNullable("class_code")

    fun location(): Location? = location.getNullable("location")

    /**
     * The employee's income as reported by the provider. This may not always be annualized income,
     * but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
     * provider returns.
     */
    fun income(): Income? = income.getNullable("income")

    /** The array of income history. */
    fun incomeHistory(): List<Income?>? = incomeHistory.getNullable("income_history")

    /**
     * Custom fields for the individual. These are fields which are defined by the employer in the
     * system.
     */
    fun customFields(): List<CustomField>? = customFields.getNullable("custom_fields")

    /** The source system's unique employment identifier for this individual */
    fun sourceId(): String? = sourceId.getNullable("source_id")

    /** This field is deprecated in favour of `source_id` */
    fun workId(): String? = workId.getNullable("work_id")

    /** string A stable Finch `id` (UUID v4) for an individual in the company. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The legal first name of the individual. */
    @JsonProperty("first_name") @ExcludeMissing fun _firstName() = firstName

    /** The legal middle name of the individual. */
    @JsonProperty("middle_name") @ExcludeMissing fun _middleName() = middleName

    /** The legal last name of the individual. */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName() = lastName

    /** The current title of the individual. */
    @JsonProperty("title") @ExcludeMissing fun _title() = title

    /** The manager object representing the manager of the individual within the org. */
    @JsonProperty("manager") @ExcludeMissing fun _manager() = manager

    /** The department object. */
    @JsonProperty("department") @ExcludeMissing fun _department() = department

    /** The employment object. */
    @JsonProperty("employment") @ExcludeMissing fun _employment() = employment

    @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

    @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

    @JsonProperty("latest_rehire_date") @ExcludeMissing fun _latestRehireDate() = latestRehireDate

    /** `true` if the individual an an active employee or contractor at the company. */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive() = isActive

    /**
     * The detailed employment status of the individual. Available options: `active`, `deceased`,
     * `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
     */
    @JsonProperty("employment_status") @ExcludeMissing fun _employmentStatus() = employmentStatus

    /** Worker's compensation classification code for this employee */
    @JsonProperty("class_code") @ExcludeMissing fun _classCode() = classCode

    @JsonProperty("location") @ExcludeMissing fun _location() = location

    /**
     * The employee's income as reported by the provider. This may not always be annualized income,
     * but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what information the
     * provider returns.
     */
    @JsonProperty("income") @ExcludeMissing fun _income() = income

    /** The array of income history. */
    @JsonProperty("income_history") @ExcludeMissing fun _incomeHistory() = incomeHistory

    /**
     * Custom fields for the individual. These are fields which are defined by the employer in the
     * system.
     */
    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    /** The source system's unique employment identifier for this individual */
    @JsonProperty("source_id") @ExcludeMissing fun _sourceId() = sourceId

    /** This field is deprecated in favour of `source_id` */
    @JsonProperty("work_id") @ExcludeMissing fun _workId() = workId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EmploymentData = apply {
        if (!validated) {
            id()
            firstName()
            middleName()
            lastName()
            title()
            manager()?.validate()
            department()?.validate()
            employment()?.validate()
            startDate()
            endDate()
            latestRehireDate()
            isActive()
            employmentStatus()
            classCode()
            location()?.validate()
            income()?.validate()
            incomeHistory()?.forEach { it?.validate() }
            customFields()?.forEach { it.validate() }
            sourceId()
            workId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var middleName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var manager: JsonField<Manager> = JsonMissing.of()
        private var department: JsonField<Department> = JsonMissing.of()
        private var employment: JsonField<Employment> = JsonMissing.of()
        private var startDate: JsonField<String> = JsonMissing.of()
        private var endDate: JsonField<String> = JsonMissing.of()
        private var latestRehireDate: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var employmentStatus: JsonField<EmploymentStatus> = JsonMissing.of()
        private var classCode: JsonField<String> = JsonMissing.of()
        private var location: JsonField<Location> = JsonMissing.of()
        private var income: JsonField<Income> = JsonMissing.of()
        private var incomeHistory: JsonField<List<Income?>> = JsonMissing.of()
        private var customFields: JsonField<List<CustomField>> = JsonMissing.of()
        private var sourceId: JsonField<String> = JsonMissing.of()
        private var workId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(employmentData: EmploymentData) = apply {
            id = employmentData.id
            firstName = employmentData.firstName
            middleName = employmentData.middleName
            lastName = employmentData.lastName
            title = employmentData.title
            manager = employmentData.manager
            department = employmentData.department
            employment = employmentData.employment
            startDate = employmentData.startDate
            endDate = employmentData.endDate
            latestRehireDate = employmentData.latestRehireDate
            isActive = employmentData.isActive
            employmentStatus = employmentData.employmentStatus
            classCode = employmentData.classCode
            location = employmentData.location
            income = employmentData.income
            incomeHistory = employmentData.incomeHistory
            customFields = employmentData.customFields
            sourceId = employmentData.sourceId
            workId = employmentData.workId
            additionalProperties = employmentData.additionalProperties.toMutableMap()
        }

        /** string A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: String) = id(JsonField.of(id))

        /** string A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The legal first name of the individual. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /** The legal first name of the individual. */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String) = middleName(JsonField.of(middleName))

        /** The legal middle name of the individual. */
        fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

        /** The legal last name of the individual. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /** The legal last name of the individual. */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** The current title of the individual. */
        fun title(title: String) = title(JsonField.of(title))

        /** The current title of the individual. */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: Manager) = manager(JsonField.of(manager))

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: JsonField<Manager>) = apply { this.manager = manager }

        /** The department object. */
        fun department(department: Department) = department(JsonField.of(department))

        /** The department object. */
        fun department(department: JsonField<Department>) = apply { this.department = department }

        /** The employment object. */
        fun employment(employment: Employment) = employment(JsonField.of(employment))

        /** The employment object. */
        fun employment(employment: JsonField<Employment>) = apply { this.employment = employment }

        fun startDate(startDate: String) = startDate(JsonField.of(startDate))

        fun startDate(startDate: JsonField<String>) = apply { this.startDate = startDate }

        fun endDate(endDate: String) = endDate(JsonField.of(endDate))

        fun endDate(endDate: JsonField<String>) = apply { this.endDate = endDate }

        fun latestRehireDate(latestRehireDate: String) =
            latestRehireDate(JsonField.of(latestRehireDate))

        fun latestRehireDate(latestRehireDate: JsonField<String>) = apply {
            this.latestRehireDate = latestRehireDate
        }

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /**
         * The detailed employment status of the individual. Available options: `active`,
         * `deceased`, `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
         */
        fun employmentStatus(employmentStatus: EmploymentStatus) =
            employmentStatus(JsonField.of(employmentStatus))

        /**
         * The detailed employment status of the individual. Available options: `active`,
         * `deceased`, `leave`, `onboarding`, `prehire`, `retired`, `terminated`.
         */
        fun employmentStatus(employmentStatus: JsonField<EmploymentStatus>) = apply {
            this.employmentStatus = employmentStatus
        }

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: String) = classCode(JsonField.of(classCode))

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: JsonField<String>) = apply { this.classCode = classCode }

        fun location(location: Location) = location(JsonField.of(location))

        fun location(location: JsonField<Location>) = apply { this.location = location }

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        fun income(income: Income) = income(JsonField.of(income))

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        fun income(income: JsonField<Income>) = apply { this.income = income }

        /** The array of income history. */
        fun incomeHistory(incomeHistory: List<Income?>) = incomeHistory(JsonField.of(incomeHistory))

        /** The array of income history. */
        fun incomeHistory(incomeHistory: JsonField<List<Income?>>) = apply {
            this.incomeHistory = incomeHistory
        }

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system.
         */
        fun customFields(customFields: List<CustomField>) = customFields(JsonField.of(customFields))

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system.
         */
        fun customFields(customFields: JsonField<List<CustomField>>) = apply {
            this.customFields = customFields
        }

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

        /** This field is deprecated in favour of `source_id` */
        fun workId(workId: String) = workId(JsonField.of(workId))

        /** This field is deprecated in favour of `source_id` */
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

        fun build(): EmploymentData =
            EmploymentData(
                id,
                firstName,
                middleName,
                lastName,
                title,
                manager,
                department,
                employment,
                startDate,
                endDate,
                latestRehireDate,
                isActive,
                employmentStatus,
                classCode,
                location,
                income,
                incomeHistory.map { it.toImmutable() },
                customFields.map { it.toImmutable() },
                sourceId,
                workId,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class CustomField
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing private val value: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun name(): String? = name.getNullable("name")

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomField = apply {
            if (!validated) {
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customField: CustomField) = apply {
                name = customField.name
                value = customField.value
                additionalProperties = customField.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun value(value: JsonValue) = apply { this.value = value }

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

            fun build(): CustomField =
                CustomField(
                    name,
                    value,
                    additionalProperties.toImmutable(),
                )
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

    /** The department object. */
    @NoAutoDetect
    class Department
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the department associated with the individual. */
        fun name(): String? = name.getNullable("name")

        /** The name of the department associated with the individual. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Department = apply {
            if (!validated) {
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(department: Department) = apply {
                name = department.name
                additionalProperties = department.additionalProperties.toMutableMap()
            }

            /** The name of the department associated with the individual. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the department associated with the individual. */
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

            fun build(): Department = Department(name, additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class Employment
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("subtype")
        @ExcludeMissing
        private val subtype: JsonField<Subtype> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The main employment type of the individual. */
        fun type(): Type? = type.getNullable("type")

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         */
        fun subtype(): Subtype? = subtype.getNullable("subtype")

        /** The main employment type of the individual. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         */
        @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Employment = apply {
            if (!validated) {
                type()
                subtype()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var subtype: JsonField<Subtype> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(employment: Employment) = apply {
                type = employment.type
                subtype = employment.subtype
                additionalProperties = employment.additionalProperties.toMutableMap()
            }

            /** The main employment type of the individual. */
            fun type(type: Type) = type(JsonField.of(type))

            /** The main employment type of the individual. */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            fun subtype(subtype: Subtype) = subtype(JsonField.of(subtype))

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

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

            fun build(): Employment =
                Employment(
                    type,
                    subtype,
                    additionalProperties.toImmutable(),
                )
        }

        class Subtype
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            enum class Known {
                FULL_TIME,
                INTERN,
                PART_TIME,
                TEMP,
                SEASONAL,
                INDIVIDUAL_CONTRACTOR,
            }

            enum class Value {
                FULL_TIME,
                INTERN,
                PART_TIME,
                TEMP,
                SEASONAL,
                INDIVIDUAL_CONTRACTOR,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Subtype && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val EMPLOYEE = of("employee")

                val CONTRACTOR = of("contractor")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                EMPLOYEE,
                CONTRACTOR,
            }

            enum class Value {
                EMPLOYEE,
                CONTRACTOR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EMPLOYEE -> Value.EMPLOYEE
                    CONTRACTOR -> Value.CONTRACTOR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EMPLOYEE -> Known.EMPLOYEE
                    CONTRACTOR -> Known.CONTRACTOR
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

            return /* spotless:off */ other is Employment && type == other.type && subtype == other.subtype && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, subtype, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Employment{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"
    }

    class EmploymentStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        enum class Known {
            ACTIVE,
            DECEASED,
            LEAVE,
            ONBOARDING,
            PREHIRE,
            RETIRED,
            TERMINATED,
        }

        enum class Value {
            ACTIVE,
            DECEASED,
            LEAVE,
            ONBOARDING,
            PREHIRE,
            RETIRED,
            TERMINATED,
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()

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
    @NoAutoDetect
    class Manager
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        fun id(): String? = id.getNullable("id")

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Manager = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(manager: Manager) = apply {
                id = manager.id
                additionalProperties = manager.additionalProperties.toMutableMap()
            }

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: String) = id(JsonField.of(id))

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): Manager = Manager(id, additionalProperties.toImmutable())
        }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EmploymentData && id == other.id && firstName == other.firstName && middleName == other.middleName && lastName == other.lastName && title == other.title && manager == other.manager && department == other.department && employment == other.employment && startDate == other.startDate && endDate == other.endDate && latestRehireDate == other.latestRehireDate && isActive == other.isActive && employmentStatus == other.employmentStatus && classCode == other.classCode && location == other.location && income == other.income && incomeHistory == other.incomeHistory && customFields == other.customFields && sourceId == other.sourceId && workId == other.workId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, firstName, middleName, lastName, title, manager, department, employment, startDate, endDate, latestRehireDate, isActive, employmentStatus, classCode, location, income, incomeHistory, customFields, sourceId, workId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmploymentData{id=$id, firstName=$firstName, middleName=$middleName, lastName=$lastName, title=$title, manager=$manager, department=$department, employment=$employment, startDate=$startDate, endDate=$endDate, latestRehireDate=$latestRehireDate, isActive=$isActive, employmentStatus=$employmentStatus, classCode=$classCode, location=$location, income=$income, incomeHistory=$incomeHistory, customFields=$customFields, sourceId=$sourceId, workId=$workId, additionalProperties=$additionalProperties}"
}
