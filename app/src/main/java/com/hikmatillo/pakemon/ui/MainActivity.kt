package uz.hikmatillo.pokemon.ui

import android.content.Intent
import android.os.Bundle
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.hikmatillo.pakemon.core.adapter.PokemonAdapter
import com.hikmatillo.pakemon.core.data.PokemonData
import uz.hikmatillo.pokemon.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter = PokemonAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setAdapter()
        loadAction()
    }

    private fun setAdapter() {
        binding.pokemonList.adapter = adapter
        binding.pokemonList.layoutManager = GridLayoutManager(this,2)
        adapter.setData(PokemonData().getPokemons())
    }

    private fun loadAction() {
        adapter.setOnclickView = {pokemon->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("POKEMON",pokemon)
            startActivity(intent)
        }
    }
}