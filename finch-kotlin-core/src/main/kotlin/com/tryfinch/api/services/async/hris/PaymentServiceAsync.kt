@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisPaymentListPageAsync
import com.tryfinch.api.models.HrisPaymentListParams

interface PaymentServiceAsync {

    /** Read payroll and contractor related payments by the company. */
    suspend fun list(
        params: HrisPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisPaymentListPageAsync
}
