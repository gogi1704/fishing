package com.fishing.data.repository.di

import com.fishing.data.dataBase.dao.FishDao
import com.fishing.data.repository.FishingRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(dao: FishDao):FishingRepository = FishingRepository(dao)
}