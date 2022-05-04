package com.example.example

import com.google.gson.annotations.SerializedName


data class Dishes (

  @SerializedName("id"           ) var id           : Int?          = null,
  @SerializedName("picturePaths" ) var picturePaths : PicturePaths? = PicturePaths(),
  @SerializedName("name"         ) var name         : String?       = null,
  @SerializedName("composition"  ) var composition  : String?       = null,
  @SerializedName("category"     ) var category     : String?       = null,
  @SerializedName("deleted"      ) var deleted      : Boolean?      = null,
  @SerializedName("basePortion"  ) var basePortion  : BasePortion?  = BasePortion()

)