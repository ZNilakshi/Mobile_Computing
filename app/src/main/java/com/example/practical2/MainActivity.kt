package com.example.practical2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practical2.ui.theme.Practical2Theme
import androidx.compose.ui.unit.sp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practical2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        Greeting(name = "Android")
                        Hello()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.padding(8.dp)
    )
}

@Composable
fun Hello() {
    Column {
        Text(
            text = "Hello Student",
            modifier = Modifier.padding(8.dp)
        )

        Text(
            text = "Welcome to Android",
            modifier = Modifier
                .background(Color.Green)
                .padding(8.dp),
            fontSize = 40.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAll() {
    Practical2Theme {
        Column {
            Greeting("Android")
            Hello()
        }
    }
}