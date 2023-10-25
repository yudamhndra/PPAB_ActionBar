package com.example.tugas_actionbar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(fm : FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fm, lifecycle) {
    val page = arrayOf<Fragment>(HomeFragment(), AssignmentFragment())
    override fun getItemCount(): Int {
        return page.size
    }

    override fun createFragment(position: Int): Fragment {
        return page[position]
    }
}