// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.client

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.getPackageVersion
import com.tryfinch.api.services.async.AccessTokenServiceAsync
import com.tryfinch.api.services.async.AccessTokenServiceAsyncImpl
import com.tryfinch.api.services.async.AccountServiceAsync
import com.tryfinch.api.services.async.AccountServiceAsyncImpl
import com.tryfinch.api.services.async.ConnectServiceAsync
import com.tryfinch.api.services.async.ConnectServiceAsyncImpl
import com.tryfinch.api.services.async.HrisServiceAsync
import com.tryfinch.api.services.async.HrisServiceAsyncImpl
import com.tryfinch.api.services.async.JobServiceAsync
import com.tryfinch.api.services.async.JobServiceAsyncImpl
import com.tryfinch.api.services.async.PayrollServiceAsync
import com.tryfinch.api.services.async.PayrollServiceAsyncImpl
import com.tryfinch.api.services.async.ProviderServiceAsync
import com.tryfinch.api.services.async.ProviderServiceAsyncImpl
import com.tryfinch.api.services.async.RequestForwardingServiceAsync
import com.tryfinch.api.services.async.RequestForwardingServiceAsyncImpl
import com.tryfinch.api.services.async.SandboxServiceAsync
import com.tryfinch.api.services.async.SandboxServiceAsyncImpl
import com.tryfinch.api.services.async.WebhookServiceAsync
import com.tryfinch.api.services.async.WebhookServiceAsyncImpl

class FinchClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinchClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: FinchClient by lazy { FinchClientImpl(clientOptions) }

    private val accessTokens: AccessTokenServiceAsync by lazy {
        AccessTokenServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val hris: HrisServiceAsync by lazy { HrisServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val providers: ProviderServiceAsync by lazy {
        ProviderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val account: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val requestForwarding: RequestForwardingServiceAsync by lazy {
        RequestForwardingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val sandbox: SandboxServiceAsync by lazy {
        SandboxServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val payroll: PayrollServiceAsync by lazy {
        PayrollServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val connect: ConnectServiceAsync by lazy {
        ConnectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): FinchClient = sync

    override fun accessTokens(): AccessTokenServiceAsync = accessTokens

    override fun hris(): HrisServiceAsync = hris

    override fun providers(): ProviderServiceAsync = providers

    override fun account(): AccountServiceAsync = account

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun requestForwarding(): RequestForwardingServiceAsync = requestForwarding

    override fun jobs(): JobServiceAsync = jobs

    override fun sandbox(): SandboxServiceAsync = sandbox

    override fun payroll(): PayrollServiceAsync = payroll

    override fun connect(): ConnectServiceAsync = connect

    override fun close() = clientOptions.httpClient.close()
}
