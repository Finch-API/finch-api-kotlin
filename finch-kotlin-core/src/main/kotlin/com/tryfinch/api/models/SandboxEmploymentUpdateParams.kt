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
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.models.*
import java.util.Objects

class SandboxEmploymentUpdateParams
constructor(
    private val individualId: String,
    private val classCode: String?,
    private val customFields: List<CustomField>?,
    private val department: Department?,
    private val employment: Employment?,
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun individualId(): String = individualId

    fun classCode(): String? = classCode

    fun customFields(): List<CustomField>? = customFields

    fun department(): Department? = department

    fun employment(): Employment? = employment

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

    internal fun getBody(): SandboxEmploymentUpdateBody {
        return SandboxEmploymentUpdateBody(
            classCode,
            customFields,
            department,
            employment,
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

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SandboxEmploymentUpdateBody &&
                this.classCode == other.classCode &&
                this.customFields == other.customFields &&
                this.department == other.department &&
                this.employment == other.employment &&
                this.endDate == other.endDate &&
                this.firstName == other.firstName &&
                this.income == other.income &&
                this.incomeHistory == other.incomeHistory &&
                this.isActive == other.isActive &&
                this.lastName == other.lastName &&
                this.latestRehireDate == other.latestRehireDate &&
                this.location == other.location &&
                this.manager == other.manager &&
                this.middleName == other.middleName &&
                this.sourceId == other.sourceId &&
                this.startDate == other.startDate &&
                this.title == other.title &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        classCode,
                        customFields,
                        department,
                        employment,
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
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SandboxEmploymentUpdateBody{classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, sourceId=$sourceId, startDate=$startDate, title=$title, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var classCode: String? = null
            private var customFields: List<CustomField>? = null
            private var department: Department? = null
            private var employment: Employment? = null
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
                    customFields?.toUnmodifiable(),
                    department,
                    employment,
                    endDate,
                    firstName,
                    income,
                    incomeHistory?.toUnmodifiable(),
                    isActive,
                    lastName,
                    latestRehireDate,
                    location,
                    manager,
                    middleName,
                    sourceId,
                    startDate,
                    title,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxEmploymentUpdateParams &&
            this.individualId == other.individualId &&
            this.classCode == other.classCode &&
            this.customFields == other.customFields &&
            this.department == other.department &&
            this.employment == other.employment &&
            this.endDate == other.endDate &&
            this.firstName == other.firstName &&
            this.income == other.income &&
            this.incomeHistory == other.incomeHistory &&
            this.isActive == other.isActive &&
            this.lastName == other.lastName &&
            this.latestRehireDate == other.latestRehireDate &&
            this.location == other.location &&
            this.manager == other.manager &&
            this.middleName == other.middleName &&
            this.sourceId == other.sourceId &&
            this.startDate == other.startDate &&
            this.title == other.title &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            individualId,
            classCode,
            customFields,
            department,
            employment,
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
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SandboxEmploymentUpdateParams{individualId=$individualId, classCode=$classCode, customFields=$customFields, department=$department, employment=$employment, endDate=$endDate, firstName=$firstName, income=$income, incomeHistory=$incomeHistory, isActive=$isActive, lastName=$lastName, latestRehireDate=$latestRehireDate, location=$location, manager=$manager, middleName=$middleName, sourceId=$sourceId, startDate=$startDate, title=$title, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(sandboxEmploymentUpdateParams: SandboxEmploymentUpdateParams) = apply {
            this.individualId = sandboxEmploymentUpdateParams.individualId
            this.classCode = sandboxEmploymentUpdateParams.classCode
            this.customFields(sandboxEmploymentUpdateParams.customFields ?: listOf())
            this.department = sandboxEmploymentUpdateParams.department
            this.employment = sandboxEmploymentUpdateParams.employment
            this.endDate = sandboxEmploymentUpdateParams.endDate
            this.firstName = sandboxEmploymentUpdateParams.firstName
            this.income = sandboxEmploymentUpdateParams.income
            this.incomeHistory(sandboxEmploymentUpdateParams.incomeHistory ?: listOf())
            this.isActive = sandboxEmploymentUpdateParams.isActive
            this.lastName = sandboxEmploymentUpdateParams.lastName
            this.latestRehireDate = sandboxEmploymentUpdateParams.latestRehireDate
            this.location = sandboxEmploymentUpdateParams.location
            this.manager = sandboxEmploymentUpdateParams.manager
            this.middleName = sandboxEmploymentUpdateParams.middleName
            this.sourceId = sandboxEmploymentUpdateParams.sourceId
            this.startDate = sandboxEmploymentUpdateParams.startDate
            this.title = sandboxEmploymentUpdateParams.title
            additionalQueryParams(sandboxEmploymentUpdateParams.additionalQueryParams)
            additionalHeaders(sandboxEmploymentUpdateParams.additionalHeaders)
            additionalBodyProperties(sandboxEmploymentUpdateParams.additionalBodyProperties)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SandboxEmploymentUpdateParams =
            SandboxEmploymentUpdateParams(
                checkNotNull(individualId) { "`individualId` is required but was not set" },
                classCode,
                if (customFields.size == 0) null else customFields.toUnmodifiable(),
                department,
                employment,
                endDate,
                firstName,
                income,
                if (incomeHistory.size == 0) null else incomeHistory.toUnmodifiable(),
                isActive,
                lastName,
                latestRehireDate,
                location,
                manager,
                middleName,
                sourceId,
                startDate,
                title,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

        private var hashCode: Int = 0

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("value") fun value(): JsonValue? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomField &&
                this.name == other.name &&
                this.value == other.value &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        value,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CustomField{name=$name, value=$value, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** The department object. */
    @JsonDeserialize(builder = Department.Builder::class)
    @NoAutoDetect
    class Department
    private constructor(
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The name of the department associated with the individual. */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Department &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(name, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Department{name=$name, additionalProperties=$additionalProperties}"

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

            fun build(): Department = Department(name, additionalProperties.toUnmodifiable())
        }
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Employment &&
                this.type == other.type &&
                this.subtype == other.subtype &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        subtype,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Employment{type=$type, subtype=$subtype, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Subtype
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Subtype && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val FULL_TIME = Subtype(JsonField.of("full_time"))

                val INTERN = Subtype(JsonField.of("intern"))

                val PART_TIME = Subtype(JsonField.of("part_time"))

                val TEMP = Subtype(JsonField.of("temp"))

                val SEASONAL = Subtype(JsonField.of("seasonal"))

                val INDIVIDUAL_CONTRACTOR = Subtype(JsonField.of("individual_contractor"))

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
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val EMPLOYEE = Type(JsonField.of("employee"))

                val CONTRACTOR = Type(JsonField.of("contractor"))

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
        }
    }

    /** The manager object representing the manager of the individual within the org. */
    @JsonDeserialize(builder = Manager.Builder::class)
    @NoAutoDetect
    class Manager
    private constructor(
        private val id: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A stable Finch `id` (UUID v4) for an individual in the company. */
        @JsonProperty("id") fun id(): String? = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Manager &&
                this.id == other.id &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(id, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Manager{id=$id, additionalProperties=$additionalProperties}"

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

            fun build(): Manager = Manager(id, additionalProperties.toUnmodifiable())
        }
    }
}
