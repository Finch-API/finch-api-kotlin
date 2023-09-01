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
import com.tryfinch.api.services.async.ats.ApplicationServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class AtsApplicationListPageAsync
private constructor(
    private val applicationsService: ApplicationServiceAsync,
    private val params: AtsApplicationListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun applications(): List<Application> = response().applications()

    fun paging(): Paging = response().paging()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AtsApplicationListPageAsync &&
            this.applicationsService == other.applicationsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            applicationsService,
            params,
            response,
        )
    }

    override fun toString() =
        "AtsApplicationListPageAsync{applicationsService=$applicationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (applications().isEmpty()) {
            return false
        }

        return (paging().offset()
            ?: 0) + applications().count() < (paging().count() ?: Long.MAX_VALUE)
    }

    fun getNextPageParams(): AtsApplicationListParams? {
        if (!hasNextPage()) {
            return null
        }

        return AtsApplicationListParams.builder()
            .from(params)
            .offset((paging().offset() ?: 0) + applications().count())
            .build()
    }

    suspend fun getNextPage(): AtsApplicationListPageAsync? {
        return getNextPageParams()?.let { applicationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            applicationsService: ApplicationServiceAsync,
            params: AtsApplicationListParams,
            response: Response
        ) =
            AtsApplicationListPageAsync(
                applicationsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val applications: JsonField<List<Application>>,
        private val paging: JsonField<Paging>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun applications(): List<Application> = applications.getNullable("applications") ?: listOf()

        fun paging(): Paging = paging.getRequired("paging")

        @JsonProperty("applications")
        fun _applications(): JsonField<List<Application>>? = applications

        @JsonProperty("paging") fun _paging(): JsonField<Paging>? = paging

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                applications().map { it.validate() }
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
                this.applications == other.applications &&
                this.paging == other.paging &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                applications,
                paging,
                additionalProperties,
            )
        }

        override fun toString() =
            "AtsApplicationListPageAsync.Response{applications=$applications, paging=$paging, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var applications: JsonField<List<Application>> = JsonMissing.of()
            private var paging: JsonField<Paging> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.applications = page.applications
                this.paging = page.paging
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun applications(applications: List<Application>) =
                applications(JsonField.of(applications))

            @JsonProperty("applications")
            fun applications(applications: JsonField<List<Application>>) = apply {
                this.applications = applications
            }

            fun paging(paging: Paging) = paging(JsonField.of(paging))

            @JsonProperty("paging")
            fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    applications,
                    paging,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: AtsApplicationListPageAsync,
    ) : Flow<Application> {

        override suspend fun collect(collector: FlowCollector<Application>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.applications().size) {
                    collector.emit(page.applications()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
