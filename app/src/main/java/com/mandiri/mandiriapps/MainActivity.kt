package com.mandiri.mandiriapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import com.mandiri.mandiriapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        handleLogin(binding)
        handleRegister(binding)
    }

    private fun handleLogin(binding: ActivityMainBinding) {
//        val buttonLogin = findViewById<Button>(R.id.btnLogin)
//        val buttonRegister = findViewById<Button>(R.id.btnRegister)
//        val passwordInp = findViewById<EditText>(R.id.etPassword)
//        val wrongPassword = findViewById<TextView>(R.id.tvWrongPassword)
        val password = "password"

        binding.apply {
            btnLogin.setOnClickListener {
                tvWrongPassword.visibility = View.INVISIBLE

                if (etPassword.text.isEmpty()) {
                    Toast.makeText(applicationContext, "Password cannot be empty", Toast.LENGTH_SHORT).show()
                } else if (etPassword.text.toString() != password) {
                    Toast.makeText(applicationContext, "Wrong password sorry :(", Toast.LENGTH_SHORT).show()
                    tvWrongPassword.visibility =  View.VISIBLE
                } else {
                    Toast.makeText(applicationContext, "Welcome admin!", Toast.LENGTH_SHORT).show()
//                navigateToProfile()
                }
            }

            btnRegister.setOnClickListener {
                handleTo(RegisterActivity::class.java)
            }
        }
//        buttonLogin.setOnClickListener {
//            wrongPassword.visibility = View.INVISIBLE
//
//            if (passwordInp.text.isEmpty()) {
//                Toast.makeText(applicationContext, "Password cannot be empty", Toast.LENGTH_SHORT).show()
//            } else if (passwordInp.text.toString() != password) {
//                Toast.makeText(applicationContext, "Wrong password sorry :(", Toast.LENGTH_SHORT).show()
//                wrongPassword.visibility =  View.VISIBLE
//            } else {
//                Toast.makeText(applicationContext, "Welcome admin!", Toast.LENGTH_SHORT).show()
////                navigateToProfile()
//            }
//        }
//
//        buttonRegister.setOnClickListener {
//            handleTo(RegisterActivity::class.java)
//        }

    }

    private fun handleTo(clazz: Class<*>) {
        val intent = Intent(this, clazz)
        startActivity(intent)
    }

    private fun handleNavigation() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun handleRegister(binding: ActivityMainBinding) {
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun handleVisibility(view: View, isVisible: Boolean) {
        view.isVisible = isVisible
    }

//    private fun navigateToHome(home: Class<*>) {
//        val intent = Intent(this, home)
//        startActivity(intent)
//        finish()
//    }
//
//    private fun navigateToProfile(profile: Class<*>) {
//        val intent = Intent(this, profile)
//        startActivity(intent)
//        finish()
//    }
}


//    private val binding = ActivityMainBinding.inflate(layoutInflater)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val view = binding.root
//        setContentView(view)
//        handleLogin()
//    }
//
//    private fun handleNavigation(){
//        val intent = Intent(this, HomeActivity::class.java)
//        startActivity(intent)
//        finish()
//    }
//
//    private fun handleLogin(){
//        val text = binding.edtTxtPass.text
//        val btn = binding.btnSubmit
//        btn.setOnClickListener {
//            if(text.isEmpty()){
//                binding.stvErrorPass.visibility= View.VISIBLE
//                Toast.makeText(applicationContext,"harap isi password", Toast.LENGTH_SHORT).show()
//            }else if(text.toString()!="password123"){
//                binding.stvErrorPass.visibility= View.VISIBLE
//                Toast.makeText(applicationContext,"password salah", Toast.LENGTH_SHORT).show()
//            }else{
//                binding.stvErrorPass.visibility= View.GONE
//                Toast.makeText(applicationContext,"selamat anda berhasil login", Toast.LENGTH_SHORT).show()
//                handleNavigation()
//            }
//        }
//    }

//        val inputDefault = 5
//        val etInput = findViewById<EditText>(R.id.etInputNumber)
//        val etInputs = findViewById<EditText>(R.id.etInputNumbers)
//        val button = findViewById<Button>(R.id.btnSubmit)
//        val tvResult = findViewById<TextView>(R.id.tvResult)
//
//        button.setOnClickListener{
//            if (etInput.text.isNullOrEmpty()) {
//                Toast.makeText(applicationContext, "Please fill the blank", Toast.LENGTH_SHORT).show()
//            } else if(etInputs.text.isNullOrEmpty()) {
//                Toast.makeText(applicationContext, "Please fill the blank", Toast.LENGTH_SHORT).show()
//            } else {
//                val resultInput = etInput.text.toString().toInt() * etInputs.text.toString().toInt()
//                tvResult.text = resultInput.toString()
//            }
//
//        }