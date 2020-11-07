package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Picture(
    @SerializedName("large")
    val large: String = "",
    @SerializedName("medium")
    val medium: String = "",
    @SerializedName("thumbnail")
    val thumbnail: String = ""
)