package com.pico.ogoshi.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText=findViewById<EditText>(R.id.editText)
        val tedtView=findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            if (editText.text!=null){
                tedtView.text=editText.text.toString()
            }
        }
    }
}