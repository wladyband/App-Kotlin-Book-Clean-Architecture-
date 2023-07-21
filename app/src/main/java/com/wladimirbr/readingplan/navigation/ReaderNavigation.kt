package com.wladimirbr.readingplan.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wladimirbr.readingplan.screens.ReaderSplashScreen
import com.wladimirbr.readingplan.screens.home.ReaderBookHomeScreen
import com.wladimirbr.readingplan.screens.login.ReaderBookLoginScreen
import com.wladimirbr.readingplan.screens.stats.ReaderBookStatsScreen


@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ReaderScreens.SplashScreen.name
    ) {
        composable(ReaderScreens.SplashScreen.name) {
            ReaderSplashScreen(navController = navController)
        }
        composable(ReaderScreens.LoginScreen.name) {
            ReaderBookLoginScreen(navController = navController)
        }

        composable(ReaderScreens.ReaderStatsScreen.name) {
            ReaderBookStatsScreen(navController = navController)
        }

        composable(ReaderScreens.ReaderHomeScreen.name) {
            ReaderBookHomeScreen(navController = navController)
        }
    }
}

