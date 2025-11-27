package com.example.currencyconverter.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "conversion_history")  // Define nome da tabela no banco
data class ConversionHistoryEntity(
    @PrimaryKey(autoGenerate = true)  // Chave primária com auto incremento
    val id: Long = 0,

    @ColumnInfo(name = "from_currency")  // Define nome da coluna
    val fromCurrency: String,

    @ColumnInfo(name = "to_currency")
    val toCurrency: String,

    @ColumnInfo(name = "original_amount")
    val originalAmount: Double,

    @ColumnInfo(name = "converted_amount")
    val convertedAmount: Double,

    @ColumnInfo(name = "exchange_rate")
    val exchangeRate: Double,

    @ColumnInfo(name = "timestamp")
    val timestamp: Long  // Timestamp para ordenar histórico
)