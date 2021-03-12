import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ContentView(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            "Top Text",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.h3,
            textAlign = TextAlign.Center
        )
        Box(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .weight(1f)
        )
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .weight(1f)
        )
        Text(
            "Bottom Text",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.h3,
            textAlign = TextAlign.Center
        )
    }
}
