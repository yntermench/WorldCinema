package com.example.worldcinema1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Patch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patch)
    }

    fun back(view: View) {
        var intent = Intent(this@Patch, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}