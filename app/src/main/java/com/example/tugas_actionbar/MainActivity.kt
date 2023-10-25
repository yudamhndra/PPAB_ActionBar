package com.example.tugas_actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tugas_actionbar.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var mediator: TabLayoutMediator
    lateinit var viewPager2:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        title = "Dashboard"
        setContentView(binding.root)
        with(binding){
            viewPager2 = viewPager
            viewPager.adapter = TabAdapter(supportFragmentManager, this@MainActivity.lifecycle)
            mediator = TabLayoutMediator(tabLayout, viewPager)
            {tab,position ->
                when(position){
                    0->tab.text = "Home"
                    1->tab.text = "Quiz"
                    2->tab.text = "Assignment"
                }
            }
            mediator.attach()
        }
    }
}
