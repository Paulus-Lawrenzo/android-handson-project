package com.mandiri.mandiriapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mandiri.mandiriapps.databinding.ActivityMainBinding
import com.mandiri.mandiriapps.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        check()
    }

    private fun check() {
        with(binding) {
            val nameValue = etName.text
            val ageValue = etAge.text
            val addressValue = etAddress.text
            val genderValue = etGender.text
            binding.btnRegister.setOnClickListener {
                if (nameValue.isEmpty() || ageValue.isEmpty() || addressValue.isEmpty() || genderValue.isEmpty()) {
                    Toast.makeText(
                        this@RegisterActivity,
                        "Please Fill The Data",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    Toast.makeText(
                        this@RegisterActivity,
                        "Successfully Register",
                        Toast.LENGTH_SHORT
                    ).show()
                    val intent = Intent(this@RegisterActivity, ProfileActivity::class.java)
                    intent.putExtra(KEY_NAME_VALUE, nameValue.toString())
                    intent.putExtra(KEY_AGE_VALUE, ageValue.toString())
                    intent.putExtra(KEY_ADDRESS_VALUE, addressValue.toString())
                    intent.putExtra(KEY_GENDER_VALUE, genderValue.toString())
                    navigate(intent)
                }
            }
        }
    }

    companion object {
        const val KEY_NAME_VALUE = "key_name_value"
        const val KEY_AGE_VALUE = "key_age_value"
        const val KEY_ADDRESS_VALUE = "key_address_value"
        const val KEY_GENDER_VALUE = "key_gender_value"
    }

    private fun navigate(intent: Intent) {
        startActivity(intent)
        finish()
    }
}