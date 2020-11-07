package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Street(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("number")
    val number: Int = 0
)