package com.lucassimoesmartins.mycleanarchitectureexample.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL ="https://api.themoviedb.org/3/"

class RetrofitConfig {

    private val retrofit by lazy {
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    val api: HomeApi by lazy {
        retrofit.create(HomeApi::class.java)
    }

}