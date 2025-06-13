// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.hris

import com.google.errorprone.annotations.MustBeClosed
import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.models.DocumentListResponse
import com.tryfinch.api.models.DocumentRetreiveResponse
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentServiceAsync

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve a list of company-wide documents.
     */
    suspend fun list(
        params: HrisDocumentListParams = HrisDocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): DocumentListResponse =
        list(HrisDocumentListParams.none(), requestOptions)

    /**
     * **Beta:** This endpoint is in beta and may change. Retrieve details of a specific document by
     * its ID.
     */
    suspend fun retreive(
        documentId: String,
        params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetreiveResponse =
        retreive(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see [retreive] */
    suspend fun retreive(
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetreiveResponse

    /** @see [retreive] */
    suspend fun retreive(
        documentId: String,
        requestOptions: RequestOptions,
    ): DocumentRetreiveResponse =
        retreive(documentId, HrisDocumentRetreiveParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /employer/documents`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: HrisDocumentListParams = HrisDocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentListResponse> =
            list(HrisDocumentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /employer/documents/{document_id}`, but is otherwise
         * the same as [DocumentServiceAsync.retreive].
         */
        @MustBeClosed
        suspend fun retreive(
            documentId: String,
            params: HrisDocumentRetreiveParams = HrisDocumentRetreiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetreiveResponse> =
            retreive(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see [retreive] */
        @MustBeClosed
        suspend fun retreive(
            params: HrisDocumentRetreiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetreiveResponse>

        /** @see [retreive] */
        @MustBeClosed
        suspend fun retreive(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentRetreiveResponse> =
            retreive(documentId, HrisDocumentRetreiveParams.none(), requestOptions)
    }
}
