package com.yarendemirkaya.blutv.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yarendemirkaya.blutv.R

@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = {
            BottomBar()
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .background(Color(0xFF202C44))
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cloud_of_may),
                        contentDescription = "Background Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth().height(235.dp)
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
                                        Color(0xFF202C44).copy(alpha = 1f)
                                    )
                                )
                            )
                    ) {
                        Text(
                            text = "MAYIS \nSIKINTISI",
                            fontWeight = FontWeight.Thin,
                            lineHeight = 40.sp,
                            fontSize = 38.sp,
                            fontFamily = FontFamily(Font(R.font.garamond)),
                            color = Color(0xFFCACDCE),
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .padding(5.dp)
                                .offset(y = (30).dp)
                                .fillMaxHeight()
                        )
                    }
                    CustomTopAppBar()
                }
            }
            item {
                Row(
                    modifier = Modifier
                        .padding(4.dp)
                        .height(80.dp)
                        .fillMaxWidth(),
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
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.playbutton),
                                contentDescription = "Play Button",
                                modifier = Modifier
                                    .size(20.dp)
                                    .padding(start = 8.dp)
                                    .offset(x = (-10).dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "Hemen İzle")
                        }

                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painter = painterResource(R.drawable.ic_plus),
                        contentDescription = "Click Add",
                        modifier = Modifier
                            .size(24.dp)
                            .background(color = Color(0xFF202C44))
                    )
                    Spacer(modifier = Modifier.width(100.dp))
                    Image(
                        painter = painterResource(R.drawable.ic_progressbar),
                        contentDescription = "Progress Bar",
                        modifier = Modifier
                            .size(100.dp)
                            .fillMaxSize()
                            .padding(top = 50.dp, end = 20.dp)
                            .wrapContentSize(align = Alignment.TopEnd)
                    )
                }
            }

            item {
                Text(
                    text = "İzlemeye Devam Et",
                    color = Color(0xFFAEB1B2),
                    fontSize = 18.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(4.dp)
                )
            }

            item {

                KeepWatchingMovies()
            }

            item {
                Text(
                    text = "Nefes Kesen Aksiyonlar",
                    color = Color(0xFFAEB1B2),
                    fontSize = 18.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(4.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
            item {
                ImageLazyRow()
            }
        }
    }
}

@Composable
fun BottomBar() {
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = Color(0xFF202C44),
        contentColor = Color(0xFFBDC0C0),
    ) {
        NavigationBarItem(
            selected = true,
            onClick = { /*TODO*/ },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color.White,
                indicatorColor = Color.Transparent,
                unselectedIconColor = Color(0xFFAEB1B2),
                unselectedTextColor = Color(0xFFAEB1B2)
            ),
            label = {
                Text(
                    text = "Keşfet",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal
                )
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.rectangle_stack_svgrepo_com),
                    contentDescription = "Keşfet",
                    modifier = Modifier.size(24.dp)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color.White,
                indicatorColor = Color.Transparent,
                unselectedIconColor = Color(0xFFAEB1B2),
                unselectedTextColor = Color(0xFFAEB1B2)),
            label = {
                Text(
                    text = "Listem",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal
                )
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconlist),
                    contentDescription = "Listem",
                    modifier = Modifier.size(24.dp)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color.White,
                indicatorColor = Color.Transparent,
                unselectedIconColor = Color(0xFFAEB1B2),
                unselectedTextColor = Color(0xFFAEB1B2)),
            label = {
                Text(
                    text = "Arama",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal
                )
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconsearch),
                    contentDescription = "Arama",
                    modifier = Modifier.size(24.dp)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color.White,
                indicatorColor = Color.Transparent,
                unselectedIconColor = Color(0xFFAEB1B2),
                unselectedTextColor = Color(0xFFAEB1B2)),
            label = {
                Text(
                    text = "Canlı Yayın",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal
                )
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.iconlive),
                    contentDescription = "Canlı Yayın",
                    modifier = Modifier.size(24.dp)
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color.White,
                indicatorColor = Color.Transparent,
                unselectedIconColor = Color(0xFFAEB1B2),
                unselectedTextColor = Color(0xFFAEB1B2)),
            label = {
                Text(
                    text = "Hesabım",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal
                )
            },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_blu_profil),
                    contentDescription = "Hesabım",
                    modifier = Modifier
                        .size(24.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(Color(0xFF202C44)),
                    tint = Color.Unspecified,
                )
            }
        )
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
                        modifier = Modifier.offset(y=(-10).dp)
                    )
                }
                Spacer(modifier = Modifier.weight(0.5f))

                TextButton(onClick = {}) {
                    Text(
                        text = "Dizi",
                        fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Normal,
                        color = Color(0xFFAEB1B2),
                        fontSize = 18.sp,
                        modifier = Modifier.offset(y=(-10).dp)
                    )
                }
                Spacer(modifier = Modifier.weight(0.5f))

                TextButton(onClick = { }) {
                    Text(
                        text = "Discovery",
                        fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Normal,
                        color = Color(0xFFAEB1B2),
                        fontSize = 18.sp,
                        modifier = Modifier.offset(y=(-10).dp)
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
fun ImageLazyRow() {
    val imageList = listOf(
        R.drawable.img_boru,
        R.drawable.img_dune,
        R.drawable.img_dag1,
        R.drawable.ic_meg,
        R.drawable.img_inception,
        R.drawable.img_tarzan,
        R.drawable.img_matrix
    )
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        items(imageList) { imageRes ->
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Image",
                modifier = Modifier
                    .width((LocalConfiguration.current.screenWidthDp / 3.2).dp)
                    .padding(1.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color(0xFF202C44)),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun KeepWatchingMovies() {
    val imageList = listOf(
        R.drawable.ic_got,
        R.drawable.ic_sexandthecity,
        R.drawable.ic_prens,
    )
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        items(imageList) { imageRes ->
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Image",
                modifier = Modifier
                    .width((LocalConfiguration.current.screenWidthDp * 0.6).dp)
                    .height(170.dp)
                    .padding(3.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFF202C44)),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}





