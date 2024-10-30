package com.winteryy.cryptotracker.core.data.networking

import com.winteryy.cryptotracker.BuildConfig

fun constructUrl(url: String): String {
    return when {
        url.contains(BuildConfig.BASE_URL) -> url // URL 전체 받은 경우
        url.startsWith("/") -> BuildConfig.BASE_URL + url.drop(1) // /포함 경로만 받은 경우
        else -> BuildConfig.BASE_URL + url // 경로만 받은 경우
    }
}