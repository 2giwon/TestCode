package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName

data class Id(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("value")
    val value: String = ""
)
