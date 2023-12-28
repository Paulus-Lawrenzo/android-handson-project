package com.mandiri.mandiriapps

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mandiri.mandiriapps.RegisterActivity.Companion.KEY_ADDRESS_VALUE
import com.mandiri.mandiriapps.RegisterActivity.Companion.KEY_AGE_VALUE
import com.mandiri.mandiriapps.RegisterActivity.Companion.KEY_GENDER_VALUE
import com.mandiri.mandiriapps.RegisterActivity.Companion.KEY_NAME_VALUE
import com.mandiri.mandiriapps.databinding.ActivityHomeBinding
import com.mandiri.mandiriapps.databinding.ActivityProfileBinding
import org.w3c.dom.Text

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var name = intent.getStringExtra(KEY_NAME_VALUE)
        var age = intent.getStringExtra(KEY_AGE_VALUE)
        var address = intent.getStringExtra(KEY_ADDRESS_VALUE)
        var gender = intent.getStringExtra(KEY_GENDER_VALUE)
        binding.etName.text = name
        binding.etAge.text = age
        binding.etAddress.text = address
        binding.etGender.text = gender

//        val name = intent.getStringExtra(KEY_NAME_VALUE)
//        binding.tvName.text = name

//        val imageProfile = findViewById<ImageView>(R.id.imageProfile)
//        val textName = findViewById<TextView>(R.id.textName)
//        val textEmail = findViewById<TextView>(R.id.textEmail)
//        val textPhone = findViewById<TextView>(R.id.textPhone)
//        val textAddress = findViewById<TextView>(R.id.textAddress)
//        val textBirthdate = findViewById<TextView>(R.id.textBirthdate)
//
//        textName.text = "Paulus"
//        textEmail.text = "paulus.martuatambunan@gmail.com"
//        textPhone.text = "082378362738"
//        textAddress.text = "Medan"
//        textBirthdate.text = "2001-06-08"
//        imageProfile.setImageResource(R.drawable.yinyang)
//    }
    }
}