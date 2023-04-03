package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_2, MainFragment())
            .commit()
        binding.frag1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_2, MainFragment())
                .commit()
        }
        binding.frag2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_2, ReelsFragment())
                .commit()
        }
        binding.frag3.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_2, MessageFragment())
                .commit()
        }
        binding.frag4.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_2, SettingsFragment())
                .commit()
        }

    }
}