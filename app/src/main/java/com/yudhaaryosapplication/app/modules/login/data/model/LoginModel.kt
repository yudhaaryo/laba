package com.yudhaaryosapplication.app.modules.login.`data`.model

import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
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
  var txtLogintoyoura: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_your_a)
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_dont_have_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThreeValue: String? = null
)
