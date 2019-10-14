package com.nasrmohammed.calapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        infoTextView.visibility = View.INVISIBLE


        calculateButton.setOnClickListener {
            // Bill
            var bill = billEditText.text.toString().toDouble()

            // Tip Percentage
            var tipPercentage = tipEditText.text.toString().toDouble()

            // Tip
            var tip = (tipPercentage * bill) / 100
            // Total
            var total = tip + bill

            infoTextView.visibility = View.VISIBLE


            infoTextView.text = "Tip: ${doubleToDollar(tip) } Total: ${doubleToDollar(total)} "
        }
    }

    fun doubleToDollar(number:Double): String {
        return "$" + String.format("%.2f", number)
    }
}
