package com.example.kotlinbasicsconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlinbasicsconcepts.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setText("Sign in")
        binding.button2.setOnClickListener {
            Toast.makeText(applicationContext,"I am awesome",Toast.LENGTH_LONG).show()
        }

    }
}