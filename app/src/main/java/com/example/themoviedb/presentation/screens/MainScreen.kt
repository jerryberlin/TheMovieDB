package com.example.themoviedb.presentation.screens

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.themoviedb.navigation.Screens
import com.example.themoviedb.navigation.SetupNavGraph

//
//@Composable
//fun MainScreen(
//) {
//    val navController = rememberNavController()
//    Scaffold(
//        bottomBar = { BottomBar(navController = navController)}
//    ) {
//        SetupNavGraph(navController = navController)
//    }
//}
//
//@Composable
//fun BottomBar(
//    navController: NavHostController
//) {
//    val screens = listOf(
//        Screens.Home,
//        Screens.Series,
//        Screens.Movies
//    )
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    val currentDestination = navBackStackEntry?.destination
//
//    BottomNavigation {
//        screens.forEach { screen ->
//            AddItem(
//                screen = screen,
//                currentDestination = currentDestination,
//                navController = navController
//            )
//        }
//    }
//}
//
//@Composable
//fun RowScope.AddItem(
//    screen: Screens,
//    currentDestination: NavDestination?,
//    navController: NavHostController
//) {
//    BottomNavigationItem(
//        label = {
//            screen.title?.let { Text(text = it) }
//        },
//        icon = {
//            screen.icon?.let {
//                Icon(imageVector = it,
//                    contentDescription = "Navigation Icon")
//            }
//        },
//        selected = currentDestination?.hierarchy?.any {
//            it.route == screen.route
//        } == true,
//        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
//        onClick = {
//            navController.navigate(screen.route){
//                popUpTo(navController.graph.findStartDestination().id)
//                launchSingleTop = true
//            }
//        }
//    )
//}