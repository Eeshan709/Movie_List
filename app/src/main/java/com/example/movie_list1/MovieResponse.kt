package com.example.movie_list1

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("results")
    val movie_items : List<MovieItem>

) : Parcelable {
    constructor() : this(mutableListOf())
}