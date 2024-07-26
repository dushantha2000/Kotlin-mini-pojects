package com.example.bankapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.bankcal.R

class MainActivity : AppCompatActivity() {
     lateinit var entBalance: EditText
     lateinit var intRate: EditText
     lateinit var calculateButton: Button
     lateinit var resultTextView: TextView
     lateinit var btnClear:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        entBalance = findViewById(R.id.ent_balance)
        intRate = findViewById(R.id.int_rate)
        calculateButton = findViewById(R.id.cal_button)
        resultTextView = findViewById(R.id.amount)

        btnClear.setOnClickListener(View.OnClickListener {

            entBalance.setText("")
            intRate.setText("")
            resultTextView.setText("")
        })



        calculateButton.setOnClickListener {

            val balance = entBalance.text.toString().toDoubleOrNull()
            val rate = intRate.text.toString().toDoubleOrNull()


            if (balance != null && rate != null) {

                val interest = balance * rate / 100


                resultTextView.text = "Interest: $interest"
            } else {

                resultTextView.text = "Please enter valid numbers"
            }
        }
    }
}
