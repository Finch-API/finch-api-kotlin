// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.services.blocking.hris.IndividualService
import java.util.Objects

class HrisIndividualRetrieveManyPage
private constructor(
    private val individualsService: IndividualService,
    private val params: HrisIndividualRetrieveManyParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun responses(): List<IndividualResponse> = response().responses()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisIndividualRetrieveManyPage && individualsService == other.individualsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(individualsService, params, response) /* spotless:on */

    override fun toString() =
        "HrisIndividualRetrieveManyPage{individualsService=$individualsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !responses().isEmpty()
    }

    fun getNextPageParams(): HrisIndividualRetrieveManyParams? {
        return null
    }

    fun getNextPage(): HrisIndividualRetrieveManyPage? {
        return getNextPageParams()?.let { individualsService.retrieveMany(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            individualsService: IndividualService,
            params: HrisIndividualRetrieveManyParams,
            response: Response
        ) =
            HrisIndividualRetrieveManyPage(
                individualsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val responses: JsonField<List<IndividualResponse>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun responses(): List<IndividualResponse> = responses.getNullable("responses") ?: listOf()

        @JsonProperty("responses")
        fun _responses(): JsonField<List<IndividualResponse>>? = responses

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                responses().map { it.validate() }
                validated = true
            }
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

            fun builder() = Builder()
        }

        class Builder {

            private var responses: JsonField<List<IndividualResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.responses = page.responses
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun responses(responses: List<IndividualResponse>) = responses(JsonField.of(responses))

            @JsonProperty("responses")
            fun responses(responses: JsonField<List<IndividualResponse>>) = apply {
                this.responses = responses
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(responses, additionalProperties.toImmutable())
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HrisIndividualRetrieveManyPage,
    ) : Sequence<IndividualResponse> {

        override fun iterator(): Iterator<IndividualResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.responses().size) {
                    yield(page.responses()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
