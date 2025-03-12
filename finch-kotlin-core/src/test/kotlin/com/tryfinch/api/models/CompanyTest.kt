// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompanyTest {

    @Test
    fun createCompany() {
        val company =
            Company.builder()
                .id("id")
                .addAccount(
                    Company.Account.builder()
                        .accountName("account_name")
                        .accountNumber("account_number")
                        .accountType(Company.Account.AccountType.CHECKING)
                        .institutionName("institution_name")
                        .routingNumber("routing_number")
                        .build()
                )
                .addDepartment(
                    Company.Department.builder()
                        .name("name")
                        .parent(Company.Department.Parent.builder().name("name").build())
                        .build()
                )
                .ein("ein")
                .entity(
                    Company.Entity.builder()
                        .subtype(Company.Entity.Subtype.S_CORPORATION)
                        .type(Company.Entity.Type.LLC)
                        .build()
                )
                .legalName("legal_name")
                .addLocation(
                    Location.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .name("name")
                        .postalCode("postal_code")
                        .sourceId("source_id")
                        .state("state")
                        .build()
                )
                .primaryEmail("primary_email")
                .primaryPhoneNumber("primary_phone_number")
                .build()
        assertThat(company).isNotNull
        assertThat(company.id()).isEqualTo("id")
        assertThat(company.accounts())
            .containsExactly(
                Company.Account.builder()
                    .accountName("account_name")
                    .accountNumber("account_number")
                    .accountType(Company.Account.AccountType.CHECKING)
                    .institutionName("institution_name")
                    .routingNumber("routing_number")
                    .build()
            )
        assertThat(company.departments())
            .containsExactly(
                Company.Department.builder()
                    .name("name")
                    .parent(Company.Department.Parent.builder().name("name").build())
                    .build()
            )
        assertThat(company.ein()).isEqualTo("ein")
        assertThat(company.entity())
            .isEqualTo(
                Company.Entity.builder()
                    .subtype(Company.Entity.Subtype.S_CORPORATION)
                    .type(Company.Entity.Type.LLC)
                    .build()
            )
        assertThat(company.legalName()).isEqualTo("legal_name")
        assertThat(company.locations())
            .containsExactly(
                Location.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .name("name")
                    .postalCode("postal_code")
                    .sourceId("source_id")
                    .state("state")
                    .build()
            )
        assertThat(company.primaryEmail()).isEqualTo("primary_email")
        assertThat(company.primaryPhoneNumber()).isEqualTo("primary_phone_number")
    }
}
