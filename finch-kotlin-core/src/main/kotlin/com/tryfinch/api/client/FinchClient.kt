// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.services.blocking.AccessTokenService
import com.tryfinch.api.services.blocking.AccountService
import com.tryfinch.api.services.blocking.ConnectService
import com.tryfinch.api.services.blocking.HrisService
import com.tryfinch.api.services.blocking.JobService
import com.tryfinch.api.services.blocking.PayrollService
import com.tryfinch.api.services.blocking.ProviderService
import com.tryfinch.api.services.blocking.RequestForwardingService
import com.tryfinch.api.services.blocking.SandboxService
import com.tryfinch.api.services.blocking.WebhookService

/**
 * A client for interacting with the Finch REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface FinchClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): FinchClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FinchClient

    fun accessTokens(): AccessTokenService

    fun hris(): HrisService

    fun providers(): ProviderService

    fun account(): AccountService

    fun webhooks(): WebhookService

    fun requestForwarding(): RequestForwardingService

    fun jobs(): JobService

    fun sandbox(): SandboxService

    fun payroll(): PayrollService

    fun connect(): ConnectService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    // auth helpers:
    /** @deprecated use client.accessTokens().create instead */
    @Deprecated("use client.accessTokens().create instead", ReplaceWith("accessTokens().create()"))
    fun getAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String?,
    ): String

    fun getAuthUrl(products: String, redirectUri: String, sandbox: Boolean): String

    fun withAccessToken(accessToken: String): FinchClient

    /** A view of [FinchClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FinchClient.WithRawResponse

        fun accessTokens(): AccessTokenService.WithRawResponse

        fun hris(): HrisService.WithRawResponse

        fun providers(): ProviderService.WithRawResponse

        fun account(): AccountService.WithRawResponse

        fun requestForwarding(): RequestForwardingService.WithRawResponse

        fun jobs(): JobService.WithRawResponse

        fun sandbox(): SandboxService.WithRawResponse

        fun payroll(): PayrollService.WithRawResponse

        fun connect(): ConnectService.WithRawResponse
    }
}
