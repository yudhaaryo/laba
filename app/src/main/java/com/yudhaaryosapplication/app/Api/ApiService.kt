package com.yudhaaryosapplication.app.Api

import com.yudhaaryosapplication.app.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET


interface ApiService {
    @GET("character")
    fun getMorty() : Call<ResponseMorty>
}