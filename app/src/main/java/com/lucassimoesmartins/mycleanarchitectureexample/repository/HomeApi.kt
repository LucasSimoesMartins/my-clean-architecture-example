package com.lucassimoesmartins.mycleanarchitectureexample.repository

import com.lucassimoesmartins.mycleanarchitectureexample.domain.model.MovieResponse
import retrofit2.http.GET

interface HomeApi {
    @GET("movie/popular?api_key=XXXXX&language=en-US&page=1")
    suspend fun getPopularMovieList(): MovieResponse
}