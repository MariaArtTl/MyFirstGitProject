package com.example.myfirstgitproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myfirstgitproject.ui.theme.MyFirstGitProjectTheme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Связывает вашу Активити с файлом XML
//        enableEdgeToEdge()
//        setContent {
//            MyFirstGitProjectTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Column складывает элементы вертикально (как LinearLayout с orientation="vertical" в XML)
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Наш текстовый элемент
        Text(
            text = "Добро пожаловать в мой первый проект!",
            fontSize = 20.sp
        )



        // Готовая кнопка
        Button(onClick = { /* Здесь пишется действие при нажатии */ }) {
            Text(text = "Нажми меня")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstGitProjectTheme {
        Greeting("Android")
    }
}