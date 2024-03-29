package com.tryfinch.api.errors

import com.google.common.collect.ListMultimap

abstract class FinchServiceException
constructor(
    private val headers: ListMultimap<String, String>,
    message: String? = null,
    cause: Throwable? = null
) : FinchException(message, cause) {
    abstract fun statusCode(): Int

    fun headers(): ListMultimap<String, String> = headers
}
