package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Dob(
    @SerializedName("age")
    val age: Int = 0,
    @SerializedName("date")
    val date: String = ""
)