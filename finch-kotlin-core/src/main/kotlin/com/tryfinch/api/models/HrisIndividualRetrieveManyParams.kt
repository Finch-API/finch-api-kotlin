// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.models.*
import java.util.Objects

class HrisIndividualRetrieveManyParams
constructor(
    private val options: Options?,
    private val requests: List<Request>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun options(): Options? = options

    fun requests(): List<Request>? = requests

    internal fun getBody(): HrisIndividualRetrieveManyBody {
        return HrisIndividualRetrieveManyBody(
            options,
            requests,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = HrisIndividualRetrieveManyBody.Builder::class)
    @NoAutoDetect
    class HrisIndividualRetrieveManyBody
    internal constructor(
        private val options: Options?,
        private val requests: List<Request>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("options") fun options(): Options? = options

        @JsonProperty("requests") fun requests(): List<Request>? = requests

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var options: Options? = null
            private var requests: List<Request>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(hrisIndividualRetrieveManyBody: HrisIndividualRetrieveManyBody) =
                apply {
                    this.options = hrisIndividualRetrieveManyBody.options
                    this.requests = hrisIndividualRetrieveManyBody.requests
                    additionalProperties(hrisIndividualRetrieveManyBody.additionalProperties)
                }

            @JsonProperty("options")
            fun options(options: Options) = apply { this.options = options }

            @JsonProperty("requests")
            fun requests(requests: List<Request>) = apply { this.requests = requests }

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

            fun build(): HrisIndividualRetrieveManyBody =
                HrisIndividualRetrieveManyBody(
                    options,
                    requests?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is HrisIndividualRetrieveManyBody && this.options == other.options && this.requests == other.requests && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(options, requests, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "HrisIndividualRetrieveManyBody{options=$options, requests=$requests, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is HrisIndividualRetrieveManyParams && this.options == other.options && this.requests == other.requests && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(options, requests, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "HrisIndividualRetrieveManyParams{options=$options, requests=$requests, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var options: Options? = null
        private var requests: MutableList<Request> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(hrisIndividualRetrieveManyParams: HrisIndividualRetrieveManyParams) =
            apply {
                this.options = hrisIndividualRetrieveManyParams.options
                this.requests(hrisIndividualRetrieveManyParams.requests ?: listOf())
                additionalQueryParams(hrisIndividualRetrieveManyParams.additionalQueryParams)
                additionalHeaders(hrisIndividualRetrieveManyParams.additionalHeaders)
                additionalBodyProperties(hrisIndividualRetrieveManyParams.additionalBodyProperties)
            }

        fun options(options: Options) = apply { this.options = options }

        fun requests(requests: List<Request>) = apply {
            this.requests.clear()
            this.requests.addAll(requests)
        }

        fun addRequest(request: Request) = apply { this.requests.add(request) }

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

        fun build(): HrisIndividualRetrieveManyParams =
            HrisIndividualRetrieveManyParams(
                options,
                if (requests.size == 0) null else requests.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Options.Builder::class)
    @NoAutoDetect
    class Options
    private constructor(
        private val include: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("include") fun include(): List<String>? = include

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var include: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(options: Options) = apply {
                this.include = options.include
                additionalProperties(options.additionalProperties)
            }

            @JsonProperty("include")
            fun include(include: List<String>) = apply { this.include = include }

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

            fun build(): Options =
                Options(include?.toImmutable(), additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Options && this.include == other.include && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(include, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Options{include=$include, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Request.Builder::class)
    @NoAutoDetect
    class Request
    private constructor(
        private val individualId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("individual_id") fun individualId(): String? = individualId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var individualId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(request: Request) = apply {
                this.individualId = request.individualId
                additionalProperties(request.additionalProperties)
            }

            @JsonProperty("individual_id")
            fun individualId(individualId: String) = apply { this.individualId = individualId }

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

            fun build(): Request = Request(individualId, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Request && this.individualId == other.individualId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(individualId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Request{individualId=$individualId, additionalProperties=$additionalProperties}"
    }
}
