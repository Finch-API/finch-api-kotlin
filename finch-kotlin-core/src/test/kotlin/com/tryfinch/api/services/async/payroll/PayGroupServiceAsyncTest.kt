// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.async.payroll

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClientAsync
import com.tryfinch.api.models.PayrollPayGroupListParams
import com.tryfinch.api.models.PayrollPayGroupRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PayGroupServiceAsyncTest {

    @Test
    suspend fun retrieve() {
      val client = FinchOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val payGroupServiceAsync = client.payroll().payGroups()

      val payGroup = payGroupServiceAsync.retrieve(PayrollPayGroupRetrieveParams.builder()
          .payGroupId("pay_group_id")
          .build())

      payGroup.validate()
    }

    @Test
    suspend fun list() {
      val client = FinchOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .accessToken("My Access Token")
          .build()
      val payGroupServiceAsync = client.payroll().payGroups()

      val page = payGroupServiceAsync.list()

      page.response().validate()
    }
}
