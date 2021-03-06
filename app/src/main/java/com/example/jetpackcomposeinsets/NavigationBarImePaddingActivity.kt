package com.example.jetpackcomposeinsets

import ContentView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.example.jetpackcomposeinsets.ui.theme.JetpackComposeInsetsTheme
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.navigationBarsWithImePadding
import com.google.accompanist.insets.statusBarsPadding

class NavigationBarImePaddingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ProvideWindowInsets {
                JetpackComposeInsetsTheme {
                    Surface(
                        color = Color.Yellow,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        ContentView(modifier = Modifier
                            .statusBarsPadding()
                            .navigationBarsWithImePadding())
                    }
                }
            }
        }

        openKeyboardInOneSecond()
    }
}