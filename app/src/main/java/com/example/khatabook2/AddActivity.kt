package com.example.khatabook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khatabook2.databinding.ActivityAdd2Binding

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add2)
        var binding = ActivityAdd2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.icAdd.setOnClickListener {

            intent =Intent(applicationContext, Income::class.java)
            startActivity(intent)
        }

        binding.icRemove.setOnClickListener {

            intent=Intent(applicationContext,Expense::class.java)
            startActivity(intent)
        }
    }
}