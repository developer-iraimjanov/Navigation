package uz.iraimjanov.navigation.navigation.screen

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
        fun passNameAndId(name: String, id: Int): String {
            return "detail_screen/$id/$name"
        }
    }

    object Login : Screen(route = "login_screen")
    object SignUp : Screen(route = "sign_up_screen")
}