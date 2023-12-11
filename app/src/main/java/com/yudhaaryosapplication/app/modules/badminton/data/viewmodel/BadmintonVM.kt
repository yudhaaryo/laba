package com.yudhaaryosapplication.app.modules.badminton.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yudhaaryosapplication.app.modules.badminton.`data`.model.BadmintonModel
import org.koin.core.KoinComponent

class BadmintonVM : ViewModel(), KoinComponent {
  val badmintonModel: MutableLiveData<BadmintonModel> = MutableLiveData(BadmintonModel())

  var navArguments: Bundle? = null
}
