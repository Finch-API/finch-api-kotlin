// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.sandbox

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.PaymentCreateResponse
import com.tryfinch.api.models.SandboxPaymentCreateParams

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentServiceAsync

    /** Add a new sandbox payment */
    suspend fun create(
        params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    /** @see [create] */
    suspend fun create(requestOptions: RequestOptions): PaymentCreateResponse =
        create(SandboxPaymentCreateParams.none(), requestOptions)

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sandbox/payment`, but is otherwise the same as
         * [PaymentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SandboxPaymentCreateParams = SandboxPaymentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentCreateResponse>

        /** @see [create] */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<PaymentCreateResponse> =
            create(SandboxPaymentCreateParams.none(), requestOptions)
    }
}
