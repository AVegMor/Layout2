package com.example.layout2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layout2.ui.theme.Layout2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Layout2Theme {
                MyLayout()
            }
        }
    }
}

@Composable
fun MyLayout() {
    Column(
        Modifier
            .fillMaxSize().padding(top = 20.dp)
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .weight(0.75f), contentAlignment = Alignment.TopEnd
        ) {
            Text("Ejemplo 1")
        }
        //Spacer(modifier = Modifier.height(30.dp))
        MySpacer(30)
        Row(
            modifier = Modifier
                .fillMaxWidth().weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color.Red)
                    .weight(1f), contentAlignment = Alignment.BottomStart
            ) {
                Text("Ejemplo 2")
            }
            Box(
                modifier =
                Modifier
                    .fillMaxHeight()
                    .background(Color.Green)
                    .weight(1f), contentAlignment = Alignment.Center
            ) {
                Text("Ejemplo3")
            }
        }
        //Spacer(modifier = Modifier.height(30.dp))
        MySpacer(30)
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.Magenta)
                .weight(1f), contentAlignment = Alignment.TopCenter
        ) {
            Text("Ejemplo 4")
        }
    }
}
@Composable
fun MySpacer(height:Int){
    Spacer(modifier = Modifier.height(height.dp))
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Layout2Theme {
        MyLayout()
    }
}