package com.example.dataserver.ui.kontak.viewmodel

import android.text.Spannable.Factory
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.dataserver.ui.home.viewModel.HomeViewModel
import com.example.dataserver.ui.theme.aplikasiMars

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiKontak().container.kontakRepository)
        }

        initializer {
            InsertViewModel(aplikasiKontak().container.kontakRepository)
        }
    }
}