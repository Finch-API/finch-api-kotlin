// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.tryfinch.api.core.Enum
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.Params
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.core.http.QueryParams
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.time.LocalDate
import java.util.Objects

/**
 * **Beta:** this endpoint currently serves employers onboarded after March 4th and historical
 * support will be added soon Retrieve a list of detailed pay statement items for the access token's
 * connection account.
 */
class HrisCompanyPayStatementItemListParams
private constructor(
    private val categories: List<Category>?,
    private val endDate: LocalDate?,
    private val entityIds: List<String>?,
    private val name: String?,
    private val startDate: LocalDate?,
    private val type: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Comma-delimited list of pay statement item categories to filter on. If empty, defaults to all
     * categories.
     */
    fun categories(): List<Category>? = categories

    /**
     * The end date to retrieve pay statement items by via their last seen pay date in `YYYY-MM-DD`
     * format.
     */
    fun endDate(): LocalDate? = endDate

    /** The entity IDs to specify which entities' data to access. */
    fun entityIds(): List<String>? = entityIds

    /** Case-insensitive partial match search by pay statement item name. */
    fun name(): String? = name

    /**
     * The start date to retrieve pay statement items by via their last seen pay date (inclusive) in
     * `YYYY-MM-DD` format.
     */
    fun startDate(): LocalDate? = startDate

    /** String search by pay statement item type. */
    fun type(): String? = type

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): HrisCompanyPayStatementItemListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [HrisCompanyPayStatementItemListParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [HrisCompanyPayStatementItemListParams]. */
    class Builder internal constructor() {

        private var categories: MutableList<Category>? = null
        private var endDate: LocalDate? = null
        private var entityIds: MutableList<String>? = null
        private var name: String? = null
        private var startDate: LocalDate? = null
        private var type: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            hrisCompanyPayStatementItemListParams: HrisCompanyPayStatementItemListParams
        ) = apply {
            categories = hrisCompanyPayStatementItemListParams.categories?.toMutableList()
            endDate = hrisCompanyPayStatementItemListParams.endDate
            entityIds = hrisCompanyPayStatementItemListParams.entityIds?.toMutableList()
            name = hrisCompanyPayStatementItemListParams.name
            startDate = hrisCompanyPayStatementItemListParams.startDate
            type = hrisCompanyPayStatementItemListParams.type
            additionalHeaders = hrisCompanyPayStatementItemListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                hrisCompanyPayStatementItemListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Comma-delimited list of pay statement item categories to filter on. If empty, defaults to
         * all categories.
         */
        fun categories(categories: List<Category>?) = apply {
            this.categories = categories?.toMutableList()
        }

        /**
         * Adds a single [Category] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: Category) = apply {
            categories = (categories ?: mutableListOf()).apply { add(category) }
        }

        /**
         * The end date to retrieve pay statement items by via their last seen pay date in
         * `YYYY-MM-DD` format.
         */
        fun endDate(endDate: LocalDate?) = apply { this.endDate = endDate }

        /** The entity IDs to specify which entities' data to access. */
        fun entityIds(entityIds: List<String>?) = apply {
            this.entityIds = entityIds?.toMutableList()
        }

        /**
         * Adds a single [String] to [entityIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntityId(entityId: String) = apply {
            entityIds = (entityIds ?: mutableListOf()).apply { add(entityId) }
        }

        /** Case-insensitive partial match search by pay statement item name. */
        fun name(name: String?) = apply { this.name = name }

        /**
         * The start date to retrieve pay statement items by via their last seen pay date
         * (inclusive) in `YYYY-MM-DD` format.
         */
        fun startDate(startDate: LocalDate?) = apply { this.startDate = startDate }

        /** String search by pay statement item type. */
        fun type(type: String?) = apply { this.type = type }

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

        /**
         * Returns an immutable instance of [HrisCompanyPayStatementItemListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HrisCompanyPayStatementItemListParams =
            HrisCompanyPayStatementItemListParams(
                categories?.toImmutable(),
                endDate,
                entityIds?.toImmutable(),
                name,
                startDate,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                categories?.forEach { put("categories[]", it.toString()) }
                endDate?.let { put("end_date", it.toString()) }
                entityIds?.forEach { put("entity_ids[]", it) }
                name?.let { put("name", it) }
                startDate?.let { put("start_date", it.toString()) }
                type?.let { put("type", it) }
                putAll(additionalQueryParams)
            }
            .build()

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

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisCompanyPayStatementItemListParams &&
            categories == other.categories &&
            endDate == other.endDate &&
            entityIds == other.entityIds &&
            name == other.name &&
            startDate == other.startDate &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            categories,
            endDate,
            entityIds,
            name,
            startDate,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "HrisCompanyPayStatementItemListParams{categories=$categories, endDate=$endDate, entityIds=$entityIds, name=$name, startDate=$startDate, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
