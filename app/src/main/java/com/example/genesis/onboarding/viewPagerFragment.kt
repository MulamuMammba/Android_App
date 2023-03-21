package com.example.genesis.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import com.example.genesis.R
import com.example.genesis.onboarding.screens.screen_one
import com.example.genesis.onboarding.screens.screen_three
import com.example.genesis.onboarding.screens.screen_two

class viewPagerFragment(
    fragmentList: ArrayList<Fragment>,
    supportFragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            screen_one(),
            screen_two(),
            screen_three()
        )

        val adapter = viewPagerFragment(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        return view
    }
}