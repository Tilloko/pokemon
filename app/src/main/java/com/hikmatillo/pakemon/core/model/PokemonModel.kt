package com.hikmatillo.pakemon.core.model

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import java.io.Serializable

data class PokemonModel(
    val id: Int,
    val name: String,
    @DrawableRes
    val image:Int,
    val weight: Int,
    val height: Int,
    val type: ArrayList<String>,
    val hp: Int,
    val attack: Int,
    val defence: Int,
    val speed: Int,
    val exp: Int
) : Serializable