package com.rootcode.studentmanegementadmin

import android.content.Intent
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
            startActivity(Intent(this@MainActivity,AddStudent::class.java))
            finish()
        }
        binding.upstudentBtn.setOnClickListener {  }
        binding.deleteStudentBtn.setOnClickListener {  }
    }
}