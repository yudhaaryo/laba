package com.yudhaaryosapplication.app.modules.landingpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yudhaaryosapplication.app.modules.landingpage.`data`.model.LandingpageModel
import org.koin.core.KoinComponent

class LandingpageVM : ViewModel(), KoinComponent {
  val landingpageModel: MutableLiveData<LandingpageModel> = MutableLiveData(LandingpageModel())

  var navArguments: Bundle? = null
}
