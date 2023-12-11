package com.yudhaaryosapplication.app.modules.maps1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.yudhaaryosapplication.app.R
import com.yudhaaryosapplication.app.appcomponents.base.BaseActivity
import com.yudhaaryosapplication.app.databinding.ActivityMaps1Binding
import com.yudhaaryosapplication.app.modules.maps1.`data`.viewmodel.Maps1VM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class BerandaActivity : BaseActivity<ActivityMaps1Binding>(R.layout.activity_maps1) {
  private val viewModel: Maps1VM by viewModels<Maps1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.maps1VM = viewModel
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
      const val TAG: String = "MAPS1ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, BerandaActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
