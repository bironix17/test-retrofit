package com.example.example

import com.google.gson.annotations.SerializedName


data class Categories (

  @SerializedName("categoryType" ) var categoryType : String?           = null,
  @SerializedName("dishes"       ) var dishes       : ArrayList<Dishes> = arrayListOf()

)