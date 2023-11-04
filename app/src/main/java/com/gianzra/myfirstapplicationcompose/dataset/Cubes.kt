package com.gianzra.myfirstapplicationcompose.dataset

import java.io.Serializable

data class Cubes (
    val id: Int,
    val name: String,
    val type: String,
    val desc: String,
    val image: Int= 0
): Serializable