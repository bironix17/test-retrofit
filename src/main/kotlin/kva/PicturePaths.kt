package com.example.example

import com.google.gson.annotations.SerializedName


data class PicturePaths (

  @SerializedName("small"  ) var small  : String? = null,
  @SerializedName("medium" ) var medium : String? = null,
  @SerializedName("large"  ) var large  : String? = null

)