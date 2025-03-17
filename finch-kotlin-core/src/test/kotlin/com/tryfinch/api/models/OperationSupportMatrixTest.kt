// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OperationSupportMatrixTest {

    @Test
    fun createOperationSupportMatrix() {
        val operationSupportMatrix =
            OperationSupportMatrix.builder()
                .create(OperationSupport.SUPPORTED)
                .delete(OperationSupport.SUPPORTED)
                .read(OperationSupport.SUPPORTED)
                .update(OperationSupport.SUPPORTED)
                .build()
        assertThat(operationSupportMatrix).isNotNull
        assertThat(operationSupportMatrix.create()).isEqualTo(OperationSupport.SUPPORTED)
        assertThat(operationSupportMatrix.delete()).isEqualTo(OperationSupport.SUPPORTED)
        assertThat(operationSupportMatrix.read()).isEqualTo(OperationSupport.SUPPORTED)
        assertThat(operationSupportMatrix.update()).isEqualTo(OperationSupport.SUPPORTED)
    }
}
