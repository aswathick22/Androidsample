package com.example.testapp_2
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val firstTextView2 : TextView = findViewById(R.id.second_activity_text1)
        val secondTextView2 : TextView = findViewById(R.id.second_activity_text2)
        val firstButton2 : Button = findViewById(R.id.second_activity_button1)
        firstButton2.setOnClickListener {
            val intent = Intent(this, FirstActivity :: class.java)
            startActivity(intent)
        }
    }
}