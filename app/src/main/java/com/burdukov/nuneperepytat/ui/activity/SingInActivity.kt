package com.burdukov.nuneperepytat.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.burdukov.nuneperepytat.R

class SingInActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_sing_in)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }



        fun signIn(view: View){
            val emailText=email.text.toString()
            val passwordText=password.text.toString()
            if(emailText.isNotEmpty() && passwordText.isNotEmpty())
            {
                val intent = Intent(this@SingInActivity,MenuActivity::class.java)
                intent.putExtra("key","$emailText")
                startActivity(intent)



            }
            else{
                Toast.makeText(this, "У вас есть не заполниные поля ", Toast.LENGTH_SHORT).show()

            }
        }


}