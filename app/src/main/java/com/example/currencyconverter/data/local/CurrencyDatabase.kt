package com.example.currencyconverter.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.currencyconverter.data.local.dao.ConversionHistoryDao
import com.example.currencyconverter.data.local.entity.ConversionHistoryEntity

@Database(
    entities = [ConversionHistoryEntity::class],  // Lista de entidades no banco
    version = 1,                                  // Versão do schema
    exportSchema = true                          // Exporta schema para versionamento
)
abstract class CurrencyDatabase : RoomDatabase() {

    abstract fun conversionHistoryDao(): ConversionHistoryDao  // Método abstrato para DAO

    companion object {
        @Volatile  // Garante visibilidade imediata entre threads
        private var INSTANCE: CurrencyDatabase? = null

        // Singleton pattern para garantir única instância do banco
        fun getInstance(context: Context): CurrencyDatabase {
            return INSTANCE ?: synchronized(this) {  // Synchronized para thread safety
                val instance = Room.databaseBuilder(
                    context.applicationContext,      // Contexto da aplicação
                    CurrencyDatabase::class.java,    // Classe do database
                    "currency_database"              // Nome do arquivo do banco
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}