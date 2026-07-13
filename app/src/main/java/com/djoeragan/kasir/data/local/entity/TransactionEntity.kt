package com.djoeragan.kasir.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transactions")
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val cashierId: Int,
    val totalPrice: Double,
    val totalDiscount: Double = 0.0,
    val totalPayment: Double,
    val paymentMethod: String,
    val status: String = "completed", // completed, pending, cancelled
    val notes: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)
