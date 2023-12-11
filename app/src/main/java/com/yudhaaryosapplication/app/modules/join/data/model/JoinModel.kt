package com.yudhaaryosapplication.app.modules.join.`data`.model

import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class JoinModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJOIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_join2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBERHASIL: String? = MyApp.getInstance().resources.getString(R.string.lbl_berhasil)
  ,
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)

)
