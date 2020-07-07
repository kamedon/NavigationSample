package com.kamedon.navigationsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)


    val navController = findNavController((R.id.nav_host_fragment))

    // トップレベルを設定することで、設定したものはハンバーガーアイコンをだす
    val appBarConfiguration = AppBarConfiguration(setOf(R.id.menu1, R.id.menu2, R.id.menu3), drawer_layout)
    // トップレベルがスタートのフラグメントだけなので、どこかに遷移するとすべてバックボタン
//    val appBarConfiguration = AppBarConfiguration(navController.graph, drawer_layout)

    nav_view.setupWithNavController(navController)
    toolbar.setupWithNavController(
      navController,
      appBarConfiguration
    )
  }
}
