package com.wildanarkan.getretrofit.Api

import com.wildanarkan.getretrofit.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty() : Call<ResponseMorty>
}