package com.yarendemirkaya.blutv.ui.screen.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yarendemirkaya.blutv.R

@Composable
fun ImageLazyRowItem(
    imageRes: Int
) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Image",
        modifier = Modifier
            .width((LocalConfiguration.current.screenWidthDp / 3.2).dp)
            .clip(RoundedCornerShape(15.dp)),
        contentScale = ContentScale.FillWidth
    )
}

@Preview(showBackground = true)
@Composable
private fun ImageLazyRowItemPreview() {
    ImageLazyRowItem(imageRes = R.drawable.img_boru)
}