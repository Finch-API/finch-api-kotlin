// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.payroll

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.PayGroupRetrieveResponse
import com.tryfinch.api.models.PayrollPayGroupListPageAsync
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams

interface PayGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Read information from a single pay group */
    suspend fun retrieve(
        payGroupId: String,
        params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayGroupRetrieveResponse =
        retrieve(params.toBuilder().payGroupId(payGroupId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayGroupRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        payGroupId: String,
        requestOptions: RequestOptions,
    ): PayGroupRetrieveResponse =
        retrieve(payGroupId, PayrollPayGroupRetrieveParams.none(), requestOptions)

    /** Read company pay groups and frequencies */
    suspend fun list(
        params: PayrollPayGroupListParams = PayrollPayGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayrollPayGroupListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): PayrollPayGroupListPageAsync =
        list(PayrollPayGroupListParams.none(), requestOptions)

    /**
     * A view of [PayGroupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups/{pay_group_id}`, but is
         * otherwise the same as [PayGroupServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            payGroupId: String,
            params: PayrollPayGroupRetrieveParams = PayrollPayGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayGroupRetrieveResponse> =
            retrieve(params.toBuilder().payGroupId(payGroupId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: PayrollPayGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayGroupRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            payGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayGroupRetrieveResponse> =
            retrieve(payGroupId, PayrollPayGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/pay-groups`, but is otherwise the same as
         * [PayGroupServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PayrollPayGroupListParams = PayrollPayGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayrollPayGroupListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PayrollPayGroupListPageAsync> =
            list(PayrollPayGroupListParams.none(), requestOptions)
    }
}
