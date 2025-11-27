package com.example.currencyconverter.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.currencyconverter.data.local.entity.ConversionHistoryEntity
import kotlinx.coroutines.flow.Flow

@Dao  // Anotação para Data Access Object
interface ConversionHistoryDao {

    // Insere uma conversão no histórico
    @Insert(onConflict = OnConflictStrategy.REPLACE)  // Substitui se já existir
    suspend fun insertConversion(conversion: ConversionHistoryEntity)

    // Busca todo o histórico ordenado por timestamp (mais recente primeiro)
    @Query("SELECT * FROM conversion_history ORDER BY timestamp DESC")
    fun getAllConversions(): Flow<List<ConversionHistoryEntity>>  // Flow para observar mudanças

    // Busca conversões por moeda de origem
    @Query("SELECT * FROM conversion_history WHERE from_currency = :currency ORDER BY timestamp DESC")
    fun getConversionsByFromCurrency(currency: String): Flow<List<ConversionHistoryEntity>>

    // Busca conversões por moeda de destino
    @Query("SELECT * FROM conversion_history WHERE to_currency = :currency ORDER BY timestamp DESC")
    fun getConversionsByToCurrency(currency: String): Flow<List<ConversionHistoryEntity>>

    // Deleta uma conversão específica do histórico
    @Delete
    suspend fun deleteConversion(conversion: ConversionHistoryEntity)

    // Limpa todo o histórico
    @Query("DELETE FROM conversion_history")
    suspend fun clearAllHistory()

    // Busca conversões em um intervalo de datas
    @Query("SELECT * FROM conversion_history WHERE timestamp BETWEEN :startTime AND :endTime ORDER BY timestamp DESC")
    fun getConversionsByTimeRange(startTime: Long, endTime: Long): Flow<List<ConversionHistoryEntity>>
}