// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.tryfinch.api.services.async.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisPayStatementRetrieveManyPageAsync
import com.tryfinch.api.models.HrisPayStatementRetrieveManyParams

interface PayStatementServiceAsync {

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that support Benefits.
     */
    suspend fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): HrisPayStatementRetrieveManyPageAsync
}
