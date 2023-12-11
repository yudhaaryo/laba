package com.yudhaaryosapplication.app.modules.iphone8four.`data`.model

import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone8FourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHaiUdinsudah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hai_udin_sudah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightHundredTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMariFutsal: String? = MyApp.getInstance().resources.getString(R.string.lbl_mari_futsal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt19002100: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_00_21_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_jl_agro_sentur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_desc_ayo_kita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPetunjukarah: String? = MyApp.getInstance().resources.getString(R.string.lbl_petunjuk_arah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJoin: String? = MyApp.getInstance().resources.getString(R.string.lbl_join)

)
