// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.payroll

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.PayGroupRetrieveResponse
import com.tryfinch.api.models.PayrollPayGroupListPage
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams

interface PayGroupService {

    /** Read information from a single pay group */
    fun retrieve(
        params: PayrollPayGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayGroupRetrieveResponse

    /** Read company pay groups and frequencies */
    fun list(
        params: PayrollPayGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayrollPayGroupListPage
}
