package com.example.testapp_2
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp_2.R.id.first_activity_button2


class FirstActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_activity)
        val firstTextView1 : TextView = findViewById(R.id.first_activity_text1)
        val secondTextView1 : TextView = findViewById(R.id.first_activity_text2)
        val firstButton1 : Button = findViewById(R.id.first_activity_button1)
        val secondButton1 : Button = findViewById(first_activity_button2)
        firstButton1.setOnClickListener {
            val intent = Intent(this, SecondActivity :: class.java)
            startActivity(intent)
        }
        secondButton1.setOnClickListener {
            val intent = Intent(this, ThirdActivity :: class.java)
            startActivity(intent)
        }
    }
}