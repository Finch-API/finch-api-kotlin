package com.tryfinch.api.errors

class FinchInvalidDataException(message: String? = null, cause: Throwable? = null) :
    FinchException(message, cause)
