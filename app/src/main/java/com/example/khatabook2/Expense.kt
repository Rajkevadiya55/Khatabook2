package com.example.khatabook2

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khatabook2.Database.Database
import com.example.khatabook2.databinding.ActivityExpenseBinding

class Expense : AppCompatActivity() {
    lateinit var database: Database


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense)
        var binding=ActivityExpenseBinding.inflate(layoutInflater)
        setContentView(binding.root)


        database= Database(applicationContext)

        binding.save.setOnClickListener {

            database.addData(
                binding.exnumber.text.toString().toInt()

            )
        }
    }
}