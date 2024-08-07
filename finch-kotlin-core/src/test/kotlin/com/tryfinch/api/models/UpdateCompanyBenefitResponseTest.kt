// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UpdateCompanyBenefitResponseTest {

    @Test
    fun createUpdateCompanyBenefitResponse() {
        val updateCompanyBenefitResponse =
            UpdateCompanyBenefitResponse.builder().benefitId("benefit_id").build()
        assertThat(updateCompanyBenefitResponse).isNotNull
        assertThat(updateCompanyBenefitResponse.benefitId()).isEqualTo("benefit_id")
    }
}
