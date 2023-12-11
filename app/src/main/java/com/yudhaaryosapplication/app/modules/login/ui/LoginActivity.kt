package com.yudhaaryosapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.base.BaseActivity
import com.yudhaaryosapplication.app.databinding.ActivityLoginBinding
import com.yudhaaryosapplication.app.databinding.ActivityRegisterBinding
import com.yudhaaryosapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.yudhaaryosapplication.app.modules.maps1.ui.Maps1Activity
import com.yudhaaryosapplication.app.modules.register.ui.RegisterActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : AppCompatActivity() {


    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding.tvToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
        }


    }

    private fun AppCompatActivity.onCreate(root: View) {

    }

    companion object {
        fun getIntent(registerActivity: RegisterActivity, nothing: Nothing?) {


        }
    }
}