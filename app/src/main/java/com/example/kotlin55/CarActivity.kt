package com.example.kotlin55

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin55.databinding.ActivityCarBinding

class CarActivity : AppCompatActivity() {
    lateinit var binding: ActivityCarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_car)

        var name = intent.getStringExtra("name")
        binding.textView.text = name
    }
}