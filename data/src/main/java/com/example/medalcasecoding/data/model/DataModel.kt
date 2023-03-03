package com.example.medalcasecoding.data.model


import com.google.gson.annotations.SerializedName

data class DataModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("label")
    val label: String,
    @SerializedName("records")
    val recordModels: List<RecordModel>,
    @SerializedName("title")
    val title: String
)