// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.sandbox

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.PaymentCreateResponse
import com.tryfinch.api.models.SandboxPaymentCreateParams

interface PaymentService {

    /** Add a new sandbox payment */
    fun create(
        params: SandboxPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse
}
