package com.example.farim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.farim.ui.theme.FarimTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}

@Preview(showBackground = true)
@Composable
fun  Hello (){
    Text(text = "I'm Memoona")
}

@Preview(showSystemUi = true)
@Composable
fun Welcome () {
    Text(text = "First experience with android studio")
}