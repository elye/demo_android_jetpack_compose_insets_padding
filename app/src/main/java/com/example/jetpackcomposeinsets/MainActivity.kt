package com.example.jetpackcomposeinsets

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeinsets.ui.theme.JetpackComposeInsetsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInsetsTheme {
                // A surface container using the 'background' color from the theme
                Column {
                    MyButton(onClick = {
                        startActivity(Intent(this@MainActivity,
                            OriginalWindowActivity::class.java))
                    }) {
                        Text("Original Window")
                    }
                    MyButton(onClick = {
                        startActivity(Intent(this@MainActivity,
                            FitSystemWindowActivity::class.java))
                    }) {
                        Text("Fit System Window")
                    }
                    MyButton(onClick = {
                        startActivity(Intent(this@MainActivity,
                            StatusBarPaddingActivity::class.java))
                    }) {
                        Text("Status Bar Padding")
                    }
                    MyButton(onClick = {
                        startActivity(Intent(this@MainActivity,
                            NavigationBarPaddingActivity::class.java))

                    }) {
                        Text("Navigation Bar Padding")
                    }
                    MyButton(onClick = {
                        startActivity(Intent(this@MainActivity,
                            SystemBarsPaddingActivity::class.java))
                    }) {
                        Text("System Bars Padding")
                    }
                    MyButton(onClick = {
                        startActivity(Intent(this@MainActivity,
                            NavigationBarImePaddingActivity::class.java))
                    }) {
                        Text("Navigation Bar IME Padding")
                    }
                    MyButton(onClick = { /*TODO*/ }) {
                        Text("As Padding")
                    }
                }
            }
        }
    }

    @Composable
    private fun ColumnScope.MyButton(
        onClick: () -> Unit,
        content: @Composable RowScope.() -> Unit
    ) {
        Button(
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(16.dp),
            content = content
        )
    }
}

