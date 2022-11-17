package uz.iraimjanov.navigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import uz.iraimjanov.navigation.navigation.screen.HOME_ROUTE
import uz.iraimjanov.navigation.navigation.screen.ROOT_ROUTE


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {

        homeNavGraph(navController = navController)

        authNavGraph(navController = navController)

    }
}