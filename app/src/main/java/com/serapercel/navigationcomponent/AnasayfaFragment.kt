package com.serapercel.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.serapercel.navigationcomponent.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.butonBasla.setOnClickListener {
            Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()
            val kisi = Kisiler("mehmmet", 34, 1.89f, false)
            val gecis = AnasayfaFragmentDirections
                .oyunEkraninaGecis(kisi, "ahmet", 23, 1.68f, true)
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root
    }

}