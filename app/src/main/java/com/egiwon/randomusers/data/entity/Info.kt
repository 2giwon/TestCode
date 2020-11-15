package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("page")
    val page: Int = 0,
    @SerializedName("results")
    val results: Int = 0,
    @SerializedName("seed")
    val seed: String = "",
    @SerializedName("version")
    val version: String = ""
)
