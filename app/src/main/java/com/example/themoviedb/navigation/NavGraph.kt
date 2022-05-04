package com.example.themoviedb.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.themoviedb.presentation.screens.home.HomeScreen
import com.example.themoviedb.presentation.screens.movie.MoviesScreen
import com.example.themoviedb.presentation.screens.series.SeriesScreen
import com.example.themoviedb.presentation.screens.splash.SplashScreen
import com.example.themoviedb.util.Constants.DETAILS_ARGUMENT_KEY
import com.example.themoviedb.util.Constants.ROOT_ROUTE

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route,
        route = ROOT_ROUTE
    ) {
        composable(route = Screens.Splash.route){
            SplashScreen(navController = navController)
        }
        composable(route = Screens.Welcome.route){

        }

        composable(route = Screens.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screens.Series.route){
            SeriesScreen(navController = navController)
        }
        composable(route = Screens.Movies.route){
            MoviesScreen(navController = navController)
        }

        composable(
            route = Screens.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY){
                type = NavType.IntType
            })
        ){

        }

        composable(route = Screens.Search.route){

        }

    }
}