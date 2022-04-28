package com.lucassimoesmartins.mycleanarchitectureexample

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.lucassimoesmartins.mycleanarchitectureexample.domain.HomeUseCase
import com.lucassimoesmartins.mycleanarchitectureexample.repository.HomeApi
import com.lucassimoesmartins.mycleanarchitectureexample.repository.HomeRepositoryImpl
import com.lucassimoesmartins.mycleanarchitectureexample.repository.RetrofitConfig
import com.lucassimoesmartins.mycleanarchitectureexample.ui.viewmodel.HomeViewModel
import com.lucassimoesmartins.mycleanarchitectureexample.ui.viewmodel.factory.HomeViewModelFactory

fun provideHomeViewModel(activity: AppCompatActivity): HomeViewModel =
    ViewModelProvider(activity, HomeViewModelFactory(provideHomeUseCase()))[HomeViewModel::class.java]

private fun provideHomeUseCase(): HomeUseCase = HomeUseCase(HomeRepositoryImpl(provideHomeApi()))

private fun provideHomeApi(): HomeApi = RetrofitConfig().api