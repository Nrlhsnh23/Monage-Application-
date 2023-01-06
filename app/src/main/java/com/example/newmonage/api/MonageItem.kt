package com.example.newmonage.api

// class yang digunakan objek satuan terhadap nilai yang kita butuhkan
data class MonageItem (
    val id: String,
    val tanggal: String,
    val label: String,
    val amount: Double,
    val description: String? = null,
    val done_at: String? = null,
    val created_at: String
)