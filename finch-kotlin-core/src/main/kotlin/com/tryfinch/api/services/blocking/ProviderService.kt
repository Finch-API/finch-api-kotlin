// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ProviderListPage
import com.tryfinch.api.models.ProviderListParams

interface ProviderService {

    /** Return details on all available payroll and HR systems. */
    fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderListPage

    /** Return details on all available payroll and HR systems. */
    fun list(requestOptions: RequestOptions): ProviderListPage =
        list(ProviderListParams.none(), requestOptions)
}
