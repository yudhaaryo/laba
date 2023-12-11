package com.yudhaaryosapplication.app.modules.maps1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yudhaaryosapplication.app.modules.maps1.`data`.model.Maps1Model
import org.koin.core.KoinComponent

class Maps1VM : ViewModel(), KoinComponent {
  val maps1Model: MutableLiveData<Maps1Model> = MutableLiveData(Maps1Model())

  var navArguments: Bundle? = null
}
