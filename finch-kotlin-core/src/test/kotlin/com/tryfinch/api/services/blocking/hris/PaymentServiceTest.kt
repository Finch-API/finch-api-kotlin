// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import com.tryfinch.api.models.HrisPaymentListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceTest {

    @Test
    fun list() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val paymentService = client.hris().payments()

        val page =
            paymentService.list(
                HrisPaymentListParams.builder()
                    .endDate(LocalDate.parse("2021-01-01"))
                    .startDate(LocalDate.parse("2021-01-01"))
                    .build()
            )

        page.items().forEach { it.validate() }
    }
}
