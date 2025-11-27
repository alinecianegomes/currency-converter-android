package com.example.currencyconverter.data.model

data class CurrencyResponse(
    val amount: Double = 1.0,
    val base: String,
    val date: String,
    val rates: Map<String, Double>
)
