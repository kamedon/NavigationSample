package com.kamedon.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_menu.*

class Menu2Fragment :Fragment(R.layout.fragment_menu){
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    title.text = "Menu2"
  }

}
