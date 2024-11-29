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
import com.tryfinch.api.services.async.jobs.AutomatedServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class JobAutomatedListPageAsync
private constructor(
    private val automatedService: AutomatedServiceAsync,
    private val params: JobAutomatedListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<AutomatedAsyncJob> = response().data()

    fun paging(): Paging = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobAutomatedListPageAsync && automatedService == other.automatedService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(automatedService, params, response) /* spotless:on */

    override fun toString() =
        "JobAutomatedListPageAsync{automatedService=$automatedService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !data().isEmpty()
    }

    fun getNextPageParams(): JobAutomatedListParams? {
        if (!hasNextPage()) {
            return null
        }

        return JobAutomatedListParams.builder()
            .from(params)
            .offset((paging().offset() ?: 0) + data().count())
            .build()
    }

    suspend fun getNextPage(): JobAutomatedListPageAsync? {
        return getNextPageParams()?.let { automatedService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            automatedService: AutomatedServiceAsync,
            params: JobAutomatedListParams,
            response: Response
        ) =
            JobAutomatedListPageAsync(
                automatedService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<AutomatedAsyncJob>>,
        private val paging: JsonField<Paging>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<AutomatedAsyncJob> = data.getNullable("data") ?: listOf()

        fun paging(): Paging = paging.getRequired("paging")

        @JsonProperty("data") fun _data(): JsonField<List<AutomatedAsyncJob>>? = data

        @JsonProperty("paging") fun _paging(): JsonField<Paging>? = paging

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().map { it.validate() }
                paging().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && paging == other.paging && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, paging, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, paging=$paging, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<AutomatedAsyncJob>> = JsonMissing.of()
            private var paging: JsonField<Paging> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paging = page.paging
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<AutomatedAsyncJob>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<AutomatedAsyncJob>>) = apply { this.data = data }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    paging,
                    additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: JobAutomatedListPageAsync,
    ) : Flow<AutomatedAsyncJob> {

        override suspend fun collect(collector: FlowCollector<AutomatedAsyncJob>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    collector.emit(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
