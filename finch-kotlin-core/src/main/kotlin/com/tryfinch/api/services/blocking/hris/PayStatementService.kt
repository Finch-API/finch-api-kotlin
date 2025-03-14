// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.core.RequestOptions
import com.tryfinch.api.models.HrisPayStatementRetrieveManyPage
import com.tryfinch.api.models.HrisPayStatementRetrieveManyParams

interface PayStatementService {

    /**
     * Read detailed pay statements for each individual.
     *
     * Deduction and contribution types are supported by the payroll systems that supports Benefits.
     */
    fun retrieveMany(
        params: HrisPayStatementRetrieveManyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HrisPayStatementRetrieveManyPage
}
