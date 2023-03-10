package com.example.sumoftwonumbers

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)

        imageButton.setOnClickListener{
            if (num1.text.toString().isEmpty() || num2.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter Both Numbers",Toast.LENGTH_SHORT).show()
            }
            else{
                val num1 = Integer.parseInt(num1.text.toString())
                val num2 = Integer.parseInt(num2.text.toString())

                Toast.makeText(applicationContext,"Sum Of The Numbers is: "+(num1 + num2),Toast.LENGTH_SHORT).show()


            }
        }
        imageButton2.setOnClickListener{
            if (num1.text.toString().isEmpty() || num2.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Enter Both Numbers",Toast.LENGTH_SHORT).show()
            }
            else{
                val num1 = Integer.parseInt(num1.text.toString())
                val num2 = Integer.parseInt(num2.text.toString())

                Toast.makeText(applicationContext,"Multiplication Of The Numbers is : "+(num1 * num2),Toast.LENGTH_SHORT).show()


            }

        }


    }
}