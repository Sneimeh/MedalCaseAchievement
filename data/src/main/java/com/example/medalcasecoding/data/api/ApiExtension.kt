package com.example.medalcasecoding.data.api

import com.example.medalcasecoding.data.model.DataWrapper
import retrofit2.Response
import retrofit2.http.GET

interface ApiExtension {

    @GET("/achievements")
    suspend fun getDataWrapper(): Response<DataWrapper>


}