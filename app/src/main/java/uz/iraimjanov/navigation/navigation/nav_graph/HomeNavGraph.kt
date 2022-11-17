package uz.iraimjanov.navigation.navigation.nav_graph

import androidx.navigation.*
import androidx.navigation.compose.composable
import uz.iraimjanov.navigation.navigation.screen.DETAIL_ARGUMENT_KEY
import uz.iraimjanov.navigation.navigation.screen.DETAIL_ARGUMENT_KEY2
import uz.iraimjanov.navigation.navigation.screen.HOME_ROUTE
import uz.iraimjanov.navigation.navigation.screen.Screen
import uz.iraimjanov.navigation.screen.DetailScreen
import uz.iraimjanov.navigation.screen.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE,
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                })
        ) {
            DetailScreen(navController = navController)
        }
    }
}