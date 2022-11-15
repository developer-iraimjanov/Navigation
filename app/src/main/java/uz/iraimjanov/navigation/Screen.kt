package uz.iraimjanov.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
//        fun passId(id: Int): String {
//            return "detail_screen/$id"
//        }

        fun passNameAndId(name: String, id: Int): String {
            return "detail_screen/$id/$name"
        }
    }
}