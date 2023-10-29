package com.example.activity_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity_20231029.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}