@file:Suppress("unused")

package com.learning.myapplication.utils

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.learning.myapplication.navigation.AppRoute

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun NavHostController.navigateRoute(destination: AppRoute) {
    navigate(destination.route)
}

fun NavHostController.navigateToAndClearBackStack(destination: AppRoute) {
    navigate(destination.route) {
        popUpTo(graph.startDestinationId) {
            inclusive = true
        }
        launchSingleTop = true
        restoreState = true
    }
}

fun NavHostController.navigateToTopLevelDestination(route: String) {
    navigate(route) {
        popUpTo(graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}

inline fun <reified T : AppRoute> NavGraphBuilder.composableRoute(
    noinline content: @Composable () -> Unit
) {
    val route = (T::class.java.getDeclaredField("route").get(null) as? String)
        ?: error("Route property not found for ${T::class.simpleName}")
    composable(route) { content() }
}

fun NavGraphBuilder.bottomNavGraph(navController: NavHostController) {
    composable(AppRoute.BottomScreens.route) {
        /**
        HomeScreen(navController)
        */
    }

    composable(AppRoute.BottomApps.route) {
        /*
        AppsScreen()
        */
    }

    composable(AppRoute.BottomFavorites.route) {
        /*
        FavoritesScreen()
        */
    }

    composable(AppRoute.BottomSettings.route) {
        /*
        SettingsScreen()
        */
    }
}

fun isBottomNavRoute(route: String?): Boolean {
    return route == AppRoute.BottomScreens.route ||
            route == AppRoute.BottomApps.route ||
            route == AppRoute.BottomFavorites.route ||
            route == AppRoute.BottomSettings.route
}