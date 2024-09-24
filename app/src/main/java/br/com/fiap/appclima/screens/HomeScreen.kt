package br.com.fiap.appclima.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.appclima.R

@Composable
fun HomeScreen(navController: NavController) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(colorResource(id = R.color.azul_fiap))
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    painter = painterResource(id = R.drawable.tempo),
                    contentDescription = "Imagem do tempo.",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Bem-vindo!",
                    textAlign = TextAlign.Center,
                    color = colorResource(id = R.color.black),
                    fontSize = 15.sp
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            // Frase movida para a parte superior antes dos três boxes
            Text(
                text = "Previsão do clima para algumas cidades:",
                fontSize = 18.sp,
                color = colorResource(id = R.color.cor_variado),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Previsões para as cidades
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .weight(1f) // This makes sure that the button is at the bottom
            ) {
                // Box para São Paulo
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    WeatherRow(city = "São Paulo", temperature = "30°C", condition = "Ensolarado", imageResId = R.drawable.ensolarado)
                }
                Spacer(modifier = Modifier.height(16.dp))

                // Box para Rio de Janeiro
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    WeatherRow(city = "Rio de Janeiro", temperature = "25°C", condition = "Parcialmente nublado", imageResId = R.drawable.parcialmente)
                }
                Spacer(modifier = Modifier.height(16.dp))

                // Box para Mato Grosso
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                        .padding(16.dp)
                ) {
                    WeatherRow(city = "Mato Grosso", temperature = "20°C", condition = "Chuva leve", imageResId = R.drawable.chuva)
                }

                // Botão "VER MAIS DETALHES"
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = {
                        navController.navigate("PrevisaoDetalhadaScreen")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.cor_variado),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "VER MAIS DETALHES",
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
fun WeatherRow(city: String, temperature: String, condition: String, imageResId: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = city, fontSize = 18.sp, color = Color.Black)
            Text(text = temperature, fontSize = 18.sp, color = Color.Black)
            Text(text = condition, fontSize = 18.sp, color = Color.Black)
        }

        Spacer(modifier = Modifier.width(16.dp))

        Image(
            painter = painterResource(id = imageResId),
            contentDescription = "Imagem do clima",
            modifier = Modifier
                .size(60.dp)
                .clip(shape = RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )
    }
}







//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//private  fun HomeScreenPreview() {
    //HomeScreen()

        
