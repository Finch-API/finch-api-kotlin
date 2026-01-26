// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams

interface ConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigurationServiceAsync

    /** Get configurations for sandbox jobs */
    suspend fun retrieve(
        params: SandboxJobConfigurationRetrieveParams =
            SandboxJobConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SandboxJobConfiguration>

    /** @see retrieve */
    suspend fun retrieve(requestOptions: RequestOptions): List<SandboxJobConfiguration> =
        retrieve(SandboxJobConfigurationRetrieveParams.none(), requestOptions)

    /** Update configurations for sandbox jobs */
    suspend fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxJobConfiguration

    /** @see update */
    suspend fun update(
        sandboxJobConfiguration: SandboxJobConfiguration,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxJobConfiguration =
        update(
            SandboxJobConfigurationUpdateParams.builder()
                .sandboxJobConfiguration(sandboxJobConfiguration)
                .build(),
            requestOptions,
        )

    /**
     * A view of [ConfigurationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sandbox/jobs/configuration`, but is otherwise the
         * same as [ConfigurationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: SandboxJobConfigurationRetrieveParams =
                SandboxJobConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SandboxJobConfiguration>>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<SandboxJobConfiguration>> =
            retrieve(SandboxJobConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /sandbox/jobs/configuration`, but is otherwise the
         * same as [ConfigurationServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: SandboxJobConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxJobConfiguration>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            sandboxJobConfiguration: SandboxJobConfiguration,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxJobConfiguration> =
            update(
                SandboxJobConfigurationUpdateParams.builder()
                    .sandboxJobConfiguration(sandboxJobConfiguration)
                    .build(),
                requestOptions,
            )
    }
}
