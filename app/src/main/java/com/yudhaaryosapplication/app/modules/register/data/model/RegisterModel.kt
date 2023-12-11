package com.yudhaaryosapplication.app.modules.register.`data`.model

import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOlahragaBareng: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_olahraga_bareng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLaba: String? = MyApp.getInstance().resources.getString(R.string.lbl_laba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_create_your_acc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectimages: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_images)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrSignInWith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_sign_in_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_have_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThreeValue: String? = null
)
