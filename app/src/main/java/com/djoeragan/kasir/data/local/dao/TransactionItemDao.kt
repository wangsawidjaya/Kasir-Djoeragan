package com.djoeragan.kasir.data.local.dao

import androidx.room.*
import com.djoeragan.kasir.data.local.entity.TransactionItemEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface TransactionItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransactionItem(item: TransactionItemEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTransactionItems(items: List<TransactionItemEntity>)

    @Update
    suspend fun updateTransactionItem(item: TransactionItemEntity)

    @Delete
    suspend fun deleteTransactionItem(item: TransactionItemEntity)

    @Query("SELECT * FROM transaction_items WHERE id = :id")
    suspend fun getTransactionItemById(id: Int): TransactionItemEntity?

    @Query("SELECT * FROM transaction_items WHERE transactionId = :transactionId")
    fun getTransactionItems(transactionId: Int): Flow<List<TransactionItemEntity>>

    @Query("DELETE FROM transaction_items")
    suspend fun deleteAllTransactionItems()
}
