package com.gianzra.myfirstapplicationcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gianzra.myfirstapplicationcompose.dataset.Cubes

@Composable
fun CubesListItem(cubes: Cubes, navigateToDetail: (Cubes) -> Unit){
    Card(
        modifier = Modifier
            .padding(horizontal = 3.dp, vertical = 10.dp)
            .fillMaxWidth(),
        elevation = 1.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(13.dp))
    ){
        Row(
            Modifier.clickable { navigateToDetail(cubes) }
        ) {
            cubesImage(cubes = cubes)
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)

            ){
                Text(text = cubes.name, style = MaterialTheme.typography.h5)
                Text(text = cubes.desc, style = MaterialTheme.typography.overline)
            }
        }
    }


}

@Composable
private fun cubesImage(cubes: Cubes){
    Image(
        painter = painterResource(id = cubes.image),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(13.dp)
            .size(100.dp)
            .clip(RoundedCornerShape(corner = CornerSize(17.dp)))
    )
}
