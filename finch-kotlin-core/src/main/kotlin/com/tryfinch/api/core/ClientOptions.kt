// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.tryfinch.api.core.http.HttpClient
import com.tryfinch.api.core.http.RetryingHttpClient
import java.time.Clock
import java.util.Base64

class ClientOptions
private constructor(
    val httpClient: HttpClient,
    val jsonMapper: JsonMapper,
    val clock: Clock,
    val baseUrl: String,
    val accessToken: String?,
    val clientId: String?,
    val clientSecret: String?,
    val webhookSecret: String?,
    val headers: ListMultimap<String, String>,
    val queryParams: ListMultimap<String, String>,
    val responseValidation: Boolean,
) {

    companion object {

        const val PRODUCTION_URL = "https://api.tryfinch.com"

        fun builder() = Builder()

        fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var queryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var accessToken: String? = null
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var webhookSecret: String? = null

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.headers.put(name, mutableListOf()) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.queryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.queryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply { this.queryParams.put(name, mutableListOf()) }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun accessToken(accessToken: String?) = apply { this.accessToken = accessToken }

        fun clientId(clientId: String?) = apply { this.clientId = clientId }

        fun clientSecret(clientSecret: String?) = apply { this.clientSecret = clientSecret }

        fun webhookSecret(webhookSecret: String?) = apply { this.webhookSecret = webhookSecret }

        fun fromEnv() = apply {
            System.getenv("FINCH_CLIENT_ID")?.let { clientId(it) }
            System.getenv("FINCH_CLIENT_SECRET")?.let { clientSecret(it) }
            System.getenv("FINCH_WEBHOOK_SECRET")?.let { webhookSecret(it) }
        }

        fun build(): ClientOptions {
            checkNotNull(httpClient) { "`httpClient` is required but was not set" }

            val headers = ArrayListMultimap.create<String, String>()
            val queryParams = ArrayListMultimap.create<String, String>()
            headers.put("X-Stainless-Lang", "kotlin")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            headers.put("Finch-API-Version", "2020-09-17")
            if (!accessToken.isNullOrEmpty()) {
                headers.put("Authorization", "Bearer ${accessToken}")
            }
            if (!clientId.isNullOrEmpty() && !clientSecret.isNullOrEmpty()) {
                headers.put(
                    "Authorization",
                    "Basic ${Base64.getEncoder().encodeToString("${clientId}:${clientSecret}".toByteArray())}"
                )
            }
            this.headers.forEach(headers::replaceValues)
            this.queryParams.forEach(queryParams::replaceValues)

            return ClientOptions(
                RetryingHttpClient.builder()
                    .httpClient(httpClient!!)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .build(),
                jsonMapper ?: jsonMapper(),
                clock,
                baseUrl,
                accessToken,
                clientId,
                clientSecret,
                webhookSecret,
                headers.toUnmodifiable(),
                queryParams.toUnmodifiable(),
                responseValidation,
            )
        }
    }
}
