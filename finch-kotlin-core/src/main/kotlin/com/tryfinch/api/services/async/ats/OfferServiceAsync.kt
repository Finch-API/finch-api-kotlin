@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.ats

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.AtsOfferListPageAsync
import com.tryfinch.api.models.AtsOfferListParams
import com.tryfinch.api.models.AtsOfferRetrieveParams
import com.tryfinch.api.models.Offer

interface OfferServiceAsync {

    /** Get a single offer from an organization. */
    suspend fun retrieve(
        params: AtsOfferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Offer

    /** Get all offers put out by an organization. */
    suspend fun list(
        params: AtsOfferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AtsOfferListPageAsync
}
