package com.example.themoviedb.presentation.screens.splash

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.themoviedb.util.Constants.HOME_ROUTE

@Composable
fun SplashScreen(
    navController: NavHostController
) {
   Text(
       modifier = Modifier.clickable {
                                     navController.navigate(HOME_ROUTE)
       },
       text = "Hai"
   )
}