package com.example.worldcinema1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timer = object : CountDownTimer(8000, 1000){
            override fun onTick(millisUntilFinished: Long){

            }

            override fun onFinish() {
                var intent = Intent(this@MainActivity, Signin::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}