package com.tryfinch.api.errors

open class FinchException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
