package com.yarendemirkaya.blutv.ui.screen.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun KeepWatchingItem(
    imageRes: Int
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Image",
        modifier = Modifier
            .height(144.dp)
            .clip(RoundedCornerShape(10.dp)),
        contentScale = ContentScale.FillHeight,
    )
}