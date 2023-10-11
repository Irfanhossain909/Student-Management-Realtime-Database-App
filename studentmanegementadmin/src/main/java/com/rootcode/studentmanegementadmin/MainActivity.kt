package com.rootcode.studentmanegementadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rootcode.studentmanegementadmin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addstudentBtn.setOnClickListener {

        }
    }
}