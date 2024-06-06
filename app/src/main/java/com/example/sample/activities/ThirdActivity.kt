package com.example.sample.activities
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sample.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)
        val firstTextView3 : TextView = findViewById(R.id.third_activity_text1)
        val secondTextView3 : TextView = findViewById(R.id.third_activity_text2)
        val firstButton3 : Button = findViewById(R.id.third_activity_button1)
        firstButton3.setOnClickListener {
            val intent = Intent(this, FirstActivity :: class.java)
            startActivity(intent)
        }
    }


}