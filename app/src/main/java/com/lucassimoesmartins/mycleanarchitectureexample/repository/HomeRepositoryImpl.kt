package com.lucassimoesmartins.mycleanarchitectureexample.repository

class HomeRepositoryImpl(private val api: HomeApi) : HomeRepository {
    override suspend fun getPopularMovies() {
        api.getPopularMovieList()
    }
}