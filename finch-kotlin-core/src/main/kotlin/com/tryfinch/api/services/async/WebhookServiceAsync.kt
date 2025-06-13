// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.core.ClientOptions
import com.tryfinch.api.core.http.Headers
import com.tryfinch.api.models.WebhookEvent

interface WebhookServiceAsync {

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WebhookServiceAsync

    suspend fun unwrap(payload: String, headers: Headers, secret: String?): WebhookEvent

    suspend fun verifySignature(payload: String, headers: Headers, secret: String?)
}
