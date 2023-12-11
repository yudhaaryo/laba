package com.yudhaaryosapplication.app.modules.basket.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yudhaaryosapplication.app.modules.basket.`data`.model.BasketModel
import org.koin.core.KoinComponent

class BasketVM : ViewModel(), KoinComponent {
  val basketModel: MutableLiveData<BasketModel> = MutableLiveData(BasketModel())

  var navArguments: Bundle? = null
}
