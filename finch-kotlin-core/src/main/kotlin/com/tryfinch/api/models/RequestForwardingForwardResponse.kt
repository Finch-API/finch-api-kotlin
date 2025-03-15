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
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.immutableEmptyMap
import com.tryfinch.api.core.toImmutable
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@NoAutoDetect
class RequestForwardingForwardResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<String> = JsonMissing.of(),
    @JsonProperty("headers") @ExcludeMissing private val headers: JsonValue = JsonMissing.of(),
    @JsonProperty("request")
    @ExcludeMissing
    private val request: JsonField<Request> = JsonMissing.of(),
    @JsonProperty("statusCode")
    @ExcludeMissing
    private val statusCode: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A string representation of the HTTP response body of the forwarded request’s response
     * received from the underlying integration’s API. This field may be null in the case where the
     * upstream system’s response is empty.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): String? = data.getNullable("data")

    /**
     * The HTTP headers of the forwarded request’s response, exactly as received from the underlying
     * integration’s API.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonValue = headers

    /**
     * An object containing details of your original forwarded request, for your ease of reference.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun request(): Request = request.getRequired("request")

    /**
     * The HTTP status code of the forwarded request’s response, exactly received from the
     * underlying integration’s API. This value will be returned as an integer.
     *
     * @throws FinchInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statusCode(): Long = statusCode.getRequired("statusCode")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

    /**
     * Returns the raw JSON value of [request].
     *
     * Unlike [request], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("request") @ExcludeMissing fun _request(): JsonField<Request> = request

    /**
     * Returns the raw JSON value of [statusCode].
     *
     * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusCode") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RequestForwardingForwardResponse = apply {
        if (validated) {
            return@apply
        }

        data()
        request().validate()
        statusCode()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RequestForwardingForwardResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .headers()
         * .request()
         * .statusCode()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RequestForwardingForwardResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<String>? = null
        private var headers: JsonValue? = null
        private var request: JsonField<Request>? = null
        private var statusCode: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(requestForwardingForwardResponse: RequestForwardingForwardResponse) =
            apply {
                data = requestForwardingForwardResponse.data
                headers = requestForwardingForwardResponse.headers
                request = requestForwardingForwardResponse.request
                statusCode = requestForwardingForwardResponse.statusCode
                additionalProperties =
                    requestForwardingForwardResponse.additionalProperties.toMutableMap()
            }

        /**
         * A string representation of the HTTP response body of the forwarded request’s response
         * received from the underlying integration’s API. This field may be null in the case where
         * the upstream system’s response is empty.
         */
        fun data(data: String?) = data(JsonField.ofNullable(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<String>) = apply { this.data = data }

        /**
         * The HTTP headers of the forwarded request’s response, exactly as received from the
         * underlying integration’s API.
         */
        fun headers(headers: JsonValue) = apply { this.headers = headers }

        /**
         * An object containing details of your original forwarded request, for your ease of
         * reference.
         */
        fun request(request: Request) = request(JsonField.of(request))

        /**
         * Sets [Builder.request] to an arbitrary JSON value.
         *
         * You should usually call [Builder.request] with a well-typed [Request] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun request(request: JsonField<Request>) = apply { this.request = request }

        /**
         * The HTTP status code of the forwarded request’s response, exactly received from the
         * underlying integration’s API. This value will be returned as an integer.
         */
        fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

        /**
         * Sets [Builder.statusCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCode] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

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

        fun build(): RequestForwardingForwardResponse =
            RequestForwardingForwardResponse(
                checkRequired("data", data),
                checkRequired("headers", headers),
                checkRequired("request", request),
                checkRequired("statusCode", statusCode),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * An object containing details of your original forwarded request, for your ease of reference.
     */
    @NoAutoDetect
    class Request
    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing private val headers: JsonValue = JsonMissing.of(),
        @JsonProperty("method")
        @ExcludeMissing
        private val method: JsonField<String> = JsonMissing.of(),
        @JsonProperty("params") @ExcludeMissing private val params: JsonValue = JsonMissing.of(),
        @JsonProperty("route")
        @ExcludeMissing
        private val route: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The body that was specified for the forwarded request. If a value was not specified in
         * the original request, this value will be returned as null ; otherwise, this value will
         * always be returned as a string.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): String? = data.getNullable("data")

        /**
         * The specified HTTP headers that were included in the forwarded request. If no headers
         * were specified, this will be returned as `null`.
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonValue = headers

        /**
         * The HTTP method that was specified for the forwarded request. Valid values include: `GET`
         * , `POST` , `PUT` , `DELETE` , and `PATCH`.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun method(): String = method.getRequired("method")

        /**
         * The query parameters that were included in the forwarded request. If no query parameters
         * were specified, this will be returned as `null`.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonValue = params

        /**
         * The URL route path that was specified for the forwarded request.
         *
         * @throws FinchInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun route(): String = route.getRequired("route")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

        /**
         * Returns the raw JSON value of [route].
         *
         * Unlike [route], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<String> = route

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Request = apply {
            if (validated) {
                return@apply
            }

            data()
            method()
            route()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Request].
             *
             * The following fields are required:
             * ```kotlin
             * .data()
             * .headers()
             * .method()
             * .params()
             * .route()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Request]. */
        class Builder internal constructor() {

            private var data: JsonField<String>? = null
            private var headers: JsonValue? = null
            private var method: JsonField<String>? = null
            private var params: JsonValue? = null
            private var route: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(request: Request) = apply {
                data = request.data
                headers = request.headers
                method = request.method
                params = request.params
                route = request.route
                additionalProperties = request.additionalProperties.toMutableMap()
            }

            /**
             * The body that was specified for the forwarded request. If a value was not specified
             * in the original request, this value will be returned as null ; otherwise, this value
             * will always be returned as a string.
             */
            fun data(data: String?) = data(JsonField.ofNullable(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<String>) = apply { this.data = data }

            /**
             * The specified HTTP headers that were included in the forwarded request. If no headers
             * were specified, this will be returned as `null`.
             */
            fun headers(headers: JsonValue) = apply { this.headers = headers }

            /**
             * The HTTP method that was specified for the forwarded request. Valid values include:
             * `GET` , `POST` , `PUT` , `DELETE` , and `PATCH`.
             */
            fun method(method: String) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<String>) = apply { this.method = method }

            /**
             * The query parameters that were included in the forwarded request. If no query
             * parameters were specified, this will be returned as `null`.
             */
            fun params(params: JsonValue) = apply { this.params = params }

            /** The URL route path that was specified for the forwarded request. */
            fun route(route: String) = route(JsonField.of(route))

            /**
             * Sets [Builder.route] to an arbitrary JSON value.
             *
             * You should usually call [Builder.route] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun route(route: JsonField<String>) = apply { this.route = route }

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

            fun build(): Request =
                Request(
                    checkRequired("data", data),
                    checkRequired("headers", headers),
                    checkRequired("method", method),
                    checkRequired("params", params),
                    checkRequired("route", route),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Request && data == other.data && headers == other.headers && method == other.method && params == other.params && route == other.route && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, headers, method, params, route, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Request{data=$data, headers=$headers, method=$method, params=$params, route=$route, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RequestForwardingForwardResponse && data == other.data && headers == other.headers && request == other.request && statusCode == other.statusCode && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, headers, request, statusCode, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequestForwardingForwardResponse{data=$data, headers=$headers, request=$request, statusCode=$statusCode, additionalProperties=$additionalProperties}"
}
