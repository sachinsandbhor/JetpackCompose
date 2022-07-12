package com.sachinsandbhor.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.sachinsandbhor.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Greeting()
            //ClickableButton()
            TextFieldSample()
        }
    }
}

@Composable
fun Greeting() {
    Text(
        text = stringResource(id = R.string.hello_world),
        fontSize = 24.sp,
        fontStyle = FontStyle.Italic,
        color = Color.Blue,
        fontWeight = FontWeight.ExtraBold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun ClickableButton() {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Cyan,
            contentColor = Color.Blue
        ),
        shape = MaterialTheme.shapes.medium
    ) {
        Text(text = "Press me")
    }
}

@Composable
fun TextFieldSample() {
    val state = remember { mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = { newValue ->
            state.value = newValue
        },
        label = { Text(text = stringResource(id = R.string.hello_world)) }
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_2
)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        // Greeting()
        //ClickableButton()
        TextFieldSample()
    }
}
