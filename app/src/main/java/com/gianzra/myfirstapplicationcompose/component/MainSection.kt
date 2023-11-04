package com.gianzra.myfirstapplicationcompose

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.dp
import com.gianzra.myfirstapplicationcompose.dataset.Cubes
import com.gianzra.myfirstapplicationcompose.dataset.DataSource
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun MainSection(navigateToDetail: (Cubes) -> Unit) { val cubiq = remember { DataSource.cubesList }

    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp))
    { items(items = cubiq, itemContent = { CubesListItem(cubes = it, navigateToDetail) }) }
}
