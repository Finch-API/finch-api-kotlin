// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.tryfinch.api.core.BaseDeserializer
import com.tryfinch.api.core.BaseSerializer
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.getOrThrow
import com.tryfinch.api.errors.FinchInvalidDataException
import java.util.Objects

@JsonDeserialize(using = WebhookEvent.Deserializer::class)
@JsonSerialize(using = WebhookEvent.Serializer::class)
class WebhookEvent
private constructor(
    private val accountUpdateEvent: AccountUpdateEvent? = null,
    private val jobCompletionEvent: JobCompletionEvent? = null,
    private val companyEvent: CompanyEvent? = null,
    private val directoryEvent: DirectoryEvent? = null,
    private val employmentEvent: EmploymentEvent? = null,
    private val individualEvent: IndividualEvent? = null,
    private val paymentEvent: PaymentEvent? = null,
    private val payStatementEvent: PayStatementEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun accountUpdateEvent(): AccountUpdateEvent? = accountUpdateEvent

    fun jobCompletionEvent(): JobCompletionEvent? = jobCompletionEvent

    fun companyEvent(): CompanyEvent? = companyEvent

    fun directoryEvent(): DirectoryEvent? = directoryEvent

    fun employmentEvent(): EmploymentEvent? = employmentEvent

    fun individualEvent(): IndividualEvent? = individualEvent

    fun paymentEvent(): PaymentEvent? = paymentEvent

    fun payStatementEvent(): PayStatementEvent? = payStatementEvent

    fun isAccountUpdateEvent(): Boolean = accountUpdateEvent != null

    fun isJobCompletionEvent(): Boolean = jobCompletionEvent != null

    fun isCompanyEvent(): Boolean = companyEvent != null

    fun isDirectoryEvent(): Boolean = directoryEvent != null

    fun isEmploymentEvent(): Boolean = employmentEvent != null

    fun isIndividualEvent(): Boolean = individualEvent != null

    fun isPaymentEvent(): Boolean = paymentEvent != null

    fun isPayStatementEvent(): Boolean = payStatementEvent != null

    fun asAccountUpdateEvent(): AccountUpdateEvent =
        accountUpdateEvent.getOrThrow("accountUpdateEvent")

    fun asJobCompletionEvent(): JobCompletionEvent =
        jobCompletionEvent.getOrThrow("jobCompletionEvent")

    fun asCompanyEvent(): CompanyEvent = companyEvent.getOrThrow("companyEvent")

    fun asDirectoryEvent(): DirectoryEvent = directoryEvent.getOrThrow("directoryEvent")

    fun asEmploymentEvent(): EmploymentEvent = employmentEvent.getOrThrow("employmentEvent")

    fun asIndividualEvent(): IndividualEvent = individualEvent.getOrThrow("individualEvent")

    fun asPaymentEvent(): PaymentEvent = paymentEvent.getOrThrow("paymentEvent")

    fun asPayStatementEvent(): PayStatementEvent = payStatementEvent.getOrThrow("payStatementEvent")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            accountUpdateEvent != null -> visitor.visitAccountUpdateEvent(accountUpdateEvent)
            jobCompletionEvent != null -> visitor.visitJobCompletionEvent(jobCompletionEvent)
            companyEvent != null -> visitor.visitCompanyEvent(companyEvent)
            directoryEvent != null -> visitor.visitDirectoryEvent(directoryEvent)
            employmentEvent != null -> visitor.visitEmploymentEvent(employmentEvent)
            individualEvent != null -> visitor.visitIndividualEvent(individualEvent)
            paymentEvent != null -> visitor.visitPaymentEvent(paymentEvent)
            payStatementEvent != null -> visitor.visitPayStatementEvent(payStatementEvent)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): WebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccountUpdateEvent(accountUpdateEvent: AccountUpdateEvent) {
                    accountUpdateEvent.validate()
                }

                override fun visitJobCompletionEvent(jobCompletionEvent: JobCompletionEvent) {
                    jobCompletionEvent.validate()
                }

                override fun visitCompanyEvent(companyEvent: CompanyEvent) {
                    companyEvent.validate()
                }

                override fun visitDirectoryEvent(directoryEvent: DirectoryEvent) {
                    directoryEvent.validate()
                }

                override fun visitEmploymentEvent(employmentEvent: EmploymentEvent) {
                    employmentEvent.validate()
                }

                override fun visitIndividualEvent(individualEvent: IndividualEvent) {
                    individualEvent.validate()
                }

                override fun visitPaymentEvent(paymentEvent: PaymentEvent) {
                    paymentEvent.validate()
                }

                override fun visitPayStatementEvent(payStatementEvent: PayStatementEvent) {
                    payStatementEvent.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookEvent && accountUpdateEvent == other.accountUpdateEvent && jobCompletionEvent == other.jobCompletionEvent && companyEvent == other.companyEvent && directoryEvent == other.directoryEvent && employmentEvent == other.employmentEvent && individualEvent == other.individualEvent && paymentEvent == other.paymentEvent && payStatementEvent == other.payStatementEvent /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountUpdateEvent, jobCompletionEvent, companyEvent, directoryEvent, employmentEvent, individualEvent, paymentEvent, payStatementEvent) /* spotless:on */

    override fun toString(): String =
        when {
            accountUpdateEvent != null -> "WebhookEvent{accountUpdateEvent=$accountUpdateEvent}"
            jobCompletionEvent != null -> "WebhookEvent{jobCompletionEvent=$jobCompletionEvent}"
            companyEvent != null -> "WebhookEvent{companyEvent=$companyEvent}"
            directoryEvent != null -> "WebhookEvent{directoryEvent=$directoryEvent}"
            employmentEvent != null -> "WebhookEvent{employmentEvent=$employmentEvent}"
            individualEvent != null -> "WebhookEvent{individualEvent=$individualEvent}"
            paymentEvent != null -> "WebhookEvent{paymentEvent=$paymentEvent}"
            payStatementEvent != null -> "WebhookEvent{payStatementEvent=$payStatementEvent}"
            _json != null -> "WebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid WebhookEvent")
        }

    companion object {

        fun ofAccountUpdateEvent(accountUpdateEvent: AccountUpdateEvent) =
            WebhookEvent(accountUpdateEvent = accountUpdateEvent)

        fun ofJobCompletionEvent(jobCompletionEvent: JobCompletionEvent) =
            WebhookEvent(jobCompletionEvent = jobCompletionEvent)

        fun ofCompanyEvent(companyEvent: CompanyEvent) = WebhookEvent(companyEvent = companyEvent)

        fun ofDirectoryEvent(directoryEvent: DirectoryEvent) =
            WebhookEvent(directoryEvent = directoryEvent)

        fun ofEmploymentEvent(employmentEvent: EmploymentEvent) =
            WebhookEvent(employmentEvent = employmentEvent)

        fun ofIndividualEvent(individualEvent: IndividualEvent) =
            WebhookEvent(individualEvent = individualEvent)

        fun ofPaymentEvent(paymentEvent: PaymentEvent) = WebhookEvent(paymentEvent = paymentEvent)

        fun ofPayStatementEvent(payStatementEvent: PayStatementEvent) =
            WebhookEvent(payStatementEvent = payStatementEvent)
    }

    interface Visitor<out T> {

        fun visitAccountUpdateEvent(accountUpdateEvent: AccountUpdateEvent): T

        fun visitJobCompletionEvent(jobCompletionEvent: JobCompletionEvent): T

        fun visitCompanyEvent(companyEvent: CompanyEvent): T

        fun visitDirectoryEvent(directoryEvent: DirectoryEvent): T

        fun visitEmploymentEvent(employmentEvent: EmploymentEvent): T

        fun visitIndividualEvent(individualEvent: IndividualEvent): T

        fun visitPaymentEvent(paymentEvent: PaymentEvent): T

        fun visitPayStatementEvent(payStatementEvent: PayStatementEvent): T

        fun unknown(json: JsonValue?): T {
            throw FinchInvalidDataException("Unknown WebhookEvent: $json")
        }
    }

    class Deserializer : BaseDeserializer<WebhookEvent>(WebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): WebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<AccountUpdateEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(accountUpdateEvent = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<JobCompletionEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(jobCompletionEvent = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<CompanyEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(companyEvent = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<DirectoryEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(directoryEvent = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<EmploymentEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(employmentEvent = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<IndividualEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(individualEvent = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<PaymentEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(paymentEvent = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<PayStatementEvent>()) { it.validate() }
                ?.let {
                    return WebhookEvent(payStatementEvent = it, _json = json)
                }

            return WebhookEvent(_json = json)
        }
    }

    class Serializer : BaseSerializer<WebhookEvent>(WebhookEvent::class) {

        override fun serialize(
            value: WebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.accountUpdateEvent != null -> generator.writeObject(value.accountUpdateEvent)
                value.jobCompletionEvent != null -> generator.writeObject(value.jobCompletionEvent)
                value.companyEvent != null -> generator.writeObject(value.companyEvent)
                value.directoryEvent != null -> generator.writeObject(value.directoryEvent)
                value.employmentEvent != null -> generator.writeObject(value.employmentEvent)
                value.individualEvent != null -> generator.writeObject(value.individualEvent)
                value.paymentEvent != null -> generator.writeObject(value.paymentEvent)
                value.payStatementEvent != null -> generator.writeObject(value.payStatementEvent)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid WebhookEvent")
            }
        }
    }
}
