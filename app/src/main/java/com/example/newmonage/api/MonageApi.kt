package com.example.newmonage.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

import retrofit2.http.*

//Pada panggilan ke builder Retrofit, tentukan antarmuka yang disebut MonageApi
//yang menentukan cara Retrofit berkomunikasi dengan server web menggunakan permintaan HTTP.


interface MonageApi {
    //    GET untuk mengambil data server. @GET untuk memberi tahu Retrofit bahwa ini adalah permintaan GET
//    dan tentukan endpoint untuk metode layanan web tersebut

    @GET("/rest/v1/Monage App?select=*")
    suspend fun get(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String
        //    untuk menampilkan daftar objek MarsPhoto dari array JSON, bukan menampilkan string JSON.
    ): Response<List<MonageItem>>

    //    POST untuk membuat data baru di server.
    @POST("/rest/v1/Monage App?insert")
    suspend fun create(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String,
        @Body monageData: MonageData
    )

    @PATCH("/rest/v1/Monage App")
    suspend fun update(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String,
        @Query("id") idQuery : String,
        @Body monageData: MonageData
    ) : Response<Unit>
    //    DELETE untuk menghapus data dari server
    @DELETE("/rest/v1/Monage App")
    suspend fun delete(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String,
        @Query("id") idQuery : String
    ) : Response<Unit>
}

