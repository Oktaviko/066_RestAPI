package com.example.dataserver

import android.app.Application
import com.example.dataserver.repository.AppContainer
import com.example.dataserver.repository.KontakContainer
class KontakAplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}