package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName

data class Coordinates(
    @SerializedName("latitude")
    val latitude: String = "",
    @SerializedName("longitude")
    val longitude: String = ""
)
