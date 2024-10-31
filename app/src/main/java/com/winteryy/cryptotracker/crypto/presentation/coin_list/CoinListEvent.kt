package com.winteryy.cryptotracker.crypto.presentation.coin_list

import com.winteryy.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}