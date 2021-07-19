package com.ln.practicaltestapp


import com.google.gson.annotations.SerializedName

data class TestModel(
    @SerializedName("currentPage")
    val currentPage: String?,
    @SerializedName("data")
    val `data`: List<Data>?,
    @SerializedName("dev_message")
    val devMessage: String?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("remaining_offer")
    val remainingOffer: Int?,
    @SerializedName("status")
    val status: Int?,
    @SerializedName("totalPage")
    val totalPage: Int?
)