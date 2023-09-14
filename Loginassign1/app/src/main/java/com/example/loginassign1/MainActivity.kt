package com.example.loginassign1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            if(editTextTextPassword.text.isNullOrBlank()&&editTextTextPersonName.text.isNullOrBlank()){
                Toast.makeText(this, "Please fill the login details", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Logged in!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}