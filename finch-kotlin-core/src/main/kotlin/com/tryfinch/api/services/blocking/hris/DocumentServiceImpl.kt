// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.core.checkRequired
import com.tryfinch.api.core.handlers.errorBodyHandler
import com.tryfinch.api.core.handlers.errorHandler
import com.tryfinch.api.core.handlers.jsonHandler
import com.tryfinch.api.core.http.HttpMethod
import com.tryfinch.api.core.http.HttpRequest
import com.tryfinch.api.core.http.HttpResponse
import com.tryfinch.api.core.http.HttpResponse.Handler
import com.tryfinch.api.core.http.HttpResponseFor
import com.tryfinch.api.core.http.parseable
import com.tryfinch.api.core.prepare
import com.tryfinch.api.models.DocumentListResponse
import com.tryfinch.api.models.DocumentRetreiveResponse
import com.tryfinch.api.models.HrisDocumentListParams
import com.tryfinch.api.models.HrisDocumentRetreiveParams

class DocumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentService {

    private val withRawResponse: DocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentService =
        DocumentServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(
        params: HrisDocumentListParams,
        requestOptions: RequestOptions,
    ): DocumentListResponse =
        // get /employer/documents
        withRawResponse().list(params, requestOptions).parse()

    override fun retreive(
        params: HrisDocumentRetreiveParams,
        requestOptions: RequestOptions,
    ): DocumentRetreiveResponse =
        // get /employer/documents/{document_id}
        withRawResponse().retreive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocumentService.WithRawResponse =
            DocumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<DocumentListResponse> =
            jsonHandler<DocumentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: HrisDocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "documents")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retreiveHandler: Handler<DocumentRetreiveResponse> =
            jsonHandler<DocumentRetreiveResponse>(clientOptions.jsonMapper)

        override fun retreive(
            params: HrisDocumentRetreiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentRetreiveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("employer", "documents", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retreiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
