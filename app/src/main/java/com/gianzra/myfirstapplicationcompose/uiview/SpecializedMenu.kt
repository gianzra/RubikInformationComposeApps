package com.gianzra.myfirstapplicationcompose

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import com.gianzra.myfirstapplicationcompose.activity.ProfileActivity

@Composable
fun SpecializedMenu(){ Box(modifier = Modifier.height(60.dp).fillMaxWidth())
    { Box(modifier = Modifier.height(50.dp).fillMaxWidth().background(Color.LightGray)){
            TopAppBar(
                modifier = Modifier.padding(top = 15.dp),
                backgroundColor = Color.Transparent,
                elevation = 0.dp,
                title = { Text(modifier = Modifier.padding(bottom = 11.dp), text="Rubiks Apps Compose") },
                actions = { AppBarActions() }
            )
        }
    }
}

@Composable
fun ProfileAction(){
    val context = LocalContext.current
    IconButton(onClick = {
        val intent = Intent(context, ProfileActivity::class.java)
        context.startActivity(intent)
    }) { Icon(imageVector = Icons.Filled.Person, tint = Color.DarkGray, contentDescription = "about_page") }
}

@Composable
fun AppBarActions() { ProfileAction() }