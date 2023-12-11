package com.yudhaaryosapplication.app.modules.chat.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yudhaaryosapplication.app.modules.chat.`data`.model.ChatModel
import org.koin.core.KoinComponent

class ChatVM : ViewModel(), KoinComponent {
  val chatModel: MutableLiveData<ChatModel> = MutableLiveData(ChatModel())

  var navArguments: Bundle? = null
}
