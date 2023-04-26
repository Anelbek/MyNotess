package com.example.mynotes.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(floatingActionButton = { FloatingActionButton(
        onClick = { navController.navigate(Screens.Add.route) }) {
        Icon(painter = painterResource(id = Screens.Add.icon), contentDescription = "Add")
    }
    }
    ) {
        Column(modifier = Modifier.padding(it)) {
            NoteItem(title = "Заметка 1", subtitle = "Подзоголовок 1", navController = navController)
            NoteItem(title = "Заметка 2", subtitle = "Подзоголовок 2", navController = navController)
            NoteItem(title = "Заметка 3", subtitle = "Подзоголовок 3", navController = navController)
            NoteItem(title = "Заметка 4", subtitle = "Подзоголовок 4", navController = navController)
        }

    }

    //BottomBar(navHostController = navHostController)

}
@Composable
fun NoteItem(title: String, subtitle: String, navController: NavHostController) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp, horizontal = 24.dp)
        .clickable { navController.navigate(Screens.Note.route) },
        elevation = 6.dp) {
        Column(modifier = Modifier.padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)

            Text(text = subtitle)
        }

    }
}
