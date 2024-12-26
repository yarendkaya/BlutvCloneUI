package com.yarendemirkaya.blutv.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yarendemirkaya.blutv.R
import com.yarendemirkaya.blutv.ui.screen.home.component.ImageLazyRowItem
import com.yarendemirkaya.blutv.ui.screen.home.component.KeepWatchingItem

@Composable
fun HomeScreen() {
    val continueWatchingImages = listOf(
        R.drawable.ic_got,
        R.drawable.ic_sexandthecity,
        R.drawable.ic_prens,
    )

    val actionsImages = listOf(
        R.drawable.img_boru,
        R.drawable.img_dune,
        R.drawable.img_dag1,
        R.drawable.ic_meg,
        R.drawable.img_inception,
        R.drawable.img_tarzan,
        R.drawable.img_matrix
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF202C44))
    ) {
        item {
            TopArea()
        }

        item {
            DotIndicator()
        }

        item {
            KeepWatchingMovies(continueWatchingImages)
        }

        item {
            ImageLazyRow(actionsImages)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar() {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    painter = painterResource(R.drawable.blutv_logo),
                    contentDescription = "BluTV Logo",
                    tint = Color.White,
                    modifier = Modifier
                        .size(80.dp)
                        .offset(y = (-10).dp)
                )
                Spacer(modifier = Modifier.weight(0.5f))

                TextButton(onClick = {}) {
                    Text(
                        text = "Film",
                        fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Normal,
                        color = Color(0xFFAEB1B2),
                        fontSize = 18.sp,
                        modifier = Modifier.offset(y = (-10).dp)
                    )
                }
                Spacer(modifier = Modifier.weight(0.5f))

                TextButton(onClick = {}) {
                    Text(
                        text = "Dizi",
                        fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Normal,
                        color = Color(0xFFAEB1B2),
                        fontSize = 18.sp,
                        modifier = Modifier.offset(y = (-10).dp)
                    )
                }
                Spacer(modifier = Modifier.weight(0.5f))

                TextButton(onClick = { }) {
                    Text(
                        text = "Discovery",
                        fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Normal,
                        color = Color(0xFFAEB1B2),
                        fontSize = 18.sp,
                        modifier = Modifier.offset(y = (-10).dp)
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent
        ),
        modifier = Modifier
            .fillMaxWidth()

    )
}

@Composable
private fun TopArea() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.cloud_of_may),
                contentDescription = "Background Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .align(Alignment.BottomCenter)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color(0xFF202C44)
                            )
                        )
                    )
            ) {
                Text(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(start = 16.dp),
                    text = "MAYIS \nSIKINTISI",
                    fontWeight = FontWeight.Thin,
                    lineHeight = 40.sp,
                    fontSize = 34.sp,
                    fontFamily = FontFamily(Font(R.font.garamond)),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    color = Color(0xFFCACDCE),
                )
            }
            CustomTopAppBar()
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.playbutton),
                    contentDescription = "Play Button",
                    modifier = Modifier.size(12.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Hemen İzle")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Icon(
                painter = painterResource(R.drawable.ic_plus),
                contentDescription = "Click Add",
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(24.dp)
                    .background(color = Color(0xFF202C44))
            )
        }
    }
}

@Composable
private fun DotIndicator() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 20.dp),
        contentAlignment = Alignment.CenterEnd,
    ) {
        Image(
            modifier = Modifier.height(16.dp),
            contentScale = ContentScale.FillHeight,
            painter = painterResource(R.drawable.ic_progressbar),
            contentDescription = "Progress Bar",
        )
    }
}

@Composable
private fun ImageLazyRow(
    imageList: List<Int>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = "Nefes Kesen Aksiyonlar",
            color = Color(0xFFAEB1B2),
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(4.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(imageList) { imageRes ->
                ImageLazyRowItem(imageRes)
            }
        }
    }
}

@Composable
private fun KeepWatchingMovies(
    imageList: List<Int>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = "İzlemeye Devam Et",
            color = Color(0xFFAEB1B2),
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Normal,
        )
        Spacer(modifier = Modifier.height(12.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(imageList) { imageRes ->
                KeepWatchingItem(imageRes)
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}






