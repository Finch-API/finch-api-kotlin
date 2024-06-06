// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.payroll

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.PayGroupRetrieveResponse
import com.tryfinch.api.models.PayrollPayGroupListPageAsync
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams

interface PayGroupServiceAsync {

    /** Read information from a single pay group */
    suspend fun retrieve(
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PayGroupRetrieveResponse

    /** Read company pay groups and frequencies */
    suspend fun list(
        params: PayrollPayGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PayrollPayGroupListPageAsync
}
