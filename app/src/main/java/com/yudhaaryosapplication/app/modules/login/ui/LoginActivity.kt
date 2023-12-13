package com.yudhaaryosapplication.app.modules.login.ui

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.yudhaaryosapplication.app.MainActivity
import com.yudhaaryosapplication.app.databinding.ActivityLoginBinding

import com.yudhaaryosapplication.app.modules.iphone8four.ui.FutsalActivity
import com.yudhaaryosapplication.app.modules.maps1.ui.BerandaActivity
import com.yudhaaryosapplication.app.modules.register.ui.RegisterActivity

class LoginActivity : AppCompatActivity() {


    lateinit var binding: ActivityLoginBinding
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.tvToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
         val email = binding.edtEmailLogin.text.toString()
            val password = binding.edtPasswordLogin.text.toString()

            if(email.isEmpty()){
                binding.edtEmailLogin.error = "Email Harus Diisi"
                binding.edtEmailLogin.requestFocus()
                return@setOnClickListener
            }
            if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.edtEmailLogin.error = "Email Tidak Valid"
                binding.edtEmailLogin.requestFocus()
                return@setOnClickListener
            }
            if(password.isEmpty()){
                binding.edtPasswordLogin.error = "Password Harus Diisi"
                binding.edtPasswordLogin.requestFocus()
                return@setOnClickListener
            }
            LoginFirebase(email,password)
        }
    }
    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Selamat datang $email", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MainActivity::class.java)
                    startActivity(intent)
                } else{
                    Toast.makeText(this, "${it .exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }

    }

//    private fun AppCompatActivity.onCreate(root: View) {
//
//    }
//
//    companion object {
//        fun getIntent(registerActivity: RegisterActivity, nothing: Nothing?) {
//
//
//        }
//    }
}