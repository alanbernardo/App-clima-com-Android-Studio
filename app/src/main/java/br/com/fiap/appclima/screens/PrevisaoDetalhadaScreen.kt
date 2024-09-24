package br.com.fiap.appclima.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun PrevisaoDetalhadaScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF8AB6CA)
    ) {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewPrevisaoDetalhadaScreen() {
    //PrevisaoDetalhadaScreen()
}

