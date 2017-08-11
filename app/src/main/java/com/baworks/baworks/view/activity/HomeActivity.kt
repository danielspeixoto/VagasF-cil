package com.baworks.baworks.view.activity

import android.os.Bundle
import org.jetbrains.anko.support.v4.viewPager
import android.support.v4.view.ViewPager
import android.annotation.SuppressLint
import org.jetbrains.anko.appcompat.v7.toolbar
import android.support.design.widget.TabLayout
import android.support.v7.widget.Toolbar
import com.baworks.baworks.view.fragments.TabsPagerAdapter
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.tabLayout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.topPadding
import org.jetbrains.anko.wrapContent

/**
 * Created by daniel on 8/10/17.
 */
class HomeActivity : BaseActivity() {

    private var mViewPager: ViewPager? = null
    lateinit var bar : Toolbar
    lateinit var tab : TabLayout

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        coordinatorLayout {
            appBarLayout {
                bar = toolbar {

                }.lparams(width = matchParent)
                tab = tabLayout {

                }.lparams(width = matchParent)

            }.lparams(width = matchParent, height = wrapContent)
            mViewPager = viewPager {
                id = 12341
                topPadding = 350
            }.lparams(matchParent, matchParent)
        }

        setSupportActionBar(bar)

       tab.setupWithViewPager(mViewPager)
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.

        // Set up the ViewPager with the sections adapter.
        mViewPager!!.adapter = TabsPagerAdapter(supportFragmentManager)
        tab.getTabAt(1)!!.setIcon(android.R.drawable.ic_dialog_email)
//          +  for (i in 0..tab.getTabCount() - 1) {
//            tab.getTabAt(i)!!.setIcon(R.drawable.web_hi_res_512)
//        }
        mViewPager!!.setCurrentItem(0)
    }


}