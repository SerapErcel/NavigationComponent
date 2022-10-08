package com.serapercel.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.serapercel.navigationcomponent.databinding.BottomNavSayfaBinding
import com.serapercel.navigationcomponent.databinding.DrawerSayfaBinding

/*  ----- FRAGMENT -----
    Activity moduler bolumudur
    Bir Activity birden fazla fragment calistirabilir
     */

class MainActivity : AppCompatActivity() {
    // private lateinit var binding: BottomNavSayfaBinding
    private lateinit var binding: DrawerSayfaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //binding = BottomNavSayfaBinding.inflate(layoutInflater)
        binding = DrawerSayfaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Bottom Navigation Bar Ekleme
        /* val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment

        NavigationUI.setupWithNavController(binding.bottomNav, navHostFragment.navController)
         */

        // Drawer Navigation Ekleme
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navigationView, navHostFragment.navController)

        binding.toolbar.title = "Başlık"

        val toggle = ActionBarDrawerToggle(this, binding.drawer, binding.toolbar, 0, 0)
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()

    }

    override fun onBackPressed() {
        if (binding.drawer.isDrawerOpen(GravityCompat.START)){
            binding.drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}