package com.yarendemirkaya.blutv.ui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.yarendemirkaya.blutv.R

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
                unselectedTextColor = Color(0xFFAEB1B2)
            ),
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
                unselectedTextColor = Color(0xFFAEB1B2)
            ),
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
                unselectedTextColor = Color(0xFFAEB1B2)
            ),
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
                unselectedTextColor = Color(0xFFAEB1B2)
            ),
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