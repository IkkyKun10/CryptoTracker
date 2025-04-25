package com.plcoding.cryptotracker.core.domain.util

/**
 * @author riezky maisyar
 */

enum class NetworkError : Error {
    REQUEST_TIMEOUT,
    TO_MANY_REQUEST,
    NO_INTERNET,
    SERIALIZATION,
    UNKNOWN,
    SERVER_ERROR,
}