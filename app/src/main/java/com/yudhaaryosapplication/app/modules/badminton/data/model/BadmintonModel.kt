package com.yudhaaryosapplication.app.modules.badminton.`data`.model

import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BadmintonModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHaiudinsudah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hai_udin_sudah2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThreeHundredTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBadmintonbaren: String? =
      MyApp.getInstance().resources.getString(R.string.msg_badminton_baren)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt16001900: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_00_19_00)
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
