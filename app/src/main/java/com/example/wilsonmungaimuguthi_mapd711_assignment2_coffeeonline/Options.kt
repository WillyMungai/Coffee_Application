package com.example.wilsonmungaimuguthi_mapd711_assignment2_coffeeonline

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox

class Options : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_options, container, false)

        fun onCheckboxClicked(view: View) {
            if (view is CheckBox) {
                val checked: Boolean = view.isChecked

                when (view.id) {
                    R.id.checkbox_2_shots -> {
                        if (checked) {
                            // Put 2 shots
                        } else {
                            // Don't put 2 shots
                        }
                    }
                    R.id.checkbox_sugar -> {
                        if (checked) {
                            // Add sugar
                        } else {
                            // Don't add sugar
                        }
                    }
                }
            }
        }

    }

}