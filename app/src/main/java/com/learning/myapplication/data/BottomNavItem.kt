package com.learning.myapplication.data

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem (
    val title: String,
    val selectedIcon: ImageVector,
    val icon: ImageVector,
    val route: String,
    val badgeCount: Int? = null
)
