package com.example.example

import com.google.gson.annotations.SerializedName


data class BasePortion (

  @SerializedName("id"       ) var id       : Int?      = null,
  @SerializedName("size"     ) var size     : String?   = null,
  @SerializedName("priceNow" ) var priceNow : PriceNow? = PriceNow(),
  @SerializedName("oldPrice" ) var oldPrice : OldPrice? = OldPrice()

)