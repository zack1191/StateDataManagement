package com.hha.statedatamanagement

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.hha.statedatamanagement.databinding.ActivityMainBinding
import com.hha.statedatamanagement.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity()
{

    private lateinit var binding : ActivityRegisterBinding

    companion object
    {
        fun newIntent(context : Context) : Intent
        {
            return Intent(context, RegisterActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.apply {
            btnCreate.setOnClickListener {
                if (TextUtils.isEmpty(etFirstName.text.toString()) || TextUtils.isEmpty(etLastName.text.toString()) || TextUtils.isEmpty(etEmail.text.toString()) || TextUtils.isEmpty(etDob.text.toString()) || TextUtils.isEmpty(etNationality.text.toString()) || TextUtils.isEmpty(etCountry.text.toString()))
                {
                    Toast.makeText(applicationContext, "Some data are needed to fill!", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    Toast.makeText(applicationContext, "Account created!", Toast.LENGTH_SHORT).show()

                }
            }

            btnBack.setOnClickListener {
                onBackPressed()
            }

        }
    }
}