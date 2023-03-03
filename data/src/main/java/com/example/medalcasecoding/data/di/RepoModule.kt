package com.example.medalcasecoding.data.di

import com.example.medalcasecoding.data.api.ApiExtension
import com.example.medalcasecoding.data.network.Repositories
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiExtension: ApiExtension): Repositories {
        return Repositories(apiExtension)
    }

}