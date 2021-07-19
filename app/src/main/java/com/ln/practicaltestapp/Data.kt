package com.ln.practicaltestapp


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("actual_price")
    val actualPrice: String?,
    @SerializedName("address")
    val address: Address?,
    @SerializedName("discount")
    val discount: Int?,
    @SerializedName("distanceValue")
    val distanceValue: Int?,
    @SerializedName("featured_tag")
    val featuredTag: Boolean?,
    @SerializedName("field")
    val `field`: List<String>?,
    @SerializedName("grabbed")
    val grabbed: Int?,
    @SerializedName("_id")
    val id: String?,
    @SerializedName("isAdvertisement")
    val isAdvertisement: Boolean?,
    @SerializedName("isEligible")
    val isEligible: Boolean?,
    @SerializedName("isFavorite")
    val isFavorite: Boolean?,
    @SerializedName("isOffer")
    val isOffer: Boolean?,
    @SerializedName("isWatchList")
    val isWatchList: Boolean?,
    @SerializedName("loyalty_offer")
    val loyaltyOffer: Boolean?,
    @SerializedName("loyalty_offer_set")
    val loyaltyOfferSet: String?,
    @SerializedName("loyalty_points")
    val loyaltyPoints: String?,
    @SerializedName("loyalty_price")
    val loyaltyPrice: String?,
    @SerializedName("membership_alt_name")
    val membershipAltName: String?,
    @SerializedName("membership_type")
    val membershipType: String?,
    @SerializedName("offer_image")
    val offerImage: String?,
    @SerializedName("offer_price")
    val offerPrice: String?,
    @SerializedName("offer_time")
    val offerTime: Boolean?,
    @SerializedName("offer_view")
    val offerView: Int?,
    @SerializedName("price_enable")
    val priceEnable: Boolean?,
    @SerializedName("quantity")
    val quantity: Int?,
    @SerializedName("short_title")
    val shortTitle: String?,
    @SerializedName("store_name")
    val storeName: String?,
    @SerializedName("title")
    val title: String?
)