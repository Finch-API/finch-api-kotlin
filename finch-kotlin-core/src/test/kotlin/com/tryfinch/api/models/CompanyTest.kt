// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompanyTest {

    @Test
    fun createCompany() {
        val company =
            Company.builder()
                .id("string")
                .accounts(
                    listOf(
                        Company.Account.builder()
                            .accountName("string")
                            .accountNumber("string")
                            .accountType(Company.Account.AccountType.CHECKING)
                            .institutionName("string")
                            .routingNumber("string")
                            .build()
                    )
                )
                .departments(
                    listOf(
                        Company.Department.builder()
                            .name("string")
                            .parent(Company.Department.Parent.builder().name("string").build())
                            .build()
                    )
                )
                .ein("string")
                .entity(
                    Company.Entity.builder()
                        .subtype(Company.Entity.Subtype.S_CORPORATION)
                        .type(Company.Entity.Type.LLC)
                        .build()
                )
                .legalName("string")
                .locations(
                    listOf(
                        Location.builder()
                            .city("string")
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .name("string")
                            .postalCode("string")
                            .sourceId("string")
                            .state("string")
                            .build()
                    )
                )
                .primaryEmail("string")
                .primaryPhoneNumber("string")
                .build()
        assertThat(company).isNotNull
        assertThat(company.id()).isEqualTo("string")
        assertThat(company.accounts())
            .containsExactly(
                Company.Account.builder()
                    .accountName("string")
                    .accountNumber("string")
                    .accountType(Company.Account.AccountType.CHECKING)
                    .institutionName("string")
                    .routingNumber("string")
                    .build()
            )
        assertThat(company.departments())
            .containsExactly(
                Company.Department.builder()
                    .name("string")
                    .parent(Company.Department.Parent.builder().name("string").build())
                    .build()
            )
        assertThat(company.ein()).isEqualTo("string")
        assertThat(company.entity())
            .isEqualTo(
                Company.Entity.builder()
                    .subtype(Company.Entity.Subtype.S_CORPORATION)
                    .type(Company.Entity.Type.LLC)
                    .build()
            )
        assertThat(company.legalName()).isEqualTo("string")
        assertThat(company.locations())
            .containsExactly(
                Location.builder()
                    .city("string")
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .name("string")
                    .postalCode("string")
                    .sourceId("string")
                    .state("string")
                    .build()
            )
        assertThat(company.primaryEmail()).isEqualTo("string")
        assertThat(company.primaryPhoneNumber()).isEqualTo("string")
    }
}
