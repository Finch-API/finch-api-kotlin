// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.RequestForwardingForwardParams
import com.tryfinch.api.models.RequestForwardingForwardResponse

interface RequestForwardingServiceAsync {

    /**
     * The Forward API allows you to make direct requests to an employment system. If Finch’s
     * unified API doesn’t have a data model that cleanly fits your needs, then Forward allows you
     * to push or pull data models directly against an integration’s API.
     */
    suspend fun forward(
        params: RequestForwardingForwardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequestForwardingForwardResponse
}
