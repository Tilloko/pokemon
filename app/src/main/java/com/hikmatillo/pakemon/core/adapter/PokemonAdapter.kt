package com.hikmatillo.pakemon.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hikmatillo.pakemon.core.model.PokemonModel
import uz.hikmatillo.pokemon.databinding.ItemViewBinding


class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {
    var setOnclickView: ((data: PokemonModel) -> Unit)? = null
    private val data = ArrayList<PokemonModel>()


    fun setData(data: ArrayList<PokemonModel>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    fun removeData(position: Int) {
        data.removeAt(position)
        notifyItemRemoved(position)
    }

    inner class PokemonViewHolder(private val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: PokemonModel) {
            binding.pokemonName.text = data.name
            binding.pokemonImame.setImageResource(data.image)
            itemView.setOnClickListener {
                setOnclickView?.invoke(data)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        return PokemonViewHolder(
            ItemViewBinding.inflate(
                LayoutInflater.from(parent.context), parent,
                false
            )
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bindData(data[position])
    }

}