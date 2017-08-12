package com.baworks.baworks.view.fragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


/**
 * Created by daniel on 8/11/17.
 */
class TabsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(index: Int): Fragment? {

        when (index) {
            2 -> return VagaFragment()
            3 -> return ProfileFragment()
        }
        return EmptyFragment()
    }

    override fun getCount(): Int {
        // get item count - equal to number of tabs
        return 4
    }

}