package com.yudhaaryosapplication.app.modules.landingpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.base.BaseActivity
import com.yudhaaryosapplication.app.databinding.ActivityLandingpageBinding
import com.yudhaaryosapplication.app.databinding.ActivityLoginBinding
import com.yudhaaryosapplication.app.modules.landingpage.`data`.viewmodel.LandingpageVM
import com.yudhaaryosapplication.app.modules.login.ui.LoginActivity
import kotlin.String
import kotlin.Unit
import android.os.Handler
import android.os.Looper

class LandingpageActivity : AppCompatActivity () {

    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 3000)
    }
        private val viewModel: LandingpageVM by viewModels<LandingpageVM>()





//        companion object {
//            const val TAG: String = "LANDINGP
//            AGE_ACTIVITY"
//
//
//        }


}
