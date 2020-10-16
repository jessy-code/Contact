package com.example.contact

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

const val baseUrl = "https://api.stackexchange.com/2.2/"

class RetrofitClient {

    private var retrofit: Retrofit? = null

    fun getClient() : StackService{
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!.create(StackService::class.java)
    }
}