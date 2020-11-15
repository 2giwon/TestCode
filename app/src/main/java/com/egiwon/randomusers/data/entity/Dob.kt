package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName

data class Dob(
    @SerializedName("age")
    val age: Int = 0,
    @SerializedName("date")
    val date: String = ""
)
