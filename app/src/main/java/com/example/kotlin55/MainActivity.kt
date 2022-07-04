package com.example.kotlin55

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin55.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     lateinit var binding: ActivityMainBinding
     lateinit var car: Cars
     lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClick();
        initTosts();
        initIntent();
    }

    private fun initTosts() {
        binding.tayotaBtnTost.setOnClickListener {
            if (car == Cars.TAYOTA) {
                Toast.makeText(applicationContext, "Правильно!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Не верно", Toast.LENGTH_SHORT).show()
            }
        }

        binding.mustangBtnTost.setOnClickListener {
            if (car == Cars.MUSTANG) {
                Toast.makeText(applicationContext, "Правильно!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Не верно", Toast.LENGTH_SHORT).show()
            }
        }

        binding.lamboBtnTost.setOnClickListener {
            if (car == Cars.LAMBO) {
                Toast.makeText(applicationContext, "Правильно!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Не верно", Toast.LENGTH_SHORT).show()
            }
        }
        binding.gelikBtnTost.setOnClickListener {
            if (car == Cars.GELIK) {
                Toast.makeText(applicationContext, "Правильно!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Не верно", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun initClick() {
        binding.gelikBtn.setOnClickListener {
            binding.animalImg.setImageResource(R.drawable.gelik)
            car = Cars.GELIK

        }

        binding.lamboBtn.setOnClickListener {
            binding.animalImg.setImageResource(R.drawable.lambo)
            car = Cars.LAMBO
        }

        binding.mustangBtn.setOnClickListener {
            binding.animalImg.setImageResource(R.drawable.mustang)
            car = Cars.MUSTANG
        }
        binding.tayotaBtn.setOnClickListener {
            binding.animalImg.setImageResource(R.drawable.tayota)
            car = Cars.TAYOTA
        }
    }

    private fun initIntent() {
        binding.btnSave.setOnClickListener {
            val intent = Intent(this, CarActivity::class.java)
            when (car) {
                Cars.MUSTANG -> name = "mustang"
                Cars.LAMBO -> name = "Lambo"
                Cars.TAYOTA -> name = "Tayota"
                Cars.GELIK -> name = "Gelik"
            }
            intent. putExtra("name", name)
            startActivity(intent)
        }
    }
}
