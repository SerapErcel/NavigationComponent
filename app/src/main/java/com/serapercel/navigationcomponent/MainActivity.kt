package com.serapercel.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.serapercel.navigationcomponent.databinding.BottomNavSayfaBinding

class MainActivity : AppCompatActivity() {
    /*  ----- FRAGMENT -----
    Activity moduler bolumudur
    Bir Activity birden fazla fragment calistirabilir
     */
    private lateinit var binding: BottomNavSayfaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = BottomNavSayfaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment

        NavigationUI.setupWithNavController(binding.bottomNav, navHostFragment.navController)
    }
}