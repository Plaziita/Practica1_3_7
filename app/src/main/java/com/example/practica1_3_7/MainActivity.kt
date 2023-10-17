package com.example.practica1_3_7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica1_3_7.ui.theme.Practica1_3_7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica1_3_7Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(tittle = stringResource(R.string.title),
                        text1 = stringResource(R.string.text1),
                        text2 = stringResource(R.string.text2)
                    )                }
            }
        }
    }
}
@Composable
fun GreetingText(tittle: String,text1: String,text2: String,modifier: Modifier = Modifier) {
    Column (modifier = modifier,verticalArrangement = Arrangement.Center) {
        Text(
            text = tittle,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = text1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = text2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

        )
    }
}
@Composable
fun GreetingImage(tittle: String, text1: String,text2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
        )
        GreetingText(
            tittle = tittle,
            text1 = text1,
            text2 = text2,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practica1_3_7Theme {
        GreetingImage(tittle = stringResource(R.string.title),
            text1 = stringResource(R.string.text1),
            text2 = stringResource(R.string.text2)
        )
    }
}