package com.djoeragan.kasir.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.djoeragan.kasir.data.database.entity.TransactionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TransactionDao {
    @Insert
    suspend fun insert(transaction: TransactionEntity): Long

    @Delete
    suspend fun delete(transaction: TransactionEntity)

    @Query("SELECT * FROM transactions WHERE id = :id")
    fun getTransactionById(id: Long): Flow<TransactionEntity?>

    @Query("SELECT * FROM transactions ORDER BY createdAt DESC")
    fun getAllTransactions(): Flow<List<TransactionEntity>>

    @Query("SELECT * FROM transactions WHERE createdAt >= :startTime AND createdAt <= :endTime ORDER BY createdAt DESC")
    fun getTransactionsByDateRange(startTime: Long, endTime: Long): Flow<List<TransactionEntity>>

    @Query("SELECT SUM(totalAmount) FROM transactions WHERE createdAt >= :startTime AND createdAt <= :endTime")
    fun getTotalSales(startTime: Long, endTime: Long): Flow<Double?>

    @Query("SELECT COUNT(*) FROM transactions WHERE createdAt >= :startTime AND createdAt <= :endTime")
    fun getTransactionCount(startTime: Long, endTime: Long): Flow<Int>
}
