package com.tryfinch.api.errors

class FinchIoException constructor(message: String? = null, cause: Throwable? = null) :
    FinchException(message, cause)
