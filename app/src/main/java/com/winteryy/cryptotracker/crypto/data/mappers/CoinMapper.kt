package com.winteryy.cryptotracker.crypto.data.mappers

import com.winteryy.cryptotracker.crypto.data.networking.dto.CoinDto
import com.winteryy.cryptotracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}