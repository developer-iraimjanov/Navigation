package uz.iraimjanov.navigation.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import uz.iraimjanov.navigation.navigation.screen.AUTHENTICATION_ROUTE
import uz.iraimjanov.navigation.navigation.screen.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Detail.passNameAndId("Android", 11)) {
                    popUpTo(Screen.Home.route) {
                        inclusive = true
                    }
                }
            },
            color = Color.Blue,
            text = "Home Screen",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )
        Text(
            modifier = Modifier
                .padding(top = 200.dp)
                .clickable {
                    navController.navigate(AUTHENTICATION_ROUTE)
                },
            text = "Login/Sign up",
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}