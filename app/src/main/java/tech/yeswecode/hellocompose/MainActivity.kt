package tech.yeswecode.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import tech.yeswecode.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloCompose()
        }
    }
}

@Composable
fun HelloCompose() {
    Column {
        Image(painterResource(id = R.drawable.platzi),
            contentDescription = null)
        Text("Este curso es lo mejor!!")
        Text("Curso de Jetpack compose")
        Button(onClick = {

        }) {
            Text("Click me")
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun HelloComposePreview() {
    HelloCompose()
}