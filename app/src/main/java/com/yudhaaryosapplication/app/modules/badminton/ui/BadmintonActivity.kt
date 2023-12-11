package com.yudhaaryosapplication.app.modules.badminton.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.base.BaseActivity
import com.yudhaaryosapplication.app.databinding.ActivityBadmintonBinding
import com.yudhaaryosapplication.app.modules.badminton.`data`.viewmodel.BadmintonVM
import com.yudhaaryosapplication.app.modules.iphone8four.ui.Iphone8FourActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class BadmintonActivity : BaseActivity<ActivityBadmintonBinding>(R.layout.activity_badminton) {
  private val viewModel: BadmintonVM by viewModels<BadmintonVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.badmintonVM = viewModel
    setUpSearchViewFrameFifteenListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageFilter.setOnClickListener {
      val destIntent = Iphone8FourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewFrameFifteenListener(): Unit {
    binding.searchViewFrameFifteen.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "BADMINTON_ACTIVITY"

    }
  }
