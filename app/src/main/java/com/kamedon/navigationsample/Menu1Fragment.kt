package com.kamedon.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.fragment_menu.title
import kotlinx.android.synthetic.main.fragment_menu1.*

class Menu1Fragment : Fragment(R.layout.fragment_menu1) {
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    title.text = "Menu1"


    btn.setOnClickListener {
      findNavController().navigate(R.id.action_menu1Fragment_to_nestOfMenu1Fragment)
    }
  }

}

