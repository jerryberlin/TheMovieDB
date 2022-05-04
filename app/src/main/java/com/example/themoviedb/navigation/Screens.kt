package com.example.themoviedb.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(
    val route: String
//    val title: String? = null,
//    val icon: ImageVector? = null
) {
    object Splash: Screens("splash_screen")
    object Welcome: Screens("welcome_screen")
    object Details: Screens("details_screen/{movieId}"){
        fun passHeroId(movieId: Int): String {
            return "details_screen/$movieId"
        }
    }
    object Search: Screens("search_screen")
    object Main: Screens("main_screen")
    object Home: Screens(route = "home_screen")
    object Series: Screens(route = "series_screen")
    object Movies: Screens(route = "movies_screen")
}