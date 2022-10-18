package com.example.wilsonmungaimuguthi_mapd711_assignment2_coffeeonline

import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ButtonOpen : Button = findViewById(R.id.americano_btn)
        ButtonOpen.setOnClickListener {
            val myFragment = SelectSize()
            val fragment : Fragment? =
                supportFragmentManager.findFragmentByTag(SelectSize::class.java.simpleName)
            if (fragment !is SelectSize) {
                supportFragmentManager.beginTransaction()
                    .add(R.id.SelectSize_fcv, myFragment, SelectSize::class.java.simpleName)
                    .commit()
            }
        }

    }
}