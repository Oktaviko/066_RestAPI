package com.example.dataserver.ui.kontak.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dataserver.Model.Kontak
import com.example.dataserver.repository.InsertUiEvent
import com.example.dataserver.repository.InsertUiState
import com.example.dataserver.repository.KontakRepository
import com.example.dataserver.repository.toInsertUiEvent
import com.example.dataserver.repository.toKontak
import kotlinx.coroutines.launch

class InsertViewModel(private val kontakRepository: KontakRepository) : ViewModel() {
    var insertKontakState by mutableStateOf(InsertUiState())
        private set

    fun updateInsertKontakState(insertUiEvent: InsertUiEvent){
        insertKontakState = InsertUiState(insertUiEvent = insertUiEvent)
    }

    suspend fun insertKontak(){
        viewModelScope.launch {
            try {
                kontakRepository.insertKontak(insertKontakState.insertUiEvent.toKontak())
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }
}

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent(),
)

data class InsertUiEvent(
    val id : Int = 0,
    val nama : String = "",
    val email : String = "",
    val noHp : String = "",
)

fun Kontak.toUiStateKontak():InsertUiState = InsertUiState(
    insertUiEvent = toInsertUiEvent(),
)

fun Kontak.toInsertUiEvent(): InsertUiEvent = InsertUiEvent(
    id = id,
    nama = nama,
    alamat = alamat,
    nohp = nohp
)
