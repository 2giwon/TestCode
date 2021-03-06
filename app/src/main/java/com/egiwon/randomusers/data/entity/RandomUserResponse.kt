package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName

data class RandomUserResponse(
    @SerializedName("info")
    val info: Info = Info(),
    @SerializedName("results")
    val results: List<Result> = emptyList()
)
