package com.example.worldcinema1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

lateinit var mail:EditText
lateinit var pass:EditText

val pattern=("[a-z]{1,100}" + "@" + "[a-z]{1,6}"+"\\."+"[a-z]{1,5}")

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        mail=findViewById(R.id.mailText)
        pass=findViewById(R.id.passText)
    }

    fun emailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()
    }

    fun next(view: View) {
        if (mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()){
            if(emailValid(mail.text.toString())){
                val intent = Intent(this@Signin, Patch::class.java)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this, "ошибка при заполнении поля email",
                    Toast.LENGTH_LONG).show()
            }
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Заполните текстовые поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }

    fun next2(view: View) {
        var inten = Intent(this@Signin, Login::class.java)
        startActivity(inten)
        finish()
    }
}