package com.example.genesis

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.user)
        val password = findViewById<EditText>(R.id.password)
        val button = findViewById<Button>(R.id.sign_in_btn)
        val exit = findViewById<View>(R.id.back_btn_main)

        //Exit
        exit.setOnClickListener {
            System.exit(0)
        }

        //Sign in verification
        val x = "Mammba"
        val y = "Overread31"

        //Sign up button functionality
            button.setOnClickListener{

                if (user.text.toString().isEmpty() && password.text.toString().isEmpty()){
                    user.error = "Username Required"
                    password.error = "Password Required"
                }
                else if (user.text.toString().isEmpty()){
                    user.error = "Username Required"
                }
                else if(password.text.toString().isEmpty()){
                    password.error = "Password Required"
                }
                else{
                    if (user.text.toString() == x && password.text.toString() == y){
                        val intent = Intent(this, dashboard::class.java)
                        startActivity(intent)
                        finish()
                        Toast.makeText(this, "Validation Completed", Toast.LENGTH_SHORT).show()
                    }
                    else{

                            user.setText("")
                            password.setText("")
                            user.error = "Incorrect Username or Password"
                            password.error = "Incorrect Username or Password"

                    }

                }

            }


    }
}