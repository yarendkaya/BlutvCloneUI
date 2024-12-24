package com.yarendemirkaya.blutv

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.yarendemirkaya.blutv.ui.screen.HomeScreen
import com.yarendemirkaya.blutv.ui.theme.BlutvTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val insetsController= WindowCompat.getInsetsController(window,window.decorView)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            insetsController.hide(android.view.WindowInsets.Type.statusBars())
        }else{
            @Suppress("DEPRECATION")
            window.decorView.systemUiVisibility =
                window.decorView.systemUiVisibility or
                        android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

        }
        setContent {
            BlutvTheme {
                HomeScreen()
            }
        }
    }
}

