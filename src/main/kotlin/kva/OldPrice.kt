package com.example.example

import com.google.gson.annotations.SerializedName


data class OldPrice (

  @SerializedName("id"    ) var id    : Int? = null,
  @SerializedName("price" ) var price : Int? = null

)