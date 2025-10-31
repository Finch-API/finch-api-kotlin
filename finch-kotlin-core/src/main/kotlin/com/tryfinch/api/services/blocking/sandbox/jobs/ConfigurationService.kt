// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox.jobs

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.SandboxJobConfiguration
import com.tryfinch.api.models.SandboxJobConfigurationRetrieveParams
import com.tryfinch.api.models.SandboxJobConfigurationUpdateParams

interface ConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigurationService

    /** Get configurations for sandbox jobs */
    fun retrieve(
        params: SandboxJobConfigurationRetrieveParams =
            SandboxJobConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SandboxJobConfiguration>

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): List<SandboxJobConfiguration> =
        retrieve(SandboxJobConfigurationRetrieveParams.none(), requestOptions)

    /** Update configurations for sandbox jobs */
    fun update(
        params: SandboxJobConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxJobConfiguration

    /** @see update */
    fun update(
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
     * A view of [ConfigurationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sandbox/jobs/configuration`, but is otherwise the
         * same as [ConfigurationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: SandboxJobConfigurationRetrieveParams =
                SandboxJobConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SandboxJobConfiguration>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<SandboxJobConfiguration>> =
            retrieve(SandboxJobConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /sandbox/jobs/configuration`, but is otherwise the
         * same as [ConfigurationService.update].
         */
        @MustBeClosed
        fun update(
            params: SandboxJobConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxJobConfiguration>

        /** @see update */
        @MustBeClosed
        fun update(
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
