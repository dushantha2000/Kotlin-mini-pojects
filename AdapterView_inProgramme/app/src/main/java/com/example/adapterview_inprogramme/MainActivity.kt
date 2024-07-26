package com.example.adapterview_inprogramme

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var cmdCities:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        cmdCities=findViewById(R.id.cmdCity)
        val cities : Array<String> = arrayOf("kandy","Mathale", "colombo",)
        val adater : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_item,cities)

        //populate the spinner using entries available in adapter
        cmdCities.adapter=adater
    }
}