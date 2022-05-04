//package com.example.themoviedb.navigation
//
//import androidx.navigation.NavGraphBuilder
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.composable
//import androidx.navigation.navigation
//import com.example.themoviedb.presentation.screens.MainScreen
//import com.example.themoviedb.presentation.screens.home.HomeScreen
//import com.example.themoviedb.presentation.screens.movie.MoviesScreen
//import com.example.themoviedb.presentation.screens.series.SeriesScreen
//import com.example.themoviedb.util.Constants
//
//
//fun NavGraphBuilder.mainNavGraph(
//    navController: NavHostController
//) {
//    navigation(
//        startDestination = Screens.Home.route,
//        route = Constants.HOME_ROUTE
//    ){
//        composable(route = Screens.Home.route){
//            HomeScreen(navController = navController)
//        }
//        composable(route = Screens.Series.route){
//            SeriesScreen(navController = navController)
//        }
//        composable(route = Screens.Movies.route){
//            MoviesScreen(navController = navController)
//        }
//    }
//}