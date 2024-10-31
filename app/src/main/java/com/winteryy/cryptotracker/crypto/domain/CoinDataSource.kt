package com.winteryy.cryptotracker.crypto.domain

import com.winteryy.cryptotracker.core.domain.util.NetworkError
import com.winteryy.cryptotracker.core.domain.util.Result

interface CoinDataSource {

    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}