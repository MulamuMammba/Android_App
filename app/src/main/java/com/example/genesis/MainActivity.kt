package com.example.genesis

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Sign in verification
        val user = findViewById<EditText>(R.id.user)
        val password = findViewById<EditText>(R.id.password)
        val button = findViewById<Button>(R.id.sign_in_btn)

        val x = "Mammba"
        val y = "Overread31"


            button.setOnClickListener{
                val user_validate = user.text.toString().trim()
                val password_validate = password.text.toString().trim()

                if (user_validate.isEmpty() && password_validate.isEmpty()){
                    user.error = "Username Required"
                    password.error = "Password Required"
                }
                else if (user_validate.isEmpty()){
                    user.error = "Username Required"
                }
                else if(password_validate.isEmpty()){
                    password.error = "Password Required"
                }
                else{
                    if (user_validate == x && password_validate == y){
                        val intent = Intent(this, dashboard::class.java)
                        startActivity(intent)
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