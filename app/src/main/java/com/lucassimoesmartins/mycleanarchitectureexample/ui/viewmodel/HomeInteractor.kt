package com.lucassimoesmartins.mycleanarchitectureexample.ui.viewmodel

sealed class HomeInteractor {
    object GetPopularMovies : HomeInteractor()
}