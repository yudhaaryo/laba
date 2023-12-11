package com.yudhaaryosapplication.app.modules.iphone8four.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yudhaaryosapplication.app.modules.iphone8four.`data`.model.Iphone8FourModel
import org.koin.core.KoinComponent

class Iphone8FourVM : ViewModel(), KoinComponent {
  val iphone8FourModel: MutableLiveData<Iphone8FourModel> = MutableLiveData(Iphone8FourModel())

  var navArguments: Bundle? = null
}
