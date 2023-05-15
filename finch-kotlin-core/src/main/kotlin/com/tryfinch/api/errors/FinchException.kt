package com.tryfinch.api.errors

open class FinchException constructor(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
