package com.hikmatillo.pakemon.core.data

import android.content.Context
import com.hikmatillo.pakemon.core.model.PokemonModel
import uz.hikmatillo.pokemon.R


class PokemonData() {

    private var pokemons =  ArrayList<PokemonModel>()

    fun loadData(context: Context) {
        pokemons.add(
            PokemonModel(
                id = 1,
                name = "Bulbasaur",
                image = R.drawable.pokemon1,
                weight = 15,
                height = 2,
                hp = 3,
                attack = 3,
                defence = 3,
                speed = 3,
                exp = 4,
                type = arrayListOf("Grass", "Poison"),
            )
        )

        pokemons?.add(
            PokemonModel(
                id = 2,
                name = "Charmeleon",
                image = R.drawable.pokemon2,
                weight = 41,
                height = 3,
                hp = 4,
                attack = 4,
                defence = 4,
                speed = 5,
                exp = 5,
                type = arrayListOf("Fire"),
            )
        )

        pokemons?.add(
            PokemonModel(
                id = 3,
                name = "Charizard",
                image = R.drawable.pokemon3,
                weight = 199,
                height = 5,
                hp = 5,
                attack = 5,
                defence = 5,
                speed = 6,
                exp = 5,
                type = arrayListOf("Fire", "Flying"),
            )
        )

        pokemons?.add(
            PokemonModel(
                id = 4,
                name = "Wartortle",
                image = R.drawable.pokemon4,
                weight = 49,
                height = 3,
                hp = 4,
                attack = 4,
                defence = 5,
                speed = 4,
                exp = 5,
                type = arrayListOf("Water"),
            )
        )


        pokemons?.add(
            PokemonModel(
                id = 5,
                name = "Caterpie",
                image = R.drawable.pokemon5,
                weight = 6,
                height = 1,
                hp = 3,
                attack = 2,
                defence = 3,
                speed = 3,
                exp = 2,
                type = arrayListOf("Bug"),
            )
        )

        pokemons?.add(
            PokemonModel(
                id = 6,
                name = "Arbok",
                image = R.drawable.pokemon6,
                weight = 143,
                height = 11,
                hp = 4,
                attack = 6,
                defence = 5,
                speed = 5,
                exp = 5,
                type = arrayListOf("Poison"),
            )
        )

    }
    fun getPokemons():ArrayList<PokemonModel>{
        return pokemons
    }

}