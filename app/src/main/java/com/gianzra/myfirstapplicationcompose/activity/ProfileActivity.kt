package com.gianzra.myfirstapplicationcompose.activity

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import com.gianzra.myfirstapplicationcompose.R


class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.fillMaxSize()) {
                Surface { Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollState))
                { Image(modifier = Modifier.height(500.dp), painter = painterResource(id = R.drawable.gianzrapict), contentScale = ContentScale.Crop, contentDescription = null)
                        Text(modifier = Modifier.padding(start = 80.dp, top = 50.dp), style = MaterialTheme.typography.h6, text = "Andelle Gianzra Basae")
                        Text(modifier = Modifier.padding(start = 120.dp), style = MaterialTheme.typography.subtitle2, text = "gianzra1@gmail.com")
                    }
                }
            }
        }
    }
}