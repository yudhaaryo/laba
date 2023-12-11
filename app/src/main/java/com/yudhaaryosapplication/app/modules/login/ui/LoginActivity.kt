package com.yudhaaryosapplication.app.modules.login.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yudhaaryosapplication.app.databinding.ActivityLoginBinding
import com.yudhaaryosapplication.app.modules.iphone8four.ui.FutsalActivity
import com.yudhaaryosapplication.app.modules.maps1.ui.BerandaActivity
import com.yudhaaryosapplication.app.modules.register.ui.RegisterActivity

class LoginActivity : AppCompatActivity() {


    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
        }


    }

    private fun AppCompatActivity.onCreate(root: View) {

    }

    companion object {
        fun getIntent(registerActivity: RegisterActivity, nothing: Nothing?) {


        }
    }
}