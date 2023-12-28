package com.mandiri.mandiriapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mandiri.mandiriapps.databinding.ActivityHomeBinding

class HomeActivity: AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}