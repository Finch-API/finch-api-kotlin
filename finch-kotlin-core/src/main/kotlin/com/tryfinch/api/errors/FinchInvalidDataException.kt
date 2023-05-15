package com.tryfinch.api.errors

class FinchInvalidDataException constructor(message: String? = null, cause: Throwable? = null) :
    FinchException(message, cause)
