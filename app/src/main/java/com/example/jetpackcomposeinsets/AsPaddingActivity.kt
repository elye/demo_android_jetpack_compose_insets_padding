package com.example.jetpackcomposeinsets

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.core.view.WindowCompat
import com.example.jetpackcomposeinsets.ui.theme.JetpackComposeInsetsTheme
import dev.chrisbanes.accompanist.insets.*

class AsPaddingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val data = (1..100).toList()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ProvideWindowInsets {
                JetpackComposeInsetsTheme {
                    val scroll = rememberLazyListState()
                    Surface(
                        color = Color.Yellow,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        LazyColumn(
                            state = scroll,
                            modifier = Modifier
                                .fillMaxSize(),
                            contentPadding = LocalWindowInsets
                                .current.systemBars.toPaddingValues()

                        ) {
                            items(data) { data ->
                                Text(
                                    data.toString(),
                                    modifier = Modifier.fillMaxWidth(),
                                    style = MaterialTheme.typography.h5,
                                    textAlign = TextAlign.Center
                                )
                                Divider()
                            }
                        }
                    }
                }
            }
        }
    }
}