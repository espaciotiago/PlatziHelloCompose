package tech.yeswecode.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tech.yeswecode.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeTheme {
                HelloCompose()
            }
        }
    }
}

@Composable
fun HelloCompose() {
        Card(
            elevation = 4.dp,
            shape = MaterialTheme.shapes.large,
        ) {
            Column(
                modifier = Modifier.padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painterResource(id = R.drawable.platzi),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp, 40.dp)
                )
                Text("Este curso es lo mejor!!",
                    style = MaterialTheme.typography.h4)
                Text("Curso de Jetpack compose",
                    style = MaterialTheme.typography.body1)
                Button(onClick = {

                }, modifier = Modifier.padding(top = 16.dp),
                shape = MaterialTheme.shapes.large) {
                    Text("Click me")
                }
            }
        }
}

@Preview(
    showBackground = true
)
@Composable
fun HelloComposePreview() {
    HelloComposeTheme {
        HelloCompose()
    }
}