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

/**
 * A 2020 version of the W-4 tax form containing information on an individual's filing status,
 * dependents, and withholding details.
 */
@JsonDeserialize(using = DocumentRetreiveResponse.Deserializer::class)
@JsonSerialize(using = DocumentRetreiveResponse.Serializer::class)
class DocumentRetreiveResponse
private constructor(
    private val w42020: W42020? = null,
    private val w42005: W42005? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * A 2020 version of the W-4 tax form containing information on an individual's filing status,
     * dependents, and withholding details.
     */
    fun w42020(): W42020? = w42020

    /**
     * A 2005 version of the W-4 tax form containing information on an individual's filing status,
     * dependents, and withholding details.
     */
    fun w42005(): W42005? = w42005

    fun isW42020(): Boolean = w42020 != null

    fun isW42005(): Boolean = w42005 != null

    /**
     * A 2020 version of the W-4 tax form containing information on an individual's filing status,
     * dependents, and withholding details.
     */
    fun asW42020(): W42020 = w42020.getOrThrow("w42020")

    /**
     * A 2005 version of the W-4 tax form containing information on an individual's filing status,
     * dependents, and withholding details.
     */
    fun asW42005(): W42005 = w42005.getOrThrow("w42005")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            w42020 != null -> visitor.visitW42020(w42020)
            w42005 != null -> visitor.visitW42005(w42005)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): DocumentRetreiveResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitW42020(w42020: W42020) {
                    w42020.validate()
                }

                override fun visitW42005(w42005: W42005) {
                    w42005.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: FinchInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitW42020(w42020: W42020) = w42020.validity()

                override fun visitW42005(w42005: W42005) = w42005.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentRetreiveResponse && w42020 == other.w42020 && w42005 == other.w42005 /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(w42020, w42005) /* spotless:on */

    override fun toString(): String =
        when {
            w42020 != null -> "DocumentRetreiveResponse{w42020=$w42020}"
            w42005 != null -> "DocumentRetreiveResponse{w42005=$w42005}"
            _json != null -> "DocumentRetreiveResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DocumentRetreiveResponse")
        }

    companion object {

        /**
         * A 2020 version of the W-4 tax form containing information on an individual's filing
         * status, dependents, and withholding details.
         */
        fun ofW42020(w42020: W42020) = DocumentRetreiveResponse(w42020 = w42020)

        /**
         * A 2005 version of the W-4 tax form containing information on an individual's filing
         * status, dependents, and withholding details.
         */
        fun ofW42005(w42005: W42005) = DocumentRetreiveResponse(w42005 = w42005)
    }

    /**
     * An interface that defines how to map each variant of [DocumentRetreiveResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /**
         * A 2020 version of the W-4 tax form containing information on an individual's filing
         * status, dependents, and withholding details.
         */
        fun visitW42020(w42020: W42020): T

        /**
         * A 2005 version of the W-4 tax form containing information on an individual's filing
         * status, dependents, and withholding details.
         */
        fun visitW42005(w42005: W42005): T

        /**
         * Maps an unknown variant of [DocumentRetreiveResponse] to a value of type [T].
         *
         * An instance of [DocumentRetreiveResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws FinchInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw FinchInvalidDataException("Unknown DocumentRetreiveResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DocumentRetreiveResponse>(DocumentRetreiveResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): DocumentRetreiveResponse {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "w4_2020" -> {
                    return tryDeserialize(node, jacksonTypeRef<W42020>())?.let {
                        DocumentRetreiveResponse(w42020 = it, _json = json)
                    } ?: DocumentRetreiveResponse(_json = json)
                }
                "w4_2005" -> {
                    return tryDeserialize(node, jacksonTypeRef<W42005>())?.let {
                        DocumentRetreiveResponse(w42005 = it, _json = json)
                    } ?: DocumentRetreiveResponse(_json = json)
                }
            }

            return DocumentRetreiveResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<DocumentRetreiveResponse>(DocumentRetreiveResponse::class) {

        override fun serialize(
            value: DocumentRetreiveResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.w42020 != null -> generator.writeObject(value.w42020)
                value.w42005 != null -> generator.writeObject(value.w42005)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DocumentRetreiveResponse")
            }
        }
    }
}
