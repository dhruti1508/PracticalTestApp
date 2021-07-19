package com.ln.practicaltestapp


import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("distance")
    val distance: String?,
    @SerializedName("latitude")
    val latitude: String?,
    @SerializedName("longitude")
    val longitude: String?
)