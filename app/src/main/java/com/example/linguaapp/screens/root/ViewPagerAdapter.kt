package com.example.linguaapp.screens.root

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.linguaapp.screens.personal.PersonalFragment
import com.example.linguaapp.screens.search.SearchFragment
import com.example.linguaapp.screens.start.StartFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> StartFragment()
            1 -> SearchFragment()
            else -> PersonalFragment()
        }
    }
}