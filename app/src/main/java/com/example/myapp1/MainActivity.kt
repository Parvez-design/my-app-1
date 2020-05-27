package com.example.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<EditText>(R.id.username)
        val passwordAuthentication = findViewById<EditText>(R.id.password)
        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            val uname = username.text.toString()
            val passwd = passwordAuthentication.text.toString()

            if (uname == "testusername" && passwd == "testpassword") {
                val snackbar = Snackbar.make(it, "Login Success", Snackbar.LENGTH_LONG)
                snackbar.setAction("Ok") { println("Successfully done") }
                snackbar.show()
            } else {
                val snackbar = Snackbar.make(it, "username/password is wrong", Snackbar.LENGTH_LONG)
                snackbar.show()
            }
        }
    }

}

