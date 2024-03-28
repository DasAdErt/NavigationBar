package com.example.navigationbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.navigationbar.bottom_navigation.MainScreen
import com.example.navigationbar.ui.theme.NavigationBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationBarTheme {
                MainScreen()
            }
        }
    }
}