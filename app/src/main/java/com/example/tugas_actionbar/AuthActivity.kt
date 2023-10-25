package com.example.tugas_actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tugas_actionbar.databinding.ActivityAuthBinding
import com.google.android.material.tabs.TabLayoutMediator


class AuthActivity : AppCompatActivity() {

    lateinit var mediator: TabLayoutMediator
    lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAuthBinding.inflate(layoutInflater)
        title = "Dashboard"
        setContentView(binding.root)
        supportActionBar?.hide()

        viewPager2 = binding.authViewPager

        viewPager2.adapter = AuthTabAdapter(supportFragmentManager, this@AuthActivity.lifecycle)
        mediator = TabLayoutMediator(binding.authTabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> tab.text = "Register"
                1 -> tab.text = "Log In"
            }
        }
        mediator.attach()
    }
}