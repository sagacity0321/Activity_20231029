package com.example.activity_20231029

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.activity_20231029.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)

        val receivedMessage = intent.getStringExtra("message")

        // int는 자바의 기본형 변수. 첨부 안 될때를 대비해 기본값 설정
        val receivedNumber = intent.getIntExtra("number", -1)

        binding.txtMessage.text = "전달 문구: ${receivedMessage}\n전달 숫자: ${receivedNumber}"

    }

}