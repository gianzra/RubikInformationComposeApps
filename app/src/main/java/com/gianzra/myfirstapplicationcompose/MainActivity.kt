package com.gianzra.myfirstapplicationcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.gianzra.myfirstapplicationcompose.activity.DetailActivity
import com.gianzra.myfirstapplicationcompose.dataset.Cubes
import com.gianzra.myfirstapplicationcompose.ui.theme.MyFirstApplicationComposeTheme


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstApplicationComposeTheme {
                Scaffold(topBar = { SpecializedMenu()},
                    content = {
                        CubeApplication{
                            startActivity(DetailActivity.newIntent(this, it))
                        }
                    }
                )
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CubeApplication(navigateToDetail: (Cubes) -> Unit) {
    Scaffold(
        content = { MainSection(navigateToDetail = navigateToDetail) }
    )
}
