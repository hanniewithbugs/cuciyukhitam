package com.azhar.laundry.api

import com.azhar.laundry.model.ResponseModel
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @FormUrlEncoded
    @POST("insert_pesanan.php")
    fun tambahPesanan(
        @Field("nama_pelanggan") nama_pelanggan: String,
        @Field("alamat") alamat: String,
        @Field("layanan") layanan: String,
        @Field("tanggal") tanggal: String,
        @Field("id_kurir") id_kurir: String
    ): Call<ResponseModel>
}
