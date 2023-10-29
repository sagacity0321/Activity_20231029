package com.example.activity_20231029

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.activity_20231029.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        binding.btnReturn.setOnClickListener{
            finish()
        }
    }
}