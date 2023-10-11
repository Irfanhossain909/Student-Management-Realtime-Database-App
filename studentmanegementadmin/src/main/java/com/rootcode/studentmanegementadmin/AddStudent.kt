package com.rootcode.studentmanegementadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.rootcode.studentmanegementadmin.databinding.ActivityAddStudentBinding
import com.rootcode.studentmanegementadmin.databinding.ActivityMainBinding

class AddStudent : AppCompatActivity() {
    val binding by lazy {
        ActivityAddStudentBinding.inflate(layoutInflater)
    }
    private lateinit var database:DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addStudentSaveBtn.setOnClickListener {
            val batch = binding.AddBatchEtxt.text.toString()
            val name = binding.AddNameEtxt.text.toString()
            val email = binding.AddEmailEtxt.text.toString()
            val phone = binding.AddPhoneEtxt.text.toString()
            val subject = binding.AddSubjectEtxt.text.toString()

            database = FirebaseDatabase.getInstance().getReference("Students")

            val student = Student(batch,name,email,phone,subject)

            database.child(name+phone).setValue(student)
                .addOnSuccessListener {
                     binding.AddBatchEtxt.text?.clear()
                     binding.AddNameEtxt.text?.clear()
                     binding.AddEmailEtxt.text?.clear()
                     binding.AddPhoneEtxt.text?.clear()
                     binding.AddSubjectEtxt.text?.clear()

                    Toast.makeText(this@AddStudent,"Saved",Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener{
                    Toast.makeText(this@AddStudent,"Failed",Toast.LENGTH_SHORT).show()
                }
        }

    }
}