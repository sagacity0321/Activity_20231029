package com.example.activity_20231029

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.activity_20231029.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnMoveToSecond.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }

        binding.btnMoveToThird.setOnClickListener {
            val myIntent = Intent(this, ThirdActivity::class.java)

// send message
            val inputMessage = binding.etMessage.text.toString()
            myIntent.putExtra("message", inputMessage)

            // send number
            val inputNumber = binding.etNumber.text.toString().toInt()
            myIntent.putExtra("number", inputNumber) // name 중복 안되면 몇 개든 전송 가능

            // call feat phone number
            binding.btnDial.setOnClickListener {
                val phoneNumber = binding.etPhoneNumber.text.toString()
                val myUri = Uri.parse("tel:${phoneNumber}")
                val myIntent = Intent(Intent.ACTION_DIAL, myUri)
                startActivity(myIntent)

            }

            startActivity(myIntent)
        }


    }
}