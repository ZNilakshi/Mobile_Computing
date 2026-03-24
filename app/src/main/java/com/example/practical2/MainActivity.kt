package com.example.practical2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreen()
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileTitle()
        ProfileImage()
        ProfileDescription()
    }
}

@Composable
fun ProfileTitle() {
    Text(
        text = "Nilakshie S",
        modifier = Modifier.padding(16.dp),
        fontSize = 22.sp
    )
}

@Composable
fun ProfileImage() {
    Icon(
        imageVector = Icons.Default.AccountCircle,
        contentDescription = "Profile Image",
        modifier = Modifier
            .padding(16.dp)
            .size(120.dp)
    )
}

@Composable
fun ProfileDescription() {
    Text(
        text = "Nilakshi is a professional Mobile app developer",
        modifier = Modifier
            .padding(16.dp)

    )
}