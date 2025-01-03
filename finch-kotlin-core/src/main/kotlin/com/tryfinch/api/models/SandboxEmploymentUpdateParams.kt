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

class SandboxEmploymentUpdateParams
constructor(
    private val individualId: String,
    private val classCode: String?,
    private val customFields: List<CustomField>?,
    private val department: Department?,
    private val employment: Employment?,
    private val employmentStatus: EmploymentStatus?,
    private val endDate: String?,
    private val firstName: String?,
    private val income: Income?,
    private val incomeHistory: List<Income?>?,
    private val isActive: Boolean?,
    private val lastName: String?,
    private val latestRehireDate: String?,
    private val location: Location?,
    private val manager: Manager?,
    private val middleName: String?,
    private val sourceId: String?,
    private val startDate: String?,
    private val title: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun individualId(): String = individualId

    fun classCode(): String? = classCode

    fun customFields(): List<CustomField>? = customFields

    fun department(): Department? = department

    fun employment(): Employment? = employment

    fun employmentStatus(): EmploymentStatus? = employmentStatus

    fun endDate(): String? = endDate

    fun firstName(): String? = firstName

    fun income(): Income? = income

    fun incomeHistory(): List<Income?>? = incomeHistory

    fun isActive(): Boolean? = isActive

    fun lastName(): String? = lastName

    fun latestRehireDate(): String? = latestRehireDate

    fun location(): Location? = location

    fun manager(): Manager? = manager

    fun middleName(): String? = middleName

    fun sourceId(): String? = sourceId

    fun startDate(): String? = startDate

    fun title(): String? = title

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): SandboxEmploymentUpdateBody {
        return SandboxEmploymentUpdateBody(
            classCode,
            customFields,
            department,
            employment,
            employmentStatus,
            endDate,
            firstName,
            income,
            incomeHistory,
            isActive,
            lastName,
            latestRehireDate,
            location,
            manager,
            middleName,
            sourceId,
            startDate,
            title,
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

    @JsonDeserialize(builder = SandboxEmploymentUpdateBody.Builder::class)
    @NoAutoDetect
    class SandboxEmploymentUpdateBody
    internal constructor(
        private val classCode: String?,
        private val customFields: List<CustomField>?,
        private val department: Department?,
        private val employment: Employment?,
        private val employmentStatus: EmploymentStatus?,
        private val endDate: String?,
        private val firstName: String?,
        private val income: Income?,
        private val incomeHistory: List<Income?>?,
        private val isActive: Boolean?,
        private val lastName: String?,
        private val latestRehireDate: String?,
        private val location: Location?,
        private val manager: Manager?,
        private val middleName: String?,
        private val sourceId: String?,
        private val startDate: String?,
        private val title: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Worker's compensation classification code for this employee */
        @JsonProperty("class_code") fun classCode(): String? = classCode

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        @JsonProperty("custom_fields") fun customFields(): List<CustomField>? = customFields

        /** The department object. */
        @JsonProperty("department") fun department(): Department? = department

        /** The employment object. */
        @JsonProperty("employment") fun employment(): Employment? = employment

        /** The detailed employment status of the individual. */
        @JsonProperty("employment_status")
        fun employmentStatus(): EmploymentStatus? = employmentStatus

        @JsonProperty("end_date") fun endDate(): String? = endDate

        /** The legal first name of the individual. */
        @JsonProperty("first_name") fun firstName(): String? = firstName

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        @JsonProperty("income") fun income(): Income? = income

        /** The array of income history. */
        @JsonProperty("income_history") fun incomeHistory(): List<Income?>? = incomeHistory

        /** `true` if the individual an an active employee or contractor at the company. */
        @JsonProperty("is_active") fun isActive(): Boolean? = isActive

        /** The legal last name of the individual. */
        @JsonProperty("last_name") fun lastName(): String? = lastName

        @JsonProperty("latest_rehire_date") fun latestRehireDate(): String? = latestRehireDate

        @JsonProperty("location") fun location(): Location? = location

        /** The manager object representing the manager of the individual within the org. */
        @JsonProperty("manager") fun manager(): Manager? = manager

        /** The legal middle name of the individual. */
        @JsonProperty("middle_name") fun middleName(): String? = middleName

        /** The source system's unique employment identifier for this individual */
        @JsonProperty("source_id") fun sourceId(): String? = sourceId

        @JsonProperty("start_date") fun startDate(): String? = startDate

        /** The current title of the individual. */
        @JsonProperty("title") fun title(): String? = title

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var classCode: String? = null
            private var customFields: List<CustomField>? = null
            private var department: Department? = null
            private var employment: Employment? = null
            private var employmentStatus: EmploymentStatus? = null
            private var endDate: String? = null
            private var firstName: String? = null
            private var income: Income? = null
            private var incomeHistory: List<Income?>? = null
            private var isActive: Boolean? = null
            private var lastName: String? = null
            private var latestRehireDate: String? = null
            private var location: Location? = null
            private var manager: Manager? = null
            private var middleName: String? = null
            private var sourceId: String? = null
            private var startDate: String? = null
            private var title: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sandboxEmploymentUpdateBody: SandboxEmploymentUpdateBody) = apply {
                this.classCode = sandboxEmploymentUpdateBody.classCode
                this.customFields = sandboxEmploymentUpdateBody.customFields
                this.department = sandboxEmploymentUpdateBody.department
                this.employment = sandboxEmploymentUpdateBody.employment
                this.employmentStatus = sandboxEmploymentUpdateBody.employmentStatus
                this.endDate = sandboxEmploymentUpdateBody.endDate
                this.firstName = sandboxEmploymentUpdateBody.firstName
                this.income = sandboxEmploymentUpdateBody.income
                this.incomeHistory = sandboxEmploymentUpdateBody.incomeHistory
                this.isActive = sandboxEmploymentUpdateBody.isActive
                this.lastName = sandboxEmploymentUpdateBody.lastName
                this.latestRehireDate = sandboxEmploymentUpdateBody.latestRehireDate
                this.location = sandboxEmploymentUpdateBody.location
                this.manager = sandboxEmploymentUpdateBody.manager
                this.middleName = sandboxEmploymentUpdateBody.middleName
                this.sourceId = sandboxEmploymentUpdateBody.sourceId
                this.startDate = sandboxEmploymentUpdateBody.startDate
                this.title = sandboxEmploymentUpdateBody.title
                additionalProperties(sandboxEmploymentUpdateBody.additionalProperties)
            }

            /** Worker's compensation classification code for this employee */
            @JsonProperty("class_code")
            fun classCode(classCode: String) = apply { this.classCode = classCode }

            /**
             * Custom fields for the individual. These are fields which are defined by the employer
             * in the system. Custom fields are not currently supported for assisted connections.
             */
            @JsonProperty("custom_fields")
            fun customFields(customFields: List<CustomField>) = apply {
                this.customFields = customFields
            }

            /** The department object. */
            @JsonProperty("department")
            fun department(department: Department) = apply { this.department = department }

            /** The employment object. */
            @JsonProperty("employment")
            fun employment(employment: Employment) = apply { this.employment = employment }

            /** The detailed employment status of the individual. */
            @JsonProperty("employment_status")
            fun employmentStatus(employmentStatus: EmploymentStatus) = apply {
                this.employmentStatus = employmentStatus
            }

            @JsonProperty("end_date")
            fun endDate(endDate: String) = apply { this.endDate = endDate }

            /** The legal first name of the individual. */
            @JsonProperty("first_name")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            /**
             * The employee's income as reported by the provider. This may not always be annualized
             * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
             * information the provider returns.
             */
            @JsonProperty("income") fun income(income: Income) = apply { this.income = income }

            /** The array of income history. */
            @JsonProperty("income_history")
            fun incomeHistory(incomeHistory: List<Income?>) = apply {
                this.incomeHistory = incomeHistory
            }

            /** `true` if the individual an an active employee or contractor at the company. */
            @JsonProperty("is_active")
            fun isActive(isActive: Boolean) = apply { this.isActive = isActive }

            /** The legal last name of the individual. */
            @JsonProperty("last_name")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            @JsonProperty("latest_rehire_date")
            fun latestRehireDate(latestRehireDate: String) = apply {
                this.latestRehireDate = latestRehireDate
            }

            @JsonProperty("location")
            fun location(location: Location) = apply { this.location = location }

            /** The manager object representing the manager of the individual within the org. */
            @JsonProperty("manager")
            fun manager(manager: Manager) = apply { this.manager = manager }

            /** The legal middle name of the individual. */
            @JsonProperty("middle_name")
            fun middleName(middleName: String) = apply { this.middleName = middleName }

            /** The source system's unique employment identifier for this individual */
            @JsonProperty("source_id")
            fun sourceId(sourceId: String) = apply { this.sourceId = sourceId }

            @JsonProperty("start_date")
            fun startDate(startDate: String) = apply { this.startDate = startDate }

            /** The current title of the individual. */
            @JsonProperty("title") fun title(title: String) = apply { this.title = title }

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

            fun build(): SandboxEmploymentUpdateBody =
                SandboxEmploymentUpdateBody(
                    classCode,
                    customFields?.toImmutable(),
                    department,
                    employment,
                    employmentStatus,
                    endDate,
                    firstName,
                    income,
                    incomeHistory?.toImmutable(),
                    isActive,
                    lastName,
                    latestRehireDate,
                    location,
                    manager,
                    middleName,
                    sourceId,
                    startDate,
                    title,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SandboxEmploymentUpdateBody && classCode == other.classCode && customFields == other.customFields && department == other.department && employment == other.employment && employmentStatus == other.employmentStatus && endDate == other.endDate && firstName == other.firstName && income == other.income && incomeHistory == other.incomeHistory && isActive == other.isActive && lastName == other.lastName && latestRehireDate == other.latestRehireDate && location == other.location && manager == other.manager && middleName == other.middleName && sourceId == other.sourceId && startDate == other.startDate && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classCode, customFields, department, employment, employmentStatus, endDate, firstName, income, incomeHistory, isActive, lastName, latestRehireDate, location, manager, middleName, sourceId, startDate, title, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SandboxEmploymentUpdateBody{classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, employmentStatus=$employmentStatus, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, sourceId=$sourceId, startDate=$startDate, title=$title, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var individualId: String? = null
        private var classCode: String? = null
        private var customFields: MutableList<CustomField> = mutableListOf()
        private var department: Department? = null
        private var employment: Employment? = null
        private var employmentStatus: EmploymentStatus? = null
        private var endDate: String? = null
        private var firstName: String? = null
        private var income: Income? = null
        private var incomeHistory: MutableList<Income?> = mutableListOf()
        private var isActive: Boolean? = null
        private var lastName: String? = null
        private var latestRehireDate: String? = null
        private var location: Location? = null
        private var manager: Manager? = null
        private var middleName: String? = null
        private var sourceId: String? = null
        private var startDate: String? = null
        private var title: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(sandboxEmploymentUpdateParams: SandboxEmploymentUpdateParams) = apply {
            individualId = sandboxEmploymentUpdateParams.individualId
            classCode = sandboxEmploymentUpdateParams.classCode
            customFields =
                sandboxEmploymentUpdateParams.customFields?.toMutableList() ?: mutableListOf()
            department = sandboxEmploymentUpdateParams.department
            employment = sandboxEmploymentUpdateParams.employment
            employmentStatus = sandboxEmploymentUpdateParams.employmentStatus
            endDate = sandboxEmploymentUpdateParams.endDate
            firstName = sandboxEmploymentUpdateParams.firstName
            income = sandboxEmploymentUpdateParams.income
            incomeHistory =
                sandboxEmploymentUpdateParams.incomeHistory?.toMutableList() ?: mutableListOf()
            isActive = sandboxEmploymentUpdateParams.isActive
            lastName = sandboxEmploymentUpdateParams.lastName
            latestRehireDate = sandboxEmploymentUpdateParams.latestRehireDate
            location = sandboxEmploymentUpdateParams.location
            manager = sandboxEmploymentUpdateParams.manager
            middleName = sandboxEmploymentUpdateParams.middleName
            sourceId = sandboxEmploymentUpdateParams.sourceId
            startDate = sandboxEmploymentUpdateParams.startDate
            title = sandboxEmploymentUpdateParams.title
            additionalHeaders = sandboxEmploymentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxEmploymentUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                sandboxEmploymentUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun individualId(individualId: String) = apply { this.individualId = individualId }

        /** Worker's compensation classification code for this employee */
        fun classCode(classCode: String) = apply { this.classCode = classCode }

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        fun customFields(customFields: List<CustomField>) = apply {
            this.customFields.clear()
            this.customFields.addAll(customFields)
        }

        /**
         * Custom fields for the individual. These are fields which are defined by the employer in
         * the system. Custom fields are not currently supported for assisted connections.
         */
        fun addCustomField(customField: CustomField) = apply { this.customFields.add(customField) }

        /** The department object. */
        fun department(department: Department) = apply { this.department = department }

        /** The employment object. */
        fun employment(employment: Employment) = apply { this.employment = employment }

        /** The detailed employment status of the individual. */
        fun employmentStatus(employmentStatus: EmploymentStatus) = apply {
            this.employmentStatus = employmentStatus
        }

        fun endDate(endDate: String) = apply { this.endDate = endDate }

        /** The legal first name of the individual. */
        fun firstName(firstName: String) = apply { this.firstName = firstName }

        /**
         * The employee's income as reported by the provider. This may not always be annualized
         * income, but may be in units of bi-weekly, semi-monthly, daily, etc, depending on what
         * information the provider returns.
         */
        fun income(income: Income) = apply { this.income = income }

        /** The array of income history. */
        fun incomeHistory(incomeHistory: List<Income?>) = apply {
            this.incomeHistory.clear()
            this.incomeHistory.addAll(incomeHistory)
        }

        /** The array of income history. */
        fun addIncomeHistory(incomeHistory: Income) = apply {
            this.incomeHistory.add(incomeHistory)
        }

        /** `true` if the individual an an active employee or contractor at the company. */
        fun isActive(isActive: Boolean) = apply { this.isActive = isActive }

        /** The legal last name of the individual. */
        fun lastName(lastName: String) = apply { this.lastName = lastName }

        fun latestRehireDate(latestRehireDate: String) = apply {
            this.latestRehireDate = latestRehireDate
        }

        fun location(location: Location) = apply { this.location = location }

        /** The manager object representing the manager of the individual within the org. */
        fun manager(manager: Manager) = apply { this.manager = manager }

        /** The legal middle name of the individual. */
        fun middleName(middleName: String) = apply { this.middleName = middleName }

        /** The source system's unique employment identifier for this individual */
        fun sourceId(sourceId: String) = apply { this.sourceId = sourceId }

        fun startDate(startDate: String) = apply { this.startDate = startDate }

        /** The current title of the individual. */
        fun title(title: String) = apply { this.title = title }

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

        fun build(): SandboxEmploymentUpdateParams =
            SandboxEmploymentUpdateParams(
                checkNotNull(individualId) { "`individualId` is required but was not set" },
                classCode,
                customFields.toImmutable().ifEmpty { null },
                department,
                employment,
                employmentStatus,
                endDate,
                firstName,
                income,
                incomeHistory.toImmutable().ifEmpty { null },
                isActive,
                lastName,
                latestRehireDate,
                location,
                manager,
                middleName,
                sourceId,
                startDate,
                title,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = CustomField.Builder::class)
    @NoAutoDetect
    class CustomField
    private constructor(
        private val name: String?,
        private val value: JsonValue?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("value") fun value(): JsonValue? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var value: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customField: CustomField) = apply {
                this.name = customField.name
                this.value = customField.value
                additionalProperties(customField.additionalProperties)
            }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("value") fun value(value: JsonValue) = apply { this.value = value }

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
    @JsonDeserialize(builder = Department.Builder::class)
    @NoAutoDetect
    class Department
    private constructor(
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name of the department associated with the individual. */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(department: Department) = apply {
                this.name = department.name
                additionalProperties(department.additionalProperties)
            }

            /** The name of the department associated with the individual. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
    @JsonDeserialize(builder = Employment.Builder::class)
    @NoAutoDetect
    class Employment
    private constructor(
        private val type: Type?,
        private val subtype: Subtype?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The main employment type of the individual. */
        @JsonProperty("type") fun type(): Type? = type

        /**
         * The secondary employment type of the individual. Options: `full_time`, `part_time`,
         * `intern`, `temp`, `seasonal` and `individual_contractor`.
         */
        @JsonProperty("subtype") fun subtype(): Subtype? = subtype

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var subtype: Subtype? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(employment: Employment) = apply {
                this.type = employment.type
                this.subtype = employment.subtype
                additionalProperties(employment.additionalProperties)
            }

            /** The main employment type of the individual. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /**
             * The secondary employment type of the individual. Options: `full_time`, `part_time`,
             * `intern`, `temp`, `seasonal` and `individual_contractor`.
             */
            @JsonProperty("subtype")
            fun subtype(subtype: Subtype) = apply { this.subtype = subtype }

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
    @JsonDeserialize(builder = Manager.Builder::class)
    @NoAutoDetect
    class Manager
    private constructor(
        private val id: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        @JsonProperty("id") fun id(): String? = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(manager: Manager) = apply {
                this.id = manager.id
                additionalProperties(manager.additionalProperties)
            }

            /** A stable Finch `id` (UUID v4) for an individual in the company. */
            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

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

        return /* spotless:off */ other is SandboxEmploymentUpdateParams && individualId == other.individualId && classCode == other.classCode && customFields == other.customFields && department == other.department && employment == other.employment && employmentStatus == other.employmentStatus && endDate == other.endDate && firstName == other.firstName && income == other.income && incomeHistory == other.incomeHistory && isActive == other.isActive && lastName == other.lastName && latestRehireDate == other.latestRehireDate && location == other.location && manager == other.manager && middleName == other.middleName && sourceId == other.sourceId && startDate == other.startDate && title == other.title && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualId, classCode, customFields, department, employment, employmentStatus, endDate, firstName, income, incomeHistory, isActive, lastName, latestRehireDate, location, manager, middleName, sourceId, startDate, title, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "SandboxEmploymentUpdateParams{individualId=$individualId, classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, employmentStatus=$employmentStatus, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, sourceId=$sourceId, startDate=$startDate, title=$title, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
