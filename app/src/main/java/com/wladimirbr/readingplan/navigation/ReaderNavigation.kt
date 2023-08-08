package com.wladimirbr.readingplan.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.bawp.freader.screens.login.ReaderBookLoginScreen
import com.wladimirbr.readingplan.screens.ReaderSplashScreen
import com.wladimirbr.readingplan.screens.details.ReaderBookDetailsScreen
import com.wladimirbr.readingplan.screens.home.Home
import com.wladimirbr.readingplan.screens.search.BooksSearchViewModel
import com.wladimirbr.readingplan.screens.search.ReaderBookSearchScreen
import com.wladimirbr.readingplan.screens.stats.ReaderBookStatsScreen

@ExperimentalComposeUiApi
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
            Home(navController = navController)
        }
        composable(ReaderScreens.SearchScreen.name) {
            val searchViewModel = hiltViewModel<BooksSearchViewModel>()

            ReaderBookSearchScreen(navController = navController, viewModel = searchViewModel)
        }

        val detailName = ReaderScreens.DetailScreen.name
        composable("$detailName/{bookId}", arguments = listOf(navArgument("bookId"){
            type = NavType.StringType
        })) { backStackEntry ->
            backStackEntry.arguments?.getString("bookId").let {

                ReaderBookDetailsScreen(navController = navController, bookId = it.toString())
            }
        }
    }
}

