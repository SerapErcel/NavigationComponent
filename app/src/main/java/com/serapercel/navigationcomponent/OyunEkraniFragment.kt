package com.serapercel.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serapercel.navigationcomponent.databinding.FragmentAnasayfaBinding
import com.serapercel.navigationcomponent.databinding.FragmentOyunEkraniBinding

class OyunEkraniFragment : Fragment() {
    private lateinit var tasarim: FragmentOyunEkraniBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentOyunEkraniBinding.inflate(inflater, container, false)

        tasarim.butonBitir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sonucEkraniniaGecis)

        }

        return tasarim.root
    }
}