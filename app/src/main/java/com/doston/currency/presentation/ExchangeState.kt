package com.doston.currency.presentation

import com.doston.currency.domain.Currency

data class ExchangeState(
    var from: Currency = Currency("United States Dollar", "USD"),
    val to: Currency = Currency("Euro", "EUR"),
    val amount: String = "1",
    val result: String = "",
    val allCurrencies: List<Currency> = emptyList()
)
