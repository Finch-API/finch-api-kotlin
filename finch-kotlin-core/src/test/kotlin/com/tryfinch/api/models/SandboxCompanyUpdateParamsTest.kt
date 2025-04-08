// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxCompanyUpdateParamsTest {

    @Test
    fun create() {
        SandboxCompanyUpdateParams.builder()
            .addAccount(
                SandboxCompanyUpdateParams.Account.builder()
                    .accountName("account_name")
                    .accountNumber("account_number")
                    .accountType(SandboxCompanyUpdateParams.Account.AccountType.CHECKING)
                    .institutionName("institution_name")
                    .routingNumber("routing_number")
                    .build()
            )
            .addDepartment(
                SandboxCompanyUpdateParams.Department.builder()
                    .name("name")
                    .parent(
                        SandboxCompanyUpdateParams.Department.Parent.builder().name("name").build()
                    )
                    .build()
            )
            .ein("ein")
            .entity(
                SandboxCompanyUpdateParams.Entity.builder()
                    .subtype(SandboxCompanyUpdateParams.Entity.Subtype.S_CORPORATION)
                    .type(SandboxCompanyUpdateParams.Entity.Type.LLC)
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
            .primaryEmail("dev@stainless.com")
            .primaryPhoneNumber("primary_phone_number")
            .build()
    }

    @Test
    fun body() {
        val params =
            SandboxCompanyUpdateParams.builder()
                .addAccount(
                    SandboxCompanyUpdateParams.Account.builder()
                        .accountName("account_name")
                        .accountNumber("account_number")
                        .accountType(SandboxCompanyUpdateParams.Account.AccountType.CHECKING)
                        .institutionName("institution_name")
                        .routingNumber("routing_number")
                        .build()
                )
                .addDepartment(
                    SandboxCompanyUpdateParams.Department.builder()
                        .name("name")
                        .parent(
                            SandboxCompanyUpdateParams.Department.Parent.builder()
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .ein("ein")
                .entity(
                    SandboxCompanyUpdateParams.Entity.builder()
                        .subtype(SandboxCompanyUpdateParams.Entity.Subtype.S_CORPORATION)
                        .type(SandboxCompanyUpdateParams.Entity.Type.LLC)
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
                .primaryEmail("dev@stainless.com")
                .primaryPhoneNumber("primary_phone_number")
                .build()

        val body = params._body()

        assertThat(body.accounts())
            .containsExactly(
                SandboxCompanyUpdateParams.Account.builder()
                    .accountName("account_name")
                    .accountNumber("account_number")
                    .accountType(SandboxCompanyUpdateParams.Account.AccountType.CHECKING)
                    .institutionName("institution_name")
                    .routingNumber("routing_number")
                    .build()
            )
        assertThat(body.departments())
            .containsExactly(
                SandboxCompanyUpdateParams.Department.builder()
                    .name("name")
                    .parent(
                        SandboxCompanyUpdateParams.Department.Parent.builder().name("name").build()
                    )
                    .build()
            )
        assertThat(body.ein()).isEqualTo("ein")
        assertThat(body.entity())
            .isEqualTo(
                SandboxCompanyUpdateParams.Entity.builder()
                    .subtype(SandboxCompanyUpdateParams.Entity.Subtype.S_CORPORATION)
                    .type(SandboxCompanyUpdateParams.Entity.Type.LLC)
                    .build()
            )
        assertThat(body.legalName()).isEqualTo("legal_name")
        assertThat(body.locations())
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
        assertThat(body.primaryEmail()).isEqualTo("dev@stainless.com")
        assertThat(body.primaryPhoneNumber()).isEqualTo("primary_phone_number")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SandboxCompanyUpdateParams.builder()
                .addAccount(SandboxCompanyUpdateParams.Account.builder().build())
                .addDepartment(SandboxCompanyUpdateParams.Department.builder().build())
                .ein("ein")
                .entity(SandboxCompanyUpdateParams.Entity.builder().build())
                .legalName("legal_name")
                .addLocation(Location.builder().build())
                .primaryEmail("dev@stainless.com")
                .primaryPhoneNumber("primary_phone_number")
                .build()

        val body = params._body()

        assertThat(body.accounts())
            .containsExactly(SandboxCompanyUpdateParams.Account.builder().build())
        assertThat(body.departments())
            .containsExactly(SandboxCompanyUpdateParams.Department.builder().build())
        assertThat(body.ein()).isEqualTo("ein")
        assertThat(body.entity()).isEqualTo(SandboxCompanyUpdateParams.Entity.builder().build())
        assertThat(body.legalName()).isEqualTo("legal_name")
        assertThat(body.locations()).containsExactly(Location.builder().build())
        assertThat(body.primaryEmail()).isEqualTo("dev@stainless.com")
        assertThat(body.primaryPhoneNumber()).isEqualTo("primary_phone_number")
    }
}
