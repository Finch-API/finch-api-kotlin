// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.ProviderListPageAsync
import com.tryfinch.api.models.ProviderListParams

interface ProviderServiceAsync {

    /** Return details on all available payroll and HR systems. */
    suspend fun list(
        params: ProviderListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderListPageAsync
}
