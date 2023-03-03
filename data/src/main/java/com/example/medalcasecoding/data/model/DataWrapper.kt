package com.example.medalcasecoding.data.model


import com.google.gson.annotations.SerializedName

data class DataWrapper(
    @SerializedName("data")
    val `data`: List<DataModel>
)