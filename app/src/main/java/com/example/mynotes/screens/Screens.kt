package com.example.mynotes.screens

import com.example.mynotes.R

sealed class Screens(val route: String, val icon: Int) {
    object Splash : Screens("Splash", R.drawable.note_3)
    object Main : Screens("Main", R.drawable.note)
    object Login : Screens("Login", R.drawable.login)
    object Calendar : Screens("Calendar", R.drawable.calendar)
    object Menu : Screens("Menu", R.drawable.menu)
    object Note : Screens("Note", R.drawable.list_notes)
    object SignUp : Screens("SignUp", R.drawable.login)
    object ForgotPassword : Screens("Forgot_Password", R.drawable.key)
    object PrivacyPolicy : Screens("Privacy_Policy", R.drawable.key)
    object Setting : Screens("Setting", R.drawable.settings)
    object Add : Screens("Add", R.drawable.add)
}