package com.yudhaaryosapplication.app.modules.join.ui

import androidx.activity.viewModels
import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.base.BaseActivity
import com.yudhaaryosapplication.app.databinding.ActivityJoinBinding
import com.yudhaaryosapplication.app.modules.join.`data`.viewmodel.JoinVM
import kotlin.String
import kotlin.Unit

class JoinActivity : BaseActivity<ActivityJoinBinding>(R.layout.activity_join) {
  private val viewModel: JoinVM by viewModels<JoinVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.joinVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "JOIN_ACTIVITY"

  }
}
