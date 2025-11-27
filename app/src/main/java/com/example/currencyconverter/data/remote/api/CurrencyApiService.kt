package com.example.currencyconverter.data.remote.api

import com.example.currencyconverter.data.model.CurrencyResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApiService {

    @GET("latest")
    suspend fun getLatestRates(
        @Query("from") base: String
    ): CurrencyResponse

    companion object {
        // SEM CHAVE - TOTALMENTE GRATUITA
        const val BASE_URL = "https://api.frankfurter.app/"
    }
}