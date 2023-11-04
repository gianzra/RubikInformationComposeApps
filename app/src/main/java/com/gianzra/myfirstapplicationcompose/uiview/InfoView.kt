package com.gianzra.myfirstapplicationcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.gianzra.myfirstapplicationcompose.dataset.Cubes

@Composable
fun InfoView(cubes: Cubes){
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)){
                    HeaderFocus(cubes = cubes, containerHeight = this@BoxWithConstraints.maxHeight)
                    ContentSpotlight(cubes = cubes, containerHeight = this@BoxWithConstraints.maxHeight)
                }
            }
        }

    }
}

@Composable
private fun ContentSpotlight(cubes: Cubes, containerHeight: Dp) {
    Column { Name(cubes = cubes)
         PropertyInsight(value = cubes.type)
         PropertyInsight(value = cubes.desc)
    }
}

@Composable
private fun HeaderFocus(cubes: Cubes, containerHeight: Dp) {
    Image( modifier = Modifier
            .heightIn(max = containerHeight/2)
            .fillMaxWidth(),
        painter = painterResource(id = cubes.image),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}




@Composable
private fun PropertyInsight(value: String){
    Column(modifier = Modifier.padding(start = 15.dp, bottom = 35.dp, end= 20.dp)) {
        Text(text = value, style = MaterialTheme.typography.subtitle2)
    }
}

@Composable
private fun Name(cubes: Cubes) {
    Column(modifier = Modifier.padding(13.dp)) {
        Text(
            text = cubes.name,
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

    }
}

