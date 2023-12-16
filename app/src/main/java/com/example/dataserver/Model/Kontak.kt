package com.example.dataserver.Model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    val alamat: String,
    @SerialName(value = "telpon")
    val nohp: String,
)
