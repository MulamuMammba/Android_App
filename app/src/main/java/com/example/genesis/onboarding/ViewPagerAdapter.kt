package com.example.genesis.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle

class ViewPagerAdapter (
    list: ArrayList<Fragment>,
    fm : FragmentManager,
    lifecycle: Lifecycle)
    : FragmentManager(){

      private val fragmentList = list

    fun getItemCount(): Int{
        return fragmentList.size
    }

    fun createFragment(position:Int): Fragment {
       return fragmentList[position]
    }
}