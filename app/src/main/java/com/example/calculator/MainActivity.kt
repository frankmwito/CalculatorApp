package com.example.calculator

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculator.ui.theme.CalculatorAppTheme
import com.example.calculator.ui.theme.LightBackground

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorAppTheme {
                    Column {
                        HomeScreen(
                            modifier = Modifier.padding(16.dp)
                        )
                    }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen( modifier: Modifier = Modifier) {
    CalculatorAppTheme {
        Scaffold(
            topBar = {
                TopAppBar(title = { /*TODO*/ })
            },
            content = { paddingValues ->  paddingValues
                Card(
                    modifier = Modifier.padding(8.dp)
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.background),
                    shape = MaterialTheme.shapes.medium,
                ) {

                }
               Column(
                   modifier = Modifier
                       .fillMaxSize()
                       .padding(8.dp),
                   verticalArrangement = Arrangement.Center,
                   horizontalAlignment = Alignment.Start
               ) {
                   HomeScreenUi()
               }
            }
        )
    }
}




@Composable
fun  HomeScreenUi() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "(")
            }

            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = ")")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "%")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "AC")
            }

        }
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "7")
            }

            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "8")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "9")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "/")
            }

        }
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "4")
            }

            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "5")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "6")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "*")
            }

        }
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "1")
            }

            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "2")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "3")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "-")
            }

        }
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "0")
            }

            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = ".")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "=")
            }
            Button(
                shape = MaterialTheme.shapes.medium,
                onClick = { /*TODO*/ }) {
                Text(text = "+")
            }

        }
    }
}

