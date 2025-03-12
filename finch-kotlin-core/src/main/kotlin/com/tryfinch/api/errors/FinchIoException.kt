package com.tryfinch.api.errors

class FinchIoException(message: String? = null, cause: Throwable? = null) :
    FinchException(message, cause)
