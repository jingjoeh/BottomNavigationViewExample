package com.jingjoeh.bottomnavigationviewexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_recent -> {
                    textView.text = "Recent"
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.item_favorite -> {
                    textView.text = "Favorite"
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.item_nearby -> {
                    textView.text = "Nearby"
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }

        bottomNavigationView.setOnNavigationItemReselectedListener {
            Toast.makeText(this, "${it.title} is Reselected", Toast.LENGTH_SHORT).show()
        }

        // select item
        bottomNavigationView.selectedItemId = R.id.item_favorite
    }

}
