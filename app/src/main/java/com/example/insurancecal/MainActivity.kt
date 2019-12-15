package com.example.insurancecal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCal.setOnClickListener() {
            val totalPremium: Double = getPremium()

            idPremium.text = totalPremium.toString()
        }

        btnReset.setOnClickListener(){

            idAge.setSelection(0)

            radioGroup.clearCheck()

            idSmoker.isChecked = false
        }
    }

    fun getPremium (): Double {
        return when (idAge.selectedItemPosition) {
            0 -> 60.00
            1 -> 70.00 +
                    (if (idMale.isChecked) 50.00 else 0.00) +
                    (if (idSmoker.isChecked) 100.00 else 0.00)
            2 -> 90.00 +
                    (if (idMale.isChecked) 100.00 else 0.00) +
                    (if (idSmoker.isChecked) 150.00 else 0.00)
            3 -> 120.00 +
                    (if (idMale.isChecked) 150.00 else 0.00) +
                    (if (idSmoker.isChecked) 200.00 else 0.00)
            4 -> 150.00 +
                    (if (idMale.isChecked) 200.00 else 0.00) +
                    (if (idSmoker.isChecked) 250.00 else 0.00)
            else -> 150.00 +
                    (if (idMale.isChecked) 200.00 else 0.00) +
                    (if (idSmoker.isChecked) 300.00 else 0.00)
        }
    }

}