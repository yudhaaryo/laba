package com.yudhaaryosapplication.app.modules.landingpage.`data`.model

import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LandingpageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLaba: String? = MyApp.getInstance().resources.getString(R.string.lbl_laba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOlahragaBareng: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_olahraga_bareng)

)
