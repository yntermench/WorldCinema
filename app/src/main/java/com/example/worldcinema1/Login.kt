package com.example.worldcinema1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class Login : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var surname:EditText
    lateinit var mail:EditText
    lateinit var pass:EditText
    lateinit var passRepeat:EditText

    val pattern=("[a-z]{1,100}" + "@" + "[a-z]{1,6}"+"\\."+"[a-z]{1,5}")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        name=findViewById(R.id.nameText)
        surname=findViewById(R.id.surnameText)
        mail=findViewById(R.id.mailText)
        pass=findViewById(R.id.passText)
        passRepeat=findViewById(R.id.passRepeatText)
    }

    fun emailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()
    }

    fun register(view: View) {
        if (name.text.toString().isNotEmpty()&&surname.text.toString().isNotEmpty()&&
            mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()
            &&passRepeat.text.toString().isNotEmpty()){
            if(emailValid(mail.text.toString())){
                Toast.makeText(this, "Регистрация прошла успешно", Toast.LENGTH_LONG)
                    .show()
                val intent = Intent(this@Login, Patch::class.java)
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
    fun haveAcc(view: View) {
        var inten = Intent(this@Login, Signin::class.java)
        startActivity(inten)
        finish()
    }
    }
}