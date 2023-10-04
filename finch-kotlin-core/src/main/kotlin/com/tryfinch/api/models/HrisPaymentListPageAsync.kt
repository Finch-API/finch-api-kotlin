// File generated from our OpenAPI spec by Stainless.

package com.tryfinch.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.tryfinch.api.core.ExcludeMissing
import com.tryfinch.api.core.JsonField
import com.tryfinch.api.core.JsonMissing
import com.tryfinch.api.core.JsonValue
import com.tryfinch.api.core.NoAutoDetect
import com.tryfinch.api.core.toUnmodifiable
import com.tryfinch.api.services.async.hris.PaymentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class HrisPaymentListPageAsync
private constructor(
    private val paymentsService: PaymentServiceAsync,
    private val params: HrisPaymentListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<Payment> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HrisPaymentListPageAsync &&
            this.paymentsService == other.paymentsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            paymentsService,
            params,
            response,
        )
    }

    override fun toString() =
        "HrisPaymentListPageAsync{paymentsService=$paymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return items().isEmpty()
    }

    fun getNextPageParams(): HrisPaymentListParams? {
        return null
    }

    suspend fun getNextPage(): HrisPaymentListPageAsync? {
        return getNextPageParams()?.let { paymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            paymentsService: PaymentServiceAsync,
            params: HrisPaymentListParams,
            response: Response
        ) =
            HrisPaymentListPageAsync(
                paymentsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val items: JsonField<List<Payment>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun items(): List<Payment> = items.getNullable("items") ?: listOf()

        @JsonProperty("items") fun _items(): JsonField<List<Payment>>? = items

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                items().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.items == other.items &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(items, additionalProperties)
        }

        override fun toString() =
            "HrisPaymentListPageAsync.Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<Payment>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<Payment>) = items(JsonField.of(items))

            @JsonProperty("items")
            fun items(items: JsonField<List<Payment>>) = apply { this.items = items }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toUnmodifiable())
        }
    }

    class AutoPager
    constructor(
        private val firstPage: HrisPaymentListPageAsync,
    ) : Flow<Payment> {

        override suspend fun collect(collector: FlowCollector<Payment>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
