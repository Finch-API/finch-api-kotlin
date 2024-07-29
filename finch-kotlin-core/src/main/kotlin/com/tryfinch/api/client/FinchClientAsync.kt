// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.client

import com.fasterxml.jackson.annotation.JsonProperty
import com.tryfinch.api.models.*
import com.tryfinch.api.services.async.*

interface FinchClientAsync {

    fun sync(): FinchClient

    fun accessTokens(): AccessTokenServiceAsync

    fun hris(): HrisServiceAsync

    fun providers(): ProviderServiceAsync

    fun account(): AccountServiceAsync

    fun webhooks(): WebhookServiceAsync

    fun requestForwarding(): RequestForwardingServiceAsync

    fun jobs(): JobServiceAsync

    fun sandbox(): SandboxServiceAsync

    fun payroll(): PayrollServiceAsync

    suspend fun getAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String?
    ): String

    suspend fun getAuthUrl(products: String, redirectUri: String, sandbox: Boolean): String

    suspend fun withAccessToken(accessToken: String): FinchClientAsync

    private data class GetAccessTokenParams(
        @JsonProperty("client_id") val clientId: String,
        @JsonProperty("client_secret") val clientSecret: String,
        @JsonProperty("code") val code: String,
        @JsonProperty("redirect_uri") val redirectUri: String?,
    )

    private data class GetAccessTokenResponse(
        @JsonProperty("access_token") val accessToken: String,
    )
}
