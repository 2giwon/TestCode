package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    @SerializedName("city")
    val city: String = "",
    @SerializedName("coordinates")
    val coordinates: Coordinates = Coordinates(),
    @SerializedName("country")
    val country: String = "",
    @SerializedName("postcode")
    val postcode: Int = 0,
    @SerializedName("state")
    val state: String = "",
    @SerializedName("street")
    val street: Street = Street(),
    @SerializedName("timezone")
    val timezone: Timezone = Timezone()
)