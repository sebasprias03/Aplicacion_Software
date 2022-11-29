package com.example.navigatorapp.recyclerJugadores.adapter

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.navigatorapp.recyclerJugadores.viewnose
import com.example.navigatorapp.databinding.ItemPlayerBinding

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemPlayerBinding.bind(view)
    @SuppressLint("SetTextI18n")
    fun render(viewnose: viewnose){
        binding.tvName.text = viewnose.Nombre
        binding.tvEstatura.text = viewnose.Estatura.toString()
        binding.tvNacionalidad.text = viewnose.Nacionalidad
        binding.tvPosition.text = viewnose.Posicion
        binding.tvDorsal.text = viewnose.Dorsal
        Glide.with(binding.ivimagen.context).load(viewnose.imagen).into(binding.ivimagen)
    }
}