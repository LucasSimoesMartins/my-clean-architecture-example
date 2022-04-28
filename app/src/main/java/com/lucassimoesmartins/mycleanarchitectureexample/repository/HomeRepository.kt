package com.lucassimoesmartins.mycleanarchitectureexample.repository

interface HomeRepository {
    suspend fun getPopularMovies()
}