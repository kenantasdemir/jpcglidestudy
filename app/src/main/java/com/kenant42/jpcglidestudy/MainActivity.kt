package com.kenant42.jpcglidestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kenant42.jpcglidestudy.ui.theme.JpcglidestudyTheme
import com.skydoves.landscapist.glide.GlideImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JpcglidestudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Page()
                }
            }
        }
    }
}

@Composable
fun Page(){

    val imageName = remember{
        mutableStateOf("django.png")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GlideImage(imageModel = "http://kasimadalan.pe.hu/filmler/resimler/${imageName.value}",
            modifier = Modifier.size(200.dp,300.dp))

        Button(onClick = { imageName.value = "django.png" }) {
            Text(text = "Django")
        }

        Button(onClick = { imageName.value = "inception.png"}) {
                Text(text = "Inception")
        }

        Button(onClick = { imageName.value = "thepianist.png"}) {
            Text(text = "The Pianist")
        }

        Button(onClick = { imageName.value = "interstellar.png"}) {
            Text(text = "Interstellar")
        }

        Button(onClick = { imageName.value = "thehatefuleight.png"}) {
            Text(text = "The Hateful Eight")
        }




    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JpcglidestudyTheme {
    }
}