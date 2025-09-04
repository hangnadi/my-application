package com.learning.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.learning.myapplication.ui.splash.SplashScreen

@Composable
fun AppNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController,
        startDestination = "splash"
    ) {
        composable("splash") { SplashScreen(navController) }
        composable("login") { LoginScreen(navController) }

        // Group all bottom tabs inside "main"
        navigation(startDestination = "home", route = "main") {
            composable("home") { HomeScreen(navController) }
            composable("group") { CommunityScreen(navController) }
            composable("new_task") { NewTaskScreen(navController) }
            composable("profile") { ProfileScreen(navController) }
            composable("settings") { SettingsScreen(navController) }
        }
    }
}

@Composable
fun SettingsScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun ProfileScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun NewTaskScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun CommunityScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun HomeScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun LoginScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}