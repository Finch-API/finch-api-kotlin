// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectSessionNewParamsTest {

    @Test
    fun create() {
      ConnectSessionNewParams.builder()
          .customerId("x")
          .customerName("x")
          .addProduct(ConnectSessionNewParams.ConnectProducts.COMPANY)
          .customerEmail("dev@stainless.com")
          .integration(ConnectSessionNewParams.Integration.builder()
              .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
              .provider("provider")
              .build())
          .manual(true)
          .minutesToExpire(1.0)
          .redirectUri("redirect_uri")
          .sandbox(ConnectSessionNewParams.Sandbox.FINCH)
          .build()
    }

    @Test
    fun body() {
      val params = ConnectSessionNewParams.builder()
          .customerId("x")
          .customerName("x")
          .addProduct(ConnectSessionNewParams.ConnectProducts.COMPANY)
          .customerEmail("dev@stainless.com")
          .integration(ConnectSessionNewParams.Integration.builder()
              .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
              .provider("provider")
              .build())
          .manual(true)
          .minutesToExpire(1.0)
          .redirectUri("redirect_uri")
          .sandbox(ConnectSessionNewParams.Sandbox.FINCH)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.customerId()).isEqualTo("x")
      assertThat(body.customerName()).isEqualTo("x")
      assertThat(body.products()).isEqualTo(listOf(ConnectSessionNewParams.ConnectProducts.COMPANY))
      assertThat(body.customerEmail()).isEqualTo("dev@stainless.com")
      assertThat(body.integration()).isEqualTo(ConnectSessionNewParams.Integration.builder()
          .authMethod(ConnectSessionNewParams.Integration.AuthMethod.ASSISTED)
          .provider("provider")
          .build())
      assertThat(body.manual()).isEqualTo(true)
      assertThat(body.minutesToExpire()).isEqualTo(1.0)
      assertThat(body.redirectUri()).isEqualTo("redirect_uri")
      assertThat(body.sandbox()).isEqualTo(ConnectSessionNewParams.Sandbox.FINCH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = ConnectSessionNewParams.builder()
          .customerId("x")
          .customerName("x")
          .addProduct(ConnectSessionNewParams.ConnectProducts.COMPANY)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.customerId()).isEqualTo("x")
      assertThat(body.customerName()).isEqualTo("x")
      assertThat(body.products()).isEqualTo(listOf(ConnectSessionNewParams.ConnectProducts.COMPANY))
    }
}
