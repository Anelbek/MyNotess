package com.example.mynotes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
//import com.example.mynotes.navigation.Navigation
//import com.example.mynotes.navigation.NotesNavHost
//import com.example.mynotes.screens.MenuScreen
import com.example.mynotes.screens.Screens
import com.example.mynotes.ui.theme.MyNotesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyNotesTheme {
//                val navController = rememberNavController()
//                Navigation(navHostController = navController)

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyNotesTheme {

    }
}