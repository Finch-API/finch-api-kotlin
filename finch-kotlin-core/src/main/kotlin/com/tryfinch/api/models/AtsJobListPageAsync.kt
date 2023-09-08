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
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.services.async.ats.JobServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class AtsJobListPageAsync
private constructor(
    private val jobsService: JobServiceAsync,
    private val params: AtsJobListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun jobs(): List<Job> = response().jobs()

    fun paging(): Paging = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtsJobListPageAsync &&
            this.jobsService == other.jobsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            jobsService,
            params,
            response,
        )
    }

    override fun toString() =
        "AtsJobListPageAsync{jobsService=$jobsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (jobs().isEmpty()) {
            return false
        }

        return (paging().offset() ?: 0) + jobs().count() < (paging().count() ?: Long.MAX_VALUE)
    }

    fun getNextPageParams(): AtsJobListParams? {
        if (!hasNextPage()) {
            return null
        }

        return AtsJobListParams.builder()
            .from(params)
            .offset((paging().offset() ?: 0) + jobs().count())
            .build()
    }

    suspend fun getNextPage(): AtsJobListPageAsync? {
        return getNextPageParams()?.let { jobsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(jobsService: JobServiceAsync, params: AtsJobListParams, response: Response) =
            AtsJobListPageAsync(
                jobsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val jobs: JsonField<List<Job>>,
        private val paging: JsonField<Paging>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun jobs(): List<Job> = jobs.getNullable("jobs") ?: listOf()

        fun paging(): Paging = paging.getRequired("paging")

        @JsonProperty("jobs") fun _jobs(): JsonField<List<Job>>? = jobs

        @JsonProperty("paging") fun _paging(): JsonField<Paging>? = paging

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                jobs().map { it.validate() }
                paging().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.jobs == other.jobs &&
                this.paging == other.paging &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                jobs,
                paging,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtsJobListPageAsync.Response{jobs=$jobs, paging=$paging, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var jobs: JsonField<List<Job>> = JsonMissing.of()
            private var paging: JsonField<Paging> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.jobs = page.jobs
                this.paging = page.paging
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun jobs(jobs: List<Job>) = jobs(JsonField.of(jobs))

            @JsonProperty("jobs") fun jobs(jobs: JsonField<List<Job>>) = apply { this.jobs = jobs }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    jobs,
                    paging,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtsJobListPageAsync,
    ) : Flow<Job> {

        override suspend fun collect(collector: FlowCollector<Job>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.jobs().size) {
                    collector.emit(page.jobs()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
