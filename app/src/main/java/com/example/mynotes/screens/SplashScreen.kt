package com.example.mynotes.screens

import android.annotation.SuppressLint
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mynotes.R
import com.example.mynotes.ui.theme.MyNotesTheme
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = MaterialTheme.colors.surface)
    ) {
        val scale = remember {
            Animatable(0.0f)
        }

        LaunchedEffect(key1 = true) {
            scale.animateTo(
                targetValue = 0.7f,
                animationSpec = tween(800, easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                })
            )
            delay(1000)
            navController.navigate(Screens.Main.route) {
                popUpTo(Screens.Splash.route) {
                    inclusive = true
                }
            }
        }

        Image(
            painter = painterResource(id = R.drawable.note_3), contentDescription = "",
            alignment = Alignment.Center, modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
                .padding(100.dp)
        )

        Text(
            text = "ЗамеТОЧКА",
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        )

    }
}


