package com.example.khatabook2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khatabook2.databinding.ActivityExpenseBinding

class Income : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_income)
        var binding=ActivityExpenseBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}