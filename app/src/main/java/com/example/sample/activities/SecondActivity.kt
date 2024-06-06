package com.example.sample.activities
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sample.R

class SecondActivity : AppCompatActivity() {

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