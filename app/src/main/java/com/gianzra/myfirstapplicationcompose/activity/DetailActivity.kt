package com.gianzra.myfirstapplicationcompose.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gianzra.myfirstapplicationcompose.InfoView
import com.gianzra.myfirstapplicationcompose.dataset.Cubes
import com.gianzra.myfirstapplicationcompose.ui.theme.MyFirstApplicationComposeTheme

class DetailActivity : ComponentActivity() {

    private val cubes: Cubes by lazy{ intent?.getSerializableExtra(CUBES_ID) as Cubes }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstApplicationComposeTheme {
                InfoView(cubes = cubes)
            }
        }
    }

    companion object{
        private const val CUBES_ID = "cubes_id"
        fun newIntent(context: Context, cubes: Cubes) =
            Intent(context, DetailActivity::class.java).apply {
                putExtra(CUBES_ID, cubes)
            }
    }
}