package com.example.wilsonmungaimuguthi_mapd711_assignment2_coffeeonline

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.add
import androidx.fragment.app.commit


class Order : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)


        val ButtonOpen: Button = findViewById(R.id.americano_btn)
        val ButtonOpen1: Button = findViewById(R.id.latte_btn)
        val ButtonOpen2: Button = findViewById(R.id.cappuccino_btn)
        val ButtonOpen3: Button = findViewById(R.id.macchiato_btn)

        ButtonOpen.setOnClickListener {
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<CofffeeSize>(R.id.SelectSize_fcv)
                }
            }
        }
        ButtonOpen1.setOnClickListener {
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<CofffeeSize>(R.id.SelectSize_fcv)
                }
            }
        }
        ButtonOpen2.setOnClickListener {
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<CofffeeSize>(R.id.SelectSize_fcv)
                }
            }
        }
        ButtonOpen3.setOnClickListener {
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<CofffeeSize>(R.id.SelectSize_fcv)
                }
            }
        }

       /* val radioGroup = findViewById<RadioGroup>(R.id.radio_group)
        radioGroup.setOnCheckedChangeListener() { group, checkedid ->
            val radioButton = findViewById<RadioButton>(checkedid)

                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    add<Options>(R.id.Options_fcv)
                }
            }*/
        // Continue button to pay activity click listener//
        val buttonClick = findViewById<Button>(R.id.order_continue_btn)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Pay::class.java)
            startActivity(intent)

        }
    }
}






