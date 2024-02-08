package com.hikmatillo.pakemon.core.app

import android.app.Application
import com.hikmatillo.pakemon.core.data.PokemonData

class App :Application() {

    override fun onCreate() {
        super.onCreate()
        PokemonData().loadData(this)

    }

}