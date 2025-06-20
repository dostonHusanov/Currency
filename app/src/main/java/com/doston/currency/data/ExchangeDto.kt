package com.doston.currency.data

import kotlinx.serialization.Serializable

@Serializable
data class ExchangeDto(
    val conversion_result: Double
)