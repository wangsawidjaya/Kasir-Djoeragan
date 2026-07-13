package com.djoeragan.kasir.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.djoeragan.kasir.data.local.dao.*
import com.djoeragan.kasir.data.local.entity.*

@Database(
    entities = [
        UserEntity::class,
        ProductEntity::class,
        CategoryEntity::class,
        TransactionEntity::class,
        TransactionItemEntity::class,
        StockHistoryEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class KasirDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun productDao(): ProductDao
    abstract fun categoryDao(): CategoryDao
    abstract fun transactionDao(): TransactionDao
    abstract fun transactionItemDao(): TransactionItemDao
    abstract fun stockHistoryDao(): StockHistoryDao

    companion object {
        const val DATABASE_NAME = "kasir_djoeragan.db"
    }
}
