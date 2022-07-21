package com.sachinsandbhor.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //ColoredBox()
            //Numbers()
            NumberColumn()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun ColoredBox() {
    Box(
        modifier = Modifier
            .size(120.dp)
            .background(Color.DarkGray)
            .padding(16.dp)
            .clip(RoundedCornerShape(size = 20.dp))
            .background(Color.Green)
    )
}

@Composable
fun MyFloatingButton() {
    Box {
        Surface(
            modifier = Modifier.size(32.dp),
            color = Color.Green,
            shape = CircleShape,
            content = {})
            Text(text = "+", modifier = Modifier.align(Alignment.Center))
        }
}


@Composable
fun Numbers() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Text(text = "1", fontSize = 12.sp)
        Text(text = "2", fontSize = 12.sp)
        Text(text = "3", fontSize = 12.sp)
        Text(text = "4", fontSize = 12.sp)
        Text(text = "5", fontSize = 12.sp)
        Text(text = "6", fontSize = 12.sp)
        Text(text = "7", fontSize = 12.sp)
        Text(text = "8", fontSize = 12.sp)
        Text(text = "9", fontSize = 12.sp)
        Text(text = "10", fontSize = 12.sp)

    }
}

@Composable
fun NumberColumn() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "1", fontSize = 12.sp)
        Text(text = "2", fontSize = 12.sp)
        Text(text = "3", fontSize = 12.sp)
        Text(text = "4", fontSize = 12.sp)
        Text(text = "5", fontSize = 12.sp)
        Text(text = "6", fontSize = 12.sp)
        Text(text = "7", fontSize = 12.sp)
        Text(text = "8", fontSize = 12.sp)
        Text(text = "9", fontSize = 12.sp)
        Text(text = "10", fontSize = 12.sp)
        Numbers()
        MyFloatingButton()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    //ColoredBox()
    //Numbers()
    NumberColumn()

}
