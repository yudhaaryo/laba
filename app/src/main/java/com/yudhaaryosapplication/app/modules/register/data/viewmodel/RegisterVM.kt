package com.yudhaaryosapplication.app.modules.register.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.yudhaaryosapplication.app.modules.register.`data`.model.RegisterModel
import org.koin.core.KoinComponent

class RegisterVM : ViewModel(), KoinComponent {
  val registerModel: MutableLiveData<RegisterModel> = MutableLiveData(RegisterModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
