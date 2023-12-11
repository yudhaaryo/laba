package com.yudhaaryosapplication.app.modules.iphone8four.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.base.BaseActivity
import com.yudhaaryosapplication.app.databinding.ActivityIphone8FourBinding
import com.yudhaaryosapplication.app.modules.iphone8four.`data`.viewmodel.Iphone8FourVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class FutsalActivity :
    BaseActivity<ActivityIphone8FourBinding>(R.layout.activity_iphone_8_four) {
  private val viewModel: Iphone8FourVM by viewModels<Iphone8FourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone8FourVM = viewModel
    setUpSearchViewFrameFifteenListener()
  }

  override fun setUpClicks(): Unit {
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
      const val TAG: String = "IPHONE8FOUR_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, FutsalActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
