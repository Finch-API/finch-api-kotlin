// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async

import com.tryfinch.api.services.async.hris.BenefitServiceAsync
import com.tryfinch.api.services.async.hris.CompanyServiceAsync
import com.tryfinch.api.services.async.hris.DirectoryServiceAsync
import com.tryfinch.api.services.async.hris.DocumentServiceAsync
import com.tryfinch.api.services.async.hris.EmploymentServiceAsync
import com.tryfinch.api.services.async.hris.IndividualServiceAsync
import com.tryfinch.api.services.async.hris.PayStatementServiceAsync
import com.tryfinch.api.services.async.hris.PaymentServiceAsync

interface HrisServiceAsync {

    fun company(): CompanyServiceAsync

    fun directory(): DirectoryServiceAsync

    fun individuals(): IndividualServiceAsync

    fun employments(): EmploymentServiceAsync

    fun payments(): PaymentServiceAsync

    fun payStatements(): PayStatementServiceAsync

    fun documents(): DocumentServiceAsync

    fun benefits(): BenefitServiceAsync
}
