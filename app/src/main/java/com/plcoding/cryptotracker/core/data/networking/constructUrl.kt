package com.plcoding.cryptotracker.core.data.networking

import com.plcoding.cryptotracker.BuildConfig

/**
 * @author riezky maisyar
 */

fun constructUrl(url: String) : String {
    return when {
        url.contains(BuildConfig.BASE_URL) -> url
        url.startsWith("/") -> BuildConfig.BASE_URL + url.drop(1) // or url.removePrefix("/")
        else -> BuildConfig.BASE_URL + url
    }
}