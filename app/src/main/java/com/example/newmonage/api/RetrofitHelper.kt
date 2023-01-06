package com.example.newmonage.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// jalur komunikasi antara klien dengan dengan server web
//Pengonversi memberi tahu Retrofit apa yang harus dilakukan dengan data yang didapat kembali dari layanan web.
//Dalam hal ini, Retrofit akan mengambil respons JSON dari layanan web dan menampilkannya sebagai String.
//Retrofit memiliki ScalarsConverter yang mendukung string dan jenis sederhana lainnya.

object RetrofitHelper {

        val baseUrl = "https://icappimgcasgxcxgthbi.supabase.co"

        fun getInstance(): Retrofit {
            return Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                // we need to add converter factory to
                // convert JSON object to Java object
                .build()
        }
    }
