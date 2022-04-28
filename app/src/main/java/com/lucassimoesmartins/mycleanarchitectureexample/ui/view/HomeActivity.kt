package com.lucassimoesmartins.mycleanarchitectureexample.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucassimoesmartins.mycleanarchitectureexample.R
import com.lucassimoesmartins.mycleanarchitectureexample.provideHomeViewModel
import com.lucassimoesmartins.mycleanarchitectureexample.ui.viewmodel.HomeInteractor

class HomeActivity : AppCompatActivity() {

    private val viewModel by lazy { provideHomeViewModel(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setView()
    }

    private fun setView() {
        viewModel.interpret(HomeInteractor.GetPopularMovies)
    }
}