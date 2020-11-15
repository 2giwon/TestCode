package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName

data class Street(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("number")
    val number: Int = 0
)
