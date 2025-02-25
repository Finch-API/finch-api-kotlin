// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.services.blocking.hris

import com.tryfinch.api.TestServerExtension
import com.tryfinch.api.client.okhttp.FinchOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DirectoryServiceTest {

    @Test
    fun callList() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val directoryService = client.hris().directory()
        val getDirectoryResponse = directoryService.list()
        println(getDirectoryResponse)
        getDirectoryResponse.individuals().forEach { it.validate() }
    }

    @Test
    fun callListIndividuals() {
        val client =
            FinchOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("My Access Token")
                .build()
        val directoryService = client.hris().directory()
        val getDirectoryResponse = directoryService.listIndividuals()
        println(getDirectoryResponse)
        getDirectoryResponse.individuals().forEach { it.validate() }
    }
}
