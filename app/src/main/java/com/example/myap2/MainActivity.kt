package com.example.myap2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.one)

        val button = findViewById<Button>(R.id.but_1)
        val editText1 = findViewById<EditText>(R.id.ed_1)
        val editText2 = findViewById<EditText>(R.id.ed_2)
        val editText3 = findViewById<EditText>(R.id.ed_3)
        val textView6 = findViewById<TextView>(R.id.tv_6)
        val textView7 = findViewById<TextView>(R.id.tv_7)

        button.setOnClickListener({
            textView6.text = editText1.text.toString()
            textView7.text = editText2.text.toString()

            Toast.makeText(this, "${editText3.text}", Toast.LENGTH_LONG).show()

        })

    }
}