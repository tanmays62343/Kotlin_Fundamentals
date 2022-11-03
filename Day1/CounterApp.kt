package com.TrX.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.MyButton)
        val btnClickMe2 = findViewById<Button>(R.id.Mybutton2)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesclicked = 0;

        btnClickMe.setOnClickListener {
            timesclicked +=1
            tvMyTextView.text = timesclicked.toString()
        }

        btnClickMe2.setOnClickListener {
            timesclicked=0
            tvMyTextView.text=timesclicked.toString()
        }

    }
}
