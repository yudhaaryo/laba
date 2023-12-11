//package com.yudhaaryosapplication.app.modules.chat.ui
//
//import android.content.Context
//import android.content.Intent
//import android.os.Bundle
//import android.os.Handler
//import android.os.Looper
//import androidx.activity.viewModels
//import com.yudhaaryosapplication.app.R
//import com.yudhaaryosapplication.app.appcomponents.base.BaseActivity
//import com.yudhaaryosapplication.app.databinding.ActivityChatBinding
//import com.yudhaaryosapplication.app.modules.chat.`data`.viewmodel.ChatVM
//import com.yudhaaryosapplication.app.modules.landingpage.ui.LandingpageActivity
//import kotlin.String
//import kotlin.Unit
//
//class ChatActivity : BaseActivity<ActivityChatBinding>(R.layout.activity_chat) {
//  private val viewModel: ChatVM by viewModels<ChatVM>()
//
//  override fun onInitialized(): Unit {
//    viewModel.navArguments = intent.extras?.getBundle("bundle")
//    binding.chatVM = viewModel
//    Handler(Looper.getMainLooper()).postDelayed( {
//      val destIntent = LandingpageActivity.getIntent(this, null)
//      startActivity(destIntent)
//      finish()
//      }, 3000)
//    }
//
//    override fun setUpClicks(): Unit {
//    }
//
//    companion object {
//      const val TAG: String = "CHAT_ACTIVITY"
//
//
//      fun getIntent(context: Context, bundle: Bundle?): Intent {
//        val destIntent = Intent(context, ChatActivity::class.java)
//        destIntent.putExtra("bundle", bundle)
//        return destIntent
//      }
//    }
//  }
