package com.example.dataserver.Model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    @SerialName(value = "email")
    val alamat: String,
    @SerialName(value = "nohp")
    val nohp: String,
)
