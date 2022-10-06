package com.serapercel.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.serapercel.navigationcomponent.databinding.FragmentAnasayfaBinding
import com.serapercel.navigationcomponent.databinding.FragmentOyunEkraniBinding

class OyunEkraniFragment : Fragment() {
    private lateinit var tasarim: FragmentOyunEkraniBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentOyunEkraniBinding.inflate(inflater, container, false)

        val bundle:OyunEkraniFragmentArgs by navArgs() //by delegete
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekar = bundle.bekar
        val gelennesne = bundle.kisi

        Log.e("Gelen Ad", gelenAd)
        Log.e("Gelen Boy", gelenBoy.toString())
        Log.e("Gelen Yas", gelenYas.toString())
        Log.e("Gelen Bekar", gelenBekar.toString())

        Log.e("Gelen Nesne Ad", gelennesne.ad)
        Log.e("Gelen Nesne Boy", gelennesne.boy.toString())
        Log.e("Gelen Nesne Yas", gelennesne.yas.toString())
        Log.e("Gelen Nesne Bekar", gelennesne.bekar.toString())



        tasarim.butonBitir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sonucEkraniniaGecis)

        }

        return tasarim.root
    }
}