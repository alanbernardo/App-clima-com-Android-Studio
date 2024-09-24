package br.com.fiap.appclima

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.appclima.screens.HomeScreen
import br.com.fiap.appclima.screens.LoginScreen
import br.com.fiap.appclima.screens.PrevisaoDetalhadaScreen
import br.com.fiap.appclima.ui.theme.AppClimaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppClimaTheme {

                val  navController = rememberNavController()
                NavHost(navController,
                    startDestination = "Login"
                ) {
                    composable(route = "Login"){ LoginScreen(navController = navController)}
                    composable(route = "Home"){ HomeScreen(navController = navController)}
                    composable(route = "PrevisaoDetalhadaScreen"){ PrevisaoDetalhadaScreen(navController = navController)}
                }
            }
        }
    }
}




