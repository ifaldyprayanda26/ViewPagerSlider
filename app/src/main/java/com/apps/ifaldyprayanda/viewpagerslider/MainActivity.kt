package com.apps.ifaldyprayanda.viewpagerslider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.apps.ifaldyprayanda.viewpagerslider.Adapter.ViewPagerAdapter
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init
        init()
    }

    private fun init() {
        view_pager.adapter = ViewPagerAdapter(this@MainActivity)
        TabLayoutMediator(tab_dots, view_pager, TabLayoutMediator.TabConfigurationStrategy({ tab, position ->
            //Set Something for tab liek set text
         })).attach()
        view_pager.registerOnPageChangeCallback(object:ViewPager2.OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Snackbar.make(parent_view, "Page" + (position+1) + "Selected", Snackbar.LENGTH_SHORT).show()
            }
        })
    }


}
