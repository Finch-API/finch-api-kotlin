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
import com.tryfinch.api.errors.FinchInvalidDataException
import com.tryfinch.api.services.async.hris.EmploymentServiceAsync
import java.util.Collections
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** Read individual employment and income data */
class HrisEmploymentRetrieveManyPageAsync
private constructor(
    private val employmentsService: EmploymentServiceAsync,
    private val params: HrisEmploymentRetrieveManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<EmploymentDataResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisEmploymentRetrieveManyPageAsync && employmentsService == other.employmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(employmentsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisEmploymentRetrieveManyPageAsync{employmentsService=$employmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !responses().isEmpty()
    }

    fun getNextPageParams(): HrisEmploymentRetrieveManyParams? {
        return null
    }

    suspend fun getNextPage(): HrisEmploymentRetrieveManyPageAsync? {
        return getNextPageParams()?.let { employmentsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            employmentsService: EmploymentServiceAsync,
            params: HrisEmploymentRetrieveManyParams,
            response: Response,
        ) = HrisEmploymentRetrieveManyPageAsync(employmentsService, params, response)
    }

    class Response(
        private val responses: JsonField<List<EmploymentDataResponse>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("responses")
            responses: JsonField<List<EmploymentDataResponse>> = JsonMissing.of()
        ) : this(responses, mutableMapOf())

        fun responses(): List<EmploymentDataResponse> =
            responses.getNullable("responses") ?: listOf()

        @JsonProperty("responses")
        fun _responses(): JsonField<List<EmploymentDataResponse>>? = responses

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            responses().map { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: FinchInvalidDataException) {
                false
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && responses == other.responses && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(responses, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{responses=$responses, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [HrisEmploymentRetrieveManyPageAsync].
             */
            fun builder() = Builder()
        }

        class Builder {

            private var responses: JsonField<List<EmploymentDataResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.responses = page.responses
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun responses(responses: List<EmploymentDataResponse>) =
                responses(JsonField.of(responses))

            fun responses(responses: JsonField<List<EmploymentDataResponse>>) = apply {
                this.responses = responses
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response = Response(responses, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: HrisEmploymentRetrieveManyPageAsync) :
        Flow<EmploymentDataResponse> {

        override suspend fun collect(collector: FlowCollector<EmploymentDataResponse>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    collector.emit(page.responses()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
