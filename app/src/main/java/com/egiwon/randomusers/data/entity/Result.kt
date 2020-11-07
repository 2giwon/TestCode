package com.egiwon.randomusers.data.entity

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Result(
    @SerializedName("cell")
    val cell: String = "",
    @SerializedName("dob")
    val dob: Dob = Dob(),
    @SerializedName("email")
    val email: String = "",
    @SerializedName("gender")
    val gender: String = "",
    @SerializedName("id")
    val id: Id = Id(),
    @SerializedName("location")
    val location: Location = Location(),
    @SerializedName("login")
    val login: Login = Login(),
    @SerializedName("name")
    val name: Name = Name(),
    @SerializedName("nat")
    val nat: String = "",
    @SerializedName("phone")
    val phone: String = "",
    @SerializedName("picture")
    val picture: Picture = Picture(),
    @SerializedName("registered")
    val registered: Registered = Registered()
)