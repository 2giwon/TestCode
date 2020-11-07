package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Id(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("value")
    val value: String = ""
)