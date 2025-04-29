package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.core.domain.util.NetworkError

/**
 * @author riezky maisyar
 */

sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}