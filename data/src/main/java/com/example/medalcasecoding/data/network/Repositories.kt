package com.example.medalcasecoding.data.network

import com.example.medalcasecoding.data.api.ApiExtension
import com.example.medalcasecoding.data.model.DataModel
import javax.inject.Inject

class Repositories (private val apiExtension: ApiExtension) {

    suspend fun getData(): List<DataModel> {
         return apiExtension.getDataWrapper().body()?.data!!
    }


}