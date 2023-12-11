package com.yudhaaryosapplication.app.modules.maps1.`data`.model

import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Maps1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtHaiUdinsudah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hai_udin_sudah)

)
