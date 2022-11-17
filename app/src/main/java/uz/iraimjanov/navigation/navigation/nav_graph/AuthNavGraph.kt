package uz.iraimjanov.navigation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import uz.iraimjanov.navigation.navigation.screen.AUTHENTICATION_ROUTE
import uz.iraimjanov.navigation.navigation.screen.Screen
import uz.iraimjanov.navigation.screen.LoginScreen
import uz.iraimjanov.navigation.screen.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE,
    ) {
        composable(route = Screen.Login.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screen.SignUp.route) {
            SignUpScreen(navController = navController)
        }
    }
}