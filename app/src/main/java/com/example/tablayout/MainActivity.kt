package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tablayout = findViewById<TabLayout>(R.id.tablayout)
        val viewPager = findViewById<ViewPager2>(R.id.viewpager)

        val list = listOf<String>("Calls","Chats","Stories","Profile")
        val adapter = ViewPagerAdapter(list)
        viewPager.adapter = adapter

        TabLayoutMediator(tablayout,viewPager){tab,pos->
            tab.text  = list[pos]
        }.attach()




    }
}