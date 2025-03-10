// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.DocumentListResponse
import com.tryfinch.api.models.DocumentRetreiveResponse
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams

interface DocumentService {

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents.
     */
    fun list(
        params: HrisDocumentListParams = HrisDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListResponse

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents.
     */
    fun list(requestOptions: RequestOptions): DocumentListResponse =
        list(HrisDocumentListParams.none(), requestOptions)

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve details of a specific document by
     * its ID.
     */
    fun retreive(
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetreiveResponse
}
