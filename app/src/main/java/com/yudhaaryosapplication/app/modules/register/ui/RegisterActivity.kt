package com.yudhaaryosapplication.app.modules.register.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.base.BaseActivity
import com.yudhaaryosapplication.app.appcomponents.googleauth.GoogleHelper
import com.yudhaaryosapplication.app.databinding.ActivityRegisterBinding
import com.yudhaaryosapplication.app.modules.login.ui.LoginActivity
import com.yudhaaryosapplication.app.modules.register.`data`.viewmodel.RegisterVM
import java.util.regex.Pattern
import kotlin.String
import kotlin.Unit

class RegisterActivity : AppCompatActivity () {


  lateinit var auth: FirebaseAuth
  lateinit var binding: ActivityRegisterBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    binding = ActivityRegisterBinding.inflate(layoutInflater)
    super.onCreate(savedInstanceState)
    setContentView(binding.root)

    auth = FirebaseAuth.getInstance()

    binding.txtSignIn.setOnClickListener {
      val intent = Intent(this, LoginActivity::class.java)
      startActivity(intent)
    }


    binding.btnSignUp.setOnClickListener{
      val email = binding.edtEmailRegister.text.toString()
      val password = binding.edtPasswordRegister.text.toString()

      if(email.isEmpty()){
          binding.edtEmailRegister.error = "Email Harus Diisi"
        binding.edtEmailRegister.requestFocus()
        return@setOnClickListener
      }
      if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
        binding.edtEmailRegister.error = "Email Tidak Valid"
        binding.edtEmailRegister.requestFocus()
        return@setOnClickListener
      }
      if(password.isEmpty()){
        binding.edtPasswordRegister.error = "Password Harus Diisi"
        binding.edtPasswordRegister.requestFocus()
        return@setOnClickListener
    }
      if(password.length < 6){
        binding.edtPasswordRegister.error = "Password Minimal 6 Karakter"
        binding.edtPasswordRegister.requestFocus()
        return@setOnClickListener
      }
      RegisterFirebase(email,password)

  }




      binding.txtSignIn.setOnClickListener {
        startActivity(Intent(this, RegisterActivity::class.java))
        finish()
      }
      binding.btnSignUp.setOnClickListener {
        startActivity(Intent(this, RegisterActivity::class.java))
        finish()
      }
    }




      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, RegisterActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }

  private fun RegisterFirebase(email: String, password: String) {
    auth.createUserWithEmailAndPassword(email,password)
      .addOnCompleteListener(this){
        if (it.isSuccessful){
          Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
          val intent = Intent(this,LoginActivity::class.java)
          startActivity(intent)
        } else{
          Toast.makeText(this, "${it .exception?.message}", Toast.LENGTH_SHORT).show()
        }
      }

  }
}



