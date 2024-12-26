package com.yarendemirkaya.blutv.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yarendemirkaya.blutv.ui.screen.home.HomeScreen

@Composable
fun BluTvNavGraph(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        HomeScreen()
    }
}