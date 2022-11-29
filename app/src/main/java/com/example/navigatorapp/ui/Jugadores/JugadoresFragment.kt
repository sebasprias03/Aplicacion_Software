package com.example.navigatorapp.ui.Jugadores


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigatorapp.recyclerJugadores.JugadoresProvider
import com.example.navigatorapp.recyclerJugadores.adapter.JugadoresAdapter
import com.example.navigatorapp.databinding.FragmentEcplayersBinding

class JugadoresFragment : Fragment() {
    private var _binding: FragmentEcplayersBinding? = null


    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEcplayersBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerPlayers.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = JugadoresAdapter(JugadoresProvider.ecPlayersLists)
        }
    }
}