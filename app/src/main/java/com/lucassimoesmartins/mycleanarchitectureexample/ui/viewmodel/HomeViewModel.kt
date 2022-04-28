package com.lucassimoesmartins.mycleanarchitectureexample.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lucassimoesmartins.mycleanarchitectureexample.domain.HomeUseCase
import kotlinx.coroutines.runBlocking

class HomeViewModel(private val useCase: HomeUseCase) : ViewModel() {
    private val state: MutableLiveData<HomeState> = MutableLiveData()
    val viewState: LiveData<HomeState> = state

    fun interpret(homeInteractor: HomeInteractor) {
        when (homeInteractor) {
            is HomeInteractor.GetPopularMovies -> {
                runBlocking {
                    val result = useCase.getPopularMovies()
                }
            }
        }
    }
}