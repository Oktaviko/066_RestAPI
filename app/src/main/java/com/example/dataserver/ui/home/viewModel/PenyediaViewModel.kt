package com.example.dataserver.ui.home.viewModel

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.dataserver.ui.home.viewModel.HomeViewModel
import com.example.dataserver.ui.home.viewModel.InsertViewModel
import com.example.dataserver.ui.theme.aplikasiMars

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiMars().container.kontakRepository)
        }

        initializer {
            InsertViewModel(aplikasiMars().container.kontakRepository)
        }
    }
}