package com.serapercel.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    /*  ----- FRAGMENT -----
    Activity moduler bolumudur
    Bir Activity birden fazla fragment calistirabilir
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}