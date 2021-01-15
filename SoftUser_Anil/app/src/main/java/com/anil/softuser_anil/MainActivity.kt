package com.anil.softuser_anil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etusername: EditText
    private lateinit var etpassword: EditText
    private lateinit var btnlogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etusername = findViewById(R.id.etUsername)
        etpassword = findViewById(R.id.etPassword)
        btnlogin = findViewById(R.id.btnLogin)

        val loginUsername = "anil"
        val loginpassword = "anil123"

        btnlogin.setOnClickListener {
            if (etusername.text.toString() == loginUsername && etpassword.text.toString() == loginpassword) {
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "You enter wrong loginUsername or loginpassword", Toast.LENGTH_LONG).show()
            }

        }

    }
}