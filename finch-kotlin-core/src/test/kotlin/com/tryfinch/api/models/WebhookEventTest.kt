// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookEventTest {

    @Test
    fun ofAccountUpdated() {
        val accountUpdated =
            AccountUpdateEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofAccountUpdated(accountUpdated)

        assertThat(webhookEvent.accountUpdated()).isEqualTo(accountUpdated)
        assertThat(webhookEvent.jobCompletion()).isNull()
        assertThat(webhookEvent.companyUpdated()).isNull()
        assertThat(webhookEvent.directory()).isNull()
        assertThat(webhookEvent.employment()).isNull()
        assertThat(webhookEvent.individual()).isNull()
        assertThat(webhookEvent.payment()).isNull()
        assertThat(webhookEvent.payStatement()).isNull()
    }

    @Test
    fun ofJobCompletion() {
        val jobCompletion =
            JobCompletionEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofJobCompletion(jobCompletion)

        assertThat(webhookEvent.accountUpdated()).isNull()
        assertThat(webhookEvent.jobCompletion()).isEqualTo(jobCompletion)
        assertThat(webhookEvent.companyUpdated()).isNull()
        assertThat(webhookEvent.directory()).isNull()
        assertThat(webhookEvent.employment()).isNull()
        assertThat(webhookEvent.individual()).isNull()
        assertThat(webhookEvent.payment()).isNull()
        assertThat(webhookEvent.payStatement()).isNull()
    }

    @Test
    fun ofCompanyUpdated() {
        val companyUpdated =
            CompanyEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofCompanyUpdated(companyUpdated)

        assertThat(webhookEvent.accountUpdated()).isNull()
        assertThat(webhookEvent.jobCompletion()).isNull()
        assertThat(webhookEvent.companyUpdated()).isEqualTo(companyUpdated)
        assertThat(webhookEvent.directory()).isNull()
        assertThat(webhookEvent.employment()).isNull()
        assertThat(webhookEvent.individual()).isNull()
        assertThat(webhookEvent.payment()).isNull()
        assertThat(webhookEvent.payStatement()).isNull()
    }

    @Test
    fun ofDirectory() {
        val directory =
            DirectoryEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofDirectory(directory)

        assertThat(webhookEvent.accountUpdated()).isNull()
        assertThat(webhookEvent.jobCompletion()).isNull()
        assertThat(webhookEvent.companyUpdated()).isNull()
        assertThat(webhookEvent.directory()).isEqualTo(directory)
        assertThat(webhookEvent.employment()).isNull()
        assertThat(webhookEvent.individual()).isNull()
        assertThat(webhookEvent.payment()).isNull()
        assertThat(webhookEvent.payStatement()).isNull()
    }

    @Test
    fun ofEmployment() {
        val employment =
            EmploymentEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofEmployment(employment)

        assertThat(webhookEvent.accountUpdated()).isNull()
        assertThat(webhookEvent.jobCompletion()).isNull()
        assertThat(webhookEvent.companyUpdated()).isNull()
        assertThat(webhookEvent.directory()).isNull()
        assertThat(webhookEvent.employment()).isEqualTo(employment)
        assertThat(webhookEvent.individual()).isNull()
        assertThat(webhookEvent.payment()).isNull()
        assertThat(webhookEvent.payStatement()).isNull()
    }

    @Test
    fun ofIndividual() {
        val individual =
            IndividualEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofIndividual(individual)

        assertThat(webhookEvent.accountUpdated()).isNull()
        assertThat(webhookEvent.jobCompletion()).isNull()
        assertThat(webhookEvent.companyUpdated()).isNull()
        assertThat(webhookEvent.directory()).isNull()
        assertThat(webhookEvent.employment()).isNull()
        assertThat(webhookEvent.individual()).isEqualTo(individual)
        assertThat(webhookEvent.payment()).isNull()
        assertThat(webhookEvent.payStatement()).isNull()
    }

    @Test
    fun ofPayment() {
        val payment = PaymentEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofPayment(payment)

        assertThat(webhookEvent.accountUpdated()).isNull()
        assertThat(webhookEvent.jobCompletion()).isNull()
        assertThat(webhookEvent.companyUpdated()).isNull()
        assertThat(webhookEvent.directory()).isNull()
        assertThat(webhookEvent.employment()).isNull()
        assertThat(webhookEvent.individual()).isNull()
        assertThat(webhookEvent.payment()).isEqualTo(payment)
        assertThat(webhookEvent.payStatement()).isNull()
    }

    @Test
    fun ofPayStatement() {
        val payStatement =
            PayStatementEvent.builder().accountId("account_id").companyId("company_id").build()

        val webhookEvent = WebhookEvent.ofPayStatement(payStatement)

        assertThat(webhookEvent.accountUpdated()).isNull()
        assertThat(webhookEvent.jobCompletion()).isNull()
        assertThat(webhookEvent.companyUpdated()).isNull()
        assertThat(webhookEvent.directory()).isNull()
        assertThat(webhookEvent.employment()).isNull()
        assertThat(webhookEvent.individual()).isNull()
        assertThat(webhookEvent.payment()).isNull()
        assertThat(webhookEvent.payStatement()).isEqualTo(payStatement)
    }
}
