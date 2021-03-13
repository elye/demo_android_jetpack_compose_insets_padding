package com.example.jetpackcomposeinsets

import ContentView
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.example.jetpackcomposeinsets.ui.theme.JetpackComposeInsetsTheme

class FitSystemWindowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            JetpackComposeInsetsTheme {
                Surface(
                    color = Color.Yellow,
                    modifier = Modifier.fillMaxSize()
                ) {
                    ContentView()
                }
            }
        }
    }
}