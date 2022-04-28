package com.lucassimoesmartins.mycleanarchitectureexample.domain

import com.lucassimoesmartins.mycleanarchitectureexample.repository.HomeRepositoryImpl

class HomeUseCase (private val repositoryImpl: HomeRepositoryImpl) {
    suspend fun getPopularMovies() {
        repositoryImpl.getPopularMovies()
    }
}