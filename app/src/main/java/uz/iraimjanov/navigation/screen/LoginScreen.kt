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
import uz.iraimjanov.navigation.navigation.screen.HOME_ROUTE
import uz.iraimjanov.navigation.navigation.screen.Screen

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.SignUp.route)
            },
            text = "Login",
            color = Color.Magenta,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )
        Text(
            modifier = Modifier
                .padding(top = 200.dp)
                .clickable {
                    navController.popBackStack()
                    navController.navigate(Screen.Detail.passNameAndId("Home", 1))
                },
            color = Color.LightGray,
            text = "Open Detail Screen",
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}