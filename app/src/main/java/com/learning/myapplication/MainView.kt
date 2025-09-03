package com.learning.myapplication

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.learning.myapplication.navigation.AppBottomNav
import com.learning.myapplication.navigation.AppNavGraph
import com.learning.myapplication.navigation.AppRoute
import com.learning.myapplication.utils.CommonFunc.getNavigationItems
import com.learning.myapplication.utils.isBottomNavRoute
import com.learning.myapplication.utils.navigateToTopLevelDestination

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MainView() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentRoute by remember(navBackStackEntry) {
        derivedStateOf { navBackStackEntry?.destination?.route }
    }

    val canNavigateBack by remember(navBackStackEntry) {
        derivedStateOf {
            navBackStackEntry != null &&
                    currentRoute != null &&
                    currentRoute != AppRoute.BottomScreens.route
        }
    }

    val shouldShowBottomBar by remember(currentRoute) {
        derivedStateOf {
            isBottomNavRoute(currentRoute)
        }
    }

    val navigationItems = remember {
        getNavigationItems()
    }

    BackHandler(enabled = canNavigateBack) {
        navController.popBackStack(
            route = AppRoute.BottomScreens.route,
            inclusive = false
        )
    }

    Scaffold(
        topBar = {
            if (shouldShowBottomBar) {
                TopAppBar(
                    title = { Text("Jetpack Awesome UI") },
                )
            }

        },
        bottomBar = {
            if (shouldShowBottomBar) {
                AppBottomNav(
                    items = navigationItems,
                    currentRoute = currentRoute,
                    onItemSelected = { route ->
                        navController.navigateToTopLevelDestination(route)
                    }
                )
            }

        }
    ) { paddingValues ->
        AppNavGraph(
            navController = navController,
            modifier = Modifier.padding(paddingValues)
        )
    }
}